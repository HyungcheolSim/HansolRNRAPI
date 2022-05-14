package com.hansol.spring.product.dao;

import com.hansol.spring.product.dto.TestDTO;

import java.util.List;

//데이터와 연결하는 역할을 하는 인터페이스
public interface TestDAO {
    TestDTO selectTestDataByTitle(String title);

    List<TestDTO> selectTestData();

    void insertTestData(TestDTO testDTO);


    void updateTestData(TestDTO testDTO);

    void deleteTestData(String title);

    //TestDTO insertTest(TestDTO testDTO);
}
