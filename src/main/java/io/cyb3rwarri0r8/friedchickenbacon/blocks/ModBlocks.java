package io.cyb3rwarri0r8.friedchickenbacon.blocks;

import io.cyb3rwarri0r8.friedchickenbacon.help.ModBlockCrops;
import io.cyb3rwarri0r8.friedchickenbacon.help.RegisterHelper;
import io.cyb3rwarri0r8.friedchickenbacon.main;
import net.minecraft.block.Block;

/**
 * Created by noah on 9/4/14.
 */
public class ModBlocks
{
    public static Block deepFryer_idle;
    public static Block deepFryer_active;

    public static Block oilPress_idle;
    public static Block oilPress_active;

    public static Block peanutCrop;


    public static void loadBlocks()
    {
        deepFryer_idle = new BlockDeepFryer(false).setBlockName("deepFryerIdle").setCreativeTab(main.modTab);
        RegisterHelper.registerBlock(deepFryer_idle);

        deepFryer_active = new BlockDeepFryer(true).setBlockName("deepFryerActive");
        RegisterHelper.registerBlock(deepFryer_active);

        oilPress_idle = new BlockOilPress(false).setBlockName("oilPressIdle").setCreativeTab(main.modTab);
        RegisterHelper.registerBlock(oilPress_idle);

        oilPress_active = new BlockOilPress(true).setBlockName("oilPressActive");
        RegisterHelper.registerBlock(oilPress_active);

        peanutCrop = new ModBlockCrops();
        RegisterHelper.registerBlock(peanutCrop);

    }
}
