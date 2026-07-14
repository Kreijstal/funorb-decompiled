/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cha extends rqa {
    static boolean field_o;
    static int field_p;
    static dka field_q;
    static String field_r;

    cha(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(48, 62, param0[0].a(93));
        if (param1 >= -119) {
          field_o = false;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        int var1 = 23 / ((param0 - -46) / 55);
        field_r = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_p = 1024;
        field_q = new dka(0);
        field_r = "Add action (Add body info to custom variable)";
    }
}
