/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pe extends ec {
    static String field_m;
    int field_o;
    static volatile boolean field_n;

    final static boolean a(byte param0) {
        if (param0 > -65) {
            return false;
        }
        if (null == fc.field_l) {
            return false;
        }
        if (!fc.field_l.b((byte) -91)) {
            return false;
        }
        return true;
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 < 66) {
            pe.f(-38);
        }
    }

    abstract Object h(int param0);

    pe(int param0) {
        ((pe) this).field_o = param0;
    }

    abstract boolean g(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = false;
    }
}
