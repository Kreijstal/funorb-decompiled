/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static volatile int field_d;
    static String field_a;
    static bi[] field_c;
    static ul field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 > -23) {
            field_b = (ul) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gb.a(si.field_R);
        int var4 = 16 * param3 + -4;
        int var5 = 16 * param1 - 4;
        gb.a(var4, var5, var4 + 16, var5 + 16);
        se.field_a[param2].f(param0, -4, 128);
        gb.b(si.field_R);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param4 <= -86) {
          rl.field_e[qh.field_D] = param1;
          mh.field_y[qh.field_D] = qh.field_D;
          jl.field_b[qh.field_D] = param2;
          if (ea.field_a > param2) {
            L0: {
              ak.field_f = param2;
              if (lc.field_u < param2) {
                ok.field_L = param2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              kk.field_b[qh.field_D] = param0;
              hg.field_q[qh.field_D] = param3;
              vh.field_i[qh.field_D] = param5;
              var6 = param5 + param0 + param3;
              if (var6 == 0) {
                stackOut_48_0 = 0;
                stackIn_49_0 = stackOut_48_0;
                break L1;
              } else {
                stackOut_47_0 = param0 * 1000 / var6;
                stackIn_49_0 = stackOut_47_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_49_0;
              uj.field_a[qh.field_D] = var7;
              qh.field_D = qh.field_D + 1;
              if (ok.field_L < var7) {
                ok.field_L = var7;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var7 < ak.field_f) {
                ak.field_f = var7;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (lc.field_u < param2) {
                ok.field_L = param2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              kk.field_b[qh.field_D] = param0;
              hg.field_q[qh.field_D] = param3;
              vh.field_i[qh.field_D] = param5;
              var6 = param5 + param0 + param3;
              if (var6 == 0) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L5;
              } else {
                stackOut_34_0 = param0 * 1000 / var6;
                stackIn_36_0 = stackOut_34_0;
                break L5;
              }
            }
            L6: {
              var7 = stackIn_36_0;
              uj.field_a[qh.field_D] = var7;
              qh.field_D = qh.field_D + 1;
              if (ok.field_L < var7) {
                ok.field_L = var7;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (var7 < ak.field_f) {
                ak.field_f = var7;
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          lg.a(80, -23, -25, 98, -100, -103);
          rl.field_e[qh.field_D] = param1;
          mh.field_y[qh.field_D] = qh.field_D;
          jl.field_b[qh.field_D] = param2;
          if (ea.field_a <= param2) {
            L8: {
              if (lc.field_u < param2) {
                ok.field_L = param2;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              kk.field_b[qh.field_D] = param0;
              hg.field_q[qh.field_D] = param3;
              vh.field_i[qh.field_D] = param5;
              var6 = param5 + param0 + param3;
              if (var6 == 0) {
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L9;
              } else {
                stackOut_19_0 = param0 * 1000 / var6;
                stackIn_21_0 = stackOut_19_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_21_0;
              uj.field_a[qh.field_D] = var7;
              qh.field_D = qh.field_D + 1;
              if (ok.field_L < var7) {
                ok.field_L = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var7 < ak.field_f) {
                ak.field_f = var7;
                break L11;
              } else {
                break L11;
              }
            }
            return;
          } else {
            L12: {
              ak.field_f = param2;
              if (lc.field_u < param2) {
                ok.field_L = param2;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              kk.field_b[qh.field_D] = param0;
              hg.field_q[qh.field_D] = param3;
              vh.field_i[qh.field_D] = param5;
              var6 = param5 + param0 + param3;
              if (var6 == 0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L13;
              } else {
                stackOut_6_0 = param0 * 1000 / var6;
                stackIn_8_0 = stackOut_6_0;
                break L13;
              }
            }
            L14: {
              var7 = stackIn_8_0;
              uj.field_a[qh.field_D] = var7;
              qh.field_D = qh.field_D + 1;
              if (ok.field_L < var7) {
                ok.field_L = var7;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (var7 < ak.field_f) {
                ak.field_f = var7;
                break L15;
              } else {
                break L15;
              }
            }
            return;
          }
        }
    }

    final static void a(sg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_l) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  L3: {
                    if (param0.field_b != param1) {
                      break L3;
                    } else {
                      if (0 == param0.field_e) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = 0;
                  L4: while (true) {
                    if (var2_int >= qb.field_a) {
                      break L2;
                    } else {
                      var3 = vg.field_H[var2_int];
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (2 != var3.field_j) {
                            break L5;
                          } else {
                            if (var3.field_b != param0.field_b) {
                              break L5;
                            } else {
                              if (param0.field_e != var3.field_e) {
                                break L5;
                              } else {
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (null == param0.field_c) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ef.a(param0, (byte) -101);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("lg.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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

    final static void a(int param0, int param1) {
        th.field_D = param1;
        if (gg.field_h == null) {
          L0: {
            if (null != hh.field_b) {
              hh.field_b.a(param1, (byte) 63);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 >= -82) {
            lg.a(-113);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            gg.field_h.b(-114, param1);
            if (null != hh.field_b) {
              hh.field_b.a(param1, (byte) 63);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 < -82) {
            return;
          } else {
            lg.a(-113);
            return;
          }
        }
    }

    static {
        field_d = 0;
        field_a = "<%0>Recessed Wall:<%1> doesn't affect the fleas, but means you can't place tiles in its square.";
    }
}
