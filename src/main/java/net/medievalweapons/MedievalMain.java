package net.medievalweapons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.medievalweapons.init.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MedievalMain implements ModInitializer {

  public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("medievalweapons", "group"),
      () -> new ItemStack(ItemInit.DIAMOND_FRANCISCA_HT_ITEM));

  @Override
  public void onInitialize() {
    ConfigInit.init();
    EntityInit.init();
    ItemInit.init();
    TagInit.init();

  }

}

// You are LOVED!!!
// Jesus loves you unconditionally!