/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    private static String field_z;

    final static void a(boolean param0, int param1) {
        GetReverbWidth.field_o = !param0 ? new bs(bd.field_a, SetOndamageParticleLife.field_o) : new bs(SetMassDriverAimarc.field_p, GetTorpedoProjectileDamage.field_p);
        rga.field_g = new llb(0L, (llb) null);
        rga.field_g.b(-561, GetReverbWidth.field_o.field_a);
        rga.field_g.b(-561, GetShipToShipRamDamage.field_q);
        SetUseCircleFill.field_o = new llb(0L, DualLinkNode.field_g);
        SetUseModels.field_o = new llb((long)param1, (llb) null);
        SetUseCircleFill.field_o.b(param1 ^ -561, sfa.field_d);
        SetUseCircleFill.field_o.b(param1 ^ -561, SetUseModels.field_o);
        SetUseModels.field_o.b(-561, DualLinkNode.field_f);
        SetUseModels.field_o.b(-561, rlb.field_a);
        ok.a((byte) 100, param0);
    }

    static {
        field_z = "ai.A(";
    }
}
