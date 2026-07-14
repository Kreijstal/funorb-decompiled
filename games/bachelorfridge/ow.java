/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ow extends jm {
    private aj[] field_m;
    static String field_n;

    final void a(ub param0, int param1) {
        param0.a(27799, (at) (Object) new lv(param0.field_o, ((ow) this).field_m));
        if (param1 >= -2) {
            Object var4 = null;
            java.net.URL discarded$0 = ow.a((java.net.URL) null, (byte) 29, (java.applet.Applet) null);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        if (null != nb.field_q) {
            if (!nb.field_q.equals((Object) (Object) param2.getParameter("settings"))) {
                var3 = nb.field_q;
                var4 = var3;
                var4 = var3;
            }
        }
        if (null != rha.field_d) {
            if (!rha.field_d.equals((Object) (Object) param2.getParameter("session"))) {
                var4 = rha.field_d;
            }
        }
        if (param1 >= -74) {
            Object var5 = null;
            java.net.URL discarded$0 = ow.a((java.net.URL) null, (byte) 84, (java.applet.Applet) null);
            return ew.a(param0, 25969, -1, var3, var4);
        }
        return ew.a(param0, 25969, -1, var3, var4);
    }

    final void b(lu param0, byte param1) {
        int var5 = 0;
        aj var6 = null;
        int var7 = BachelorFridge.field_y;
        param0.d(((ow) this).field_m.length, 0);
        int var4 = 87 / ((param1 - 37) / 38);
        aj[] var8 = ((ow) this).field_m;
        aj[] var3 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            param0.d(var6.field_c, 0);
            param0.d(var6.field_a, 0);
        }
    }

    ow(aj[] param0, int param1) {
        int var3 = 0;
        ((ow) this).field_m = new aj[param1];
        ((ow) this).field_j = 9;
        for (var3 = 0; var3 < param1; var3++) {
            ((ow) this).field_m[var3] = param0[var3];
        }
    }

    final void a(boolean param0, op param1) {
        int var4 = 0;
        aj var5 = null;
        aga var6 = null;
        int var7 = BachelorFridge.field_y;
        aj[] var8 = ((ow) this).field_m;
        aj[] var3 = var8;
        for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            var6 = param1.field_a[var5.field_c][var5.field_a].field_l;
            if (var6 != null) {
                if (!var6.g(-75, 40)) {
                }
            }
            param1.field_a[var5.field_c][var5.field_a].field_j = 2;
        }
        if (param0) {
            ((ow) this).field_m = null;
            return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 != -1) {
            ow.a(123);
        }
    }

    ow(lu param0) {
        int var3 = 0;
        ((ow) this).field_j = 9;
        int var2 = param0.b(16711935);
        ((ow) this).field_m = new aj[var2];
        for (var3 = 0; var2 > var3; var3++) {
            ((ow) this).field_m[var3] = new aj(param0.b(16711935), param0.b(16711935));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Back";
    }
}
