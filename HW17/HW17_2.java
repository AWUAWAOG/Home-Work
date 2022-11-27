package HW17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW17_2 {
    public static void main(String[] args) throws IOException, IllegalStateException {
        FileInputStream allInformation = new FileInputStream("F:\\Documents\\Idea\\SomeInformation.txt");

        int i;
        StringBuilder text = new StringBuilder();

        while ((i = allInformation.read()) != -1) {
            text.append((char) i);
        }
        allInformation.close();

        System.out.println(text);

        Pattern email = Pattern.compile("^[A-z0-9._+%=-]+@[A-z]+.[A-z]{2,}", Pattern.CASE_INSENSITIVE);
        Matcher matcherEmail = email.matcher(text);
        System.out.println(matcherEmail.find());

        Pattern phone = Pattern.compile("\\+\\([0-9]{2}\\)[0-9]{7}", Pattern.CASE_INSENSITIVE);
        Matcher matcherPhone = phone.matcher(text);
        System.out.println(matcherPhone.find());

        Pattern document = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}", Pattern.CASE_INSENSITIVE);
        Matcher matcherDocument = document.matcher(text);
        System.out.println(matcherDocument.find() + "\n");

        HashMap<String, String> someMap = new HashMap<>();

        //someMap.put("email", matcherEmail.group());
        someMap.put("phone", matcherPhone.group());
        someMap.put("doc", matcherDocument.group());

        System.out.println(someMap);
    }
}