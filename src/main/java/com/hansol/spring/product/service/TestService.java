package com.hansol.spring.product.service;

import com.hansol.spring.product.dto.TestDTO;

import java.util.List;

public interface TestService {
    TestDTO selectTestByTitle(String title);

    List<TestDTO> getTestList();

    void insertTest(TestDTO testDTO);

    TestDTO insertTestDTO(TestDTO testDTO);

    void updateTest(TestDTO testDTO);

    TestDTO updateTestDTO(TestDTO testDTO);

    void deleteTest(String title);

    TestDTO deleteTestDTO(String title);
}
