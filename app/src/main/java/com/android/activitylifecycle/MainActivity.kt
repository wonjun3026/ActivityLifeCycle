package com.android.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import android.widget.Toast
import com.android.activitylifecycle.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewPagerAdapter by lazy {
        ViewPagerAdapter(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        toast("첫번째 Create 실행", Toast.LENGTH_SHORT)
        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.mainViewpager.adapter = viewPagerAdapter
        TabLayoutMediator(binding.mainTab,binding.mainViewpager) { tab, position ->
            tab.text = viewPagerAdapter.getTitle(position)
        }.attach()
    }

    override fun onStart() {
        super.onStart()
        toast("첫번째 onStart 실행", Toast.LENGTH_SHORT)
    }

    override fun onResume() {
        super.onResume()
        toast("첫번째 onResume 실행", Toast.LENGTH_SHORT)
    }

    override fun onPause() {
        super.onPause()
        toast("첫번째 onPause 실행", Toast.LENGTH_SHORT)
    }

    override fun onStop() {
        super.onStop()
        toast("첫번째 onStop 실행", Toast.LENGTH_SHORT)
    }

    override fun onDestroy() {
        super.onDestroy()
        toast("첫번째 onDestroy 실행", Toast.LENGTH_SHORT)
    }

    private fun toast(message: String, length: Int) {
        Toast.makeText(this, message, length).show()
    }
}