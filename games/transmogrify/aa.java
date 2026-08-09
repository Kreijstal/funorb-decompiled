/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static kh field_d;
    static int field_a;
    static hi field_e;
    static String field_f;
    static hi field_b;
    static String field_c;
    static String field_h;
    static boolean field_g;

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -6 % ((-31 - param0) / 63);
            stackIn_1_0 = bg.a(10, true, param1, (byte) 126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("aa.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        CharSequence var2;
        field_c = null;
        if (param0 != 0) {
          var2 = (CharSequence) null;
          aa.a(65, (CharSequence) null);
          field_e = null;
          field_d = null;
          field_f = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_d = null;
          field_f = null;
          field_h = null;
          field_b = null;
          return;
        }
    }

    static {
        field_a = 0;
        field_d = new kh("email");
        field_f = "Loading graphics";
        field_e = new hi();
        field_b = new hi();
        field_c = "Your email address is used to identify this account";
        field_h = "Achievements";
        field_g = false;
    }
}
