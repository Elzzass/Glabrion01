package name.bagi.levente.glabrion01.main.screen.general

import name.bagi.levente.glabrion01.base.presenter.BasePresenterInterface
import name.bagi.levente.glabrion01.base.view.BaseViewInterface

interface GeneralContractInterface {

    interface View : BaseViewInterface {
        fun showError()
        fun showContent()
    }

    interface Presenter : BasePresenterInterface<View> {
        fun todoSome()
    }
}