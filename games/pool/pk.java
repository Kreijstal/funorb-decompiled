/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vh field_a;
    static String field_c;
    static dd field_b;

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 1 % ((param1 - 27) / 33);
            stackIn_1_0 = fe.a(false, (byte) 70, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("pk.B(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 77 % ((1 - param0) / 46);
        field_a = null;
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 109) {
          if ((fk.field_ab ^ -1) <= -11) {
            if (gk.field_kb) {
              return false;
            } else {
              L0: {
                if (mg.a(-114)) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_a = (vh) null;
          if ((fk.field_ab ^ -1) <= -11) {
            if (gk.field_kb) {
              return false;
            } else {
              L1: {
                if (mg.a(-114)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_c = "Match by...";
    }
}
