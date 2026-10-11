/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends rqa {
    static int field_q;
    static String field_o;
    static String field_p;

    final static faa a(int param0, byte[] param1) {
        lla var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        faa stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new lla();
          if (param0 != 9) {
            field_o = (String) null;
          }
          var3 = var2.a(param0 - 9, param1);
          stackIn_4_0 = new faa(var3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("wl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(222, 62, param0[0].a(93));
          if (param1 > -119) {
            field_q = 50;
          }
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wl.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    wl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(wma param0, int[] param1, boolean param2, boolean param3, boolean param4, int[] param5, boolean param6) {
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = VoidHunters.field_G;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          if (param2) {
            wl.a(40, (byte[]) null);
          }
          var21 = param5[3] >> 2;
          var22 = param5[4] >> 2;
          var23 = param5[5] >> 2;
          var24 = param5[6] >> 2;
          var25 = param5[7] >> 2;
          var26 = param5[8] >> 2;
          var27 = param5[9] >> 2;
          var28 = param5[10] >> 2;
          var29 = param5[11] >> 2;
          var13 = param1[5] * var26 + var25 * param1[4] + param1[3] * var24 >> 14;
          var12 = param1[3] * var21 + (param1[4] * var22 + param1[5] * var23) >> 14;
          var14 = var28 * param1[4] + (var27 * param1[3] + var29 * param1[5]) >> 14;
          var20 = param1[9] * var27 - (-(var28 * param1[10]) - param1[11] * var29) >> 14;
          var15 = param1[8] * var23 + (var21 * param1[6] + param1[7] * var22) >> 14;
          var17 = param1[8] * var29 + (param1[6] * var27 + param1[7] * var28) >> 14;
          var19 = param1[9] * var24 - (-(param1[10] * var25) - var26 * param1[11]) >> 14;
          var16 = var26 * param1[8] + (var25 * param1[7] + var24 * param1[6]) >> 14;
          var18 = param1[10] * var22 + param1[9] * var21 + var23 * param1[11] >> 14;
          var21Lifetime1 = -param5[0] + param1[0];
          var22Lifetime1 = param1[1] - param5[1];
          var23Lifetime1 = -param5[2] + param1[2];
          var9 = param5[5] * var23Lifetime1 + (param5[4] * var22Lifetime1 + var21Lifetime1 * param5[3]) >> -iob.field_f + 16;
          var11 = var23Lifetime1 * param5[11] + (var21Lifetime1 * param5[9] + var22Lifetime1 * param5[10]) >> 16;
          var10 = var22Lifetime1 * param5[7] + (var21Lifetime1 * param5[6] + param5[8] * var23Lifetime1) >> 16 - iob.field_f;
          var21Lifetime2 = bfb.field_f;
          var22Lifetime2 = bfb.field_j;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (var23Lifetime2 < param0.field_J) {
              var24Lifetime1 = param0.field_r[var23Lifetime2];
              var25Lifetime1 = param0.field_o[var23Lifetime2];
              var26Lifetime1 = param0.field_p[var23Lifetime2];
              var27Lifetime1 = var9 + (var26Lifetime1 * var18 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16 - iob.field_f);
              var28Lifetime1 = var10 + (var25Lifetime1 * var16 + var24Lifetime1 * var13 + var26Lifetime1 * var19 >> -iob.field_f + 16);
              var29Lifetime1 = (var24Lifetime1 * var14 + var25Lifetime1 * var17 + var26Lifetime1 * var20 >> 16) + var11;
              stackIn_65_0 = var29Lifetime1;
              stackIn_65_1 = 50;
              if (var30 == 0) {
                if (stackIn_65_0 >= stackIn_65_1) {
                  cl.field_b[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  lr.field_o[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  pja.field_n[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  pja.field_n[var23Lifetime2] = -2147483648;
                }
                if (param6) {
                  teb.field_b[var23Lifetime2] = var27Lifetime1 >> iob.field_f;
                  gw.field_i[var23Lifetime2] = var28Lifetime1 >> iob.field_f;
                  lka.field_a[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (param0.field_A != null &&
                param0.field_g != null &&
                param0.field_h != null &&
                param0.field_t != null &&
                param0.field_C != null &&
                null != param0.field_H &&
                null != param0.field_e &&
                param0.field_x != null &&
                null != param0.field_l) {
                var23Lifetime2 = 0;
                while (!(param0.field_y <= var23Lifetime2)) {
                  var24Lifetime1 = param0.field_A[var23Lifetime2];
                  var25Lifetime1 = param0.field_g[var23Lifetime2];
                  var26Lifetime1 = param0.field_h[var23Lifetime2];
                  hj.field_o[var23Lifetime2] = (var26Lifetime1 * var18 + var15 * var25Lifetime1 + var12 * var24Lifetime1 >> 16) + var9;
                  vgb.field_p[var23Lifetime2] = var10 + (var13 * var24Lifetime1 - (-(var25Lifetime1 * var16) - var26Lifetime1 * var19) >> 16);
                  kgb.field_b[var23Lifetime2] = var11 + (var17 * var25Lifetime1 + (var24Lifetime1 * var14 + var20 * var26Lifetime1) >> 16);
                  var24Lifetime1 = param0.field_t[var23Lifetime2];
                  var25Lifetime1 = param0.field_C[var23Lifetime2];
                  var26Lifetime1 = param0.field_H[var23Lifetime2];
                  um.field_c[var23Lifetime2] = (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var18 * var26Lifetime1) >> 16) + var9;
                  ji.field_o[var23Lifetime2] = (var19 * var26Lifetime1 + (var24Lifetime1 * var13 + var25Lifetime1 * var16) >> 16) + var10;
                  vmb.field_a[var23Lifetime2] = (var20 * var26Lifetime1 + (var14 * var24Lifetime1 + var25Lifetime1 * var17) >> 16) + var11;
                  var24Lifetime1 = param0.field_e[var23Lifetime2];
                  var25Lifetime1 = param0.field_x[var23Lifetime2];
                  var26Lifetime1 = param0.field_l[var23Lifetime2];
                  uv.field_a[var23Lifetime2] = var9 + (var25Lifetime1 * var15 + var12 * var24Lifetime1 + var18 * var26Lifetime1 >> 16);
                  aoa.field_c[var23Lifetime2] = (var26Lifetime1 * var19 + (var16 * var25Lifetime1 + var13 * var24Lifetime1) >> 16) + var10;
                  mgb.field_p[var23Lifetime2] = (var25Lifetime1 * var17 + var24Lifetime1 * var14 + var26Lifetime1 * var20 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param1[3];
                var10 = param1[4];
                var11 = param1[5];
                var12 = param1[6];
                var13 = param1[7];
                var14 = param1[8];
                var15 = param1[9];
                var16 = param1[10];
                var17 = param1[11];
                var18 = 0;
                while (!(var18 >= param0.field_L)) {
                  stackIn_65_0 = ~bva.field_b.length;
                  stackIn_65_1 = ~var18;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_65_0 >= stackIn_65_1) {
                    break;
                  }
                  var19 = param0.field_k[var18];
                  var20 = param0.field_v[var18];
                  var21Lifetime2 = param0.field_n[var18];
                  bva.field_b[var18] = var21Lifetime2 * var15 + var19 * var9 + var12 * var20 >> 16;
                  mpa.field_o[var18] = var16 * var21Lifetime2 + (var13 * var20 + var10 * var19) >> 16;
                  lf.field_p[var18] = var17 * var21Lifetime2 + var14 * var20 + var11 * var19 >> 16;
                  var18++;
                }
              }
              stackIn_65_0 = param4 ? 1 : 0;
              stackIn_65_1 = var7_int;
            }
            break;
          }
          uhb.a(stackIn_65_0 != 0, stackIn_65_1, (byte) 79, param0, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("wl.B(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        try {
          field_p = null;
          field_o = null;
          if (param0 != -27266) {
            wl.a(48, (byte[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wl.D(" + param0 + ')');
        }
    }

    static {
        field_o = "Offline";
        field_p = "You appear to be telling someone your password - please don't!";
    }
}
