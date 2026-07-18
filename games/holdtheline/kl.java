/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl extends dk {
    static String[] field_r;
    static jn field_q;
    static ib field_v;
    static oa field_t;
    static uj[] field_s;
    static String field_u;

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        try {
            if (param2 >= -48) {
                field_s = null;
            }
            if (!(!param0)) {
                tn.a(param1 + param3.field_k, param3.field_x, 152, param4 + param3.field_o, param3.field_u);
            }
            super.a(param0, param1, -106, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "kl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    kl(int param0) {
        this(hl.field_g, param0);
    }

    kl(qi param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_G, -1, 2147483647, false);
    }

    public static void c(boolean param0) {
        field_t = null;
        field_s = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
    }

    final static nd a(boolean param0, int param1) {
        nd var2 = new nd(true);
        var2.field_i = param0 ? true : false;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_q = new jn(1);
    }
}
