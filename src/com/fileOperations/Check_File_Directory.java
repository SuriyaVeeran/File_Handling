package com.fileOperations;

import java.io.File;

public class Check_File_Directory {

	public static final String path = "C:\\Fileoperations";

	public static void main(String[] args) {

		File f = new File(path);

		File[] listFiles = f.listFiles(); // it return the list of files

		for (File file : listFiles) {

			if (file.isFile()) {

				System.out.println("name : " + file.getName() + " Path ---> " + file.getAbsolutePath());

			}

			else if (file.isDirectory()) {

				System.out.println("name : " + file.getName() + " Path ---> " + file.getAbsolutePath());

			}

			else if (file.isHidden()) {

				System.out.println("file is hidden");

			}

			else {
				System.out.println("unknown");
			}

		}

	}

}
