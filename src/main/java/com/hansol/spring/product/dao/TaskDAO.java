package com.hansol.spring.product.dao;

import com.hansol.spring.product.dto.TaskDTO;

import java.util.List;

public interface TaskDAO {
    TaskDTO selectTaskDataById(String t_id);

    List<TaskDTO> selectTaskData();

    void insertTaskData(TaskDTO taskDTO);

    void updateTaskData(TaskDTO taskDTO);

    void deleteTaskData(String t_id);

}
