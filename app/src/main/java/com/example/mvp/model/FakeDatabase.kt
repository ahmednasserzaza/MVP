package com.example.mvp.model

import com.example.mvp.model.domain.User

class FakeDatabase {
    fun getCurrentUser():User{
        return User("Ahmed Nasser" , 1998)
    }
}