/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    int field_b;
    private kda field_c;
    static wm field_d;
    static int field_a;

    protected final void finalize() throws Throwable {
        ((mf) this).field_c.b(((mf) this).field_b, (byte) 18);
        super.finalize();
    }

    public static void a(boolean param0) {
        if (param0) {
            mf.a(-23);
        }
        field_d = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        double var2_double = 0.0;
        int var2 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        uoa.b();
        hma.field_a = 11;
        gta.field_g = new int[260];
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2_double = 15.0;
            gta.field_g[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2_double) * 255.0);
        }
        var1 = -125 % ((param0 - -11) / 55);
        for (var2 = 256; var2 < gta.field_g.length; var2++) {
            gta.field_g[var2] = 255;
        }
    }

    mf(kda param0, int param1, int param2) {
        ((mf) this).field_b = param2;
        ((mf) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new wm();
        field_a = 50;
    }
}
