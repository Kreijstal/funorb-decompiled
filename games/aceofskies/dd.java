/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static int[] field_c;
    static String field_d;
    static String field_b;
    static int field_a;

    final static jm a(String param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cm var4 = null;
        cm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -17 % ((param2 - -32) / 35);
            var4 = new cm();
            ((jm) ((Object) var4)).field_f = param1;
            ((jm) ((Object) var4)).field_e = param0;
            stackIn_1_0 = (cm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("dd.A(");

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
          throw pn.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (jm) ((Object) stackIn_1_0);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -31619) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "Age:";
        field_d = "Cancel";
    }
}
