/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static double field_b;
    static String field_e;
    static String field_f;
    static int field_d;
    static int field_a;
    static int[] field_c;

    final static void a(int param0) {
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ck var7 = null;
        ck var8 = null;
        ck var8_ref = null;
        ck var9 = null;
        var5 = client.field_A ? 1 : 0;
        hk.f(243, 197, 369, 143, 16777215);
        hk.a(244, 198, 367, 141, 0);
        if (null != d.field_h) {
          L0: {
            var7 = d.field_h[wh.field_a];
            var8 = var7;
            var8 = var7;
            if (var7 != null) {
              var7.c(245, 199);
              break L0;
            } else {
              if (null != bn.field_g) {
                int discarded$3 = bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            var2 = -96 / ((param0 - -79) / 41);
            if (ac.field_F >= dk.field_i) {
              break L1;
            } else {
              var8_ref = d.field_h[bh.field_m];
              if (var8_ref == null) {
                break L1;
              } else {
                var3_int = (var8_ref.field_K - -60) * ac.field_F / dk.field_i;
                var4 = -30 + var3_int;
                if (lb.field_b) {
                  bn.a((byte) -112, var4 * -256 / 30, (var8_ref.field_K - var4) * 256 / 30, 199, var8_ref, 245);
                  break L1;
                } else {
                  bn.a((byte) -115, (var8_ref.field_K + -var4) * 256 / 30, -256 * var4 / 30, 199, var8_ref, 245);
                  break L1;
                }
              }
            }
          }
          L2: {
            if (bn.field_g == null) {
              break L2;
            } else {
              var3 = null;
              var6 = 0;
              var4 = var6;
              L3: while (true) {
                if (var6 >= d.field_h.length) {
                  if (var3 == null) {
                    break L2;
                  } else {
                    int discarded$4 = bn.field_g.a("Screenshot(s) " + var3 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                    break L2;
                  }
                } else {
                  var9 = d.field_h[var6];
                  if (var9 != null) {
                    L4: {
                      if (365 != var9.field_K) {
                        break L4;
                      } else {
                        if (var9.field_C != 139) {
                          break L4;
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                    if (var3 != null) {
                      var3 = var3 + ", " + var6;
                      var6++;
                      continue L3;
                    } else {
                      var3 = Integer.toString(var6);
                      var6++;
                      continue L3;
                    }
                  } else {
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
          return;
        } else {
          L5: {
            if (null == bn.field_g) {
              break L5;
            } else {
              int discarded$5 = bn.field_g.a(wf.field_m, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
              break L5;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = -68 / ((16 - param0) / 39);
        field_f = null;
    }

    final static pi a(int param0, int[] param1, pi param2) {
        pi var3 = new pi(0, param0, 0);
        var3.field_b = param2.field_b;
        var3.field_i = param2.field_i;
        var3.field_a = param2.field_a;
        var3.field_g = param2.field_g;
        var3.field_c = param2.field_c;
        var3.field_l = param1;
        var3.field_d = param2.field_d;
        var3.field_k = param2.field_k;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.atan2(1.0, 0.0);
        field_e = "Searching for opponents";
        field_f = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
