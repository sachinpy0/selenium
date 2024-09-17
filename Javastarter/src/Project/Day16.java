package Project;

import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {

//		try {
//			File myObj = new File("sachin.txt");
//			FileWriter myWrite = new FileWriter("sachin.txt");
//			mywrite.write("This is my file handling class");
//			mywrite.close();
//
//			if (myobj.createNewFile()) {
//				System.out.println("File is created" + myobj.getName());
//			} else {
//				System.out.println("File already exists");
//			}
//		} catch (IOException e) {
//			System.out.println("Internal error has occur");
//			e.printStackTrace();

//		try {
//			File myObj = new File("sachin.txt");
//			Scanner myReader = new Scanner(myObj);
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error has occur");
//		}

		// folder
//		File sa1 = new File("sachin.txt");
//		if(sa1.exists()) {
//			System.out.println("File Name:"+sa1.getName());
//			System.out.println("Absolute Path:"+sa1.getAbsolutePath());
//			System.out.println("File size"+sa1.length());
//		}else {
//			System.out.println("File does not exist");
//		}

		// delete folder
//		File myObj = new File("sachin.txt");
//		if (myObj.delete()) {
//			System.out.println("Deleted the folder: " + myObj.getName());
//		} else {
//			System.out.println("Failed to delete the folder.");
//
//		}

		// import class file
		File myObj = new File("filename.txt");
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}

	}

}
