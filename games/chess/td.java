/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends o {
    static String field_r;
    byte[] field_q;
    static int field_k;
    static char[] field_l;
    static um field_o;
    static int field_p;
    static String field_j;
    static String[] field_n;
    static String field_m;

    final static void a(le param0, int param1, int param2, int param3) {
        try {
            tm.field_d = 0;
            tn.field_m = 0;
            bl.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "td.B(" + (param0 != null ? "{...}" : "null") + ',' + 0 + ',' + 0 + ',' + 200 + ')');
        }
    }

    final static km[] a(int param0, int param1) {
        km[] var3 = new km[9];
        km[] var2 = var3;
        var3[4] = rd.a(64, param1, 14727);
        return var2;
    }

    td(byte[] param0) {
        try {
            ((td) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_n = null;
        field_m = null;
        field_l = null;
        field_r = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 500;
        field_j = "Unable to add name - system busy";
        field_k = 20;
        field_r = "Invalid password.";
        field_l = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_m = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
