/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends ek {
    static String field_M;
    int field_O;
    static ri[] field_N;
    static String field_P;
    static boolean field_L;

    public static void b(boolean param0) {
        field_N = null;
        field_M = null;
        if (!param0) {
            field_P = null;
            field_P = null;
            return;
        }
        field_P = null;
    }

    final void h(int param0) {
        if (param0 <= 30) {
            sh.b(false);
        }
    }

    final boolean a(pa param0, int param1) {
        if (!(param0.field_Q != param1)) {
            return false;
        }
        int var3 = param0.e((byte) -112) + -((sh) this).e((byte) -112);
        int var4 = param0.g(1829947600) + -((sh) this).g(1829947600);
        int var5 = var4 * var4 + var3 * var3;
        return var5 < 3600 ? true : false;
    }

    sh(int param0, int param1) {
        super(param0, param1, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "";
        field_M = "Login: ";
    }
}
