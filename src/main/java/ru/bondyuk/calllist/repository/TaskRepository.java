package ru.bondyuk.calllist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bondyuk.calllist.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
