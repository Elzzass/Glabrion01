package name.bagi.levente.glabrion01.common

import android.view.View

interface ProgressManager {
    fun showProgress()
    fun hideProgress()
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}