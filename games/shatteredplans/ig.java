/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static String field_b;
    static s field_a;
    static int[] field_c;
    static int field_d;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 <= 87) {
            field_d = 79;
        }
    }

    final static boolean a(bc param0, int param1, bc param2, bc param3) {
        if (param1 == -7526) {
          if (param0.b((byte) 114)) {
            if (param0.a("commonui", -51)) {
              if (param2.b((byte) 113)) {
                if (param2.a("commonui", -116)) {
                  if (param3.b((byte) 107)) {
                    if (!param3.a("button.gif", param1 + 7620)) {
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
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0) {
        le.field_e.k(81);
        if (param0 == 7655) {
          if (ed.field_h == null) {
            ed.field_h = new eo(le.field_e, tl.field_z);
            le.field_e.a(true, (vg) (Object) ed.field_h);
            return;
          } else {
            le.field_e.a(true, (vg) (Object) ed.field_h);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please check if address is correct";
        field_a = new s();
    }
}
