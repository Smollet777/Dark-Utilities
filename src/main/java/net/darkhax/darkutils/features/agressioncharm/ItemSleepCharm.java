package net.darkhax.darkutils.features.agressioncharm;

import baubles.api.BaubleType;
import net.darkhax.bookshelf.util.baubles.ItemBauble;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class ItemSleepCharm extends ItemBauble {

    public ItemSleepCharm () {

        this.setMaxStackSize(1);
    }

    @Override
    @Optional.Method(modid = "baubles")
    public BaubleType getBaubleType (ItemStack itemstack) {

        return BaubleType.CHARM;
    }
}