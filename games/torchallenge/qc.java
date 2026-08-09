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

    final static void b(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5 = vf.field_b;
            var1 = var5;
            var2 = param0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "qc.C(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        cj.a((byte) 118, gi.b(param0 ^ 12476));
        if (param0 != 0) {
            field_i = (ne) null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 != 26) {
          qc.a((byte) 37, 124, -19, 37, -63);
          field_h = null;
          field_b = null;
          field_e = null;
          field_i = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_b = null;
          field_e = null;
          field_i = null;
          field_f = null;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, byte param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        td var5 = null;
        byte[] var6 = null;
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
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("qc.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    static {
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
