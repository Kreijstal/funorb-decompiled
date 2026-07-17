/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends td {
    static int field_q;
    static kv field_r;
    static lu field_p;

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        me var4 = null;
        wia var5 = null;
        aga var6 = null;
        iv var7 = null;
        Object stackIn_2_0 = null;
        me stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        me stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3 = ((rl) this).field_h.a(param1 + 47, param0);
            if (param1 == 3) {
              L1: {
                var4 = new me(((rl) this).field_g, new nq(var3));
                var4.field_u = ((rl) this).field_n;
                var4.field_r = ((rl) this).field_k;
                var5 = param0.field_a[((rl) this).field_k][((rl) this).field_n];
                var6 = var5.field_l;
                if (var6 == null) {
                  break L1;
                } else {
                  var7 = new iv(new nq(var6), false, 1, 200, 0);
                  var4.field_o.a((bw) (Object) var7, true);
                  break L1;
                }
              }
              stackOut_5_0 = (me) var4;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ii) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("rl.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_6_0;
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
            rl.b(-128);
            field_p = null;
            return;
        }
        field_p = null;
    }

    rl(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((rl) this).field_k = param2;
            ((rl) this).field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rl.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = 100;
        field_r = new kv(540, 140);
    }
}
