package com.github.prinzpommes;


public class Configloader {

	private Recipe plugin;

	private static String PrivateJoinMessage;
	private static boolean netherrack;
	private static boolean netherbrick;
	private static boolean glowstone;
	private static boolean soulsand;
	private static boolean blazerod;
	private static boolean netherstar;
	private static boolean netherwartseed;


	
	
	
	
	public Configloader(Recipe Recipe)
	
	{
		this.plugin = Recipe;
		
		PrivateJoinMessage = this.plugin.getConfig().getString("message.PrivateJoinMessage");

		
		netherrack = this.plugin.getConfig().getBoolean("netherrack");
		netherbrick = this.plugin.getConfig().getBoolean("netherbrick");
		glowstone = this.plugin.getConfig ().getBoolean("glowstone");
		soulsand = this.plugin.getConfig ().getBoolean("soulsand");
		blazerod = this.plugin.getConfig ().getBoolean("blazerod");
		netherstar = this.plugin.getConfig().getBoolean("netherstar");
		netherwartseed = this.plugin.getConfig().getBoolean("netherwartseed");
	}
	
	
	
	public static boolean getnetherrack(){
		return netherrack;
	}
	public static boolean getnetherbrick(){
		return netherbrick;
	}
	public static boolean getglowstone(){
		return glowstone;
	}
	public static boolean getsoulsand(){
		return soulsand;
	}
	public static boolean getblazerod(){
		return blazerod;
	}
	public static boolean getnetherstar(){
		return netherstar;
	}
	public static boolean getnetherwartseed(){
		return netherwartseed;
	}


	public  static String getPrivatJoinMessage(){
		return PrivateJoinMessage;
	}


}
