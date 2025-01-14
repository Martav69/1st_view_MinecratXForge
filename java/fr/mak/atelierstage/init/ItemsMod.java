package fr.mak.atelierstage.init;

import fr.mak.atelierstage.Global;
import fr.mak.atelierstage.items.Pokeball;
import fr.mak.atelierstage.items.Tyrolium;
import fr.mak.atelierstage.items.TyroliumArmor;
import fr.mak.atelierstage.items.TyroliumSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Global.MODID)
public class ItemsMod {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /* NOS ITEMS */
    public static final Item TYROLIUM = new Tyrolium();

    public static final Item POKEBALL = new Pokeball();

    // Mon épée
    public static final ItemSword TYROLIUM_SWORD = new TyroliumSword();

    public static final ItemArmor TYROLIUM_HELMET = new TyroliumArmor();


}
