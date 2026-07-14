/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ufa extends rqa {
    static char[] field_p;
    static boolean field_o;

    public static void a(int param0) {
        int var1 = 37 / ((-33 - param0) / 54);
        field_p = null;
    }

    ufa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc(sva.field_m);
    }

    final static void a(ds param0, byte param1, java.math.BigInteger param2, java.math.BigInteger param3, ds param4) {
        if (param1 >= -95) {
            return;
        }
        fab.a(0, param4.field_e, param0, param4.field_h, param3, (byte) 47, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
        field_p = new char[]{(char)91, (char)93, (char)35};
    }
}
