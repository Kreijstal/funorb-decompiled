/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static ra field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -91) {
          field_b = (ra) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, pk param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        nj stackIn_39_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        nj var21 = null;
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
        pk var45 = null;
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
        var40 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param6 > -98) {
            return;
          }
          var45 = param7;
          if (null != var45.field_J &&
            1 < var45.field_N) {
            var61 = var45.field_J;
            td.a(0, bd.field_l, 0, var61, 0);
          } else {
            mb.a(0);
          }
          var55 = new int[param7.field_A];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param7.field_A];
          var63 = qf.field_q;
          var62 = ee.field_b;
          var64 = wh.field_e;
          for (var13 = 0; var13 < param7.field_A; var13++) {
            var14 = param2 * var62[var13] + (var63[var13] * param1 + var64[var13] * param5) >> 8;
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
            var15 = param0 * var62[var13] + param3 * var63[var13] + param4 * var64[var13] >> 8;
            stackIn_19_0 = gl.field_e;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (wb.field_i > var44) {
            var14Lifetime1 = bf.field_a[var44];
            var15Lifetime1 = param7.field_a[var14Lifetime1];
            var16 = param7.field_k[var14Lifetime1];
            var17 = param7.field_B[var14Lifetime1];
            if (param7.field_j[var14Lifetime1] < qf.field_q.length) {
              stackIn_26_0 = param7.field_j[var14Lifetime1];
            } else {
              stackIn_26_0 = -1;
            }
            var18 = stackIn_26_0;
            if (param7.field_K[var14Lifetime1] >= qf.field_q.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param7.field_K[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (qf.field_q.length > param7.field_E[var14Lifetime1]) {
              stackIn_32_0 = param7.field_E[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (sh.field_d != null &&
              param7.field_q != null &&
              param7.field_q.length > var14Lifetime1 &&
              -1 != param7.field_q[var14Lifetime1] &&
              param7.field_q[var14Lifetime1] < sh.field_d.length) {
              stackIn_39_0 = sh.field_d[param7.field_q[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = ej.field_c[var15Lifetime1];
            var23 = fk.field_d[var15Lifetime1];
            var24 = ej.field_c[var16];
            var25 = fk.field_d[var16];
            var26 = ej.field_c[var17];
            var27 = fk.field_d[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_44_0 = var21.field_c;
              } else {
                stackIn_44_0 = 8355711;
              }
              var30 = stackIn_44_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = (16711773 & var32 * var28) >>> 8 | (-16711764 & var31 * var28) >>> 8;
              var33 = var33 + 65793 * var29;
              qg.a((var33 & 16711422) >> 1, var22, var25, var24, var27, -74, var26, var23);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_48_0 = 8355711;
              } else {
                stackIn_48_0 = var21.field_c;
              }
              var34 = stackIn_48_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = -1946091776 & var36 * var28 >>> 8 | 1207894271 & var28 * var35 >>> 8;
              var38 = (var35 * var29 & -16711819) >>> 8 | var36 * var29 >>> 8 & 838926080;
              var39 = var35 * var30 >>> 8 & 201261311 | (var36 * var30 & 16711788) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + 65793 * var32;
              var39 = var39 + var33 * 65793;
              uf.a((65474 & var39) >> 8, var22, var39 >> 16, (byte) -28, var26, var38 & 255, var25, var38 >> 16, var24, var23, var37 & 255, var37 >> 16, 255 & var37 >> 8, var38 >> 8 & 255, 255 & var39, var27);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("ff.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
    }
}
