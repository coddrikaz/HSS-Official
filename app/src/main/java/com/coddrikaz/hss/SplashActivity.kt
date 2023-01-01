package com.coddrikaz.hss

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.airbnb.lottie.LottieAnimationView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val animationView = findViewById<LottieAnimationView>(R.id.animation_view)
        animationView.addAnimatorUpdateListener {
                animation: ValueAnimator? ->
        }
        animationView.playAnimation()

        val think = findViewById<LottieAnimationView>(R.id.think)
        think.addAnimatorUpdateListener {
                animation: ValueAnimator? ->
        }
        think.playAnimation()


        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}