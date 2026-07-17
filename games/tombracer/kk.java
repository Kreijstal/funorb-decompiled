/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 120) {
            String discarded$0 = kk.a(26);
        }
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
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = "(" + vua.field_B + " " + hla.field_xb + " " + ufa.field_c + ") " + oka.field_z;
        if (uca.field_d > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              if (uca.field_d <= var2) {
                break L1;
              } else {
                var7 = var1 + 32;
                var3 = vc.field_q.field_g[var2] & 255;
                var4 = var3 >> 4;
                var10 = 10;
                var9 = var4;
                if (var5 != 0) {
                  if (var9 != var10) {
                    return null;
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
                      if (var3 < 10) {
                        break L5;
                      } else {
                        var3 += 55;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 48;
                    break L4;
                  }
                  var8 = var7 + (char)var4;
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
            if (param0 != 32) {
              return null;
            } else {
              return var1;
            }
          }
        } else {
          if (param0 != 32) {
            return null;
          } else {
            return var6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Find opponents";
    }
}
