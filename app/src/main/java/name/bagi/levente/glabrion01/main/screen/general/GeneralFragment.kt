package name.bagi.levente.glabrion01.main.screen.general

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_general.view.*
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.base.view.BaseFragment
import name.bagi.levente.glabrion01.common.toast
import name.bagi.levente.glabrion01.main.MainActivity
import org.koin.android.ext.android.inject


class GeneralFragment : BaseFragment(), GeneralContractInterface.View {

    private val generalPresenter: GeneralContractInterface.Presenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        generalPresenter.attach(this)

        val view = inflater.inflate(R.layout.fragment_general, container, false)
        view?.open_new_fragment?.setOnClickListener {
            (activity as? MainActivity)?.openCleanScreen()
        }
        return view
    }

    override fun showError() {
        toast("Ошибка загрузки данных")
    }

    override fun showContent() {

    }

}