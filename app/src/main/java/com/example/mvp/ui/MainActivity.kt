package com.example.mvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp.databinding.ActivityMainBinding
import com.example.mvp.model.domain.User
import com.example.mvp.model.domain.Wisdom
import com.example.mvp.presenter.MainPresenter

class MainActivity : AppCompatActivity() , IMainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup()

    }

    private fun setup() {
        presenter.view = this
        presenter.getUserInfo()
        binding.buttonFetch.setOnClickListener {
            presenter.getAWisdom()
        }
    }

    override fun onUserInfoSuccess(user: User) {
        binding.textUsername.text = user.name
    }

    override fun onWisdomSuccess(wisdom: Wisdom) {
        binding.apply {
            textDate.text = wisdom.publishDate
            textContent.text = wisdom.content
        }
    }

}