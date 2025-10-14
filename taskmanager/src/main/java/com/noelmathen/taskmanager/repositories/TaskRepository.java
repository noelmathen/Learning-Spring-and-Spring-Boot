package com.noelmathen.taskmanager.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noelmathen.taskmanager.domain.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, UUID>{
    List<Task> findByTaskListId(UUID taskListId);
    Optional<Task> findByTaskListIdAndId(UUID taskListId, UUID id);
}
