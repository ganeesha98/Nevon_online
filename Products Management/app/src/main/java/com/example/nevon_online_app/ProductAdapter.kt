package com.example.nevon_online_app

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.sql.Array

class ProductAdapter (private val context: Activity, private val arrayList: ArrayList<ProductDataClass>) :ArrayAdapter <ProductDataClass>
    (context,R.layout.product_list_item,arrayList) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.product_list_item,null)

        val imageView : ImageView = view.findViewById(R.id.profile_pic)
        val productName : TextView = view.findViewById(R.id.productName)
        val productMessage : TextView = view.findViewById(R.id.productMessage)
        val productCount : TextView = view.findViewById(R.id.productCount)

        imageView.setImageResource(arrayList[position].imageId)
        productName.text = arrayList[position].productname
        productMessage.text = arrayList[position].lastMessage
        productCount.text = arrayList[position].product_count

        return view
    }
}