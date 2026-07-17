/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    byte field_f;
    static String field_h;
    short field_e;
    static int field_c;
    static int field_b;
    byte field_g;
    static int field_a;
    va field_d;

    final static java.awt.Container b() {
        if (null != rla.field_x) {
            return (java.awt.Container) (Object) rla.field_x;
        }
        return (java.awt.Container) (Object) di.a(29);
    }

    public static void a() {
        field_h = null;
    }

    tj(va param0, int param1, int param2, int param3) {
        try {
            ((tj) this).field_g = (byte)param3;
            ((tj) this).field_e = (short)param1;
            ((tj) this).field_d = param0;
            ((tj) this).field_f = (byte)param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "tj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 360;
        field_a = 4;
    }
}
