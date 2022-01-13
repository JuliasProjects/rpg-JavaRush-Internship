package com.game.service;

import com.game.controller.PlayerOrder;
import com.game.entity.Player;
import com.game.entity.Profession;
import com.game.entity.Race;
import java.util.List;

public interface PlayerService {



    List<Player> getFilteredPlayers(String name, String title, Race race, Profession profession,
                                    Long after, Long before, Boolean banned, Integer minExperience,
                                    Integer maxExperience, Integer minLevel, Integer maxLevel);


    List<Player> getSortedPlayers(List<Player> filteredPlayers, Integer page, Integer countOnPage, PlayerOrder order);

    Player createNewPlayer(Player player);

    Player updatePlayersPersonality(Player oldPlayer, Player newPlayer);

    void deletePlayer(Player player);

    Player getPlayerById(String id);




}
