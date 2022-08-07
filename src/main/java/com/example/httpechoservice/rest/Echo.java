package com.example.httpechoservice.rest;

import com.example.httpechoservice.entity.IntClass;
import com.example.httpechoservice.repository.IntClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class Echo {

    @Autowired
    private IntClassRepository repository;

    @PostMapping
    public String echo(String string) {
        return string;
    }

    @GetMapping
    public String print() {
        StringBuilder builder = new StringBuilder();
        repository.findById("my")
            .ifPresentOrElse(it -> {
                it.setValue(it.getValue()+1);
                repository.save(it);
                builder.append("I am alive times" + it.getValue() + "!");
            }, () -> {
                IntClass intClass = new IntClass();
                intClass.setId("my");
                intClass.setValue(1);
                repository.save(intClass);
            });
        return builder.toString();
    }

    @GetMapping("/crash")
    public void crashMe() {
        new RuntimeException("CRASH ON PURPOSE").printStackTrace();
        System.exit(2);
    }
}
