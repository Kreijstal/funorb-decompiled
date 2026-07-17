/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tl extends r {
    private c field_n;
    static int field_o;
    static fa field_p;

    public static void c(byte param0) {
        field_p = null;
    }

    final String a(byte param0, String param1) {
        jb var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_12_0 = null;
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
              if (!(((tl) this).field_n instanceof nh)) {
                break L1;
              } else {
                var3 = ((nh) (Object) ((tl) this).field_n).a((byte) 112);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(false) != hm.field_b) {
                      break L2;
                    } else {
                      if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                        break L2;
                      } else {
                        stackOut_4_0 = al.field_c;
                        stackIn_5_0 = stackOut_4_0;
                        return stackIn_5_0;
                      }
                    }
                  }
                  stackOut_6_0 = var3.b(126);
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            if (!param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
              stackOut_10_0 = al.field_c;
              stackIn_11_0 = stackOut_10_0;
              return stackIn_11_0;
            } else {
              var3_int = -127 / ((24 - param0) / 46);
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("tl.A(").append(param0).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return (String) (Object) stackIn_13_0;
    }

    final wd a(int param0, String param1) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        wd stackIn_8_0 = null;
        wd stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_7_0 = null;
        wd stackOut_11_0 = null;
        wd stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 160) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((tl) this).a((byte) -48, (String) null);
                break L1;
              }
            }
            L2: {
              if (((tl) this).field_n instanceof nh) {
                var3 = ((nh) (Object) ((tl) this).field_n).a((byte) 85);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a(false) != hm.field_b) {
                    stackOut_7_0 = ml.field_K;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                stackOut_11_0 = hm.field_b;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = ml.field_K;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("tl.D(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    tl(c param0, c param1) {
        super(param0);
        try {
            ((tl) this).field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
