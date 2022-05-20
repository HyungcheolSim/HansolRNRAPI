package com.hansol.spring.product.service;

import com.hansol.spring.product.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    TaskDTO findTaskByTId(String t_id);

    List<TaskDTO> getTaskList();

    TaskDTO insertTaskDTO(TaskDTO taskDTO);

    TaskDTO updateTaskDTO(TaskDTO taskDTO);

    void deleteTaskDTO(String t_id);



}
