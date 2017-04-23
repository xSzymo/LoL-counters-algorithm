package xszymo.configuration;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

@Component
public class SystemVariables {
	public static final String name = "RGAPI-0a1ea673-7a95-4309-8c5b-1aa42a6aee51";
	public static final String URL = "http://how2win.pl/counterpicki/";
	public static final String PATH = "E:/123/counters.txt";

	SystemVariables() {
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(PATH), "utf-8"))) {
			File b = new File(PATH);
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
