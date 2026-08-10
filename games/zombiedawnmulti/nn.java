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
        int var4 = -111 % ((param0 - -71) / 49);
    }

    final static void a(ga param0, int param1, int param2, byte param3) {
        try {
            ok.a(-105, -1, param0, param1, -1, param2);
            if (param3 != 102) {
                nn.a(true);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_8_0 = jg.a(30270, var4);
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
            stackIn_11_0 = (RuntimeException) (var2);

            stackIn_11_1 = new StringBuilder().append("nn.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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

    final static java.awt.Container a(int param0) {
        if (null != cg.field_m) {
            return (java.awt.Container) ((Object) cg.field_m);
        }
        if (param0 < 21) {
            nn.b(-111);
            return (java.awt.Container) ((Object) jl.b(0));
        }
        return (java.awt.Container) ((Object) jl.b(0));
    }

    final static void a(int param0, int param1, byte[] param2, int param3) {
        try {
            if (param0 >= -92) {
                field_c = (int[]) null;
            }
            param2[param1 * 4] = (byte)(param3 >>> 840221592);
            param2[1 + param1 * 4] = (byte)(param3 >>> 871084176);
            param2[2 + 4 * param1] = (byte)(param3 >>> -2145686328);
            param2[3 + param1 * 4] = (byte)param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "nn.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = new int[128];
        field_a = "Invite";
    }
}
