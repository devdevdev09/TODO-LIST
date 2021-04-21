package com.heo.todo.enums;

public enum Type {
    DAILY("매일"),WEEKLY("매주"),MONTHLY("매월"),YEARLY("매년"),TEMPORARY("일시적"),ETC("기타");

    String desc;

    Type(String desc){
        this.desc = desc;        
    }

    public String getDesc(){
        return desc;
    }
}
