/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static bd field_d;
    static ll field_f;
    static int field_j;
    static String[] field_c;
    static na field_e;
    static bd field_g;
    static fd field_b;
    static int field_i;
    static long field_h;
    static bd field_a;

    final static String a(byte param0) {
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
        var5 = HostileSpawn.field_I ? 1 : 0;
        var6 = "(" + bj.field_f + " " + ae.field_u + " " + ne.field_o + ") " + wa.field_k;
        if (jd.field_q > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              if (var2 >= jd.field_q) {
                break L1;
              } else {
                var7 = var1 + 32;
                var3 = 255 & sc.field_g.field_n[var2];
                var4 = var3 >> 4;
                var10 = 10;
                var9 = var4;
                if (var5 != 0) {
                  if (var9 >= var10) {
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  L2: {
                    L3: {
                      if (var9 >= var10) {
                        break L3;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 55;
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
            if (param0 >= -121) {
              return null;
            } else {
              return var1;
            }
          }
        } else {
          if (param0 >= -121) {
            return null;
          } else {
            return var6;
          }
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_d = null;
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != -105) {
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_c = new String[16];
        field_i = -1;
        field_f = new ll();
    }
}
