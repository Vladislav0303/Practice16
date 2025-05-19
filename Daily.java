package some.packing.bibika.bika;
import some.packing.bibika.bika.utils.FileUtils;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Daily {
        public static void main(String[] args) {
            menu();
        }
        public static void menu() {
            LocalDateTime[] massdat = new LocalDateTime[5];
            String[] str1 = new String[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("~Мій щоденник~");
            System.out.println("Введіть куди записувати: ");
            String name = sc.nextLine();
            System.out.println("Виберіть пункт: ");
            System.out.println("~1.Записати в щоденник~");
            System.out.println("~2.Прочитати записи в щоденнику~");
            int c = sc.nextInt();
            if(c == 1) {
                FileUtils.mynote(massdat, str1, name);
            } else if(c == 2) {
                FileUtils.diary(massdat,str1,name);
            }
        }
}
