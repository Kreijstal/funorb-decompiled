/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static String[] field_a;

    abstract fd b(byte param0);

    abstract int a(int param0, int param1);

    final static String a(int param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = Torquing.field_u;
        String var6 = "(" + mm.field_d + " " + eb.field_f + " " + wk.field_h + ") " + fa.field_e;
        String var1 = var6;
        if (param0 > (oo.field_a ^ -1)) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < oo.field_a; var2++) {
                var7 = var1 + ' ';
                var3 = kj.field_d.field_j[var2] & 255;
                var4 = var3 >> -12710428;
                var3 = var3 & 15;
                if ((var4 ^ -1) > -11) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    public static void a(byte param0) {
        String discarded$0 = null;
        if (param0 < 1) {
            discarded$0 = me.a(-64);
        }
        field_a = null;
    }

    abstract byte[] a(int param0, boolean param1);

    static {
    }
}
