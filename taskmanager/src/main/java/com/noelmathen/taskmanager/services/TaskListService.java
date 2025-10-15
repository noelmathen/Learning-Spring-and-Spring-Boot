package com.noelmathen.taskmanager.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.noelmathen.taskmanager.domain.entities.TaskList;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
    Optional<TaskList> getTaskList(UUID id);
}
