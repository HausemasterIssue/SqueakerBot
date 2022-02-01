package dev.hause.squeakerbot.listener;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.commons.lang3.StringUtils;

import dev.hause.squeakerbot.SqueakerBot;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.command.CommandManager;
import dev.hause.squeakerbot.util.QueryUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatListener {
	
	Minecraft mc = Minecraft.getMinecraft();
	public static boolean isToggled = false;
	public static String parsedCommand;
	private static QueryUtil queryUtil = new QueryUtil();
	
	@SubscribeEvent
	public void onChat(ClientChatReceivedEvent event) {
		String rawCommand = event.getMessage().getUnformattedText();
		int parseIndex = rawCommand.indexOf(">") + 1;
		parsedCommand = rawCommand.substring(parseIndex).trim();
		if(parsedCommand.startsWith("~")) {
			calcCommand(parsedCommand);
		}
	}
	
	public void calcCommand(String input) {
		if(StringUtils.containsIgnoreCase(input, "toggle")) {
			if(!isAdmin(input)) {
				return;
			}
		}
		
		if(!StringUtils.containsIgnoreCase(input, "toggle") && isToggled) {
			return;
		}
		
		Random random = new Random();
		int waitTime = random.nextInt(3000);
		for(Command c : CommandManager.commands) {
			if(StringUtils.containsIgnoreCase(input, c.getCommand())) {
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
				  @Override
				  public void run() {
					  c.onRun();
					  
				  }
				}, waitTime);
				break;
			}
		}
	}
	
	public boolean isAdmin(String command) {
		if(command.indexOf("HausemasterIssue") == 1) {
			return true;
		}
		return false;
	}

}
