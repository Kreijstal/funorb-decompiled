/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up {
    static boolean field_d;
    static int field_a;
    static hr[] field_e;
    static boolean[] field_g;
    static hr[] field_c;
    private static int[] field_f;
    static String field_b;

    final static void a(int[] param0, int[] param1, boolean param2, boolean param3, gk param4, boolean param5, int param6) {
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_71_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
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
        int stackIn_62_0Lifetime1;
        int stackIn_62_1Lifetime1;
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
        int var24Lifetime1Lifetime1;
        int var25Lifetime1Lifetime1;
        int var26Lifetime1Lifetime1;
        var30 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var29 = param0[11] >> 2;
          var12 = param1[3] * var21 - (-(param1[4] * var22) - param1[5] * var23) >> 14;
          var13 = param1[4] * var25 + (param1[3] * var24 + var26 * param1[5]) >> 14;
          if (param6 != -1622738130) {
            return;
          }
          var18 = var23 * param1[11] + (param1[10] * var22 + var21 * param1[9]) >> 14;
          var19 = param1[11] * var26 + param1[9] * var24 + var25 * param1[10] >> 14;
          var17 = var27 * param1[6] - (-(var28 * param1[7]) - param1[8] * var29) >> 14;
          var14 = var29 * param1[5] + (param1[4] * var28 + param1[3] * var27) >> 14;
          var16 = var24 * param1[6] - (-(var25 * param1[7]) - param1[8] * var26) >> 14;
          var15 = param1[6] * var21 - (-(var22 * param1[7]) - var23 * param1[8]) >> 14;
          var20 = var29 * param1[11] + (var27 * param1[9] + param1[10] * var28) >> 14;
          var21Lifetime1 = param1[0] - param0[0];
          var22Lifetime1 = -param0[1] + param1[1];
          var23Lifetime1 = -param0[2] + param1[2];
          var9 = var21Lifetime1 * param0[3] + (param0[4] * var22Lifetime1 + param0[5] * var23Lifetime1) >> 16 - jn.field_b;
          var11 = param0[11] * var23Lifetime1 + param0[10] * var22Lifetime1 + var21Lifetime1 * param0[9] >> 16;
          var10 = var21Lifetime1 * param0[6] + var22Lifetime1 * param0[7] + param0[8] * var23Lifetime1 >> 16 - jn.field_b;
          var21Lifetime2 = nk.field_e;
          var22Lifetime2 = nk.field_b;
          var23Lifetime2 = 0;
          L2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var23Lifetime2 < param4.field_D) {
              var24Lifetime1 = param4.field_Q[var23Lifetime2];
              var25Lifetime1 = param4.field_B[var23Lifetime2];
              var26Lifetime1 = param4.field_r[var23Lifetime2];
              var27Lifetime1 = (var12 * var24Lifetime1 + var25Lifetime1 * var15 + var18 * var26Lifetime1 >> -jn.field_b + 16) + var9;
              var28Lifetime1 = (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var19 * var26Lifetime1 >> -jn.field_b + 16) + var10;
              var29Lifetime1 = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var24Lifetime1 * var14 >> 16) + var11;
              stackIn_62_0 = var29Lifetime1;
              stackIn_62_1 = 50;
              if (var30 != 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  stackIn_71_0 = var18;
                  break L2;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_62_0 >= stackIn_62_1) {
                  we.field_z[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  hp.field_o[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  gi.field_k[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                } else {
                  gi.field_k[var23Lifetime2] = -2147483648;
                }
                if (param3) {
                  eq.field_v[var23Lifetime2] = var27Lifetime1 >> jn.field_b;
                  ad.field_q[var23Lifetime2] = var28Lifetime1 >> jn.field_b;
                  field_f[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (null != param4.field_I &&
                null != param4.field_m &&
                null != param4.field_M &&
                null != param4.field_F &&
                null != param4.field_i &&
                param4.field_J != null &&
                param4.field_q != null &&
                null != param4.field_p &&
                null != param4.field_s) {
                var23Lifetime2 = 0;
                while (!(param4.field_n <= var23Lifetime2)) {
                  var24Lifetime1Lifetime1 = param4.field_I[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_m[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_M[var23Lifetime2];
                  ci.field_b[var23Lifetime2] = var9 + (var26Lifetime1Lifetime1 * var18 + var15 * var25Lifetime1Lifetime1 + var12 * var24Lifetime1Lifetime1 >> 16);
                  au.field_h[var23Lifetime2] = (var26Lifetime1Lifetime1 * var19 + (var24Lifetime1Lifetime1 * var13 + var25Lifetime1Lifetime1 * var16) >> 16) + var10;
                  bq.field_d[var23Lifetime2] = var11 + (var25Lifetime1Lifetime1 * var17 + var24Lifetime1Lifetime1 * var14 + var26Lifetime1Lifetime1 * var20 >> 16);
                  var24Lifetime1Lifetime1 = param4.field_F[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_i[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_J[var23Lifetime2];
                  mp.field_b[var23Lifetime2] = var9 + (var25Lifetime1Lifetime1 * var15 + (var12 * var24Lifetime1Lifetime1 + var26Lifetime1Lifetime1 * var18) >> 16);
                  ta.field_e[var23Lifetime2] = (var19 * var26Lifetime1Lifetime1 + (var16 * var25Lifetime1Lifetime1 + var13 * var24Lifetime1Lifetime1) >> 16) + var10;
                  aa.field_d[var23Lifetime2] = var11 + (var14 * var24Lifetime1Lifetime1 - (-(var17 * var25Lifetime1Lifetime1) - var26Lifetime1Lifetime1 * var20) >> 16);
                  var24Lifetime1Lifetime1 = param4.field_q[var23Lifetime2];
                  var25Lifetime1Lifetime1 = param4.field_p[var23Lifetime2];
                  var26Lifetime1Lifetime1 = param4.field_s[var23Lifetime2];
                  ua.field_h[var23Lifetime2] = var9 + (var18 * var26Lifetime1Lifetime1 + (var25Lifetime1Lifetime1 * var15 + var24Lifetime1Lifetime1 * var12) >> 16);
                  jf.field_e[var23Lifetime2] = var10 + (var24Lifetime1Lifetime1 * var13 + var16 * var25Lifetime1Lifetime1 + var19 * var26Lifetime1Lifetime1 >> 16);
                  tl.field_k[var23Lifetime2] = var11 + (var17 * var25Lifetime1Lifetime1 + var14 * var24Lifetime1Lifetime1 + var20 * var26Lifetime1Lifetime1 >> 16);
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param5) {
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
                while (true) {
                  stackIn_62_0Lifetime1 = ~param4.field_c;
                  stackIn_62_1Lifetime1 = ~var18;
                  if (stackIn_62_0Lifetime1 >= stackIn_62_1Lifetime1) {
                    break;
                  }
                  stackIn_71_0 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_71_0 >= of.field_t.length) {
                    break;
                  }
                  var19 = param4.field_x[var18];
                  var20 = param4.field_g[var18];
                  var21Lifetime2 = param4.field_L[var18];
                  of.field_t[var18] = var19 * var9 - (-(var12 * var20) - var15 * var21Lifetime2) >> 16;
                  r.field_r[var18] = var20 * var13 + var19 * var10 + var21Lifetime2 * var16 >> 16;
                  qr.field_d[var18] = var17 * var21Lifetime2 + (var11 * var19 + var20 * var14) >> 16;
                  var18++;
                }
              }
            }
            stackIn_71_0 = param2 ? 1 : 0;
            break;
          }
          ih.a(stackIn_71_0 != 0, param4, -1, var8, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("up.A(");
          if (param0 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param1 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_e = null;
          field_f = null;
          field_g = null;
          if (param0 > -9) {
            up.a((int[]) null, (int[]) null, true, true, (gk) null, false, 41);
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "up.B(" + param0 + ')');
        }
    }

    static {
        field_d = false;
        field_f = new int[8192];
        field_g = new boolean[25];
        field_b = "Cancel";
    }
}
