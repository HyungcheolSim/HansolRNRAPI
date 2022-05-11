package com.hansol.spring.product.controller;

import com.hansol.spring.product.dto.TestDTO;
import com.hansol.spring.product.service.TestService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

    private final TestService testService;

    @Autowired
    public DBConnectTestCtrl(TestService testService){
        this.testService=testService;
    }

    @GetMapping("/hello")
    public List<TestDTO> HelloWorld(){
        return testService.getTestList();
    }

    @PostMapping("/hello")
    public void insertTest(@RequestBody TestDTO testDTO){
        testService.insertTest(testDTO);
    }

    @GetMapping("/hello/{title}")
    public TestDTO getTestByTitle(@PathVariable String title){
        return testService.selectTestByTitle(title);
    }

    @PutMapping("/hello")
    public void updateTest(@RequestBody TestDTO testDTO){
        testService.updateTest(testDTO);
    }

    @DeleteMapping("/hello")
    public void deleteTest(@RequestParam String title){
        testService.deleteTest(title);
    }

}
