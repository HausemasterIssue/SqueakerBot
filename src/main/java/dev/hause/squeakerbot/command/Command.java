package dev.hause.squeakerbot.command;

import net.minecraft.client.Minecraft;

public class Command {
	
	String command;
	String[] aliases;
	public Minecraft mc = Minecraft.getMinecraft();
	
	public Command(String command, String[] aliases) {
		this.command = command;
		this.aliases = aliases;
	}
	
	public void onRun() {
		
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String[] getAliases() {
		return aliases;
	}

	public void setAliases(String[] aliases) {
		this.aliases = aliases;
	}
	
	

}
