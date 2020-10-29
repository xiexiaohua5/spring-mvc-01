package com.qf.hua.mvc.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;
    private String username;
    private Address address;
    private List<String> list;
}
