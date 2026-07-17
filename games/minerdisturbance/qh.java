/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qh implements ad {
    static String field_d;
    static int field_e;
    static int field_a;
    static int field_c;
    static String field_b;

    final static Object a(byte param0, boolean param1, byte[] param2) {
        t var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        t stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        t stackOut_7_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_e = 94;
                break L1;
              }
            }
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new t();
                ((ni) (Object) var3).a((byte) -119, param2);
                stackOut_7_0 = (t) var3;
                stackIn_8_0 = stackOut_7_0;
                return (Object) (Object) stackIn_8_0;
              } else {
                if (param1) {
                  stackOut_12_0 = kh.a(param2, (byte) -16);
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = (byte[]) param2;
                  stackIn_11_0 = stackOut_10_0;
                  return (Object) (Object) stackIn_11_0;
                }
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("qh.E(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return (Object) (Object) stackIn_13_0;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ea var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var6_int = param1 - -param2.field_u;
            var7 = param2.field_t + param3;
            if (param0 == 12088) {
              L1: {
                ng.a(param2.field_q, param2.field_v, 127, var6_int, var7);
                var8 = ed.field_g[1];
                if (!(param2 instanceof hc)) {
                  break L1;
                } else {
                  if (((hc) (Object) param2).field_H) {
                    var8.g((-var8.field_x + param2.field_v >> 1) + 1 + var6_int, var7 - (-1 - (-var8.field_A + param2.field_q >> 1)), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (param2.k(73)) {
                  se.c(2 + var6_int, 2, 2 + var7, param2.field_v - 4, param2.field_q + -4);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("qh.B(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_34_0 = null;
        String stackOut_29_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = rd.field_c;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_int = param1.length();
              L1: {
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    L2: {
                      var4 = cl.a(-95, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (ra.a(118, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (ra.a(117, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (0 < var5) {
                                      stackOut_34_0 = vh.field_d;
                                      stackIn_35_0 = stackOut_34_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      if (!ra.a(116, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (param0) {
                                          break L6;
                                        } else {
                                          stackOut_29_0 = ra.field_a;
                                          stackIn_30_0 = stackOut_29_0;
                                          return stackIn_30_0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_20_0 = vh.field_d;
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    }
                    stackOut_15_0 = rd.field_c;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0;
                  }
                }
              }
              stackOut_10_0 = rd.field_c;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("qh.C(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + 0 + 41);
        }
        return stackIn_35_0;
    }

    final static void a(int param0, int param1, int param2) {
        vd.field_y = param0;
        h.field_b = param1;
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = 0;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The 3x multiplier gives you triple points! Skilled miners use this to get the best rankings. If you buy 2x AND 3x, they combine to a massive 6x multiplier!";
        field_a = -1;
        field_e = 0;
        field_c = 2;
        field_b = "Ranking: Mhor's Mickaxe mof Massive Mining Multraness";
    }
}
