/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_c;
    static ta field_b;
    static int field_a;

    final static sa a(ji param0, boolean param1) {
        RuntimeException var2 = null;
        sa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_0_0 = null;
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
            stackOut_0_0 = mg.a(1963987425, rc.a(param0, 100, 96));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ii.B(");
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
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    final static String b(byte param0) {
        if (ic.field_l == ci.field_e) {
            return qf.field_r;
        }
        int var1 = -48 / ((param0 - 15) / 47);
        return ch.field_g;
    }

    public static void a(byte param0) {
        if (param0 < 101) {
            field_c = null;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        ea var1 = new ea(540, 140);
        vb.a(var1, 127);
        dj.a();
        eh.d();
        mn.field_x = 0;
        oj.o(-1236579128);
        ea var2 = var1.c();
        try {
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                eh.a(4, 4, 0, 0, 540, 140);
            }
            lc.field_u.g();
            var1.d(0, 0);
            tk.b(true);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ii.C(" + 140 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Taking a hard hat with you will soften the bumps and bruises you get from falling rocks. You'll never need to worry about cave-ins again.";
        field_b = new ta();
    }
}
