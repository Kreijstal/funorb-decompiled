/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends wf {
    static int field_G;
    private Object field_E;
    static String field_H;
    static String field_F;
    static String field_I;

    public static void e(byte param0) {
        try {
          field_I = null;
          field_H = null;
          field_F = null;
          if (param0 != -78) {
            field_H = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pb.C(" + param0 + ')');
        }
    }

    final boolean c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 21) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "pb.B(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, int[] param2, boolean param3, qh param4, boolean param5, int[] param6) {
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
        var30 = DungeonAssault.field_K;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param2[3] >> 2;
          var22 = param2[4] >> 2;
          var23 = param2[5] >> 2;
          var24 = param2[6] >> 2;
          var25 = param2[7] >> 2;
          var26 = param2[8] >> 2;
          var27 = param2[9] >> 2;
          var28 = param2[10] >> 2;
          var29 = param2[11] >> 2;
          var12 = var23 * param6[5] + var22 * param6[4] + param6[3] * var21 >> 14;
          var13 = param6[3] * var24 - (-(var25 * param6[4]) - param6[5] * var26) >> 14;
          var20 = var29 * param6[11] + (param6[9] * var27 + var28 * param6[10]) >> 14;
          var18 = var21 * param6[9] + (param6[10] * var22 + var23 * param6[11]) >> 14;
          var19 = var26 * param6[11] + var24 * param6[9] + param6[10] * var25 >> 14;
          var15 = param6[7] * var22 + (var21 * param6[6] + var23 * param6[8]) >> 14;
          var17 = var28 * param6[7] + (param6[6] * var27 + param6[8] * var29) >> 14;
          var16 = param6[8] * var26 + (var24 * param6[6] + var25 * param6[7]) >> 14;
          var14 = var29 * param6[5] + (param6[4] * var28 + var27 * param6[3]) >> 14;
          var21Lifetime1 = -param2[0] + param6[0];
          var22Lifetime1 = param6[1] - param2[1];
          var23Lifetime1 = param6[2] - param2[2];
          var9 = var22Lifetime1 * param2[4] + (param2[3] * var21Lifetime1 + param2[5] * var23Lifetime1) >> 16 - lh.field_t;
          var11 = param2[9] * var21Lifetime1 + var22Lifetime1 * param2[10] + param2[11] * var23Lifetime1 >> 16;
          var10 = param2[8] * var23Lifetime1 + (var21Lifetime1 * param2[6] + param2[7] * var22Lifetime1) >> -lh.field_t + 16;
          var21Lifetime2 = re.field_d;
          var22Lifetime2 = re.field_h;
          var23Lifetime2 = param1;
          L2: while (true) {
            if (var23Lifetime2 < param4.field_B) {
              var24Lifetime1 = param4.field_L[var23Lifetime2];
              var25Lifetime1 = param4.field_S[var23Lifetime2];
              var26Lifetime1 = param4.field_z[var23Lifetime2];
              var27Lifetime1 = var9 + (var15 * var25Lifetime1 + (var12 * var24Lifetime1 + var26Lifetime1 * var18) >> -lh.field_t + 16);
              var28Lifetime1 = var10 + (var26Lifetime1 * var19 + (var13 * var24Lifetime1 + var25Lifetime1 * var16) >> 16 - lh.field_t);
              var29Lifetime1 = (var26Lifetime1 * var20 + (var17 * var25Lifetime1 + var24Lifetime1 * var14) >> 16) + var11;
              stackIn_62_0 = -51;
              stackIn_62_1 = ~var29Lifetime1;
              if (var30 == 0) {
                if (stackIn_62_0 < stackIn_62_1) {
                  ko.field_v[var23Lifetime2] = -2147483648;
                } else {
                  nj.field_g[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ra.field_b[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  ko.field_v[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                }
                if (param5) {
                  ie.field_k[var23Lifetime2] = var27Lifetime1 >> lh.field_t;
                  la.field_l[var23Lifetime2] = var28Lifetime1 >> lh.field_t;
                  ip.field_l[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param4.field_k &&
                null != param4.field_g &&
                null != param4.field_O &&
                param4.field_r != null &&
                null != param4.field_m &&
                null != param4.field_T &&
                param4.field_u != null &&
                null != param4.field_K &&
                null != param4.field_l) {
                var23Lifetime2 = 0;
                while (!(param4.field_h <= var23Lifetime2)) {
                  var24Lifetime1 = param4.field_k[var23Lifetime2];
                  var25Lifetime1 = param4.field_g[var23Lifetime2];
                  var26Lifetime1 = param4.field_O[var23Lifetime2];
                  gi.field_L[var23Lifetime2] = (var24Lifetime1 * var12 + var15 * var25Lifetime1 + var18 * var26Lifetime1 >> 16) + var9;
                  lp.field_B[var23Lifetime2] = var10 + (var13 * var24Lifetime1 + var25Lifetime1 * var16 + var19 * var26Lifetime1 >> 16);
                  ok.field_S[var23Lifetime2] = var11 + (var17 * var25Lifetime1 + var14 * var24Lifetime1 + var26Lifetime1 * var20 >> 16);
                  var24Lifetime1 = param4.field_r[var23Lifetime2];
                  var25Lifetime1 = param4.field_m[var23Lifetime2];
                  var26Lifetime1 = param4.field_T[var23Lifetime2];
                  fg.field_d[var23Lifetime2] = var9 + (var12 * var24Lifetime1 - (-(var15 * var25Lifetime1) - var18 * var26Lifetime1) >> 16);
                  lm.field_m[var23Lifetime2] = var10 + (var16 * var25Lifetime1 + var13 * var24Lifetime1 + var19 * var26Lifetime1 >> 16);
                  tc.field_m[var23Lifetime2] = (var20 * var26Lifetime1 + (var14 * var24Lifetime1 + var17 * var25Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param4.field_u[var23Lifetime2];
                  var25Lifetime1 = param4.field_K[var23Lifetime2];
                  var26Lifetime1 = param4.field_l[var23Lifetime2];
                  i.field_l[var23Lifetime2] = var9 + (var12 * var24Lifetime1 + var15 * var25Lifetime1 + var18 * var26Lifetime1 >> 16);
                  vj.field_d[var23Lifetime2] = (var26Lifetime1 * var19 + var24Lifetime1 * var13 + var16 * var25Lifetime1 >> 16) + var10;
                  fm.field_h[var23Lifetime2] = (var14 * var24Lifetime1 + var17 * var25Lifetime1 + var26Lifetime1 * var20 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param0) {
                var9 = param6[3];
                var10 = param6[4];
                var11 = param6[5];
                var12 = param6[6];
                var13 = param6[7];
                var14 = param6[8];
                var15 = param6[9];
                var16 = param6[10];
                var17 = param6[11];
                var18 = 0;
                while (!(var18 >= param4.field_c)) {
                  stackIn_62_0 = hk.field_c.length;
                  stackIn_62_1 = var18;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_62_0 <= stackIn_62_1) {
                    break;
                  }
                  var19 = param4.field_d[var18];
                  var20 = param4.field_P[var18];
                  var21Lifetime2 = param4.field_v[var18];
                  hk.field_c[var18] = var21Lifetime2 * var15 + (var19 * var9 + var20 * var12) >> 16;
                  p.field_x[var18] = var10 * var19 - (-(var20 * var13) - var21Lifetime2 * var16) >> 16;
                  hd.field_j[var18] = var11 * var19 + var20 * var14 + var17 * var21Lifetime2 >> 16;
                  var18++;
                }
              }
              stackIn_62_0 = var7_int;
              stackIn_62_1 = var8;
            }
            break;
          }
          b.a(stackIn_62_0, stackIn_62_1, (byte) -84, param3, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("pb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param3).append(',');
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
          throw vk.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    final Object d(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 22698) {
            stackIn_4_0 = this.field_E;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Object) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "pb.D(" + param0 + ')');
        }
    }

    pb(Object param0, int param1) {
        super(param1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_E = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pb.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_F = "The changes you have made to your stable have not yet been saved. Would you like them to be saved now?";
        field_I = "TREASURE:";
        field_H = "Continue";
    }
}
