/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    final static void a(java.awt.Canvas param0, boolean param1) {
        int discarded$2 = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              mb.a(stackIn_3_0 != 0, (java.awt.Component) ((Object) param0));
              if (param1) {
                break L2;
              } else {
                discarded$2 = mm.a(-16, (byte) -13);
                break L2;
              }
            }
            L3: {
              aq.a((byte) 60, (java.awt.Component) ((Object) param0));
              if (ok.field_g == null) {
                break L3;
              } else {
                ok.field_g.a(13212, (java.awt.Component) ((Object) param0));
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("mm.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static dl[] a(int param0) {
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = CrazyCrystals.field_B;
        dl[] var1 = new dl[mg.field_a];
        for (var2 = 0; var2 < mg.field_a; var2++) {
            var3 = uo.field_l[var2] * je.field_c[var2];
            var10 = ui.field_c[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = gh.field_z[pf.b((int) var10[var6], 255)];
            }
            var1[var2] = new dl(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var11);
        }
        ok.a(2188450);
        var2 = -46 % ((-74 - param0) / 50);
        return var1;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 >>> -203503967 & 1431655765) + (1431655765 & param0);
        param0 = (param0 >>> 1545119490 & 1932735283) + (858993459 & param0);
        param0 = (param0 >>> 1801319588) + param0 & 252645135;
        param0 = param0 + (param0 >>> 382367976);
        param0 = param0 + (param0 >>> -329116048);
        if (param1 >= -22) {
            return -82;
        }
        return param0 & 255;
    }

    static {
    }
}
