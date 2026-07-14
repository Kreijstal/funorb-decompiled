/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ana {
    static vr field_v;
    private cv field_x;
    static String field_w;

    public static void e(int param0) {
        if (param0 != 25) {
            return;
        }
        field_w = null;
        field_v = null;
    }

    bk(gj param0, cv param1) {
        super(param0, (bca) (Object) param1);
        ((bk) this).field_x = param1;
    }

    private final void b(boolean param0) {
        aga var2 = null;
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        ad var6 = null;
        ad var7 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        var2 = ((bk) this).field_x.field_l.a(124, ((bk) this).field_q.field_h);
        if (var2.i(-74)) {
          return;
        } else {
          if (param0) {
            var3_ref = (iv) (Object) ((bk) this).field_x.field_o.b((byte) 90);
            oha discarded$2 = al.a(-36, ((bk) this).field_x.field_k);
            L0: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var2, ((bk) this).field_q.field_h, 12);
                var6 = var3_ref.field_h.a(-27449, ((bk) this).field_q);
                var6.b(-1, 7);
                var6.a(24831, 53, kna.field_g[43]);
                var3_ref = (iv) (Object) ((bk) this).field_x.field_o.c(0);
                continue L0;
              }
            }
          } else {
            field_w = null;
            var3_ref = (iv) (Object) ((bk) this).field_x.field_o.b((byte) 90);
            oha discarded$3 = al.a(-36, ((bk) this).field_x.field_k);
            L1: while (true) {
              if (var3_ref == null) {
                return;
              } else {
                var3_ref.a(var2, ((bk) this).field_q.field_h, 12);
                var7 = var3_ref.field_h.a(-27449, ((bk) this).field_q);
                var7.b(-1, 7);
                var7.a(24831, 53, kna.field_g[43]);
                var3_ref = (iv) (Object) ((bk) this).field_x.field_o.c(0);
                continue L1;
              }
            }
          }
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -106 % ((71 - param0) / 47);
        ((bk) this).field_l = ((bk) this).field_l - 1;
        if ((((bk) this).field_l - 1 ^ -1) <= -1) {
          if (25 == ((bk) this).field_l) {
            wf.a(69, (byte) 127);
            this.b(true);
            return false;
          } else {
            return false;
          }
        } else {
          this.d(7);
          return true;
        }
    }

    private final void d(int param0) {
        if (param0 != 7) {
            field_w = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "You must play 1 more rated game before playing with the current options.";
    }
}
