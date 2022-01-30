package dev.hause.squeakerbot.command;

import java.util.ArrayList;
import dev.hause.squeakerbot.command.commands.*;

public class CommandManager {
	
	public static ArrayList<Command> commands = new ArrayList<>();
	
	public void registerCommands() {
		commands.add(new Help());
		commands.add(new CoinFlip());
		commands.add(new AskGod());
		commands.add(new TallyHall());
		commands.add(new Toggle());
	}

}
