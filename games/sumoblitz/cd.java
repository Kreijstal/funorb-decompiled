/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    int field_a;
    int field_b;
    static int field_d;
    int field_e;
    static ri[] field_c;
    static int[] field_f;
    int field_g;

    final static boolean a(boolean param0) {
        if (fq.field_f.a((byte) 91)) {
            fq.field_f.b(0);
            return true;
        }
        field_c = null;
        return false;
    }

    public static void a() {
        field_c = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[4];
    }
}
