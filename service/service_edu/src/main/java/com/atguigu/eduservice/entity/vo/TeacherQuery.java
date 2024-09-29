package com.atguigu.eduservice.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherQuery implements Serializable {

    private static final long serialVersionUID = -5353950873117023373L;

    private String name;

    private Integer level;

    private String begin;

    private String end;
}
