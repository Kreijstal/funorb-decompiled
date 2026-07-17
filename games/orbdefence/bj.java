/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends s {
    int field_K;
    int field_J;
    int field_L;
    int field_G;
    int field_I;
    int field_H;

    final static void j(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var4_ref_wd = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        wd var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException decompiledCaughtException = null;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 76) {
              ve.field_V = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
              var1_int = tc.field_a.length;
              var23 = new int[var1_int];
              var22 = var23;
              var21 = var22;
              var20 = var21;
              var2 = var20;
              var3 = 0;
              L1: while (true) {
                if (var3 >= var1_int) {
                  L2: {
                    var3 = ve.field_V[9] >> 8;
                    var4 = ve.field_V[10] >> 8;
                    var5 = ve.field_V[11] >> 8;
                    var6 = ji.field_b << 4;
                    var7 = 0;
                    var8 = lm.a(var6, (byte) -118) >> 8;
                    var9 = mf.a(var6, -126) >> 8;
                    if (-1 == ua.field_a) {
                      break L2;
                    } else {
                      if (-1 == vl.field_d) {
                        break L2;
                      } else {
                        var7 = -320 + ua.field_a;
                        var9 = -128;
                        var8 = -vl.field_d + 240;
                        break L2;
                      }
                    }
                  }
                  var10 = 256.0 / Math.sqrt((double)(var7 * var7 + (var8 * var8 - -(var9 * var9))));
                  var9 = (int)((double)var9 * var10);
                  var8 = (int)((double)var8 * var10);
                  var7 = (int)((double)var7 * var10);
                  var12 = var7 + -var3;
                  var13 = -var4 + var8;
                  var14 = -var5 + var9;
                  var10 = 256.0 / Math.sqrt((double)(var12 * var12 - (-(var13 * var13) + -(var14 * var14))));
                  var14 = (int)((double)var14 * var10);
                  var13 = (int)((double)var13 * var10);
                  var12 = (int)((double)var12 * var10);
                  var15 = 0;
                  L3: while (true) {
                    if (tc.field_a.length <= var15) {
                      break L0;
                    } else {
                      var16 = 0;
                      var17_int = 1;
                      L4: while (true) {
                        if (tc.field_a.length <= var17_int) {
                          var23[var16] = -2147483648;
                          var17 = tc.field_a[var16];
                          pf.a((byte) 114, var16);
                          var18 = 0;
                          L5: while (true) {
                            if (3 <= var18) {
                              bg.a(kg.field_i, var17, 90, true, false, false, ve.field_V);
                              ta.a(var8, var17, var12, var9, var14, var13, var7, (byte) 23);
                              var15++;
                              continue L3;
                            } else {
                              kg.field_i[var18] = kg.field_i[var18] + ne.field_a[var15][var18];
                              var18++;
                              continue L5;
                            }
                          }
                        } else {
                          L6: {
                            if (var23[var16] < var23[var17_int]) {
                              var16 = var17_int;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var17_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var4_ref_wd = tc.field_a[var3];
                  var4_ref_wd.a(2);
                  pf.a((byte) 123, var3);
                  var5 = var4_ref_wd.field_P + var4_ref_wd.field_d >> 1;
                  var6 = var4_ref_wd.field_F + var4_ref_wd.field_J >> 1;
                  var7 = var4_ref_wd.field_z + var4_ref_wd.field_v >> 1;
                  var8 = ve.field_V[9] >> 2;
                  var9 = ve.field_V[10] >> 2;
                  var10_int = ve.field_V[11] >> 2;
                  var11 = var10_int * kg.field_i[5] + kg.field_i[4] * var9 + var8 * kg.field_i[3] >> 14;
                  var12 = var10_int * kg.field_i[8] + var9 * kg.field_i[7] + var8 * kg.field_i[6] >> 14;
                  var13 = var8 * kg.field_i[9] - (-(kg.field_i[10] * var9) - kg.field_i[11] * var10_int) >> 14;
                  var2[var3] = var13 * var7 + var12 * var6 + var11 * var5 >> 16;
                  var3++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "bj.K(" + param0 + 41);
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (super.a((byte) -122, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((bj) this).field_s + (-param3 - (((bj) this).field_H - param5));
                var9 = -((bj) this).field_K - (((bj) this).field_n + param6) + param4;
                if (var9 * var9 + var8_int * var8_int >= ((bj) this).field_G * ((bj) this).field_G) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - kd.field_h;
                    if (var10 >= 0.0) {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((bj) this).field_I;
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)((bj) this).field_I;
                      break L2;
                    }
                  }
                  ((bj) this).field_J = (int)((double)((bj) this).field_I * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((bj) this).field_I > ((bj) this).field_J) {
                      L4: while (true) {
                        if (((bj) this).field_J >= 0) {
                          break L1;
                        } else {
                          ((bj) this).field_J = ((bj) this).field_J + ((bj) this).field_I;
                          continue L4;
                        }
                      }
                    } else {
                      ((bj) this).field_J = ((bj) this).field_J - ((bj) this).field_I;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            } else {
              if (param0 <= -115) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                var13 = null;
                boolean discarded$1 = ((bj) this).a((byte) 126, (pj) null, -115, 38, 73, 82, 38);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("bj.F(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_18_0 != 0;
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
