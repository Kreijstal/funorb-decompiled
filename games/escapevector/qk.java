/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static dn field_e;
    String field_i;
    int field_b;
    static int field_j;
    String field_d;
    mf field_h;
    static String field_a;
    static la field_g;
    static int[] field_f;
    String field_c;

    public static void a(byte param0) {
        int var1 = -8 / ((4 - param0) / 38);
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        di.field_d = null;
        mj.field_d = 0;
        int var2 = -17 % ((-17 - param1) / 39);
        pl.field_q.b(-26480, param0);
        gi.a((byte) -123);
    }

    final static void a(int[] param0, int param1) {
        int var2 = 0;
        if ((nk.field_n ^ -1) == -98) {
            var2 = di.field_d.field_h;
            var2++;
            if (var2 >= param0.length) {
                var2 = 0;
            }
            di.field_d.a(false, var2);
            if (param1 != 0) {
                field_e = null;
                if (96 == nk.field_n) {
                    var2 = di.field_d.field_h;
                    var2--;
                    if (!(0 <= var2)) {
                        var2 = -1 + param0.length;
                    }
                    di.field_d.a(false, var2);
                    return;
                }
                if (98 != nk.field_n) {
                    return;
                }
                var2 = di.field_d.field_h;
                var2--;
                if (!(0 <= var2)) {
                    var2 = -1 + param0.length;
                }
                di.field_d.a(false, var2);
                return;
            }
            if (96 == nk.field_n) {
                var2 = di.field_d.field_h;
                var2--;
                if (!(0 <= var2)) {
                    var2 = -1 + param0.length;
                }
                di.field_d.a(false, var2);
                return;
            }
            if (98 == nk.field_n) {
                var2 = di.field_d.field_h;
                var2--;
                if (!(0 <= var2)) {
                    var2 = -1 + param0.length;
                }
                di.field_d.a(false, var2);
                return;
            }
            return;
        }
        if (nk.field_n == 99) {
            var2 = di.field_d.field_h;
            var2++;
            if (var2 >= param0.length) {
                var2 = 0;
            }
            di.field_d.a(false, var2);
            if (param1 != 0) {
                field_e = null;
                if (96 != nk.field_n) {
                    // if_icmpeq L2665
                } else {
                    var2 = di.field_d.field_h;
                    var2--;
                    if (!(0 <= var2)) {
                        var2 = -1 + param0.length;
                    }
                    di.field_d.a(false, var2);
                }
                return;
            }
            if (96 != nk.field_n) {
                // if_icmpeq L2716
            } else {
                var2 = di.field_d.field_h;
                var2--;
                if (!(0 <= var2)) {
                    var2 = -1 + param0.length;
                }
                di.field_d.a(false, var2);
            }
            return;
        }
        if (param1 != 0) {
            field_e = null;
            if (96 != nk.field_n) {
                // if_icmpeq L2778
            } else {
                var2 = di.field_d.field_h;
                var2--;
                if (!(0 <= var2)) {
                    var2 = -1 + param0.length;
                }
                di.field_d.a(false, var2);
            }
            return;
        }
        if (96 != nk.field_n) {
            // if_icmpeq L2829
        } else {
            var2 = di.field_d.field_h;
            var2--;
            if (!(0 <= var2)) {
                var2 = -1 + param0.length;
            }
            di.field_d.a(false, var2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To server list";
    }
}
