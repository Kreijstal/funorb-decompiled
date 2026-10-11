/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static kk field_b;
    ga field_g;
    static String field_a;
    static hh field_j;
    ga field_e;
    ga field_k;
    ga field_c;
    ga field_d;
    ga field_i;
    ga field_f;
    static boolean field_h;

    final static void b(int param0) {
        if (bo.field_F != null) {
          bo.field_F.p(0);
        }
        if (jb.field_r != null) {
          jb.field_r.d(true);
        }
        if (param0 != 0) {
          ia var2 = (ia) null;
          uk.a(19, -90, 62, -122, 5, (ia) null, -13, -75);
        }
        dl.a(false);
    }

    final static void a(int param0, int[] param1, int[] param2) {
        try {
          gi.a(param0 + param1.length, param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
          field_j = (hh) null;
        }
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ia param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ui stackIn_40_0 = null;
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
        ui var21 = null;
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
        ia var44 = null;
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
        var40 = EscapeVector.field_A;
        try {
          if (param1 != -16711760) {
            return;
          }
          var44 = param5;
          if (var44.field_n != null &&
            var44.field_I > 1) {
            var60 = var44.field_n;
            g.a(var60, 0, ul.field_I, 114, 0);
          } else {
            od.f(46);
          }
          var54 = new int[param5.field_M];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param5.field_M];
          var62 = oi.field_L;
          var63 = df.field_f;
          var61 = oe.field_xb;
          for (var13 = 0; param5.field_M > var13; var13++) {
            var14 = param6 * var61[var13] + param2 * var62[var13] + param7 * var63[var13] >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (128 <= var14) {
                stackIn_17_0 = 256;
              } else {
                stackIn_17_0 = 128 + var14;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param4 * var61[var13] + var62[var13] * param3 + param0 * var63[var13] >> 8;
            stackIn_19_0 = pb.field_c;
            if (var15 < 0) {
              stackIn_20_1 = -var15;
            } else {
              stackIn_20_1 = var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < aj.field_d; var13Lifetime1++) {
            var14Lifetime1 = bc.field_f[var13Lifetime1];
            var15Lifetime1 = param5.field_e[var14Lifetime1];
            var16 = param5.field_o[var14Lifetime1];
            var17 = param5.field_f[var14Lifetime1];
            if (param5.field_h[var14Lifetime1] >= oi.field_L.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param5.field_h[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (param5.field_u[var14Lifetime1] >= oi.field_L.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param5.field_u[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param5.field_j[var14Lifetime1] < oi.field_L.length) {
              stackIn_32_0 = param5.field_j[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (tj.field_y != null &&
              param5.field_m != null &&
              var14Lifetime1 < param5.field_m.length &&
              param5.field_m[var14Lifetime1] != -1 &&
              param5.field_m[var14Lifetime1] < tj.field_y.length) {
              stackIn_40_0 = tj.field_y[param5.field_m[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = on.field_g[var15Lifetime1];
            var23 = ni.field_D[var15Lifetime1];
            var24 = on.field_g[var16];
            var25 = ni.field_D[var16];
            var26 = on.field_g[var17];
            var27 = ni.field_D[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_50_0 = 8355711;
              } else {
                stackIn_50_0 = var21.field_c;
              }
              var30 = stackIn_50_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var32 * var28 >>> 8 & -805241088 | -2030108417 & var31 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              rc.a(var26, var22, var27, var33 >> 1 & 8355711, true, var23, var24, var25);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_46_0 = 8355711;
              } else {
                stackIn_46_0 = var21.field_c;
              }
              var34 = stackIn_46_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (var28 * var36 & 16711908) >>> 8 | var28 * var35 >>> 8 & 1090453759;
              var38 = (16711930 & var29 * var36) >>> 8 | -1778450177 & var35 * var29 >>> 8;
              var37 = var37 + 65793 * var31;
              var39 = (16711870 & var30 * var36) >>> 8 | (var35 * var30 & -16711760) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + 65793 * var33;
              ei.a(var24, var23, var22, 255 & var39 >> 8, var38 >> 16, var27, var39 >> 16, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 16, var38 & 255, (var37 & 65293) >> 8, 255 & var38 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    uk() {
        this.field_e = new ga(0, 0);
        this.field_g = new ga(0, 0);
        this.field_c = new ga(0, 0);
        this.field_d = new ga(0, 0);
        this.field_k = new ga(0, 0);
        this.field_f = new ga(0, 0);
        this.field_i = new ga(0, 0);
    }

    static {
        field_a = "Score: ";
        field_h = false;
    }
}
