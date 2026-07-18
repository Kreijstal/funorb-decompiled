/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static cf field_f;
    static int[] field_g;
    static ne field_i;
    static cf field_d;
    static String field_e;
    static boolean field_j;
    static int[] field_h;
    static ge field_c;
    static String field_b;
    static vg[] field_a;

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        hb.field_d = param2;
        sl.field_f = param3;
        if (param0 >= -21) {
            return;
        }
        re.field_A = param4;
        ok.field_e = param1;
    }

    final static void b() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5 = vf.field_b;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "qc.C(" + 0 + ')');
        }
    }

    final static void a(int param0) {
        cj.a((byte) 118, gi.b(param0 ^ 12476));
        if (param0 != 0) {
            field_i = null;
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_h = null;
        field_b = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        td var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 <= 0) {
                var4 = param0;
                break L1;
              } else {
                var8 = new byte[param1];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param1 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[param3 + var5_int];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param2 < -39) {
                break L3;
              } else {
                qc.a(-60);
                break L3;
              }
            }
            var5 = new td();
            var5.a((byte) 0);
            var5.a((long)(param1 * 8), 19668, var4);
            var6 = new byte[64];
            var5.a(var6, -6, 0);
            stackOut_8_0 = (byte[]) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("qc.D(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new cf();
        field_g = new int[]{0, 0};
        field_i = new ne();
        field_e = "You are not currently logged in to the<nbsp>game.";
        field_d = new cf();
        field_b = "To Customer Support";
        field_j = false;
        field_h = new int[256];
    }
}
