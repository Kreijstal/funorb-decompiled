/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static java.math.BigInteger field_d;
    static tf[] field_e;
    static String field_a;
    static cn field_f;
    static String field_b;
    static int field_c;
    static int[] field_g;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = DungeonAssault.field_K;
        if (param3 < param7) {
            if (param7 < param6) {
                ue.a(param3, gf.field_b, param5, param6, param0, param7, param1, param2, 16);
                return;
            }
            if (param3 < param6) {
                ue.a(param3, gf.field_b, param5, param7, param2, param6, param1, param0, 16);
                return;
            }
            ue.a(param6, gf.field_b, param5, param7, param1, param3, param2, param0, 16);
            return;
        }
        if (param3 >= param6) {
            if (param6 <= param7) {
                ue.a(param6, gf.field_b, param5, param3, param0, param7, param2, param1, 16);
                return;
            }
            ue.a(param7, gf.field_b, param5, param3, param2, param6, param0, param1, 16);
            return;
        }
        ue.a(param7, gf.field_b, param5, param6, param1, param3, param0, param2, 16);
    }

    final static void a(int param0) {
        hl.a(true);
        sn.a(param0 ^ 61, param0);
    }

    final static void a(int param0, nh param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        qh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        wj var8 = null;
        int var9 = 0;
        wj var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var8 = new wj(param1.a("logo.fo3d", "", (byte) -113));
            var10 = var8;
            var3 = var10.c(true);
            var10.e(false);
            ch.field_n = lo.a(var10, (byte) -128);
            ih.field_w = new qh[var3];
            lk.field_R = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                var10.f((byte) 32);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    break L0;
                  } else {
                    var5 = ih.field_w[var9];
                    var5.a(1, false, 6, 6, 6);
                    var5.a((byte) -127);
                    var6 = new int[]{var5.field_H - -var5.field_i >> 1, var5.field_p - -var5.field_M >> 1, var5.field_a + var5.field_b >> 1};
                    lk.field_R[var9] = var6;
                    var5.a(0, -var6[0], -var6[2], -var6[1]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                ih.field_w[var4] = df.a(false, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("kd.E(").append(31913).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void b(int param0) {
        l.a(false, 0, 0, 0, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 1, 0, 0, 0, 0, 0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 2, 0, 0, 0, 0, 0, new int[0][], 0, true, 0);
        l.a(false, 0, 0, 3, 0, 0, 0, 0, param0, new int[0][], 0, false, 0);
        l.a(false, 0, 0, 5, 1, 1, 0, 100, 0, new int[0][], 0, false, 1);
        l.a(true, 0, 0, 4, 4, 1, 0, 200, param0, new int[1][], 0, false, 1);
        l.a(true, 0, 0, 6, 2, 1, 1, 300, 0, new int[1][], 3500, false, 2);
        l.a(true, 0, 0, 7, 6, 1, 0, 500, 0, new int[1][], 7500, false, 3);
        l.a(false, 0, 0, 8, 3, 1, 1, 600, param0, new int[1][], 11000, false, 4);
        l.a(true, 0, 0, 9, 4, 1, 0, 800, 0, new int[1][], 16000, false, 3);
        l.a(true, 0, 0, 11, 3, 1, 1, 1100, 0, new int[0][], 20000, true, 7);
        l.a(true, 6, 8, 21, 5, 2, 1, 1400, param0, new int[1][], 27500, false, 0);
        l.a(true, 6, 0, 12, 6, 1, 0, 1500, 0, new int[1][], 32000, true, 4);
        l.a(true, 0, 0, 13, 7, 1, 1, 1800, 0, new int[1][], 39000, false, 7);
        l.a(false, 0, 0, 10, 8, 1, 2, 2200, 0, new int[2][], 55000, true, 4);
        l.a(false, 0, 0, 14, 6, 1, 3, 2300, 0, new int[0][], 65000, true, 8);
        l.a(false, 0, 0, 35, 2, 3, 0, 100, param0, new int[1][], 0, false, 0);
        l.a(false, 0, 0, 36, 0, 3, 1, 1100, 0, new int[2][], 23000, false, 6);
        l.a(false, 0, 0, 37, 9, 3, -1, 2200, 0, new int[1][], 60000, false, 0);
        l.a(true, 1, 1, 15, 1, 2, 0, 100, 0, new int[0][], 0, false, 1);
        l.a(true, 1, 1, 16, 2, 2, 0, 200, 0, new int[1][], 0, false, 0);
        l.a(true, 2, 2, 17, 1, 2, 1, 300, 0, new int[0][], 4500, false, 1);
        l.a(true, 2, 1, 25, 3, 2, param0, 350, 0, new int[0][], 5500, false, 1);
        l.a(true, 2, 3, 18, 1, 2, 0, 400, param0, new int[0][], 6500, false, 1);
        l.a(true, 2, 3, 24, 3, 2, 1, 500, 0, new int[2][], 8500, false, 1);
        l.a(true, 2, 3, 19, 1, 2, 0, 600, 0, new int[0][], 9500, false, 4);
        l.a(true, 2, 4, 20, 3, 2, 0, 700, 0, new int[1][], 11500, false, 0);
        l.a(true, 5, 2, 23, 4, 2, -1, 800, 0, new int[1][], 12500, false, 3);
        l.a(true, 2, 2, 27, 5, 2, 0, 850, param0, new int[1][], 14000, false, 2);
        l.a(true, 3, 5, 30, 1, 2, -1, 900, 0, new int[0][], 18000, true, 4);
        l.a(true, 5, 4, 28, 2, 2, 1, 1100, 0, new int[2][], 21500, false, 6);
        l.a(true, 6, 6, 31, 2, 2, 1, 1200, 0, new int[0][], 24500, true, 0);
        l.a(true, 6, 2, 29, 4, 2, -1, 1300, 0, new int[0][], 26000, true, 6);
        l.a(true, 4, 8, 26, 7, 2, 0, 1400, 0, new int[1][], 30000, false, 0);
        l.a(true, 7, 7, 22, 1, 2, 1, 1800, 0, new int[1][], 35000, false, 1);
        l.a(true, 5, 4, 32, 7, 2, 1, 1900, 0, new int[1][], 42000, true, 4);
        l.a(true, 9, 5, 33, 8, 2, 2, 2200, 0, new int[0][], 62000, true, 5);
        l.a(true, 10, 6, 34, 10, 2, 3, 3000, param0, new int[1][], 70000, true, 5);
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_b = null;
    }

    final synchronized static long c(int param0) {
        long var1 = System.currentTimeMillis();
        if (~var1 > ~lo.field_f) {
            fb.field_c = fb.field_c + (-var1 + lo.field_f);
            if (param0 == -2456) {
                lo.field_f = var1;
                return fb.field_c + var1;
            }
            kd.b(-64);
            lo.field_f = var1;
            return fb.field_c + var1;
        }
        if (param0 != -2456) {
            kd.b(-64);
            lo.field_f = var1;
            return fb.field_c + var1;
        }
        lo.field_f = var1;
        return fb.field_c + var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Just play";
        field_a = "Fullscreen";
        field_g = new int[4];
    }
}
