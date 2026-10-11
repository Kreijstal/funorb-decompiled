/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static vc field_f;
    static String field_b;
    static String field_h;
    static fa field_e;
    static rh field_a;
    static int field_i;
    static int field_d;
    static dd field_g;
    static dd field_c;

    final static void a(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        ll var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          if (param1 != 0) {
            field_b = (String) null;
          }
          var4 = (bh) (wi.field_j.c((byte) 47));
          while (var4 != null) {
            s.a(param1 ^ -4471, param0, var4);
            var4 = (bh) (wi.field_j.b((byte) -105));
          }
          var5 = (ll) (jj.field_S.c((byte) 47));
          while (var5 != null) {
            ak.a(-14722, var5, param0);
            var5 = (ll) (jj.field_S.b((byte) -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2), "pb.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          var1_int = ed.field_c[0];
          if (param0 <= 42) {
            return;
          }
          for (var2 = 1; ed.field_c.length > var2; var2++) {
            var3 = ed.field_c[var2];
            dm.a(pk.field_J, var2 << 4, pk.field_J, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "pb.B(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        field_c = null;
        if (param0 >= -80) {
          field_c = (dd) null;
        }
    }

    static {
        field_b = "Creating your account";
        field_d = 0;
        field_h = "Tiles you can place";
        field_i = 100;
        field_f = new vc();
    }
}
