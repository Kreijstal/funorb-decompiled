/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_c;
    volatile boolean field_f;
    static sna field_e;
    static sna field_a;
    java.awt.Frame field_g;
    static sna field_d;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            ((kg) this).field_f = true;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kg.focusLost(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        String var7 = null;
        if (gk.field_d != 2) {
            var7 = ama.field_k;
        } else {
            var7 = oka.field_t;
        }
        jna.a(param1, param2, -1, param3, var7, 180, param6, 320);
    }

    final void a(int param0, ht param1) {
        try {
            int var3_int = 80 / ((-61 - param0) / 41);
            gv.a(-110, param1, ((kg) this).field_g);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "kg.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    kg() {
    }

    final static void a(vr param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ma var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pf var8 = null;
        int var9 = 0;
        pf var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = new pf(param0.a((byte) 123, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.b(16711935);
            var10.m(1);
            ld.field_o = ni.a((byte) 41, var10);
            bd.field_l = new int[var3][];
            gaa.field_i = new ma[var3];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.i((byte) -86);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = gaa.field_i[var9];
                    var5.a(0, 6, 6, 6, 1);
                    var5.b(117);
                    var6 = new int[]{var5.field_u + var5.field_A >> 1, var5.field_G - -var5.field_B >> 1, var5.field_q + var5.field_I >> 1};
                    bd.field_l[var9] = var6;
                    var5.a(-var6[2], 0, -var6[1], -var6[0]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                gaa.field_i[var4] = sa.a(false, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("kg.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 112 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Friends";
    }
}
