package com.takacomic.totaltakeover.creativetab;

import com.takacomic.totaltakeover.init.ModItems;
import com.takacomic.totaltakeover.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTT
{
    public static final CreativeTabs TT_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.diarinIngot;
        }
    };
}
