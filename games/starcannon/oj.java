/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends rf {
    static ae field_j;
    int field_h;
    int field_i;
    static Boolean field_g;
    static String field_k;
    static java.applet.Applet field_f;

    final static int a() {
        return pg.field_g;
    }

    final static hl a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = StarCannon.field_A;
        hl var6 = new hl(param2, param2);
        hl var3 = var6;
        for (var4 = 0; var3.field_B.length > var4; var4++) {
            var6.field_B[var4] = param1;
        }
        return var3;
    }

    public static void d() {
        field_f = null;
        field_j = null;
        field_g = null;
        field_k = null;
    }

    final static hl[] a(int param0, int param1, int param2, int param3, int param4) {
        hl[] var5 = null;
        hl[] var6 = null;
        var6 = new hl[9];
        var5 = var6;
        hl dupTemp$4 = oj.a(0, param1, 1);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[1] = dupTemp$4;
        var5[0] = dupTemp$4;
        hl dupTemp$5 = oj.a(0, param3, 1);
        var6[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (param4 != 0) {
          var6[4] = oj.a(0, param4, 64);
          return var5;
        } else {
          return var5;
        }
    }

    private oj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ae();
        field_k = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
