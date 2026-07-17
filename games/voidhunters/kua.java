/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kua {
    int[] field_b;
    static phb field_a;
    static boolean field_e;
    int[] field_f;
    float[][] field_c;
    int[] field_d;

    final static int a(byte param0) {
        return (kib.field_d << 4) + ((idb.field_p << 2) - -lla.field_h);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 181765988) {
            field_e = false;
        }
    }

    kua(int[] param0, int[] param1, int[] param2, float[][] param3) {
        try {
            ((kua) this).field_b = param1;
            ((kua) this).field_f = param2;
            ((kua) this).field_c = param3;
            ((kua) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kua.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
