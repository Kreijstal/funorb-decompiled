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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1 / ((param0 + 10) / 62);
          stackIn_1_0 = wl.a(true, param2, false, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -15) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        ie.a((byte) -127, -18, (CharSequence) null);
        field_b = null;
        field_a = null;
        field_c = null;
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
