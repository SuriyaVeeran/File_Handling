package com.fileWrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_Operations {

	public static final String location = ".//File_Handling//NewFiles//Write.txt";

	public static void write_Data() {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(location);
			fos.write(1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
