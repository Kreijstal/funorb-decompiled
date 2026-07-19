/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_c;
    static ta field_b;
    static int field_a;

    final static sa a(ji param0, boolean param1) {
        RuntimeException var2 = null;
        sa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ii.a((byte) -103);
                break L1;
              }
            }
            stackOut_2_0 = mg.a(1963987425, rc.a(param0, 100, 96));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ii.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
            field_c = (String) null;
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
        oj.o(param0 + -1236579268);
        ea var2 = var1.c();
        if (param0 != 140) {
            return;
        }
        try {
            for (var3 = 0; var3 < 15; var3++) {
                var2.e(-2, -2, 16777215);
                eh.a(4, 4, 0, 0, 540, 140);
            }
            lc.field_u.g();
            var1.d(0, 0);
            tk.b(true);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ')');
        }
    }

    static {
        field_c = "Taking a hard hat with you will soften the bumps and bruises you get from falling rocks. You'll never need to worry about cave-ins again.";
        field_b = new ta();
    }
}
