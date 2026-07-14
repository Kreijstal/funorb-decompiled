/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ewa extends rqa {
    static String field_o;

    ewa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc(bhb.field_g);
    }

    public static void b(boolean param0) {
        if (param0) {
            ewa.b(true);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
