package name.bagi.levente.glabrion01.main.screen.general

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import org.koin.android.ext.android.inject
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.common.toast
import name.bagi.levente.glabrion01.base.view.BaseFragment
import name.bagi.levente.glabrion01.main.screen.newScreen.SecondFragment

class GeneralFragment : BaseFragment(), GeneralContractInterface.View {

    private val generalPresenter: GeneralContractInterface.Presenter by inject()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        generalPresenter.attach(this)

        val view = inflater.inflate(R.layout.fragment_general, container, false)
        val btn = view.findViewById<View>(R.id.open_new_fragment) as Button

        btn.setOnClickListener {
            val fragment = SecondFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.main_fragment_container, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }

    override fun showError() {
        toast("Ошибка загрузки данных")
    }

    override fun showContent() {

    }

}