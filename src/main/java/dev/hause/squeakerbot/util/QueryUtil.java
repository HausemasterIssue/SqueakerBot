package dev.hause.squeakerbot.util;

import org.apache.commons.lang3.StringUtils;
import dev.hause.squeakerbot.command.Command;
import dev.hause.squeakerbot.command.CommandManager;

public class QueryUtil {
	
	public String getQuery(String message) {
		int splitIndex = 0;
		String[] query = null;
 		for(Command c : CommandManager.commands) {
			if(StringUtils.containsIgnoreCase(message, c.getCommand())) {
				query = message.split("(?<=" + c.getCommand().toLowerCase() + ")");
				System.out.println(query[0]);
				if(query.length <= 1) {
					return null;
				}
			}
		}
		return query[1];
	}

}
