/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class lk extends pm {
    private fj field_h;
    static String field_j;
    static String field_k;
    static int field_f;
    private boolean field_i;
    private String field_g;

    final static void a(boolean param0, int param1) {
        pn.a(false, (byte) -55, param0);
    }

    final static ln e() {
        return (ln) (Object) new ab();
    }

    public static void d() {
        field_k = null;
        field_j = null;
    }

    final rh a(String param0, int param1) {
        tk var3 = null;
        RuntimeException var3_ref = null;
        rh stackIn_2_0 = null;
        rh stackIn_7_0 = null;
        rh stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_6_0 = null;
        rh stackOut_11_0 = null;
        rh stackOut_10_0 = null;
        rh stackOut_1_0 = null;
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
            if (((lk) this).field_h.a(param0, param1) != uc.field_b) {
              L1: {
                if (param0.equals((Object) (Object) ((lk) this).field_g)) {
                  break L1;
                } else {
                  var3 = um.a((byte) 110, param0);
                  if (!var3.a(36)) {
                    stackOut_6_0 = gj.field_v;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    ((lk) this).field_g = param0;
                    ((lk) this).field_i = var3.a(false);
                    break L1;
                  }
                }
              }
              L2: {
                if (((lk) this).field_i) {
                  stackOut_11_0 = mc.field_g;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = uc.field_b;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = uc.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("lk.I(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    lk(tb param0, tb param1) {
        super(param0);
        ((lk) this).field_i = false;
        ((lk) this).field_g = "";
        try {
            ((lk) this).field_h = new fj(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -94) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            if (((lk) this).field_h.a(param0, 2) != uc.field_b) {
              if (((lk) this).a(param0, 2) == uc.field_b) {
                stackOut_7_0 = ng.field_d;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return sd.field_c;
              }
            } else {
              stackOut_3_0 = ((lk) this).field_h.a(param0, (byte) -119);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("lk.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Back";
    }
}
