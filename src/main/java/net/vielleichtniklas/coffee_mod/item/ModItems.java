package net.vielleichtniklas.coffee_mod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vielleichtniklas.coffee_mod.CoffeeMod;

public class ModItems {

    // Create a DeferredRegister to add items to the game
    // The first parameter is the type of the thing we're registering (in this case, Items)
    // The second parameter is the mod ID, which is always the same as our resources location
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoffeeMod.MOD_ID);

    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_bean", 
        () -> new Item(new Item.Properties().food(ModFoods.COFFEE_BEANS)));
    public static final RegistryObject<Item> ROASTED_COFFEE_BEANS = ITEMS.register("roasted_coffee_bean", 
        () -> new Item(new Item.Properties().food(ModFoods.COFFEE_BEANS)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
