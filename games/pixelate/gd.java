/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static tf field_i;
    static int[] field_c;
    static String field_d;
    static re field_a;
    static int field_l;
    static int[] field_b;
    static int[] field_h;
    static so[] field_e;
    static String field_j;
    static byte[][] field_k;
    static int field_g;
    static tf[] field_f;

    final static void a(byte param0) {
        vd.field_c = new ak(0L, (ak) null);
        if (f.field_n) {
            vd.field_c.a(gk.field_lb, (byte) 26);
        }
        vd.field_c.a(oc.field_O, (byte) 26);
        cl.field_g = new wo(ul.field_m, vd.field_c);
        ql.field_n = new ak(0L, (ak) null);
        ql.field_n.a((ak) (Object) cl.field_g.field_g, (byte) 26);
        ql.field_n.a(gk.field_cb, (byte) 26);
        we.b(false);
    }

    public static void a(int param0) {
        field_e = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_i = null;
        field_k = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        int var3 = 0;
        field_d = "To server list";
        field_l = 20;
        field_b = new int[8];
        field_c = new int[12];
        field_h = new int[615];
        int var0 = 307;
        for (var2 = 0; var0 > var2; var2++) {
            var3 = 255 & 255 * var2 / var0;
            field_h[var2] = bq.a(var3 << 16, 65280);
        }
        int var1 = 153;
        for (var2 = var0; ~(var1 + var0) < ~var2; var2++) {
            var3 = 255 * (-var0 + var2) / var1;
            field_h[var2] = bq.a(-cm.a(255, var3) + 255 << 8, 16711680);
        }
        for (var2 = var1 + var0; var2 < 615; var2++) {
            var3 = 255 * (-var1 + var2 + -var0) / var1;
            if (var3 > 255) {
                var3 = 255;
            }
            field_h[var2] = -(cm.a(255, var3) / 2) + 255 << 16;
        }
        for (var2 = 0; var2 < 8; var2++) {
            field_b[var2] = 65793 * (var2 << 4);
        }
        for (var2 = 0; ~field_c.length < ~var2; var2++) {
            field_c[var2] = (var2 << 8) / field_c.length * 65793;
        }
        field_j = "Only show lobby chat from my friends";
        field_e = new so[50];
        int[] var7 = new int[50];
        var1 = 30;
        var7[12] = 30;
        var7[7] = 22;
        var7[14] = 10;
        var7[16] = 14;
        var7[10] = 22;
        var7[5] = 30;
        var7[1] = 26;
        for (var2 = 18; var2 < 50; var2++) {
            var7[var2] = var1;
        }
        var7[29] = 0;
        var7[26] = 20;
        var7[39] = 24;
        var7[37] = 1;
        var7[35] = 1;
        var7[38] = 20;
        var7[41] = 20;
        var7[24] = 28;
        field_e[0] = new so(0, 3, 3, var7[0], 2, new int[4]);
        field_e[1] = new so(1, 3, 3, var7[1], 1, new int[5]);
        field_e[2] = new so(2, 3, 3, var7[2], 3, new int[5]);
        field_e[3] = new so(3, 3, 3, var7[3], 4, new int[6]);
        field_e[4] = new so(4, 3, 3, var7[4], 5, new int[4]);
        field_e[5] = new so(5, 3, 4, var7[5], 6, new int[6]);
        field_e[6] = new so(6, 3, 5, var7[6], 7, new int[6]);
        field_e[7] = new so(7, 3, 4, var7[7], 0, new int[6]);
        field_e[8] = new so(8, 4, 4, var7[8], 1, new int[5]);
        field_e[9] = new so(9, 4, 4, var7[9], 3, new int[8]);
        field_e[10] = new so(10, 4, 3, var7[10], 4, new int[6]);
        field_e[11] = new so(11, 5, 3, var7[11], 2, new int[6]);
        field_e[12] = new so(12, 4, 4, var7[12], 6, new int[10]);
        field_e[13] = new so(13, 3, 5, var7[13], 5, new int[6]);
        field_e[14] = new so(14, 5, 4, var7[14], 7, new int[6]);
        field_e[15] = new so(15, 5, 5, var7[15], 0, new int[9]);
        field_e[16] = new so(16, 4, 5, var7[16], 1, new int[8]);
        field_e[17] = new so(17, 5, 5, var7[17], 2, new int[10]);
        field_e[18] = new so(18, 5, 5, var7[18], 3, new int[9]);
        field_e[19] = new so(19, 5, 5, var7[19], 4, new int[9]);
        field_e[20] = new so(20, 5, 5, var7[20], 5, new int[9]);
        field_e[21] = new so(21, 5, 5, var7[21], 6, new int[9]);
        field_e[22] = new so(22, 5, 5, var7[22], 7, new int[9]);
        field_e[23] = new so(23, 5, 5, var7[23], 3, new int[9]);
        field_e[24] = new so(24, 5, 5, var7[24], 0, new int[9]);
        field_e[25] = new so(25, 3, 3, var7[25], 5, new int[7]);
        field_e[26] = new so(26, 3, 3, var7[26], 0, new int[7]);
        field_e[27] = new so(27, 3, 3, var7[27], 3, new int[7]);
        field_e[28] = new so(28, 3, 3, var7[28], 6, new int[6]);
        field_e[29] = new so(29, 3, 3, var7[29], 1, new int[7]);
        field_e[30] = new so(30, 4, 4, var7[30], 7, new int[7]);
        field_e[31] = new so(31, 3, 3, var7[31], 0, new int[8]);
        field_e[32] = new so(32, 3, 4, var7[32], 7, new int[8]);
        field_e[33] = new so(33, 3, 3, var7[33], 4, new int[9]);
        field_e[34] = new so(34, 4, 4, var7[34], 3, new int[7]);
        field_e[35] = new so(35, 3, 4, var7[35], 5, new int[10]);
        field_e[36] = new so(36, 3, 4, var7[36], 1, new int[7]);
        field_e[37] = new so(37, 3, 5, var7[37], 0, new int[8]);
        field_e[38] = new so(38, 3, 3, var7[38], 4, new int[4]);
        field_e[39] = new so(39, 3, 3, var7[39], 6, new int[4]);
        field_e[40] = new so(40, 4, 4, var7[40], 4, new int[5]);
        field_e[41] = new so(41, 4, 4, var7[41], 3, new int[6]);
        field_e[42] = new so(42, 4, 4, var7[42], 1, new int[6]);
        field_e[43] = new so(43, 4, 4, var7[43], 7, new int[6]);
        field_e[44] = new so(44, 4, 4, var7[44], 2, new int[6]);
        field_e[45] = new so(45, 5, 5, var7[45], 6, new int[9]);
        field_e[46] = new so(46, 5, 5, var7[46], 2, new int[10]);
        field_e[47] = new so(47, 5, 5, var7[47], 1, new int[10]);
        field_e[48] = new so(48, 5, 5, var7[48], 2, new int[10]);
        field_e[49] = new so(49, 5, 5, var7[49], 0, new int[12]);
    }
}
