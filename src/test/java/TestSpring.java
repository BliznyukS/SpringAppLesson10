import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.Music;
import ru.alishev.springcourse.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music1 = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music1);
        rockMusicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();

        Music music3 = context.getBean("rapMusic", Music.class);
        MusicPlayer rapMusicPlayer = new MusicPlayer(music3);
        rapMusicPlayer.playMusic();

        context.close();
    }

}
