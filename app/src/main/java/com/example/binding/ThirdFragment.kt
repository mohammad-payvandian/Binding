package com.example.binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.binding.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val view = inflater.inflate(R.layout.fragment_third,container,false)
//        val name = view.findViewById<EditText>(R.id.editText3)
//        val family = view.findViewById<EditText>(R.id.editText)
//
//        val button = view.findViewById<Button>(R.id.btn_next)
//        button.setOnClickListener {
//            Toast.makeText(context,"hello ${name.text} ${family.text}" ,Toast.LENGTH_SHORT).show()
//        }
//
//        return view
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentThirdBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_third, container, false)

        binding.btnBefore.setOnClickListener {
            Toast.makeText(context,"hello ${binding.editText.text} ${binding.editText3.text}",Toast.LENGTH_LONG).show()
        }


        return binding.root

    }
}