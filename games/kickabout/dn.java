/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends hd {
    static String field_Db;
    int field_Bb;
    static int field_yb;
    static hd field_zb;
    static hd field_Cb;
    static String field_Ab;
    static String[] field_Eb;

    final static void a(int param0) {
        int var1 = -1 / ((-68 - param0) / 53);
    }

    dn(int param0) {
        ((dn) this).field_Bb = param0;
        ut var3 = new ut(qe.field_i[iw.field_e[((dn) this).field_Bb]].field_q >> 622880450, qe.field_i[iw.field_e[((dn) this).field_Bb]].field_w >> -628947422);
        ut var2 = var3;
        iw.a(-59, var3);
        qe.field_i[iw.field_e[((dn) this).field_Bb]].g(0, 0);
        ta.e(121);
        ((dn) this).field_N = var2;
        ((dn) this).field_mb = 5 + var2.field_v - -5;
        ((dn) this).field_B = 5;
        ((dn) this).field_D = 5;
        ((dn) this).field_q = 5 + (var2.field_o - -5);
    }

    final static String a(String param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var5 = param0.charAt(var4);
            if (var4 != 0) {
                var5 = Character.toLowerCase((char) var5);
            } else {
                var5 = ju.b(19805, (char) var5);
            }
            var3[var4] = (char)var5;
        }
        if (param1) {
            field_Ab = null;
        }
        return new String(var3);
    }

    final static void b(int param0, int param1) {
        if (param0 != -5) {
            field_Ab = null;
        }
        fw.field_G = (double)param1;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (!param2) {
            dn.c(false);
        }
        if (!(ck.field_b == null)) {
            var3 = ck.field_b.a(param0, 0);
            if (var3 != -2) {
                if (!(-1 == var3)) {
                    var4 = ck.field_b.b(26) ? 1 : 0;
                    nu.a(119, ck.field_b.field_Eb, var3, param1, var4 != 0, ck.field_b.a(-15596));
                }
                ck.field_b = null;
                da.b(108);
            }
        }
    }

    public static void c(boolean param0) {
        field_zb = null;
        field_Db = null;
        field_Ab = null;
        if (!param0) {
            return;
        }
        field_Eb = null;
        field_Cb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Next";
        field_Ab = "slide";
    }
}
