package com.example.spinnerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinnerview.adapters.MySpinnerAdapter
import com.example.spinnerview.databinding.ActivityMainBinding
import com.example.spinnerview.models.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var arrayAdapter: ArrayAdapter<String>

    private lateinit var adapter: MySpinnerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //third work
//        val list = resources.getStringArray(R.array.spinner_list)

        //first work
        /**binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
         *  override fun onItemSelected(
         *      parent: AdapterView<*>?,
         *      view: View?,
         *      position: Int,
         *      id: Long
         *  ) {
         *      Toast.makeText(this@MainActivity, list[position], Toast.LENGTH_SHORT).show()
         *  }
         *
         *  override fun onNothingSelected(parent: AdapterView<*>?) {
         *
         *  }
        }*/

        //second work
        /**binding.click.setOnClickListener {
         *   Toast.makeText(this, list[binding.spinner.selectedItemPosition], Toast.LENGTH_SHORT)
         *       .show()
        }*/

        //four work
        //Custom resources list
        /** val stringList = arrayOf("C++", "Java", "Kotlin", "Android Studio")
         *   arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stringList)
         *   binding.spinner.adapter = arrayAdapter*/
        val list = ArrayList<User>()
        list.add(User(R.drawable.ic_launcher_background, "Java"))
        list.add(User(R.drawable.ic_launcher_background, "Kotlin"))
        list.add(User(R.drawable.ic_launcher_background, "Android Studio"))
        adapter = MySpinnerAdapter(this, list)
        binding.spinner.adapter = adapter

    }
}