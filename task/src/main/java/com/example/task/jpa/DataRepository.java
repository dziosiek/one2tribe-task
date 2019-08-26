package com.example.task.jpa;

import com.example.task.bean.TaskData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<TaskData, Long> {
}
