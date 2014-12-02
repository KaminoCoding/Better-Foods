package io.cyb3rwarri0r8.betterfoods.items.foods;
/* 
* Better Foods - A Minecraft Modification
* Copyright (C) 2014 Cyb3rWarri0r8
*
* This program is free software: you can redistribute it and/or modify 
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

import io.cyb3rwarri0r8.betterfoods.help.Reference;
import io.cyb3rwarri0r8.betterfoods.main;
import net.minecraft.item.ItemFood;

public class FoodCookedBacon extends ItemFood {
    public FoodCookedBacon(int hunger, float saturation, boolean isWolfFood) {
        super(hunger, saturation, isWolfFood);
        setUnlocalizedName("cookedBacon");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(main.modTab);
    }
}
