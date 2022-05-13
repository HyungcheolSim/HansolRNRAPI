package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.TestDTO;
import com.hansol.spring.product.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    //test 목록 조회
    @GetMapping("/test")
    public ResponseEntity printTest() {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.READ_TEST, testService.getTestList()), HttpStatus.OK);
    }
    
    //test 생성
    @PostMapping("/test")
    public ResponseEntity insertTest(@RequestBody TestDTO testDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.CREATED_TEST, testService.insertTestDTO(testDTO)), HttpStatus.OK);
    }
    
    //특정 테스트 조회
    @GetMapping("/test/{title}")
    public ResponseEntity getTestByTitle(@PathVariable String title) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.READ_TEST_BY_TITLE, testService.selectTestByTitle(title)), HttpStatus.OK);
    }

    //특정 test 갱신
    @PutMapping("/test")
    public ResponseEntity updateTest(@RequestBody TestDTO testDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.UPDATE_TEST, testService.updateTestDTO(testDTO)), HttpStatus.OK);
    }

    //test 삭제
    @DeleteMapping("/test")
    public ResponseEntity deleteTest(@RequestParam String title) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_TEST, testService.deleteTestDTO(title)), HttpStatus.OK);
    }

}
