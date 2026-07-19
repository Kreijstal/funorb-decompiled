/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends jj {
    static int[][] field_p;
    static ak field_n;
    static String[] field_m;
    private qk[] field_o;

    final void c(int param0) {
        int var3 = 0;
        qk var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        qk[] var6 = this.field_o;
        qk[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.c(148);
        }
    }

    public static void b(byte param0) {
        if (param0 <= 17) {
            field_n = (ak) null;
        }
        field_n = null;
        field_m = null;
        field_p = (int[][]) null;
    }

    wc(String param0, tf[] param1) {
        super(param0, param1);
        try {
            this.c((byte) 97);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        qk var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        ad.field_w.f(0, 0);
        qk[] var6 = this.field_o;
        qk[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.b(73);
        }
        if (param0) {
            wc.b((byte) 76);
        }
    }

    final static String d(int param0) {
        if (param0 != 0) {
            field_n = (ak) null;
        }
        if (rj.field_F == tm.field_X) {
            return nk.field_b;
        }
        if (!an.field_e.d(param0 ^ 46)) {
            return an.field_e.b((byte) 114);
        }
        if (rj.field_F == qo.field_n) {
            return an.field_e.b((byte) 116);
        }
        return h.field_U;
    }

    private final void c(byte param0) {
        this.field_o = new qk[2];
        if (param0 < 91) {
            this.c(-106);
        }
        this.field_o[0] = new qk(0);
        this.field_o[1] = new qk(7);
    }

    static {
        field_m = new String[8];
    }
}
