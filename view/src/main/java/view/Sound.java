package view;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public Sound(){
		File Clap = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\Rockstar.wav");
		PlaySound(Clap);

		
	
	
	}
	
	
	public static void Rockstar(){
		File rockstar = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\Rockstar.wav");
		PlaySound(rockstar);

	}
	
	public static void Changes() {
		File changes = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\Changes.wav");
		PlaySound(changes);
		
	}
	
	
	public static void Rosanna() {
		File stressed = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\Rosanna.wav");
		PlaySound(stressed);
		
	}
	
	
	public static void LoranDead() {
		File lordead = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\LoranDead.wav");
		PlaySound(lordead);
		
	}
	
	public static void LoranShoot() {
		File lorshoot = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\LoranShoot.wav");
		PlaySound(lorshoot);
		
	}
	
	public static void MonsterDead() {
		File monsdead = new File("E:\\ASPIRE V NITRO\\ASPIREVNITRO\\view\\Music\\MonsterDead.wav");
		PlaySound(monsdead);
		
	}

	
	
	
	
	
	static void PlaySound(File Sound){
		
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			
		}catch(Exception e){
			
		}
	}
}
