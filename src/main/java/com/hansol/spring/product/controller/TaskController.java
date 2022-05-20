package com.hansol.spring.product.controller;

import com.hansol.spring.product.config.BaseResp;
import com.hansol.spring.product.config.ResponseMessage;
import com.hansol.spring.product.config.StatusCode;
import com.hansol.spring.product.dto.TaskDTO;
import com.hansol.spring.product.dto.TaskDTO;
import com.hansol.spring.product.service.TaskService;
import com.hansol.spring.product.service.TaskService;
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

    @GetMapping("/task")
    public ResponseEntity getTaskList(){
        return new ResponseEntity(BaseResp.res(StatusCode.OK,ResponseMessage.READ_TASK,taskService.getTaskList()),HttpStatus.OK);
    }

    @GetMapping("/task/{t_id}")
    public ResponseEntity getTaskByID(@PathVariable String t_id){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.READ_TASK_BY_TID,taskService.findTaskByTId(t_id)),HttpStatus.OK);
    }

    @PostMapping("/task")
    public ResponseEntity insertTask(@RequestBody TaskDTO taskDTO){
        return new ResponseEntity(BaseResp.res
                (StatusCode.OK,ResponseMessage.CREATED_TASK,taskService.insertTaskDTO(taskDTO)),HttpStatus.OK);
    }

    @PutMapping("/task")
    public ResponseEntity updateTask(@RequestBody TaskDTO TaskDTO) {
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.UPDATE_TASK, taskService.updateTaskDTO(TaskDTO)), HttpStatus.OK);
    }

    //test 삭제
    @DeleteMapping("/task/{t_id}")
    public ResponseEntity deleteTask(@PathVariable String t_id) {
        taskService.deleteTaskDTO(t_id);
        return new ResponseEntity(BaseResp.res(StatusCode.OK, ResponseMessage.DELETE_TASK), HttpStatus.OK);
    }
}
