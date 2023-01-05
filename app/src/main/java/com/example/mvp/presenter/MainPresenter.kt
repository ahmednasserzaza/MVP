package com.example.mvp.presenter

import com.example.mvp.model.FakeApiService
import com.example.mvp.model.FakeDatabase
import com.example.mvp.ui.IMainView

class MainPresenter {

    private val api = FakeApiService()
    private val database = FakeDatabase()
    lateinit var view : IMainView

    fun getUserInfo() {
        val result = database.getCurrentUser()
        view.onUserInfoSuccess(result)
    }

    fun getAWisdom(){
        val result = api.getRandomWisdom()
        view.onWisdomSuccess(result)
    }

}