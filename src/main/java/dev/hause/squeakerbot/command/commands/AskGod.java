package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

@Command.Register(name = "AskGod", aliases = {"AskGod", "Ask", "God"})
public class AskGod extends Command {
	
	private static String[] replies = {"It is certain.", "My sources say no.", "Absolutley.",
			"Never.", "Perhaps.", "Reply hazy. Ask again later.", "Based off your tone, no.",
			"In the future, yes.", "Better not tell you now.", "It is highly unlikely.",
			"Do not ask that question ever again.", "Yes.", "Not in a trillion years.", "I do not know.",
			"For sure.", "No."};
																																		
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage("> [SqueakerBot] " + (replies[random.nextInt(14)]));
	}

}
