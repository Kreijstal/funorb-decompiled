/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj {
    static mf field_c;
    static jg field_f;
    static String field_b;
    static int[] field_d;
    static ci field_g;
    static String field_a;
    static String field_h;
    static ci field_e;

    final static String a(CharSequence[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -110 / ((param1 - 15) / 48);
            stackIn_1_0 = ve.a(-10537, param0, param0.length, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("bj.A(");

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
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        CharSequence[] var2;
        field_g = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 != 0) {
          var2 = (CharSequence[]) null;
          bj.a((CharSequence[]) null, (byte) 24);
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    static {
        field_b = "From only <%0>/month";
        field_h = "Highscores";
        field_a = "25000pts";
    }
}
