package base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import javax.inject.Inject

abstract class BaseFragment<VM : ViewModel> : dagger.android.support.DaggerFragment() {

  @Inject
  lateinit var viewModelFactory: ViewModelProvider.Factory

  lateinit var viewModel: VM

  abstract fun getViewModel(): Class<VM>

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModel = ViewModelProviders.of(this,viewModelFactory).get(getViewModel())
  }
}