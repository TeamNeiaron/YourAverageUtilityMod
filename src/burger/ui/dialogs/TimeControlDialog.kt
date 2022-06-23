package burger.ui.dialogs

import arc.util.*
import mindustry.ui.dialogs.*

open class TimeControlDialog : BaseDialog{
    constructor() : super("Time Control"){
        addCloseButton()
        
        cont.add("Either the slider...").row()
        cont.slider(1f, 256f, 1f){
            Time.setDeltaProvider(){it}
        }.row()
        cont.add("...or the textfield.").row()
        cont.field("1"){
            if(it.toFloatOrNull() != null){
                Time.setDeltaProvider(){it.toFloatOrNull()}
            } else {
                Time.setDeltaProvider(){1f}
            }
        }.row()
    }
}
