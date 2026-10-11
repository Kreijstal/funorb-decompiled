/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static int field_b;
    static char[] field_d;
    static ko field_c;
    static String field_a;
    static byte[][] field_e;

    final static void a(float param0, String param1, byte param2, boolean param3) {
        try {
          if (param2 != -41) {
            field_a = (String) null;
          }
          if (td.field_b == null) {
            td.field_b = new kl(qe.field_g, sd.field_T);
            qe.field_g.b(param2 ^ 3223, td.field_b);
          }
          td.field_b.a(8405024, param3, param0, param1);
          kh.a();
          d.a((byte) -75, true);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, jg param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        hm stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        hm var21 = null;
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
        jg var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = CrazyCrystals.field_B;
        try {
          var45 = param6;
          if (var45.field_o != null &&
            var45.field_s > 1) {
            var61 = var45.field_o;
            ln.a(-17512, 0, var61, to.field_b, 0);
          } else {
            qf.h(-30693);
          }
          var55 = new int[param6.field_D];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param6.field_D];
          var63 = cf.field_b;
          var62 = jp.field_a;
          var64 = vm.field_d;
          for (var13 = 0; var13 < param6.field_D; var13++) {
            var14 = param5 * var62[var13] + (var63[var13] * param1 + var64[var13] * param0) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 < 128) {
                stackIn_15_0 = 128 + var14;
              } else {
                stackIn_15_0 = 256;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = param4 * var64[var13] + (param7 * var62[var13] + param2 * var63[var13]) >> 8;
            stackIn_17_0 = s.field_h;
            if (var15 >= 0) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param3 != -9206) {
            field_d = (char[]) null;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < pi.field_o) {
            var14Lifetime1 = gh.field_E[var44];
            var15Lifetime1 = param6.field_K[var14Lifetime1];
            var16 = param6.field_g[var14Lifetime1];
            var17 = param6.field_c[var14Lifetime1];
            if (param6.field_A[var14Lifetime1] < cf.field_b.length) {
              stackIn_26_0 = param6.field_A[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (cf.field_b.length <= param6.field_v[var14Lifetime1]) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param6.field_v[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param6.field_R[var14Lifetime1] < cf.field_b.length) {
              stackIn_32_0 = param6.field_R[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (ud.field_S != null &&
              param6.field_B != null &&
              var14Lifetime1 < param6.field_B.length &&
              -1 != param6.field_B[var14Lifetime1] &&
              param6.field_B[var14Lifetime1] < ud.field_S.length) {
              stackIn_40_0 = ud.field_S[param6.field_B[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = dn.field_a[var15Lifetime1];
            var23 = qk.field_E[var15Lifetime1];
            var24 = dn.field_a[var16];
            var25 = qk.field_E[var16];
            var26 = dn.field_a[var17];
            var27 = qk.field_E[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_50_0 = var21.field_b;
              } else {
                stackIn_50_0 = 8355711;
              }
              var30 = stackIn_50_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (var28 * var31 & -16711763) >>> 8 | (var32 * var28 & 16711882) >>> 8;
              var33 = var33 + 65793 * var29;
              pp.a(var27, var25, var23, param3 + 9206, var26, var24, (var33 & 16711422) >> 1, var22);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_46_0 = var21.field_b;
              } else {
                stackIn_46_0 = 8355711;
              }
              var34 = stackIn_46_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = var36 * var28 >>> 8 & 1325465344 | (var35 * var28 & -16711693) >>> 8;
              var38 = (var29 * var36 & 16711862) >>> 8 | -1224802049 & var29 * var35 >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = 1191117055 & var35 * var30 >>> 8 | var30 * var36 >>> 8 & 1845559040;
              var39 = var39 + 65793 * var33;
              b.a((var38 & 65480) >> 8, var22, var24, var27, var38 & 255, 255 & var39, var26, var39 >> 16, var37 >> 16, var38 >> 16, 44, var25, 255 & var37, var23, (65374 & var39) >> 8, (var37 & 65471) >> 8);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("tg.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != -100) {
          jg var2 = (jg) null;
          tg.a(-124, 27, 6, 79, -72, -110, (jg) null, 54);
        }
        field_e = (byte[][]) null;
        field_d = null;
    }

    final static void a(ng param0, ng param1, java.math.BigInteger param2, int param3, java.math.BigInteger param4) {
        try {
          jl.a(0, param1, param0.field_h, param2, param0.field_f, param4, 4);
          if (param3 >= -102) {
            field_d = (char[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "tg.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 49;
        field_e = new byte[250][];
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_a = "To Level";
    }
}
