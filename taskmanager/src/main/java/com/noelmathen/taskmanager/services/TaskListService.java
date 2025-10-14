package com.noelmathen.taskmanager.services;

import java.util.List;

import com.noelmathen.taskmanager.domain.entities.TaskList;

public interface TaskListService {
    List<TaskList> listTaskLists();
    TaskList createTaskList(TaskList taskList);
}
