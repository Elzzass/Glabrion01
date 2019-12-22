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

class GeneralFragment : BaseFragment(), GeneralContractInterface.View {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_general, container, false)
        view?.open_new_fragment?.setOnClickListener {
            (activity as? MainActivity)?.openCleanScreen()
        }
        view?.open_edit_fragment?.setOnClickListener {
            (activity as? MainActivity)?.openEditTextScreen()
        }
        return view
    }

    override fun showError() {
        toast("Ошибка загрузки данных")
    }

    override fun showContent() {

    }

}