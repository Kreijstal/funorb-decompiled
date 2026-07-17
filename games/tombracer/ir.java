/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static String field_b;
    static String field_c;
    int field_f;
    static int field_a;
    int field_d;
    static String field_e;

    public static void a(byte param0) {
        if (param0 <= 96) {
            return;
        }
        field_c = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        return "(" + ((ir) this).field_f + "," + ((ir) this).field_d + ")";
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 >= -69) {
          L0: {
            ir.a((byte) 123);
            if ((33 & param0) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((33 & param0) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qu var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          if (param0 != null) {
            if (!(param0 instanceof byte[])) {
              if (param0 instanceof qu) {
                var4 = (qu) param0;
                stackOut_11_0 = var4.a(false);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param0;
              if (!param2) {
                stackOut_7_0 = (byte[]) var3;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                int discarded$2 = 6711;
                stackOut_5_0 = lh.a(var3);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("ir.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L0;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 13588 + 44 + param2 + 41);
        }
    }

    public ir() {
    }

    ir(int param0, int param1) {
        ((ir) this).field_f = param0;
        ((ir) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Wall Shadows: ";
        field_c = "I think the ceiling has a crush on you. Stay still too long, and you'll find yourself in a jam.";
        field_e = "All players have left <%0>'s game.";
    }
}
