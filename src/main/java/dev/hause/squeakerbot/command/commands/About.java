package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.SqueakerBot;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

@Command.Register(name = "About", aliases = {"About", "Credits"})
public class About extends Command {
	
	@Override
	public void onRun() {
		ChatUtil.sendChatMessage("SqueakerBot " + SqueakerBot.VERSION + " by HausemasterIssue. GitHub: https://github.com/HausemasterIssue/SqueakerBot.");
	}

}
