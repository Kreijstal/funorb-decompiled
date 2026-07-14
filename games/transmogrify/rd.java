/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static q field_d;
    static int field_a;
    static int field_f;
    static int[] field_c;
    static String field_b;
    static int[] field_e;

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
            rd.a(true);
        }
        ka.c();
        ug.field_c = new int[260];
        nd.field_m = 11;
        for (var1 = 0; var1 < 256; var1++) {
            var2 = 15.0;
            ug.field_c[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < ug.field_c.length) {
            ug.field_c[var5] = 255;
            var5++;
        }
    }

    final static void a(String param0, boolean param1) {
        hi.a(-23883, param0);
        jj.a(param1, gb.field_c, 1702);
    }

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 > 46) {
          L0: {
            L1: {
              if (bi.field_L < 20) {
                break L1;
              } else {
                if (!pa.b(-120)) {
                  break L1;
                } else {
                  L2: {
                    if (db.field_d <= 0) {
                      break L2;
                    } else {
                      if (Transmogrify.d(false)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 28) {
            return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new q();
        field_c = new int[]{0, 21, 21, 21, 8, 9, 10, 11, 11, 16, 17, 18, 17, 18, 17, 18, 17, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 30, 24, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25, 26, 27, 26, 25, 28, 29, 28, 25};
        field_b = "Player names can be up to 12 letters, numbers and underscores";
        field_f = -1;
    }
}
