/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends fc {
    int field_i;
    static String[] field_k;
    static String field_j;
    static String field_n;
    long field_l;
    byte[] field_m;

    public static void d(int param0) {
        field_n = null;
        field_k = null;
        field_j = null;
        int var1 = -98 / ((param0 - -19) / 58);
    }

    wa(long param0, int param1, byte[] param2) {
        try {
            ((wa) this).field_m = param2;
            ((wa) this).field_i = param1;
            ((wa) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "wa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new String[]{"Junior Track Controller, 2nd Class", "Expert Track Controller, 2nd Class", "Master Track Controller, 2nd Class", "Virtuoso Track Controller, 2nd Class", "Junior Track Controller, 1st Class", "Expert Track Controller, 1st Class", "Master Track Controller, 1st Class", "Virtuoso Track Controller, 1st Class", "Junior Track Arranger", "Expert Track Arranger", "Master Track Arranger", "Virtuoso Track Arranger", "Zombie Controller"};
        field_n = "Oops! Press Backspace to try again.";
        field_j = "Loading music";
    }
}
