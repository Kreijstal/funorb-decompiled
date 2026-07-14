/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static String field_e;
    private int[] field_d;
    private int[] field_b;
    private int field_a;
    private int field_f;
    private long field_c;

    final void b(int param0, bra param1) {
        ha var4 = param1.field_g;
        ha var3 = var4;
        var4.KA(((t) this).field_b[0], ((t) this).field_b[1], ((t) this).field_b[2], ((t) this).field_b[3]);
        var4.DA(((t) this).field_d[0], ((t) this).field_d[param0], ((t) this).field_d[2], ((t) this).field_d[3]);
        var3.f(((t) this).field_f, ((t) this).field_a);
        param1.field_e = ((t) this).field_c;
    }

    final void a(int param0, bra param1) {
        ha var3 = null;
        if (param0 != 4) {
          return;
        } else {
          var3 = param1.field_g;
          var3.K(((t) this).field_b);
          ((t) this).field_d = var3.Y();
          ((t) this).field_f = var3.i();
          ((t) this).field_a = var3.XA();
          ((t) this).field_c = param1.field_e;
          return;
        }
    }

    final static sg a(int param0, byte param1) {
        if (param1 < 34) {
            return null;
        }
        return rpa.a(param0, 0, true);
    }

    public static void a(int param0) {
        if (param0 != 1) {
            t.a(57);
            field_e = null;
            return;
        }
        field_e = null;
    }

    t() {
        ((t) this).field_b = new int[4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Withdraw request to join <%0>'s game";
    }
}
