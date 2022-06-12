package burger.game

import arc.*
import arc.graphics.*
import arc.graphics.g2d.*
import mindustry.gen.*
import mindustry.game.EventType.Trigger
import mindustry.graphics.Layer

object Healthbars{
    var shown = true
    
    fun load(){
        Events.run(Trigger.draw){
            if(shown){
                Groups.unit.each(){
                    var u = it
                    
                    if(u.health <= 0f){} else {
                        Draw.z(Layer.end)
                        Draw.color(Color.valueOf("ffaf00"))
                        Lines.stroke(3f)
                        Lines.line(u.x - u.hitSize, u.y - u.hitSize, u.x - u.hitSize + u.healthf() * u.hitSize * 2f, u.y - u.hitSize)
                    }
                    
                    if(u.shield <= 0f){} else {
                        Draw.z(Layer.end)
                        Draw.color(Color.cyan)
                        Lines.line(u.x - u.hitSize, u.y - u.hitSize - 5f, u.x - u.hitSize + u.shield / u.maxHealth * u.hitSize * 2f, u.y - u.hitSize - 5f)
                    }
                }
            }
            
            Draw.color()
            Lines.stroke(1f)
        }
    }
}
