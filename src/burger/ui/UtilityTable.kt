package burger.ui

import arc.scene.ui.layout.*
import mindustry.Vars
import mindustry.ui.Styles
import mindustry.gen.Icon

import burger.ui.dialogs.*

object UtilityTable{
    var tpos = Vars.ui.hudGroup.find<Table>("minimap/position")
    var ai = AISwitcherDialog()
    
    fun load(){
        tpos.row()
        
        tpos.table{ s: Table ->

            s.name = "utilitytable"
            
            s.setBackground(Styles.none)
            s.button(Icon.unitsSmall){
                ai.show()
            }.size(45f, 45f)
            
            s.button(Icon.unitsSmall){
                Healthbars.shown = !Healthbars.shown
            }.size(45f, 45f)
            
            s.button(Icon.productionSmall){
                FactoryProgressBars.shown = !FactoryProgressBars.shown
            }.size(45f, 45f).row()
        }.size(130f, 240f).row()
    }
}
