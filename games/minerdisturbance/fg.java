/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg {
    static ag field_d;
    static Calendar field_h;
    static String field_e;
    String field_f;
    static int field_b;
    String field_a;
    boolean field_g;
    static ea[] field_c;

    final static boolean a(int param0, char param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param1 < 48) {
          if (param1 < 65) {
            L0: {
              if (97 > param1) {
                break L0;
              } else {
                if (param1 > 122) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (90 >= param1) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (97 > param1) {
                    break L2;
                  } else {
                    if (param1 > 122) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (param1 > 57) {
            if (param1 >= 65) {
              if (90 < param1) {
                if (97 <= param1) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void a(byte param0, sl param1) {
        int var4 = 0;
        ld var5 = sn.field_c;
        try {
            var5.d((byte) -81, 4);
            var5.field_o = var5.field_o + 1;
            var4 = var5.field_o;
            var5.c(1, 25564);
            var5.c(param1.field_n, 25564);
            var5.c(param1.field_p, 25564);
            var5.a((byte) 122, param1.field_t);
            var5.a((byte) 120, param1.field_s);
            var5.a((byte) 117, param1.field_r);
            var5.a((byte) 94, param1.field_o);
            int discarded$0 = var5.e(86, var4);
            var5.g(-1, var5.field_o - var4);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fg.B(" + 5 + 44 + (param1 != null ? "{...}" : "null") + 44 + 4 + 41);
        }
    }

    final static String[][] a(int param0, sb param1) {
        ta var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[][] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[][] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2 = new ta();
            L1: while (true) {
              if (param1.field_u.length <= param1.field_o) {
                var3 = new String[var2.c((byte) -119)][];
                var4 = 0;
                L2: while (true) {
                  if (var3.length <= var4) {
                    stackOut_7_0 = (String[][]) var3;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    var3[var4] = ((fn) (Object) var2.e(eg.a(65, 63791))).field_n;
                    var4++;
                    continue L2;
                  }
                }
              } else {
                var2.a((byte) -124, (pi) (Object) new fn(lm.a(param1, (byte) -101)));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("fg.C(").append(65).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(byte param0, sb param1) {
        int var2_int = 0;
        try {
            ah.field_b = param1.e(-25) << 5;
            var2_int = param1.d((byte) -54);
            vb.field_b = (var2_int & 7) << 18;
            ah.field_b = ah.field_b + (var2_int >> 3);
            vb.field_b = vb.field_b + (param1.e(-125) << 2);
            var2_int = param1.d((byte) -54);
            tk.field_h = var2_int << 15 & 2064384;
            vb.field_b = vb.field_b + (var2_int >> 6);
            tk.field_h = tk.field_h + (param1.d((byte) -54) << 7);
            var2_int = param1.d((byte) -54);
            tk.field_h = tk.field_h + (var2_int >> 1);
            fl.field_c = var2_int << 16 & 65536;
            fl.field_c = fl.field_c + param1.e(-46);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "fg.A(" + -86 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_h = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ag();
        field_e = "Hydraulic fist: Gives strength to push rock.";
        field_h = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
