/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static long field_b;
    static tl field_c;
    static int field_a;

    final static void a(fj param0, int param1) {
        int var2_int = 0;
        fj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = TetraLink.field_J;
        try {
          if (null == param0.field_h) {
            return;
          }
          if (param0.field_g != 0 ||
            param0.field_s != 0) {
            for (var2_int = 0; var2_int < pl.field_d; var2_int++) {
              var3 = n.field_L[var2_int];
              if (var3.field_i == 2 &&
                var3.field_g == param0.field_g &&
                param0.field_s == var3.field_s) {
                return;
              }
            }
          }
          var2_intLifetime1 = -43 % ((param1 - 48) / 38);
          if (null != param0.field_a) {
            ml.field_jb = param0.field_r;
            vf.field_b = param0.field_i;
            ba.field_N = param0.field_a;
            vd.field_h = param0.field_n;
          }
          ei.a(-2792, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ao.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_c = (tl) null;
        }
    }

    static {
        field_b = 0L;
    }
}
