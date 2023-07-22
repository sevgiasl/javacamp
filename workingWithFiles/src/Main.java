import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createFile();
        // getFileInfo();
        readFile();
        writeFile();
        readFile();


    }
    public static void createFile(){
        File file = new File("C:\\javademos\\Files\\students.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static void getFileInfo(){
        File file = new File("C:\\javademos\\Files\\students.txt");
       if(file.exists()){
           System.out.println("Dosya adı: "+file.getName());
           System.out.println("Dosya yolu: "+file.getAbsolutePath());
           System.out.println("Dosya yazılabilir mi: "+file.canWrite());
           System.out.println("Dosya okunabilir mi: "+file.canRead());
           System.out.println("Dosya boyutu (byte): "+file.length());
        }
    }
    public static void readFile(){
        File file = new File("C:\\javademos\\Files\\students.txt");
        try  {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line =reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch(FileNotFoundException e){
        e.printStackTrace();
        }
    }
    public static void writeFile()  {
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\javademos\\Files\\students.txt",true));
            //true,dosyayı ekleme formatında açmak için yazıldı
           writer.newLine();//yeni satır oluştur sonra ahmet i yaz
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}