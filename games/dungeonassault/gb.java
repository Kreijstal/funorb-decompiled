/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_e;
    private nh field_d;
    static int field_a;
    private nh field_b;
    private eg field_c;

    final nf a(int param0, int param1) {
        byte[] var4 = null;
        nf var3 = (nf) ((gb) this).field_c.a(-70, (long)param0);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = ((gb) this).field_b.b(5, 1, param0);
        } else {
            var4 = ((gb) this).field_d.b(5, 1, param0 & 32767);
        }
        if (param1 != -19256) {
            return null;
        }
        var3 = new nf();
        if (!(var4 == null)) {
            var3.a(new ec(var4), param1 + 19255);
        }
        if (!(32768 > param0)) {
            var3.d((byte) -74);
        }
        ((gb) this).field_c.a(true, (Object) (Object) var3, (long)param0);
        return var3;
    }

    final static ba a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ba[] var3 = null;
        int var4 = 0;
        ba var5 = null;
        int var6 = 0;
        Object var7 = null;
        ba stackIn_3_0 = null;
        ba stackIn_11_0 = null;
        ba stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ba stackOut_13_0 = null;
        ba stackOut_10_0 = null;
        ba stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var2 = en.a("jagex-last-login-method", (byte) 121, param0);
            if (var2 != null) {
              L1: {
                if (param1 < -74) {
                  break L1;
                } else {
                  var7 = null;
                  ba discarded$2 = gb.a((java.applet.Applet) null, 18);
                  break L1;
                }
              }
              var3 = jg.b((byte) 24);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackOut_13_0 = rl.field_j;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 20886)) {
                    stackOut_10_0 = (ba) var5;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = rl.field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("gb.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    public static void a(int param0) {
        field_e = null;
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{10};
    }
}
