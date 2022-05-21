package com.hansol.spring.product.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class RNRDTO {
    @NotNull
    String detail_task;

    @NotNull
    String t_id;

    @NotNull
    String t_name;

    @NotNull
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
