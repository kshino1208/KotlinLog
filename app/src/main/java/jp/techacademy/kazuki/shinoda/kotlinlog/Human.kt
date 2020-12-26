package jp.techacademy.kazuki.shinoda.kotlinlog

import android.util.Log
import jp.techacademy.taro.kirameki.kotlinlog.Animal

open class Human: Animal,Thinkable{
    constructor(name: String, age: Int,hobby: String): super(name, age, hobby) {
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}





