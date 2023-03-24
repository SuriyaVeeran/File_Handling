package com.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Read_Files {

	public static final String path = "C:\\Users\\P3INW24\\eclipse-workspace\\File_Handling\\NewFiles\\Sample.txt";

	public static void using_FileInputStream() {

		FileInputStream fis = null;

		try {

			File f = new File(path);

			fis = new FileInputStream(f);

			int value = 0;

			while ((value = fis.read()) != -1) {

				// System.out.println(read); // it will print only ASCII values

				System.out.print((char) value); // it will print each characters

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {

			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void using_Buffered_Reader() {

		BufferedReader reader = null;

		try {

			File f = new File(path);

			reader = new BufferedReader(new FileReader(f));

			int c = 0;

			while ((c = reader.read()) != 0)

			{

				System.out.print((char) c);

			}

		} catch (Exception e) {

		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public static void using_Scanner() {

		Scanner s = null;

		try {

			File f = new File(path);

			s = new Scanner(f);

			while (s.hasNextLine())

			{

				System.out.print(s.nextLine());

			}

		} catch (Exception e) {

		} finally {

			try {
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void using_File_Reader() {

		FileReader reader = null;

		try {

			reader = new FileReader(path);

			int c = 0;

			while ((c = reader.read()) != 0)

			{

				System.out.print((char) c);

			}

		} catch (Exception e) {

		} finally {

			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public static void using_Nio_Files() {

		try {
			List<String> readAllLines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);

			for (String string : readAllLines) {

				System.out.println(string);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// using_FileInputStream();

		// using_Buffered_Reader();

		// using_File_Reader();

		// using_Scanner();

		using_Nio_Files();

	}

}
