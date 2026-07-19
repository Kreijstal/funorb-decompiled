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
            throw sh.a((Throwable) ((Object) runtimeException), "ul.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static vn a(boolean param0, String param1) {
        boolean discarded$2 = false;
        oi var2 = null;
        RuntimeException var2_ref = null;
        vn var3 = null;
        vn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_2_0 = null;
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
              var2 = bj.field_q;
              var3 = new vn(var2.b(param1), 27);
              var3.a();
              if (!param0) {
                break L1;
              } else {
                discarded$2 = ul.a(-121, (byte) 5);
                break L1;
              }
            }
            var2.a(param1, var3.field_w / 2, 17, 16777215, -1);
            stackOut_2_0 = (vn) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ul.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final dm a(int param0, int param1) {
        byte[] var4 = null;
        dm var3 = (dm) (this.field_a.a((long)param1, 1431655765));
        if (var3 != null) {
            return var3;
        }
        if (param1 < 32768) {
            var4 = this.field_g.a((byte) 51, 1, param1);
        } else {
            var4 = this.field_c.a((byte) 51, 1, param1 & 32767);
        }
        var3 = new dm();
        int var5 = 91 / ((-7 - param0) / 53);
        if (var4 != null) {
            var3.a(new de(var4), 0);
        }
        if (!(param1 < 32768)) {
            var3.d((byte) -76);
        }
        this.field_a.a((long)param1, var3, -16709);
        return var3;
    }

    private ul() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, byte param1) {
        int var2 = 53 % ((param1 - -64) / 55);
        return param0 == (-param0 & param0) ? true : false;
    }

    static {
    }
}
