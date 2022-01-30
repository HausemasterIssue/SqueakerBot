package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.listener.ChatListener;

public class Toggle extends Command {
	
	public Toggle() {
		super("Toggle", new String[] {"Enable", "Disable"});
	}
	
	@Override
	public void onRun() {
		if(ChatListener.isToggled) {
			ChatListener.isToggled = false;
		} else {
			ChatListener.isToggled = true;
		}
	}

}
