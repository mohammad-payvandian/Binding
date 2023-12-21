package com.example.binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ButtonFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val user = inflater.inflate(R.layout.fragment_button,container,false)
        val names = user.findViewById<EditText>(R.id.ed_name)

        val btn = user.findViewById<Button>(R.id.btn_click)
        btn.setOnClickListener {
            Toast.makeText(context,"Hello ${names.text}",Toast.LENGTH_SHORT).show()
        }

        return user
    }
}