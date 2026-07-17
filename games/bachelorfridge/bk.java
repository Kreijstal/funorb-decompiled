/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ana {
    static vr field_v;
    private cv field_x;
    static String field_w;

    public static void e() {
        field_w = null;
        field_v = null;
    }

    bk(gj param0, cv param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((bk) this).field_x = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b() {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((bk) this).field_x.field_l.a(124, ((bk) this).field_q.field_h);
        if (!(!var2.i(-74))) {
            return;
        }
        iv var3 = (iv) (Object) ((bk) this).field_x.field_o.b((byte) 90);
        oha discarded$6 = al.a(-36, ((bk) this).field_x.field_k);
        while (var3 != null) {
            var3.a(var2, ((bk) this).field_q.field_h, 12);
            var4 = var3.field_h.a(-27449, ((bk) this).field_q);
            var4.b(-1, 7);
            var4.a(24831, 53, kna.field_g[43]);
            var3 = (iv) (Object) ((bk) this).field_x.field_o.c(0);
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -106 % ((71 - param0) / 47);
        int fieldTemp$4 = ((bk) this).field_l - 1;
        ((bk) this).field_l = ((bk) this).field_l - 1;
        if (fieldTemp$4 >= 0) {
          if (25 == ((bk) this).field_l) {
            wf.a(69, (byte) 127);
            int discarded$5 = 1;
            this.b();
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "You must play 1 more rated game before playing with the current options.";
    }
}
