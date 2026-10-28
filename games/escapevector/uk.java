/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static DiskCacheWorker field_b;
    IntPoint field_g;
    static String field_a;
    static PcmSample field_j;
    IntPoint field_e;
    IntPoint field_k;
    IntPoint field_c;
    IntPoint field_d;
    IntPoint field_i;
    IntPoint field_f;
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
          field_j = (PcmSample) null;
        }
        field_j = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, ia param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        ui stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        String stackIn_56_2 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var40 = EscapeVector.obfuscationControl;
        try {
          if (param1 != -16711760) {
            return;
          }
          ia var44 = param5;
          if (var44.field_n != null &&
            var44.field_I > 1) {
            byte[] var60 = var44.field_n;
            NetworkGameClient.a(var60, 0, ul.field_I, 114, 0);
          } else {
            od.f(46);
          }
          int[] var54 = new int[param5.field_M];
          int[] var49 = var54;
          int[] var41 = var49;
          int[] var8 = var41;
          int[] var64 = new int[param5.field_M];
          int[] var62 = oi.field_L;
          int[] var63 = IsaacRandom.field_f;
          int[] var61 = GameplaySession.field_xb;
          for (int var13 = 0; param5.field_M > var13; var13++) {
            int var14 = param6 * var61[var13] + param2 * var62[var13] + param7 * var63[var13] >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else if (128 <= var14) {
              stackIn_17_0 = 256;
            } else {
              stackIn_17_0 = 128 + var14;
            }
            int var14Lifetime2 = stackIn_17_0;
            int var15 = param4 * var61[var13] + var62[var13] * param3 + param0 * var63[var13] >> 8;
            int[] stackIn_19_0 = pb.field_c;
            stackIn_20_1 = (var15 < 0) ? (-var15) : (var15);
            int var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (int var13Lifetime1 = 0; var13Lifetime1 < aj.field_d; var13Lifetime1++) {
            int var14Lifetime1 = bc.field_f[var13Lifetime1];
            int var15Lifetime1 = param5.field_e[var14Lifetime1];
            int var16 = param5.field_o[var14Lifetime1];
            int var17 = param5.field_f[var14Lifetime1];
            if (param5.field_h[var14Lifetime1] >= oi.field_L.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param5.field_h[var14Lifetime1];
            }
            int var18 = stackIn_26_0;
            if (param5.field_u[var14Lifetime1] >= oi.field_L.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param5.field_u[var14Lifetime1];
            }
            int var19 = stackIn_29_0;
            if (param5.field_j[var14Lifetime1] < oi.field_L.length) {
              stackIn_32_0 = param5.field_j[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            int var20 = stackIn_32_0;
            if (DialogueScreen.field_y != null &&
              param5.field_m != null &&
              var14Lifetime1 < param5.field_m.length &&
              param5.field_m[var14Lifetime1] != -1 &&
              param5.field_m[var14Lifetime1] < DialogueScreen.field_y.length) {
              stackIn_40_0 = DialogueScreen.field_y[param5.field_m[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            ui var21 = stackIn_40_0;
            int var22 = on.field_g[var15Lifetime1];
            int var23 = ni.field_D[var15Lifetime1];
            int var24 = on.field_g[var16];
            int var25 = ni.field_D[var16];
            int var26 = on.field_g[var17];
            int var27 = ni.field_D[var17];
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
              int var34 = stackIn_46_0;
              int var35 = var34 & 16711935;
              int var36 = var34 & 65280;
              int var37 = (var28 * var36 & 16711908) >>> 8 | var28 * var35 >>> 8 & 1090453759;
              int var38 = (16711930 & var29 * var36) >>> 8 | -1778450177 & var35 * var29 >>> 8;
              var37 = var37 + 65793 * var31;
              int var39 = (16711870 & var30 * var36) >>> 8 | (var35 * var30 & -16711760) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + 65793 * var33;
              ei.a(var24, var23, var22, 255 & var39 >> 8, var38 >> 16, var27, var39 >> 16, var26, var25, -15733, 255 & var39, 255 & var37, var37 >> 16, var38 & 255, (var37 & 65293) >> 8, 255 & var38 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8_ref = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var8_ref;
          StringBuilder stackIn_55_1 = new StringBuilder().append("uk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    uk() {
        this.field_e = new IntPoint(0, 0);
        this.field_g = new IntPoint(0, 0);
        this.field_c = new IntPoint(0, 0);
        this.field_d = new IntPoint(0, 0);
        this.field_k = new IntPoint(0, 0);
        this.field_f = new IntPoint(0, 0);
        this.field_i = new IntPoint(0, 0);
    }

    static {
        field_a = "Score: ";
        field_h = false;
    }
}
