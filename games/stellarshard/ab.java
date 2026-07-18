/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static int field_a;

    final static he a(int param0, int param1) {
        he var2 = null;
        if (param0 != -5094) {
          return null;
        } else {
          var2 = new he();
          pl.field_W.b(-112, (gg) (Object) var2);
          bf.a(param1, (byte) -59);
          return var2;
        }
    }

    final static void a(pf param0, boolean param1, int param2, hl param3) {
        try {
            tc.field_p = param2 * ea.f((byte) -106) / 1000;
            hj.a(param0, 23987);
            ae.a(36, param0);
            k.a(param0, 3);
            lk.e(25536);
            th.a((byte) -84);
            ni.field_d = 0 - tc.field_p;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ab.B(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 500;
    }
}
