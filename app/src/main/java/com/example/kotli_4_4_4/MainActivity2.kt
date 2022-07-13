package com.example.kotli_4_4_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.kotli_4_4_4.model.Member
import com.example.kotli_4_4_4.model.User

class MainActivity2 : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }
    fun initViews(){
      var main2_button=findViewById<Button>(R.id.main2_button)
       main2_button.setOnClickListener{
           var member= Member(1001,"Member")
           exitActivity(member)
       }

        var main_text2=findViewById<TextView>(R.id.main2_text)

        var user=intent.getSerializableExtra("user")

        Log.d(TAG,user.toString()!!)

        main_text2.setText(user.toString())


    }
    fun exitActivity(member:Member){
        var intent=Intent()
        intent.putExtra("member",member)
        setResult(RESULT_OK,intent)
        finish()
    }
}