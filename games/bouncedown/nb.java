/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb {
    static lg field_c;
    static int field_d;
    static int field_f;
    static String[] field_h;
    static int field_g;
    static int field_a;
    static int field_e;
    static java.awt.Image field_b;

    final static int a(byte[] param0, int param1, byte param2) {
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
            var3_int = -15 % ((param2 - -31) / 40);
            stackIn_1_0 = ib.a(param1, param0, 0, (byte) -33);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("nb.B(");

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
          throw ii.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -8 / ((20 - param0) / 59);
        field_h = null;
        field_b = null;
    }

    static {
        field_c = new lg();
        field_h = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_e = 0;
        field_g = 55;
    }
}
