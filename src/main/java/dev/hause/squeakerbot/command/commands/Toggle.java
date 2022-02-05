package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.listener.ChatListener;

@Command.Register(name = "Toggle", aliases = {"Enable", "Disable"})
public class Toggle extends Command {
	
	@Override
	public void onRun() {
		if(ChatListener.isToggled) {
			ChatListener.isToggled = false;
		} else {
			ChatListener.isToggled = true;
		}
	}

}
