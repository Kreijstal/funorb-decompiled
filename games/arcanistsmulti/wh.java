/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static boolean[] field_e;
    static int[] field_i;
    static String field_b;
    static int field_c;
    static int[][] field_d;
    static String field_a;
    static vn field_h;
    static boolean field_g;
    static ll[] field_k;
    static e field_f;
    static String field_j;
    static eg field_l;

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> -327065503;
        param0 = param0 | param0 >>> -1057549438;
        param0 = param0 | param0 >>> -469438012;
        param0 = param0 | param0 >>> 220093928;
        if (param1 != 678231216) {
            field_k = null;
        }
        param0 = param0 | param0 >>> 678231216;
        return 1 + param0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -83) {
            qb discarded$0 = wh.a(-29);
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_f = null;
        field_k = null;
        field_d = null;
        field_j = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 117) {
            qb discarded$0 = wh.a(89);
        }
        wn.field_z.a(param1, (byte) -127);
    }

    final static qb a(int param0) {
        int var4_int = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > -100) {
            field_f = null;
        }
        int var1 = ho.field_i[0] * jg.field_p[0];
        byte[] var2 = ln.field_I[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ph.field_c[dg.a(255, (int) var2[var4_int])];
        }
        qb var4 = new qb(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], var3);
        dk.a(-18229);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Username: ";
        field_a = "Waiting for fonts";
        field_i = new int[]{1, 2, 3, 4, 5, 6, 53, 57, 54};
        field_g = true;
        field_h = new vn();
        field_j = "Reading Book of Frost";
    }
}
