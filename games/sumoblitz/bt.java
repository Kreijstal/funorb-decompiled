/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bt extends pt {
    static int field_d;
    static hr field_e;
    static volatile long field_f;

    public static void c() {
        field_e = null;
    }

    private bt() throws Throwable {
        throw new Error();
    }

    final static boolean b() {
        return !ut.field_o.a(true);
    }

    final static uw a() {
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
