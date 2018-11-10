package com.example.jiangwei.kotlinlearn

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/10
 *     desc   :
 *     version: 1.0
 * </pre>
 */
val i=1;//val=value  值类型  类似java中的final 不可能重新赋值  但又有点不一样
//val 是运行期常量  我们可以通过类似反射的方法修改值
const val k = 1;//编译期常量 完全等同于final
var j=2//普通变量的定义 可以不用类型 编译器会自动判断
