package xyz.mrsherobrine.enchantments;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class Enchantments extends JavaPlugin {

    public static Logger LOGGER = null;

    @Override
    public void onEnable() {

        LOGGER = getLogger();

        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            try {
                f.set(null, true);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
