package utils

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable


open class RxAwareViewModel : ViewModel() {

  var disposables = CompositeDisposable()

  override fun onCleared() {
    super.onCleared()
    disposables.dispose()
  }
}