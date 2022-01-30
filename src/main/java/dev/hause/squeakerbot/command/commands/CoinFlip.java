package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

public class CoinFlip extends Command {
	
	private static String[] outcomes = {"The coin flip results in Heads!", "The coin flip results in Tails!"};
	
	public CoinFlip() {
		super("CoinFlip", new String[] {"CoinFlip", "Coin", "Flip"});
	}
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage("> [SqueakerBot] " + outcomes[random.nextInt(2)]);
	}
	

}
