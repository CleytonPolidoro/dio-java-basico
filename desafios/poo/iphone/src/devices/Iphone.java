package devices;

import java.util.Scanner;

import devices.functions.Internet;
import devices.functions.MusicPlayer;
import devices.functions.Telephone;

public class Iphone implements Internet, Telephone, MusicPlayer {
    Scanner sc = new Scanner(System.in);

    @Override
    public void addTab() {
        System.out.println("Adding new tab");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Loading page " + url);
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page");

    }

    @Override
    public void attend() {
        System.out.println("Answering the phone");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);

    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail");

    }

    @Override
    public void pause() {
        System.out.println("Pausing music");

    }

    @Override
    public void play() {

        System.out.println("Playing music");

    }

    @Override
    public void selectMusic() {
        System.out.print("Escolha sua música: ");
        String music = sc.nextLine();
        System.out.println("[" + music + "]" + " selecionada");
        play();
    }

}
