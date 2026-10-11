/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf implements uk {
    static String field_c;
    static li field_a;
    static String field_d;
    static int[] field_b;

    final static void a(java.awt.Frame param0, int param1, ej param2) {
        re var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        n var5 = null;
        var4 = stellarshard.field_B;
        try {
          while (true) {
            var3 = param2.a(param0, (byte) -107);
            while (var3.field_f == 0) {
              jj.a((byte) -123, 10L);
            }
            if (var3.field_f != 1) {
              jj.a((byte) -128, 100L);
              continue;
            }
            break;
          }
          param0.setVisible(false);
          param0.dispose();
          if (param1 != 16711935) {
            var5 = (n) null;
            kf.a(-121, 1, -112, -24, -75, 3, (n) null, -21);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("kf.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 != 65280) {
          field_c = (String) null;
        }
        return ce.field_e;
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
        if (param0 <= 36) {
          field_a = (li) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, n param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        wh stackIn_37_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        wh var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        n var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var14Lifetime3;
        int var15Lifetime2;
        var40 = stellarshard.field_B;
        try {
          var45 = param6;
          if (var45.field_g != null &&
            var45.field_N > 1) {
            var61 = var45.field_g;
            k.a(var61, 0, tg.field_a, false, 0);
          } else {
            vj.b((byte) 124);
          }
          var55 = new int[param6.field_D];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param6.field_D];
          var64 = hc.field_f;
          var63 = le.field_m;
          var62 = fl.field_d;
          for (var13 = 0; param6.field_D > var13; var13++) {
            var14 = param7 * var62[var13] + (var63[var13] * param1 + var64[var13] * param3) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_15_0 = 256;
              } else {
                stackIn_15_0 = var14 + 128;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime3 = stackIn_15_0;
            var15 = param5 * var62[var13] + param4 * var64[var13] + param2 * var63[var13] >> 8;
            stackIn_17_0 = ol.field_g;
            if (0 <= var15) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime3 = var14Lifetime3 * (256 - var15Lifetime2) >>> 8;
            var55[var13] = var14Lifetime3;
            var65[var13] = var15Lifetime2;
          }
          var14Lifetime1 = -37 / ((param0 + 16) / 33);
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < ld.field_A) {
            var14Lifetime2 = ki.field_z[var44];
            var15Lifetime1 = param6.field_l[var14Lifetime2];
            var16 = param6.field_z[var14Lifetime2];
            var17 = param6.field_m[var14Lifetime2];
            if (hc.field_f.length > param6.field_M[var14Lifetime2]) {
              stackIn_24_0 = param6.field_M[var14Lifetime2];
            } else {
              stackIn_24_0 = -1;
            }
            var18 = stackIn_24_0;
            if (hc.field_f.length > param6.field_h[var14Lifetime2]) {
              stackIn_27_0 = param6.field_h[var14Lifetime2];
            } else {
              stackIn_27_0 = -1;
            }
            var19 = stackIn_27_0;
            if (hc.field_f.length > param6.field_v[var14Lifetime2]) {
              stackIn_30_0 = param6.field_v[var14Lifetime2];
            } else {
              stackIn_30_0 = -1;
            }
            var20 = stackIn_30_0;
            if (e.field_d != null &&
              param6.field_c != null &&
              param6.field_c.length > var14Lifetime2 &&
              param6.field_c[var14Lifetime2] != -1 &&
              param6.field_c[var14Lifetime2] < e.field_d.length) {
              stackIn_37_0 = e.field_d[param6.field_c[var14Lifetime2]];
            } else {
              stackIn_37_0 = null;
            }
            var21 = stackIn_37_0;
            var22 = nh.field_d[var15Lifetime1];
            var23 = od.field_s[var15Lifetime1];
            var24 = nh.field_d[var16];
            var25 = od.field_s[var16];
            var26 = nh.field_d[var17];
            var27 = od.field_s[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_47_0 = 8355711;
              } else {
                stackIn_47_0 = var21.field_b;
              }
              var30 = stackIn_47_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = var28 * var32 >>> 8 & -2013200640 | var31 * var28 >>> 8 & -2130771713;
              var33 = var33 + var29 * 65793;
              dd.a(-31548, var26, (16711422 & var33) >> 1, var24, var22, var27, var23, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_43_0 = var21.field_b;
              } else {
                stackIn_43_0 = 8355711;
              }
              var34 = stackIn_43_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = -1677656320 & var28 * var36 >>> 8 | var35 * var28 >>> 8 & 1241448703;
              var38 = (-16711803 & var29 * var35) >>> 8 | var36 * var29 >>> 8 & -1191117056;
              var39 = -838795520 & var36 * var30 >>> 8 | (var30 * var35 & -16711794) >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = var39 + 65793 * var33;
              ke.a(255 & var38, var25, (var37 & 65430) >> 8, var38 >> 16, var26, 255 & var39, var39 >> 16, 10, var27, var37 >> 16, 255 & var38 >> 8, var22, var23, var24, (65386 & var39) >> 8, 255 & var37);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_52_0 = var8_ref;
          stackIn_52_1 = new StringBuilder().append("kf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param7).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        pb var8 = null;
        try {
          var6_int = param1 + param3.field_w;
          var7 = param2 + param3.field_k;
          nd.a(param3.field_p, var7, param3.field_t, var6_int, (byte) -103);
          var8 = ah.field_p[1];
          if (param3 instanceof ig &&
            ((ig) (param3)).field_z) {
            var8.d(1 + (var6_int + (-var8.field_w + param3.field_p >> 1)), (-var8.field_x + param3.field_t >> 1) + 1 + var7, 256);
          }
          if (param4 != 4549) {
            return;
          }
          if (param3.e(0)) {
            og.a(2 + var6_int, (byte) 105, -4 + param3.field_p, -4 + param3.field_t, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("kf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (param0 != -940626896) {
          field_c = (String) null;
        }
        return kl.field_o;
    }

    static {
        field_c = "Start level ";
        field_a = new li(10, 2, 2, 0);
        field_b = new int[8192];
    }
}
