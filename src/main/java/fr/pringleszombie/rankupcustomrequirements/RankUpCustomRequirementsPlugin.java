package fr.pringleszombie.rankupcustomrequirements;

import fr.pringleszombie.rankupcustomrequirements.requirements.BlocksMinedRequirement;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import sh.okx.rankup.RankupRegisterEvent;

public class RankUpCustomRequirementsPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        super.onEnable();
        this.getServer().getPluginManager().registerEvents(this,this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @EventHandler
    public void onRankUpRegisterEvent(RankupRegisterEvent e){
        e.addRequirement(new BlocksMinedRequirement(JavaPlugin.getPlugin(sh.okx.rankup.Rankup.class)));
    }


}
