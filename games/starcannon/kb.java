/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static boolean field_a;

    final static boolean a(ue param0, ue param1, byte param2, ue param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -50 % ((param2 - 3) / 33);
          if (!param3.b((byte) 126)) {
            return false;
          }
          if (!param3.a("commonui", -9883)) {
            return false;
          }
          if (param1.b((byte) 121) &&
            param1.a("commonui", -9883)) {
            if (param0.b((byte) 100) &&
              param0.a("button.gif", -9883)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kb.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (0 == var2) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          160 > var2) {
          var3 = ee.field_c[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        if (param0 >= -6) {
          field_a = false;
        }
        return (char)var2;
    }

    final static void a(int param0, int param1, int param2, lb param3, int param4, int param5, int param6, int param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        kl stackIn_40_0 = null;
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
        kl var21 = null;
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
        lb var45 = null;
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
        var40 = StarCannon.field_A;
        try {
          var45 = param3;
          if (null != var45.field_u &&
            var45.field_O > 1) {
            var61 = var45.field_u;
            fd.a(0, 0, var61, jb.field_h, param1 ^ -65912);
          } else {
            ng.j(1);
          }
          var55 = new int[param3.field_s];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param3.field_s];
          var64 = rc.field_a;
          var63 = fb.field_m;
          var62 = p.field_f;
          for (var13 = 0; var13 < param3.field_s; var13++) {
            var14 = var62[var13] * param0 + (var63[var13] * param5 + param6 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (var14 >= 128) {
                stackIn_15_0 = 256;
              } else {
                stackIn_15_0 = var14 + 128;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = var62[var13] * param4 + param7 * var63[var13] + param2 * var64[var13] >> 8;
            stackIn_17_0 = sd.field_e;
            if (0 <= var15) {
              stackIn_18_1 = var15;
            } else {
              stackIn_18_1 = -var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param1 != 65793) {
            return;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < wj.field_e) {
            var14Lifetime1 = ih.field_d[var44];
            var15Lifetime1 = param3.field_z[var14Lifetime1];
            var16 = param3.field_c[var14Lifetime1];
            var17 = param3.field_y[var14Lifetime1];
            if (param3.field_Q[var14Lifetime1] >= rc.field_a.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param3.field_Q[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (rc.field_a.length <= param3.field_e[var14Lifetime1]) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param3.field_e[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param3.field_m[var14Lifetime1] >= rc.field_a.length) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param3.field_m[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (uc.field_d != null &&
              null != param3.field_K &&
              param3.field_K.length > var14Lifetime1 &&
              param3.field_K[var14Lifetime1] != -1 &&
              param3.field_K[var14Lifetime1] < uc.field_d.length) {
              stackIn_40_0 = uc.field_d[param3.field_K[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = bh.field_c[var15Lifetime1];
            var23 = ri.field_a[var15Lifetime1];
            var24 = bh.field_c[var16];
            var25 = ri.field_a[var16];
            var26 = bh.field_c[var17];
            var27 = ri.field_a[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_50_0 = 8355711;
              } else {
                stackIn_50_0 = var21.field_e;
              }
              var30 = stackIn_50_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = -1895760128 & var28 * var32 >>> 8 | -402718465 & var31 * var28 >>> 8;
              var33 = var33 + var29 * 65793;
              m.a(var25, var26, var23, (16711422 & var33) >> 1, var22, var27, (byte) 48, var24);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_46_0 = 8355711;
              } else {
                stackIn_46_0 = var21.field_e;
              }
              var34 = stackIn_46_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = 1644232448 & var28 * var36 >>> 8 | var28 * var35 >>> 8 & -1023475457;
              var38 = (-16711770 & var35 * var29) >>> 8 | (16711709 & var29 * var36) >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = 1778450176 & var36 * var30 >>> 8 | var35 * var30 >>> 8 & 1258225919;
              var39 = var39 + var33 * 65793;
              nb.a((byte) 24, var37 >> 16, var38 & 255, var24, var23, var27, 255 & var38 >> 8, (65348 & var39) >> 8, var37 >> 8 & 255, var22, var26, var25, var39 >> 16, 255 & var39, var38 >> 16, 255 & var37);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (la.a((byte) 96, param1)) {
            return false;
          }
          if (nc.a(-100, param1)) {
            return false;
          }
          if (param2 != -28169) {
            return true;
          }
          if (md.a(-1, param1)) {
            return false;
          }
          if (0 == param0.length()) {
            return true;
          }
          if (k.a(param2 ^ -9537, param1, param0)) {
            return false;
          }
          if (ia.a(param1, (byte) -113, param0)) {
            return false;
          }
          if (!bj.a(param1, param0, true)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("kb.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
