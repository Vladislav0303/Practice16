package some.packing.bibika.bika.utils;

import some.packing.bibika.bika.Daily;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileUtils {
    public static LocalDateTime[] mynote(LocalDateTime[] massdat,String[] str1, String name) {
        while (true) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(name))) {
                Daily.mynote(massdat, str1, name);
                            bw.close();
                            FileUtils.diary(massdat,str1,name);
                            Daily.menu();
            } catch (IOException e) {
                System.out.println("Помилка: " + e.getMessage());
            } catch (DateTimeException e) {
                System.out.println("Ви ввели не вірну дату: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
            return massdat;
        }
    }
    public static String diary(LocalDateTime[] massdat, String[] str1, String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(name))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }  catch (IOException e) {
            System.out.println("Назву файла не знайдено: " + e.getMessage());
            Scanner sc = new Scanner(System.in);
            System.out.println("Створіть новий.");
            System.out.println("Хочете записати щось в цей файл?: ");
            String str = sc.nextLine();
            if(str.equals("Так")) {
                mynote(massdat,str1,str);
            }
        }
        return name;
    }
}
