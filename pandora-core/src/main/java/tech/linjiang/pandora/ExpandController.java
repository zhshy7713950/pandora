package tech.linjiang.pandora;

import java.util.ArrayList;
import java.util.List;

import tech.linjiang.pandora.expand.ExpandItem;
import tech.linjiang.pandora.expand.ExpandType;

public class ExpandController {

    private final List<ExpandItem> expandItemList = new ArrayList<>();

    public void addExpandItem(ExpandItem expandItem){
        if(!expandItemList.contains(expandItem)){
            expandItemList.add(expandItem);
        }
    }

    public List<ExpandItem> getExpandItem(ExpandType expandType){
        List<ExpandItem> expandList = new ArrayList<>();
        for (ExpandItem expandItem : expandItemList) {
            if(expandItem.getExpandType() == expandType){
                expandList.add(expandItem);
            }
        }
        return expandList;
    }
}
