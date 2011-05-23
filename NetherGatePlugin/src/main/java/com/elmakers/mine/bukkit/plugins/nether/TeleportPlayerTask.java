package com.elmakers.mine.bukkit.plugins.nether;

import org.bukkit.World;

import com.elmakers.mine.bukkit.plugins.nether.dao.NetherPlayer;

public class TeleportPlayerTask implements Runnable
{
    protected NetherManager manager;
    protected NetherPlayer player;
    protected World world;
    
    public TeleportPlayerTask(NetherManager manager, NetherPlayer player, World world)
    {
        this.manager = manager;
        this.player = player;
        this.world = world;
    }
    
    @Override
    public void run()
    {
        manager.finallyDoTeleport(player, world);
    }

}
