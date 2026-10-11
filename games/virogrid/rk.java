/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static String field_b;
    static String field_a;
    static int field_e;
    static int field_c;
    static boolean field_f;
    static String field_g;
    static String field_h;
    static String field_d;

    private final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = c.field_b[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = df.field_d[var23 * 640 + var22];
            var25 = 64;
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            df.field_d[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = c.field_b[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 < 0) {
              var23Lifetime1 = 0;
            }
            var24Lifetime1 = df.field_d[var23Lifetime1 * 640 + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            df.field_d[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    final static void a(oj param0, byte param1) {
        if (param0 == null) {
          return;
        }
        try {
          dk.field_v = param0;
          cm.field_h.field_W.a(false);
          cm.field_h.a(0, dk.field_v);
          ac.field_e = true;
          if (param1 > -15) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "rk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = c.field_b[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 > df.field_f - 1) {
              var23 = df.field_f - 1;
            }
            var24 = df.field_d[var23 * 640 + var22];
            var25 = 64;
            if (var25 < 0) {
              throw new Error();
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            df.field_d[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 < param5) {
            var19Lifetime1 = (var18Lifetime1 << 4) - param12;
            var20Lifetime1 = (var16Lifetime1 << param4) / param6;
            var21Lifetime1 = c.field_b[var20Lifetime1] * param10 >> 15;
            var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
            if (var22Lifetime1 < 0) {
              var22Lifetime1 = 0;
            }
            var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
            if (var23Lifetime1 > df.field_f - 1) {
              var23Lifetime1 = df.field_f - 1;
            }
            var24Lifetime1 = df.field_d[var23Lifetime1 * 640 + var22Lifetime1];
            var25Lifetime1 = 64;
            if (var25Lifetime1 < 0) {
              var25Lifetime1 = -var25Lifetime1;
            }
            var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
            var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
            var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
            var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
            var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
            var15Lifetime1--;
            df.field_d[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
            continue;
          }
          break;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int var14;
        while (param11 < 0) {
          co.field_j = hn.field_w;
          lh.field_e = ah.field_k;
          var14 = param12;
          while (var14 < 0) {
            param1 = lh.field_e - u.field_s >> 16;
            if (param1 >= -param2 &&
              param1 <= param2) {
              param0 = co.field_j + hf.field_C >> 16;
              if (param0 >= -param2 &&
                param0 <= param5 + param2) {
                if (param0 >= param2) {
                  if (param0 <= param5 - param2) {
                    stackIn_16_0 = param8;
                  } else {
                    stackIn_16_0 = (param5 + param2 - param0) * nn.field_a >> 8;
                  }
                } else {
                  stackIn_16_0 = (param0 + param2) * nn.field_a >> 8;
                }
                param3 = stackIn_16_0;
                param4 = param1 * param3 * ai.field_h >> 8;
                if (param4 < 0) {
                  stackIn_19_0 = tm.field_h[param3 + param4];
                } else {
                  stackIn_19_0 = tm.field_h[param3 - param4];
                }
                param1 = stackIn_19_0;
                param0 = param6[param7];
                param3 = param1 + param0;
                param1 = (param1 & 16711935) + (param0 & 16711935);
                param0 = (param1 & 16777472) + (param3 - param1 & 65536);
                param6[param7] = param3 - param0 | param0 - (param0 >>> 8);
              }
            }
            var14++;
            param7++;
            co.field_j = co.field_j + param9;
            lh.field_e = lh.field_e + param10;
          }
          param7 = param7 + param13;
          param11++;
          u.field_s = u.field_s + param9;
          hf.field_C = hf.field_C + param10;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int var15 = 0;
        int var7 = param2 - param0;
        int var8 = param3 - param1;
        int var9 = (int)Math.sqrt((double)(var7 * var7 + var8 * var8));
        int var10 = (int)(65536.0 / Math.sqrt((double)(var7 * var7 + var8 * var8)));
        int var15Lifetime1;
        var7 = var7 * var10;
        var8 = var8 * var10;
        int var11 = param0;
        int var12 = param1;
        int var13 = param2;
        int var14 = param3;
        if (var11 > var13) {
          var15 = var11;
          var11 = var13;
          var13 = var15;
        }
        if (var12 > var14) {
          var15Lifetime1 = var12;
          var12 = var14;
          var14 = var15Lifetime1;
        }
        var11 = var11 - param4;
        var12 = var12 - param4;
        var13 = var13 + param4;
        var14 = var14 + param4;
        if (var11 < df.field_i) {
          var11 = df.field_i;
        }
        if (var12 < df.field_g) {
          var12 = df.field_g;
        }
        if (var13 > df.field_k) {
          var13 = df.field_k;
        }
        if (var14 > df.field_h) {
          var14 = df.field_h;
        }
        ai.field_h = 256 / param4;
        nn.field_a = param5 * 128 / param4;
        u.field_s = (var12 - param1) * var7;
        hf.field_C = (var12 - param1) * var8;
        hn.field_w = (var11 - param0) * var7;
        ah.field_k = (var11 - param0) * var8;
        tm.field_h = param6;
        rk.a(param0, param1, param4, 0, 0, var9, df.field_d, var12 * df.field_e + var11, param5, var7, var8, var12 - var14, var11 - var13, df.field_e - (var13 - var11));
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var28 = 0;
        int var4 = param2 * param2;
        int var5 = param0 - param2 >> 4;
        int var6 = param0 + 15 >> 4;
        int var7 = param0 + param2 + 15 >> 4;
        int var8 = param1 - param2 >> 4;
        int var9 = param1 + 15 >> 4;
        int var10 = param1 + param2 + 15 >> 4;
        int var28Lifetime1;
        if (var5 < 0) {
          var5 = 0;
        }
        if (var7 > 640) {
          var7 = 640;
        }
        if (var8 < 0) {
          var8 = 0;
        }
        if (var10 > df.field_f) {
          var10 = df.field_f;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        if (var6 > 640) {
          var6 = 640;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        if (var9 > df.field_f) {
          var9 = df.field_f;
        }
        int var11 = (var6 << 4) - param0;
        var11 = var11 * var11;
        int var12 = (var6 + 1 << 4) - param0;
        var12 = var12 * var12;
        int var13 = (var6 + 2 << 4) - param0;
        var13 = var13 * var13;
        int var14 = var12 - var11;
        int var15 = var13 - var12;
        int var16 = var15 - var14;
        int var17 = (var9 << 4) - param1;
        var17 = var17 * var17;
        int var18 = (var9 + 1 << 4) - param1;
        var18 = var18 * var18;
        int var19 = (var9 + 2 << 4) - param1;
        var19 = var19 * var19;
        int var20 = var18 - var17;
        int var21 = var19 - var18;
        int var22 = var21 - var20;
        int var23 = 16;
        int var24 = var4;
        while (var4 > 2147483647 >>> var23) {
          var23--;
          var24 = var24 + 1 >>> 1;
        }
        int var25 = var9 * 640 + var6;
        int var26 = var11 + var17;
        int var27 = var20;
        for (var28 = var9; var28 < var10; var28++) {
          rk.a(var28, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
          var26 = var26 + var27;
          var27 = var27 + var22;
          var25 += 640;
        }
        var25 = var9 * 640 + var6;
        var26 = var11 + var17;
        var27 = var20;
        for (var28Lifetime1 = var9 - 1; var28Lifetime1 >= var8; var28Lifetime1--) {
          var27 = var27 - var22;
          var26 = var26 - var27;
          var25 -= 640;
          rk.b(var28Lifetime1, var26, var14, var16, var23, var4, var24, var5, var6, var7, param3, var25, param0, param1);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_g = null;
        if (param0 > -82) {
          field_f = false;
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeMouseListener(pm.field_l);
          param0.removeMouseMotionListener(pm.field_l);
          param0.removeFocusListener(pm.field_l);
          hc.field_d = 0;
          if (param1 != 4) {
            oj var3 = (oj) null;
            rk.a((oj) null, (byte) 91);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "rk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Message game";
        field_b = "Turn duration: <%0> seconds";
        field_f = false;
        field_c = 0;
        field_g = "Not yet achieved";
        field_d = "Offensive account name";
        field_h = "Connection lost. <%0>";
    }
}
