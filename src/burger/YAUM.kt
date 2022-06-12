package burger

import arc.*
import arc.util.*
import mindustry.game.EventType.*
import mindustry.mod.*
import mindustry.ui.dialogs.*

import burger.ui.*
import burger.game.*

class YAUM : Mod(){

    init{
        Events.on(ClientLoadEvent::class.java){
            UtilityTable.load()
            Healthbars.load()
            FactoryProgressBars.load()
        }
    }

    override fun loadContent(){
        Log.info("Loading some example content.")
    }
}
