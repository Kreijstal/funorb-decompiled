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
        ii stackIn_2_0 = null;
        me stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_h.a(param1 + 47, param0);
            if (param1 == 3) {
              L1: {
                var4 = new me(this.field_g, new nq(var3));
                var4.field_u = this.field_n;
                var4.field_r = this.field_k;
                var5 = param0.field_a[this.field_k][this.field_n];
                var6 = var5.field_l;
                if (var6 == null) {
                  break L1;
                } else {
                  var7 = new iv(new nq(var6), false, 1, 200, 0);
                  var4.field_o.a(var7, true);
                  break L1;
                }
              }
              stackIn_6_0 = (me) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("rl.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ii) ((Object) stackIn_6_0);
        }
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
            this.field_k = param2;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "rl.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_q = 100;
        field_r = new kv(540, 140);
    }
}
