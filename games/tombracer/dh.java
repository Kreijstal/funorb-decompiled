/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_a;
    static jea field_e;
    int field_d;
    int field_c;
    int field_b;

    final static void a(int param0, int param1, int param2, an param3, int param4, int param5, int param6, byte param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        uca stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
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
        uca var21 = null;
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
        an var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = TombRacer.field_G ? 1 : 0;
        try {
          var44 = param3;
          if (null != var44.field_q &&
            var44.field_K > 1) {
            var60 = var44.field_q;
            uu.a(0, 2507, var60, 0, ow.field_q);
          } else {
            ne.a((byte) -124);
          }
          var54 = new int[param3.field_A];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param3.field_A];
          var63 = ada.field_y;
          var62 = ie.field_i;
          var61 = dd.field_d;
          if (param7 != -23) {
            return;
          }
          for (var13 = 0; param3.field_A > var13; var13++) {
            var14 = param0 * var61[var13] + (var62[var13] * param1 + param4 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_17_0 = var14 + 128;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param5 * var61[var13] + var62[var13] * param2 + var63[var13] * param6 >> 8;
            stackIn_19_0 = gta.field_g;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < pq.field_f; var13Lifetime1++) {
            var14Lifetime1 = aia.field_t[var13Lifetime1];
            var15Lifetime1 = param3.field_B[var14Lifetime1];
            var16 = param3.field_w[var14Lifetime1];
            var17 = param3.field_f[var14Lifetime1];
            if (ada.field_y.length > param3.field_C[var14Lifetime1]) {
              stackIn_26_0 = param3.field_C[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (ada.field_y.length <= param3.field_s[var14Lifetime1]) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param3.field_s[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param3.field_y[var14Lifetime1] < ada.field_y.length) {
              stackIn_32_0 = param3.field_y[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (ej.field_d != null &&
              null != param3.field_M &&
              var14Lifetime1 < param3.field_M.length &&
              param3.field_M[var14Lifetime1] != -1 &&
              ej.field_d.length > param3.field_M[var14Lifetime1]) {
              stackIn_39_0 = ej.field_d[param3.field_M[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = ds.field_f[var15Lifetime1];
            var23 = mg.field_e[var15Lifetime1];
            var24 = ds.field_f[var16];
            var25 = mg.field_e[var16];
            var26 = ds.field_f[var17];
            var27 = mg.field_e[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_49_0 = 8355711;
              } else {
                stackIn_49_0 = var21.field_e;
              }
              var30 = stackIn_49_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = (var32 * var28 & 16711789) >>> 8 | (var28 * var31 & -16711744) >>> 8;
              var33 = var33 + var29 * 65793;
              oea.a(var25, -8543, var26, var23, var27, var22, (var33 & 16711422) >> 1, var24);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_45_0 = 8355711;
              } else {
                stackIn_45_0 = var21.field_e;
              }
              var34 = stackIn_45_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (var28 * var36 & 16711823) >>> 8 | (var28 * var35 & -16711692) >>> 8;
              var38 = (16711869 & var36 * var29) >>> 8 | (var35 * var29 & -16711781) >>> 8;
              var37 = var37 + 65793 * var31;
              var38 = var38 + 65793 * var32;
              var39 = var30 * var35 >>> 8 & 1140785407 | (16711738 & var36 * var30) >>> 8;
              var39 = var39 + var33 * 65793;
              cm.a(var25, (65365 & var39) >> 8, var37 >> 16, var38 >> 16, var24, var38 >> 8 & 255, var26, 117, var22, var39 & 255, var39 >> 16, var37 >> 8 & 255, var23, 255 & var38, var27, 255 & var37);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("dh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -6) {
          field_e = (jea) null;
        }
        field_e = null;
    }

    final static int a(da param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, String param12) {
        RuntimeException var13 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param9 != 29870) {
            field_e = (jea) null;
          }
          stackIn_3_0 = param0.a((aa) null, param11, param3, 0, param7, jg.a(param1, (byte) -90, param8), (int[]) null, param2, jg.a(param1, (byte) -45, param6), param12, (byte) -118, param5, 0, (nh[]) null, param4, param10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_6_0 = var13;
          stackIn_6_1 = new StringBuilder().append("dh.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
