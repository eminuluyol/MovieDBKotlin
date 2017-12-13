package extensions

import android.view.animation.Animation

fun Animation.setAnimationListener(
    onAnimationStart: ((anim: Animation) -> Unit)? = null,
    onAnimationRepeat: ((anim: Animation) -> Unit)? = null,
    onAnimationEnd: ((anim: Animation) -> Unit)? = null) {

  this.setAnimationListener(object: Animation.AnimationListener {
    override fun onAnimationRepeat(animation: Animation) {
      onAnimationRepeat?.invoke(animation)
    }

    override fun onAnimationStart(animation: Animation) {
      onAnimationStart?.invoke(animation)
    }

    override fun onAnimationEnd(animation: Animation) {
      onAnimationEnd?.invoke(animation)
    }
  })
}
