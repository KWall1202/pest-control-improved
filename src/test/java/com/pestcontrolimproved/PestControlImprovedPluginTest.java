package com.pestcontrolimproved;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PestControlImprovedPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PestControlImprovedPlugin.class);
		RuneLite.main(args);
	}
}