/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    static u field_d;
    private static int[] field_b;
    static int field_h;
    static ka[] field_f;
    static ka field_e;
    static ka[][] field_c;
    static boolean field_i;
    static String field_m;
    static String field_g;
    static int[] field_k;
    static int[] field_a;
    private static int[] field_l;
    static int field_n;
    static int field_j;

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        int var1 = -122 / ((40 - param0) / 45);
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_k = null;
        field_l = null;
        field_m = null;
        field_g = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[][] var17 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        var4 = param2;
        var5 = param3 + var4;
        if (param1 > 30) {
          L0: {
            var6 = 2048;
            if (var5 < var6) {
              break L0;
            } else {
              var5 = var5 - var6;
              break L0;
            }
          }
          var7 = -1;
          var17 = pa.field_v[param0];
          var9 = s.field_i[param0];
          var13 = 0;
          var7 = var13;
          L1: while (true) {
            if (var9 > var13) {
              L2: {
                var10 = 32 * var17[var13][0];
                if (var10 < var6) {
                  break L2;
                } else {
                  var10 = var10 - var6;
                  break L2;
                }
              }
              L3: {
                var11 = (var17[var13][1] - -1) * 32;
                if (var6 <= var11) {
                  var11 = var11 - var6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var10 > var11) {
                  break L4;
                } else {
                  if (var4 > var5) {
                    break L4;
                  } else {
                    if (var10 <= var5) {
                      if (var4 <= var11) {
                        return var13;
                      } else {
                        var13++;
                        var13++;
                        continue L1;
                      }
                    } else {
                      var13++;
                      var13++;
                      continue L1;
                    }
                  }
                }
              }
              L5: {
                if (var10 < var11) {
                  break L5;
                } else {
                  if (var5 < var4) {
                    break L5;
                  } else {
                    L6: {
                      if (var5 >= var10) {
                        break L6;
                      } else {
                        if (var4 <= var11) {
                          break L6;
                        } else {
                          var13++;
                          var13++;
                          continue L1;
                        }
                      }
                    }
                    return var13;
                  }
                }
              }
              if (var11 <= var10) {
                if (var4 >= var5) {
                  return var13;
                } else {
                  var13++;
                  continue L1;
                }
              } else {
                var13++;
                continue L1;
              }
            } else {
              return -1;
            }
          }
        } else {
          return 81;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{240, 240, 240, 240, 240, 240};
        field_h = 0;
        field_g = "Connection lost - attempting to reconnect";
        field_m = "EXCLUSIVE";
        field_c = new ka[3][2];
        field_n = -1;
        field_l = new int[]{96, 96, 96, 96, 96, 96};
        field_i = false;
        field_a = new int[]{field_l[0] + field_b[0] >> 1626538849, field_l[1] + field_b[1] >> -2058231839, field_l[2] + field_b[2] >> 1807388961, field_l[3] - -field_b[3] >> 1177122177, field_l[4] - -field_b[4] >> -1139605151, field_b[5] + field_l[5] >> 2006380481};
        field_j = 2;
        field_k = new int[]{-field_l[0] + field_b[0] >> 481525185, field_b[1] - field_l[1] >> 432480833, field_b[2] - field_l[2] >> 1409236449, field_b[3] - field_l[3] >> -1232959775, field_b[4] + -field_l[4] >> 2112182337, field_b[5] - field_l[5] >> -73940127};
    }
}
