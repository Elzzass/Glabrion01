package name.bagi.levente.glabrion01.base.presenter

import name.bagi.levente.glabrion01.base.view.BaseViewInterface

interface BasePresenterInterface<V: BaseViewInterface> {

    val isAttached: Boolean

    fun attach(view: V)

    fun detach()

}