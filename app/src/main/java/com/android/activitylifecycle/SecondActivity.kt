package com.android.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.activitylifecycle.databinding.ActivityMainBinding
import com.android.activitylifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toast("두번째 Create 실행", Toast.LENGTH_SHORT)
        binding.button2.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        toast("두번째 onStart 실행", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        toast("두번째 onResume 실행", Toast.LENGTH_SHORT)
    }

    override fun onPause() {
        super.onPause()
        toast("두번째 onPause 실행", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        toast("두번째 onStop 실행", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("두번째 onDestroy 실행", Toast.LENGTH_SHORT)
    }

    private fun toast(message: String, length: Int) {
        Toast.makeText(this, message, length).show()
    }
}