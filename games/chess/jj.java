/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static ci field_f;
    static dd[] field_c;
    static c field_d;
    static c field_b;
    static um field_e;
    static hn field_a;

    final static void c(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        nk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        try {
          if (param0 != 8) {
            field_e = (um) null;
          }
          var1 = qn.field_U;
          while (ci.g(param0 + 2147483639)) {
            var1.f(8, -65);
            fieldTemp$0 = var1.field_l + 1;
            var1.field_l = var1.field_l + 1;
            var2 = fieldTemp$0;
            de.a(var1, (byte) 67);
            qn.field_U.a(var1.field_l - var2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "jj.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 7) {
          return;
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
        field_d = null;
    }

    final static boolean b(int param0) {
        if (param0 != 7) {
          field_c = (dd[]) null;
          if (cd.field_x == null) {
            return an.field_c ? true : false;
          }
          return true;
        }
        if (cd.field_x != null) {
          return true;
        }
        if (!an.field_c) {
          return false;
        }
        return true;
    }

    final static boolean d(int param0) {
        int var1 = -103 / ((75 - param0) / 42);
        if (ch.field_gb == null) {
          return false;
        }
        if (ch.field_gb.b(-1)) {
          return true;
        }
        return false;
    }

    static {
        field_c = new dd[7];
    }
}
