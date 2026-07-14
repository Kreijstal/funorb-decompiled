/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends rqa {
    static dja field_o;
    static String field_p;
    static String field_q;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_q = null;
          si.a(107, 62, param0[0].a(99));
          return new nc((Object) (Object) "void");
        } else {
          si.a(107, 62, param0[0].a(99));
          return new nc((Object) (Object) "void");
        }
    }

    ra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static phb[] a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 < 112) {
          phb[] discarded$2 = ra.a(-19, (byte) -41, -16, 83, 121);
          return hi.a(-972, 1, param4, 3, param3, 1, 1, param2, param0);
        } else {
          return hi.a(-972, 1, param4, 3, param3, 1, 1, param2, param0);
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_p = null;
        field_o = null;
        if (param0 != 107) {
            phb[] discarded$0 = ra.a(-92, (byte) 16, 92, 10, 28);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = (dja) (Object) new qlb();
        field_p = "The match was a draw!";
        field_q = "Options";
    }
}
