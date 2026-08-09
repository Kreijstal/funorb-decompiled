/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static hj field_e;
    static int field_b;
    static volatile int field_d;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 > -39) {
            field_d = -54;
        }
    }

    final static void a(int param0, int param1, int param2, mg param3, int param4) {
        RuntimeException runtimeException = null;
        mg var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param3.a(12, -44);
              param3.b((byte) -60, 17);
              param3.b((byte) -60, param2);
              param3.b((byte) -60, param1);
              param3.a(param4, param0 ^ -21022);
              if (param0 == 20994) {
                break L1;
              } else {
                var6 = (mg) null;
                nl.a(20, -5, -65, (mg) null, -69);
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

            stackIn_5_1 = new StringBuilder().append("nl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    static {
        field_d = 0;
        field_a = null;
        field_c = "Wave Complete";
    }
}
