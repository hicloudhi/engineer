package com.example.engineer.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.engineer.MainActivity
import com.example.engineer.R

class EvaluationFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.nav_fragment_evaluation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTitle("평가조회")
    }

    fun setTitle(title: String){
        //툴바 타이틀 설정
        val mMainactivity = activity as MainActivity
        mMainactivity.setTitle(title)
    }
}