package com.hansol.spring.product.service;

import com.hansol.spring.product.dao.TestDAO;
import com.hansol.spring.product.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {



    private final TestDAO testDAO;

    @Autowired
    public TestServiceImpl(TestDAO testDAO) {
        this.testDAO = testDAO;
    }

    @Override
    public TestDTO selectTestByTitle(String title) {
        return testDAO.selectTestDataByTitle(title);
    }

    @Override
    public List<TestDTO> getTestList() {
        return testDAO.selectTestData();
    }

    @Override
    public void insertTest(TestDTO testDTO) {
        testDAO.insertTestData(testDTO);
    }

    @Override
    public void updateTest(TestDTO testDTO) {
        TestDTO existTest = testDAO.selectTestDataByTitle(testDTO.getTitle());
        existTest.setName(testDTO.getName());
        testDAO.updateTestData(existTest);
    }

    @Override
    public void deleteTest(String title) {
        testDAO.deleteTestData(title);
    }
}
