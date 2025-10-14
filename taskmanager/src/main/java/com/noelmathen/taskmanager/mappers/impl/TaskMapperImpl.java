package com.noelmathen.taskmanager.mappers.impl;


import com.noelmathen.taskmanager.domain.entities.Task;

import org.springframework.stereotype.Component;

import com.noelmathen.taskmanager.domain.dto.TaskDto;
import com.noelmathen.taskmanager.mappers.TaskMapper;

@Component
public class TaskMapperImpl implements TaskMapper{

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
            taskDto.id(),
            taskDto.title(),
            taskDto.description(),
            taskDto.dueDate(),
            taskDto.status(),
            taskDto.priority(),
            null,
            null,
            null
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
            task.getId(),
            task.getTitle(),
            task.getDescription(),
            task.getDueDate(),
            task.getPriority(),
            task.getStatus()
        );
    }
}
