package com.github.prinzpommes;

public class Configloader {

	private Recipe plugin;
	private static boolean netherrack;
	private static boolean netherbrick;
	private static boolean glowstone;
	private static boolean soulsand;
	private static boolean blazerod;
	
	
	
	
	public Configloader(Recipe plugin)
	
	{
		this.plugin = plugin;
		
		
		netherrack = this.plugin.getConfig().getBoolean("netherrack");
		netherbrick = this.plugin.getConfig().getBoolean("netherbrick");
		glowstone = this.plugin.getConfig ().getBoolean("glowstone");
		soulsand = this.plugin.getConfig ().getBoolean("soulsand");
		blazerod = this.plugin.getConfig ().getBoolean("blazerod");
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
}
