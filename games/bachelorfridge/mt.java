/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mt extends td {
    static int field_v;
    static sna field_q;
    static String field_t;
    static int[] field_u;
    static vr field_p;
    static int field_s;
    static int field_r;

    public static void b(int param0) {
        if (param0 != 1687) {
          return;
        }
        field_q = null;
        field_u = null;
        field_t = null;
        field_p = null;
    }

    final ii a(op param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        nb stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        nb var4 = null;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        var8 = BachelorFridge.field_y;
        try {
          if (param1 != 3) {
            field_s = 126;
          }
          var9 = this.field_h.a(param1 ^ 115, param0);
          var4 = new nb(this.field_g, new nq(var9));
          for (var5 = 0; var5 < param0.field_d; var5++) {
            for (var6 = 0; var6 < 7; var6++) {
              if (param0.field_S[var5].field_b[var6] != null) {
                var7 = param0.field_S[var5].field_b[var6];
                if (var7.field_A &&
                  var7.i(-116) &&
                  var9.field_x == var7.field_x &&
                  var7.field_J == var9.field_J) {
                  var4.field_o.a(new iv(new nq(var9), false, 1, -var7.field_t, 0), true);
                  var4.field_o.a(new pea(new nq(var7), var7.field_x, var7.field_J), true);
                }
              }
            }
          }
          stackIn_16_0 = var4;
          return (ii) ((Object) stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("mt.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sna c(int param0) {
        if (param0 != 0) {
          mt.b(24);
        }
        return rba.field_a.field_wb;
    }

    mt(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_u = new int[8192];
        field_t = "More suggestions";
    }
}
