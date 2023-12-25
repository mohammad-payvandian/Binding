package com.example.binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val value = inflater.inflate(R.layout.fragment_blank,container,false)
        val use = value.findViewById<EditText>(R.id.editText4)

        val button = use.findViewById<Button>(R.id.btn_blank)
        button.setOnClickListener {
            Toast.makeText(context,"hello ${use.text}",Toast.LENGTH_SHORT).show()
        }

        return value
    }
}