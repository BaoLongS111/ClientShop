package com.balon.clientshop.feature.splash

import android.os.CountDownTimer
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SplashViewModel : ViewModel() {

    // 倒计时器
    private var timer: CountDownTimer? = null

    // 倒计时剩余时间
    private val _timeLeft = MutableStateFlow(0L)
    val timeLeft: StateFlow<Long> = _timeLeft.asStateFlow()

    // 是否跳转到引导界面
    private val _isNavigateToGuide = MutableStateFlow(false)
    val isNavigateToGuide: StateFlow<Boolean> = _isNavigateToGuide.asStateFlow()

    init {
        startCountTime()
    }

    private fun startCountTime() {
        timer = object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                _isNavigateToGuide.value = true
            }

            override fun onTick(p0: Long) {
                _timeLeft.value = p0 / 1000 + 1
            }

        }.start()
    }

    fun onSkipClick() {
        timer?.cancel()
        _isNavigateToGuide.value = true
    }

    override fun onCleared() {
        super.onCleared()
        timer?.cancel()
    }
}