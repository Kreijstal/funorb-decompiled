/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    static ed field_a;

    abstract void a(fj param0, byte param1);

    public static void a() {
        field_a = null;
    }

    final static void a(java.applet.Applet param0) {
        try {
            ol.a("", true, param0);
            gq.a(25530, param0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bc.E(" + (param0 != null ? "{...}" : "null") + ',' + 108 + ')');
        }
    }

    abstract gq a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed();
    }
}
