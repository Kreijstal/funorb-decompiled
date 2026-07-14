/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ega extends rqa {
    static int[] field_o;
    static String field_p;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(167, 62, param0[0].a(118));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((ega) this).a((nc[]) null, 32);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 28) {
            ega.e((byte) -51);
        }
    }

    ega(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[]{2, 21, 4, 3, 23, 7};
        field_p = "Connection lost - attempting to reconnect";
    }
}
