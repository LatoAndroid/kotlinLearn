package com.example.jiangwei.kotlinlearn

/**
当Kotlin中的类需要构造函数时，可以有一个主构造函数和多个次构造函数，可以没有次构造函数。主构造函数在类名后。
当主构造函数有注解或者可见性修饰符，需加 constructor 关键字。
主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块中
 */

class sister(var name: String = "sisterA", var sex: String) {//主构造函数

    /**
     *  次构造函数
     * 1、次构造函数不能有声明 val 或 var
     * 2、如果类有一个主构造函数（无论有无参数），每个次构造函数需要直接或间接委托给主构造函数，用this关键字
     *
     *
     * 注意：在 JVM 虚拟机中，如果主构造函数的所有参数都有默认值，编译器会生成一个附加的无参的构造函数，
     * 这个构造函数会直接使用默认值。这使得 Kotlin 可以更简单的使用像 Jackson 或者 JPA 这样使用无参构造函数来创建类实例的库。
     * class Customer(val customerName: String = "")
     */

    constructor(name: String = "sisterA", age: Int = 10) : this(name, "次构造函数sex")

    //自带init方法
    init {
        val length: Int = sex.length
    }

    //属性声明，类的属性可以用关键字 var 声明为可变的，否则使用只读关键字 val 声明为不可变。
    var length: Int = sex.length
    //显示定义get与set方法
    //Kotlin 中类不能有字段。提供了 Backing Fields(后端变量) 机制,备用字段使用field关键字声明,field 关键词只能用于属性的访问器
        get() = field
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }


    /**
     * 不用幕后字段会怎么样呢？
    var no: Int = 100
    get() = no
    set(value) {
    if (value < 10) {       // 如果传入的值小于 10 返回该值
    no = value
    } else {
    no = -1         // 如果传入的值大于等于 10 返回 -1
    }
    }
    注意这里我们使用的 Java 的思维写了 getter 和 setter 方法，那么这时，如果将这段代码翻译成 Java 代码会是怎么样呢？如下：
    int no = 100;
    public int getNo() {
    return getNo();// Kotlin中的get() = no语句中出来了变量no，直接被编译器理解成“调用getter方法”
    }

    public void setNo(int value) {
    if (value < 10) {
    setNo(value);// Kotlin中出现“no =”这样的字样，直接被编译器理解成“这里要调用setter方法”
    } else {
    setNo(-1);// 在setter方法中调用setter方法，这是不正确的
    }
    }
    翻译成 Java 代码之后就很直观了，在 getter 方法和 setter 方法中都形成了递归调用，显然是不正确的，最终程序会出现内存溢出而异常终止。
     */


    fun test() {
        //1、当在主函数中声明后可以当做全局变量使用
        val length: Int = name.length
        //2、当不在主函数中声明时，只能在初始化块以及属性声明中使用
        //val length :Int=sex.length
    }
}

class sister2 constructor(var name: String, var sex: String) {
    init {
        name = "默认"
        sex = "默认"
    }
}

fun main(args: Array<String>) {
    val sister = sister("linyibiao111111111", 18)
    sister.length = 100
    println(sister.name + sister.length)
    sister()
    val sister2 = sister2("libao", "")
    println("${sister2.name}  sex= ${sister2.sex} ")

}




