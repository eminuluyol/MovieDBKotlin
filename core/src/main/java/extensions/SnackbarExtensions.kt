package extensions

import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.view.View

fun View.snack(@StringRes messageRes: Int, length: Int = Snackbar.LENGTH_LONG, f: (Snackbar.() -> Unit)? = null) {
  snack(resources.getString(messageRes), length, f)
}

fun View.snack(message: String, length: Int = Snackbar.LENGTH_LONG, f: (Snackbar.() -> Unit)? = null) {
  val snack = Snackbar.make(this, message, length)
  f?.let { snack.f() }
  snack.show()
}

fun Snackbar.action(@StringRes actionRes: Int, color: Int? = null, listener: (View) -> Unit) {
  action(view.resources.getString(actionRes), color, listener)
}

fun Snackbar.action(action: String, color: Int? = null, listener: (View) -> Unit) {
  setAction(action, listener)
  color?.let { setActionTextColor(color) }
}
