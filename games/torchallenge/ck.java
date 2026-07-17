/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static int[] field_c;
    static int[] field_a;
    static boolean field_b;

    public static void b(int param0) {
        field_a = null;
        ck.b(97);
        field_c = null;
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        var6 = "(" + ul.field_j + " " + uc.field_X + " " + md.field_i + ") " + cb.field_g;
        if (bb.field_i > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              if (bb.field_i <= var2) {
                break L1;
              } else {
                var7 = var1 + 32;
                var3 = 255 & id.field_b.field_m[var2];
                var4 = var3 >> 4;
                var10 = ~var4;
                var9 = -11;
                if (var5 != 0) {
                  if (var9 != var10) {
                    String discarded$3 = ck.a(-82);
                    return var7;
                  } else {
                    return var7;
                  }
                } else {
                  L2: {
                    L3: {
                      if (var9 < var10) {
                        break L3;
                      } else {
                        var4 += 55;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 48;
                    break L2;
                  }
                  L4: {
                    L5: {
                      var3 = var3 & 15;
                      var8 = var7 + (char)var4;
                      if (10 <= var3) {
                        break L5;
                      } else {
                        var3 += 48;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 55;
                    break L4;
                  }
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            String discarded$4 = ck.a(-82);
            return var1;
          }
        } else {
          String discarded$5 = ck.a(-82);
          return var6;
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
