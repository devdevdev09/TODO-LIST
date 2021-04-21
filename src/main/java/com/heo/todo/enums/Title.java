package com.heo.todo.enums;

public enum Title {
    CODING("코딩"),STUDY("공부"),EXERCISE("운동"),HOME("집안일"),READING("독서"),ETC("기타");

    String desc;

    Title(String desc){
        this.desc = desc;        
    }

    public String getDesc(){
        return desc;
    }
}
