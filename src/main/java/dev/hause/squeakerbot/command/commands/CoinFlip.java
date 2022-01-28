package dev.hause.squeakerbot.command.commands;

import java.util.Random;

import dev.hause.squeakerbot.command.Command;
import net.minecraft.network.play.client.CPacketChatMessage;

public class CoinFlip extends Command {
	
	public CoinFlip() {
		super("CoinFlip", new String[] {"CoinFlip", "Coin", "Flip"});
	}
	
	@Override
	public void onRun() {
		Random random = new Random();
		int randomNum = random.nextInt((1 + 0) + 1) + 0;
		if(randomNum == 1) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] The coin flip results in Heads!"));
		} else if (randomNum == 0){
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] The coin flip results in Tails!"));
		}
	}
	

}
