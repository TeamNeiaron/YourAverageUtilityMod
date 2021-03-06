package burger.ui

import arc.scene.ui.layout.*
import mindustry.Vars
import mindustry.ui.Styles
import mindustry.gen.Icon

import burger.ui.dialogs.*
import burger.game.*

object UtilityTable{
    var tpos = Vars.ui.hudGroup.find<Table>("minimap/position")
    
    fun load(){
        tpos.row()
        
        tpos.table{ s: Table ->

            s.name = "utilitytable"
            
            s.setBackground(Styles.none)
            s.button(Icon.unitsSmall){
                YData.ai.show()
            }.size(45f, 45f)
            
            s.button(Icon.unitsSmall){
                Healthbars.shown = !Healthbars.shown
            }.size(45f, 45f)
            
            s.button(Icon.productionSmall){
                FactoryProgressBars.shown = !FactoryProgressBars.shown
            }.size(45f, 45f).row()
            
            s.button(Icon.pencil){
                YData.timeControl.show()
            }
        }.size(130f, 240f).row()
    }
}
