/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends br {
    static int[] field_i;
    static th field_g;
    static String field_j;
    static String field_n;
    static boolean field_m;
    int field_k;
    int field_l;
    static String field_h;
    int field_f;

    final static String a(int param0, String param1) {
        int var2 = h.a(kj.field_q, 19313, am.field_b);
        if (var2 == 1) {
            param1 = "<img=0>" + param1;
        }
        if (!(var2 != param0)) {
            param1 = "<img=1>" + param1;
        }
        return param1;
    }

    final static boolean c(byte param0) {
        if (param0 >= -25) {
            return true;
        }
        return ab.field_k;
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 != 48) {
            return;
        }
        field_i = null;
        field_g = null;
        field_n = null;
        field_h = null;
    }

    private nh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
        field_j = "Release a mist that makes it harder for your opponents to see.";
        field_m = true;
        field_h = "Your undead army is victorious!";
    }
}
