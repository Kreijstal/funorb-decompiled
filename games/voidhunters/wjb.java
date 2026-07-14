/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wjb extends rqa {
    static int field_p;
    static char[] field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = -26;
          si.a(204, 62, param0[0].a(66));
          return new nc((Object) (Object) "void");
        } else {
          si.a(204, 62, param0[0].a(66));
          return new nc((Object) (Object) "void");
        }
    }

    final static phb[] a(asb param0, boolean param1, String param2, String param3) {
        int var4 = param0.b(param2, -94);
        int var5 = param0.a(param1, var4, param3);
        return pib.a(param0, var5, var4, 0);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 235) {
            wjb.a(-82);
        }
    }

    final static int e(int param0) {
        if (param0 != 204) {
            field_p = 19;
            return (int)(1000000000L / asa.field_c);
        }
        return (int)(1000000000L / asa.field_c);
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, int param4, int param5, boolean param6, boolean param7, boolean param8, int param9, int param10, int param11) {
        qdb.a(param2, param10, 16777215, param9, param8, param4, param7, param0, -128, param3, param5, param1, param11, param6);
    }

    wjb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
