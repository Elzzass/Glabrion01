package name.bagi.levente.glabrion01.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.base.view.BaseActivity
import name.bagi.levente.glabrion01.common.ProgressManager
import name.bagi.levente.glabrion01.common.gone
import name.bagi.levente.glabrion01.common.visible
import name.bagi.levente.glabrion01.main.screen.general.GeneralFragment
import name.bagi.levente.glabrion01.main.screen.newScreen.EditTextFragment
import name.bagi.levente.glabrion01.main.screen.newScreen.SecondFragment

class MainActivity : BaseActivity(), ProgressManager {

    private val generalFragment = GeneralFragment()
    override val layoutResId: Int
        get() = R.layout.activity_main

    override fun init(state: Bundle?) {
        supportFragmentManager.beginTransaction().add(
            R.id.main_fragment_container,
            generalFragment
        ).commit()
    }

    fun openCleanScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_container, SecondFragment())
            .addToBackStack(null)
            .commit()
    }

    fun openEditTextScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_container, EditTextFragment())
            .addToBackStack(null)
            .commit()
    }

    override fun showProgress() {
        main_progress.visible()
    }

    override fun hideProgress() {
        main_progress.gone()
    }

}