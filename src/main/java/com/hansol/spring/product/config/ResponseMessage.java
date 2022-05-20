package com.hansol.spring.product.config;

//상태 메세지 지정해두고 사용할 클래스
public class ResponseMessage {

    public static final String READ = "조회 성공";
    public static final String NOT_FOUND = "데이터를 찾을 수 없습니다.";
    public static final String CREATED = "생성 성공";
    public static final String UPDATED = "수정 성공";
    public static final String DELETED = "삭제 성공";
    public static final String METHOD_NOT_ALLOWED = "유효하지 않은 HTTP METHOD";

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