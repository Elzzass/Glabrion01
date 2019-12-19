package name.bagi.levente.glabrion01

import android.app.Application
import org.koin.core.context.startKoin
import name.bagi.levente.glabrion01.common.mainModule

open class AppApplication() : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(mainModule(applicationContext))
        }

    }
}