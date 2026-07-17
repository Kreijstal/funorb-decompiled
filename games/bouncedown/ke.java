/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends ai {
    static String field_l;
    int field_j;
    static boolean field_p;
    int field_o;
    static String field_m;
    int field_h;
    int field_k;
    int field_i;
    static String field_n;
    int field_g;

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (param2) {
              if (10 > sa.field_k) {
                L1: {
                  var3_int = 0;
                  if (!ae.field_b) {
                    break L1;
                  } else {
                    ae.field_b = false;
                    var3_int = 1;
                    break L1;
                  }
                }
                ai.a(var3_int != 0, da.field_d, -24, mj.b((byte) -26), jk.a((byte) -105));
                break L0;
              } else {
                if (!tk.c(250)) {
                  na.a();
                  pc.a(240, (byte) -66, 320);
                  qi.a(param0, 0, 0, -25971);
                  return;
                } else {
                  if (mh.field_U == 0) {
                    of.a(false, param1, (byte) -48);
                    qi.a(param0, 0, 0, -25971);
                    return;
                  } else {
                    i.a(param0, 0);
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ke.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 - -1;
    }

    public static void a(int param0) {
        field_m = null;
        field_l = null;
        field_n = null;
    }

    ke(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ke) this).field_k = param3;
        ((ke) this).field_j = param4;
        ((ke) this).field_g = param0;
        ((ke) this).field_i = param1;
        ((ke) this).field_h = param2;
        ((ke) this).field_o = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please check if address is correct";
        field_n = "Waiting for music";
    }
}
