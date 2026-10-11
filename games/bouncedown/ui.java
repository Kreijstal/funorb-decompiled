/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends ai {
    static String field_j;
    static String field_k;
    static vf field_o;
    static int field_m;
    int field_h;
    int field_q;
    ui field_n;
    int field_i;
    int field_l;
    static int field_g;
    int field_r;
    static int field_p;

    final static void a(int param0, byte param1) {
        try {
          int var2_int = 98 / ((51 - param1) / 61);
          hb.field_H = 1000000000L / (long)param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ui.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int[] param3, int[] param4, boolean param5, jk param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        int var31 = 0;
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
        var31 = Bounce.field_N;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param3[3] >> 2;
          var22 = param3[4] >> 2;
          var23 = param3[5] >> 2;
          var24 = param3[6] >> 2;
          var25 = param3[7] >> 2;
          var26 = param3[8] >> 2;
          var27 = param3[9] >> 2;
          var29 = 118 / ((3 - param0) / 47);
          var28 = param3[10] >> 2;
          var30 = param3[11] >> 2;
          var13 = var26 * param4[5] + (param4[3] * var24 + param4[4] * var25) >> 14;
          var12 = param4[3] * var21 + (param4[4] * var22 + var23 * param4[5]) >> 14;
          var19 = param4[9] * var24 - (-(var25 * param4[10]) - var26 * param4[11]) >> 14;
          var14 = param4[4] * var28 + (var27 * param4[3] + param4[5] * var30) >> 14;
          var15 = var21 * param4[6] + (param4[7] * var22 + var23 * param4[8]) >> 14;
          var18 = param4[10] * var22 + param4[9] * var21 + var23 * param4[11] >> 14;
          var16 = param4[7] * var25 + param4[6] * var24 + param4[8] * var26 >> 14;
          var17 = var30 * param4[8] + param4[7] * var28 + param4[6] * var27 >> 14;
          var20 = var27 * param4[9] + param4[10] * var28 + var30 * param4[11] >> 14;
          var21Lifetime1 = param4[0] - param3[0];
          var22Lifetime1 = param4[1] - param3[1];
          var23Lifetime1 = param4[2] - param3[2];
          var9 = var23Lifetime1 * param3[5] + (var22Lifetime1 * param3[4] + var21Lifetime1 * param3[3]) >> 16 - kk.field_s;
          var11 = param3[11] * var23Lifetime1 + var22Lifetime1 * param3[10] + param3[9] * var21Lifetime1 >> 16;
          var10 = var21Lifetime1 * param3[6] + var22Lifetime1 * param3[7] + param3[8] * var23Lifetime1 >> 16 - kk.field_s;
          var21Lifetime2 = qk.field_f;
          var22Lifetime2 = qk.field_e;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (var23Lifetime2 < param6.field_k) {
              var24Lifetime1 = param6.field_g[var23Lifetime2];
              var25Lifetime1 = param6.field_C[var23Lifetime2];
              var26Lifetime1 = param6.field_J[var23Lifetime2];
              var27Lifetime1 = var9 + (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var26Lifetime1 * var18) >> 16 - kk.field_s);
              var28Lifetime1 = var10 + (var25Lifetime1 * var16 + (var13 * var24Lifetime1 + var19 * var26Lifetime1) >> -kk.field_s + 16);
              var29Lifetime1 = var11 + (var24Lifetime1 * var14 + var17 * var25Lifetime1 + var26Lifetime1 * var20 >> 16);
              stackIn_62_0 = -51;
              stackIn_62_1 = ~var29Lifetime1;
              if (var31 == 0) {
                if (stackIn_62_0 >= stackIn_62_1) {
                  ca.field_c[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  kg.field_g[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  r.field_c[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                } else {
                  r.field_c[var23Lifetime2] = -2147483648;
                }
                if (param2) {
                  ld.field_j[var23Lifetime2] = var27Lifetime1 >> kk.field_s;
                  wb.field_c[var23Lifetime2] = var28Lifetime1 >> kk.field_s;
                  bd.field_n[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param6.field_G &&
                param6.field_j != null &&
                param6.field_A != null &&
                null != param6.field_c &&
                param6.field_o != null &&
                param6.field_r != null &&
                null != param6.field_z &&
                null != param6.field_h &&
                null != param6.field_E) {
                var23Lifetime2 = 0;
                while (!(var23Lifetime2 >= param6.field_L)) {
                  var24Lifetime1 = param6.field_G[var23Lifetime2];
                  var25Lifetime1 = param6.field_j[var23Lifetime2];
                  var26Lifetime1 = param6.field_A[var23Lifetime2];
                  il.field_d[var23Lifetime2] = var9 + (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var18 * var26Lifetime1 >> 16);
                  nd.field_F[var23Lifetime2] = (var19 * var26Lifetime1 + var16 * var25Lifetime1 + var24Lifetime1 * var13 >> 16) + var10;
                  pc.field_j[var23Lifetime2] = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var24Lifetime1 * var14 >> 16) + var11;
                  var24Lifetime1 = param6.field_c[var23Lifetime2];
                  var25Lifetime1 = param6.field_o[var23Lifetime2];
                  var26Lifetime1 = param6.field_r[var23Lifetime2];
                  ml.field_f[var23Lifetime2] = var9 + (var12 * var24Lifetime1 + (var15 * var25Lifetime1 + var18 * var26Lifetime1) >> 16);
                  gh.field_I[var23Lifetime2] = (var26Lifetime1 * var19 + var16 * var25Lifetime1 + var24Lifetime1 * var13 >> 16) + var10;
                  fl.field_b[var23Lifetime2] = (var20 * var26Lifetime1 + (var14 * var24Lifetime1 + var25Lifetime1 * var17) >> 16) + var11;
                  var24Lifetime1 = param6.field_z[var23Lifetime2];
                  var25Lifetime1 = param6.field_h[var23Lifetime2];
                  var26Lifetime1 = param6.field_E[var23Lifetime2];
                  ne.field_m[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + var12 * var24Lifetime1 + var25Lifetime1 * var15 >> 16);
                  qe.field_g[var23Lifetime2] = (var25Lifetime1 * var16 + var13 * var24Lifetime1 + var19 * var26Lifetime1 >> 16) + var10;
                  nc.field_a[var23Lifetime2] = (var26Lifetime1 * var20 + (var17 * var25Lifetime1 + var24Lifetime1 * var14) >> 16) + var11;
                  var23Lifetime2++;
                  if (var31 != 0) {
                    return;
                  }
                }
              }
              if (param5) {
                var9 = param4[3];
                var10 = param4[4];
                var11 = param4[5];
                var12 = param4[6];
                var13 = param4[7];
                var14 = param4[8];
                var15 = param4[9];
                var16 = param4[10];
                var17 = param4[11];
                var18 = 0;
                while (!(var18 >= param6.field_d)) {
                  stackIn_62_0 = uc.field_D.length;
                  stackIn_62_1 = var18;
                  if (var31 != 0) {
                    break L2;
                  }
                  if (stackIn_62_0 <= stackIn_62_1) {
                    break;
                  }
                  var19 = param6.field_f[var18];
                  var20 = param6.field_i[var18];
                  var21Lifetime2 = param6.field_x[var18];
                  uc.field_D[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21Lifetime2) >> 16;
                  ih.field_db[var18] = var20 * var13 + (var19 * var10 + var21Lifetime2 * var16) >> 16;
                  nk.field_b[var18] = var11 * var19 + var14 * var20 + var21Lifetime2 * var17 >> 16;
                  var18++;
                }
              }
              stackIn_62_0 = param1 ? 1 : 0;
              stackIn_62_1 = -128;
            }
            break;
          }
          hj.$cfr$intArgs$a$d6db22f779ae(stackIn_62_0 != 0, stackIn_62_1, param6, var8, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ui.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_o = null;
        if (!param0) {
          return;
        }
        try {
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ui.B(" + param0 + ')');
        }
    }

    ui(int param0, int param1, int param2, int param3, int param4) {
        try {
          this.field_q = param0;
          this.field_r = param4;
          this.field_l = param2;
          this.field_h = param1;
          this.field_i = param3;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_k = "This game has been updated! Please reload this page.";
        field_j = "Score - ";
        field_o = new vf();
    }
}
