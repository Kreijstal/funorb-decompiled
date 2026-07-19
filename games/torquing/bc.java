/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    static ed field_a;

    abstract void a(fj param0, byte param1);

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -120) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            bc.a((java.applet.Applet) null, (byte) 102);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            if (param1 != 108) {
                field_a = (ed) null;
            }
            ol.a("", true, param0);
            gq.a(25530, param0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract gq a(boolean param0);

    static {
        field_a = new ed();
    }
}
