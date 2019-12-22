package name.bagi.levente.glabrion01.common

import android.content.Context
import org.koin.dsl.module
import name.bagi.levente.glabrion01.main.screen.general.GeneralContractInterface
import name.bagi.levente.glabrion01.main.screen.general.GeneralPresenter

fun mainModule(context: Context) = module {

    single <GeneralContractInterface.Presenter> { GeneralPresenter() }

}