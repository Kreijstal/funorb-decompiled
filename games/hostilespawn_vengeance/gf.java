/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static bd field_d;
    static ll field_f;
    static int field_j;
    static String[] field_c;
    static na field_e;
    static bd field_g;
    static fd field_b;
    static int field_i;
    static long field_h;
    static bd field_a;

    final static String a(byte param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        String var6 = "(" + bj.field_f + " " + ae.field_u + " " + ne.field_o + ") " + wa.field_k;
        String var1 = var6;
        if (jd.field_q <= 0) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < jd.field_q; var2++) {
                var7 = var1 + ' ';
                var1 = var7;
                var3 = 255 & sc.field_g.field_n[var2];
                var4 = var3 >> 1569148036;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                if ((var3 ^ -1) <= -11) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        if (param0 >= -121) {
            return (String) null;
        }
        return var1;
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != -105) {
            return;
        }
        field_e = null;
    }

    static {
        field_j = 0;
        field_c = new String[16];
        field_i = -1;
        field_f = new ll();
    }
}
