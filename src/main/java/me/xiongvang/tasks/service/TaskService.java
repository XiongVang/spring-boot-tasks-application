package me.xiongvang.tasks.service;

import me.xiongvang.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    Iterable<Task> list ();
}
