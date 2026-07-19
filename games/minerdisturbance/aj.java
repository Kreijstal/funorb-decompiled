/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj implements uj {
    static java.applet.Applet field_d;
    static String field_a;
    static pb[] field_b;
    static ch field_c;

    public final String a(byte param0) {
        int var2 = -82 % ((-33 - param0) / 62);
        return "Scroll Camera to Player";
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 < 87) {
            field_c = (ch) null;
        }
    }

    public final void a(boolean param0) {
        if (param0) {
            aj.b(-107);
            db.field_d = 0;
            kd.field_i = true;
            return;
        }
        db.field_d = 0;
        kd.field_i = true;
    }

    final static Boolean a(int param0) {
        int var2 = 10 % ((param0 - 16) / 60);
        Boolean var1 = mf.field_a;
        mf.field_a = null;
        return var1;
    }

    static {
        field_a = "Press <img=20> to close.";
    }
}
