package com.example.guru2_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

// 리스트뷰와 연결하기위해 어댑터 생성
class DiaryAdapter (val context: Context, val DiaryList: ArrayList<Diary>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.diary_list_item, null)

        val mood = view.findViewById<ImageView>(R.id.mood_img)
        val date = view.findViewById<TextView>(R.id.date)
        val text = view.findViewById<TextView>(R.id.tv_text)

        val diary = DiaryList[position]         // position 0부터 시작

        mood.setImageResource(diary.mood)
        date.text = diary.date
        text.text = diary.text

        return view
    }

    override fun getItem(position: Int): Any {
        return DiaryList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return DiaryList.size
    }

}