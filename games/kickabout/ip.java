/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static String[] field_d;
    static int field_a;
    static gm[] field_b;
    static hd field_c;

    public static void a(int param0) {
        if (param0 > -60) {
            return;
        }
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(boolean param0) {
        double var2 = 0.0;
        int var4 = Kickabout.field_G;
        t.c();
        mr.field_Y = new int[260];
        im.field_yb = 11;
        int var1 = 0;
        if (param0) {
            return;
        }
        while ((var1 ^ -1) > -257) {
            var2 = 15.0;
            mr.field_Y[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
            var1++;
        }
        int var5 = 256;
        var1 = var5;
        while (mr.field_Y.length > var5) {
            mr.field_Y[var5] = 255;
            var5++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"pgup", "pgdn"};
    }
}
