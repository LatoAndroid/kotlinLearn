package com.example.jiangwei.kotlinlearn.面向对象

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/20
 *     desc   : 接口代理
 *     version: 1.0
 * </pre>
 */
class Manager: Driver, Writer {
    override fun write() {

    }

    override fun drive() {

    }
}

/**
 * 接口代理by，直接用传入的类代理这个方法，在这里，SeniorManager的实例调用drive，就是调用传入的val driver: Driver的drive方法
 *
 *
 *
 */
class SeniorManager(val driver: Driver, val writer: Writer): Driver by driver, Writer by writer

class CarDriver: Driver {
    override fun drive() {
        println("开车呢")
    }
}

class PPTWriter: Writer {
    override fun write() {
        println("做PPT呢")
    }

}

interface Driver{
    fun drive()
}

interface Writer{
    fun write()
}

fun main(args: Array<String>) {
    val driver = CarDriver()
    val writer = PPTWriter()
    val seniorManager = SeniorManager(driver, writer)
    seniorManager.drive()
    seniorManager.write()
}