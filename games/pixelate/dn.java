/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn implements hj {
    static String field_b;
    static ak field_c;
    static String[][] field_a;

    public static void a(byte param0) {
        field_b = null;
        field_a = (String[][]) null;
        field_c = null;
        int var1 = 66 % ((44 - param0) / 53);
    }

    final static int a(String param0, byte param1, int param2, String param3, int param4, boolean param5, String param6) {
        sc var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        sc var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = 111 / ((75 - param1) / 39);
            var7 = new sc(param6);
            var9 = new sc(param0);
            stackIn_1_0 = cn.a(param3, param2, -124, param5, var9, param4, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7_ref);

            stackIn_4_1 = new StringBuilder().append("dn.B(");

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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
