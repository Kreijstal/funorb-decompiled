/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends uc {
    private tf[] field_s;
    private int field_q;
    static String field_r;
    static wm field_u;
    static tf field_w;
    private int field_v;
    private int field_t;

    final static boolean[] a(hh param0, int param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        boolean[] var5 = new boolean[param0.field_f * param0.field_a];
        boolean[] var2 = var5;
        if (param1 != 21922) {
            field_u = null;
        }
        for (var3 = 0; var5.length > var3; var3++) {
            var5[var3] = -2 > (param0.field_n[var3] ^ -1) ? true : false;
        }
        return var5;
    }

    final static te a(int param0, ak param1, int[] param2, ak param3, ak param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        te[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        kp var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Throwable decompiledCaughtException = null;
        var12 = Pixelate.field_H ? 1 : 0;
        var5 = param2.length;
        var6 = new String[var5];
        var14 = new char[var5];
        var13 = var14;
        var7 = var13;
        var8 = new te[var5];
        var9 = (char)param0;
        try {
          L0: {
            var10_int = 0;
            L1: while (true) {
              if (var10_int >= var5) {
                break L0;
              } else {
                var11 = jd.field_k.a(-21209, param2[var10_int]);
                var6[var10_int] = var11.a((byte) -54);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = (Exception) (Object) decompiledCaughtException;
          return null;
        }
        return new te(0L, param4, param1, param3, var8, param2, var6, var14);
    }

    public static void c(int param0) {
        field_w = null;
        field_r = null;
        if (param0 > -24) {
            Object var2 = null;
            ad.a((tf[]) null, 23, -123, 94);
        }
        field_u = null;
    }

    final static void a(tf[] param0, int param1, int param2, int param3) {
        if (param2 > -57) {
            Object var5 = null;
            boolean[] discarded$0 = ad.a((hh) null, -30);
        }
        he.field_a = new sb(param0);
        gh.field_t = param3;
        we.field_n = param1;
        bb.h(-126);
    }

    public ad() {
        this(2188450, 2591221, 9543);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 == -124) {
          L0: {
            if (!param0.field_D) {
              if (param0.b(true)) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var6 = stackIn_8_0;
            if (param0 instanceof qm) {
              param4 = param4 & ((qm) (Object) param0).field_H;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param4) {
              if (var6 == 0) {
                stackOut_15_0 = ((ad) this).field_t;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              } else {
                stackOut_14_0 = ((ad) this).field_q;
                stackIn_16_0 = stackOut_14_0;
                break L2;
              }
            } else {
              stackOut_12_0 = ((ad) this).field_v;
              stackIn_16_0 = stackOut_12_0;
              break L2;
            }
          }
          L3: {
            var7 = stackIn_16_0;
            td.a(param3 - -param0.field_z, param0.field_p + (param2 - -(param0.field_C - ((ad) this).field_s[0].field_B >> 172295841)), param0.field_E, ((ad) this).field_s, (byte) 121, var7);
            if (param4) {
              stackOut_18_0 = 16777215;
              stackIn_19_0 = stackOut_18_0;
              break L3;
            } else {
              stackOut_17_0 = 7105644;
              stackIn_19_0 = stackOut_17_0;
              break L3;
            }
          }
          var8 = stackIn_19_0;
          int discarded$2 = ((ad) this).field_a.a(param0.field_q, param3 - -param0.field_z, param2 - -param0.field_p + -2, param0.field_E, param0.field_C, var8, -1, 1, 1, ((ad) this).field_a.field_w);
          return;
        } else {
          return;
        }
    }

    private ad(int param0, int param1, int param2) {
        ((ad) this).field_v = param2;
        ((ad) this).field_q = param1;
        ((ad) this).field_t = param0;
        ((ad) this).field_a = ba.field_d;
        ((ad) this).field_s = fc.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new wm(15, 0, 1, 0);
    }
}
