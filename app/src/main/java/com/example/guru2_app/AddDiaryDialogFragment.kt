package com.example.guru2_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment


class AddDiaryDialogFragment : DialogFragment() {
//    private var _binding: AddDiaryBinding? = null
//    private val binding get() = _binding!!
//
//    var onAddDiaryListener: ((Diary) -> Unit)? = null
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = AddDiaryBinding.inflate(inflater, container, false)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.finishBtn.setOnClickListener {
//            val date = binding.date.text.toString()
//            val mood = binding.mood.text.toString()
//            val content = binding.etDiary.text.toString()
//            onAddDiaryListener?.invoke(Diary(R.drawable.mood_soso, date, content))
//            dismiss()
//        }
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
}