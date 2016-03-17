package dev.bt52.rpg.assets;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageGetter {
	
	public static BufferedImage getImage(String path) {
		
		try {
			
			return ImageIO.read(ImageGetter.class.getResource(path));
			
		} catch(IOException e) {
			
			e.printStackTrace();
			System.exit(1);
			
		}
		
		return null;
		
	}
	
}
