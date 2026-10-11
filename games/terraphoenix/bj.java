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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -110 / ((param1 - 15) / 48);
          stackIn_1_0 = ve.a(-10537, param0, param0.length, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("bj.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_h = null;
        if (param0 == 0) {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        CharSequence[] var2 = (CharSequence[]) null;
        bj.a((CharSequence[]) null, (byte) 24);
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "From only <%0>/month";
        field_h = "Highscores";
        field_a = "25000pts";
    }
}
