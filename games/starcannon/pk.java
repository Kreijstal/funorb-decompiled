/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static rk field_a;
    static hl field_e;
    static int field_c;
    static String field_b;
    static int[] field_d;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 != 4) {
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        ea.a(-123);
        if (param0 != -64) {
            pk.a((byte) 86);
            fd.a(4, 0);
            return;
        }
        fd.a(4, 0);
    }

    final static void b(int param0) {
        if (!ai.field_c) {
            throw new IllegalStateException();
        }
        sh.field_t = true;
        ma.a(true, 0);
        bl.field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rk();
        field_d = new int[4];
        field_b = "Invalid password.";
    }
}
