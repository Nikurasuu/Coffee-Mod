package net.vielleichtniklas.coffee_mod.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vielleichtniklas.coffee_mod.CoffeeMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COFFEE_MOD_TAB = CREATIVE_MODE_TABS.register("coffee_mod_tab", 
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COFFEE_BEANS.get()))
                .title(Component.translatable("creativetab.coffee_mod_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.COFFEE_BEANS.get());
                    pOutput.accept(ModItems.ROASTED_COFFEE_BEANS.get());
                })
                .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
