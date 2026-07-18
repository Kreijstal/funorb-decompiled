/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static uc field_a;
    static li field_c;
    static hl field_b;

    final static void a(byte param0, nj param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        nj var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var2_int = -79;
            if (param1.field_m == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (0 != param1.field_a) {
                    break L2;
                  } else {
                    if (0 == param1.field_i) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = 0;
                L3: while (true) {
                  if (var3 >= gi.field_g) {
                    break L1;
                  } else {
                    L4: {
                      var4 = ai.field_d[var3];
                      if (var4.field_p != 2) {
                        break L4;
                      } else {
                        if (var4.field_a != param1.field_a) {
                          break L4;
                        } else {
                          if (param1.field_i == var4.field_i) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var3++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_k != null) {
                  break L5;
                } else {
                  break L5;
                }
              }
              int discarded$2 = -128;
              vd.a(param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("ok.C(").append(-54).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static wb a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        wb stackIn_26_0 = null;
        wb stackIn_38_0 = null;
        wb stackIn_43_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_6_0 = null;
        wb stackOut_12_0 = null;
        wb stackOut_25_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        wb stackOut_42_0 = null;
        wb stackOut_37_0 = null;
        wb stackOut_2_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var6 = stellarshard.field_B;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 64) {
              stackOut_6_0 = bg.field_a;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(-1 + var2_int) != 34) {
                  stackOut_12_0 = h.field_a;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (~var4 > ~(var2_int - 1)) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                          L2: {
                            if (var5 != 34) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                stackOut_25_0 = h.field_a;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              } else {
                                break L2;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        } else {
                          L3: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L3;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_21_0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L4: while (true) {
                  if (~var4 <= ~var2_int) {
                    return null;
                  } else {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (-1 == vk.field_c.indexOf(var5)) {
                          stackOut_42_0 = h.field_a;
                          stackIn_43_0 = stackOut_42_0;
                          return stackIn_43_0;
                        } else {
                          var3 = 0;
                          break L5;
                        }
                      } else {
                        L6: {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        stackOut_37_0 = h.field_a;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0;
                      }
                    }
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            stackOut_2_0 = uj.field_d;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("ok.A(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + 1 + ')');
        }
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = -110 % ((76 - param0) / 49);
        return -od.field_r + dd.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new uc();
        field_c = new li(7, 0, 1, 1);
    }
}
