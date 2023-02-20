package com.konloch;

import com.konloch.iterate.IterateINI;

import java.io.IOException;

/**
 * @author Konloch
 * @since 2/19/2023
 */
public class TestIterateINI
{
	public static void main(String[] args) throws IOException
	{
		IterateINI.fromFile("./src/test/java/com/konloch/example.ini", (key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});
	}
}
