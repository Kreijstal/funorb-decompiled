/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea extends rqa {
    static int field_o;

    sea(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        hs.a(param2, param5, param1, false, param0, param6, param4, nua.field_p);
        if (param3 != 180) {
            field_o = 96;
        }
    }

    final static int a(int param0) {
        int var1 = 22 / ((52 - param0) / 49);
        return 180;
    }

    final nc a(nc[] param0, int param1) {
        si.a(170, 62, param0[0].a(127));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
    }
}
