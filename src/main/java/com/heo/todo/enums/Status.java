package com.heo.todo.enums;

public enum Status {
    TODO("할것"),STOP("정지"),PROGRESS("진행중"),COMPLETE_FINISH("완전종료"),INCOMPLETE_FINISH("불완전종료"),HOLD("보류");

    String desc;

    Status(String desc){
        this.desc = desc;        
    }

    public String getDesc(){
        return desc;
    }
}
