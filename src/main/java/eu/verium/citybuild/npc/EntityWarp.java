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

package eu.verium.citybuild.npc;

import eu.verium.citybuild.utils.ItemManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;

public class EntityWarp {

    public static final String ENTITY_NAME = "§7» §3§lWarps";

    public EntityWarp(Location location){

        IronGolem ironGolem = (IronGolem) location.getWorld().spawnEntity(location, EntityType.IRON_GOLEM);
        ironGolem.setCustomName(ENTITY_NAME);
        ironGolem.setCustomNameVisible(true);
        ironGolem.setAI(false);
        ironGolem.setInvulnerable(true);
        ironGolem.getEquipment().setItemInMainHand(ItemManager.createItem(Material.COMPASS, null));
    }
}
