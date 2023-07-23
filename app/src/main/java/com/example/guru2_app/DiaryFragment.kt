package com.example.guru2_app

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date


class DiaryFragment : Fragment() {

    var DiaryList = arrayListOf<Diary>(
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 그냥 그랬다"),
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 그저 그랬다"),
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 별로였다"),
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 아주 좋았다"),
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 나쁘지 않았다"),
        Diary(R.drawable.mood_soso, "2023-07-23", "오늘은 기분이 보통이었다")
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_diary, container, false)

//        val item = arrayOf("사과", "배", "딸기")
//        val listView = view?.findViewById<ListView>(R.id.listview)
//        listView?.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, item)

        val Adapter = DiaryAdapter(requireContext(),DiaryList)
        val listView = view?.findViewById<ListView>(R.id.listview)
        listView?.adapter = Adapter

        val diaryAddBtn = view.findViewById<FloatingActionButton>(R.id.diaryadd_Btn)
        diaryAddBtn.setOnClickListener {
            // add 버튼을 눌렀을 때, 일기를 입력할 수 있는 창 구현
        }

        return view
    }

}