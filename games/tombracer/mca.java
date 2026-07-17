/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mca {
    short[] field_a;
    byte[] field_b;
    static String field_d;
    short[] field_e;
    short[] field_c;

    final static boolean a(byte param0, int param1) {
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (0 == param1) {
          return true;
        } else {
          if (pl.a((byte) 64) != param1) {
            L0: {
              if (param0 == 6) {
                break L0;
              } else {
                boolean discarded$2 = mca.a((byte) 65, -116);
                break L0;
              }
            }
            if (!vpa.a(114)) {
              if (mq.field_e == null) {
                return false;
              } else {
                L1: {
                  if (mq.field_e.a((byte) -102, param1)) {
                    stackOut_11_0 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L1;
                  }
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(kb param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        kh var7 = null;
        kh var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = ql.field_k;
            var8 = var7;
            var8.k(param2, -2988);
            var8.field_h = var8.field_h + 1;
            var4 = var8.field_h;
            var8.i(1, 0);
            var8.f(-1477662136, param0.field_l);
            var8.f(-1477662136, param0.field_f);
            var8.f(param1 ^ -1477662136, param0.field_n);
            var8.a(param0.field_i, (byte) -36);
            var8.a(param0.field_g, (byte) -75);
            var8.a(param0.field_k, (byte) -63);
            var8.a(param0.field_j, (byte) 124);
            var8.i(param0.field_o.length, 0);
            var5 = param1;
            L1: while (true) {
              if (var5 >= param0.field_o.length) {
                int discarded$1 = var8.g(var4, 64);
                var8.d(-var4 + var8.field_h, (byte) 72);
                break L0;
              } else {
                var7.a(param0.field_o[var5], (byte) 96);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("mca.A(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please enter your date of birth to enable chat:";
    }
}
