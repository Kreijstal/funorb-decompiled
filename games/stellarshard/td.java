/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int field_d;
    static int field_b;
    static String field_e;
    static String[] field_c;
    static String field_a;

    final static int a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = stellarshard.field_B;
        boolean discarded$12 = na.field_d.a(true, (byte) -123, ll.field_d, gi.field_c);
        na.field_d.f((byte) -127);
        L0: while (true) {
          if (!qh.c(123)) {
            if (-1 != ee.field_a) {
              var1 = ee.field_a;
              rh.a(-1, (byte) -72);
              return var1;
            } else {
              if (param0 < -82) {
                if (!ck.field_db) {
                  if (dj.field_a != el.field_E) {
                    if (al.field_f.a(true)) {
                      if (dj.field_a == o.field_l) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                field_d = -92;
                if (!ck.field_db) {
                  if (dj.field_a != el.field_E) {
                    if (al.field_f.a(true)) {
                      if (dj.field_a == o.field_l) {
                        return 2;
                      } else {
                        return -1;
                      }
                    } else {
                      return 1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              }
            }
          } else {
            boolean discarded$13 = na.field_d.a(gi.field_f, uc.field_b, true);
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 != -17) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 10;
        field_a = "Close";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_e = "Laser";
    }
}
