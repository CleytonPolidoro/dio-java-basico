import java.util.Scanner;

import devices.Iphone;

public class app {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Iphone iphone = new Iphone();

    iphone.selectMusic();
    iphone.pause();

    System.out.print("Enter the website url: ");
    String url = sc.nextLine();
    iphone.displayPage(url);
    iphone.updatePage();
    iphone.addTab();

    System.out.print("enter the number you want to call (55) 5 5555-5555: ");
    String number = sc.nextLine();
    iphone.call(number);
    iphone.attend();
    iphone.startVoicemail();
    sc.close();
  }
}
