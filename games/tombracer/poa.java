/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class poa extends hga {
    static String field_p;

    public static void c(byte param0) {
        if (param0 != 112) {
            poa.c((byte) -30);
            field_p = null;
            return;
        }
        field_p = null;
    }

    poa(int param0) {
        this(mj.field_J, param0);
    }

    final String d(int param0, ae param1) {
        if (param0 != -4) {
            return null;
        }
        return cka.a('*', param1.field_o.length(), -59);
    }

    private poa(il param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Baroness";
    }
}
