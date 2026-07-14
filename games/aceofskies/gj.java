/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends java.awt.Canvas {
    static st field_b;
    static double field_c;
    static me[] field_a;
    private java.awt.Component field_d;

    public final void paint(java.awt.Graphics param0) {
        ((gj) this).field_d.paint(param0);
    }

    final static void a(boolean param0, String param1) {
        String var3 = null;
        ke.a(-1, param1);
        if (!param0) {
          var3 = (String) null;
          gj.a(true, (String) null);
          ua.a(ec.field_o, false, (byte) 82);
          return;
        } else {
          ua.a(ec.field_o, false, (byte) 82);
          return;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            field_c = 1.248002014940651;
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((gj) this).field_d.update(param0);
    }

    gj(java.awt.Component param0) {
        ((gj) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new st();
        field_c = Math.atan2(1.0, 0.0);
    }
}
