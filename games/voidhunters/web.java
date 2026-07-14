/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class web extends rqa {
    static String field_p;
    static no field_o;

    final static void a(int param0) {
        vpa var1 = null;
        faa var2 = null;
        if (param0 > -20) {
            web.e((byte) 50);
            if (!(unb.field_o)) {
                return;
            }
            var1 = pba.b(false);
            var2 = new faa(1048576);
            var2.q(-122);
            var1.b(var2, -110);
            var2.r(32712);
            asb.a(var2.field_e, "missions.dat", var2.field_h, -107, "");
            nkb.a(false, "Saved out mission list");
            return;
        }
        if (!(unb.field_o)) {
            return;
        }
        var1 = pba.b(false);
        var2 = new faa(1048576);
        var2.q(-122);
        var1.b(var2, -110);
        var2.r(32712);
        asb.a(var2.field_e, "missions.dat", var2.field_h, -107, "");
        nkb.a(false, "Saved out mission list");
    }

    web(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 < 100) {
            return;
        }
        field_p = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          web.e((byte) 42);
          si.a(91, 62, param0[0].a(107));
          return new nc((Object) (Object) "void");
        } else {
          si.a(91, 62, param0[0].a(107));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Try changing the '<%0>' setting.";
    }
}
