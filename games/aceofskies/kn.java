/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static da field_a;
    static al[] field_c;
    static vs field_b;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_35_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        Object stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        rm[] var10 = null;
        en var11 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          if (!param0.a((byte) 84)) {
            return null;
          }
          if (param3 == 0) {
            var10 = sk.a(param0, 1175069442);
            var6 = var10;
            if (var6 == null) {
              stackIn_8_0 = null;
              return (java.awt.Frame) (stackIn_8_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (param1 == var10[var8].field_f &&
                var10[var8].field_b == param2 && ((param4 == 0 ||
                var10[var8].field_a == param4) &&
                (var7_int == 0 ||
                !(param3 >= var10[var8].field_d)))) {
                param3 = var10[var8].field_d;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              stackIn_29_0 = null;
              return (java.awt.Frame) (stackIn_29_0);
            }
          }
          var11 = param0.a(param1, -83, param4, param2, param3);
          while (var11.field_a == 0) {
            wf.a(10L, false);
          }
          var7 = (java.awt.Frame) (var11.field_f);
          if (var7 == null) {
            stackIn_35_0 = null;
            return (java.awt.Frame) (stackIn_35_0);
          }
          if (param5 != 29742) {
            stackIn_38_0 = (java.awt.Frame) null;
            return stackIn_38_0;
          }
          if (var11.field_a != 2) {
            return var7;
          }
          ke.a(param5 ^ 30691, param0, var7);
          stackIn_42_0 = null;
          return (java.awt.Frame) (stackIn_42_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_45_0 = var6_ref;
          stackIn_45_1 = new StringBuilder().append("kn.A(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
          field_b = (vs) null;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static wp[] a(int param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = -37 / ((19 - param0) / 57);
        wp[] var2 = new wp[to.field_t];
        for (var3 = 0; var3 < to.field_t; var3++) {
          var2[var3] = new wp(pu.field_a, cc.field_i, lh.field_a[var3], lg.field_j[var3], ji.field_b[var3], ee.field_e[var3], fk.field_a[var3], ud.field_e);
        }
        kf.f(1);
        return var2;
    }

    static {
    }
}
