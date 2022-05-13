package com.hansol.spring.product.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResp<T> {

    //상태 코드
    private int statusCode;
    //상태 메세지
    private String responseMessage;
    //데이터
    private T data;

    //생성자
    public BaseResp(final int statusCode, final String responseMessage) {
        this.statusCode = statusCode;
        this.responseMessage = responseMessage;
        this.data = null;
    }
    //데이터 없이 상태 코드와 상태 메세지만 전송된 경우
    public static <T> BaseResp<T> res(final int statusCode, final String responseMessage) {
        return res(statusCode, responseMessage, null);
    }

    //상태 코드, 상태 메세지, 데이터를 모두 받은 경우
    public static <T> BaseResp<T> res(final int statusCode, final String responseMessage, final T t) {
        return BaseResp.<T>builder()
                .data(t)
                .statusCode(statusCode)
                .responseMessage(responseMessage)
                .build();
    }
}
