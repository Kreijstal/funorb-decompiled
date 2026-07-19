/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends ag {
    int field_T;
    static String field_H;
    static volatile int field_K;
    static nf field_O;
    static String[] field_I;
    static String field_S;
    static String field_J;
    static String field_R;
    static String field_N;
    int field_Q;
    static String field_L;
    int field_M;
    int field_P;
    int field_U;
    int field_V;

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (0 == vn.field_b.field_A.length) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var1_int = -1;
                var2 = 0;
                var3 = -1;
                var4 = 0;
                if (16777215 != vn.field_b.field_A[0]) {
                  var5 = 16777062;
                  var6 = 13985024;
                  var7 = 10027008;
                  var8 = 16750848;
                  var9 = 16577194;
                  var10 = 16777113;
                  var11 = 0;
                  var14 = new int[]{(16711680 & var7) >> 246660304, (var7 & 65280) >> -234421912, var7 & 255, (16711680 & var8) >> -1236929776, (65280 & var8) >> -1832549976, var8 & 255};
                  var15 = new int[]{var5 >> 491697968 & 255, (65280 & var5) >> 2038550728, var5 & 255, 255 & var6 >> -1425795120, (65280 & var6) >> -1969356504, var6 & 255};
                  var16 = 0;
                  L2: while (true) {
                    if (vn.field_b.field_y <= var16) {
                      break L1;
                    } else {
                      var17 = -var16 + vn.field_b.field_y;
                      var18 = (var14[2] * var16 + var14[5] * var17) / vn.field_b.field_y + ((var17 * var14[3] + var16 * var14[0]) / vn.field_b.field_y * 65536 + 256 * ((var14[4] * var17 + var14[1] * var16) / vn.field_b.field_y));
                      var13 = sm.field_d.field_w * (var16 % sm.field_d.field_w);
                      var19 = (var17 * var15[2] + var15[5] * var16) / vn.field_b.field_y + (256 * ((var17 * var15[1] + var15[4] * var16) / vn.field_b.field_y) + (var15[0] * var17 + var16 * var15[3]) / vn.field_b.field_y * 65536);
                      var12 = g.field_a.field_w * (var16 % g.field_a.field_w);
                      var20 = 0;
                      L3: while (true) {
                        if (var20 >= vn.field_b.field_q) {
                          var16++;
                          continue L2;
                        } else {
                          L4: {
                            L5: {
                              var21 = vn.field_b.field_A[var11];
                              if (16711680 == var21) {
                                break L5;
                              } else {
                                if (-16646145 == (var21 ^ -1)) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var21 = var18;
                            var22 = 255 & g.field_a.field_A[var12];
                            var22 = (3 * var22 - -4352) / 20;
                            vn.field_b.field_A[var11] = dg.a(dg.a(16711680, var21) * var22 >> 740062728, 16711680) - -(dg.a(16711874, dg.a(var21, 65280) * var22) >> 1489374472) - -dg.a(255, var22 * dg.a(255, var21) >> -644891416);
                            var22 = 256 - var22;
                            vn.field_b.field_A[var11] = vn.field_b.field_A[var11] + (dg.a(var22 * dg.a(var10, 16711680) >> -603997784, 16711680) + (dg.a(65280, var22 * dg.a(65280, var10) >> -1580492952) - -(dg.a(65495, dg.a(var10, 255) * var22) >> 1938440616)));
                            if (-1 == (vn.field_b.field_A[var11] ^ -1)) {
                              vn.field_b.field_A[var11] = 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L6: {
                            L7: {
                              if (-65281 == (var21 ^ -1)) {
                                break L7;
                              } else {
                                if (var21 == 65024) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var21 = var19;
                            var22 = 255 & sm.field_d.field_A[var13];
                            var22 = (var22 - -256) / 2;
                            vn.field_b.field_A[var11] = (dg.a(dg.a(var21, 255) * var22, 65435) >> 1074212488) + (dg.a(16711680, dg.a(16711680, var21) * var22 >> -556831576) + (dg.a(dg.a(var21, 65280) * var22, 16711725) >> -290658808));
                            var22 = -var22 + 256;
                            vn.field_b.field_A[var11] = vn.field_b.field_A[var11] + (dg.a(65280, var22 * dg.a(var9, 65280) >> -1477326616) + dg.a(dg.a(16711680, var9) * var22 >> 1953862856, 16711680) - -dg.a(255, var22 * dg.a(255, var9) >> -2069157688));
                            if (vn.field_b.field_A[var11] != 0) {
                              break L6;
                            } else {
                              vn.field_b.field_A[var11] = 1;
                              break L6;
                            }
                          }
                          L8: {
                            L9: {
                              if (65535 == var21) {
                                break L9;
                              } else {
                                if ((var21 ^ -1) == -65279) {
                                  break L9;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if ((var1_int ^ -1) == 0) {
                              var2 = var16;
                              var1_int = var20;
                              break L8;
                            } else {
                              var4 = var16;
                              var3 = var20;
                              break L8;
                            }
                          }
                          L10: {
                            var11++;
                            var12++;
                            if (var12 < g.field_a.field_A.length) {
                              break L10;
                            } else {
                              var12 = 0;
                              break L10;
                            }
                          }
                          var13++;
                          if (sm.field_d.field_A.length <= var13) {
                            var13 = 0;
                            var20++;
                            continue L3;
                          } else {
                            var20++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              vn.field_b.field_A[0] = 0;
              var5 = -3;
              L11: while (true) {
                if ((var5 ^ -1) < -4) {
                  var5 = -2;
                  L12: while (true) {
                    if (-3 > (var5 ^ -1)) {
                      var5 = -1;
                      L13: while (true) {
                        if (-2 > (var5 ^ -1)) {
                          vn.field_b.a(1, -1, 14540253);
                          if (param0 == 491697968) {
                            L14: {
                              vn.field_b.a(1, 0, 13421772);
                              vn.field_b.a(0, 1, 12303291);
                              vn.field_b.a(1, 1, 11184810);
                              vn.field_b.c(0, 0);
                              if (-1 == var1_int) {
                                break L14;
                              } else {
                                var1_int = var1_int + vn.field_b.field_x;
                                var2 = var2 + vn.field_b.field_o;
                                var5 = 0;
                                L15: while (true) {
                                  if (var5 >= 50) {
                                    var5 = 0;
                                    L16: while (true) {
                                      if (-101 >= (var5 ^ -1)) {
                                        gn.a(16, (byte) 99, 32, var1_int, var2);
                                        break L14;
                                      } else {
                                        var6 = (int)(Math.sin(3.141592653589793 * (double)var5 / 50.0) * 40.0 + (double)var1_int);
                                        var7 = (int)(Math.cos((double)var5 * 3.141592653589793 / 50.0) * 40.0 + (double)var2);
                                        gn.a(2, (byte) 61, 16, var6, var7);
                                        var5++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    gn.a(2, (byte) 92, 50 - var5, var1_int, var5 + var2);
                                    gn.a(2, (byte) 93, -var5 + 50, var1_int, -var5 + var2);
                                    gn.a(2, (byte) 76, -var5 + 50, var5 + var1_int, var2);
                                    gn.a(2, (byte) 87, -var5 + 50, -var5 + var1_int, var2);
                                    var5++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                            L17: {
                              if ((var3 ^ -1) != 0) {
                                var4 = var4 + vn.field_b.field_o;
                                var3 = var3 + vn.field_b.field_x;
                                var5 = 0;
                                L18: while (true) {
                                  if (var5 >= 30) {
                                    var5 = 0;
                                    L19: while (true) {
                                      if ((var5 ^ -1) <= -101) {
                                        break L17;
                                      } else {
                                        var6 = (int)((double)var3 + 20.0 * Math.sin(3.141592653589793 * (double)var5 / 50.0));
                                        var7 = (int)(20.0 * Math.cos((double)var5 * 3.141592653589793 / 50.0) + (double)var4);
                                        gn.a(2, (byte) 126, 8, var6, var7);
                                        var5++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    gn.a(2, (byte) 72, -var5 + 30, var3, var4 + var5);
                                    gn.a(2, (byte) 72, 30 - var5, var3, var4 + -var5);
                                    gn.a(2, (byte) 88, -var5 + 30, var3 + var5, var4);
                                    gn.a(2, (byte) 109, -var5 + 30, var3 - var5, var4);
                                    var5++;
                                    continue L18;
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                            vn.field_b.field_A[0] = 16777215;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          vn.field_b.a(-2, var5 + 0, 16777215);
                          vn.field_b.a(2, 0 + var5, 16777215);
                          vn.field_b.a(var5, -2, 16777215);
                          vn.field_b.a(var5, 2, 16777215);
                          var5++;
                          continue L13;
                        }
                      }
                    } else {
                      vn.field_b.a(-3, var5 + 0, 13421772);
                      vn.field_b.a(3, 0 - -var5, 13421772);
                      vn.field_b.a(var5, -3, 13421772);
                      vn.field_b.a(var5, 3, 13421772);
                      var5++;
                      continue L12;
                    }
                  }
                } else {
                  vn.field_b.a(-4, 0 - -var5, 1);
                  vn.field_b.a(4, var5 + 0, 1);
                  vn.field_b.a(var5, -4, 1);
                  vn.field_b.a(var5, 4, 1);
                  var5++;
                  continue L11;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rk.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void f(int param0) {
        jb.field_m = null;
        int var1 = 91 % ((param0 - 47) / 56);
        ik.field_e = null;
    }

    final static boolean a(byte param0, int param1, int param2) {
        int var3 = -66 / ((param0 - 8) / 46);
        int var4 = om.field_x != null ? 1 : 0;
        if ((vn.field_d ^ -1) == -10) {
            if (wj.a(of.field_c, ao.field_e, gd.field_rb, 2, fo.field_h)) {
                if (2 != gd.field_rb) {
                    if (!(var4 == 0)) {
                        return false;
                    }
                }
                return va.a(fo.field_h, 1, ao.field_e, of.field_c, gd.field_rb);
            }
        }
        if (!(-11 != (vn.field_d ^ -1))) {
            if (var4 != 0) {
                return false;
            }
            gj.a((byte) 103);
            return true;
        }
        if (-12 == (vn.field_d ^ -1)) {
            if (bo.field_c) {
                if (2 == qj.field_c) {
                    if (!(kg.a(rf.field_n, true, vh.field_A))) {
                        return false;
                    }
                }
                if ((qj.field_c ^ -1) != -3) {
                    if (!(var4 == 0)) {
                        return false;
                    }
                }
                if (!le.a((byte) 82)) {
                    return true;
                }
                String var5 = (String) null;
                sd.a(hi.field_g, (String) null, 68, param1, qj.field_c, vh.field_A);
                return true;
            }
        }
        return false;
    }

    final boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var8_int = -57 / ((param4 - -42) / 35);
            if (!super.a(param0, param1, param2, param3, 92, param5, param6)) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var9 = -this.field_T - this.field_n - (param6 - param5);
              var10 = param0 - (this.field_U + this.field_j) - param3;
              if (var9 * var9 + var10 * var10 < this.field_V * this.field_V) {
                L1: {
                  var11 = Math.atan2((double)var10, (double)var9) - jh.field_h;
                  if (0.0 > var11) {
                    var11 = var11 - 3.141592653589793 / (double)this.field_P;
                    break L1;
                  } else {
                    if (0.0 < var11) {
                      var11 = var11 + 3.141592653589793 / (double)this.field_P;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_Q = (int)(var11 * (double)this.field_P / 6.283185307179586);
                L2: while (true) {
                  if (this.field_Q < this.field_P) {
                    L3: while (true) {
                      if (this.field_Q >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_Q = this.field_Q + this.field_P;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_Q = this.field_Q - this.field_P;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var8);
            stackOut_18_1 = new StringBuilder().append("rk.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final static boolean a(byte param0, char param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var2 = 50 / ((65 - param0) / 52);
            if (param1 == 160) {
              break L1;
            } else {
              if (32 == param1) {
                break L1;
              } else {
                if (param1 == 95) {
                  break L1;
                } else {
                  if (45 != param1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void h(int param0) {
        field_R = null;
        field_O = null;
        field_J = null;
        if (param0 > -100) {
            field_H = (String) null;
        }
        field_L = null;
        field_S = null;
        field_I = null;
        field_H = null;
        field_N = null;
    }

    final static long a(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -45) {
            discarded$0 = rk.a((byte) -44, 74, 126);
        }
        return -hi.field_d + qj.b(-26572);
    }

    private rk() throws Throwable {
        throw new Error();
    }

    static {
        field_K = 0;
        field_H = "Achieved";
        field_J = "Elven Isles:";
        field_S = "MOST FIT - ";
        field_R = "Service unavailable";
        field_N = "Chat is currently disabled.";
        field_L = "Unable to delete name - system busy";
    }
}
