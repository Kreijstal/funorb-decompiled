/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends ksa {
    int field_g;
    int field_f;
    static gd[] field_d;
    static String[] field_e;

    public static void c() {
        field_d = null;
        field_e = null;
        int var1 = -11;
    }

    final static void a(String param0, int param1, boolean param2) {
        try {
            rg.field_b = true;
            kmb.field_c = param2 ? true : false;
            hwa.field_o = new os(klb.field_r, vob.field_r, param0, tla.field_c, kmb.field_c);
            if (param1 >= -119) {
                field_d = null;
            }
            klb.field_r.a(false, (shb) (Object) hwa.field_o);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "fa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private fa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new gd[109];
        field_e = new String[]{"BAASAicADQESAg--BR4AHgEPAR4AD-8HIwkeAR4AD-8MJgIeAA--Aw8EEgUNDhIPDRANEQ0", "BwENAiYADQENAg0DGwQbBRsDGwUqBh8AGQEN-wcqCCoJHwANARn-CioMGw0nABsBGwIbAw0EDQUNDg0QLQ", "AwEeAQ8EIgANAQ0CHgAsAQ8EGwUN-wUNBg0HDQgNCSIAGwIeAA8BLAMNBA0GDQweAA--Dg8PDw", "BQANAycADQENAx4AGAEnAC0BDQQYBRgEDQUNBRAJIw0QDyYADQENAh4AJgAYARgEDQUtARgEDQUNEg0", "BgANAi0DHwAXAScBDQINAx4AGgENBRf-BCEAFwIX-wUfACYAFwIeAA0BGgMNBA3-ARf-Bi0IDQkuCi4LDQ"};
    }
}
