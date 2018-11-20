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
open abstract class Aa(){
     open var j = 0
}

/**
 * kotlin的接口可以赋予实例，但是不能赋值
 */
interface Bb{
    var j:Int

}

interface  Cc

abstract class E

class Dd(override var j:Int):Aa(),Bb,Cc{

}