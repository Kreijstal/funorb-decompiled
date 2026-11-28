/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static java.awt.Image field_d;
    static SoundCache loadingSoundCache;
    static st field_a;
    static PcmStreamMixer pcmMixer;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        pcmMixer = null;
        int var1 = -119 % ((param0 + 44) / 62);
        field_d = null;
        loadingSoundCache = null;
    }

    final static String b(int param0) {
        if (2 > SectorCacheStore.field_c) {
          return ji.field_a;
        }
        if (ij.field_h != null) {
          if (!ij.field_h.ensureIndexLoaded((byte) 94)) {
            return gm.field_w;
          }
          return dt.field_b;
        }
        if (!oi.field_a.ensureIndexLoaded((byte) 86)) {
          return co.field_j;
        }
        if (!oi.field_a.c("commonui", -14012)) {
          return lm.field_b + " - " + oi.field_a.getGroupLoadPercentByName("commonui", (byte) -79) + "%";
        }
        if (!uj.field_b.ensureIndexLoaded((byte) -21)) {
          return bk.field_g;
        }
        if (!uj.field_b.c("commonui", -14012)) {
          return ks.field_c + " - " + uj.field_b.getGroupLoadPercentByName("commonui", (byte) -79) + "%";
        }
        if (!cf.field_f.ensureIndexLoaded((byte) 106)) {
          return Bzip2State.field_I;
        }
        if (param0 >= -88) {
          qn.clearStaticReferences(82);
        }
        if (!cf.field_f.tryLoadAllGroups(0)) {
          return RenderStateStack.field_g + " - " + cf.field_f.a(-82) + "%";
        }
        return jr.field_r;
    }

    static {
        field_a = new st();
    }
}
