package com.cg;

import java.util.Scanner;

public class Match {
	private String country;
	private String captain;
	private int noMatchesPlayed;
	
	
	
	
	public Match(String country, String captain, int noMatchesPlayed) {
		super();
		this.country = country;
		this.captain = captain;
		this.noMatchesPlayed = noMatchesPlayed;
	}
	
	

	@Override
	public String toString() {
		return " country=" + country + ", captain=" + captain + ", noMatchesPlayed=" + noMatchesPlayed + "]";
	}
	
	
	
	

}
