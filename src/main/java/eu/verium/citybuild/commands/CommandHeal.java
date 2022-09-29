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

import eu.verium.citybuild.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandHeal implements CommandExecutor {

    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            if(args.length == 0) {
                if(!player.hasPermission("citybuild.commands.heal")) {
                    player.sendMessage(Main.PREFIX + "§cKeine Rechte!");
                } else {
                    player.setHealth(20);
                    player.sendMessage(Main.PREFIX + "§aDu wurdest geheilt");
                }


            } else if(args.length == 1) {
                if(!player.hasPermission("citybuild.commands.heal.other")) {
                    player.sendMessage(Main.PREFIX + "§cKeine Rechte!");
                } else {
                    Player target = Bukkit.getPlayer(args[0]);
                    if(target != null) {
                        target.setHealth(20);
                        player.sendMessage(Main.PREFIX + "§aDu hast §b" + target.getName() + "§a geheilt");
                    } else
                        player.sendMessage(Main.PREFIX + "§cDieser Spieler ist nicht online! ('" + args[0] + "§c')");
                }


            } else
            if(!player.hasPermission("citybuild.commands.heal")) {
                player.sendMessage(Main.PREFIX + "§cKeine Rechte!");
            } else
                player.sendMessage(Main.PREFIX + "§cBenutze /heal <Spieler>");
        }
        return false;
    }
}
