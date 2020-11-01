package com.qf.hua.mvc.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserRequestParam {
    private String username;
    private int age;
    private List<Address> addresses;

}
