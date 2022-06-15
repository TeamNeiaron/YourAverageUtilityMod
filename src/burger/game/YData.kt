package burger.game

import arc.*
import mindustry.*
import mindustry.game.EventType.*
import burger.ui.dialogs.*

object YData{
    lateinit var ai: AISwitcherDialog
    
    fun load(){
        ai = AISwitcherDialog()
        
        Events.run(Trigger.update){
            if(ai.active){
                Core.camera.position.lerp(Vars.player.unit().x, Vars.player.unit().y, 0.07f)
            }
        }
    }
}
