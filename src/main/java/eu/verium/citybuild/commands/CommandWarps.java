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

package eu.verium.citybuild.commands;

import eu.verium.citybuild.ItemBuilder;
import eu.verium.citybuild.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class CommandWarps implements CommandExecutor , Listener {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        Inventory inv  = Bukkit.createInventory(null , 9*3 ,"§aWarps");

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if(strings.length == 0){

                inv.setItem(0,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(1,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(2,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(3,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(4,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(5,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(6,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(7,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(8,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(9,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));

                inv.setItem(11, new ItemBuilder().createItem(Material.NETHERRACK,  "§cNether"));
                inv.setItem(13, new ItemBuilder().createItem(Material.NETHER_STAR,  "§eSpawn"));

                inv.setItem(17,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(18,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(19,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(20,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(21,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(22,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(23,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(24,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(25,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));
                inv.setItem(26,new ItemBuilder().createItem(Material.BLACK_STAINED_GLASS_PANE, "§1"));


                player.openInventory(inv);
            }else player.sendMessage(Main.PREFIX + "§cBenutze /warps");

        }

        return false;
    } @EventHandler
    public void onClick(InventoryClickEvent event){

    }
}
