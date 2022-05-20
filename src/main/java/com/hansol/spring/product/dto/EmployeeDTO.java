package com.hansol.spring.product.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import nonapi.io.github.classgraph.json.Id;

@Data
public class EmployeeDTO {
    @Id
    int e_id;
    @NotNull
    String e_name;

    @NotNull
    String e_company;

    @NotNull
    String e_rank;

    @NotNull
    String e_phone;


}
