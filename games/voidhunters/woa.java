/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class woa implements wib {
    int field_c;
    int field_a;
    static int field_b;
    float[] field_d;
    static String field_e;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, String param6) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 74) {
              if (li.field_i) {
                nma.field_b[param5].a(param4, param1, -16777216 | param0, true, param2, param6);
                return;
              } else {
                ita.a(param5, 7988).b(param6, param2, param1, param0, param4);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var7);

            stackIn_8_1 = new StringBuilder().append("woa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -16777216) {
            return;
        }
        field_e = null;
    }

    woa(int param0, int param1) {
        this.field_c = param1;
        this.field_a = param0;
        this.field_d = new float[param0 * param1];
    }

    static {
        field_e = "Point defence laser";
    }
}
