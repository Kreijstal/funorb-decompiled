/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    boolean field_d;
    static String field_a;
    String field_e;
    static String field_g;
    String[] field_c;
    int field_b;
    boolean field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -28342) {
          return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        vg var4 = null;
        gj var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = (vg) (kk.field_X.b((byte) -45));
          while (var4 != null) {
            bk.a(true, param0, var4);
            var4 = (vg) (kk.field_X.d(param1 ^ 7970));
          }
          var5 = (gj) (cb.field_b.b((byte) 123));
          while (var5 != null) {
            se.a(var5, param0, -49);
            var5 = (gj) (cb.field_b.d(param1 ^ 7970));
          }
          if (param1 == 7287) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "qj.A(" + param0 + ',' + param1 + ')');
        }
    }

    qj(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_a = "FULL ACCESS";
        field_g = "Next";
    }
}
