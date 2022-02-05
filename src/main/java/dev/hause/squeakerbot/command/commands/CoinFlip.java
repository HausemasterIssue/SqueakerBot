package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

@Command.Register(name = "CoinFlip", aliases = {"Coin", "Flip", "Tails", "Heads"})
public class CoinFlip extends Command {
	
	private static String[] outcomes = {"The coin flip results in Heads!", "The coin flip results in Tails!"};
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage(outcomes[random.nextInt(2)]);
	}
	

}
