package nl.han.jaapp.jaapgame;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.han.jaapp.jaapgame.scenes.GameOverScene;
import nl.han.jaapp.jaapgame.scenes.GameLevel;
import nl.han.jaapp.jaapgame.scenes.TitleScene;

public class Waterworld extends YaegerGame {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Waterworld");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScene(this));
        addScene(1, new GameLevel(this));
        addScene(2, new GameOverScene(this));
    }
}
