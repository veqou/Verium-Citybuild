/*
 * MIT License
 *
 * Copyright (c) 2022 veqou, SpigotException
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package eu.verium.citybuild;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main plugin;

    public static final String PREFIX = "§7» §bVerium §7| ";

    @Override
    public void onEnable() {
        plugin = this;

        /*
        getCommand("feed").setExecutor(new CommandFeed());
        getCommand("heal").setExecutor(new CommandHeal());
        getCommand("day").setExecutor(new CommandDay());
        getCommand("night").setExecutor(new CommandNight());
        getCommand("gm").setExecutor(new CommandGamemode());
        getCommand("sun").setExecutor(new CommandSun());
        getCommand("warps").setExecutor(new CommandWarps());
        getCommand("npc").setExecutor(new CommandNpc());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new EventConnection(), this);
        pluginManager.registerEvents(new InventoryClickEvent(),this);
        pluginManager.registerEvents(new EventNpcInteract(), this);

         */
    }


    public static Main getPlugin() {
        return plugin;
    }
}
