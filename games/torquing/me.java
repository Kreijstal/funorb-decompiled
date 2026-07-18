/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me {
    static String[] field_a;

    abstract fd b(byte param0);

    abstract int a(int param0, int param1);

    final static String a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Torquing.field_u;
        String var1 = "(" + mm.field_d + " " + eb.field_f + " " + wk.field_h + ") " + fa.field_e;
        if (oo.field_a > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < oo.field_a; var2++) {
                var1 = var1 + ' ';
                var3 = kj.field_d.field_j[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public static void a() {
        field_a = null;
    }

    abstract byte[] a(int param0, boolean param1);

    static {
    }
}
