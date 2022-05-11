package com.hansol.spring.product.dao;

import com.hansol.spring.product.dto.TestDTO;

import java.util.List;


public interface TestDAO {
    TestDTO selectTestDataByTitle(String title);
    List<TestDTO> selectTestData();
    void insertTestData(TestDTO testDTO);
    void updateTestData(TestDTO testDTO);


    void deleteTestData(String title);
}
