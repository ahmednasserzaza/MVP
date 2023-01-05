package com.example.mvp.model.repository

import com.example.mvp.model.FakeApiService
import com.example.mvp.model.FakeDatabase

class Repository {

    private val api = FakeApiService()
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getCurrentUser()
    fun getRandomWisdom() = api.getRandomWisdom()
}