package net.moistymonsoon.gunge.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.moistymonsoon.gunge.Gunge;
import net.moistymonsoon.gunge.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Gunge.MOD_ID);

    public static final Supplier<CreativeModeTab> GUNGE_TAB =
            CREATIVE_MODE_TABS.register("gunge_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gunge.gunge_tab"))
                    .icon(() -> new ItemStack(ModBlocks.MOSSY_LENTARITE.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.LENTARITE);
                        output.accept(ModBlocks.MOSSY_LENTARITE);
                        output.accept(ModBlocks.CHLORITE);
                        output.accept(ModBlocks.SAPPHIRITE);
                        output.accept(ModBlocks.GLACIAL_ICE);
                    })
                    .build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
