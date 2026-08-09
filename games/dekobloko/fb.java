/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static java.awt.Color field_g;
    static String field_a;
    static String field_d;
    static w field_b;
    static int field_f;
    static ck[][] field_c;
    static int field_e;

    public static void a(byte param0) {
        int[] var2;
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 <= 66) {
          var2 = (int[]) null;
          fb.a(-7, 19, (int[]) null);
          field_d = null;
          field_c = (ck[][]) null;
          return;
        } else {
          field_d = null;
          field_c = (ck[][]) null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 10040319) {
                break L1;
              } else {
                var4 = (int[]) null;
                fb.a(1, 103, (int[]) null);
                break L1;
              }
            }
            L2: {
              if ((param2[param0 >> -1825332859] & 1 << (31 & param0)) != 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        field_d = "Hide players in <%0>'s game";
        field_a = "Type your age in years";
        field_g = new java.awt.Color(10040319);
        field_c = new ck[8][8];
    }
}
