/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lba extends rqa {
    static String field_o;

    lba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
            return new nc(wkb.field_c);
        }
        return new nc(wkb.field_c);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 != 49) {
            field_o = null;
        }
    }

    final static void a(int param0) {
        rg.field_b = false;
        tla.field_c = false;
        cea.a(-86, param0);
        lrb.field_b = kla.field_d;
        dn.field_r = kla.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
