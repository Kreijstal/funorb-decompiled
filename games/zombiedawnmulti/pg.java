/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_b;
    static cj field_a;
    static String[] field_d;
    static int field_c;

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ep.e();
        na.field_K = new int[260];
        eq.field_g = 11;
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            var5 = 256;
            var1 = var5;
            L1: while (true) {
              if (na.field_K.length <= var5) {
                if (!param0) {
                  return;
                } else {
                  field_d = null;
                  return;
                }
              } else {
                na.field_K[var5] = 255;
                var5++;
                continue L1;
              }
            }
          } else {
            var2 = 15.0;
            na.field_K[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
            var1++;
            continue L0;
          }
        }
    }

    final static gm a(int param0, byte param1, int param2, int param3) {
        Object var5 = null;
        if (param1 >= -65) {
          var5 = null;
          ma discarded$2 = pg.a((String) null, (byte) -66);
          return (gm) (Object) new hg(param0, param3, param2);
        } else {
          return (gm) (Object) new hg(param0, param3, param2);
        }
    }

    final static ma a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param0.length();
        if (param1 < -85) {
          var3 = 0;
          L0: while (true) {
            if (var2 > var3) {
              var4 = param0.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return so.field_t;
            }
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0) {
            return;
        }
        gm discarded$0 = pg.a(77, (byte) -46, -11, 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
