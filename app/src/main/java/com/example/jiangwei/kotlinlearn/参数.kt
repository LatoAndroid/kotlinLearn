package com.example.jiangwei.kotlinlearn

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/18
 *     desc   :
 *     version: 1.0
 * </pre>
 */

fun main(vararg args: String) {
//    for (arg in args){
//        println(arg)
//    }

    val list = arrayListOf(1,3,4,5)
    val array = intArrayOf(1,3,4,5)
    hello(3.0, *array)
}

//具名参数、默认参数和变长参数 varargs
fun hello(double: Double, vararg ints: Int, string: String = "Hello"){
    println(double)
    ints.forEach(::println)
    println(string)
}
