/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends rqa {
    static String field_o;
    static llb field_p;

    final static int[] a(int param0, boolean param1, int[] param2, byte param3) {
        if (param3 != -14) {
          field_o = null;
          return nra.a(false, param2, param0, 28849, param1);
        } else {
          return nra.a(false, param2, param0, 28849, param1);
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 <= 47) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        qoa.field_o = param0[0].a(13);
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) "void");
    }

    qi(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unpacking graphics";
    }
}
