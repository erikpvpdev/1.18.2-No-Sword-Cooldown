package code.erikpvp.cooldown;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NoCooldown.MOD_ID)
public class NoCooldown {
    public static final String MOD_ID = "nocooldown";

    public NoCoolDown() {
        // EventBus holen
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Hier registrierst du Items, Blöcke, etc. z.B.
        // ModItems.register(modEventBus);
        // ModBlocks.register(modEventBus);

        // Weitere Initialisierung falls nötig
    }
}
