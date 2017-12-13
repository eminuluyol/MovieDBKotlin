package extensions

import android.content.SharedPreferences

inline fun SharedPreferences.edit(func: SharedPreferences.Editor.() -> Unit) {
  val editor = edit()
  editor.func()
  editor.apply()
}

fun SharedPreferences.Editor.put(pair: Pair<String, Any>) {
  val key = pair.first
  val value = pair.second
  when(value) {
    is String -> putString(key, value)
    is Int -> putInt(key, value)
    is Boolean -> putBoolean(key, value)
    is Long -> putLong(key, value)
    is Float -> putFloat(key, value)
    else -> error("Only primitive types can be stored in SharedPreferences")
  }
}
