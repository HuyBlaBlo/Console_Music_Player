package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) {
		String filePath = "src/audio/Saddled-up-at-dawn-Patrick-Jordan-Patrikios.wav";
		File file = new File(filePath);
		
		try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			System.out.println("No problem");
		}catch(FileNotFoundException e) {
			System.out.println("could not locate file ");
		}catch (IOException e) {
			System.out.println("something went wrong!");
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Audio file is not supported");
		} catch (LineUnavailableException e) {
			System.out.println("Unable to access audio resource");
		}
	}
}
