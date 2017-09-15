package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaterStrategyFactory {

    Map<String, ItemUpdaterStrategy> updaterMap = new HashMap<>();
    public ItemUpdaterStrategyFactory(){
        this.updaterMap.put("Aged Brie", new AgedBrieStrategy());
    }

    public ItemUpdaterStrategy getUpdater(Item item){
        return this.updaterMap.get(item.name);
    }
}
