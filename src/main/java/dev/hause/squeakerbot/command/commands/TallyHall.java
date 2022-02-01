package dev.hause.squeakerbot.command.commands;

import java.util.Random;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;

@Command.Register(name = "TallyHall", aliases = {"Based", "Music", "Songs", "TheHall", "Hall", "Tally"})
public class TallyHall extends Command {
	
	private static String[] links = {"https://www.youtube.com/watch?v=ipYafcHd0jA", "https://www.youtube.com/watch?v=I8sUC-dsW8A",
			"https://www.youtube.com/watch?v=A-ZUo62N7Kc", "https://www.youtube.com/watch?v=-krA-ubCQqg", "https://www.youtube.com/watch?v=TIt4i8AmryQ",
			"https://www.youtube.com/watch?v=HnwemKW9H3s", "https://www.youtube.com/watch?v=xLirITfSCVY", "https://www.youtube.com/watch?v=Q-4IXcKkK1U",
			"https://www.youtube.com/watch?v=nHjaNDGgYEA", "https://www.youtube.com/watch?v=KrXJu-6ZcAQ", "https://www.youtube.com/watch?v=OFi8748c9Ew",
			"https://www.youtube.com/watch?v=1RliQKR6jXM", "https://www.youtube.com/watch?v=CgcTf6JYxsE", "https://www.youtube.com/watch?v=IawfoCuBV3c",
			"https://www.youtube.com/watch?v=OjGzOJ5IiSM", "https://www.youtube.com/watch?v=tRnMWzz44gA", "https://www.youtube.com/watch?v=5_QwMRE-BKc",
			"https://www.youtube.com/watch?v=7Q0ge00LmwM", "https://www.youtube.com/watch?v=rfUeWe7u364"};
	
	private static String[] applause = {"You have great music taste: ", "Here's your vibes: ", "Enjoy!: ", "Listen, you'll love it: ",
			"Your tunes, sir: ", "Tally Hall!: ", "Go that extra mile: ", "Depression is gone: ", "A gem: ", "This one's a banger",
			"Poggers song: ", "Le tunes have arrived: ", "Amazing choice: ", "Have a great day friend: ", "The Tally Hall: ", "Epic vibe: ",
			"A cool band: ", "Mega based tune: ", "Great choice!: "};
	
	@Override
	public void onRun() {
		Random random = new Random();
		ChatUtil.sendChatMessage("> [SqueakerBot] " + (applause[random.nextInt(18)]) + (links[random.nextInt(18)]));
	}

}
