package com.hansol.spring.product.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class DtaskDTO {
    @NotNull
    String detail_task;

    @NotNull
    String t_id;

    @NotNull
    int e_id;

}
