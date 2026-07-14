/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ucb {
    int field_a;
    int field_b;

    ucb(int param0, int param1) {
        ((ucb) this).field_b = param1;
        ((ucb) this).field_a = param0;
    }

    final static phb[] a(String param0, int param1, String param2, asb param3) {
        phb[] var6 = wjb.a(param3, true, param2, param0);
        phb[] var4 = var6;
        var6[1].field_m = var6[1].field_q;
        int var5 = -55 % ((13 - param1) / 38);
        var6[3].field_n = var6[3].field_p;
        var6[5].field_n = var6[5].field_p;
        var6[7].field_m = var6[7].field_q;
        return var4;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param2 != 11585) {
            return;
        }
        if (!param1) {
            kf.field_a = kf.field_a & (param0 ^ -1);
            return;
        }
        kf.field_a = param0 | kf.field_a;
    }

    static {
    }
}
