package com.reindeer.robotgame;

import com.reindeer.framework.Image;
import com.reindeer.framework.Music;
import com.reindeer.framework.Sound;

public class Assets {
	
	public static Image menu, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
	public static Image tiledirt, spikes, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
	public static Image button;
	public static Sound click;
	public static Music theme;
	
	public static void load(SampleGame sampleGame) {
		// TODO Auto-generated method stub
		theme = sampleGame.getAudio().createMusic("menutheme.mp3");
		theme.setLooping(true);
		theme.setVolume(0.85f);
		theme.play();
	}
	
}
