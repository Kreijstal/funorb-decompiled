/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rw extends pj {
    boolean field_s;
    volatile boolean field_u;
    boolean field_t;
    static ri[] field_r;

    final static String c(byte param0) {
        if (param0 > -81) {
            return null;
        }
        if (!(nw.field_e != ad.field_p)) {
            return bi.field_d;
        }
        return kh.field_d;
    }

    rw() {
        ((rw) this).field_u = true;
    }

    abstract int a(int param0);

    abstract byte[] d(boolean param0);

    public static void c(boolean param0) {
        field_r = null;
        if (!param0) {
            field_r = null;
        }
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        wb var1 = new wb(540, 140);
        jq.a(7161, var1);
        nk.b();
        if (param0 != -90) {
            field_r = null;
        }
        lk.b();
        td.field_u = 0;
        ok.b(256);
        wb var2 = var1.b();
        for (var3 = 0; var3 < 15; var3++) {
            var2.c(-2, -2, 16777215);
            lk.c(4, 4, 0, 0, 540, 140);
        }
        eh.field_b.d();
        var1.b(0, 0);
        su.a((byte) 76);
    }

    static {
    }
}
