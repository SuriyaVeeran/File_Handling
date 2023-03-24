package com.imageConversion;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Image_Conversion {

	public static void from_url_to_OtherFiles() {

		try {

			
			File f = new File("C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\Google.png");

			BufferedImage ref = ImageIO.read(f);

			ImageIO.write(ref, "jpg",
					new File(".\\Images\\googlepic.jpg"));

			System.out.println("done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		from_url_to_OtherFiles();

	}

}
