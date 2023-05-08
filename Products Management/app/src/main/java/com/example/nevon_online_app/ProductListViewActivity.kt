package com.example.nevon_online_app

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.nevon_online_app.databinding.ActivityMainBinding

class ProductListViewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var productArrayList: ArrayList <ProductDataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_product_list_view)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5
        )

        val name = arrayOf(

            "Namep1",
            "Namepp2",
            "Namepp3",
            "Namepp4",
            "Namepp5"
        )

        val lastMessage = arrayOf(

            "lastMessagep1",
            "lastMessagep2",
            "lastMessagep3",
            "lastMessagep4",
            "lastMessagep5"
        )

        val count = arrayOf(

            "countp1",
            "countp2",
            "countp3",
            "countp4",
            "countp5"
        )

        val phoneNumber = arrayOf(

            "phoneNumberp1",
            "phoneNumberp2",
            "phoneNumberp3",
            "phoneNumberp4",
            "phoneNumberp5"
        )
        val country = arrayOf(

            "countryp1",
            "countryp2",
            "countryp3",
            "countryp4",
            "countryp5"
        )


        productArrayList = ArrayList()

        for(i in name.indices)
        {
            val product = ProductDataClass(name[i],lastMessage[i],count[i],phoneNumber[i],country[i],imageId[i])
            productArrayList.add(product)
        }

    }
}