/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends rqa {
    static int field_p;
    static char field_r;
    static mab field_q;
    static String field_o;

    public static void a(int param0) {
        if (param0 != 37) {
            field_r = 'ﾇ';
            field_q = null;
            field_o = null;
            return;
        }
        field_q = null;
        field_o = null;
    }

    jl(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((jl) this).a((nc[]) null, 78);
          si.a(37, 62, param0[0].a(102));
          return new nc((Object) (Object) "void");
        } else {
          si.a(37, 62, param0[0].a(102));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Add condition (Ship spawned on team)";
    }
}
