/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends hg {
    static String field_k;
    int field_m;
    int field_g;
    int field_n;
    int field_o;
    int field_i;
    static ed field_j;
    int field_h;
    static String field_l;

    final static ed[] a(int param0, mf param1, int param2, byte param3) {
        int var4 = 0;
        var4 = -48 % ((param3 - -38) / 33);
        if (!uc.a(param1, 120, param0, param2)) {
          return null;
        } else {
          return hf.b(121);
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 <= 26) {
            field_k = null;
            field_l = null;
            field_j = null;
            return;
        }
        field_l = null;
        field_j = null;
    }

    cc(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((cc) this).field_n = param2;
        ((cc) this).field_g = param5;
        ((cc) this).field_m = param1;
        ((cc) this).field_h = param3;
        ((cc) this).field_i = param0;
        ((cc) this).field_o = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The Achievements system is currently unavailable.";
    }
}
