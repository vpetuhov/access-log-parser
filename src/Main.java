import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            int rightPathCount = 1;
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if(fileExists == false || isDirectory == true){
                System.out.println("Указанный файл не существует или указанный путь является путём к папке");
                continue;
            }else{
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + rightPathCount);
                rightPathCount += 1;
            }
        }
    }
}