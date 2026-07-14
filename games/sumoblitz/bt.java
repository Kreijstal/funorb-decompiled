/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bt extends pt {
    static int field_d;
    static hr field_e;
    static volatile long field_f;

    public static void c(byte param0) {
        if (param0 != -21) {
            field_f = 90L;
            field_e = null;
            return;
        }
        field_e = null;
    }

    private bt() throws Throwable {
        throw new Error();
    }

    final static boolean b(int param0) {
        if (param0 <= 64) {
            return false;
        }
        return !ut.field_o.a(true) ? true : false;
    }

    final static uw a(boolean param0) {
        if (param0) {
            field_e = null;
            return (uw) (Object) new fd();
        }
        return (uw) (Object) new fd();
    }

    abstract hp b(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0L;
    }
}
