package v1d.opdrachten6.opdracht6a;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<>();

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game game) {
        boolean gelukt = false;
        if (budget >= game.huidigeWaarde()){
            gelukt = true;
            for(Game g : mijnGames){
                if (g.equals(game)) {
                    gelukt = false;
                    break;
                }
            }
            if(gelukt){
                budget -= game.huidigeWaarde();
                mijnGames.add(game);
            }
        }
        return gelukt;
    }

    public boolean verkoop (Game game, Persoon koper){
        boolean heeftGame = false;
        for(Game g : mijnGames){
            if (g.equals(game)) {
                heeftGame = true;
                break;
            }
        }
        if(heeftGame){
            boolean verkocht = koper.koop(game);
            if(verkocht){
                budget += game.huidigeWaarde();
                mijnGames.remove(game);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("##.00");
        StringBuilder persoonReturn = new StringBuilder(naam + " heeft een budget van €" + f.format(budget) + " en bezit de volgende games:");
        for(Game g : mijnGames){
            persoonReturn.append("\n").append(g);
        }
        return persoonReturn.toString();
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> teKoop) {
        ArrayList<Game> nietInBezit = new ArrayList<Game>();
        for(Game g : teKoop) {
            if(!mijnGames.contains(g)){
                nietInBezit.add(g);
            }
        }
        return nietInBezit;
    }

    public Game zoekGameOpNaam(String game) {
        for(Game g : mijnGames){
            if(game.equals(g.getNaam())) {
                return g;
            }
        }
        return null;
    }

}
