/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class osa extends wda {
    static byte[][][] field_r;
    static String field_p;
    private int field_q;
    private int field_o;

    final int g(byte param0) {
        if (param0 != 30) {
          ((osa) this).field_q = -20;
          return ((osa) this).a(false) + ((osa) this).field_q;
        } else {
          return ((osa) this).a(false) + ((osa) this).field_q;
        }
    }

    final void c(byte param0) {
        super.c((byte) -121);
        if (param0 >= -116) {
          ((osa) this).field_o = -33;
          ((osa) this).field_o = -((osa) this).field_o;
          return;
        } else {
          ((osa) this).field_o = -((osa) this).field_o;
          return;
        }
    }

    osa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (5 > param0.field_E) {
              break L0;
            } else {
              if (param0.field_E < 25) {
                ((osa) this).field_o = param1.b((byte) 44, 10) << 16;
                ((osa) this).field_q = param1.b((byte) 44, 10) << 16;
                return;
              } else {
                ((osa) this).field_o = bla.a(true, 12, param1.b((byte) 44, 12)) << 16;
                ((osa) this).field_q = bla.a(true, 12, param1.b((byte) 44, 12)) << 16;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("osa.<init>(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -120);
            if (param1 >= -78) {
                osa.e(2);
            }
            param0.a((byte) -39, dqa.a(true, ((osa) this).field_o >> 16, 12), 12);
            param0.a((byte) 45, dqa.a(true, ((osa) this).field_q >> 16, 12), 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "osa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int f(int param0) {
        if (param0 != 10) {
          int discarded$2 = ((osa) this).f(-109);
          return ((osa) this).d((byte) -52) - -((osa) this).field_o;
        } else {
          return ((osa) this).d((byte) -52) - -((osa) this).field_o;
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_p = null;
        int var1 = -33 / ((-22 - param0) / 52);
    }

    final int e(byte param0) {
        if (param0 != -43) {
            ((osa) this).field_o = 9;
            return ((osa) this).b(true);
        }
        return ((osa) this).b(true);
    }

    static {
    }
}
