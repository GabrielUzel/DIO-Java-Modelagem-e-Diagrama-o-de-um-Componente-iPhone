package interfaces;

public interface MusicPlayer {
  void play();
  void pause();
  void chooseSong(String song);
  void nextSong();
  void previousSong();
  void changeVolume(int level);
  void showPlaylist();
}
