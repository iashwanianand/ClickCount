package com.chetu.clickcount.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.chetu.clickcount.databinding.ActivityClickCountBinding
import com.chetu.clickcount.viewmodel.CountViewModel

class ClickCountActivity : AppCompatActivity()/*, View.OnClickListener*/ {
    private lateinit var binding: ActivityClickCountBinding
    private lateinit var countViewModel: CountViewModel
    private val totalCount: String = "Total click: "
//    var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClickCountBinding.inflate(layoutInflater)
        setContentView(binding.root)
        countViewModel = ViewModelProvider(this)[(CountViewModel::class.java)]

        /*binding.btnClick.setOnClickListener(this)
        binding.btnReset.setOnClickListener(this)*/

        binding.clickCount.text = totalCount.plus(countViewModel.getCount().toString())

        /*binding.btnClick.setOnClickListener {
            binding.clickCount.text = totalCount.plus(countViewModel.addCount().toString())

        }*/

         /*binding.btnReset.setOnClickListener {
             binding.clickCount.text = totalCount.plus(countViewModel.resetCount().toString())
         }*/
    }

    /*override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.btn_click -> {
                binding.clickCount.text = totalCount.plus(countViewModel.addCount().toString())
            }
            R.id.btn_reset -> {
                binding.clickCount.text = totalCount.plus(countViewModel.resetCount().toString())
            }
        }
    }*/

    // function called in onClick attribute in XML
    fun clickButton(view: View) {
        binding.clickCount.text = totalCount.plus(countViewModel.addCount())
    }

    fun resetButton(view: View) {
        binding.clickCount.text = totalCount.plus(countViewModel.resetCount())
    }


    /*override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", clickCount)
    }*/


/* override fun onRestoreInstanceState(savedInstanceState: Bundle) {
     super.onRestoreInstanceState(savedInstanceState)
     clickCount = savedInstanceState.getInt("count", 0)
     binding.clickCount.text = totalCount.plus(clickCount)
 }*/
}