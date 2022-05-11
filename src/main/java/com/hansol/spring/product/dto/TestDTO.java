package com.hansol.spring.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDTO {
    @ApiModelProperty(example="제목")
    String title;
    @ApiModelProperty(example="이름")
    String name;
}

