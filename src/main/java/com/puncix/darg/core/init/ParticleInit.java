package com.puncix.darg.core.init;

import com.puncix.darg.Darg;
import net.minecraft.client.particle.Particle;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleInit {
    public static final DeferredRegister<ParticleType<?>> PARTICLES
        = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Darg.MOD_ID);
    public static final RegistryObject<BasicParticleType> BLACK_PARTICLE = PARTICLES.register("black_particle", () -> new BasicParticleType(true));
}