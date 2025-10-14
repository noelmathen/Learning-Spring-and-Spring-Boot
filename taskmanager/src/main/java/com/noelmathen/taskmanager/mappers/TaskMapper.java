package com.noelmathen.taskmanager.mappers;

import com.noelmathen.taskmanager.domain.entities.Task;
import com.noelmathen.taskmanager.domain.dto.TaskDto;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
