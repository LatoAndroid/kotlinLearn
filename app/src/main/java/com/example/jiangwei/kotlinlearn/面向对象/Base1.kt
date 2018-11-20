package com.example.jiangwei.kotlinlearn.面向对象

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/18
 *     desc   : kotlin的接口和抽象类基础
 *     version: 1.0
 * </pre>
 */
open abstract class A(){
     open var j = 0
}

/**
 * kotlin的接口可以赋予实例，但是不能赋值
 */
interface B{
    var j:Int

}

interface  C

abstract class E

class D(override var j:Int):A(),B,C{

}