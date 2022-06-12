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
    
    lateinit var ai: BaseDialog
    
    init{
        Events.on(ClientLoadEvent::class.java){
            ai = AISwitcherDialog()
            UtilityTable.load()
            Healthbars.load()
            FactoryProgressBars.load()
        }
        Events.run(Trigger.update){
            if(ai.active){
                Core.camera.position.set(Vars.player.unit().x, Vars.player.unit().y)
            }
        }
    }

    override fun loadContent(){
        Log.info("Loading some example content.")
    }
}
