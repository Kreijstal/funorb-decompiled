/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq extends java.awt.Canvas implements java.awt.event.FocusListener {
    static tf field_g;
    static ps field_h;
    static ut field_d;
    java.awt.Frame field_c;
    static String[] field_i;
    static String field_e;
    volatile boolean field_b;
    static String field_f;
    static ut field_a;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((vq) this).field_b = true;
    }

    final static byte[] a(int param0, byte[] param1) {
        if (param0 < 53) {
            field_e = null;
        }
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        dv.a(param1, 0, var3, 0, var2);
        return var3;
    }

    final void a(bu param0, int param1) {
        dq.a(param0, ((vq) this).field_c, 0);
        if (param1 != 9) {
            Object var4 = null;
            ((vq) this).focusGained((java.awt.event.FocusEvent) null);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_f = null;
        field_d = null;
        field_a = null;
        if (param0 != 25) {
            return;
        }
        field_h = null;
        field_g = null;
    }

    final static void a(bu param0, byte param1, java.awt.Component param2) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        uh.a(22050, true, 10);
        wd.field_n = new int[3];
        for (var3 = 0; var3 < wd.field_n.length; var3++) {
            wd.field_n[var3] = 256;
        }
        cb.field_d = uh.a(param0, param2, 0, 22050);
        pg.field_d = uh.a(param0, param2, 1, 1024);
        if (param1 != 23) {
            vq.a((byte) 30);
        }
        sk.field_d = new jj(3);
        sk.field_d.a(param1 + -23, 128, 9);
        int var5 = 0;
        var3 = var5;
        while (3 > var5) {
            sk.field_d.a(var5, wd.field_n[var5], (byte) -85);
            var5++;
        }
        cb.field_d.a((lq) (Object) sk.field_d);
        pi.field_b = new gq();
        pg.field_d.a((lq) (Object) pi.field_b);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    vq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = null;
        field_e = "filter <%0>";
        field_g = new tf();
        field_f = "Withdraw invitation to <%0> to join this game";
    }
}
