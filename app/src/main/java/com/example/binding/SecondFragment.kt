package com.example.binding

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondFragment : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val nameEdt = view.findViewById<EditText>(R.id.editText)

        val familyEdt = view.findViewById<EditText>(R.id.editText2)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(context,"Hello ${nameEdt.text} ${familyEdt.text}",Toast.LENGTH_SHORT).show()
        }

        return view
    }
}