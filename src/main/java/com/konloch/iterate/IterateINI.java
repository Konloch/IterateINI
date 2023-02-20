package com.konloch.iterate;

import com.konloch.dsl.DSL;

import java.io.File;
import java.io.IOException;

/**
 * @author Konloch
 * @since 10/28/2022
 */
public class IterateINI
{
	/**
	 * Define a new DSL as INI format
	 */
	private static final DSL ini = new DSL('=', '%',
					'(', ')',
					'{', '}',
					'#');
	
	/**
	 * Parse and iterate the key-value pairs of any INI file.
	 *
	 * @param filePath any String as the file path of the INI file
	 * @param onPairFound any KeyValuePairFound called whenever a key-value pair is found
	 * @throws IOException if an I/O error occurs reading from the stream
	 */
	public static void fromFile(String filePath, KeyValuePairFound onPairFound) throws IOException
	{
		fromFile(new File(filePath), onPairFound);
	}
	
	/**
	 * Parse and iterate the key-value pairs of any INI file.
	 *
	 * @param file any File in INI file format
	 * @param onPairFound any KeyValuePairFound called whenever a key-value pair is found
	 * @throws IOException if an I/O error occurs reading from the stream
	 */
	public static void fromFile(File file, KeyValuePairFound onPairFound) throws IOException
	{
		//load the file as ini format
		ini.parse(file);
		
		//parse each ini key-value pair
		for(String key : ini.getRuntime().getCommands().keySet())
		{
			String value = ini.getRuntime().getCommands().get(key).getParameters()[0];
			onPairFound.found(key, value);
		}
	}
}
