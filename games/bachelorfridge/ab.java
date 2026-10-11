/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends td {
    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        aga var4 = null;
        oga var5 = null;
        aga var6 = null;
        ew stackIn_4_0 = null;
        ii stackIn_7_0 = null;
        oga stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_h.a(29, param0);
          var4 = this.field_j.a(18, param0);
          if (var4 != null &&
            !var4.i(75)) {
            var5 = new oga(this.field_g, new nq(var6), this.field_j);
            var5.field_o.a(new iv(new nq(var4), false, 1, 0, 37), true);
            if (param1 != 3) {
              stackIn_7_0 = (ii) null;
              return stackIn_7_0;
            }
            var5.field_o.a(new rla(new nq(var4), var6.field_D), true);
            stackIn_9_0 = var5;
            return (ii) ((Object) stackIn_9_0);
          }
          stackIn_4_0 = new ew(new nq(var6));
          return (ii) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ab.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    ab(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ab.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
