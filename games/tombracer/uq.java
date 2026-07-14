/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uq implements fo {
    static long field_d;
    static String field_f;
    static int field_a;
    pca field_e;
    static nt field_b;
    static jea field_c;

    final void a(int param0, pca param1) {
        ((uq) this).field_e = param1;
        if (param0 != 30711) {
            uq.b(-92);
        }
    }

    abstract boolean c(int param0);

    public static void b(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 <= 53) {
            uq.b(22);
        }
    }

    public abstract void a(int param0, iq param1);

    final la a(int param0) {
        if (param0 != 10685) {
            return null;
        }
        return ((uq) this).field_e.d(0);
    }

    abstract void a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Show all lobby chat";
        field_b = new nt();
    }
}
