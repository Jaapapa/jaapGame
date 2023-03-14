module waterworld {
    requires hanyaeger;

    exports nl.han.jaapp.jaapgame;
    exports nl.han.jaapp.jaapgame.entities.map;

    opens audio;
    opens backgrounds;
    opens sprites;
}
