/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    String field_f;
    static String[] field_d;
    String field_e;
    boolean field_c;
    static int field_a;
    static String field_b;

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
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
                var3 = (String) null;
                gi.a((String) null, 39, (byte) -76);
                break L1;
              }
            }
            stackIn_3_0 = pi.a(param1, 0, param1.length, 21197);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gi.A(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, int param1, byte param2) {
        try {
            kf.field_q = param1;
            int var3_int = 67 % ((34 - param2) / 41);
            ga.field_a = ho.field_e;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 102 % ((60 - param0) / 43);
    }

    static {
    }
}
