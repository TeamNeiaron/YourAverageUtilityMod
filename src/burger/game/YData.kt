package burger.game

import burger.ui.dialogs.*

object YData{
    lateinit var ai: AISwitcherDialog
    
    fun load(){
        ai = AISwitcherDialog()
        
        Events.run(Trigger.update){
            if(ai.active){
                Core.camera.position.set(Vars.player.unit().x, Vars.player.unit().y)
            }
        }
    }
}
