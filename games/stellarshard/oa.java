/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends dg {
    int field_A;
    static boolean field_D;
    static String field_B;
    static th field_C;
    static String field_F;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        if (null == ((oa) this).field_y) {
            return;
        }
        if (0 == ((oa) this).field_A) {
            return;
        }
        if (!(((oa) this).field_A != 256)) {
            ((oa) this).field_y.a(param0, (byte) -57, param2 - -((oa) this).field_k, ((oa) this).field_w + param3);
            return;
        }
        pb var5 = new pb(((oa) this).field_y.field_p, ((oa) this).field_y.field_t);
        hj.a(var5, 1);
        ((oa) this).field_y.a(param0, param1, 0, 0);
        id.b((byte) -58);
        var5.e(param3 + ((oa) this).field_w, ((oa) this).field_k + param2, ((oa) this).field_A);
    }

    public oa() {
        super(0, 0, 0, 0, (uk) null, (lf) null);
        ((oa) this).field_A = 256;
    }

    oa(rj param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_t, (uk) null, (lf) null);
        try {
            param0.b(((oa) this).field_p, 0, 0, ((oa) this).field_t, 23987);
            ((oa) this).field_A = 256;
            ((oa) this).field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "oa.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(rb param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param1 == 0) {
                break L1;
              } else {
                var4 = null;
                int discarded$2 = oa.a((rb) null, 119, true);
                break L1;
              }
            }
            stackOut_2_0 = param0.c(param1 + -25186, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("oa.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void i(int param0) {
        field_B = null;
        field_C = null;
        if (param0 > -68) {
            oa.i(-65);
            field_F = null;
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = true;
        field_B = "Click";
        field_C = new th();
        field_F = "Connection lost. <%0>";
    }
}
