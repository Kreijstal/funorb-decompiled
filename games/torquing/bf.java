/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    static int field_c;
    static ei field_a;
    static int field_d;
    static double[] field_b;

    final static sm a(int param0, int param1, la param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 92 / ((param3 - 64) / 38);
          if (nd.a(param0, param2, -1, param1)) {
            return oi.a((byte) -97);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bf.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L0;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L0;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 3) {
            bf.a(-44);
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_a = new ei();
        field_b = new double[3];
    }
}
