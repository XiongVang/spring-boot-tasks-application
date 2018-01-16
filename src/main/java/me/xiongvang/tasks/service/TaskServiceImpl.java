package me.xiongvang.tasks.service;

import me.xiongvang.tasks.domain.Task;
import me.xiongvang.tasks.repository.TaskRepository;

public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
