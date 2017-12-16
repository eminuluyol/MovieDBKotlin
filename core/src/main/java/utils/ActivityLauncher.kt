package utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import java.io.Serializable
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

abstract class LaunchingActivityCompanion<out A>(val arguments: A, val targetClass: KClass<out Activity>) {

  inline fun createIntent(context: Context, configuration: A.(Intent) -> Unit) =
      Intent(context, targetClass.java).apply { configuration(arguments, this) }

  inline fun start(context: Context, configuration: A.(Intent) -> Unit) =
      context.startActivity(createIntent(context, configuration))

  inline fun <T> Intent.arguments(block: A.(Intent) -> T): T = block(arguments, this)
}

@Suppress("UNCHECKED_CAST")
class IntentProperty<T : Any?>(private val key: String, private val default: T) :
    ReadWriteProperty<Intent, T> {

  init {
    require(default is Serializable || default is Parcelable)
  }

  override fun getValue(thisRef: Intent, property: KProperty<*>): T =
      thisRef.getSerializableExtra(key)?.let { it as? T } ?: default

  override fun setValue(thisRef: Intent, property: KProperty<*>, value: T) {
    when (value) {
    //have to do it like this since kotlin cant resolve the type ambiguity
      is Serializable -> thisRef.putExtra(key, value)
      is Parcelable -> thisRef.putExtra(key, value)
    }
  }
}