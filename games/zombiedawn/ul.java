/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static boolean field_f;
    static long field_b;
    private lc field_a;
    private dj field_g;
    private dj field_c;
    static int field_d;
    static long field_e;

    final static void b(int param0, byte param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
            var2 = new int[1 + rc.field_u.length];
            var3 = 0;
            if (param1 >= -65) {
                field_d = -16;
            }
            while (var3 < rc.field_u.length) {
                var2[var3] = rc.field_u[var3];
                var3++;
            }
            var2[var2.length - 1] = param0;
            rc.field_u = var2;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ul.D(" + param0 + 44 + param1 + 41);
        }
    }

    final static vn a(boolean param0, String param1) {
        oi var2 = null;
        RuntimeException var2_ref = null;
        vn var3 = null;
        vn stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_0_0 = null;
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
            var2 = bj.field_q;
            var3 = new vn(var2.b(param1), 27);
            var3.a();
            var2.a(param1, var3.field_w / 2, 17, 16777215, -1);
            stackOut_0_0 = (vn) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ul.B(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final dm a(int param0, int param1) {
        byte[] var4 = null;
        dm var3 = (dm) ((ul) this).field_a.a((long)param1, 1431655765);
        if (var3 != null) {
            return var3;
        }
        if (param1 < 32768) {
            var4 = ((ul) this).field_g.a((byte) 51, 1, param1);
        } else {
            var4 = ((ul) this).field_c.a((byte) 51, 1, param1 & 32767);
        }
        var3 = new dm();
        int var5 = 91 / ((-7 - param0) / 53);
        if (var4 != null) {
            var3.a(new de(var4), 0);
        }
        if (!(param1 < 32768)) {
            var3.d((byte) -76);
        }
        ((ul) this).field_a.a((long)param1, (Object) (Object) var3, -16709);
        return var3;
    }

    private ul() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0) {
        int var2 = 1;
        return ~param0 == ~(-param0 & param0) ? true : false;
    }

    static {
    }
}
