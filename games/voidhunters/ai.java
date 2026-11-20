/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    private static String field_z;

    final static void a(boolean param0, int param1) {
        GetReverbWidth.field_o = !param0 ? new bs(bd.field_a, SetOndamageParticleLife.field_o) : new bs(SetMassDriverAimarc.field_p, GetTorpedoProjectileDamage.field_p);
        WaterTextures.field_g = new Widget(0L, (Widget) null);
        WaterTextures.field_g.addChild(-561, GetReverbWidth.field_o.field_a);
        WaterTextures.field_g.addChild(-561, GetShipToShipRamDamage.field_q);
        SetUseCircleFill.field_o = new Widget(0L, DualLinkNode.field_g);
        SetUseModels.field_o = new Widget((long)param1, (Widget) null);
        SetUseCircleFill.field_o.addChild(param1 ^ -561, ProjectileHit.field_d);
        SetUseCircleFill.field_o.addChild(param1 ^ -561, SetUseModels.field_o);
        SetUseModels.field_o.addChild(-561, DualLinkNode.field_f);
        SetUseModels.field_o.addChild(-561, LegacyOpenGlTextureCache.field_a);
        ShipBodyFactory.a((byte) 100, param0);
    }

    static {
        field_z = "ai.A(";
    }
}
