/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static java.awt.Color field_d;
    static int[] field_b;
    static int field_a;
    static String field_c;
    static int[] field_e;

    final static void b() {
        we var1 = (we) (Object) ug.field_g.a((byte) 74);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        tc.a(var1.field_k, var1.field_s, var1.field_m);
        tc.a(var1.field_i, var1.field_r, var1.field_q, var1.field_u);
        var1.field_k = null;
        fl.field_i.a((byte) -101, (hl) (Object) var1);
    }

    public static void a() {
        field_b = null;
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            li.c();
            il.field_c = 11;
            qf.field_i = new int[260];
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (qf.field_i.length <= var5) {
                    break L0;
                  } else {
                    qf.field_i[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                qf.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "dm.D(" + 255 + ')');
        }
    }

    final static void a(da param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            eg.a(d.field_c[param1], 16, true, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("dm.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + 255 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new java.awt.Color(10040319);
        field_b = new int[4];
        field_a = 0;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
