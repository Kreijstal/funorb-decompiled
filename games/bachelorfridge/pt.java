/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt implements qda {
    static String[] field_a;
    static String[] field_b;

    public static void a(int param0) {
        try {
          int var1_int = 1 % ((-76 - param0) / 49);
          field_a = null;
          field_b = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "pt.C(" + param0 + ')');
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        kv var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param0 + param1.field_s;
          if (param2 != 32679) {
            return;
          }
          var7 = param1.field_v + param3;
          oka.a(var6_int, param1.field_p, var7, false, param1.field_q);
          var8 = fr.field_q[1];
          if (param1 instanceof hf &&
            ((hf) (param1)).field_B) {
            var8.d((param1.field_p - var8.field_n >> 1) + var6_int + 1, var7 + 1 + (param1.field_q - var8.field_o >> 1), 256);
          }
          if (param1.e(param2 ^ 31832)) {
            uv.a(-4 + param1.field_p, var7 + 2, param1.field_q - 4, 2 + var6_int, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("pt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, int[] param1, ma param2, boolean param3, byte param4, boolean param5, int[] param6) {
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
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
        var30 = BachelorFridge.field_y;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var29 = param1[11] >> 2;
          var12 = var23 * param6[5] + param6[4] * var22 + param6[3] * var21 >> 14;
          var13 = param6[4] * var25 + var24 * param6[3] + var26 * param6[5] >> 14;
          var19 = param6[9] * var24 + var25 * param6[10] + var26 * param6[11] >> 14;
          var15 = var22 * param6[7] + (var21 * param6[6] + param6[8] * var23) >> 14;
          var17 = var28 * param6[7] + param6[6] * var27 + param6[8] * var29 >> 14;
          var18 = var23 * param6[11] + (var21 * param6[9] + var22 * param6[10]) >> 14;
          var16 = var24 * param6[6] + (param6[7] * var25 + param6[8] * var26) >> 14;
          var20 = var28 * param6[10] + param6[9] * var27 + var29 * param6[11] >> 14;
          var14 = param6[5] * var29 + (param6[4] * var28 + var27 * param6[3]) >> 14;
          var21Lifetime1 = param6[0] - param1[0];
          var22Lifetime1 = param6[1] - param1[1];
          if (param4 != -121) {
            pt.a(101);
          }
          var23Lifetime1 = -param1[2] + param6[2];
          var9 = var23Lifetime1 * param1[5] + (param1[3] * var21Lifetime1 + var22Lifetime1 * param1[4]) >> 16 - ima.field_s;
          var11 = param1[9] * var21Lifetime1 + param1[10] * var22Lifetime1 + var23Lifetime1 * param1[11] >> 16;
          var10 = var23Lifetime1 * param1[8] + (var22Lifetime1 * param1[7] + var21Lifetime1 * param1[6]) >> 16 - ima.field_s;
          var21Lifetime2 = jb.field_h;
          var22Lifetime2 = jb.field_j;
          var23Lifetime2 = 0;
          L3: while (true) {
            if (var23Lifetime2 < param2.field_g) {
              var24Lifetime1 = param2.field_x[var23Lifetime2];
              var25Lifetime1 = param2.field_O[var23Lifetime2];
              var26Lifetime1 = param2.field_r[var23Lifetime2];
              var27Lifetime1 = (var26Lifetime1 * var18 + (var24Lifetime1 * var12 + var25Lifetime1 * var15) >> 16 - ima.field_s) + var9;
              var28Lifetime1 = (var16 * var25Lifetime1 + (var13 * var24Lifetime1 + var26Lifetime1 * var19) >> -ima.field_s + 16) + var10;
              var29Lifetime1 = (var26Lifetime1 * var20 + (var14 * var24Lifetime1 + var25Lifetime1 * var17) >> 16) + var11;
              stackIn_68_0 = ~var29Lifetime1;
              stackIn_68_1 = -51;
              if (var30 == 0) {
                if (stackIn_68_0 > stackIn_68_1) {
                  dl.field_i[var23Lifetime2] = -2147483648;
                } else {
                  du.field_e[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ew.field_s[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                  dl.field_i[var23Lifetime2] = var29Lifetime1;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                }
                if (param5) {
                  on.field_w[var23Lifetime2] = var27Lifetime1 >> ima.field_s;
                  ra.field_s[var23Lifetime2] = var28Lifetime1 >> ima.field_s;
                  ji.field_i[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param2.field_o &&
                param2.field_D != null &&
                param2.field_L != null &&
                null != param2.field_M &&
                param2.field_j != null &&
                param2.field_p != null &&
                param2.field_s != null &&
                null != param2.field_z &&
                param2.field_a != null) {
                var23Lifetime2 = 0;
                while (!(param2.field_K <= var23Lifetime2)) {
                  var24Lifetime1 = param2.field_o[var23Lifetime2];
                  var25Lifetime1 = param2.field_D[var23Lifetime2];
                  var26Lifetime1 = param2.field_L[var23Lifetime2];
                  fm.field_f[var23Lifetime2] = (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var18 * var26Lifetime1) >> 16) + var9;
                  ha.field_m[var23Lifetime2] = var10 + (var13 * var24Lifetime1 + var16 * var25Lifetime1 + var19 * var26Lifetime1 >> 16);
                  eb.field_p[var23Lifetime2] = var11 + (var26Lifetime1 * var20 + var24Lifetime1 * var14 + var17 * var25Lifetime1 >> 16);
                  var24Lifetime1 = param2.field_M[var23Lifetime2];
                  var25Lifetime1 = param2.field_j[var23Lifetime2];
                  var26Lifetime1 = param2.field_p[var23Lifetime2];
                  hha.field_A[var23Lifetime2] = var9 + (var26Lifetime1 * var18 + (var12 * var24Lifetime1 + var15 * var25Lifetime1) >> 16);
                  vea.field_x[var23Lifetime2] = (var19 * var26Lifetime1 + (var13 * var24Lifetime1 + var16 * var25Lifetime1) >> 16) + var10;
                  kea.field_s[var23Lifetime2] = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var14 * var24Lifetime1 >> 16) + var11;
                  var24Lifetime1 = param2.field_s[var23Lifetime2];
                  var25Lifetime1 = param2.field_z[var23Lifetime2];
                  var26Lifetime1 = param2.field_a[var23Lifetime2];
                  tw.field_a[var23Lifetime2] = (var18 * var26Lifetime1 + (var24Lifetime1 * var12 + var25Lifetime1 * var15) >> 16) + var9;
                  mt.field_u[var23Lifetime2] = var10 + (var26Lifetime1 * var19 + var25Lifetime1 * var16 + var13 * var24Lifetime1 >> 16);
                  tja.field_a[var23Lifetime2] = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var14 * var24Lifetime1 >> 16) + var11;
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
                while (!(param2.field_i <= var18)) {
                  stackIn_68_0 = bv.field_G.length;
                  stackIn_68_1 = var18;
                  if (var30 != 0) {
                    break L3;
                  }
                  if (stackIn_68_0 <= stackIn_68_1) {
                    break;
                  }
                  var19 = param2.field_f[var18];
                  var20 = param2.field_N[var18];
                  var21Lifetime2 = param2.field_b[var18];
                  bv.field_G[var18] = var12 * var20 + var9 * var19 + var21Lifetime2 * var15 >> 16;
                  fv.field_x[var18] = var19 * var10 - (-(var20 * var13) - var21Lifetime2 * var16) >> 16;
                  ep.field_l[var18] = var21Lifetime2 * var17 + var19 * var11 + var14 * var20 >> 16;
                  var18++;
                }
              }
              stackIn_68_0 = 1;
              stackIn_68_1 = var7_int;
            }
            break;
          }
          vm.a(stackIn_68_0 != 0, stackIn_68_1, var8, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("pt.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param2 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, byte param7, int param8) {
        int stackIn_17_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = BachelorFridge.field_y;
        try {
          var9_int = param0 + param6;
          if (param6 > 0) {
            dg.e(param0, param2, param6, param1);
            dg.e(param0, param5, param6, param1);
          }
          if (param6 <= 0 ||
            var13 != 0) {
            dg.e(var9_int, param2, -param6, param1);
            dg.e(var9_int, param5, -param6, param1);
          }
          if (param5 > param2) {
            dg.f(var9_int, param2, 1 + (param5 - param2), param1);
            if (param2 <= param4 &&
              param4 < param5) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = 1;
            }
            var10 = stackIn_17_0;
          }
          if (param5 <= param2 ||
            var13 != 0) {
            if (param5 <= param4 &&
              param4 < param2) {
              stackIn_27_0 = 0;
            } else {
              stackIn_27_0 = 1;
            }
            var10 = stackIn_27_0;
            dg.f(var9_int, param5, 1 - param5 + param2, param1);
          }
          if (param7 <= 43) {
            pt.a(-3);
          }
          if (var9_int >= param8) {
            if (var10 != 0) {
              var11 = param2 + param5 >> 1;
              if (param6 <= 0) {
                dg.e(var9_int, var11, -param6, param1);
                var9_int = var9_int - param6;
              }
              if (param6 > 0 ||
                var13 != 0) {
                var9_int = var9_int - param6;
                dg.e(var9_int, var11, param6, param1);
              }
              var12 = -var11 + param4;
              if (0 < var12) {
                dg.f(var9_int, var11, var12, param1);
                if (var13 != 0) {
                  dg.f(var9_int, var11 + var12, -var12, param1);
                }
              } else {
                dg.f(var9_int, var11 + var12, -var12, param1);
              }
            }
            if (!param3) {
              return;
            }
            dg.e(param8, param4, -param8 + var9_int, param1);
            if (var13 == 0) {
              return;
            }
          }
          if (var10 != 0) {
            var11Lifetime1 = param2 + param5 >> 1;
            var12Lifetime1 = -var11Lifetime1 + param4;
            if (param6 <= 0) {
              var9_int = var9_int + param6;
              dg.e(var9_int, var11Lifetime1, -param6, param1);
            }
            if (param6 > 0 ||
              var13 != 0) {
              dg.e(var9_int, var11Lifetime1, param6, param1);
              var9_int = var9_int + param6;
            }
            if (var12Lifetime1 > 0) {
              dg.f(var9_int, var11Lifetime1, var12Lifetime1, param1);
              if (var13 != 0) {
                dg.f(var9_int, var12Lifetime1 + var11Lifetime1, -var12Lifetime1, param1);
              }
            } else {
              dg.f(var9_int, var12Lifetime1 + var11Lifetime1, -var12Lifetime1, param1);
            }
          }
          if (param3) {
            dg.e(var9_int, param4, -var9_int + param8, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var9), "pt.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_b = new String[]{"Turn time (seconds)", "Board", "Team size", "Game type", "Turn limit"};
    }
}
