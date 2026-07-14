/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fsa extends rqa {
    static kba field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((fsa) this).a((nc[]) null, -58);
          si.a(54, 62, param0[0].a(91));
          return new nc((Object) (Object) "void");
        } else {
          si.a(54, 62, param0[0].a(91));
          return new nc((Object) (Object) "void");
        }
    }

    fsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        if (param0 <= 49) {
            fsa.e((byte) -37);
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new kba();
    }
}
