package fr.mak.atelierstage.init;

import fr.mak.atelierstage.Global;
import fr.mak.atelierstage.items.Pokeball;
import fr.mak.atelierstage.items.Tyrolium;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /* NOS ITEMS */
    public static final Item TYROLIUM = new Tyrolium();

    public static final Item POKEBALL = new Pokeball();


}
