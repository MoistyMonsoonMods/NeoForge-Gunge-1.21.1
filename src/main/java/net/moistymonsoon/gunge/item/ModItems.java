package net.moistymonsoon.gunge.item;

import net.moistymonsoon.gunge.Gunge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Gunge.MOD_ID);




    public static void register(IEventBus eventBus) {ITEMS.register(eventBus); }
}
