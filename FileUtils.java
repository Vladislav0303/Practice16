package some.packing.bibika.bika.utils;

import some.packing.bibika.bika.Daily;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileUtils {
    public static String diary(LocalDateTime[] massdat, String[] str1, String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            Scanner sc = new Scanner(System.in);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }  catch (IOException e) {
            System.out.println("Назву файла не знайдено" + e.getMessage());
            Scanner sc = new Scanner(System.in);
            System.out.println("Створіть новий.");
            System.out.println("Хочете записати щось в цей файл?: ");
            String str = sc.nextLine();
            if(str.equals("Так")) {
                Daily.mynote(massdat,str1,str);
            }
        }
        return name;
    }
}
