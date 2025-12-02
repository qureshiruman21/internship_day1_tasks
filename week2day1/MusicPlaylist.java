import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlaylist {

    // ---------------- Song Class ----------------
    static class Song {
        private String title;
        private String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        @Override
        public String toString() {
            return title + " - " + artist;
        }

        public String getTitle() {
            return title;
        }
    }

    // --------------- Playlist Manager ---------------
    static class PlaylistManager {
        private LinkedList<Song> playlist = new LinkedList<>();
        private ListIterator<Song> iterator = playlist.listIterator();
        private boolean goingForward = true;

        // Add Song
        public void addSong(String title, String artist) {
            playlist.add(new Song(title, artist));
            System.out.println("Song added: " + title);
            iterator = playlist.listIterator();
        }

        // Play Next Song
        public void playNext() {
            if (!goingForward) {
                if (iterator.hasNext()) iterator.next();
                goingForward = true;
            }

            if (iterator.hasNext()) {
                System.out.println("Playing: " + iterator.next());
            } else {
                System.out.println("No next song.");
            }
        }

        // Play Previous Song
        public void playPrevious() {
            if (goingForward) {
                if (iterator.hasPrevious()) iterator.previous();
                goingForward = false;
            }

            if (iterator.hasPrevious()) {
                System.out.println("Playing: " + iterator.previous());
            } else {
                System.out.println("No previous song.");
            }
        }

        // Remove Song
        public void removeSong(String title) {
            for (Song s : playlist) {
                if (s.getTitle().equalsIgnoreCase(title)) {
                    playlist.remove(s);
                    System.out.println("Removed: " + title);
                    iterator = playlist.listIterator();
                    return;
                }
            }
            System.out.println("Song not found!");
        }

        // Display Playlist
        public void showPlaylist() {
            if (playlist.isEmpty()) {
                System.out.println("Playlist is empty.");
            } else {
                System.out.println("\n--- Playlist ---");
                for (Song s : playlist) {
                    System.out.println(s);
                }
            }
        }
    }

    // ------------------ Main Method ------------------
    public static void main(String[] args) {
        PlaylistManager manager = new PlaylistManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Music Playlist Menu ---");
            System.out.println("1. Add Song");
            System.out.println("2. Play Next Song");
            System.out.println("3. Play Previous Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Show Playlist");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();
                    manager.addSong(title, artist);
                    break;

                case 2:
                    manager.playNext();
                    break;

                case 3:
                    manager.playPrevious();
                    break;

                case 4:
                    System.out.print("Enter Song Title to Remove: ");
                    String removeTitle = sc.nextLine();
                    manager.removeSong(removeTitle);
                    break;

                case 5:
                    manager.showPlaylist();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
