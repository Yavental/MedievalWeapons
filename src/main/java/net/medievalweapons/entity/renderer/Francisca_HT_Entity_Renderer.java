package net.medievalweapons.entity.renderer;

import net.medievalweapons.entity.Francisca_HT_Entity;
import net.medievalweapons.entity.model.Francisca_HT_Entity_Model;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class Francisca_HT_Entity_Renderer extends EntityRenderer<Francisca_HT_Entity> {
  private static final Map<EntityType<?>, Identifier> TEXTURES = new HashMap<>();
  private final Francisca_HT_Entity_Model model = new Francisca_HT_Entity_Model();

  public Francisca_HT_Entity_Renderer(EntityRenderDispatcher entityRenderDispatcher) {
    super(entityRenderDispatcher);
  }

  @Override
  public void render(Francisca_HT_Entity francisca_HT_Entity, float f, float g, MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider, int i) {
    matrixStack.push();
    matrixStack.multiply(Vector3f.POSITIVE_Y
        .getDegreesQuaternion(MathHelper.lerp(g, francisca_HT_Entity.prevYaw, francisca_HT_Entity.yaw) - 90.0F));
    matrixStack.multiply(Vector3f.POSITIVE_Z
        .getDegreesQuaternion(MathHelper.lerp(g, francisca_HT_Entity.prevPitch, francisca_HT_Entity.pitch) + 90.0F));
    VertexConsumer vertexConsumer = ItemRenderer.getArmorVertexConsumer(vertexConsumerProvider,
        model.getLayer(this.getTexture(francisca_HT_Entity)), false, francisca_HT_Entity.enchantingGlint());

    matrixStack.translate(0.0D, -0.75D, 0.0D);
    model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
    matrixStack.scale(1.0F, -1.0F, 1.0F);
    matrixStack.pop();
    super.render(francisca_HT_Entity, f, g, matrixStack, vertexConsumerProvider, i);
  }

  @Override
  public Identifier getTexture(Francisca_HT_Entity francisca_HT_Entity) {
    return getTexture(francisca_HT_Entity.getType());
  }

  public static Identifier getTexture(EntityType<?> type) {
    if (!TEXTURES.containsKey(type)) {
      TEXTURES.put(type,
          new Identifier("medievalweapons", "textures/entity/" + Registry.ENTITY_TYPE.getId(type).getPath() + ".png"));
    }
    return TEXTURES.get(type);
  }
}