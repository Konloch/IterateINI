# IterateINI
Zero dependency pure Java library to support iterating over the key-value pairs of any INI file.

## How To Add As Library
Add it as a maven dependency or just [download the latest release](https://github.com/Konloch/IterateINI/releases).
```xml
<dependency>
  <groupId>com.konloch</groupId>
  <artifactId>IterateINI</artifactId>
  <version>1.0.1</version>
</dependency>
```

## Links
* [Website](https://konloch.com/IterateINI/)
* [Discord Server](https://discord.gg/aexsYpfMEf)
* [Download Releases](https://konloch.com/IterateINI/releases)

## How To Use
This shows an example of using the API to read an example ini file.
The key and value parameters are String types.
```java
IterateINI.fromFile(new File("example.ini"), (key, value) -> {
	System.out.println("Key: " + key + ", Value: " + value);
});
```

## Disclaimer
The API is read only, and **does not** support sections, entry recognition or multi-line values

