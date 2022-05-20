package com.hansol.spring.product.service;

import com.hansol.spring.product.dao.TaskDAO;
import com.hansol.spring.product.dto.TaskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskDAO taskDAO;

    @Autowired
    public TaskServiceImpl(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }


    @Override
    public TaskDTO findTaskByTId(String t_id) {
        return taskDAO.selectTaskDataById(t_id);
    }

    @Override
    public List<TaskDTO> getTaskList() {
        return taskDAO.selectTaskData();
    }

    @Override
    public TaskDTO insertTaskDTO(TaskDTO taskDTO) {
        taskDAO.insertTaskData(taskDTO);
        return taskDTO;
    }

    @Override
    public TaskDTO updateTaskDTO(TaskDTO taskDTO) {
        TaskDTO existTask = taskDAO.selectTaskDataById(taskDTO.getT_id());
        existTask.setT_name(taskDTO.getT_name());
        taskDAO.updateTaskData(existTask);
        return existTask;
    }

    @Override
    public void deleteTaskDTO(String t_id) {
        taskDAO.deleteTaskData(t_id);
    }
}
