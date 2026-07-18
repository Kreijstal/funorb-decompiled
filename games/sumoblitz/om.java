/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends ms {
    private wc[] field_o;
    static String field_n;
    static boolean field_l;
    static ri[] field_m;
    static String[] field_k;

    om(wc[] param0) {
        try {
            ((om) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "om.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        int var1 = -126;
        field_n = null;
        field_m = null;
    }

    final wc[] a(int param0) {
        int var2 = 45 % ((param0 - -35) / 38);
        return ((om) this).field_o;
    }

    final static boolean a(int param0, int param1, byte param2) {
        int var3 = 59;
        return em.a(false, param0, param1) & sg.a(param0, param1, 65);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unpacking levels";
        field_l = false;
        field_k = new String[]{"Player", "HyoujunBot", "SuiminBot", "KosokuBot", "BunkatBot", "SosakuBot"};
    }
}
