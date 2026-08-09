/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static dh field_b;
    static String field_c;
    static volatile int field_d;
    static String field_a;

    final static int a(byte param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 1 / ((param0 - -10) / 62);
            stackIn_1_0 = wl.a(true, param2, false, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        CharSequence var2;
        if (param0 != -15) {
          var2 = (CharSequence) null;
          ie.a((byte) -127, -18, (CharSequence) null);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        bm.a(param0, (byte) 1);
    }

    static {
        field_d = -1;
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = "No Highscores";
    }
}
