/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends mc {
    int field_u;
    static String field_o;
    static int field_n;
    static int[] field_p;
    ee field_t;
    static String field_s;
    mc field_q;
    static wf field_r;

    final static oh[] a(byte param0, ah param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        oh[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -68) {
            var6 = (String) null;
            bf.a((byte) -110, (ah) null, (String) null, (String) null);
          }
          var4_int = param1.a(-1, param2);
          var5 = param1.a(var4_int, false, param3);
          stackIn_3_0 = uh.a(var5, 0, param1, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 65364) {
          field_n = -58;
        }
        field_o = null;
        field_r = null;
    }

    final static void a(int param0, int param1, id param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        rm stackIn_40_0 = null;
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
        rm var21 = null;
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
        id var44 = null;
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
        var40 = TetraLink.field_J;
        try {
          var44 = param2;
          if (param0 != 65793) {
            field_r = (wf) null;
          }
          if (var44.field_u != null &&
            1 < var44.field_Q) {
            var60 = var44.field_u;
            gn.a(0, 0, 0, var60, c.field_m);
          } else {
            hj.a((byte) -93);
          }
          var54 = new int[param2.field_O];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param2.field_O];
          var62 = kk.field_T;
          var61 = field_p;
          var63 = od.field_X;
          for (var13 = 0; var13 < param2.field_O; var13++) {
            var14 = param5 * var61[var13] + param1 * var62[var13] + param6 * var63[var13] >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 < 128) {
                stackIn_18_0 = 128 + var14;
              } else {
                stackIn_18_0 = 256;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = var63[var13] * param7 + var62[var13] * param3 + param4 * var61[var13] >> 8;
            stackIn_20_0 = da.field_g;
            if (var15 < 0) {
              stackIn_21_1 = -var15;
            } else {
              stackIn_21_1 = var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; og.field_f > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = lg.field_ab[var13Lifetime1];
            var15Lifetime1 = param2.field_K[var14Lifetime1];
            var16 = param2.field_I[var14Lifetime1];
            var17 = param2.field_e[var14Lifetime1];
            if (param2.field_t[var14Lifetime1] < kk.field_T.length) {
              stackIn_27_0 = param2.field_t[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var18 = stackIn_27_0;
            if (param2.field_b[var14Lifetime1] >= kk.field_T.length) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param2.field_b[var14Lifetime1];
            }
            var19 = stackIn_30_0;
            if (param2.field_N[var14Lifetime1] < kk.field_T.length) {
              stackIn_33_0 = param2.field_N[var14Lifetime1];
            } else {
              stackIn_33_0 = -1;
            }
            var20 = stackIn_33_0;
            if (dh.field_n != null &&
              param2.field_v != null &&
              param2.field_v.length > var14Lifetime1 &&
              param2.field_v[var14Lifetime1] != -1 &&
              dh.field_n.length > param2.field_v[var14Lifetime1]) {
              stackIn_40_0 = dh.field_n[param2.field_v[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = lj.field_b[var15Lifetime1];
            var23 = pl.field_f[var15Lifetime1];
            var24 = lj.field_b[var16];
            var25 = pl.field_f[var16];
            var26 = lj.field_b[var17];
            var27 = pl.field_f[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_45_0 = var21.field_j;
              } else {
                stackIn_45_0 = 8355711;
              }
              var30 = stackIn_45_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = (16711819 & var28 * var32) >>> 8 | (-16711730 & var31 * var28) >>> 8;
              var33 = var33 + 65793 * var29;
              aa.a(var23, var26, var22, var25, var24, var27, var33 >> 1 & 8355711, 102);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_49_0 = var21.field_j;
              } else {
                stackIn_49_0 = 8355711;
              }
              var34 = stackIn_49_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = -1526791937 & var28 * var35 >>> 8 | var36 * var28 >>> 8 & 2080440064;
              var38 = var35 * var29 >>> 8 & -1761672961 | var29 * var36 >>> 8 & 906034944;
              var38 = var38 + var32 * 65793;
              var39 = (var30 * var35 & -16711832) >>> 8 | var36 * var30 >>> 8 & -436142336;
              var37 = var37 + var31 * 65793;
              var39 = var39 + 65793 * var33;
              qk.a(var23, param0 ^ -65890, 255 & var37, var24, (var37 & 65364) >> 8, (var38 & 65309) >> 8, var37 >> 16, var26, var38 & 255, var22, 255 & var39, var25, 255 & var39 >> 8, var38 >> 16, var27, var39 >> 16);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("bf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    bf(ee param0, mc param1) {
        try {
          this.field_t = param0;
          this.field_u = param0.k();
          this.field_q = param1;
          this.field_t.f(128 + this.field_u * wb.field_c >> 8);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new int[8192];
        field_s = "Please try again in a few minutes.";
        field_o = "Open in popup window";
    }
}
