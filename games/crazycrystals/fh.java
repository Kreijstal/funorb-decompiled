/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends ln {
    static String field_j;
    static String field_g;
    static String field_h;
    static String field_i;
    static int[] field_k;

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = CrazyCrystals.field_B;
        nb.b();
        if (param0) {
          li.field_c = 11;
          s.field_h = new int[260];
          var1 = 0;
          L0: while (true) {
            if (256 <= var1) {
              var5 = 256;
              var1 = var5;
              L1: while (true) {
                if (var5 < s.field_h.length) {
                  s.field_h[var5] = 255;
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              s.field_h[var1] = (int)(Math.pow((double)((float)var1 / 256.0f), var2) * 255.0);
              var1++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    fh(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static void a(boolean param0, long param1) {
        if (0L >= param1) {
            return;
        }
        if (!param0) {
            field_j = null;
            if (0L == param1 % 10L) {
                g.a((byte) -98, -1L + param1);
                g.a((byte) 6, 1L);
            } else {
                g.a((byte) 112, param1);
                return;
            }
            return;
        }
        if (0L == param1 % 10L) {
            g.a((byte) -98, -1L + param1);
            g.a((byte) 6, 1L);
        } else {
            g.a((byte) 112, param1);
            return;
        }
    }

    public static void a(int param0) {
        field_k = null;
        int var1 = -112 / ((70 - param0) / 52);
        field_i = null;
        field_g = null;
        field_h = null;
        field_j = null;
    }

    final int a(int param0, byte param1) {
        int var3 = 77 % ((55 - param1) / 50);
        return (1 << param0 & ol.field_B) != 0 ? 1 : 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "This is one of you.";
        field_h = "Password: ";
        field_g = "Player names can be up to 12 letters, numbers and underscores";
        field_k = new int[8192];
    }
}
