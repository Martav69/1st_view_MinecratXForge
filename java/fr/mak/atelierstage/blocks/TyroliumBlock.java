package fr.mak.atelierstage.blocks;

import fr.mak.atelierstage.Main;
import fr.mak.atelierstage.init.BlocksMod;
import fr.mak.atelierstage.init.ItemsMod;
import fr.mak.atelierstage.util.handlers.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class TyroliumBlock extends Block implements IHasModel {

    private String name = "tyrolium_block";

    public TyroliumBlock(){

        super(Material.IRON);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);

        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));

    }

    @Override
    public void registerModels(){
        Main.proxy.registerModels(Item.getItemFromBlock(this), 0);
    }

}
