/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ria extends dg {
    static fta field_o;
    static volatile int field_m;
    static String field_r;
    static String field_n;
    private int field_q;
    static String field_p;

    final void d(int param0) {
        if (param0 != -1) {
            ((ria) this).field_q = -76;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ria.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void h(int param0) {
        if (param0 < 0) {
            ((ria) this).field_q = 122;
            super.h(89);
            return;
        }
        super.h(89);
    }

    ria(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final int k(byte param0) {
        if (param0 != -99) {
            return -101;
        }
        return 7;
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
            var6_int = -26 / ((-38 - param4) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("ria.D(");
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
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ria(int param0) {
        super(param0);
    }

    public static void i(int param0) {
        field_o = null;
        field_n = null;
        field_p = null;
        if (param0 != -30362) {
            ria.i(28);
            field_r = null;
            return;
        }
        field_r = null;
    }

    final void a(int param0, la param1, kh param2) {
        if (param0 <= 119) {
            ((ria) this).field_q = -123;
        }
        super.a(126, param1, param2);
        if (param1.field_E <= 17) {
            return;
        }
        try {
            ((ria) this).field_q = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ria.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = 33 % ((param0 - -8) / 40);
            super.a((byte) 117, param1);
            param1.a((byte) -126, ((ria) this).field_q, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ria.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_r = "Owner";
        field_n = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_o = new fta();
        field_p = "<%0> has been removed.";
    }
}
