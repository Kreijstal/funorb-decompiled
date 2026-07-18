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
        Object stackIn_2_0 = null;
        t stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        t stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new t();
                ((ni) (Object) var3).a((byte) -119, param2);
                stackOut_5_0 = (t) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param2;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("qh.E(").append(112).append(',').append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return (Object) (Object) stackIn_6_0;
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
            stackOut_10_1 = new StringBuilder().append("qh.B(").append(param0).append(',').append(param1).append(',');
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
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1) {
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
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        String stackOut_20_0 = null;
        String stackOut_15_0 = null;
        String stackOut_10_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
                                      stackOut_33_0 = vh.field_d;
                                      stackIn_34_0 = stackOut_33_0;
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
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_28_0 = ra.field_a;
                                      stackIn_29_0 = stackOut_28_0;
                                      return stackIn_29_0;
                                    }
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
          L6: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("qh.C(").append(false).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + false + ')');
        }
        return stackIn_34_0;
    }

    final static void a(int param0, int param1) {
        vd.field_y = param0;
        h.field_b = param1;
    }

    public static void a() {
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
