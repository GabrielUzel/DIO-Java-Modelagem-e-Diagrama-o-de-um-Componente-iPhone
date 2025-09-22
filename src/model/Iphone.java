import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.PhoneCall;

public class Iphone implements MusicPlayer, PhoneCall, InternetBrowser {
  private int batteryLevel;
  
  public void turnOn() {
    System.out.println("IPhone is now ON.");
  }

  public void turnOff() {
    System.out.println("IPhone is now OFF.");
  }

  public void restart() {
    System.out.println("IPhone is restarting...");
  }

  public void showDeviceInfo() {
    System.out.println("IPhone 1st Generation - Released in 2007");
  }

  public int checkBatteryLevel() {
    return this.batteryLevel;
  }

  @Override
  public void play() {
    System.out.println("Playing music...");
  }

  @Override
  public void pause() {
    System.out.println("Music paused.");
  }

  @Override
  public void chooseSong(String song) {
    System.out.println("Choosing song: " + song);
  }

  @Override
  public void nextSong() {
    System.out.println("Skipping to next song...");
  }

  @Override
  public void previousSong() {
    System.out.println("Going back to previous song...");
  }

  @Override
  public void changeVolume(int level) {
    System.out.println("Changing volume to: " + level);
  }

  @Override
  public void showPlaylist() {
    System.out.println("Showing playlist...");
  }

  @Override
  public void call(String number) {
    System.out.println("Calling number: " + number);
  }

  @Override
  public void answerCall() {
    System.out.println("Answering call...");
  }

  @Override
  public void listenVoiceMail(String number) {
    System.out.println("Listening to voicemail from: " + number);
  }

  @Override
  public void hangUpCall() {
      System.out.println("Hanging up the call.");
  }

  @Override
  public void sendMail(String number, String message) {
    System.out.println("Sending message to " + number + ": " + message);
  }

  @Override
  public void blockNumber(String number) {
    System.out.println("Blocking number: " + number);
  }

  @Override
  public void showRecentCalls() {
    System.out.println("Showing recent calls...");
  }

  @Override
  public void showPage(String url) {
    System.out.println("Showing page: " + url);
  }

  @Override
  public void addNewTab() {
    System.out.println("Adding a new tab...");
  }

  @Override
  public void refresh() {
    System.out.println("Refreshing the page...");
  }

  @Override
  public void closeTab() {
    System.out.println("Closing the tab...");
  }
}