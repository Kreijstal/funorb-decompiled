/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static int field_b;
    static int field_c;
    static int[] field_a;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) kb.field_a);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) kb.field_a);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "vm.A(" + (param0 != null ? "{...}" : "null") + 44 + 11631 + 41);
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (!pe.field_r) {
          if (pm.field_a) {
            return cf.a(31077, param0, param3);
          } else {
            if (mp.a(param3, param0, param2 ^ 1899)) {
              return true;
            } else {
              if (param2 == 19466) {
                if (hj.field_b) {
                  return false;
                } else {
                  return gf.a(param0, param1, 69);
                }
              } else {
                return true;
              }
            }
          }
        } else {
          return lq.field_a.a(-88, de.field_f, ji.field_r);
        }
    }

    public static void a(int param0) {
        if (param0 != -586) {
            field_b = 106;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
