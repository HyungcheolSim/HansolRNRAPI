package com.hansol.spring.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

//데이터의 형태를 나타내는 클래스
@Data
public class TestDTO {
    @ApiModelProperty(example = "제목")
    String title;
    @ApiModelProperty(example = "이름")
    String name;
}

