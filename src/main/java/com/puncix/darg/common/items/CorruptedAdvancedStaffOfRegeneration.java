package com.puncix.darg.common.items;

import com.puncix.darg.core.init.ItemInit;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class CorruptedAdvancedStaffOfRegeneration extends Item {


    public CorruptedAdvancedStaffOfRegeneration(Item.Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_,
                              boolean p_77663_5_) {
        // TODO Auto-generated method stub
        if( p_77663_3_.isAlive()){
            LivingEntity entity = (LivingEntity) p_77663_3_;
            entity.addPotionEffect( new EffectInstance(Effects.REGENERATION, 100));
        }
        super.inventoryTick(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
    }



}
