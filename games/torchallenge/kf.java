/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static int field_b;
    static k field_e;
    static int field_c;
    static ji field_a;
    static int field_d;

    final static void a(int param0, bf param1) {
        int var2_int = 0;
        bf var3 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1.field_n == null) {
            return;
        }
        if (param1.field_k != 0 || param1.field_m != 0) {
            for (var2_int = 0; vd.field_f > var2_int; var2_int++) {
                var3 = we.field_i[var2_int];
                if (-3 == (var3.field_b ^ -1)) {
                    if (param1.field_k == var3.field_k) {
                        if (!(var3.field_m != param1.field_m)) {
                            return;
                        }
                    }
                }
            }
        }
        if (param1.field_j == null) {
        }
        if (param0 != 1) {
            return;
        }
        try {
            ib.a(true, param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "kf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 >= -69) {
            field_d = -39;
        }
    }

    final static int a(qe param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = -1;
            var5 = 0;
            if (!vg.a(param0.field_F, -1)) {
              L1: {
                if (param2 == 8) {
                  break L1;
                } else {
                  field_d = 52;
                  break L1;
                }
              }
              stackIn_37_0 = -1;
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              if (n.field_kb != null) {
                L2: {
                  if (-1 < (param0.field_H ^ -1)) {
                    break L2;
                  } else {
                    if (param0.field_H >= ol.field_g.field_a) {
                      break L2;
                    } else {
                      if (n.field_kb[param0.field_o][param0.field_H] == null) {
                        n.field_kb[param0.field_o][param0.field_H] = new int[8];
                        var3_int = 0;
                        L3: while (true) {
                          if ((var3_int ^ -1) <= -9) {
                            n.field_kb[param0.field_o][param0.field_H][0] = param1;
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            n.field_kb[param0.field_o][param0.field_H][var3_int] = -1;
                            var3_int++;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  if (param0.field_H < 0) {
                    break L4;
                  } else {
                    if (param0.field_H >= ol.field_g.field_a) {
                      break L4;
                    } else {
                      if (n.field_kb[param0.field_o][param0.field_H] == null) {
                        break L4;
                      } else {
                        var7 = 0;
                        var3_int = var7;
                        L5: while (true) {
                          if (8 <= var7) {
                            if (var4 >= 0) {
                              n.field_kb[param0.field_o][param0.field_H][var4] = param1;
                              stackIn_31_0 = 1;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              return 1;
                            }
                          } else {
                            if (n.field_kb[param0.field_o][param0.field_H][var7] != param1) {
                              if ((n.field_kb[param0.field_o][param0.field_H][var7] ^ -1) > -1) {
                                L6: {
                                  if (-1 < (var4 ^ -1)) {
                                    var4 = var7;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var7++;
                                continue L5;
                              } else {
                                var7++;
                                continue L5;
                              }
                            } else {
                              stackIn_21_0 = 1;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_33_0 = -1;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                stackIn_4_0 = -1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("kf.A(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_31_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_33_0;
                } else {
                  return stackIn_37_0;
                }
              }
            }
          }
        }
    }

    static {
        field_e = new k(13, 0, 1, 0);
        field_d = 0;
        field_a = null;
    }
}
