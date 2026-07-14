/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static boolean field_d;
    int field_b;
    static int field_a;
    static String field_f;
    static java.math.BigInteger field_c;
    static int field_e;

    final static void b(int param0) {
        if (param0 != -28186) {
            dj.a(86);
        }
        rf.field_B[bk.d(23196)].a(0, 0, 102);
    }

    final static ci[] c(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        ci[] var1 = new ci[kf.field_b];
        for (var2 = 0; kf.field_b > var2; var2++) {
            var3 = sb.field_m[var2] * rf.field_p[var2];
            var4 = qc.field_b[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = wb.field_a[dg.a((int) var4[var6], 255)];
            }
            var1[var2] = new ci(ah.field_A, sb.field_j, ha.field_s[var2], hj.field_K[var2], sb.field_m[var2], rf.field_p[var2], var5);
        }
        if (param0 > -7) {
            field_a = 7;
        }
        mj.a((byte) 82);
        return var1;
    }

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 > -47) {
            field_e = 55;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You are about to start a game on normal difficulty, to play the tutorial please start the game on easy difficulty.";
        field_c = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_e = 0;
    }
}
