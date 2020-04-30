package com.tarmsbd.schoolofthought.codered.app.data.viewmodel

import androidx.lifecycle.ViewModel
import com.tarmsbd.schoolofthought.codered.app.data.repository.QuesRepository

class QuesViewModel : ViewModel() {
    var getQuestions = QuesRepository.getQuestion

    fun btnYesClick(position: Int) {
        QuesRepository.updateQuesAns(position, "Yes")
    }

    fun btnNoClick(position: Int) {
        QuesRepository.updateQuesAns(position, "No")
    }

    fun setPreviousQues(position: Int) {
        QuesRepository.setPreviousQues(position)
    }
}