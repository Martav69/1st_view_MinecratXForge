package fr.mak.atelierstage.items;

import fr.mak.atelierstage.Main;
import fr.mak.atelierstage.init.ItemsMod;
import fr.mak.atelierstage.init.MaterialsMod;
import fr.mak.atelierstage.util.handlers.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class TyroliumSword extends ItemSword implements IHasModel {

    private String name = "tyrolium_sword";


    public TyroliumSword(){

        super(MaterialsMod.TYROLIUM_TOOL);

        setUnlocalizedName(name);
        setRegistryName(name);

        ItemsMod.ITEMS.add(this);

    }

    @Override
    public void registerModels(){
        Main.proxy.registerModels(this,0);
    }


}
