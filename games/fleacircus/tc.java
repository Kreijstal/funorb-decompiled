/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc {
    static String field_g;
    String field_d;
    String field_i;
    String field_c;
    static String[] field_e;
    int field_f;
    static int[] field_b;
    rh field_a;
    static int field_h;

    final static dj a(rh param0, String param1, rh param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        dj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 88) {
            tc.a((byte) 1);
          }
          var5_int = param2.a(param4, (byte) -100);
          var6 = param2.a(param1, (byte) -15, var5_int);
          stackIn_3_0 = ni.a(var6, -2974, param0, param2, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("tc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        if (param0 != -75) {
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, si param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        re stackIn_38_0 = null;
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
        re var21 = null;
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
        si var44 = null;
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
        var40 = fleas.field_A ? 1 : 0;
        try {
          var44 = param7;
          if (var44.field_J != null &&
            1 < var44.field_h) {
            var60 = var44.field_J;
            qj.a(0, 0, var60, ge.field_e, 0);
          } else {
            pb.b((byte) 124);
          }
          var54 = new int[param7.field_p];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param7.field_p];
          if (param4 != 30675) {
            field_b = (int[]) null;
          }
          var62 = field_b;
          var63 = lj.field_j;
          var61 = nb.field_d;
          for (var13 = 0; var13 < param7.field_p; var13++) {
            var14 = param1 * var61[var13] + param6 * var62[var13] + var63[var13] * param5 >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (0 <= var14) {
              if (128 > var14) {
                stackIn_16_0 = var14 + 128;
              } else {
                stackIn_16_0 = 256;
              }
            } else {
              stackIn_16_0 = 128;
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = param3 * var61[var13] + (var62[var13] * param0 + param2 * var63[var13]) >> 8;
            stackIn_18_0 = h.field_b;
            if (var15 >= 0) {
              stackIn_19_1 = var15;
            } else {
              stackIn_19_1 = -var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < vc.field_d; var13Lifetime1++) {
            var14Lifetime1 = pk.field_J[var13Lifetime1];
            var15Lifetime1 = param7.field_Q[var14Lifetime1];
            var16 = param7.field_M[var14Lifetime1];
            var17 = param7.field_N[var14Lifetime1];
            if (param7.field_D[var14Lifetime1] >= field_b.length) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param7.field_D[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (param7.field_F[var14Lifetime1] < field_b.length) {
              stackIn_28_0 = param7.field_F[var14Lifetime1];
            } else {
              stackIn_28_0 = -1;
            }
            var19 = stackIn_28_0;
            if (param7.field_u[var14Lifetime1] < field_b.length) {
              stackIn_31_0 = param7.field_u[var14Lifetime1];
            } else {
              stackIn_31_0 = -1;
            }
            var20 = stackIn_31_0;
            if (null != fc.field_a &&
              null != param7.field_s &&
              var14Lifetime1 < param7.field_s.length &&
              param7.field_s[var14Lifetime1] != -1 &&
              param7.field_s[var14Lifetime1] < fc.field_a.length) {
              stackIn_38_0 = fc.field_a[param7.field_s[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = kb.field_o[var15Lifetime1];
            var23 = il.field_c[var15Lifetime1];
            var24 = kb.field_o[var16];
            var25 = il.field_c[var16];
            var26 = kb.field_o[var17];
            var27 = il.field_c[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_43_0 = 8355711;
              } else {
                stackIn_43_0 = var21.field_a;
              }
              var30 = stackIn_43_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = var28 * var32 >>> 8 & 1157693184 | -117505793 & var31 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              wb.a(var26, var25, var27, (byte) -39, (16711422 & var33) >> 1, var23, var22, var24);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_47_0 = var21.field_a;
              } else {
                stackIn_47_0 = 8355711;
              }
              var34 = stackIn_47_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = var35 * var28 >>> 8 & 671023359 | (var36 * var28 & 16711700) >>> 8;
              var38 = (var36 * var29 & 16711890) >>> 8 | -654376705 & var29 * var35 >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = (var35 * var30 & -16711845) >>> 8 | (16711734 & var36 * var30) >>> 8;
              var39 = var39 + 65793 * var33;
              oh.a(var27, 255 & var39, var22, (65365 & var37) >> 8, var26, 0, 255 & var38, var38 >> 16, var23, var37 & 255, var39 >> 16, var25, (var38 & 65423) >> 8, var37 >> 16, var24, 255 & var39 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_52_0 = var8_ref;
          stackIn_52_1 = new StringBuilder().append("tc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (!bh.a((byte) 109, param2, param1)) {
            return false;
          }
          for (var3_int = 0; param1.length() > var3_int; var3_int++) {
            if (!gi.a(45, param1.charAt(var3_int))) {
              return false;
            }
          }
          if (param0 == 82) {
            return true;
          }
          field_g = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("tc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private tc() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "Just play";
        field_b = new int[8192];
        field_h = 0;
    }
}
