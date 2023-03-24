package com.fileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Create_File {

	public static final String path = "C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\NewFiles\\";

	public static void using_File(String file) {

		File f = new File(path + file);

		try {

			boolean flag = f.createNewFile();

			if (flag) {

				System.out.println("file is created");

			}

			else {

				System.out.println("file is already present");

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void using_Scanner_And_OutputStream() {
		try {
			Scanner s = new Scanner(System.in);

			System.out.println("*** Enter the location **** ");

			String location = s.nextLine();

			FileOutputStream fos = new FileOutputStream(location);

			System.out.println("Enter the file content ");

			boolean flag = true;

			while (flag) {

				String content = s.nextLine();

				if (content.equalsIgnoreCase("break")) {

					flag = false;
				}

				byte[] bytes = content.getBytes();

				fos.write(bytes);

			}

			fos.close();

			s.close();

			System.out.println("file is saved");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void using_Java_Nio(String filelocation) {

		try {
			Path path = Paths.get(filelocation);
			Path location = Files.createFile(path);

			System.out.println("file location : " + location);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// using_File("Dummy1.txt");

		// using_Scanner_And_OutputStream();

		using_Java_Nio("C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\NewFiles\\nioFile.txt");

	}

}
