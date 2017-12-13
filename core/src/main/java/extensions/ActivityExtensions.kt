package extensions

import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentTransaction

inline fun FragmentActivity.fragmentTransaction(func: FragmentTransaction.() -> Unit) {
  val ft = supportFragmentManager.beginTransaction()
  ft.func()
  ft.commit()
}
