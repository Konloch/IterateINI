package com.konloch.iterate;

/**
 * @author Konloch
 * @since 10/28/2022
 */
public interface KeyValuePairFound
{
	/**
	 * Called any time an INI key-value pair is found.
	 *
	 * @param key any String as the INI key
	 * @param value any String as the INI value
	 */
	void found(String key, String value);
}
