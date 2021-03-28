package com.heo.todo.service;

import com.heo.todo.entity.Todo;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    public Todo findById(Long id);

    public boolean insert(Todo todo);

    public boolean update(Todo todo);
    // ~ 03.31
    // 1. 초기 등록
        // 등록방법, 단순 한개씩, 여러개 동시, 업로드 등등?
        // 기존거 복사 기능?
    // 2. 중간 업데이트
    // 3. 완료 처리
    // 4. 기타 상태 처리(지연 업데이트 등)
    // 5. 상태 조회

    // ~ 04.04
    // 알림관리 > 메시지 봇으로 전송하기
    // 1. 지연알림
    // 2. 지속알림(remind)
    // 3. 완성알림X

    // ~ 04.11
    // 아주 뒤로..........일단 개인용
    // 회원관리
    // 1. OAuth 2.0
}
