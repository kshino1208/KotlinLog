package jp.techacademy.kazuki.shinoda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("篠田一輝", 31, "野球") // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say()
        human.think()


    }
}