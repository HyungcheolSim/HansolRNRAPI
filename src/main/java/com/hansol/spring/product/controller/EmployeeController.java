package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.EmployeeDTO;
import com.hansol.spring.product.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){this.employeeService=employeeService;}
    @Operation(summary = "사원 목록 조회", description = "사원 목록(사원 index, 사원명, 직급, 회사, 전화번호)을 출력한다.")
    @GetMapping("/emp")
    public ResponseEntity getEmployeeList(){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK, ResponseMessage.READ_EMPLOYEE,employeeService.getEmployeeList()),HttpStatus.OK);
    }
    @Operation(summary = "특정 사원 목록 조회", description = "해당 사원index의 사원(사원 index, 사원명, 직급, 회사, 전화번호)을 출력한다.")
    @GetMapping("/emp/{e_id}")
    public ResponseEntity getEmployeeByID(@Parameter(description = "사원index",required = true,example = "0") @PathVariable int e_id){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK, ResponseMessage.READ_EMPLOYEE_BY_EID,employeeService.findEmployeeById(e_id)),HttpStatus.OK);
    }
    @Operation(summary = "사원 등록", description = "사원(사원 index, 사원명, 직급, 회사, 전화번호)을 등록한다.")
    @PostMapping("/emp")
    public ResponseEntity insertEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.CREATED_EMPLOYEE,employeeService.insertEmployeeDTO(employeeDTO)),HttpStatus.OK);
    }
    @Operation(summary = "사원 수정", description = "사원(사원 index, 사원명, 직급, 회사, 전화번호)을 수정한다.")
    @PutMapping("/emp")
    public ResponseEntity updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.UPDATE_EMPLOYEE, employeeService.updateEmployeeDTO(employeeDTO)), HttpStatus.OK);
    }

    
    @Operation(summary = "사원 삭제", description = "해당 사원index의 사원(사원 index, 사원명, 직급, 회사, 전화번호)을 삭제한다.")
    @DeleteMapping("/emp/{e_id}")
    public ResponseEntity deleteEmployee(@Parameter(description = "사원index",required = true,example = "0")@PathVariable int e_id) {
        employeeService.deleteEmployeeDTO(e_id);
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_EMPLOYEE), HttpStatus.OK);
    }
}