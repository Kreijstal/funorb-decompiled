/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hka {
    static jpa field_c;
    static lja field_b;
    static int field_a;

    final static taa a(int param0, uia param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uia var4 = null;
        taa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var4 = (uia) null;
                hka.a(62, (uia) null);
                break L1;
              }
            }
            var2_int = param1.h(255);
            var3 = param1.h(255);
            stackIn_3_0 = new taa(var2_int, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("hka.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            hka.a(true);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = 0;
    }
}
