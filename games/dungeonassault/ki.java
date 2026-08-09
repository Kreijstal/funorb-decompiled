/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    int field_b;
    static String[] field_h;
    static int field_f;
    static String field_e;
    int field_g;
    int field_a;
    int field_d;
    static String field_c;

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        if (param0 != -35) {
            ki.a((byte) 80);
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4) {
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
              sj.a(param2, param1, param0, 32, param3 + "_reveal", param3 + "_defeat");
              if (param4 == -1) {
                break L1;
              } else {
                field_f = 66;
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

            stackIn_5_1 = new StringBuilder().append("ki.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    static {
        field_e = "Guardian";
        field_f = -1;
        field_h = new String[]{"<%0> the Fierce", "<%0> the Cruel", "<%0> the Fell", "<%0> the Terrible", "<%0> the Savage", "<%0> the Raging", "<%0>, Bringer of Wrath", "<%0>, Lady of Chaos", "<%0> the Undefeated"};
    }
}
