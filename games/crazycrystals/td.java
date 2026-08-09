/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static double[] field_c;
    static am field_e;
    static String field_a;
    static kl field_b;
    static int field_d;

    final static void a(float param0, String param1, boolean param2) {
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
              ta.field_i = param1;
              pj.field_p = param0;
              if (!param2) {
                break L1;
              } else {
                field_d = 90;
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

            stackIn_5_1 = new StringBuilder().append("td.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            field_c = (double[]) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        field_a = "Account created successfully!";
        field_d = 0;
    }
}
