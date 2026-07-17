/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static String field_d;
    static hl field_f;
    static hl field_e;
    static long[] field_c;
    static java.awt.Canvas field_b;
    static String field_a;

    final static oh[] a(int param0, int param1, ah param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        oh[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        oh[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ia.a(param0, param2, param3, -60)) {
              int discarded$2 = 76;
              stackOut_3_0 = gd.e();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (oh[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("uh.G(").append(param0).append(44).append(0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        if (param0 != -70) {
          L0: {
            field_c = null;
            var4 = ((uh) this).b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return ((uh) this).a(param1, (byte) 52);
        } else {
          L1: {
            var4 = ((uh) this).b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return ((uh) this).a(param1, (byte) 52);
        }
    }

    abstract void a(int param0);

    abstract long b(byte param0);

    final static hl b() {
        return wa.a(57);
    }

    abstract int a(long param0, byte param1);

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_d = "Show lobby chat from my friends";
        field_a = "Quit to website";
    }
}
