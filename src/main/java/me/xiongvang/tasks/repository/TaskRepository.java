package me.xiongvang.tasks.repository;

import me.xiongvang.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Long>{
}
