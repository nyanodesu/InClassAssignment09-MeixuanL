package com.example.inclassassignment09_meixuanl;

public class Pokemon {
    public String name;
    public String firstInGame;
    public int id;

    public Pokemon(String name, String firstInGame, int id){
        this.name = name;
        this.firstInGame = firstInGame;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstInGame(String firstInGame) {
        this.firstInGame = firstInGame;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getFirstInGame() {
        return firstInGame;
    }

    public int getId() {
        return id;
    }
}
