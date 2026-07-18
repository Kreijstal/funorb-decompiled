/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends pj {
    int field_v;
    private fr field_u;
    private long field_t;
    static int field_x;
    static String field_r;
    static int field_s;
    static String[] field_w;

    public static void a(int param0) {
        field_r = null;
        field_w = null;
    }

    private final void f(int param0) {
        if (!(((wh) this).field_t <= 0L)) {
            ((wh) this).field_u.field_y.releasePbuffer(((wh) this).field_t);
            ((wh) this).field_t = 0L;
        }
    }

    final static String a(byte param0) {
        String var1 = "";
        if (no.field_a != null) {
            var1 = no.field_a.a((byte) 48);
        }
        if (0 == var1.length()) {
            var1 = kf.f(1);
        }
        if (!(var1.length() != 0)) {
            var1 = kq.field_R;
        }
        return var1;
    }

    protected final void finalize() throws Throwable {
        this.f(30611);
        super.finalize();
    }

    final long e(int param0) {
        if (param0 >= -68) {
            return -90L;
        }
        return ((wh) this).field_t;
    }

    wh(fr param0, int param1, int param2) {
        try {
            ((wh) this).field_u = param0;
            ((wh) this).field_v = param1 * param2;
            ((wh) this).field_t = ((wh) this).field_u.field_y.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "click to assign points <br> right-click to remove points";
        field_x = 64;
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
