/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qja extends rqa {
    static String field_o;

    qja(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 > -119) {
          var4 = null;
          boolean discarded$2 = qja.a((byte) -89, (String) null);
          si.a(52, 62, param0[0].a(74));
          return new nc((Object) (Object) "void");
        } else {
          si.a(52, 62, param0[0].a(74));
          return new nc((Object) (Object) "void");
        }
    }

    final static boolean a(byte param0, String param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param0 != -75) {
          field_o = null;
          var3 = (CharSequence) (Object) param1;
          return ffb.field_e.equals((Object) (Object) jwa.a(false, var3));
        } else {
          var4 = (CharSequence) (Object) param1;
          return ffb.field_e.equals((Object) (Object) jwa.a(false, var4));
        }
    }

    public static void a(int param0) {
        int var1 = -72 / ((57 - param0) / 50);
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Destroys components on contact";
    }
}
