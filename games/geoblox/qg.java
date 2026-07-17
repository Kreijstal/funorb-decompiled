/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_e;
    static int field_a;
    int field_c;
    static int field_d;
    static String field_b;

    public static void a() {
        field_b = null;
        field_e = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    qg(int param0) {
        ((qg) this).field_c = param0;
    }

    final static void b() {
        if (fh.c(-114)) {
            return;
        }
        if (vk.field_b != null) {
            return;
        }
        int discarded$0 = 94;
        int discarded$1 = 4;
        vk.field_b = cf.a();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Level: <%0>";
        field_d = 4;
        field_b = "Password: ";
    }
}
