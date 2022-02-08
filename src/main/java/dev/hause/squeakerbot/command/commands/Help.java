package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

@Command.Register(name = "Help", aliases = {"Commands"})
public class Help extends Command {
	
	@Override
	public void onRun() {
		ChatUtil.sendChatMessage("Commands (7): Help, CoinFlip, AskGod, TallyHall, About, Geolocate, GapDisease");
	}

}
