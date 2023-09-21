package kr.ac.kumoh.ce.s20180074

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.ce.s20180074.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(main.root)

        main.btnGenerate.setOnClickListener{
            main.num1.text = Random.nextInt(from = 1, until = 46).toString()
            main.num2.text = Random.nextInt(from = 1, until = 46).toString()
            main.num3.text = Random.nextInt(from = 1, until = 46).toString()
            main.num4.text = Random.nextInt(from = 1, until = 46).toString()
            main.num5.text = Random.nextInt(from = 1, until = 46).toString()
            main.num6.text = Random.nextInt(from = 1, until = 46).toString()
        }
    }
}