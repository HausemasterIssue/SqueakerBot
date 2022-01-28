package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.command.Command;
import net.minecraft.network.play.client.CPacketChatMessage;

public class Help extends Command {
	
	public Help() {
		super("Help", new String[] {"Help", "Commands"});
	}
	
	@Override
	public void onRun() {
		mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Commands (3): Help, CoinFlip, AskGod"));
	}

}
