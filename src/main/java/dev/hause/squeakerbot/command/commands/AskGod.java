package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import net.minecraft.network.play.client.CPacketChatMessage;

public class AskGod extends Command {
	
	public AskGod() {
		super("AskGod", new String[] {"AskGod", "Ask"});
	}
	
	@Override
	public void onRun() {
		Random random = new Random();
		int randomNum = random.nextInt((15 - 0) + 1) + 0;
		if(randomNum == 0) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] It is certain."));
		} else if (randomNum == 1) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] My sources say no."));
		} else if (randomNum == 2) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Absolutley."));
		} else if (randomNum == 3) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Never."));
		} else if (randomNum == 4) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Perhaps."));
		} else if (randomNum == 5) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Reply hazy. Ask again later."));
		} else if (randomNum == 6) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Based off your tone, no."));
		} else if (randomNum == 7) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] In the future, yes."));
		} else if (randomNum == 8) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Better not tell you now."));
		} else if (randomNum == 9) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] It is highly unlikely."));
		} else if (randomNum == 10) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Do not ask that question ever again."));
		} else if (randomNum == 11) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Yes."));
		} else if (randomNum == 12) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] Not in a trillion years."));
		} else if (randomNum == 13) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] I do not know."));
		} else if (randomNum == 14) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] For sure."));
		} else if (randomNum == 15) {
			mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] No."));
		}
	}

}
