/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pva extends uj {
    static llb field_d;
    static String field_e;
    static String field_f;
    static int field_g;

    final int a(int param0) {
        if (param0 != -1) {
            return -73;
        }
        return ktb.field_r;
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_g = 34;
            return true;
        }
        return true;
    }

    final int b(byte param0) {
        if (param0 <= 79) {
            field_d = null;
            return 109;
        }
        return 109;
    }

    final boolean c(byte param0) {
        if (param0 > -104) {
            field_g = -68;
            return true;
        }
        return true;
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 109) {
            field_d = null;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    final int d(byte param0) {
        if (param0 != 64) {
            boolean discarded$0 = ((pva) this).c((byte) -72);
            return oq.field_t;
        }
        return oq.field_t;
    }

    pva() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Set up new unrated game";
    }
}
