package com.noelmathen.taskmanager.mappers;

import com.noelmathen.taskmanager.domain.dto.TaskListDto;
import com.noelmathen.taskmanager.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}
