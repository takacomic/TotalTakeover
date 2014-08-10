package com.takacomic.totaltakeover.init;

import com.takacomic.totaltakeover.item.ItemDiarinIngot;
import com.takacomic.totaltakeover.item.ItemTT;
import com.takacomic.totaltakeover.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTT diarinIngot = new ItemDiarinIngot();

    public static void init()
    {
       GameRegistry.registerItem(diarinIngot, "diarinIngot");
    }
}
