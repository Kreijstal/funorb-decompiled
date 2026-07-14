/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd {
    static java.applet.Applet field_c;
    static int field_a;
    static String field_d;
    static String field_b;

    public static void b(int param0) {
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    abstract void a(wk param0, int param1);

    final static boolean a(byte param0, String param1) {
        if (param1 != null) {
          if (param1.length() >= bm.field_f) {
            if (param1.length() <= dd.field_d) {
              if (param0 >= -50) {
                bd.b(117);
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    abstract ch a(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_d = "The following settings need to be changed:  ";
        field_b = "To server list";
    }
}
