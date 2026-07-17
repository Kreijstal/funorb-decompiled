/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static cj field_b;
    static int[] field_c;
    static String field_a;

    final static void a(byte param0, int param1, int param2, int param3) {
        fq.field_n = param2;
        qh.field_e = param3;
        hp.field_k = param1;
        int var4 = -1;
    }

    final static void a(ga param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ok.a(-105, -1, param0, param1, -1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("nn.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + 102 + 41);
        }
    }

    public static void b(int param0) {
        int var1 = 72 % ((-49 - param0) / 56);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static fc a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fc stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 100;
            var3 = 100;
            var4 = new byte[param1.length - -8];
            var5 = 0;
            L1: while (true) {
              if (6 <= var5) {
                nn.a(-99, 6, var4, var2_int);
                nn.a(-110, 7, var4, var3);
                var5 = 6;
                L2: while (true) {
                  if (param1.length / 4 <= var5) {
                    var6 = 52 % ((-44 - param0) / 34);
                    stackOut_7_0 = jg.a(30270, var4);
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    nn.a(-109, 2 + var5, var4, ql.a(true, var5, param1));
                    var5++;
                    continue L2;
                  }
                }
              } else {
                nn.a(-113, var5, var4, ql.a(true, var5, param1));
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("nn.D(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(boolean param0) {
        oo.f(0, 84, 640, 335, 0, 128);
        cc.field_c.a(0, 84);
        if (param0) {
            nn.b(126);
        }
    }

    final static java.awt.Container a() {
        if (null != cg.field_m) {
            return (java.awt.Container) (Object) cg.field_m;
        }
        return (java.awt.Container) (Object) jl.b(0);
    }

    final static void a(int param0, int param1, byte[] param2, int param3) {
        try {
            if (param0 >= -92) {
                field_c = null;
            }
            param2[param1 * 4] = (byte)(param3 >>> 24);
            param2[1 + param1 * 4] = (byte)(param3 >>> 16);
            param2[2 + 4 * param1] = (byte)(param3 >>> 8);
            param2[3 + param1 * 4] = (byte)param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "nn.F(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[128];
        field_a = "Invite";
    }
}
