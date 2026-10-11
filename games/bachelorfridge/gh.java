/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends td {
    gh(int param0, aga param1) {
        super(param0, param1);
    }

    final static hk[] c(byte param0) {
        if (param0 != -67) {
          return (hk[]) null;
        }
        return new hk[]{se.field_u, er.field_x, uka.field_k};
    }

    final ii a(op param0, int param1) {
        int var6 = 0;
        kk var4 = null;
        int var5 = 0;
        int var8 = 0;
        aga var9 = null;
        ii stackIn_3_0 = null;
        op stackIn_6_0 = null;
        kk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        aga var7 = null;
        var8 = BachelorFridge.field_y;
        try {
          var9 = this.field_h.a(32, param0);
          var4 = new kk(this.field_g, new nq(var9));
          var5 = 0;
          if (param1 != 3) {
            stackIn_3_0 = (ii) null;
            return stackIn_3_0;
          }
          stackIn_6_0 = (op) (param0);
          while (stackIn_6_0.field_z > var5) {
            for (var6 = 0; var6 < param0.field_B; var6++) {
              if (null != param0.field_a[var5][var6].field_l) {
                var7 = param0.field_a[var5][var6].field_l;
                var4.field_o.a(new iv(new nq(var7), false, 1, 0, 18), true);
              }
            }
            var5++;
            stackIn_6_0 = (op) (param0);
          }
          stackIn_15_0 = var4;
          return (ii) ((Object) stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("gh.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
