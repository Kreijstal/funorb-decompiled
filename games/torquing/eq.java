/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eq implements sk {
    private long field_e;
    static String field_c;
    static double field_a;
    static int field_b;
    static long field_d;

    public final String a(int param0) {
        if (param0 >= 115) {
          if (!((eq) this).b(true)) {
            if (350L + ((eq) this).field_e > km.b(-1)) {
              return null;
            } else {
              return ((eq) this).b(0);
            }
          } else {
            return null;
          }
        } else {
          ((eq) this).field_e = 37L;
          if (!((eq) this).b(true)) {
            if (350L + ((eq) this).field_e > km.b(-1)) {
              return null;
            } else {
              return ((eq) this).b(0);
            }
          } else {
            return null;
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        int var1 = 86 / ((param0 - -24) / 46);
    }

    public final void a(boolean param0) {
        if (!param0) {
            eq.b((byte) 82);
            ((eq) this).field_e = km.b(-1);
            return;
        }
        ((eq) this).field_e = km.b(-1);
    }

    abstract String b(int param0);

    abstract cd c(int param0);

    public final cd a(byte param0) {
        if (!((eq) this).b(true)) {
          if (((eq) this).field_e + 350L <= km.b(-1)) {
            if (param0 >= -74) {
              ((eq) this).a(true);
              return ((eq) this).c(0);
            } else {
              return ((eq) this).c(0);
            }
          } else {
            return q.field_a;
          }
        } else {
          return df.field_r;
        }
    }

    final static void a(t param0, int param1, int param2, int param3, int param4, int param5) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
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
          L0: {
            var9_int = param4 + param0.field_v + param3;
            var10 = 30 + param3 + (param4 + param0.field_v);
            var11 = (param0.field_t >> 1) + (param0.field_r + param5);
            ph.f(var9_int, 0, var10, var11);
            param0.a(-1 + param4, param5 + -1, 80);
            param0.a(param4 - 1, 1 + param5, 80);
            ph.a(mo.field_w);
            ph.f(1 + var9_int, 0, var10 - -1, var11);
            param0.a(1 + param4, param5 - 1, 80);
            param0.a(1 + param4, 1 + param5, 80);
            ph.a(mo.field_w);
            var9_int = -30 + (param0.field_s + param0.field_v) - (-param4 + param3);
            var10 = param0.field_v + (param0.field_s + (param4 - param3));
            ph.f(var9_int, var11, var10, 480);
            param0.a(param4 + -1, -1 + param5, 80);
            param0.a(param4 - 1, 1 + param5, 80);
            ph.a(mo.field_w);
            ph.f(var9_int + 1, var11, var10 + 1, 480);
            param0.a(1 + param4, param5 - 1, 80);
            param0.a(param4 - -1, 1 + param5, 80);
            ph.a(mo.field_w);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("eq.Q(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 44 + 1 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + 80 + 44 + 0 + 44 + 30 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<col=2>Look out for:</col>";
        field_a = -1.0;
        field_d = 0L;
    }
}
