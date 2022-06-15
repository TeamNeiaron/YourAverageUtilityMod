package burger.game

import burger.ui.dialogs.*

object YData{
    lateinit var ai: AISwitcherDialog
    
    fun load(){
        ai = AISwitcherDialog()
    }
}