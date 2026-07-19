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
        wd var4_ref_wd = null;
        int var4 = 0;
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
        wd var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        var19 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 76) {
              ve.field_V = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
              var1_int = tc.field_a.length;
              var21 = new int[var1_int];
              var20 = var21;
              var2 = var20;
              var3 = 0;
              L1: while (true) {
                L2: {
                  if (var3 >= var1_int) {
                    var3 = ve.field_V[9] >> -974685304;
                    break L2;
                  } else {
                    var4_ref_wd = tc.field_a[var3];
                    var17 = var4_ref_wd;
                    var17 = var4_ref_wd;
                    var4_ref_wd.a(2);
                    pf.a((byte) 123, var3);
                    var5 = var4_ref_wd.field_P + var4_ref_wd.field_d >> 487439233;
                    var6 = var4_ref_wd.field_F + var4_ref_wd.field_J >> 1765494209;
                    var7 = var4_ref_wd.field_z + var4_ref_wd.field_v >> -589537535;
                    var8 = ve.field_V[9] >> 1849376450;
                    var9 = ve.field_V[10] >> -1181422782;
                    var10_int = ve.field_V[11] >> 1651563714;
                    var11 = var10_int * kg.field_i[5] + kg.field_i[4] * var9 + var8 * kg.field_i[3] >> -693309330;
                    var12 = var10_int * kg.field_i[8] + var9 * kg.field_i[7] + var8 * kg.field_i[6] >> 87668174;
                    var13 = var8 * kg.field_i[9] - (-(kg.field_i[10] * var9) - kg.field_i[11] * var10_int) >> -555167186;
                    var2[var3] = var13 * var7 + var12 * var6 + var11 * var5 >> -1555775536;
                    var3++;
                    if (var19 != 0) {
                      break L2;
                    } else {
                      continue L1;
                    }
                  }
                }
                L3: {
                  var4 = ve.field_V[10] >> -1280505720;
                  var5 = ve.field_V[11] >> 1449787400;
                  var6 = ji.field_b << -1325414204;
                  var7 = 0;
                  var8 = lm.a(var6, (byte) -118) >> -1662646552;
                  var9 = mf.a(var6, -126) >> -822931640;
                  if (-1 == ua.field_a) {
                    break L3;
                  } else {
                    if (-1 == vl.field_d) {
                      break L3;
                    } else {
                      var7 = -320 + ua.field_a;
                      var9 = -128;
                      var8 = -vl.field_d + 240;
                      break L3;
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
                L4: while (true) {
                  stackOut_13_0 = tc.field_a.length;
                  stackOut_13_1 = var15;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  L5: while (true) {
                    if (stackIn_14_0 <= stackIn_14_1) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var16 = 0;
                      if (var19 == 0) {
                        var17_int = 1;
                        L6: while (true) {
                          if (tc.field_a.length <= var17_int) {
                            var21[var16] = -2147483648;
                            var17 = tc.field_a[var16];
                            pf.a((byte) 114, var16);
                            var18 = 0;
                            L7: while (true) {
                              L8: {
                                if (3 <= var18) {
                                  bg.a(kg.field_i, var17, 90, true, false, false, ve.field_V);
                                  ta.a(var8, var17, var12, var9, var14, var13, var7, (byte) 23);
                                  var15++;
                                  break L8;
                                } else {
                                  kg.field_i[var18] = kg.field_i[var18] + ne.field_a[var15][var18];
                                  var18++;
                                  if (var19 != 0) {
                                    break L8;
                                  } else {
                                    continue L7;
                                  }
                                }
                              }
                              continue L4;
                            }
                          } else {
                            stackOut_19_0 = var21[var16] ^ -1;
                            stackOut_19_1 = var21[var17_int] ^ -1;
                            stackIn_14_0 = stackOut_19_0;
                            stackIn_14_1 = stackOut_19_1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            if (var19 != 0) {
                              continue L5;
                            } else {
                              L9: {
                                if (stackIn_20_0 > stackIn_20_1) {
                                  var16 = var17_int;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var17_int++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "bj.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        pj var13 = null;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (super.a((byte) -122, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_s + (-param3 - (this.field_H - param5));
                var9 = -this.field_K - (this.field_n + param6) + param4;
                if (var9 * var9 + var8_int * var8_int >= this.field_G * this.field_G) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      var10 = Math.atan2((double)var9, (double)var8_int) - kd.field_h;
                      if (var10 >= 0.0) {
                        break L3;
                      } else {
                        var10 = var10 - 3.141592653589793 / (double)this.field_I;
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var10 <= 0.0) {
                      break L2;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)this.field_I;
                      break L2;
                    }
                  }
                  this.field_J = (int)((double)this.field_I * var10 / 6.283185307179586);
                  L4: while (true) {
                    L5: {
                      if (this.field_I > this.field_J) {
                        break L5;
                      } else {
                        this.field_J = this.field_J - this.field_I;
                        if (var12 != 0) {
                          break L1;
                        } else {
                          if (var12 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: while (true) {
                      if (-1 >= (this.field_J ^ -1)) {
                        break L1;
                      } else {
                        this.field_J = this.field_J + this.field_I;
                        if (var12 == 0) {
                          continue L6;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 <= -115) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var13 = (pj) null;
                discarded$1 = this.a((byte) 126, (pj) null, -115, 38, 73, 82, 38);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("bj.F(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    private bj() throws Throwable {
        throw new Error();
    }

    static {
    }
}
