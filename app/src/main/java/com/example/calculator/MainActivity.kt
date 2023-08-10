package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val res=findViewById<TextView>(R.id.result)
        val num1=findViewById<EditText>(R.id.num1)
        val num2=findViewById<EditText>(R.id.num2)
        val plus=findViewById<Button>(R.id.plus)
        val minus=findViewById<Button>(R.id.minus)
        val mul=findViewById<Button>(R.id.mul)
        val div=findViewById<Button>(R.id.div)
        val clear=findViewById<Button>(R.id.clear)

        fun validate(userValue1:String?,userValue2:String?):Boolean{
            return  when{
                userValue1.isNullOrEmpty() ->{
                    Toast.makeText(this,"Please enter a value",Toast.LENGTH_LONG).show()
                    return false
                }
                    userValue2.isNullOrEmpty()->{
                        Toast.makeText(this,"Please enter a value",Toast.LENGTH_LONG).show()
                        return false
                    }

                else -> {
                    return true
                }
            }
        }

        clear.setOnClickListener {
            res.text=""
        }

        plus.setOnClickListener {
            val n1=num1.text.toString()
            val n2=num2.text.toString()
            if(validate(n1,n2)) {
                val ans = (n1.toFloat() + n2.toFloat())
                val decimalFormat = DecimalFormat("#.##")
                val formattedAns = decimalFormat.format(ans)
                res.text = formattedAns.toString()
            }
        }
        minus.setOnClickListener {
            val n1=num1.text.toString()
            val n2=num2.text.toString()
            if(validate(n1,n2)) {
                val ans = (n1.toFloat() - n2.toFloat())
                val decimalFormat = DecimalFormat("#.##")
                val formattedAns = decimalFormat.format(ans)
                res.text = formattedAns.toString()
            }
        }
        mul.setOnClickListener {
            val n1=num1.text.toString()
            val n2=num2.text.toString()
            if(validate(n1,n2)) {
                val ans = (n1.toFloat() * n2.toFloat())
                val decimalFormat = DecimalFormat("#.##")
                val formattedAns = decimalFormat.format(ans)
                res.text = formattedAns.toString()
            }
        }
        div.setOnClickListener {
            val n1=num1.text.toString()
            val n2=num2.text.toString()
            if(validate(n1,n2)) {
                val ans = (n1.toFloat() / n2.toFloat())
                val decimalFormat = DecimalFormat("#.##")
                val formattedAns = decimalFormat.format(ans)
                res.text = formattedAns.toString()
            }
        }
    }
}