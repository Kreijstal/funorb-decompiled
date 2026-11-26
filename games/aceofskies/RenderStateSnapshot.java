/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderStateSnapshot {
    int field_e;
    RenderSprite field_b;
    int field_g;
    RenderStateSnapshot field_c;
    int field_a;
    int field_d;
    static int[] field_f;

    public static void clearRenderStateStatics(int param0) {
        field_f = null;
        if (param0 != 25613) {
          RenderStateSnapshot.clearRenderStateStatics(-119);
        }
    }

    final static void resetTooltip(int param0) {
        SpriteState.field_o = -1;
        ht.field_g = false;
        ScreenParticle.field_o = param0;
        we.field_c = -1;
        StrongCacheReference.field_s = null;
    }

    final void setRenderState(byte param0, int param1, int param2, RenderStateSnapshot param3, int param4, RenderSprite param5, int param6) {
        this.field_b = param5;
        this.field_d = param6;
        this.field_g = param4;
        this.field_e = param1;
        if (param0 != 46) {
          return;
        }
        try {
          this.field_c = param3;
          this.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "fo.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    static {
        field_f = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
