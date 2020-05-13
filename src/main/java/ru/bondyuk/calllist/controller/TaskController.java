package ru.bondyuk.calllist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bondyuk.calllist.domain.Task;
import ru.bondyuk.calllist.service.TaskService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {
    private final TaskService service;

    @Autowired
    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.findAll();
    }

    @PostMapping
    public Task create(@RequestParam String orderId, Date deliveryDate) {
        return service.save(orderId, deliveryDate);
    }
}
