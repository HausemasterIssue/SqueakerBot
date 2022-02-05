package dev.hause.squeakerbot.util;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.CPacketChatMessage;

public class ChatUtil {
	
	static Minecraft mc = Minecraft.getMinecraft();
	
	public static void sendChatMessage(String message) {
		mc.player.connection.sendPacket(new CPacketChatMessage("> [SqueakerBot] " + message));
	}

}
