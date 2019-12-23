package com.example.feelings

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleView

        userViewModel=ViewModelProvider

        fab.setOnClickListener{
            val intent:Intent= Intent(this,AddActivity::class.java)
            startActivityForResult(intent,REQUEST_CODE)
        }


        override fun onActivityResult(requestCode:Int ,resultCode:Int)
        if(requestCode==REQUEST_CODE &&  resultCode == Activity.RESULT_OK) {
            val user=User(it.getStringExtra(AddActivity.EXTRA_MOOD),
                          it.getStringExtra(AddActivity.EXTRA_REMARK))


        }

    }

    companion object{
       val REQUEST_CODE=1
    }
}
