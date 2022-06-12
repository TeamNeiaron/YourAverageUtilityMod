package burger.game

import arc.*
import arc.graphics.*
import arc.graphics.g2d.*
import mindustry.gen.*
import mindustry.game.EventType.Trigger
import mindustry.world.blocks.production.GenericCrafter.GenericCrafterBuild
import mindustry.graphics.Layer

object FactoryProgressBars{
    var shown = false
    
    fun load(){
        Events.run(Trigger.draw){
            if(shown){
                Groups.build.each(){ building: Building ->
                    if(building is GenericCrafterBuild){
                        Draw.z(Layer.end)
                        Draw.color(Color.orange)
                        Lines.stroke(1.7f)
                        Lines.line(
                            building.x - building.block.size.toFloat() * 3f,
                            building.y + building.block.size.toFloat() * 5.5f,
                            building.x - building.block.size.toFloat() * 3f + building.progress * building.block.size.toFloat() * 6f,
                            building.y + building.block.size.toFloat() * 5.5f
                        )
                    }
                }
            }
            
            Draw.color()
            Lines.stroke(1f)
        }
    }
}
