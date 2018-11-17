package com.example.jiangwei.kotlinlearn

/**
 * <pre>
 *     author : jiangwei
 *     e-mail : jiangwei_android@163.com
 *     time   : 2018/11/15
 *     desc   : 类似于switch 但是灵活很多
 *     加强版switch，支持任意类型
 *     支持存表达式条件分支（类似if）
 *     表达式与完备性
 *     version: 1.0
 * </pre>
 */

class PlayerKt {
    enum class State {
        IDLE, BUFFERING, PLAYING, PAUSED
    }

    private var state = State.IDLE


    fun pause() {
        when (state) {
            PlayerKt.State.BUFFERING, PlayerKt.State.PLAYING -> doPause()
            else -> {

            }
        }
    }

    fun resume() {


        when (state) {
            PlayerKt.State.PAUSED -> doResume()
        }//什么都不做
    }

    private fun doResume() {
        state = State.PLAYING
        //处理真正的继续播放逻辑
    }

    private fun doPause() {
        state = State.PAUSED
        //处理真正的暂停逻辑
    }

    fun test(){
        val x = 5
        when(x){
            is Int -> println("Hello $x")
            in 1..100 -> println("$x is in 1..100")
            !in 1..100 -> println("$x is not in 1..100")

        }

        val mode = when{
            x==5 -> 1
            else -> 0
        }
    }
}