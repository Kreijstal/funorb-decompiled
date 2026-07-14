/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpa extends rqa {
    static String field_o;
    static faa field_p;
    static String field_q;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        wva.b((byte) -66);
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((dpa) this).a((nc[]) null, 30);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_q = null;
        field_p = null;
        if (param0) {
            field_o = null;
        }
    }

    dpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Ignore";
        field_q = "Password: ";
    }
}
