package dev.hause.squeakerbot.command.commands;

import dev.hause.squeakerbot.SqueakerBot;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.util.ChatUtil;
import java.util.ArrayList;
import java.util.Arrays;

@Command.Register(name = "GapDisease", aliases = {"GapDis", "Gap", "Disease", "LagGap", "GapLag", "AntiGap"})
public class GapDisease extends Command {
	
	private static ArrayList<String> serverIps = new ArrayList<>(Arrays.asList("constantiam.net", "5b5t.org", "2b2t.org", "crystalpvp.cc", "us.crystalpvp.cc", "2b2tpvp.net", "2b2tpvp.org"));
	private static String[] diseaseServer = {"Expect some gapple disease while in combat and little while out of it, reccomended to use eating resync.", "Expect significant gapple disease while in combat.",
			"Expect mild to moderate gap disease in general, but somewhat more in combat.", "Expect no gap disease at all, in or out of combat.", "Expect no gap disease at all, in or out of combat.",
			"Expect virtually no gap disease at all times.", "Expect virtually no gap disease at all times."};
	
	@Override
	public void onRun() {
		String server;
		int diseaseIndex = 0;
		if(!mc.isSingleplayer()) {
			server = mc.getCurrentServerData().serverIP;
		} else {
			server = "Singleplayer";
			return;
		}
		SqueakerBot.LOGGER.info(server);
		
		for(String s : serverIps) {
			if(s.equalsIgnoreCase(server)) {
				diseaseIndex = serverIps.indexOf(s);
			}
		}
		
		ChatUtil.sendChatMessage(diseaseServer[diseaseIndex]);
		
	}
	
}
