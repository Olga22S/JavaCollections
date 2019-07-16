package ru.epam.javacollections.optionaltask;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SixTask {

	public static void main(String[] args) {
		List<List<String>> poems = new ArrayList<>();
		poems.add(readFile("poem1.txt"));
		poems.add(readFile("poem2.txt"));
		poems.add(readFile("poem3.txt"));
		for (List<String> poem : poems) {
			Collections.sort(poem, (o1, o2) -> o1.length() - o2.length());
		}
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
}
