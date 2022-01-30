package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

public class Help extends Command {
	
	public Help() {
		super("Help", new String[] {"Help", "Commands"});
	}
	
	@Override
	public void onRun() {
		ChatUtil.sendChatMessage("> [SqueakerBot] Commands (4): Help, CoinFlip, AskGod, TallyHall");
	}

}
