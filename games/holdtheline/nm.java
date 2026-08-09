/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static vk field_b;
    static ql field_c;
    static String field_a;

    final static void a(hj param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              gm.field_b = param0;
              if (param1 == 22210) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("nm.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static gn a(boolean param0, int param1, int param2, boolean param3, int param4) {
        if (param2 > -81) {
          nm.a(86);
          return kh.a(param1, param3, param0, false, 10600, param4);
        } else {
          return kh.a(param1, param3, param0, false, 10600, param4);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 > -65) {
            field_b = (vk) null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = "Music: ";
    }
}
