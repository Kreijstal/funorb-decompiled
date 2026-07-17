/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ioa extends dg {
    static dq field_n;
    static String field_m;
    private ut field_p;
    static String field_o;

    final void a(gr param0, gma param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            super.a(param0, param1, param2);
            if (param0 instanceof ut) {
              ((ioa) this).field_p = (ut) (Object) param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ioa.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
    }

    final int k(byte param0) {
        if (param0 == -99) {
          if (((ioa) this).field_h.j(-1)) {
            return 2;
          } else {
            return 5;
          }
        } else {
          field_m = null;
          if (((ioa) this).field_h.j(-1)) {
            return 2;
          } else {
            return 5;
          }
        }
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var8 = 0;
        int var9 = 0;
        int var6_int = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        try {
            int var7 = 0;
            if (null == ((ioa) this).field_p) {
                var6_int = 6684672;
            } else {
                if (!((ioa) this).field_p.k((byte) -120).b(4)) {
                    var6_int = ((ioa) this).field_p.c(17832);
                } else {
                    var6_int = ((ioa) this).field_p.g((byte) -108);
                }
            }
            var8 = ((ioa) this).field_h.c(-29) / 2;
            var9 = ((ioa) this).field_h.a((byte) 55) / 2;
            int var10 = 86 % ((param4 - -38) / 47);
            int discarded$0 = 1;
            oq.a(-var8 + param2, -var9 + param1, param3, 255, param2 + var8, var6_int, param1 + var9);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ioa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    ioa(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    ioa(int param0) {
        super(param0);
    }

    public static void i() {
        int var1 = 55;
        field_n = null;
        field_o = null;
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new dq(0, 0);
        field_m = "<%0> has withdrawn the request to join.";
        field_o = "Run using the arrow keys or W, A, S and D.";
    }
}
