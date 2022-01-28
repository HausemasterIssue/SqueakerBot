package dev.hause.squeakerbot.listener;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.commons.lang3.StringUtils;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.command.CommandManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatListener {
	
	Minecraft mc = Minecraft.getMinecraft();
	
	@SubscribeEvent
	public void onChat(ClientChatReceivedEvent event) {
		String command = event.getMessage().getUnformattedText();
		if(command.contains("~")) {
			calcCommand(command);
		}
	}
	
	public void calcCommand(String input) {
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
				
			}
		}
	}

}
