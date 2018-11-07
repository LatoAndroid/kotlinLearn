package com.example.jiangwei.kotlinlearn;

public class test {
    int no = 100;
    public int getNo() {
        return getNo();// Kotlin中的get() = no语句中出来了变量no，直接被编译器理解成“调用getter方法”
    }

    public void setNo(int value) {
        if (value < 10) {
            setNo(value);// Kotlin中出现“no =”这样的字样，直接被编译器理解成“这里要调用setter方法”
        } else {
            setNo(-1);// 在setter方法中调用setter方法，这是不正确的
        }
    }


}
