package com.example.task.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TaskData {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "name field cannot be null")
    @Size(message = "name field cannot be empty", min = 1)
    private String name;

}
