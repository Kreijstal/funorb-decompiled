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
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = TorChallenge.field_F ? 1 : 0;
        var6 = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
        var1 = var6;
        if ((bb.field_i ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (bb.field_i <= var2) {
              if (param0 != -13299) {
                ck.a(-82);
                return var1;
              } else {
                return var1;
              }
            } else {
              L1: {
                var7 = var1 + ' ';
                var1 = var7;
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
                var8 = var7 + (char)var4;
                if (10 <= var3) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            }
          }
        } else {
          L3: {
            if (param0 == -13299) {
              break L3;
            } else {
              ck.a(-82);
              break L3;
            }
          }
          return var1;
        }
    }

    static {
        field_a = new int[]{20, 0, 0, 10, 0, 0, 0, 0, 0, 0};
        field_c = new int[4];
    }
}
