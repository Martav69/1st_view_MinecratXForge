package fr.mak.atelierstage.init;

import fr.mak.atelierstage.Global;
import fr.mak.atelierstage.items.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
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
    public static final ItemPickaxe TYROLIUM_PICKAXE = new TyroliumPickaxe();
    public static final ItemTool TYROLIUM_AXE = new TyroliumAxe();
    public static final ItemSpade TYROLIUM_SHOVEL = new TyroliumShovel();
    public static final ItemHoe TYROLIUM_HOE = new TyroliumHoe();

    public static final ItemArmor TYROLIUM_HELMET = new TyroliumArmor(EntityEquipmentSlot.HEAD);
    public static final ItemArmor TYROLIUM_CHESTPLATE = new TyroliumArmor(EntityEquipmentSlot.CHEST);
    public static final ItemArmor TYROLIUM_BOOTS = new TyroliumArmor(EntityEquipmentSlot.FEET);
    public static final ItemArmor TYROLIUM_LEGGINGS = new TyroliumArmor(EntityEquipmentSlot.LEGS);


}
