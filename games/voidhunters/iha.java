/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iha extends rqa {
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 >= -101) {
            field_o = null;
        }
    }

    final static boolean e(int param0) {
        if (param0 != 0) {
            iha.a(-11);
            return bm.field_o.field_k;
        }
        return bm.field_o.field_k;
    }

    final nc a(nc[] param0, int param1) {
        si.a(188, 62, param0[0].a(124));
        if (param1 >= -119) {
          boolean discarded$2 = iha.e(117);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    iha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Connecting to<br>friend server...";
    }
}
