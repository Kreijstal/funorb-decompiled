/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_a;
    static sna field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, boolean param2, byte param3) {
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (param1 != -1) {
          if (-3 != param1) {
            if (-2 != param1) {
              if (!param2) {
                eg.field_p[param1].l(9);
                if (param3 < 13) {
                  cf.a(-81);
                  return;
                } else {
                  return;
                }
              } else {
                jm.a(false, true);
                dg.g(0, 0, 640, 480);
                eg.field_p[param1].l(9);
                if (param3 < 13) {
                  cf.a(-81);
                  return;
                } else {
                  return;
                }
              }
            } else {
              dg.d();
              if (param3 < 13) {
                cf.a(-81);
                return;
              } else {
                return;
              }
            }
          } else {
            jm.a(param0, true);
            if (param3 < 13) {
              cf.a(-81);
              return;
            } else {
              return;
            }
          }
        } else {
          jm.a(param0, true);
          if (param3 < 13) {
            cf.a(-81);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_a = "OUT";
    }
}
