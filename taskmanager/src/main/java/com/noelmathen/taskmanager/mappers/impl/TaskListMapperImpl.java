package com.noelmathen.taskmanager.mappers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.noelmathen.taskmanager.domain.dto.TaskListDto;
import com.noelmathen.taskmanager.domain.entities.Task;
import com.noelmathen.taskmanager.domain.entities.TaskList;
import com.noelmathen.taskmanager.domain.entities.TaskStatus;
import com.noelmathen.taskmanager.mappers.TaskListMapper;
import com.noelmathen.taskmanager.mappers.TaskMapper;

@Component
public class TaskListMapperImpl implements TaskListMapper{

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
            taskListDto.id(),
            taskListDto.title(),
            taskListDto.description(),
            null,
            null,
            Optional.ofNullable(taskListDto.tasks())
                .map(tasks -> tasks.stream()
                    .map(taskMapper::fromDto)
                    .toList())
                .orElse(null)
        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return new TaskListDto(
            taskList.getId(),
            taskList.getTitle(),
            taskList.getDescription(),
            Optional.ofNullable(taskList.getTasks())
                .map(List::size)
                .orElse(0),
            calculateTaskListProgress(taskList.getTasks()),
            Optional.ofNullable(taskList.getTasks())
                .map(tasks -> tasks.stream()
                    .map(taskMapper::toDto)
                    .toList())
                .orElse(null)
        );
    }

    private Double calculateTaskListProgress(List<Task> tasks){
        if(tasks==null){
            return null;
        }

        long closedTaskCount = tasks.stream().filter(task -> 
                                task.getStatus() == TaskStatus.CLOSED
        ).count();

        return (double)closedTaskCount/tasks.size();
    }
    
}
