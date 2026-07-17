/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    static int field_f;
    static ei field_a;
    static int field_d;
    static int[] field_b;
    static la field_c;
    static int field_e;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(wc param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        df var7 = null;
        df var8 = null;
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
        var6 = Torquing.field_u;
        try {
          L0: {
            var7 = wa.field_d;
            var8 = var7;
            var8.f(91, param2);
            var8.field_n = var8.field_n + 1;
            var4 = var8.field_n;
            var8.b(90, param1);
            var8.a(param0.field_q, 118);
            var8.a(param0.field_n, param1 ^ 58);
            var8.a(param0.field_m, 88);
            var8.b((byte) 60, param0.field_p);
            var8.b((byte) 60, param0.field_r);
            var8.b((byte) 60, param0.field_o);
            var8.b((byte) 60, param0.field_j);
            var8.b(90, param0.field_k.length);
            var5 = 0;
            L1: while (true) {
              if (var5 >= param0.field_k.length) {
                int discarded$1 = var8.a(var4, true);
                var8.c((byte) 48, var8.field_n - var4);
                break L0;
              } else {
                var7.b((byte) 60, param0.field_k[var5]);
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
            stackOut_6_1 = new StringBuilder().append("bp.A(");
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
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        bg var1 = (bg) (Object) rf.field_t.b((byte) -77);
        if (param0 >= -42) {
            bp.a(false);
        }
        if (var1 == null) {
            var1 = new bg();
        }
        var1.a(ph.field_e, ph.field_c, ph.field_h, ph.field_d, ph.field_j, ph.field_a, ph.field_k, 17830);
        bf.field_a.a((byte) 54, (q) (Object) var1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ei();
        field_d = 4;
        field_b = new int[]{28, 28, 112, 397, 421, 0, 156, 156, 156, 156, 56, 156};
    }
}
