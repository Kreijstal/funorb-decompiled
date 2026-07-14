/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pb extends od {
    int field_m;
    static int field_k;
    static byte[][] field_l;
    static java.security.SecureRandom field_n;

    abstract boolean a(int param0);

    abstract Object f(int param0);

    public static void a(byte param0) {
        field_l = null;
        field_n = null;
        if (param0 != 98) {
            field_k = -92;
        }
    }

    pb(int param0) {
        ((pb) this).field_m = param0;
    }

    static {
    }
}
