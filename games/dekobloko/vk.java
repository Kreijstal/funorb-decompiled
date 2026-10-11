/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static qm field_d;
    static int field_f;
    static String field_e;
    static byte[][] field_c;
    static ig field_a;
    static String[] field_b;

    final static void a(boolean param0, int param1) {
        dd.a(param0, false, (byte) 66);
        if (param1 != 841566312) {
          field_f = 7;
        }
    }

    final static void a(int param0, byte param1, ck[] param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = client.field_A ? 1 : 0;
        try {
          if (param2 == null) {
            return;
          }
          if (param3 > 0 &&
            param0 > 0) {
            if (null == param2[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param2[3].field_K;
            }
            var6_int = stackIn_10_0;
            if (param2[5] != null) {
              stackIn_13_0 = param2[5].field_K;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (param2[1] == null) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param2[1].field_C;
            }
            var8 = stackIn_16_0;
            if (param2[7] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param2[7].field_C;
            }
            var9 = stackIn_19_0;
            var10 = param3 + param5;
            var11 = param4 + param0;
            var12 = param5 + var6_int;
            if (param1 != 50) {
              return;
            }
            var13 = var10 - var7;
            var14 = param4 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param5 + var6_int * param3 / (var7 + var6_int);
              var16 = param5 + var6_int * param3 / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            if (var18 > var19) {
              var19 = var8 * param0 / (var8 + var9) + param4;
              var18 = var8 * param0 / (var8 + var9) + param4;
            }
            hk.b(hl.field_e);
            if (null != param2[0]) {
              hk.f(param5, param4, var16, var18);
              param2[0].c(param5, param4);
              hk.a(hl.field_e);
            }
            if (null != param2[2]) {
              hk.f(var17, param4, var10, var18);
              param2[2].c(var13, param4);
              hk.a(hl.field_e);
            }
            if (null != param2[6]) {
              hk.f(param5, var19, var16, var11);
              param2[6].c(param5, var15);
              hk.a(hl.field_e);
            }
            if (param2[8] != null) {
              hk.f(var17, var19, var10, var11);
              param2[8].c(var13, var15);
              hk.a(hl.field_e);
            }
            if (null != param2[1] &&
              param2[1].field_K != 0) {
              hk.f(var16, param4, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].field_K) {
                param2[1].c(var20, param4);
              }
              hk.a(hl.field_e);
            }
            if (null != param2[7] &&
              param2[7].field_K != 0) {
              hk.f(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param2[7].field_K) {
                param2[7].c(var20Lifetime1, var15);
              }
              hk.a(hl.field_e);
            }
            if (param2[3] != null &&
              param2[3].field_C != 0) {
              hk.f(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param2[3].field_C) {
                param2[3].c(param5, var20Lifetime2);
              }
              hk.a(hl.field_e);
            }
            if (null != param2[5] &&
              param2[5].field_C != 0) {
              hk.f(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param2[5].field_C) {
                param2[5].c(var13, var20Lifetime3);
              }
              hk.a(hl.field_e);
            }
            if (param2[4] != null &&
              0 != param2[4].field_K) {
              if (param2[4].field_C == 0) {
                return;
              }
              hk.f(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var20Lifetime4 < var15; var20Lifetime4 = var20Lifetime4 + param2[4].field_C) {
                for (var21 = var12; var21 < var13; var21 = var21 + param2[4].field_K) {
                  param2[4].c(var21, var20Lifetime4);
                }
              }
              hk.a(hl.field_e);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("vk.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        int stackIn_5_0 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param6 != -22981) {
          return;
        }
        if (param4 >= 80) {
          stackIn_5_0 = 54;
        } else {
          stackIn_5_0 = 18 * (param4 / 20);
        }
        var7 = stackIn_5_0;
        var8 = 0;
        if (60 > param4) {
          var7 = var7 + vl.a(param6 ^ -1254, 80, 40 + 18 * param3);
        } else {
          if (param4 < 80) {
            var7 = var7 + vl.a(23841, 80, 40 + 18 * param0);
          } else {
            if (param4 >= 93) {
              hk.a(-48 + param1, -2 + param5 + 54, 96, 40, 4, 65280, 100);
            } else {
              var8 = vl.a(23841, 80, 40 + 18 * ve.field_ic[-79 + param4]);
            }
          }
        }
        fb.field_c[param2][0].c(-45 + param1, param5 + 72, 18, 18);
        fb.field_c[param2][0].c(param1 - 27, 72 + param5, 18, 18);
        fb.field_c[param2][0].c(-27 + param1, param5 + 54, 18, 18);
        fb.field_c[param2][0].c(36 + param1 - 45, param5 + var7 + var8, 18, -var8 + 18);
        fb.field_c[param2][3].c(54 + (param1 - 45), var8 + param5 + var7, 18, 18 - var8);
        fb.field_c[param2][3].c(36 + (param1 - 45), param5 + 72, 18, 18);
        fb.field_c[param2][3].c(param1 + 9, param5 + 72, 18, 18);
        fb.field_c[param2][3].c(72 + (-45 + param1), 72 + param5, 18, 18);
    }

    final static void a(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        vg var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = client.field_A ? 1 : 0;
        try {
          gb.field_Pb = new int[]{0, param0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = jb.field_g.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_vg = jb.field_g[var3];
            var4_ref_vg.a(param0 - 14200);
            kc.b(8192, var3);
            var5 = var4_ref_vg.field_H + var4_ref_vg.field_f >> 1;
            var6 = var4_ref_vg.field_b + var4_ref_vg.field_n >> 1;
            var7 = var4_ref_vg.field_i + var4_ref_vg.field_a >> 1;
            var8 = gb.field_Pb[9] >> 2;
            var9 = gb.field_Pb[10] >> 2;
            var10_int = gb.field_Pb[11] >> 2;
            var11 = var9 * o.field_e[4] + (o.field_e[3] * var8 + var10_int * o.field_e[5]) >> 14;
            var12 = var8 * o.field_e[6] + var9 * o.field_e[7] + o.field_e[8] * var10_int >> 14;
            var13 = var10_int * o.field_e[11] + var9 * o.field_e[10] + var8 * o.field_e[9] >> 14;
            var2[var3] = var6 * var12 + var5 * var11 + var7 * var13 >> 16;
          }
          var3Lifetime1 = gb.field_Pb[9] >> 8;
          var4 = gb.field_Pb[10] >> 8;
          var5Lifetime1 = gb.field_Pb[11] >> 8;
          var6Lifetime1 = gd.field_e << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = sk.a(var6Lifetime1, -58) >> 8;
          var9Lifetime1 = ue.a(var6Lifetime1, 112) >> 8;
          if (-1 != bh.field_g &&
            pm.field_f != -1) {
            var7Lifetime1 = -320 + bh.field_g;
            var8Lifetime1 = 240 - pm.field_f;
            var9Lifetime1 = -128;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var12Lifetime1 = -var3Lifetime1 + var7Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = -var5Lifetime1 + var9Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1));
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; jb.field_g.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < jb.field_g.length; var17_int++) {
              if (var21[var16] < var21[var17_int]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17 = jb.field_g[var16];
            kc.b(8192, var16);
            for (var18 = 0; 3 > var18; var18++) {
              o.field_e[var18] = o.field_e[var18] + df.field_U[var15][var18];
            }
            on.a(true, gb.field_Pb, false, o.field_e, true, false, var17);
            ug.a(var17, var8Lifetime1, var12Lifetime1, var7Lifetime1, false, var14, var9Lifetime1, var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_c = (byte[][]) null;
          }
          if (param1 == 3) {
            stackIn_4_0 = rk.field_U;
            return stackIn_4_0;
          }
          if (6 == param1) {
            stackIn_7_0 = (String) (field_e);
            return stackIn_7_0;
          }
          if (7 == param1) {
            stackIn_10_0 = qn.field_pb;
            return stackIn_10_0;
          }
          if (param1 == 8) {
            stackIn_14_0 = pm.field_a;
            return stackIn_14_0;
          }
          if (param1 == 9) {
            stackIn_18_0 = el.field_I;
            return stackIn_18_0;
          }
          if (param1 == 10) {
            stackIn_21_0 = kb.field_b;
            return stackIn_21_0;
          }
          if (param1 == 11) {
            stackIn_24_0 = dc.field_i;
            return stackIn_24_0;
          }
          if (param1 != 14) {
            return null;
          }
          stackIn_28_0 = cm.$cfr$intArgs$a$53ce4ab4c593(119, pd.field_c, new String[]{param0});
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("vk.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_8_0 = 0;
        int var2;
        String var3;
        boolean decompiledFrameRemainder0 = true;
        if (id.field_P < 3 && (!(te.field_p >= 2) ||
          !bj.field_d[12])) {
          stackIn_8_0 = (ph.n(-30146)) ? 0 : 1;
          var2 = stackIn_8_0;
          var3 = rg.field_f;
          wj.a(var2, -118, false, 1, param0, var3);
          decompiledFrameRemainder0 = false;
        }
        else {
          pn.a(false, true, true);
        }
        if (param1 > -29) {
          vk.a(-124);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = (byte[][]) null;
        field_e = null;
        if (param0 != -93) {
          vk.a(true, -94);
        }
        field_b = null;
        field_d = null;
    }

    static {
        field_d = new qm(9, 0, 4, 1);
        field_e = "This game is full.";
        field_c = new byte[250][];
        field_b = new String[]{"Move left:", "Move right:", "Rotate left:", "Rotate right:", "or", "Drop shape:", "Leaderboard:"};
    }
}
