package com.example.httpechoservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("IntClass")
@Getter
@Setter
public class IntClass {
    @Id
    private String id;
    private Integer value;
}
