package com.example.kotli_4_4_4

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.kotli_4_4_4.model.Member
import com.example.kotli_4_4_4.model.User

class MainActivity : AppCompatActivity() {
    var TAG:String=MainActivity2::class.java.toString()

    lateinit var main_text:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
}
    var detailLauncher=registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){result->
        if(result.resultCode== RESULT_OK){

            var data:Intent?=result.data

            var member=data?.getSerializableExtra("member")

            Log.d(TAG,member.toString()!!)

            main_text.setText(member.toString())

        }
    }



    fun initviews(){
        main_text=findViewById<TextView>(R.id.main_text)
        var main_button=findViewById<Button>(R.id.main_button)
        main_button.setOnClickListener{
            var user=User(2002,"User")
            startActivity2(user)
        }
    }

    fun startActivity2(user: User){
        var intent=Intent(this,MainActivity2::class.java)
        intent.putExtra("user",user)
        detailLauncher.launch(intent)
    }
}