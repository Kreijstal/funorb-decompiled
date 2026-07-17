/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends gj {
    static pf field_G;
    static String[] field_x;
    static qc field_y;
    static int field_A;
    static int field_C;
    static String field_z;
    private Object field_B;
    static int field_F;
    static int field_E;
    static String field_D;

    final boolean f(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final Object e(int param0) {
        if (param0 > -114) {
            field_z = null;
            return ((ld) this).field_B;
        }
        return ((ld) this).field_B;
    }

    ld(Object param0, int param1) {
        super(param1);
        try {
            ((ld) this).field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ld.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void g(int param0) {
        field_y = null;
        field_D = null;
        field_z = null;
        field_x = null;
        if (param0 != 13438) {
          ld.g(64);
          field_G = null;
          return;
        } else {
          field_G = null;
          return;
        }
    }

    final static void e(byte param0) {
        wk.field_c = false;
        h.field_c = -1;
        am.field_f = -1;
        hk.field_m = null;
        ki.field_v = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_A = 0;
        field_E = -1;
        field_F = 0;
        field_D = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
