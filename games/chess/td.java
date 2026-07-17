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
            if (param3 != 200) {
                td.a(40);
            }
            tm.field_d = param2;
            tn.field_m = param1;
            bl.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "td.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static km[] a(int param0, int param1) {
        km[] var2 = null;
        Object var3 = null;
        km[] var4 = null;
        var4 = new km[9];
        var2 = var4;
        if (param0 != -31056) {
          var3 = null;
          td.a((le) null, -77, -59, -123);
          var4[4] = rd.a(64, param1, 14727);
          return var2;
        } else {
          var4[4] = rd.a(64, param1, 14727);
          return var2;
        }
    }

    td(byte[] param0) {
        try {
            ((td) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_n = null;
        if (param0 != 5239) {
          field_p = 73;
          field_m = null;
          field_l = null;
          field_r = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_l = null;
          field_r = null;
          field_o = null;
          return;
        }
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
