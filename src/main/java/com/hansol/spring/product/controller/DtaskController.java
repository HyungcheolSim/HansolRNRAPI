package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.DtaskDTO;
import com.hansol.spring.product.service.DtaskService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DtaskController {
    private final DtaskService dtaskService;

    @Autowired
    public DtaskController(DtaskService dtaskService){ this.dtaskService=dtaskService;}

    @Operation(summary = "업무분장", description = "업무분장에 필요한 업무, 세부업무, 사원의 정보를 조인하여 나타낸다.")
    @GetMapping("/RNR")
    public ResponseEntity getRNRList(){
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.READ_TASK,dtaskService.getRNRList()), HttpStatus.OK);
    }
    @Operation(summary = "세부업무 출력", description = "세부업무(세부업무명, 업무코드, 사원 index) 목록 출력")
    @GetMapping("/dtask")
    public ResponseEntity getDtaskList(){
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.READ_TASK,dtaskService.getDtaskList()), HttpStatus.OK);
    }

    @Operation(summary = "세부업무 등록", description = "세부업무(세부업무명, 업무코드, 사원 index)를 등록한다." +
            " 이때, 업무코드와 사원 index는 각각 업무와 사원 table에 존재하는 값이어야 한다")
    @PostMapping("/dtask")
    public ResponseEntity insertTask(@RequestBody DtaskDTO dtaskDTO){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.CREATED_TASK,dtaskService.insertDtaskDTO(dtaskDTO)),HttpStatus.OK);
    }


    @Operation(summary = "세부업무 삭제", description = "특정 세부업무의 세부업무명, 업무코드, 사원 index 모두 확인하여 식별하고 삭제")
    @DeleteMapping("/dtask")
    public ResponseEntity deleteTask(@RequestBody DtaskDTO dtaskDTO) {
        dtaskService.deleteDtaskDTO(dtaskDTO);
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_TASK), HttpStatus.OK);
    }
}
