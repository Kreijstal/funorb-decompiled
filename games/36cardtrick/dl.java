/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends qb {
    static int field_g;
    int[] field_i;
    static int field_h;
    static String field_j;

    final static void a(int param0, kc param1) {
        try {
            ji.a(true);
            vj.a(param1.field_r, param1.field_l, param1.field_k);
            int var2_int = -40 % ((param0 - 27) / 52);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "dl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
            return false;
        }
        return vg.field_d;
    }

    private dl() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 8996) {
            Object var2 = null;
            dl.a(51, (kc) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_j = "Go Back";
    }
}
