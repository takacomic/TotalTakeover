package com.takacomic.totaltakeover.creativetab;

import com.takacomic.totaltakeover.init.ModItems;
import com.takacomic.totaltakeover.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class creativetabTT
{
    public static final CreativeTabs TT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
       @Override
        public Item getTabIconItem()
        {
            return ModItems.diarinIngot;
        }
    };

    public static final CreativeTabs TT_TAB2 = new CreativeTabs(Reference.MOD_ID.toLowerCase() + "2")
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.diarinIngot;
        }
    };
}
