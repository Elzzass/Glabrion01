package name.bagi.levente.glabrion01.common

import android.view.View
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import name.bagi.levente.glabrion01.base.view.BaseFragment

interface ProgressManager {
    fun showProgress()
    fun hideProgress()
}

fun BaseFragment.hideProgress() {
    (activity as? ProgressManager)?.hideProgress()
}

fun BaseFragment.showProgress() {
    (activity as? ProgressManager)?.showProgress()
}

fun BaseFragment.toast(msg: String) {
    activity?.apply {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

fun <T, D> T.request(
    showProgress: Boolean = true,
    onComplete: (D) -> Unit
) where T : BaseFragment, T : CoroutineScope {
    if (showProgress) {
        showProgress()
    }

}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}