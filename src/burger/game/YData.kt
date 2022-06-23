package burger.game

import arc.*
import mindustry.*
import mindustry.game.EventType.*
import burger.ui.dialogs.*

object YData{
    lateinit var ai: AISwitcherDialog
    lateinit var timeControl: TimeControlDialog
    
    fun load(){
        ai = AISwitcherDialog()
        timeControl = TimeControlDialog()
        
        Events.run(Trigger.update){
            if(ai.active){
                Core.camera.position.set(Vars.player.unit().x, Vars.player.unit().y)
            }
        }
    }
}
