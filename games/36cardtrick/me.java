/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    static String[] field_a;
    static vk[] field_b;
    static String[] field_d;
    static ee field_c;

    final static void a(boolean param0, boolean param1, int[] param2, boolean param3, mg param4, int[] param5, boolean param6) {
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
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
        var30 = Main.field_T;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param5[3] >> 2;
          var22 = param5[4] >> 2;
          var23 = param5[5] >> 2;
          var24 = param5[6] >> 2;
          if (param1) {
            field_d = (String[]) null;
          }
          var25 = param5[7] >> 2;
          var26 = param5[8] >> 2;
          var27 = param5[9] >> 2;
          var28 = param5[10] >> 2;
          var12 = param2[5] * var23 + (var21 * param2[3] + var22 * param2[4]) >> 14;
          var13 = param2[5] * var26 + (var24 * param2[3] + var25 * param2[4]) >> 14;
          var29 = param5[11] >> 2;
          var20 = param2[11] * var29 + var27 * param2[9] + var28 * param2[10] >> 14;
          var19 = param2[9] * var24 + (param2[10] * var25 + var26 * param2[11]) >> 14;
          var14 = var28 * param2[4] + (var27 * param2[3] + param2[5] * var29) >> 14;
          var18 = param2[9] * var21 + (param2[10] * var22 + var23 * param2[11]) >> 14;
          var15 = var21 * param2[6] + param2[7] * var22 + var23 * param2[8] >> 14;
          var16 = var25 * param2[7] + param2[6] * var24 + param2[8] * var26 >> 14;
          var17 = param2[8] * var29 + (param2[6] * var27 + var28 * param2[7]) >> 14;
          var21Lifetime1 = -param5[0] + param2[0];
          var22Lifetime1 = param2[1] - param5[1];
          var23Lifetime1 = param2[2] - param5[2];
          var9 = var21Lifetime1 * param5[3] + (param5[4] * var22Lifetime1 + var23Lifetime1 * param5[5]) >> -th.field_a + 16;
          var11 = param5[9] * var21Lifetime1 + var22Lifetime1 * param5[10] + param5[11] * var23Lifetime1 >> 16;
          var10 = param5[7] * var22Lifetime1 + (param5[6] * var21Lifetime1 + var23Lifetime1 * param5[8]) >> 16 - th.field_a;
          var21Lifetime2 = jb.field_m;
          var22Lifetime2 = jb.field_g;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (param4.field_C > var23Lifetime2) {
              var24Lifetime1 = param4.field_r[var23Lifetime2];
              var25Lifetime1 = param4.field_b[var23Lifetime2];
              var26Lifetime1 = param4.field_O[var23Lifetime2];
              var27Lifetime1 = var9 + (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var18 * var26Lifetime1) >> -th.field_a + 16);
              var28Lifetime1 = var10 + (var26Lifetime1 * var19 + var25Lifetime1 * var16 + var24Lifetime1 * var13 >> 16 - th.field_a);
              var29Lifetime1 = var11 + (var24Lifetime1 * var14 + var25Lifetime1 * var17 + var26Lifetime1 * var20 >> 16);
              stackIn_67_0 = ~var29Lifetime1;
              stackIn_67_1 = -51;
              if (var30 == 0) {
                if (stackIn_67_0 <= stackIn_67_1) {
                  se.field_F[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  ai.field_j[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  lg.field_c[var23Lifetime2] = var29Lifetime1;
                } else {
                  lg.field_c[var23Lifetime2] = -2147483648;
                }
                if (param6) {
                  fd.field_g[var23Lifetime2] = var27Lifetime1 >> th.field_a;
                  pe.field_a[var23Lifetime2] = var28Lifetime1 >> th.field_a;
                  n.field_F[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (param4.field_h != null &&
                param4.field_w != null &&
                param4.field_G != null &&
                param4.field_m != null &&
                null != param4.field_x &&
                null != param4.field_P &&
                param4.field_o != null &&
                null != param4.field_F &&
                param4.field_y != null) {
                var23Lifetime2 = 0;
                while (!(param4.field_M <= var23Lifetime2)) {
                  var24Lifetime1 = param4.field_h[var23Lifetime2];
                  var25Lifetime1 = param4.field_w[var23Lifetime2];
                  var26Lifetime1 = param4.field_G[var23Lifetime2];
                  ti.field_d[var23Lifetime2] = var9 + (var18 * var26Lifetime1 + (var12 * var24Lifetime1 + var15 * var25Lifetime1) >> 16);
                  oa.field_a[var23Lifetime2] = var10 + (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var26Lifetime1 * var19 >> 16);
                  j.field_E[var23Lifetime2] = (var24Lifetime1 * var14 - (-(var17 * var25Lifetime1) - var26Lifetime1 * var20) >> 16) + var11;
                  var24Lifetime1 = param4.field_m[var23Lifetime2];
                  var25Lifetime1 = param4.field_x[var23Lifetime2];
                  var26Lifetime1 = param4.field_P[var23Lifetime2];
                  fl.field_h[var23Lifetime2] = (var25Lifetime1 * var15 + var12 * var24Lifetime1 + var26Lifetime1 * var18 >> 16) + var9;
                  sd.field_b[var23Lifetime2] = var10 + (var16 * var25Lifetime1 + (var24Lifetime1 * var13 + var19 * var26Lifetime1) >> 16);
                  fl.field_e[var23Lifetime2] = var11 + (var26Lifetime1 * var20 + var14 * var24Lifetime1 + var25Lifetime1 * var17 >> 16);
                  var24Lifetime1 = param4.field_o[var23Lifetime2];
                  var25Lifetime1 = param4.field_F[var23Lifetime2];
                  var26Lifetime1 = param4.field_y[var23Lifetime2];
                  ed.field_e[var23Lifetime2] = (var26Lifetime1 * var18 + (var24Lifetime1 * var12 + var15 * var25Lifetime1) >> 16) + var9;
                  la.field_m[var23Lifetime2] = (var19 * var26Lifetime1 + var24Lifetime1 * var13 + var25Lifetime1 * var16 >> 16) + var10;
                  ii.field_b[var23Lifetime2] = (var25Lifetime1 * var17 + (var24Lifetime1 * var14 + var26Lifetime1 * var20) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param3) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (!(var18 >= param4.field_c)) {
                  stackIn_67_0 = var18;
                  stackIn_67_1 = ve.field_d.length;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_67_0 >= stackIn_67_1) {
                    break;
                  }
                  var19 = param4.field_k[var18];
                  var20 = param4.field_B[var18];
                  var21Lifetime2 = param4.field_I[var18];
                  ve.field_d[var18] = var21Lifetime2 * var15 + (var19 * var9 + var12 * var20) >> 16;
                  mc.field_b[var18] = var16 * var21Lifetime2 + var13 * var20 + var19 * var10 >> 16;
                  oa.field_e[var18] = var17 * var21Lifetime2 + var14 * var20 + var19 * var11 >> 16;
                  var18++;
                }
              }
              stackIn_67_0 = param0 ? 1 : 0;
              stackIn_67_1 = var8;
            }
            break;
          }
          tf.a(stackIn_67_0 != 0, stackIn_67_1, param4, (byte) 23, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_72_0 = var7;
          stackIn_72_1 = new StringBuilder().append("me.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param5 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 >= -126) {
          return;
        }
        try {
          field_a = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "me.A(" + param0 + ')');
        }
    }

    final static void a(ee param0, int param1, ee param2, int param3, int param4, int param5, int param6, vg param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, vg param16, int param17, int param18, int param19, vg param20) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          tf.a(param2, (byte) -114, param0, param9);
          kj.a(param15, param8, param10, -112, param11);
          ue.a(param6, -2694, param19);
          if (param12 != -26024) {
            return;
          }
          lc.a(param17, 4, param16, param14, param7, param5);
          ra.a(param3, param20, (byte) -106, param4);
          ki.a(param13, (byte) -90, param18, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_7_0 = var21;
          stackIn_7_1 = new StringBuilder().append("me.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    static {
        field_d = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
