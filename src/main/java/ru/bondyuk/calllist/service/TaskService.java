package ru.bondyuk.calllist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bondyuk.calllist.domain.Task;
import ru.bondyuk.calllist.repository.TaskRepository;

import java.util.Date;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repository;

    @Autowired
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task save(String orderId, Date deliveryDate) {
        Task task = new Task(orderId, deliveryDate);
        return repository.save(task);
    }

    public List<Task> findByFilter(Date fromDate, Date toDate, String orderId) {
        return repository.findAllByDeliveryDateBetweenAndOptionalOrderId(fromDate, toDate, orderId);
    }
}
