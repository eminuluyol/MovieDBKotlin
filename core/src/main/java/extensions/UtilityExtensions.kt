package extensions

import com.taurus.core.BuildConfig

inline fun debug(body: () -> Unit) {
  if (BuildConfig.DEBUG) body()
}