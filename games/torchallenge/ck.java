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
        String discarded$2 = null;
        String discarded$3 = null;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var12 = null;
        String var13 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        var6 = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
        var1 = var6;
        if ((bb.field_i ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (bb.field_i <= var2) {
              if (param0 != -13299) {
                discarded$2 = ck.a(-82);
                return var1;
              } else {
                return var1;
              }
            } else {
              L1: {
                var12 = var1 + ' ';
                var3 = 255 & id.field_b.field_m[var2];
                var4 = var3 >> 1509718020;
                if (-11 < (var4 ^ -1)) {
                  var4 += 48;
                  break L1;
                } else {
                  var4 += 55;
                  break L1;
                }
              }
              L2: {
                var3 = var3 & 15;
                var13 = var12 + (char)var4;
                if (10 <= var3) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var1 = var13 + (char)var3;
              var2++;
              continue L0;
            }
          }
        } else {
          if (param0 == -13299) {
            return var1;
          } else {
            discarded$3 = ck.a(-82);
            return var1;
          }
        }
    }

    static {
        field_a = new int[]{20, 0, 0, 10, 0, 0, 0, 0, 0, 0};
        field_c = new int[4];
    }
}
