package com.hansol.spring.product.controller;

import com.hansol.spring.product.dto.TestDTO;
import com.hansol.spring.product.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

    private final TestService testService;

    //TestService의 의존성 주입
    @Autowired
    public DBConnectTestCtrl(TestService testService) {
        this.testService = testService;
    }

    //Test 목록 조회
    @GetMapping("/hello")
    public List<TestDTO> HelloWorld() {
        return testService.getTestList();
    }

    //Test 생성
    @PostMapping("/hello")
    public void insertTest(@RequestBody TestDTO testDTO) {
        testService.insertTest(testDTO);
    }

    //입력한 제목의 Test 조회
    @GetMapping("/hello/{title}")
    public TestDTO getTestByTitle(@PathVariable String title) {
        return testService.selectTestByTitle(title);
    }

    //Body로 받은 객체를 갱신
    @PutMapping("/hello")
    public void updateTest(@RequestBody TestDTO testDTO) {
        testService.updateTest(testDTO);
    }

    //입력한 title의 Test 삭제
    @DeleteMapping("/hello")
    public void deleteTest(@RequestParam String title) {
        testService.deleteTest(title);
    }

}
