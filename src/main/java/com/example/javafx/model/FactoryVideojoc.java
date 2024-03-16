package com.example.javafx.model;
import java.util.Random;

public class FactoryVideojoc {

    private String[] videojocs = {
            "The Legend of Zelda: Breath of the Wild",
            "Super Mario Odyssey",
            "Cyberpunk 2077",
            "Red Dead Redemption 2",
            "Minecraft",
            "Grand Theft Auto V",
            "Fortnite",
            "Overwatch",
            "FIFA 22",
            "Call of Duty: Warzone",
            "Assassin's Creed Valhalla",
            "Doom Eternal",
            "Among Us",
            "Rocket League",
            "Apex Legends",
            "The Witcher 3: Wild Hunt",
            "Halo Infinite",
            "League of Legends",
            "World of Warcraft",
            "Mortal Kombat 11",
            "Persona 5",
            "Final Fantasy VII Remake",
            "Ghost of Tsushima",
            "Death Stranding",
            "Spider-Man: Miles Morales",
            "The Elder Scrolls V: Skyrim",
            "Rainbow Six Siege",
            "Cuphead",
            "Genshin Impact",
            "Sekiro: Shadows Die Twice",
            "Control",
            "Star Wars Jedi: Fallen Order",
            "Animal Crossing: New Horizons",
            "Pokémon Sword and Shield",
            "Dying Light 2",
            "Nier: Automata",
            "Mass Effect: Legendary Edition",
            "Resident Evil Village",
            "Ratchet & Clank: Rift Apart",
            "God of War",
            "Horizon Zero Dawn",
            "Cyber Shadow",
            "Subnautica",
            "No Man's Sky",
            "Stardew Valley",
            "Crysis Remastered",
            "Battlefield V",
            "The Last of Us Part II",
            "Diablo IV",
            "Splatoon 2",
            "Monster Hunter: World",
            "Super Smash Bros. Ultimate",
            "Elden Ring",
            "Gotham Knights",
            "Back 4 Blood",
            "Hogwarts Legacy",
            "Fable",
            "Starfield",
            "Beyond Good and Evil 2",
            "Metroid Prime 4",
            "Bayonetta 3",
            "Silent Hill",
            "BioShock 4",
            "Final Fantasy XVI",
            "Elder Scrolls VI",
            "Hellblade II: Senua's Saga",
            "Everwild",
            "Suikoden VI",
            "Perfect Dark",
            "Dead Space Remake",
            "Skull & Bones",
            "A Plague Tale: Requiem",
            "Project Athia",
            "Stray",
            "Ghostwire: Tokyo",
            "Kena: Bridge of Spirits",
            "Little Nightmares II",
            "Pragmata",
            "Returnal",
            "Solar Ash",
            "Sons of the Forest",
            "The Medium",
            "Vampire: The Masquerade - Bloodlines 2",
            "Watch Dogs: Legion",
            "Yakuza: Like a Dragon",
            "Demon's Souls",
            "Astro's Playroom",
            "Bugsnax"
    };

    private String[] plataformes = {
            "PlayStation 5",
            "Xbox Series X",
            "Nintendo Switch",
            "PlayStation 4",
            "Xbox One",
            "Nintendo Wii U",
            "PlayStation 3",
            "Xbox 360",
            "Nintendo Wii",
            "PlayStation 2",
            "Xbox",
            "Nintendo GameCube",
            "PlayStation",
            "Nintendo 64",
            "Sega Dreamcast"
    };

    private String[] desenvolupadors = {
            "Electronic Arts",
            "Ubisoft",
            "Activision",
            "Nintendo",
            "Sony Interactive Entertainment",
            "Microsoft Studios",
            "Bethesda Softworks",
            "Rockstar Games",
            "Square Enix",
            "CD Projekt",
            "Capcom",
            "Sega",
            "Epic Games",
            "Valve Corporation",
            "Naughty Dog"
    };


    public Videojoc crearVideojocAleatori(){
        Random rnd = new Random();
        String nom = videojocs[rnd.nextInt(videojocs.length)];
        String plataforma = plataformes[rnd.nextInt(plataformes.length)];
        int anyLlançament = rnd.nextInt(15) + 2010;
        String desenvolupador = desenvolupadors[rnd.nextInt(desenvolupadors.length)];

        return new Videojoc(nom, plataforma, anyLlançament, desenvolupador, 0);
    }

    public Videojoc[] crearLlistatVideojocs(int n){
        Videojoc[] llistat = new Videojoc[n];
        for (int i = 0; i < n; i++) {
            llistat[i] = crearVideojocAleatori();
        }
        return llistat;
    }
}
