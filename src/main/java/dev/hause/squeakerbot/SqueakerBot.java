package dev.hause.squeakerbot;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dev.hause.squeakerbot.command.CommandManager;
import dev.hause.squeakerbot.listener.ChatListener;

@Mod(modid = SqueakerBot.MODID, name = SqueakerBot.NAME, version = SqueakerBot.VERSION)
public class SqueakerBot
{
    public static final String MODID = "squeakerbot";
    public static final String NAME = "SqueakerBot";
    public static final String VERSION = "b2";
    public static CommandManager cm = new CommandManager();
    public static Logger LOGGER = LogManager.getLogger("SqueakerBot");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	LOGGER.info("Initializing SqueakerBot...");
    	MinecraftForge.EVENT_BUS.register(new ChatListener());
    	LOGGER.info("Initializing Commands...");
    	cm.registerCommands();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	LOGGER.info("SqueakerBot successfully initialized!");
    	LOGGER.info("the bidding by tally hall is a good song, go listen to it - hause");
    }
}
