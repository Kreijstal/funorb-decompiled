/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static int field_c;
    static String field_a;
    static fe field_f;
    static String field_e;
    static int[] field_g;
    static tr field_d;
    static er[] field_b;

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 >= -33) {
          field_b = (er[]) null;
        }
    }

    final static boolean c(int param0) {
        if (param0 != 132199140) {
          return true;
        }
        return !cl.field_c.a((byte) -105) ? true : false;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var1_int = eb.field_g[param0];
          for (var2 = 1; eb.field_g.length > var2; var2++) {
            var3 = eb.field_g[var2];
            qq.a(ac.field_K, var2 << 4, ac.field_K, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "ln.E(" + param0 + ')');
        }
    }

    final static uh a(int param0, int param1) {
        if (param0 == 0) {
          return null != lh.field_b ? (uh) (lh.field_b.a(param0 + 3661, (long)param1)) : null;
        }
        ln.d(29);
        return null != lh.field_b ? (uh) (lh.field_b.a(param0 + 3661, (long)param1)) : null;
    }

    final static void d(int param0) {
        nn var1 = (nn) (gi.field_v.d((byte) 92));
        if (param0 != -28558) {
          ln.a(101, 106);
          if (var1 == null) {
            throw new IllegalStateException();
          }
          bi.a(var1.field_n, var1.field_r, var1.field_o);
          bi.g(var1.field_q, var1.field_x, var1.field_u, var1.field_v);
          var1.field_n = null;
          ag.field_b.a(var1, false);
          return;
        }
        if (var1 == null) {
          throw new IllegalStateException();
        }
        bi.a(var1.field_n, var1.field_r, var1.field_o);
        bi.g(var1.field_q, var1.field_x, var1.field_u, var1.field_v);
        var1.field_n = null;
        ag.field_b.a(var1, false);
    }

    static {
        field_a = "Confirm Password: ";
        field_e = "Add <%0> to friend list";
    }
}
