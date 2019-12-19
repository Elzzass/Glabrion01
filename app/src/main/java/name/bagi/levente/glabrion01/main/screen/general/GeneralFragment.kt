package name.bagi.levente.glabrion01.main.screen.general

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.android.ext.android.inject
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.common.toast
import name.bagi.levente.glabrion01.base.view.BaseFragment

class GeneralFragment : BaseFragment(), GeneralContractInterface.View {

    private val generalPresenter: GeneralContractInterface.Presenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        generalPresenter.attach(this)

        val view = inflater.inflate(R.layout.fragment_general, container, false)

        return view
    }

    override fun showError() {
        toast("Ошибка загрузки данных")
    }

    override fun showContent() {

    }

}