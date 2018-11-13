package com.example.jiangwei.kotlinlearn

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/10
 *     desc   : 函数的练习
 *     version: 1.0
 * </pre>
 *
 * 没有返回值结果是Unit,可以忽略不写
 */
val helleWorld = "helleWorld"
fun main(args: Array<String>){
   // println("hello ${args[0]}")
    sum5(1,2)
    sum5.invoke(1,2)
    var hello: Array<String> = arrayOf("0","1","2")

    hello.forEach ForEach@{
        //直接return lambda会终止整个函数  所以要加标签
        if (it == "1")return@ForEach
        println(it)
    }

    println(sum3)
    println(::sum)
}


fun sum(a:Int,b:Int): Int {
    return a+b
}

fun sum2(a:Int,b:Int) = a+b//简易写法

//可以不需要名字 但需要变量来接受
var sum3 = fun(a:Int):Long {
    return 0
}

/**
 * lambda
 */
var sum4 = {a:Int,b:Int -> a+b}
var sum5 = {a:Int,b:Int ->
    //lambda其他语句
    println("hello")
    a+b}

var printHello = {
    println("hello")
}






