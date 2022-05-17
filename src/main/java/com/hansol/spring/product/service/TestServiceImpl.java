package com.hansol.spring.product.service;

import com.hansol.spring.product.dao.TestDAO;
import com.hansol.spring.product.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    private final TestDAO testDAO;

    //생성자를 통한 주입
    @Autowired
    public TestServiceImpl(TestDAO testDAO) {
        this.testDAO = testDAO;
    }
    
    //특정 제목의 Test를 조회
    @Override
    public TestDTO selectTestByTitle(String title) {
        return testDAO.selectTestDataByTitle(title);
    }

    //모든 Test 목록 조회
    @Override
    public List<TestDTO> getTestList() {
        return testDAO.selectTestData();
    }

    //Test 생성
    @Override
    public void insertTest(TestDTO testDTO) {
        testDAO.insertTestData(testDTO);
    }

    //Test 생성 (TestDTO 객체의 리턴타입이 있는 경우)
    @Override
    public TestDTO insertTestDTO(TestDTO testDTO) {
        testDAO.insertTestData(testDTO);
        return testDTO;
    }

    //특정 title의 Test를 갱신하는 메소드
    @Override
    public void updateTest(TestDTO testDTO) {
        TestDTO existTest = testDAO.selectTestDataByTitle(testDTO.getTitle());
        existTest.setName(testDTO.getName());
        testDAO.updateTestData(existTest);
    }
    //특정 title의 Test를 갱신하는 메소드(TestDTO 객체의 리턴타입이 있는 경우)
    @Override
    public TestDTO updateTestDTO(TestDTO testDTO) {
        TestDTO existTest = testDAO.selectTestDataByTitle(testDTO.getTitle());
        existTest.setName(testDTO.getName());
        testDAO.updateTestData(existTest);
        return existTest;
    }

    //특정 title의 Test를 삭제하는 메소드
    @Override
    public void deleteTest(String title) {
        testDAO.deleteTestData(title);
    }

    //**수정
    //특정 title의 Test를 삭제하는 메소드(삭제할 Test를 객체에 저장한 후 삭제하고 저장한 객체 리턴)
   @Override
    public TestDTO deleteTestDTO(String title) {
        TestDTO existTest = testDAO.selectTestDataByTitle(title);
        testDAO.deleteTestData(title);
        return existTest;
    }
}
