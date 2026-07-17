/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mn extends kca {
    private String field_m;
    private oe field_j;
    private boolean field_l;
    static String field_n;
    static int field_k;

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
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
            if (((mn) this).field_j.a((byte) 14, param1) != fp.field_c) {
              if (param0 == -1) {
                if (((mn) this).a((byte) 14, param1) != fp.field_c) {
                  stackOut_9_0 = dua.field_j;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = woa.field_l;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ((mn) this).field_j.a(param0, param1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mn.B(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final it a(byte param0, String param1) {
        us var3 = null;
        RuntimeException var3_ref = null;
        it stackIn_3_0 = null;
        it stackIn_8_0 = null;
        it stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        it stackOut_2_0 = null;
        it stackOut_7_0 = null;
        it stackOut_12_0 = null;
        it stackOut_11_0 = null;
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
            if (((mn) this).field_j.a(param0, param1) == fp.field_c) {
              stackOut_2_0 = fp.field_c;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((mn) this).field_m)) {
                  break L1;
                } else {
                  var3 = wd.a((byte) -115, param1);
                  if (!var3.b(47)) {
                    stackOut_7_0 = tea.field_b;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    ((mn) this).field_m = param1;
                    ((mn) this).field_l = var3.c(81);
                    break L1;
                  }
                }
              }
              L2: {
                if (((mn) this).field_l) {
                  stackOut_12_0 = uh.field_k;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = fp.field_c;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("mn.A(").append(param0).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    mn(tra param0, tra param1) {
        super(param0);
        ((mn) this).field_l = false;
        ((mn) this).field_m = "";
        try {
            ((mn) this).field_j = new oe(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void h(int param0) {
        oq.a((byte) 124).c(76);
        if (param0 != 30001) {
            field_n = null;
        }
    }

    final static String g(int param0) {
        return ofa.field_D;
    }

    public static void f(int param0) {
        field_n = null;
    }

    static {
    }
}
