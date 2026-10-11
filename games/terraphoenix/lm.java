/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_f;
    static int field_d;
    static bg field_g;
    static int[] field_a;
    static int field_c;
    static ci field_e;
    static int field_b;

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0) {
          return;
        }
        field_e = null;
    }

    final static void a(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        dj stackIn_38_0 = null;
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
        dj var21 = null;
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
        ee var45 = null;
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
        var40 = Terraphoenix.field_V;
        try {
          var45 = param0;
          if (var45.field_f != null &&
            var45.field_I > 1) {
            var61 = var45.field_f;
            hk.a(0, -57, var61, 0, dk.field_c);
          } else {
            th.a(true);
          }
          var55 = new int[param0.field_o];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param0.field_o];
          var63 = ph.field_m;
          var62 = k.field_e;
          var64 = mg.field_p;
          for (var13 = 0; param0.field_o > var13; var13++) {
            var14 = param6 * var62[var13] + (var63[var13] * param2 + var64[var13] * param4) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 < 128) {
                stackIn_16_0 = 128 + var14;
              } else {
                stackIn_16_0 = 256;
              }
            } else {
              stackIn_16_0 = 128;
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = var62[var13] * param1 + (param3 * var63[var13] + var64[var13] * param7) >> 8;
            stackIn_18_0 = me.field_m;
            if (var15 < 0) {
              stackIn_19_1 = -var15;
            } else {
              stackIn_19_1 = var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = param5;
          var13Lifetime1 = var44;
          while (ae.field_I > var44) {
            var14Lifetime1 = qh.field_c[var44];
            var15Lifetime1 = param0.field_E[var14Lifetime1];
            var16 = param0.field_n[var14Lifetime1];
            var17 = param0.field_p[var14Lifetime1];
            if (ph.field_m.length > param0.field_C[var14Lifetime1]) {
              stackIn_25_0 = param0.field_C[var14Lifetime1];
            } else {
              stackIn_25_0 = -1;
            }
            var18 = stackIn_25_0;
            if (ph.field_m.length > param0.field_k[var14Lifetime1]) {
              stackIn_28_0 = param0.field_k[var14Lifetime1];
            } else {
              stackIn_28_0 = -1;
            }
            var19 = stackIn_28_0;
            if (ph.field_m.length <= param0.field_g[var14Lifetime1]) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param0.field_g[var14Lifetime1];
            }
            var20 = stackIn_31_0;
            if (qk.field_l != null &&
              param0.field_x != null &&
              param0.field_x.length > var14Lifetime1 &&
              param0.field_x[var14Lifetime1] != -1 &&
              param0.field_x[var14Lifetime1] < qk.field_l.length) {
              stackIn_38_0 = qk.field_l[param0.field_x[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = gm.field_l[var15Lifetime1];
            var23 = nb.field_c[var15Lifetime1];
            var24 = gm.field_l[var16];
            var25 = nb.field_c[var16];
            var26 = gm.field_l[var17];
            var27 = nb.field_c[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_48_0 = var21.field_b;
              } else {
                stackIn_48_0 = 8355711;
              }
              var30 = stackIn_48_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (var28 * var31 & -16711701) >>> 8 | (16711762 & var32 * var28) >>> 8;
              var33 = var33 + 65793 * var29;
              ag.a(var24, var25, var22, var23, 29842, var33 >> 1 & 8355711, var27, var26);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_44_0 = var21.field_b;
              } else {
                stackIn_44_0 = 8355711;
              }
              var34 = stackIn_44_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = -1879113473 & var35 * var28 >>> 8 | (16711910 & var36 * var28) >>> 8;
              var38 = -318832385 & var35 * var29 >>> 8 | var36 * var29 >>> 8 & 1375796992;
              var38 = var38 + var32 * 65793;
              var39 = (var35 * var30 & -16711875) >>> 8 | 100728576 & var36 * var30 >>> 8;
              var37 = var37 + 65793 * var31;
              var39 = var39 + var33 * 65793;
              ak.a(255 & var39, var39 >> 16, (var37 & 65286) >> 8, (var39 & 65475) >> 8, var23, (byte) 116, var24, var22, var27, 255 & var37, var38 & 255, var38 >> 16, var26, 255 & var38 >> 8, var25, var37 >> 16);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("lm.C(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, int param1, ci param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var9_int = param6 + param2.field_p + param0 - param7;
        int var10 = param6 + param0 + (param2.field_p + param1);
        int var11 = (param2.field_t >> 1) + param2.field_v + param5;
        l.i(var9_int, 0, var10, var11 + param3);
        param2.d(-1 + param0, param5 - 1, param8);
        param2.d(param0 - 1, param5 + 1, param8);
        l.a(rb.field_a);
        l.i(1 + var9_int, 0, var10 + 1, var11 + param3);
        param2.d(param0 + 1, -1 + param5, param8);
        param2.d(param0 + 1, param5 + 1, param8);
        l.a(rb.field_a);
        var9_int = -param1 - param6 + (param0 + param2.field_p) + param2.field_r;
        var10 = -param7 + (-param6 + (param2.field_r + param2.field_p + param0));
        l.i(var9_int, -param3 + var11, var10, 480);
        if (param4 < 122) {
          return;
        }
        try {
          param2.d(-1 + param0, param5 - 1, param8);
          param2.d(param0 - 1, param5 + 1, param8);
          l.a(rb.field_a);
          l.i(1 + var9_int, -param3 + var11, var10 + 1, 480);
          param2.d(param0 + 1, param5 - 1, param8);
          param2.d(1 + param0, param5 + 1, param8);
          l.a(rb.field_a);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "lm.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_f = "Clipsize: ";
        field_a = new int[8192];
        field_c = 0;
    }
}
