package com.czy.impl;

import com.czy.Player;

public class PlayerManagerImpl implements com.czy.PlayerManager {

    static void delPlayer(Player player){
        if (player.isOffline()){
            //删除player
        }
    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public Player getPlayer(String username) {
        return null;
    }

    @Override
    public void broadcast(String message) {

    }

}
    