package com.hansol.spring.product.config;

//상태 메세지 지정해두고 사용할 클래스
public class ResponseMessage {
    public static final String READ_TEST = "테스트 조회 성공";
    public static final String READ_TEST_BY_TITLE = "특정 제목의 테스트 조회 성공";
    public static final String NOT_FOUND_TEST = "회원을 찾을 수 없습니다.";
    public static final String CREATED_TEST = "테스트 추가 성공";
    public static final String UPDATE_TEST = "테스트 수정 성공";
    public static final String DELETE_TEST = "테스트 삭제 성공";

    public static final String READ_EMPLOYEE = "사원 조회 성공";
    public static final String READ_EMPLOYEE_BY_EID = "특정 제목의 사원 조회 성공";
    public static final String NOT_FOUND_EMPLOYEE = "회원을 찾을 수 없습니다.";
    public static final String CREATED_EMPLOYEE = "사원 추가 성공";
    public static final String UPDATE_EMPLOYEE = "사원 수정 성공";
    public static final String DELETE_EMPLOYEE = "사원 삭제 성공";

    public static final String READ_TASK = "업무 조회 성공";
    public static final String READ_TASK_BY_TID = "특정 제목의 업무 조회 성공";
    public static final String NOT_FOUND_TASK = "회원을 찾을 수 없습니다.";
    public static final String CREATED_TASK = "업무 추가 성공";
    public static final String UPDATE_TASK = "업무 수정 성공";
    public static final String DELETE_TASK = "업무 삭제 성공";

    public static final String READ_DTASK = "업무분장 조회 성공";
    public static final String READ_DTASK_BY_DTASKANDTID = "특정 제목의 업무분장 조회 성공";
    public static final String NOT_FOUND_DTASK = "업무분장을 찾을 수 없습니다.";
    public static final String CREATED_DTASK = "업무분장 추가 성공";
    public static final String UPDATE_DTASK = "업무분장 수정 성공";
    public static final String DELETE_DTASK = "업무분장 삭제 성공";


    public static final String INTERNAL_SERVER_ERROR = "서버 내부 에러";
    public static final String DB_ERROR = "데이터베이스 에러";
}