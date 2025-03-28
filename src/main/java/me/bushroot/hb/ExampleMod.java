package com.example.hitboxmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

@Mod("hitboxmod")
public class HitboxMod {
    private static final KeyBinding increaseHitboxKey = new KeyBinding("key.hitboxmod.increase", GLFW.GLFW_KEY_Z, "key.categories.gameplay");
    private static final KeyBinding decreaseHitboxKey = new KeyBinding("key.hitboxmod.decrease", GLFW.GLFW_KEY_X, "key.categories.gameplay");
    
    public HitboxMod() {
        MinecraftForge.EVENT_BUS.register(this);
        ClientRegistry.registerKeyBinding(increaseHitboxKey);
        ClientRegistry.registerKeyBinding(decreaseHitboxKey);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        PlayerEntity player = net.minecraft.client.Minecraft.getInstance().player;
        if (player != null) {
            if (increaseHitboxKey.isPressed()) {
                player.setBoundingBox(player.getBoundingBox().grow(0.5));
            }
            if (decreaseHitboxKey.isPressed()) {
                player.setBoundingBox(player.getBoundingBox().shrink(0.5));
            }
        }
    }
}
