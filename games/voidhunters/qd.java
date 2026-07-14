/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_c;
    static int field_b;
    static int field_d;
    static boolean[] field_a;

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        var2 = param1.getParameter("username");
        if (param0 == 0) {
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if (agb.a(var4, -49) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_b = -84;
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if (agb.a(var3, -49) == 0L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 82 / ((-47 - param0) / 60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Repairing...";
        field_a = new boolean[11];
    }
}
