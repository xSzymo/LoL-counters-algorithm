package xszymo.configuration;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class SystemVariables {
    public static final String name = "RGAPI-a82a19b3-3d19-4f99-9679-9ad71d8998a4";
    public static final String URL = "http://how2win.pl/counterpicki/";
    public static final String PATH = "D:/AppSL/here/";
    public static final String PATH_COUNTERS = new File("src/main/resources/counters.txt").getAbsoluteFile().toString();
    public static final String PATH_LINE_INFO = new File("src/main/resources/LINEINFO.txt").getAbsoluteFile().toString();
    public static final String PATH_LINE_123 = new File("src/main/resources/123.txt").getAbsoluteFile().toString();
    public static final String PATH_LINE_1234 = new File("src/main/resources/1234.txt").getAbsoluteFile().toString();

//	SystemVariables() {
//		try (Writer writer = new BufferedWriter(
//				new OutputStreamWriter(new FileOutputStream(PATH_COUNTERS), "utf-8"))) {
//			File b = new File(PATH_COUNTERS);
//			URL a = new URL(URL);
//			FileUtils.copyURLToFile(a, b);
//		} catch (UnsupportedEncodingException e1) {
//			e1.printStackTrace();
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//	}

}
