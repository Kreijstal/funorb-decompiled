/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa extends bca {
    int field_r;
    static int field_q;
    static int[] field_u;
    int field_t;
    static int field_s;

    final void a(op param0, int param1) {
        try {
            param0.b((byte) 40, 33, ((jaa) this).field_t, ((jaa) this).field_r);
            int var3_int = -24 / ((param1 - 12) / 35);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jaa.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d() {
        field_u = null;
    }

    jaa(int param0, nq param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((jaa) this).field_r = param3;
            ((jaa) this).field_t = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jaa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        cca stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        cca stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 5) {
              stackOut_3_0 = new cca(param1, (jaa) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (at) (Object) stackIn_4_0;
    }

    jaa(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            ((jaa) this).field_k = param0.e((byte) 49);
            ((jaa) this).field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                ((jaa) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
            }
            ((jaa) this).field_t = param0.b(16711935);
            ((jaa) this).field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jaa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        if (param0 >= -12) {
            return;
        }
        try {
            super.a((byte) -88, param1);
            param1.d(((jaa) this).field_t, 0);
            param1.d(((jaa) this).field_r, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jaa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[5];
        field_s = 0;
    }
}
