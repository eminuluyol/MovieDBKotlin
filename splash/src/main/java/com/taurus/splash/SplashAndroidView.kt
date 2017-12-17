package com.taurus.splash

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.taurus.splash.SplashView.Listener

import kotlinx.android.synthetic.main.splash_screen.view.imageViewRefresh
import kotlinx.android.synthetic.main.splash_screen.view.progressBar
import kotlinx.android.synthetic.main.splash_screen.view.textViewMessage

class SplashAndroidView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr), SplashView {

  private lateinit var listener : SplashView.Listener

  override fun onFinishInflate() {
    super.onFinishInflate()
    inflate(context, R.layout.splash_screen, this)

    imageViewRefresh.setOnClickListener(RetryClickListener(listener))
  }

  override fun setListener(listener: Listener) {
    this.listener = listener
  }

  override fun showRetry() {
    imageViewRefresh.visibility = View.VISIBLE
  }

  override fun hideRetry() {
    imageViewRefresh.visibility = View.INVISIBLE
  }

  override fun showLoading() {
    progressBar.visibility = View.VISIBLE
  }

  override fun hideLoading() {
    progressBar.visibility = View.INVISIBLE
  }

  override fun showErrorMessage() {
    textViewMessage.visibility = View.VISIBLE
  }

  override fun hideErrorMessage() {
    textViewMessage.visibility = View.INVISIBLE
  }

  private class RetryClickListener(private val listener: SplashView.Listener) : OnClickListener {

    override fun onClick(p0: View?) {
      listener.onRetryClicked()
    }
  }

}