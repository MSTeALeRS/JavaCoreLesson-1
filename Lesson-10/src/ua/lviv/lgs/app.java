package ua.lviv.lgs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class app {

	public static void main(String[] args) throws IOException, Excpt {

		System.err.println("<<<Введіть слово паліндром з 5 букв>>>>");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String c = br.readLine().toUpperCase();

		StringBuffer sb = new StringBuffer(c);

		if (c.contentEquals(sb.reverse())) {
			System.out.println("так, це слово паліндром");
			if (sb.length() == 5) {
				System.out.println("Have 5  letters");
			} else {

				try {
					String name = "No 5  letters";
					throw new Excpt(name);
				} catch (Excpt a) {
					a.printStackTrace();

				}
			}
		} else {
			System.out.println("No паліндром");

		}

		System.err.println("<<<Введіть речення>>>>");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String newString = br1.readLine();
		String newString1 = newString.replace("а", "-").replace("і", "-").replace("е", "-").replace("о", "-")
				.replace("у", "-");

		System.out.println("Old string: " + newString);
		System.out.println("New string: " + newString1);

		System.out.println("в реченні " + newString.split(" ").length + " слів");

		String[] m = newString.split(" ");
		Arrays.sort(m);

		String maxWord = "";
		String word = "";
		int maxCount = 0;
		int count = 1;

		for (String s : m) {
			if (s.equals(word)) {
				count++;
			} else {
				if (count > maxCount) {
					maxCount = count;
					maxWord = word;
				}
				word = s;
				count = 1;
			}
		}

		if (count > maxCount) {
			maxCount = count;
			maxWord = word;
		}

		System.out.println("Найчастіше повторюється слово: " + maxWord + " (зустрічається " + maxCount + " раз)");
	}
}
