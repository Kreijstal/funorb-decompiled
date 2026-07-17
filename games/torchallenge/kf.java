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
        RuntimeException runtimeException = null;
        int var2_int = 0;
        bf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_n != null) {
              L1: {
                L2: {
                  if (param1.field_k != 0) {
                    break L2;
                  } else {
                    if (param1.field_m == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (~vd.field_f >= ~var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = we.field_i[var2_int];
                      if (var3.field_b != 2) {
                        break L4;
                      } else {
                        if (param1.field_k != var3.field_k) {
                          break L4;
                        } else {
                          if (~var3.field_m == ~param1.field_m) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_j != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              if (param0 == 1) {
                ib.a(true, param1);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) runtimeException;
            stackOut_19_1 = new StringBuilder().append("kf.B(").append(param0).append(44);
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
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
    }

    final static int a(qe param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
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
              stackOut_33_0 = -1;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            } else {
              if (n.field_kb != null) {
                L2: {
                  if (param0.field_H < 0) {
                    break L2;
                  } else {
                    if (param0.field_H >= ol.field_g.field_a) {
                      break L2;
                    } else {
                      if (n.field_kb[param0.field_o][param0.field_H] == null) {
                        n.field_kb[param0.field_o][param0.field_H] = new int[8];
                        var3_int = 0;
                        L3: while (true) {
                          if (var3_int >= 8) {
                            n.field_kb[param0.field_o][param0.field_H][0] = param1;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0;
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
                              stackOut_27_0 = 1;
                              stackIn_28_0 = stackOut_27_0;
                              return stackIn_28_0;
                            } else {
                              return 1;
                            }
                          } else {
                            if (n.field_kb[param0.field_o][param0.field_H][var7] != param1) {
                              L6: {
                                if (n.field_kb[param0.field_o][param0.field_H][var7] <= -1) {
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var7++;
                              continue L5;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_21_0 = stackOut_20_0;
                              return stackIn_21_0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_29_0 = -1;
                stackIn_30_0 = stackOut_29_0;
                return stackIn_30_0;
              } else {
                stackOut_3_0 = -1;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("kf.A(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_34_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new k(13, 0, 1, 0);
        field_d = 0;
        field_a = null;
    }
}
