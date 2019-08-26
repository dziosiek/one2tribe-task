package com.example.task.controller;

import com.example.task.bean.TaskData;
import com.example.task.jpa.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private
    DataRepository repository;


    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<TaskData> add(@Valid @RequestBody TaskData taskData) {
        return ResponseEntity.ok(repository.save(taskData));
    }

    @GetMapping("/list")
    public ResponseEntity<List<TaskData>> getList() {
        return ResponseEntity.ok(repository.findAll());
    }

}
