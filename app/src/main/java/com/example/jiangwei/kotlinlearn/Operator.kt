package com.example.jiangwei.kotlinlearn

/**
 * 运算符自定义
 * 任何类都可以定义父类的基本运算符operator前缀
 *
 */
class Complex(var real: Double, var imaginary: Double) {
    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun plus(other: Int): Complex {
        return Complex(real + other, imaginary)
    }

    operator fun plus(other: Any): Int {
        return real.toInt()
    }

    operator fun invoke(): Double {
        return Math.hypot(real, imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

class Book {
    /**
     * 中缀符号中缀表达式（Infix notation）
     *当满足下列条件的时候，函数还可以使用中缀符号调用：
     *   当函数是成员函数或者扩展函数的时候
    当他们仅有一个参数的时候可以通过infix关键字标记
     *


     */
    infix fun on(any: Any): Boolean {
        return false
    }
}

class Desk

fun main(args: Array<String>) {
    //-name <Name>
    if ("-name" in args) {
        println(args[args.indexOf("-name") + 1])
    }
    /**
     * 中缀符号中缀表达式（Infix notation）
     */
    if (Book() on Desk()) { // dsl

    }
}