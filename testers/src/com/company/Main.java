package com.company;
import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedWriter writer;
	    System.out.print("What would you like to say? (write \"done\" on an empty line when finished)\n");
        Scanner reader = new Scanner(System.in).useDelimiter("\\s*\n\\s*");
        File jack = new File("john.txt");
        String line;
        System.out.print(">");
        line = reader.next();
        writer = new BufferedWriter(new FileWriter(jack, true));
        writer.newLine();
        line = "\n";
        while (!line.equals("done")){
            writer.write(line);
            writer.close();
            writer = new BufferedWriter(new FileWriter(jack, true));
            writer.newLine();
            System.out.print(">");
            line = reader.next();
        }
        System.out.print("\nWhat's your name?\n");
        String name;
        name = reader.next();
        writer.write("-" + name);
        writer.close();
        String james;
        BufferedReader read = new BufferedReader(new FileReader(jack));
        while((james = read.readLine()) != null)
        {
            System.out.println(james);
        }
    }
}
