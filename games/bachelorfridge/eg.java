/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends td {
    static jla[] field_p;
    static String field_q;

    eg(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_q = null;
        if (param0 > -71) {
          eg.c((byte) -75);
        }
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        fia var5 = null;
        aga var6 = null;
        aga var7 = null;
        ew stackIn_4_0 = null;
        fia stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_h.a(param1 ^ 48, param0);
          var7 = var6;
          var4 = this.field_j.a(79, param0);
          if (var4 != null &&
            !var4.i(-127)) {
            var5 = new fia(this.field_g, new nq(var7));
            var5.field_o.a(new iv(new nq(var4), false, 1, 0, 32), true);
            if (param1 != 3) {
              field_p = (jla[]) null;
            }
            if (var4.field_o.field_b == 1 ||
              var4.field_o.field_b == 0) {
              param0.field_T.field_u[var6.field_D] = true;
            }
            stackIn_12_0 = var5;
            return (ii) ((Object) stackIn_12_0);
          }
          stackIn_4_0 = new ew(new nq(var7));
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("eg.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new jla[16];
        field_q = "Drawn";
    }
}
