/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kdb extends rqa {
    static int field_o;

    final static int[] a(int[] param0, int param1, byte param2) {
        if (param2 >= -95) {
            return null;
        }
        return nra.a(false, param0, param1, 28849, false);
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (lua.field_c <= param0) {
            if (param0 <= hab.field_i) {
                param4 = ksa.a(31123, ob.field_j, mt.field_o, param4);
                param1 = ksa.a(31123, ob.field_j, mt.field_o, param1);
                bpa.a(param3, param0, (byte) -25, param4, param1);
            }
        }
        int var5 = 54 % ((param2 - 59) / 49);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        qhb.field_o = param0[0].a(70);
        return new nc((Object) (Object) "void");
    }

    kdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
