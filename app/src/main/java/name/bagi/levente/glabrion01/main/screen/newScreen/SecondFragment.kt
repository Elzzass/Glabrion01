package name.bagi.levente.glabrion01.main.screen.newScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.base.view.BaseFragment
import name.bagi.levente.glabrion01.main.screen.general.GeneralContractInterface
import org.koin.android.ext.android.inject

class SecondFragment : BaseFragment(),
    GeneralContractInterface.View {
    private val generalPresenter: GeneralContractInterface.Presenter by inject()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        generalPresenter.attach(this)

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        return view
    }
    override fun showContent() {
    }

    override fun showError() {
    }
}