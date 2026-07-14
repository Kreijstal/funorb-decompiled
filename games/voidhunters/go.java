/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends rqa {
    static ri field_o;
    static int field_p;
    static llb field_q;

    public static void a(int param0) {
        if (param0 != -25544) {
            go.a(-125);
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    go(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((go) this).a((nc[]) null, 106);
          si.a(175, 62, param0[0].a(44));
          return new nc((Object) (Object) "void");
        } else {
          si.a(175, 62, param0[0].a(44));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ri(2, 4, 4, 0);
    }
}
