package fr.mak.atelierstage.items;

import fr.mak.atelierstage.Main;
import fr.mak.atelierstage.init.ItemsMod;
import fr.mak.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Tyrolium extends Item implements IHasModel {

    /* PROPERTY */
    private String name = "tyrolium";

    /* FUNCTION */

    /* CONSTRUCT */
    public Tyrolium(){

        // nom qu'on va donner dans minecraft
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.COMBAT);

        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerModels(this,0);

    }
}
