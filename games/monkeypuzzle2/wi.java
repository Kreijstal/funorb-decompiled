/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ml {
    static ad field_d;
    static long field_f;
    static le field_e;
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        me var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (me) (Object) af.field_a.a((byte) -117);
            L1: while (true) {
              if (var4 == null) {
                if (param1 == 1197) {
                  break L0;
                } else {
                  field_d = null;
                  return;
                }
              } else {
                qc.a(var4, (byte) 117, param0);
                var4 = (me) (Object) af.field_a.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "wi.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 256) {
          wi.a(127, 91);
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        le var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param4 > 19) {
                break L1;
              } else {
                wi.a(-113);
                break L1;
              }
            }
            L2: {
              var6_int = param3 + param1.field_r;
              var7 = param1.field_e + param2;
              eb.b(var6_int, 0, param1.field_p, param1.field_l, var7);
              var8 = hk.field_i[1];
              if (!(param1 instanceof t)) {
                break L2;
              } else {
                if (!((t) (Object) param1).field_u) {
                  break L2;
                } else {
                  var8.c((-var8.field_m + param1.field_l >> 1) + var6_int + 1, (param1.field_p - var8.field_n >> 1) + (1 + var7), 256);
                  break L2;
                }
              }
            }
            if (!param1.b((byte) 64)) {
              break L0;
            } else {
              hk.a(2 + var6_int, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("wi.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = "OK";
    }
}
