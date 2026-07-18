/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ch implements vo {
    static String field_K;
    static String field_I;
    private qm field_N;
    static String field_P;
    static int field_M;
    private qm field_L;
    static tf field_O;
    private qm field_J;

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        c.m(67);
        if (gi.field_a < 0) {
          gk.field_lb.field_cb = null;
          return;
        } else {
          gk.field_lb.field_cb = sd.a(oi.field_d, 89, new String[1]);
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = ((jh) this).field_z - -param2;
        int var6 = ((jh) this).field_p - -param0;
        int var7 = 87 % ((70 - param3) / 49);
        int discarded$0 = he.field_d.a(wi.field_n, 20 + var5, 20 + var6, -40 + ((jh) this).field_E, -50 + ((jh) this).field_C, 16777215, -1, 1, 0, he.field_d.field_w);
        super.a(param0, param1, param2, (byte) 122);
    }

    final boolean a(int param0, int param1, ng param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param0) {
                stackOut_5_0 = ((jh) this).a(0, param2);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param0 != 99) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((jh) this).b(10, param2);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("jh.G(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
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
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 11) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$4 = ((jh) this).a(-91, 51, (ng) null, '0');
                break L1;
              }
            }
            if (((jh) this).field_N != param0) {
              if (((jh) this).field_J != param0) {
                if (param0 != ((jh) this).field_L) {
                  break L0;
                } else {
                  jo.a(-22218);
                  return;
                }
              } else {
                id.a(param2 + 87);
                return;
              }
            } else {
              int discarded$5 = 1;
              nm.b();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("jh.Q(");
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public jh() {
        super(0, 0, 476, 225, (eb) null);
        ((jh) this).field_J = new qm(sd.field_M, (fn) null);
        ((jh) this).field_N = new qm(ii.field_v, (fn) null);
        ((jh) this).field_L = new qm(fc.field_c, (fn) null);
        ad var1 = new ad();
        ((jh) this).field_J.field_y = (eb) (Object) var1;
        ((jh) this).field_N.field_y = (eb) (Object) var1;
        ((jh) this).field_L.field_y = (eb) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        ((jh) this).field_N.a(var4, (byte) 98, -var2 + (((jh) this).field_C + -48), -var3 + ((jh) this).field_E >> 1, 30);
        ((jh) this).field_L.a(var4, (byte) 85, -var2 + ((jh) this).field_C + -48, var2 + (var4 + (-var3 + ((jh) this).field_E >> 1)), 30);
        ((jh) this).field_J.a(var3, (byte) 103, -(2 * var2) + (((jh) this).field_C - 78), ((jh) this).field_E - var3 >> 1, 30);
        ((jh) this).field_N.field_n = (fn) this;
        ((jh) this).field_J.field_n = (fn) this;
        ((jh) this).field_J.field_l = rp.field_a;
        ((jh) this).field_L.field_n = (fn) this;
        ((jh) this).field_L.field_l = up.field_q;
        ((jh) this).b((ng) (Object) ((jh) this).field_N, 80);
        ((jh) this).b((ng) (Object) ((jh) this).field_J, 80);
        ((jh) this).b((ng) (Object) ((jh) this).field_L, 80);
    }

    public static void a() {
        field_K = null;
        field_P = null;
        field_I = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Loading music";
        field_K = "Return to Main Menu";
        field_P = "Public chat is unavailable while setting up a rated game.";
    }
}
