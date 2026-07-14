/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static boolean[] field_b;
    int field_a;
    static hd[] field_c;
    static String field_d;
    va field_e;
    static cn field_f;

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        if (param0 != 30) {
          cf.a(45);
          field_c = null;
          field_f = null;
          return;
        } else {
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        nl.field_g.h(param1, param3);
        if (param2 >= 125) {
          L0: {
            if (param0) {
              L1: {
                var4 = jc.field_e % nl.field_g.field_y * 2;
                if (var4 >= nl.field_g.field_y) {
                  var4 = nl.field_g.field_y - (var4 - nl.field_g.field_y);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (10 > var4) {
                var4 = 10;
                rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                break L0;
              } else {
                if (nl.field_g.field_y + -40 < var4) {
                  var4 = -40 + nl.field_g.field_y;
                  rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                  return;
                } else {
                  rk.a(30, 80, var4, 0, param3, param1, 0, 116, nl.field_g);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    cf(va param0, int param1) {
        ((cf) this).field_a = param1;
        ((cf) this).field_e = param0;
    }

    final static fa a(int param0, va param1, int param2) {
        if (param0 != 100) {
          field_c = null;
          return l.a(ni.b(param1, 100, param2), 0);
        } else {
          return l.a(ni.b(param1, 100, param2), 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[]{true, true, true, true, false, false};
        field_d = "3D VIEW: ";
    }
}
