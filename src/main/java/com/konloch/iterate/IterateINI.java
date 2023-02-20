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
	private static final DSL ini = new DSL('=', '%',
					'(', ')',
					'{', '}',
					'#');
	
	public static void fromFile(String filePath, KeyValuePairFound onPairFound) throws IOException
	{
		fromFile(new File(filePath), onPairFound);
	}
	
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
