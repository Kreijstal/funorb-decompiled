/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static int[] field_c;
    static int[] field_a;
    static boolean field_b;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 255) {
            ck.b(97);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        var1 = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
        if (bb.field_i > 0) {
          var1 = var1 + ":";
          var2 = 0;
          L0: while (true) {
            if (bb.field_i <= var2) {
              if (param0 != -13299) {
                String discarded$2 = ck.a(-82);
                return var1;
              } else {
                return var1;
              }
            } else {
              L1: {
                var1 = var1 + ' ';
                var3 = 255 & id.field_b.field_m[var2];
                var4 = var3 >> 4;
                if (var4 < 10) {
                  var4 += 48;
                  break L1;
                } else {
                  var4 += 55;
                  break L1;
                }
              }
              L2: {
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (10 <= var3) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var1 = var1 + (char)var3;
              var2++;
              continue L0;
            }
          }
        } else {
          if (param0 == -13299) {
            return var1;
          } else {
            String discarded$3 = ck.a(-82);
            return var1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{20, 0, 0, 10, 0, 0, 0, 0, 0, 0};
        field_c = new int[4];
    }
}
