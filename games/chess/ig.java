/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_e;
    static le field_b;
    static hg field_d;
    static int field_c;
    static km field_h;
    static ci[] field_i;
    static dd[] field_f;
    static int field_g;
    static String field_a;

    public static void a(int param0) {
        field_h = null;
        field_d = null;
        field_a = null;
        if (param0 > -43) {
          return;
        } else {
          field_b = null;
          field_f = null;
          field_i = null;
          field_e = null;
          return;
        }
    }

    final static c a(int param0, um param1, int param2, int param3, um param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        c stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (tj.a(param3, param0, param4, (byte) 83)) {
              var5_int = 9 % ((param2 - 19) / 53);
              stackIn_4_0 = sh.a(-1, param1.a(param3, param0, 5847));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ig.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_e = "Accept unrated rematch";
        field_c = 5;
        field_f = new dd[7];
        field_a = "<%0> has resigned.";
        field_d = new hg(1, 2, 2, 0);
    }
}
