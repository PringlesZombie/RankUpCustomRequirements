package fr.pringleszombie.rankupcustomrequirements.requirements;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import sh.okx.rankup.Rankup;
import sh.okx.rankup.requirements.ProgressiveRequirement;
import sh.okx.rankup.requirements.Requirement;

public class BlocksMinedRequirement extends ProgressiveRequirement {

    public BlocksMinedRequirement(Rankup plugin) {
        super(plugin,"blocks-mined");
    }

    private BlocksMinedRequirement(Requirement clone) {
        super(clone);
    }

    @Override
    public double getProgress(Player player) {
        int stats = 0;
        for(Material m :Material.values()){
            if(m.isBlock() && m.isSolid())
                stats += player.getStatistic(Statistic.MINE_BLOCK,m);
        }

        return stats;
    }

    @Override
    public Requirement clone() {
        return new BlocksMinedRequirement(this);
    }
}
