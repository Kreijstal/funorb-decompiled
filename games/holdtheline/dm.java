/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static java.awt.Color field_d;
    static int[] field_b;
    static int field_a;
    static String field_c;
    static int[] field_e;

    final static void b(byte param0) {
        we var1 = (we) (Object) ug.field_g.a((byte) 74);
        if (param0 != -10) {
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        tc.a(var1.field_k, var1.field_s, var1.field_m);
        tc.a(var1.field_i, var1.field_r, var1.field_q, var1.field_u);
        var1.field_k = null;
        fl.field_i.a((byte) -101, (hl) (Object) var1);
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 != -20) {
            dm.b((byte) -112);
        }
        field_e = null;
        field_c = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = HoldTheLine.field_D;
        li.c();
        il.field_c = 11;
        qf.field_i = new int[260];
        if (param0 != 255) {
            field_a = -31;
        }
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            qf.field_i[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (qf.field_i.length > var5) {
            qf.field_i[var5] = 255;
            var5++;
        }
    }

    final static void a(da param0, int param1, int param2) {
        eg.a(d.field_c[param1], 16, true, param0);
        if (param2 != 255) {
            field_e = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new java.awt.Color(10040319);
        field_b = new int[4];
        field_a = 0;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
