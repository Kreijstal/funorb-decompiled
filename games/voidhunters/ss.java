/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends rqa {
    static ds field_p;
    static llb field_o;

    ss(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        if (param1 != 16) {
            return;
        }
        smb.a(param2, 0, param0.length + -1, (byte) -79, param0);
    }

    public static void a(int param0) {
        if (param0 != 169) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          ss.a(58);
          si.a(169, 62, param0[0].a(42));
          return new nc((Object) (Object) "void");
        } else {
          si.a(169, 62, param0[0].a(42));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ds(256);
    }
}
