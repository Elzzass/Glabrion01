package name.bagi.levente.glabrion01.common

import android.content.Context
import org.koin.dsl.module
import name.bagi.levente.glabrion01.main.screen.general.GeneralContractInterface
import name.bagi.levente.glabrion01.main.screen.general.GeneralPresenter
import name.bagi.levente.glabrion01.model.network.MainApiService
import name.bagi.levente.glabrion01.model.prefs.PrefsService

fun mainModule(context: Context) = module {

    single <GeneralContractInterface.Presenter> { GeneralPresenter() }

    single { PrefsService(context) }
    single { MainApiService() }
}