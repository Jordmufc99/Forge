package com.jordmufc99.abhorsen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {

    public static final String MODID = "abhorsen";
    public static final String MODNAME = "Abhorsen Mod";
    public static final String VERSION = "1.0.0";
        
    @Instance
    public static Main instance = new Main();
        
    @SidedProxy(clientSide="com.jordmufc99.abhorsen.ClientProxy", serverSide="com.jordmufc99.abhorsen.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	proxy.preInit(e);         
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	proxy.init(e); 
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
