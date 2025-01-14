package fr.mak.atelierstage.items;

import fr.mak.atelierstage.Main;
import fr.mak.atelierstage.init.ItemsMod;
import fr.mak.atelierstage.init.MaterialsMod;
import fr.mak.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TyroliumPickaxe extends ItemPickaxe implements IHasModel {

    private String name = "tyrolium_pickaxe";

    public TyroliumPickaxe(){

        super(MaterialsMod.TYROLIUM_TOOL);

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
