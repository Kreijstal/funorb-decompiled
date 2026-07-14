/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qmb extends rqa {
    static String field_o;
    static int field_p;
    static int field_q;

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -113) {
            boolean discarded$0 = qmb.a(-93);
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((qmb) this).a((nc[]) null, 34);
          return new nc((Object) (Object) frb.a(121, 81));
        } else {
          return new nc((Object) (Object) frb.a(121, 81));
        }
    }

    qmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        if (!(nna.field_C == null)) {
            return nna.field_C.a(pma.field_o, jl.field_r, -40);
        }
        if (param0 != -22029) {
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Increases your manoeuvrability";
        field_p = 1;
    }
}
