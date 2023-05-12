package top.hyreon.blastmine;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityExplodeEvent;

public class BlastListener implements Listener {

    @EventHandler
    public static void explosion(EntityExplodeEvent e) {
        e.setYield(1);
    }

    @EventHandler
    public void onTntDamage(EntityDamageEvent event) {
        DamageCause reason = event.getCause();
        if (reason == DamageCause.ENTITY_EXPLOSION && event.getEntityType() == EntityType.DROPPED_ITEM) {
            event.setDamage(00.00);
            event.setCancelled(true);
        }
    }

}
