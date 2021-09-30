package com.ifit.webapp.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long uid;
    private String user_name;
    private String email;
    private String phone;
    private String idcard;
    private Date birthday;
    private Integer gender;
    private String province;
    private String city;
    private Date create_date;
    private Date data_change_last_time;
}
