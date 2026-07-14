/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gka extends rqa {
    static dfa field_o;
    static kb field_p;
    static int field_q;

    gka(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          gka.a(16);
          si.a(104, 62, param0[0].a(19));
          return new nc((Object) (Object) "void");
        } else {
          si.a(104, 62, param0[0].a(19));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 > -103) {
            gka.a(-5);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new dfa();
        field_q = 256;
        field_p = new kb(1);
    }
}
