/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_e;
    static int field_b;
    static hj[] field_i;
    static bm[] field_g;
    static bm[] field_d;
    static byte[][] field_h;
    volatile boolean field_a;
    static gn field_c;
    java.awt.Frame field_f;
    static e field_j;

    public static void b(int param0) {
        field_h = null;
        if (param0 != 0) {
          field_e = null;
          field_c = null;
          field_j = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_i = null;
          return;
        } else {
          field_c = null;
          field_j = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_i = null;
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final static String c(int param0) {
        if (param0 != 4) {
            ef.b(12);
            if (!(bb.field_a != sf.field_n)) {
                return qd.field_k;
            }
            return o.field_d;
        }
        if (!(bb.field_a != sf.field_n)) {
            return qd.field_k;
        }
        return o.field_d;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((ef) this).field_a = true;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ef.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void a(gn param0, byte param1, gn param2) {
        try {
            n.field_w = param0;
            be.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ef.D(" + (param0 != null ? "{...}" : "null") + ',' + -126 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ib param0, int param1) {
        try {
            if (param1 != 50) {
                String discarded$0 = ef.c(62);
            }
            rd.a((byte) 118, param0, ((ef) this).field_f);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ef.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static float a(float param0, wd param1, int param2, float param3) {
        RuntimeException var4 = null;
        qm var5 = null;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        qm var13 = null;
        float stackIn_3_0 = 0.0f;
        float stackIn_5_0 = 0.0f;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        float stackOut_2_0 = 0.0f;
        float stackOut_4_0 = 0.0f;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param1.field_k != 0) {
              stackOut_2_0 = 0.0f;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var13 = param1.a(false, param3);
              var5 = param1.a(false, param0);
              var6 = (float)(var5.field_h + -var13.field_h);
              var7 = (float)(var5.field_f - var13.field_f);
              var8 = (-param3 + param0) * param1.f(50) * param1.field_o;
              var9 = var8 * -var6;
              var10 = -var7 * var8;
              var11 = var7 * var7 + var6 * var6;
              var12 = (float)Math.sqrt((double)(var11 * var11 + (var9 * var9 + var10 * var10)));
              var10 = var10 / var12;
              var9 = var9 / var12;
              stackOut_4_0 = (var9 + var10) * -5.0f;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + 14 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    ef() {
    }

    final static void a(int param0) {
        if (!(mn.field_a)) {
            throw new IllegalStateException();
        }
        bn.field_j = true;
        ol.a(true, (byte) -90);
        bk.field_w = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This game has been updated! Please reload this page.";
        field_h = new byte[50][];
        field_j = new e(14, 0, 4, 1);
    }
}
