package com.example.demo.controller;

import com.example.demo.dto.TodoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoController {

    @GetMapping("/testTodo")
    public ResponseEntity<?> todo(){
        TodoDTO response = TodoDTO.<String,Boolean>builder().id("123").title("김현서").done(true).build();
        return ResponseEntity.ok().body(response);
    }

}
