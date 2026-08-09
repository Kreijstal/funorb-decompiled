/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aua extends mt {
    static String field_d;
    static String field_c;
    static int field_b;

    final tu a(ff param0, int param1) {
        RuntimeException var3 = null;
        ff var4 = null;
        tu stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -25077) {
                break L1;
              } else {
                var4 = (ff) null;
                this.a((ff) null, 53);
                break L1;
              }
            }
            stackIn_3_0 = new tu(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("aua.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public aua() {
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        if (!param0) {
            aua.a(true);
        }
    }

    static {
        field_d = "Continue";
        field_c = "Full";
        field_b = 4;
    }
}
