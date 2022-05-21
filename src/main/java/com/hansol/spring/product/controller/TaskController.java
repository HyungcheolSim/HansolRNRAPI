package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.TaskDTO;
import com.hansol.spring.product.dto.TaskDTO;
import com.hansol.spring.product.service.TaskService;
import com.hansol.spring.product.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){this.taskService=taskService;}

    @Operation(summary = "업무 목록 조회", description = "업무 목록(업무코드, 업무명)을 출력한다.")
    @GetMapping("/task")
    public ResponseEntity getTaskList(){
        return new ResponseEntity(BaseResp.res(StatusCode.OK,ResponseMessage.READ_TASK,taskService.getTaskList()),HttpStatus.OK);
    }

    @Operation(summary = "특정 업무 조회", description = "특정 업무코드에 해당하는 업무를 출력한다.")
    @GetMapping("/task/{t_id}")
    public ResponseEntity getTaskByID(@Parameter(description = "업무코드", required = true, example = "w-00001") @PathVariable String t_id){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.READ_TASK_BY_TID,taskService.findTaskByTId(t_id)),HttpStatus.OK);
    }

    @Operation(summary = "업무 생성", description = "업무 생성한다.")
    @PostMapping("/task")
    public ResponseEntity insertTask(@RequestBody TaskDTO taskDTO){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.CREATED_TASK,taskService.insertTaskDTO(taskDTO)),HttpStatus.OK);
    }
    @Operation(summary = "업무 수정", description = "특정 업무의 데이터를 수정한다")
    @PutMapping("/task")
    public ResponseEntity updateTask(@RequestBody TaskDTO TaskDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.UPDATE_TASK, taskService.updateTaskDTO(TaskDTO)), HttpStatus.OK);
    }
    @Operation(summary = "업무 삭제", description = "해당 업무코드의 업무데이터를 삭제한다.")
    //test 삭제
    @DeleteMapping("/task/{t_id}")
    public ResponseEntity deleteTask(@PathVariable String t_id) {
        taskService.deleteTaskDTO(t_id);
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_TASK), HttpStatus.OK);
    }
}
