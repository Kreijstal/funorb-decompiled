/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends java.awt.Canvas {
    static ak[] field_e;
    private java.awt.Component field_c;
    static String field_f;
    static int field_b;
    static ak field_h;
    static String field_g;
    static String field_a;
    static tc field_d;

    public final void paint(java.awt.Graphics param0) {
        ((hk) this).field_c.paint(param0);
    }

    public final void update(java.awt.Graphics param0) {
        ((hk) this).field_c.update(param0);
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_d = null;
        field_h = null;
        if (param0 >= -4) {
            return;
        }
        field_e = null;
        field_a = null;
    }

    final static int a(byte param0) {
        if (param0 >= -61) {
          hk.a(54);
          return ib.field_e + ((gh.field_v << -1010620414) + (io.field_e << -363848348));
        } else {
          return ib.field_e + ((gh.field_v << -1010620414) + (io.field_e << -363848348));
        }
    }

    hk(java.awt.Component param0) {
        ((hk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 15;
        field_f = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = "Remove <%0> from ignore list";
        field_g = "Your game";
    }
}
