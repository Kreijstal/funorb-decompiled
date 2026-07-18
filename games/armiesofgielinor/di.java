/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class di extends mk {
    private fn field_k;
    static String field_j;
    static je field_l;

    final static void c(byte param0) {
        if (param0 > -120) {
            di.c((byte) 114);
            qf.a(56);
            gl.a(124, 4);
            return;
        }
        qf.a(56);
        gl.a(124, 4);
    }

    public static void g() {
        field_l = null;
        field_j = null;
        int var1 = -96;
    }

    final gu a(int param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu stackIn_5_0 = null;
        gu stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        gu stackOut_4_0 = null;
        gu stackOut_10_0 = null;
        gu stackOut_9_0 = null;
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
              if (!(((di) this).field_k instanceof eg)) {
                break L1;
              } else {
                var3 = ((eg) (Object) ((di) this).field_k).a(-918933630);
                if (var3 == null) {
                  break L1;
                } else {
                  if (var3.a(false) != oo.field_g) {
                    stackOut_4_0 = rn.field_e;
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == -3137) {
                break L2;
              } else {
                field_l = null;
                break L2;
              }
            }
            L3: {
              if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                stackOut_10_0 = rn.field_e;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = oo.field_g;
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
            stackOut_12_1 = new StringBuilder().append("di.R(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    di(fn param0, fn param1) {
        super(param0);
        try {
            ((di) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (((di) this).field_k instanceof eg) {
                var3 = ((eg) (Object) ((di) this).field_k).a(-918933630);
                if (var3 == null) {
                  break L1;
                } else {
                  L2: {
                    if (var3.a(false) != oo.field_g) {
                      break L2;
                    } else {
                      if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                        stackOut_6_0 = ak.field_j;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = var3.a((byte) 55);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 > 89) {
                break L3;
              } else {
                di.c((byte) 94);
                break L3;
              }
            }
            if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
              stackOut_14_0 = ak.field_j;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("di.O(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "<%0> cannot join; the game is full.";
    }
}
