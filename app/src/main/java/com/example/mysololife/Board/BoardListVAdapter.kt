package com.example.mysololife.Board

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.mysololife.R

class BoardListVAdapter(val boardList : MutableList<BoardModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return boardList.size
    }

    override fun getItem(position: Int): Any {
        return boardList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, converview: View?, parent: ViewGroup?): View {

        var view = converview

        if (view == null){

            view = LayoutInflater.from(parent?.context).inflate(R.layout.board_list_item, parent, false)

        }

        return view!!
    }
}