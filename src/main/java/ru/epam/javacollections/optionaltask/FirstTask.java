package ru.epam.javacollections.optionaltask;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {

	public static void main(String[] args) {
		List<String> strings = readFile("inputData.txt");
		Collections.reverse(strings);
		writeStringsInFile(strings, "outputData.txt");
	}

	public static List<String> readFile(String file) {
		URL url = FirstTask.class.getClassLoader().getResource(file);
		try {
			return url == null ? Collections.emptyList()
					: Files.lines(Paths.get(url.getPath())).collect(Collectors.toList());
		} catch (UncheckedIOException | IOException e) {
			return Collections.emptyList();
		}
	}

	public static void writeStringsInFile(List<String> strings, String file) {
		URL url = FirstTask.class.getClassLoader().getResource(file);
		try {
			Files.write(Paths.get(url.getPath()), strings, StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
