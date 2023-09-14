import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(userName.equals("Sagut78") && password.equals("2004")){
          System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Giriş Başarısız");
            System.out.print("Şifreyi Sıfırlamak İstermisiniz ? ");
            String answer = input.nextLine();
         if (answer.equals("Evet")){
           System.out.print("Yeni Şifre: ");
           String newPassword = input.nextLine();
           if (!newPassword.equals(password)){
               System.out.println("Şifre Oluşturuldu");
             } else  {
               System.out.println("Şifre oluşturulamadı lütfen başka şifre deneyiniz");
           }

         }else {
          System.out.println("Şifre sıfırlama işlemi iptal edildi");
         }

        }
    }
}
