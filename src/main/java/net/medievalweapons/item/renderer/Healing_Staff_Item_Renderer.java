package net.medievalweapons.item.renderer;

import net.medievalweapons.entity.model.Healing_Staff_Entity_Model;
import net.medievalweapons.entity.renderer.Healing_Staff_Entity_Renderer;
import net.medievalweapons.item.Healing_Staff_Item;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public enum Healing_Staff_Item_Renderer {
    INSTANCE;

    private final Healing_Staff_Entity_Model healing_Staff_Entity_Model = new Healing_Staff_Entity_Model();

    public boolean render(LivingEntity entity, ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded,
            MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model) {
        if (renderMode == ModelTransformation.Mode.GUI || renderMode == ModelTransformation.Mode.GROUND
                || renderMode == ModelTransformation.Mode.FIXED) {
            return false;
        }

        matrices.push();
        model.getTransformation().getTransformation(renderMode).apply(leftHanded, matrices);
        matrices.translate(-0.7D, 0.27D, 0.0D);
        matrices.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer spear = ItemRenderer.getItemGlintConsumer(vertexConsumers,
                this.healing_Staff_Entity_Model.getLayer(
                        Healing_Staff_Entity_Renderer.getTexture(((Healing_Staff_Item) stack.getItem()).getType())),
                false, stack.hasGlint());
        this.healing_Staff_Entity_Model.render(matrices, spear, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);

        matrices.pop();
        return true;
    }
}