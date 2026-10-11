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
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 > 66) {
          field_d = null;
          field_c = (ck[][]) null;
          return;
        }
        int[] var2 = (int[]) null;
        fb.a(-7, 19, (int[]) null);
        field_d = null;
        field_c = (ck[][]) null;
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10040319) {
            var4 = (int[]) null;
            fb.a(1, 103, (int[]) null);
          }
          stackIn_5_0 = ((param2[param0 >> 5] & 1 << (31 & param0)) == 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_d = "Hide players in <%0>'s game";
        field_a = "Type your age in years";
        field_g = new java.awt.Color(10040319);
        field_c = new ck[8][8];
    }
}
