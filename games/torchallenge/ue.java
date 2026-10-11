/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends da {
    static boolean[][] field_i;
    int field_m;
    static int[] field_j;
    int field_k;
    static String field_l;

    final static void a(tc param0, int param1, int param2) {
        pa var3 = null;
        try {
          var3 = dk.field_s;
          var3.d(25, param2);
          var3.d(param1, (byte) 122);
          var3.d(0, (byte) 122);
          var3.d(param0.field_j, (byte) 122);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ue.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var4 = 0;
        int var3 = 0;
        int var2 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = TorChallenge.field_F ? 1 : 0;
        int[] var5Lifetime1;
        int[] var6Lifetime1;
        int var1_intLifetime1;
        int var4Lifetime1;
        int var2Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var3Lifetime1;
        try {
          ii.field_h = new ka[8];
          var1_int = 0;
          ii.field_h[5] = rd.field_i[6];
          ii.field_h[2] = rd.field_i[2];
          ii.field_h[0] = rd.field_i[0];
          ii.field_h[7] = rd.field_i[8];
          var4 = 480 - rd.field_i[0].field_v * 2;
          var3 = 3;
          var2 = rd.field_i[0].field_v;
          ii.field_h[3] = new ka(var3, 480);
          ii.field_h[3].d();
          qg.c(var1_int, var2, var3, var4, si.field_H[0], si.field_H[2]);
          qg.c(var1_int + 1, var2, 1, var4, ih.field_N[0], ih.field_N[2]);
          ii.field_h[3].h();
          ii.field_h[4] = new ka(var3, 480);
          ii.field_h[4].d();
          qg.c(var1_int, var2, var3, var4, si.field_H[1], si.field_H[3]);
          qg.c(var1_int + 1, var2, 1, var4, ih.field_N[1], ih.field_N[3]);
          ii.field_h[4].h();
          var1_intLifetime1 = 0;
          var2Lifetime1 = rd.field_i[0].field_v;
          var3Lifetime1 = 3;
          var4Lifetime1 = -(rd.field_i[0].field_q * 2) + 640;
          ii.field_h[1] = new ka(var3Lifetime1, 640);
          ii.field_h[1].d();
          qg.c(var1_intLifetime1, var2Lifetime1, var3Lifetime1, var4Lifetime1, si.field_H[0], si.field_H[1]);
          qg.c(1 + var1_intLifetime1, var2Lifetime1, 1, var4Lifetime1, ih.field_N[0], ih.field_N[1]);
          var5 = new int[640 * var3Lifetime1];
          for (var7 = 0; var7 < 640; var7++) {
            for (var8 = 0; var3Lifetime1 > var8; var8++) {
              var5[var8 * 640 + var7] = ii.field_h[1].field_y[var8 + var7 * var3Lifetime1];
            }
          }
          var6 = ii.field_h[1].field_y;
          ii.field_h[1].field_p = 0;
          ii.field_h[1].field_v = var3Lifetime1;
          ii.field_h[1].field_s = 0;
          ii.field_h[1].field_u = 640;
          ii.field_h[1].field_y = var5;
          ii.field_h[1].field_q = 640;
          ii.field_h[1].field_x = var3Lifetime1;
          ii.field_h[1].h();
          ii.field_h[6] = new ka(var3Lifetime1, 640);
          ii.field_h[6].d();
          qg.c(var1_intLifetime1, var2Lifetime1, var3Lifetime1, var4Lifetime1, si.field_H[2], si.field_H[3]);
          qg.c(1 + var1_intLifetime1, var2Lifetime1, 1, var4Lifetime1, ih.field_N[2], ih.field_N[3]);
          for (var7Lifetime1 = 0; var7Lifetime1 < 640; var7Lifetime1++) {
            for (var8Lifetime1 = 0; var8Lifetime1 < var3Lifetime1; var8Lifetime1++) {
              var6[var7Lifetime1 + var8Lifetime1 * 640] = ii.field_h[6].field_y[var8Lifetime1 + var7Lifetime1 * var3Lifetime1];
            }
          }
          var8Lifetime2 = 99 % ((-63 - param0) / 49);
          ii.field_h[6].field_u = 640;
          ii.field_h[6].field_y = var6;
          ii.field_h[6].field_v = var3Lifetime1;
          ii.field_h[6].field_p = 0;
          ii.field_h[6].field_q = 640;
          ii.field_h[6].field_x = var3Lifetime1;
          ii.field_h[6].field_s = 0;
          var5Lifetime1 = null;
          ii.field_h[6].h();
          var6Lifetime1 = null;
          la.field_f.a(112);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ue.E(" + param0 + ')');
        }
    }

    final static ti[] a(int param0, pa param1) {
        int var5 = 0;
        Object stackIn_3_0 = null;
        ti[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ti[] var4 = null;
        ti var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param1.e(8, 118);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (ti[]) (stackIn_3_0);
          }
          if (param0 != -8191) {
            ue.c((byte) -109);
          }
          var3 = param1.e(12, param0 ^ 8171);
          var4 = new ti[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (fl.a(param1, (byte) 124)) {
              var6 = new ti();
              param1.e(24, 122);
              param1.e(24, -77);
              var6.field_b = param1.e(24, -17);
              param1.e(9, param0 ^ 8162);
              param1.e(12, 99);
              param1.e(12, -70);
              param1.e(12, param0 + 8311);
              var4[var5] = var6;
            } else {
              var6_int = param1.e(ta.b(var5 - 1, 0), 95);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ue.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        int var1 = -6 % ((90 - param0) / 32);
        field_l = null;
        field_i = (boolean[][]) null;
        field_j = null;
    }

    final static int a(int param0, int param1, int param2, int param3, byte param4) {
        int var5 = -wb.field_p.field_o + param0;
        int var6 = param2 - wb.field_p.field_H;
        if (var5 < 0) {
          var5 = -var5;
        }
        if (param4 != 79) {
          pa var8 = (pa) null;
          ue.a(71, (pa) null);
        }
        if (32 < var5) {
          var5 = 64 - var5;
        }
        if (var6 < 0) {
          var6 = -var6;
        }
        if (var5 > 16) {
          return -1;
        }
        if (var6 * 64 > 240) {
          return -1;
        }
        var6 = var6 * 4 + 1;
        int var7 = var5 * var5 + var6 * var6;
        return var7;
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        var3 = jc.field_c;
        if (var3 >= 5) {
          if (var3 >= 105) {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = -(var3 * var3 * 8192 / 3300) + 8192;
            }
          } else {
            var2 = (var3 * 16384 - 40960) / 220;
          }
        } else {
          var2 = 8192 * (var3 * var3) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 1) {
          var5 = 1;
        }
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var5 = 1;
          var4 = -1;
        }
        if (param1) {
          field_i = (boolean[][]) null;
        }
        if (6 == param0) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 7 ||
          8 == param0) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (14 == param0) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var5 = 1;
          var4 = 1;
        }
        uf.field_n = hh.b(var4 * var2, 7429, var2 * var5);
    }

    static {
        field_i = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{false, false, false}};
        field_j = new int[]{54, 17, 238, 376};
        field_l = "Please enter your age in years";
    }
}
