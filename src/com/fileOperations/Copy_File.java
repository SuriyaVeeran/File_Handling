package com.fileOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File {

	public static final String ogFile = "C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\SampleFile\\Get_Started_With_Smallpdf.pdf";

	public static final String copyFile = "C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\SampleFile\\copy.pdf";

	public static void copyFile(String ogFile, String copyFile) {

		File source = new File(ogFile);

		File destination = new File(copyFile);

		FileInputStream fis = null;

		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(destination);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		

		// fis.read ---> return int we cannot use in while

		try {
			int i = fis.read();
			while (i != -1) {

				fos.write(i);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}

			if (fos != null) {

				try {
					fos.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {

		copyFile(ogFile, copyFile);

	}

}