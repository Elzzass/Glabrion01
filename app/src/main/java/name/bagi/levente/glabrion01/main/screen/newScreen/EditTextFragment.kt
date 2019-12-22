package name.bagi.levente.glabrion01.main.screen.newScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_edit.view.*
import name.bagi.levente.glabrion01.R
import name.bagi.levente.glabrion01.base.view.BaseFragment
import name.bagi.levente.glabrion01.main.screen.general.GeneralContractInterface
import java.nio.file.Files.find


class EditTextFragment : BaseFragment(), GeneralContractInterface.View {
    private val STATE_EDIT_TEXT = "saveEditText"
    private var editText: TextView? = null
    private var saveEditText = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (savedInstanceState != null) {
            saveEditText = savedInstanceState.getString(STATE_EDIT_TEXT, "")
            editText = view?.findViewById(R.id.edit_text)
            editText?.setText(saveEditText)
        }
        val view = inflater.inflate(R.layout.fragment_edit, container, false)

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_EDIT_TEXT, saveEditText)
    }




    override fun showContent() {
    }

    override fun showError() {
    }
}