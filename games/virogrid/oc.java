/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends l {
    int field_j;
    static boolean field_l;
    int field_g;
    static String field_i;
    int field_m;
    static long field_n;
    static int field_k;
    static String field_h;

    public static void c(boolean param0) {
        if (param0) {
            oc.c(false);
            field_h = null;
            field_i = null;
            return;
        }
        field_h = null;
        field_i = null;
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "You can join this game";
        field_k = 15;
        field_h = "Game full";
    }
}
