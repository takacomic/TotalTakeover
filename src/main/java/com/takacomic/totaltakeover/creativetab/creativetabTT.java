package com.takacomic.totaltakeover.creativetab;

import com.takacomic.totaltakeover.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativetabTT
{
    public static final CreativeTabs TT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}
