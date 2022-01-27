package tech.linjiang.pandora

import tech.linjiang.pandora.expand.ExpandItem
import tech.linjiang.pandora.expand.ExpandType

class ExpandController {

    private val expandItemList = mutableListOf<ExpandItem>()

    fun addExpandItem(expandItem: ExpandItem){
        if(!expandItemList.contains(expandItem)){
            expandItemList.add(expandItem)
        }
    }

    fun getExpandItem(expandType: ExpandType):List<ExpandItem>{
        val expandList = mutableListOf<ExpandItem>()
        expandItemList.forEach {
            if(it.expandType == expandType){
                expandList.add(it)
            }
        }
        return expandList
    }
}