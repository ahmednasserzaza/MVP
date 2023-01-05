package com.example.mvp.presenter

import com.example.mvp.model.repository.Repository
import com.example.mvp.ui.IMainView

class MainPresenter {

    private val repository = Repository()
    lateinit var view : IMainView

    fun getUserInfo() {
        val result = repository.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun getAWisdom(){
        val result = repository.getRandomWisdom()
        view.onWisdomSuccess(result)
    }

}