/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class fj extends ml {
    static bi field_p;
    static bi field_r;
    static String field_q;
    private go field_n;
    static mp field_s;
    static String field_o;
    static va field_t;

    fj(go param0, go param1) {
        super(param0);
        try {
            ((fj) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, qr param1) {
        qr var4 = null;
        qr var5 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var4 = (qr) (Object) param1.field_M.d(0);
            qr var2 = var4;
            while (var4 != null) {
                var4.field_mb = 0;
                var4.field_gb = 0;
                var4.field_w = 0;
                var4.field_db = 0;
                var5 = (qr) (Object) param1.field_M.a((byte) -71);
                var5 = var5;
            }
            if (param0) {
                fj.d(-29);
            }
            param1.field_mb = 0;
            param1.field_w = 0;
            param1.field_db = 0;
            param1.field_gb = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fj.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(boolean param0, String param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (!(((fj) this).field_n instanceof ki)) {
                  break L1;
                } else {
                  var3 = ((ki) (Object) ((fj) this).field_n).a((byte) 73);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.c(-126) != p.field_g) {
                        break L2;
                      } else {
                        if (param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                          break L2;
                        } else {
                          stackOut_7_0 = mh.field_a;
                          stackIn_8_0 = stackOut_7_0;
                          return stackIn_8_0;
                        }
                      }
                    }
                    stackOut_9_0 = var3.a((byte) -63);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                stackOut_13_0 = mh.field_a;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("fj.P(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final u b(int param0, String param1) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        u stackIn_5_0 = null;
        u stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        u stackOut_4_0 = null;
        u stackOut_10_0 = null;
        u stackOut_9_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!(((fj) this).field_n instanceof ki)) {
                break L1;
              } else {
                var3 = ((ki) (Object) ((fj) this).field_n).a((byte) 120);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.c(param0 + 11321) != p.field_g) {
                    stackOut_4_0 = tj.field_b;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == -11196) {
                break L2;
              } else {
                field_r = null;
                break L2;
              }
            }
            L3: {
              if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                stackOut_10_0 = tj.field_b;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = p.field_g;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("fj.N(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0;
    }

    public static void d(int param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        int var1 = 92 % ((11 - param0) / 59);
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "To <%0>: ";
        field_o = "VICTORY!";
    }
}
