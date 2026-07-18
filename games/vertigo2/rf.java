/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rf extends da {
    static int field_l;
    static ch field_p;
    static si field_o;
    private kp field_r;
    static tq field_n;
    static int field_q;
    static int field_s;
    static String[][] field_m;

    public static void g(int param0) {
        field_m = null;
        field_n = null;
        field_o = null;
        field_p = null;
    }

    final String b(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_12_0 = null;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!(((rf) this).field_r instanceof ik)) {
                break L1;
              } else {
                var3 = ((ik) (Object) ((rf) this).field_r).a((byte) -5);
                if (var3 != null) {
                  L2: {
                    if (var3.a(-23996) != qm.field_G) {
                      break L2;
                    } else {
                      if (!param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                        stackOut_6_0 = gl.field_a;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = var3.d(param0 + -30797);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  break L1;
                }
              }
            }
            if (!param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
              stackOut_12_0 = gl.field_a;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0;
            } else {
              if (param0 != 3614) {
                field_q = 90;
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("rf.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return (String) (Object) stackIn_17_0;
    }

    final ba a(int param0, String param1) {
        of var3 = null;
        RuntimeException var3_ref = null;
        ba stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        ba stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ba stackOut_5_0 = null;
        ba stackOut_12_0 = null;
        ba stackOut_11_0 = null;
        Object stackOut_8_0 = null;
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
              if (((rf) this).field_r instanceof ik) {
                var3 = ((ik) (Object) ((rf) this).field_r).a((byte) -5);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(-23996) != qm.field_G) {
                    stackOut_5_0 = ir.field_a;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0 == -1) {
              L2: {
                if (param1.equals((Object) (Object) ((rf) this).field_r.field_w)) {
                  stackOut_12_0 = qm.field_G;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = ir.field_a;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (ba) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("rf.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    rf(kp param0, kp param1) {
        super(param0);
        try {
            ((rf) this).field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new tq(2);
    }
}
