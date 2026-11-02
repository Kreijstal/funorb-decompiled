/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends BoardChange {
    static String field_m;

    public bg() {
        this.field_j = 5;
    }

    final void a(boolean param0, BattleState param1) {
        try {
          param1.field_K = 0;
          param1.field_x = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bg.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    bg(PacketBuffer param0) {
        try {
          this.field_j = 5;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_m = null;
        if (param0 != 5) {
          bg.releaseStatics(92);
        }
    }

    final static void a(int param0) {
        aja.field_p = null;
        qc.field_b = null;
        lna.field_q = true;
        qq.field_k = null;
        bi.field_h = null;
        int var1 = -34 / ((-5 - param0) / 54);
        if (lna.field_C == null) {
          BoardChangeAnimation.field_k = null;
          return;
        }
        DisableSpecial.field_r = qk.field_q;
        HailAnimation.field_A = lna.field_C;
        HailAnimation.field_A.field_ab = -1;
        HailAnimation.field_A.field_G = -1;
        qk.field_q = null;
        lna.field_C = null;
        BoardChangeAnimation.field_k = null;
    }

    static {
        field_m = "Find opponents";
    }
}
