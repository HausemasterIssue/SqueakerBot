package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

public class AskGod extends Command {
	
	private static String[] replies = {"> [SqueakerBot] It is certain.", "> [SqueakerBot] My sources say no.", "> [SqueakerBot] Absolutley.",
			"> [SqueakerBot] Never.", "> [SqueakerBot] Perhaps.", "> [SqueakerBot] Reply hazy. Ask again later.", "> [SqueakerBot] Based off your tone, no.",
			"> [SqueakerBot] In the future, yes.", "> [SqueakerBot] Better not tell you now.", "> [SqueakerBot] It is highly unlikely.",
			"> [SqueakerBot] Do not ask that question ever again.", "> [SqueakerBot] Yes.", "> [SqueakerBot] Not in a trillion years.", "> [SqueakerBot] I do not know.",
			"> [SqueakerBot] For sure.", "> [SqueakerBot] No."};
																																		
	
	public AskGod() {
		super("AskGod", new String[] {"AskGod", "Ask"});
	}
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage((replies[random.nextInt(14)]));
	}

}
