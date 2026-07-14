/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hja extends rqa {
    static String field_p;
    static byte[][] field_o;

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(21, 62, param0[0].a(10));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((hja) this).a((nc[]) null, 102);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 21) {
            hja.a(0);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static void a(int param0, int[] param1) {
        try {
            ml discarded$1 = qia.a(param0 + 1, param1);
            // ifeq L37
            Object var3 = null;
            hja.a(-95, (int[]) null);
        } catch (Exception exception) {
            gna.a((Throwable) (Object) exception, "Failed to set cookie ship", param0 + 0);
            return;
        }
        mgb.field_o = false;
        wba.field_o = param1;
    }

    hja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
