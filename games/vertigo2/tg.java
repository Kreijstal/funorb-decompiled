/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends java.awt.Canvas {
    private java.awt.Component field_b;
    static ve field_c;
    static long field_a;
    static int field_e;
    static String field_d;
    static double field_f;

    final static void a(byte param0) {
        nn var1 = null;
        nn var1_ref = null;
        L0: {
          var1 = (nn) (Object) ag.field_b.d((byte) 92);
          if (var1 == null) {
            var1_ref = new nn();
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -12) {
          return;
        } else {
          var1_ref.a(bi.field_d, bi.field_c, bi.field_f, bi.field_i, bi.field_l, -550, bi.field_j, bi.field_e);
          gi.field_v.a((li) (Object) var1_ref, false);
          return;
        }
    }

    final static void a(int param0) {
        if (!kg.h(0)) {
          return;
        } else {
          if (param0 < 64) {
            tg.a((byte) -2);
            bl.a(false, 4, -30962);
            return;
          } else {
            bl.a(false, 4, -30962);
            return;
          }
        }
    }

    final static void a(int param0, cr param1) {
        cr var5 = null;
        int var3 = Vertigo2.field_L ? 1 : 0;
        cr var4 = (cr) (Object) param1.field_M.a((byte) 100);
        cr var2 = var4;
        while (var4 != null) {
            var4.field_kb = 0;
            var4.field_N = 0;
            var4.field_L = 0;
            var4.field_db = 0;
            var5 = (cr) (Object) param1.field_M.b(95);
            cr var5_ref = var5;
        }
        param1.field_kb = 0;
        param1.field_L = 0;
        param1.field_db = param0;
        param1.field_N = 0;
    }

    final static void a(int param0, ri param1, int param2) {
        mi var3 = null;
        var3 = uh.field_Wb;
        var3.j(param0, 120);
        var3.f(param1.field_w, param2 + 96);
        var3.f(param1.field_n, 103);
        if (param2 != 0) {
          field_e = -11;
          return;
        } else {
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((tg) this).field_b.paint(param0);
    }

    tg(java.awt.Component param0) {
        ((tg) this).field_b = param0;
    }

    public final void update(java.awt.Graphics param0) {
        ((tg) this).field_b.update(param0);
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 4) {
            field_f = 1.7799608967568306;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You must play <%1> more rated games before playing with the current options.";
        field_e = 256;
        field_c = new ve(11, 0, 1, 2);
        field_f = 65536.0;
    }
}
