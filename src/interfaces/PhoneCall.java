package interfaces;

public interface PhoneCall {
  void call(String number);
  void answerCall();
  void listenVoiceMail(String number);
  void hangUpCall();
  void sendMail(String number, String message);
  void blockNumber(String number);
  void showRecentCalls(); 
}