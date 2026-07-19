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
        Object stackIn_4_0 = null;
        oh[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oh[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_e = (hl) null;
                break L1;
              }
            }
            if (ia.a(param0, param2, param3, -60)) {
              stackOut_5_0 = gd.e((byte) 76);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (oh[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        if (param0 != -70) {
          L0: {
            field_c = (long[]) null;
            var4 = this.b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L0;
            } else {
              break L0;
            }
          }
          return this.a(param1, (byte) 52);
        } else {
          L1: {
            var4 = this.b((byte) -58);
            if (0L < var4) {
              tb.a(false, var4);
              break L1;
            } else {
              break L1;
            }
          }
          return this.a(param1, (byte) 52);
        }
    }

    abstract void a(int param0);

    abstract long b(byte param0);

    final static hl b(int param0) {
        if (param0 != 32) {
            field_e = (hl) null;
            return wa.a(57);
        }
        return wa.a(57);
    }

    abstract int a(long param0, byte param1);

    public static void a(byte param0) {
        hl discarded$2 = null;
        if (param0 != 41) {
          discarded$2 = uh.b(-116);
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = new long[32];
        field_d = "Show lobby chat from my friends";
        field_a = "Quit to website";
    }
}
