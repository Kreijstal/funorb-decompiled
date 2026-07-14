/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jw extends ana {
    private fia field_w;
    static String field_x;
    static kv[] field_v;

    public static void d(int param0) {
        field_x = null;
        if (param0 != 32) {
            jw.d(-106);
            field_v = null;
            return;
        }
        field_v = null;
    }

    private final void e(int param0) {
        iv var3 = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        ad var8 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((jw) this).field_w.field_l.a(14, ((jw) this).field_q.field_h);
        if (!var6.i(80)) {
          var3 = (iv) (Object) ((jw) this).field_w.field_o.b((byte) 90);
          oha discarded$1 = al.a(-44, ((jw) this).field_w.field_k);
          if (param0 != -23403) {
            jw.d(-10);
            L0: while (true) {
              if (var3 != null) {
                var3.a(var6, ((jw) this).field_q.field_h, param0 ^ -23399);
                var8 = var3.field_h.a(param0 + -4046, ((jw) this).field_q);
                var8.b(param0 ^ 23402, 7);
                var8.a(24831, 9, kna.field_g[32]);
                var3 = (iv) (Object) ((jw) this).field_w.field_o.c(0);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            L1: while (true) {
              if (var3 != null) {
                var3.a(var6, ((jw) this).field_q.field_h, param0 ^ -23399);
                var7 = var3.field_h.a(param0 + -4046, ((jw) this).field_q);
                var7.b(param0 ^ 23402, 7);
                var7.a(24831, 9, kna.field_g[32]);
                var3 = (iv) (Object) ((jw) this).field_w.field_o.c(0);
                continue L1;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void f(int param0) {
        if (param0 == 7) {
            return;
        }
        this.e(48);
    }

    final boolean c(byte param0) {
        ((jw) this).field_l = ((jw) this).field_l - 1;
        if (!(((jw) this).field_l - 1 > -1)) {
            if (-26 == ((jw) this).field_l) {
                jja.a(256, -1, 33);
                this.e(-23403);
                return false;
            }
            return false;
        }
        int var2 = -38 / ((param0 - 71) / 47);
        this.f(7);
        return true;
    }

    jw(gj param0, fia param1) {
        super(param0, (bca) (Object) param1);
        ((jw) this).field_w = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "FULL ACCESS";
    }
}
