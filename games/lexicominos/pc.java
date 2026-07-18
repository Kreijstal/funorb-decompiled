/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class pc extends tj {
    static int[] field_n;
    static String field_m;
    static String field_l;

    public static void d() {
        field_n = null;
        field_m = null;
        field_l = null;
    }

    final static bd a(int param0, int param1, byte param2, int param3, int param4) {
        param3 = -param3 + 11;
        return new bd(-18 + 18 * ((param0 * 12 + param3) * 12 - -param1) - -param4 + -1);
    }

    pc(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        sc stackIn_8_0 = null;
        sc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        sc stackOut_9_0 = null;
        sc stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (ui.a((byte) -100, param1) != null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (param0 == 0) {
              if (var3_int != 0) {
                stackOut_9_0 = rh.field_p;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = ni.field_b;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (sc) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("pc.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
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
            if (param0 == -126) {
              if (((pc) this).a(0, param1) != ni.field_b) {
                stackOut_6_0 = fj.field_x;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = gd.field_j;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pc.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static int e() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wf var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_30_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_27_0 = 0;
            if (kb.field_b.field_p >= 4) {
              if (kb.field_b.field_j != -1) {
                if (kb.field_b.field_j == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (gj.field_t != 0) {
                      break L1;
                    } else {
                      lj.field_b = sa.field_g.a(rc.field_i, (byte) 121, fl.field_d);
                      gj.field_t = gj.field_t + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (gj.field_t != 1) {
                      break L2;
                    } else {
                      if (lj.field_b.field_b != 2) {
                        if (lj.field_b.field_b != 1) {
                          break L2;
                        } else {
                          gj.field_t = gj.field_t + 1;
                          break L2;
                        }
                      } else {
                        stackOut_11_0 = ca.a(-51, -1);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      }
                    }
                  }
                  L3: {
                    if (gj.field_t != 2) {
                      break L3;
                    } else {
                      re.field_X = new ge((java.net.Socket) lj.field_b.field_g, sa.field_g);
                      var2 = new wf(13);
                      la.a((byte) -48, ni.field_e, var2, fc.field_q, qd.field_b);
                      var2.c(15, -1);
                      var2.f(wg.field_e, -32287);
                      re.field_X.a(var2.field_j, 13, 111, 0);
                      gj.field_t = gj.field_t + 1;
                      ta.field_f = rf.c(0) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (3 != gj.field_t) {
                      break L4;
                    } else {
                      if (0 >= re.field_X.d(-6448)) {
                        if (~rf.c(0) >= ~ta.field_f) {
                          break L4;
                        } else {
                          stackOut_24_0 = ca.a(-51, -2);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      } else {
                        var1_int = re.field_X.e(291208897);
                        if (var1_int == 0) {
                          gj.field_t = gj.field_t + 1;
                          break L4;
                        } else {
                          stackOut_20_0 = ca.a(-51, var1_int);
                          stackIn_21_0 = stackOut_20_0;
                          return stackIn_21_0;
                        }
                      }
                    }
                  }
                  if (gj.field_t != 4) {
                    stackOut_29_0 = -1;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    kb.field_b.a(Lexicominos.field_E, -110, (Object) (Object) re.field_X);
                    lj.field_b = null;
                    re.field_X = null;
                    gj.field_t = 0;
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    return stackIn_28_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ca.a(-51, -3);
              }
              return stackIn_30_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_l = "Service unavailable";
    }
}
