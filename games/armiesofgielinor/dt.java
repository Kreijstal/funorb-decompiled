/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static int field_a;
    static boolean[] field_d;
    static String field_c;
    static java.security.SecureRandom field_b;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != -1) {
            dt.a(5);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (-1 >= (param2 ^ -1)) {
          if (-12 <= (param2 ^ -1)) {
            if (param1 == -24375) {
              L0: {
                if (1 > param3) {
                  break L0;
                } else {
                  if (param3 > bn.a((byte) -84, param2, param0)) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (param1 == 23678) {
          fj.a((java.awt.Component) (Object) param0, (byte) 35);
          dc.a((java.awt.Component) (Object) param0, -37);
          if (om.field_I != null) {
            om.field_I.a((java.awt.Component) (Object) param0, true);
            return;
          } else {
            return;
          }
        } else {
          dt.a(4);
          fj.a((java.awt.Component) (Object) param0, (byte) 35);
          dc.a((java.awt.Component) (Object) param0, -37);
          if (om.field_I == null) {
            return;
          } else {
            om.field_I.a((java.awt.Component) (Object) param0, true);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Quit to website";
    }
}
