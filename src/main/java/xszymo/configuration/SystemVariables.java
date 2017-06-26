package xszymo.configuration;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;

@Component
public class SystemVariables {
	public static final String name = "RGAPI-c180f1ba-7718-428f-9fa6-f065fc75b3be";
	public static final String URL = "http://how2win.pl/counterpicki/";
	public static final String PATH = "D:/AppSL/here/";
	public static final String PATH_COUNTERS = PATH + "counters.txt";
	public static final String PATH_LINE_INFO = PATH + "LINEINFO.txt";
	public static final String PATH_LINE_123 = PATH + "123.txt";
	public static final String PATH_LINE_1234 = PATH + "1234.txt";

	SystemVariables() {
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(PATH_COUNTERS), "utf-8"))) {
			File b = new File(PATH_COUNTERS);
			URL a = new URL(URL);
			FileUtils.copyURLToFile(a, b);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
