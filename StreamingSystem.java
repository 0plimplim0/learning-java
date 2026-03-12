import java.util.ArrayList;

public class StreamingSystem {

  public abstract static class Content {
    public String title;
    public int duration;

    public Content(String title, int duration) {
      this.title = title;
      this.duration = duration;
    }

    public abstract void play();
  }

  public static class Movie extends Content {
    public String director;

    public Movie(String title, int duration, String director) {
      super(title, duration);
      this.director = director;
    }

    @Override
    public void play() {
      System.out.printf("Playing %s directed by %s%n", this.title, this.director);
    }
  }

  public static class Series extends Content {
    public int episodes;

    public Series(String title, int duration, int episodes) {
      super(title, duration);
      this.episodes = episodes;
    }

    @Override
    public void play() {
      System.out.printf("Playing %s, with %d episodes%n", this.title, this.episodes);
    }
  }

  public static void main(String[] args) {
    ArrayList<Content> contents = new ArrayList<>();
    contents.add(new Movie("Belle", 122, "Mamoru Hosoda"));
    contents.add(new Movie("The Boy And The Heron", 124, "Hayao Miyasaki"));
    contents.add(new Series("Charlotte", 306, 12));
    contents.add(new Series("Do It Yourself!!", 306, 12));

    for (Content c : contents) {
      c.play();
    }
  }
}