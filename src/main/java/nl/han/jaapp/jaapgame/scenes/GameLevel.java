package nl.han.jaapp.jaapgame.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.EntitySpawnerContainer;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import nl.han.jaapp.jaapgame.Waterworld;
import nl.han.jaapp.jaapgame.entities.map.CoralTileMap;
import nl.han.jaapp.jaapgame.entities.swordfish.SwordFish;
import nl.han.jaapp.jaapgame.entities.text.BubblesPoppedText;
import nl.han.jaapp.jaapgame.entities.text.HealthText;
import nl.han.jaapp.jaapgame.spawners.BubbleSpawner;
import nl.han.jaapp.jaapgame.entities.Hanny;
import nl.han.jaapp.jaapgame.entities.Sharky;

public class GameLevel extends DynamicScene implements EntitySpawnerContainer, TileMapContainer {

    private Waterworld waterworld;

    public GameLevel(Waterworld waterworld) {
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
        setBackgroundAudio("audio/waterworld.mp3");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(0, 0));
        addEntity(healthText);

        var bubblesPoppedText = new BubblesPoppedText(new Coordinate2D(0, 30));
        addEntity(bubblesPoppedText);

        addEntity(new Hanny(new Coordinate2D(1, 1), healthText, bubblesPoppedText, waterworld));
        addEntity(new SwordFish(new Coordinate2D(200, 300)));
        addEntity(new Sharky(new Coordinate2D(0, 100)));
    }

    @Override
    public void setupEntitySpawners() {
        addEntitySpawner(new BubbleSpawner(getWidth(), getHeight()));
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new CoralTileMap());
    }
}
