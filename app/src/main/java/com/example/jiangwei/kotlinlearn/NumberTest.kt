package com.example.jiangwei.kotlinlearn


fun main(args: Array<String>) {
 val string="test"
 val string2 = String(charArrayOf('t','e','s','t'))
 println("$string + $string2" )
 var rawString :String = """
     三引号可以带格式
     $string
     \"转义字符失去作用，除了$"
 """
 println(rawString)

 println(string == string2)//相当于java  equals  true
 println(string === string2)//相当于java ==      false
}