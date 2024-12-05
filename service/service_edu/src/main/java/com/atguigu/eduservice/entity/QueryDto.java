package com.atguigu.eduservice.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class QueryDto {

    private String size;

    private String page;
}
