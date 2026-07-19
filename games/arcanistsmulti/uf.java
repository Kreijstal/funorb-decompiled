/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static String field_b;
    static vn field_a;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, String param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (-1 == (ch.field_d.field_U ^ -1)) {
                break L1;
              } else {
                if (!wh.field_g) {
                  if (ld.field_p) {
                    gj.a((byte) -124);
                    break L1;
                  } else {
                    ef.field_r = true;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param4 == -7361) {
                break L2;
              } else {
                field_b = (String) null;
                break L2;
              }
            }
            L3: {
              if (!ef.field_r) {
                break L3;
              } else {
                fn.a(20, param5, param1, param1, (byte) -104, param2, param7, param0, param6);
                tm.field_d.b(param3, (byte) 52);
                if (!param3) {
                  break L3;
                } else {
                  L4: {
                    if (-1 != (hf.field_f.field_U ^ -1)) {
                      ef.field_r = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (0 != ih.field_d.field_U) {
                    ue.b(10);
                    ef.field_r = false;
                    break L3;
                  } else {
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (runtimeException);
            stackOut_17_1 = new StringBuilder().append("uf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -17 / ((param0 - -33) / 42);
        field_b = null;
    }

    static {
        field_b = "Waiting for <%0> to start the game...";
    }
}
