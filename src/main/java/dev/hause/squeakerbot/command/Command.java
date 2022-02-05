package dev.hause.squeakerbot.command;

import java.lang.annotation.*;
import net.minecraft.client.Minecraft;

public class Command {

	public Minecraft mc = Minecraft.getMinecraft();
	
	String command = getRegister().name();
	String[] aliases = getRegister().aliases();
	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface Register {
		
		String name();
		
		String[] aliases();

	}
	
	private Register getRegister() {
		return getClass().getAnnotation(Register.class);
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
