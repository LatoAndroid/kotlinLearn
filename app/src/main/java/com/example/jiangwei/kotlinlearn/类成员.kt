package com.example.jiangwei.kotlinlearn

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/13
 *     desc   :
 *     version: 1.0
 * </pre>
 */

class X

class A{
    var b = 0
    lateinit var c: String//当你不想初始化的时候 var
    lateinit var d: X
    val e: X by lazy {//当你不想初始化的时候 val
        println("init X")
        X()
    }

    var cc: String? = null//设置可以为空
}

fun main(args: Array<String>) {

    println("start")// start
    val a = A()
    println("init a")
    println(a.b)// 0
    println(a.e)// init X  com.example.jiangwei.kotlinlearn.X@816f27d

    a.d = X()
    println(a.d)//不会再次初始化 com.example.jiangwei.kotlinlearn.X@87aac27

    println(a.c)//c没有被初始化  报错

    println(a.cc?.length)

    /**
     * 最终打印
     * start
    init a
    0
    init X
    com.example.jiangwei.kotlinlearn.X@816f27d
    com.example.jiangwei.kotlinlearn.X@87aac27

    Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property c has not been initialized
    at com.example.jiangwei.kotlinlearn.A.getC(类成员.kt:17)
    at com.example.jiangwei.kotlinlearn.类成员Kt.main(类成员.kt:38)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:498)
    at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
     */
}
