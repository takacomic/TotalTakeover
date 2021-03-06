package com.takacomic.totaltakeover;


import com.takacomic.totaltakeover.init.ModItems;
import com.takacomic.totaltakeover.proxy.IProxy;
import com.takacomic.totaltakeover.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class TotalTakeover
{
    @Mod.Instance(Reference.MOD_ID)
    public static TotalTakeover instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENTPROXY, serverSide = Reference.MOD_SERVERPROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
