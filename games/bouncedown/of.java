/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static String field_a;
    static String[] field_d;
    static bc field_b;
    static int field_c;

    final static void a(boolean param0, boolean param1, byte param2) {
        int var3 = 0;
        if (param0) {
          na.a(0, 0, na.field_e, na.field_k, 0, 192);
          pj.a(param0, 1);
          var3 = -128 / ((param2 - 41) / 34);
          return;
        } else {
          na.a();
          pj.a(param0, 1);
          var3 = -128 / ((param2 - 41) / 34);
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            field_b = (bc) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"All scores", "My scores", "Best each"};
        field_b = new bc();
    }
}
