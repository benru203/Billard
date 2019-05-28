package com.example.billard;

import java.util.ArrayList;

public class Pool {

    private int num;
    private String id;
    private boolean status;

    public Pool(int num, boolean status) {
        this.num = num;
        this.status = status;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
