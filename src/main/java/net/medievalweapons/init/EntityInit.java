package net.medievalweapons.init;

import java.util.LinkedHashMap;
import java.util.Map;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.medievalweapons.entity.Big_Axe_Entity;
import net.medievalweapons.entity.Francisca_HT_Entity;
import net.medievalweapons.entity.Francisca_LT_Entity;
import net.medievalweapons.entity.Healing_Ball_Entity;
import net.medievalweapons.entity.Healing_Staff_Entity;
import net.medievalweapons.entity.Javelin_Entity;
import net.medievalweapons.entity.Lance_Entity;
import net.medievalweapons.item.Big_Axe_Item;
import net.medievalweapons.item.Francisca_HT_Item;
import net.medievalweapons.item.Francisca_LT_Item;
import net.medievalweapons.item.Healing_Staff_Item;
import net.medievalweapons.item.Javelin_Item;
import net.medievalweapons.item.Lance_Item;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EntityInit {

        private static final Map<Identifier, EntityType<?>> ENTITY_TYPES = new LinkedHashMap<>();

        public static final EntityType<Francisca_LT_Entity> WOODEN_FRANCISCA_LT = register("wooden_francisca",
                        create_LT_Francisca(ItemInit.WOODEN_FRANCISCA_LT_ITEM));
        public static final EntityType<Francisca_LT_Entity> STONE_FRANCISCA_LT = register("stone_francisca",
                        create_LT_Francisca(ItemInit.STONE_FRANCISCA_LT_ITEM));
        public static final EntityType<Francisca_HT_Entity> IRON_FRANCISCA_HT = register("iron_francisca",
                        create_HT_Francisca(ItemInit.IRON_FRANCISCA_HT_ITEM));
        public static final EntityType<Francisca_HT_Entity> GOLDEN_FRANCISCA_HT = register("golden_francisca",
                        create_HT_Francisca(ItemInit.GOLDEN_FRANCISCA_HT_ITEM));
        public static final EntityType<Francisca_HT_Entity> DIAMOND_FRANCISCA_HT = register("diamond_francisca",
                        create_HT_Francisca(ItemInit.DIAMOND_FRANCISCA_HT_ITEM));
        public static final EntityType<Francisca_HT_Entity> NETHERITE_FRANCISCA_HT = register("netherite_francisca",
                        create_HT_Francisca(ItemInit.NETHERITE_FRANCISCA_HT_ITEM));

        public static final EntityType<Javelin_Entity> WOODEN_JAVELIN = register("wooden_javelin",
                        create_Javelin(ItemInit.WOODEN_JAVELIN_ITEM));
        public static final EntityType<Javelin_Entity> STONE_JAVELIN = register("stone_javelin",
                        create_Javelin(ItemInit.STONE_JAVELIN_ITEM));
        public static final EntityType<Javelin_Entity> IRON_JAVELIN = register("iron_javelin",
                        create_Javelin(ItemInit.IRON_JAVELIN_ITEM));
        public static final EntityType<Javelin_Entity> GOLDEN_JAVELIN = register("golden_javelin",
                        create_Javelin(ItemInit.GOLDEN_JAVELIN_ITEM));
        public static final EntityType<Javelin_Entity> DIAMOND_JAVELIN = register("diamond_javelin",
                        create_Javelin(ItemInit.DIAMOND_JAVELIN_ITEM));
        public static final EntityType<Javelin_Entity> NETHERITE_JAVELIN = register("netherite_javelin",
                        create_Javelin(ItemInit.NETHERITE_JAVELIN_ITEM));

        public static final EntityType<Big_Axe_Entity> WOODEN_BIG_AXE = register("wooden_big_axe",
                        create_Big_Axe(ItemInit.WOODEN_BIG_AXE_ITEM));
        public static final EntityType<Big_Axe_Entity> STONE_BIG_AXE = register("stone_big_axe",
                        create_Big_Axe(ItemInit.STONE_BIG_AXE_ITEM));
        public static final EntityType<Big_Axe_Entity> IRON_BIG_AXE = register("iron_big_axe",
                        create_Big_Axe(ItemInit.IRON_BIG_AXE_ITEM));
        public static final EntityType<Big_Axe_Entity> GOLDEN_BIG_AXE = register("golden_big_axe",
                        create_Big_Axe(ItemInit.GOLDEN_BIG_AXE_ITEM));
        public static final EntityType<Big_Axe_Entity> DIAMOND_BIG_AXE = register("diamond_big_axe",
                        create_Big_Axe(ItemInit.DIAMOND_BIG_AXE_ITEM));
        public static final EntityType<Big_Axe_Entity> NETHERITE_BIG_AXE = register("netherite_big_axe",
                        create_Big_Axe(ItemInit.NETHERITE_BIG_AXE_ITEM));

        public static final EntityType<Lance_Entity> WOODEN_LANCE = register("wooden_lance",
                        create_Lance(ItemInit.WOODEN_LANCE_ITEM));
        public static final EntityType<Lance_Entity> STONE_LANCE = register("stone_lance",
                        create_Lance(ItemInit.STONE_LANCE_ITEM));
        public static final EntityType<Lance_Entity> IRON_LANCE = register("iron_lance",
                        create_Lance(ItemInit.IRON_LANCE_ITEM));
        public static final EntityType<Lance_Entity> GOLDEN_LANCE = register("golden_lance",
                        create_Lance(ItemInit.GOLDEN_LANCE_ITEM));
        public static final EntityType<Lance_Entity> DIAMOND_LANCE = register("diamond_lance",
                        create_Lance(ItemInit.DIAMOND_LANCE_ITEM));
        public static final EntityType<Lance_Entity> NETHERITE_LANCE = register("netherite_lance",
                        create_Lance(ItemInit.NETHERITE_LANCE_ITEM));

        public static final EntityType<Healing_Staff_Entity> WOODEN_HEALING_STAFF = register("wooden_healing_staff",
                        create_Healing_Staff(ItemInit.WOODEN_HEALING_STAFF));
        public static final EntityType<Healing_Staff_Entity> STONE_HEALING_STAFF = register("stone_healing_staff",
                        create_Healing_Staff(ItemInit.STONE_HEALING_STAFF));
        public static final EntityType<Healing_Staff_Entity> IRON_HEALING_STAFF = register("iron_healing_staff",
                        create_Healing_Staff(ItemInit.IRON_HEALING_STAFF));
        public static final EntityType<Healing_Staff_Entity> GOLDEN_HEALING_STAFF = register("golden_healing_staff",
                        create_Healing_Staff(ItemInit.GOLDEN_HEALING_STAFF));
        public static final EntityType<Healing_Staff_Entity> DIAMOND_HEALING_STAFF = register("diamond_healing_staff",
                        create_Healing_Staff(ItemInit.DIAMOND_HEALING_STAFF));
        public static final EntityType<Healing_Staff_Entity> NETHERITE_HEALING_STAFF = register(
                        "netherite_healing_staff", create_Healing_Staff(ItemInit.NETHERITE_HEALING_STAFF));

        public static final EntityType<Healing_Ball_Entity> HEALING_BALL_ENTITY = register("healing_ball",
                        FabricEntityTypeBuilder.<Healing_Ball_Entity>create(SpawnGroup.MISC, Healing_Ball_Entity::new)
                                        .dimensions(EntityDimensions.fixed(0.3F, 0.3F)).build());

        public static void init() {
                for (Identifier id : ENTITY_TYPES.keySet()) {
                        Registry.register(Registry.ENTITY_TYPE, id, ENTITY_TYPES.get(id));
                }
        }

        private static <T extends EntityType<?>> T register(String name, T type) {
                Identifier id = new Identifier("medievalweapons", name);
                ENTITY_TYPES.put(id, type);
                return type;
        }

        private static EntityType<Francisca_LT_Entity> create_LT_Francisca(Francisca_LT_Item item) {
                return FabricEntityTypeBuilder
                                .<Francisca_LT_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Francisca_LT_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

        private static EntityType<Francisca_HT_Entity> create_HT_Francisca(Francisca_HT_Item item) {
                return FabricEntityTypeBuilder
                                .<Francisca_HT_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Francisca_HT_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

        private static EntityType<Javelin_Entity> create_Javelin(Javelin_Item item) {
                return FabricEntityTypeBuilder
                                .<Javelin_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Javelin_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

        private static EntityType<Big_Axe_Entity> create_Big_Axe(Big_Axe_Item item) {
                return FabricEntityTypeBuilder
                                .<Big_Axe_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Big_Axe_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

        private static EntityType<Lance_Entity> create_Lance(Lance_Item item) {
                return FabricEntityTypeBuilder
                                .<Lance_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Lance_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

        private static EntityType<Healing_Staff_Entity> create_Healing_Staff(Healing_Staff_Item item) {
                return FabricEntityTypeBuilder
                                .<Healing_Staff_Entity>create(SpawnGroup.MISC,
                                                (entity, world) -> new Healing_Staff_Entity(entity, world, item))
                                .dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build();
        }

}