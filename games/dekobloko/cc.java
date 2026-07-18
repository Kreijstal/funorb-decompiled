/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static String field_g;
    static pi[][] field_f;
    static int[] field_h;
    static String field_d;
    static String field_b;
    static int field_a;
    private ck[] field_c;
    static String field_e;

    final static f a(int param0, byte param1) {
        f var2 = new f();
        rc.field_e.a((bh) (Object) var2, 2777);
        gm.b(4, 65);
        return var2;
    }

    public static void a(byte param0) {
        field_g = null;
        field_d = null;
        field_h = null;
        field_e = null;
        field_b = null;
        field_f = null;
    }

    final static void a(int param0) {
        kb.field_i = new bk(ui.field_x, tg.field_h, ib.field_nb, ua.field_H, (w) (Object) al.field_h, df.field_ab);
    }

    cc(ck[] param0) {
        try {
            ((cc) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "cc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -29 / ((param1 - -69) / 54);
        vk.a(param4, (byte) 50, ((cc) this).field_c, param0, param3, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Score: ";
        field_f = new pi[8][];
        field_d = "Colourful pieces are falling from the sky!";
        field_b = "Staff impersonation";
        field_e = "More suggestions";
    }
}
