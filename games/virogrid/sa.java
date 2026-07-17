/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends l {
    int field_i;
    static String field_o;
    int field_j;
    static String field_l;
    int field_n;
    int field_h;
    int field_k;
    static String field_p;
    int field_g;
    static String field_m;

    final static void a(byte param0, String param1, String param2, boolean param3) {
        try {
            wd.field_d = param1;
            pm.field_g = param2;
            if (param0 <= 98) {
                sa.a(-84);
            }
            int discarded$0 = 0;
            gk.a(param3, bn.field_a);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0) {
        int var1 = -105 / ((-9 - param0) / 56);
    }

    public static void a() {
        field_m = null;
        field_o = null;
        int var1 = -84;
        field_l = null;
        field_p = null;
    }

    private sa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "You have been removed from <%0>'s game.";
        field_l = "Invalid name";
        field_p = "Unable to add name - system busy";
        field_m = "Your rating is <%0>";
    }
}
