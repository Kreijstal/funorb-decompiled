/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends tc {
    static qj field_u;
    static bc field_v;

    wg(int param0) {
        this(sg.field_a, param0);
    }

    final String a(boolean param0, lk param1) {
        if (!param0) {
          field_u = null;
          return dg.a(param1.field_h.length(), '*', -13810);
        } else {
          return dg.a(param1.field_h.length(), '*', -13810);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
          if (dh.field_a != null) {
            if (!pj.field_a.b(-80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = wg.b(false);
          if (dh.field_a != null) {
            if (!pj.field_a.b(-80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void b(int param0) {
        field_u = null;
        field_v = null;
        if (param0 != 13922) {
            field_u = null;
        }
    }

    private wg(tj param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new qj();
    }
}
