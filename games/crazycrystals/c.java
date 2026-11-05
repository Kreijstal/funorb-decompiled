/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends bo implements Cloneable {
    static am field_q;
    static char field_p;

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            field_p = 'ﾡ';
          }
          stackIn_3_0 = ng.a(eb.field_m, param1, new c(new kp(-1)), (byte) -83, kd.field_m);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("c.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    c(f param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        var7 = -38 % ((param0 - 74) / 41);
        if (param1 == 24 &&
          param2 == 24) {
          qb.field_b.a(param4, param5 - param2);
        } else {
          qb.field_b.b(param4, param5 - param2, param1 * 2, param2 * 3);
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          field_q = (am) null;
          return 0;
        }
        return 0;
    }

    final static void a(int param0, uf param1) {
        int var2_int = 0;
        uf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (null == param1.field_h) {
            return;
          }
          if (~param1.field_d != param0 ||
            param1.field_l != 0) {
            for (var2_int = 0; var2_int < jl.field_d; var2_int++) {
              var3 = ol.field_D[var2_int];
              if (var3.field_f == 2 &&
                param1.field_d == var3.field_d &&
                param1.field_l == var3.field_l) {
                return;
              }
            }
          }
          if (null != param1.field_k) {
          }
          kj.a(param1, (byte) 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("c.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static lb b(boolean param0) {
        if (param0) {
          c.g(83);
        }
        if (sa.field_lb == null) {
          sa.field_lb = new lb(ba.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, ba.field_i.field_o, -1, 2147483647, true);
        }
        return sa.field_lb;
    }

    public static void g(int param0) {
        if (param0 != -1) {
          return;
        }
        field_q = null;
    }

    static {
    }
}
