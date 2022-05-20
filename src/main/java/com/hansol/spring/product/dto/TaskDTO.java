package com.hansol.spring.product.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class TaskDTO {
    @NotNull
    String t_id;

    @NotNull
    String t_name;


}
