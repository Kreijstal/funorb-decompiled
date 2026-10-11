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
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -15 % ((param2 + 31) / 40);
          stackIn_1_0 = ib.a(param1, param0, 0, (byte) -33);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("nb.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
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
