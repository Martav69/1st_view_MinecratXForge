package fr.mak.atelierstage.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll();
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for (Item item : ){
            if (item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : ){
            if (block instanceof IHasModel){
                ((IHasModel)block).registerModels();
            }
        }

    }
}