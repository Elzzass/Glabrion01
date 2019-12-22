package name.bagi.levente.glabrion01.main.screen.newScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.base.view.BaseFragment
import name.bagi.levente.glabrion01.main.screen.general.GeneralContractInterface

class EditTextFragment : BaseFragment(), GeneralContractInterface.View {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_edit, container, false)

        return view
    }

    override fun showContent() {
    }

    override fun showError() {
    }
}