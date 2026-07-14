/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bc {
    static ed field_a;

    abstract void a(fj param0, byte param1);

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -120) {
            Object var2 = null;
            bc.a((java.applet.Applet) null, (byte) 102);
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        if (param1 != 108) {
          field_a = null;
          ol.a("", true, param0);
          gq.a(25530, param0);
          return;
        } else {
          ol.a("", true, param0);
          gq.a(25530, param0);
          return;
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
