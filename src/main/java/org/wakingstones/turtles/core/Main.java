package org.wakingstones.turtles.core;

import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.launch.MixinBootstrap;

public class Main {

    public static void main(String[] args) {
        String[] a = new String[] {
                "--tweakClass","org.wakingstones.turtles.core.CallersBaneTweaker"
        };

        Launch.main(a);
    }
}
