package com.example.jiangwei.kotlinlearn

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.lang.UnsupportedOperationException

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/18
 *     desc   : 计算器小案例
 *     version: 1.0
 * </pre>
 */

fun main(args: Array<String>) {
    while (true){
        try {
            println("请输入算式3 + 4")
            val input = readLine()?:break//为空直接不走了
            val splits = input.trim().split(" ")
            if (splits.size < 3){
                throw IllegalArgumentException("参数个数不对")
            }
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()
            println("$arg1 $op $arg2 = ${Operator(op).apply(arg1,arg2)}"  )


        }catch (e:NumberFormatException){
            println("您确认输入的是数字吗")
        }catch (e:IllegalArgumentException){
            println("您确认输入的是三个参数吗")
        }catch (e:Exception){
            println("人品太差")
        }
        println("再来一发？【Y】")
        val cmd = readLine()
        if (cmd == null || cmd.toLowerCase() != "y"){
            break
        }

    }


}

class Operator(op:String){
    val  opFun:(left:Double,right:Double) -> Double

    init {
        opFun = when(op){
            "+" -> {l,r -> l+r}
            "-" -> {l,r -> l-r}
            "*" -> {l,r -> l*r}
            "%" -> {l,r -> l%r}
            else->{
                throw UnsupportedOperationException(op)
            }

        }
    }

    fun apply(left:Double,right:Double):Double{
        return opFun(left,right)
    }
}