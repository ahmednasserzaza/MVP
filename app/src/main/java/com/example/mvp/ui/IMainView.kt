package com.example.mvp.ui

import com.example.mvp.model.domain.User
import com.example.mvp.model.domain.Wisdom

interface IMainView {
    fun onUserInfoSuccess(user: User)
    fun onWisdomSuccess(wisdom: Wisdom)
}