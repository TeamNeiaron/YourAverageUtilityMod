package burger

import arc.*
import arc.util.*
import mindustry.*
import mindustry.game.EventType.*
import mindustry.mod.*
import mindustry.ui.dialogs.*

import burger.ui.*
import burger.ui.dialogs.*
import burger.game.*

class YAUM : Mod(){
    
    init{
        Events.on(ClientLoadEvent::class.java){
            YData.load()
            UtilityTable.load()
            Healthbars.load()
            FactoryProgressBars.load()
        }
    }
}
