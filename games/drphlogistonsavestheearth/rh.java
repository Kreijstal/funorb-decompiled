/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_j;
    static he[] field_l;
    static String field_k;
    static int field_e;
    static nh field_b;
    static boolean field_i;
    static int field_a;
    static he field_h;
    private gi field_g;
    static he[] field_f;
    private vd field_c;
    static String field_d;

    final gi a(byte param0) {
        gi var2 = ((rh) this).field_g;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 >= -66) {
            Object var3 = null;
            rh.a(58, (kc) null, -74);
        }
        ((rh) this).field_g = var2.field_e;
        return var2;
    }

    final gi a(gi param0, byte param1) {
        gi var3 = null;
        if (param1 >= -67) {
            field_l = null;
        }
        if (param0 == null) {
            var3 = ((rh) this).field_c.field_c.field_e;
        } else {
            var3 = param0;
        }
        if (!(((rh) this).field_c.field_c != var3)) {
            ((rh) this).field_g = null;
            return null;
        }
        ((rh) this).field_g = var3.field_e;
        return var3;
    }

    final static void a(int param0, kc param1, int param2) {
        lh var3 = nj.field_p;
        var3.d(param2, -18392);
        var3.c(param1.field_m, (byte) -113);
        if (param0 < 53) {
            field_e = 70;
        }
        var3.c(param1.field_h, -17402);
    }

    final gi a(gi param0, int param1) {
        gi var3 = null;
        if (param1 != -2) {
            return null;
        }
        if (param0 == null) {
            var3 = ((rh) this).field_c.field_c.field_b;
        } else {
            var3 = param0;
        }
        if (var3 == ((rh) this).field_c.field_c) {
            ((rh) this).field_g = null;
            return null;
        }
        ((rh) this).field_g = var3.field_b;
        return var3;
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var3 <= var2) {
                break L1;
              } else {
                if (!je.a(param1.charAt(var2), 90)) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            var4 = 113 / ((60 - param0) / 54);
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!je.a(param1.charAt(var3 - 1), 89)) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var5 = -var2 + var3;
              if (-2 >= (var5 ^ -1)) {
                if ((var5 ^ -1) >= -13) {
                  var6 = new StringBuilder(var5);
                  var7 = var2;
                  L4: while (true) {
                    if (var7 >= var3) {
                      if (var6.length() != 0) {
                        return var6.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var8 = param1.charAt(var7);
                      if (ue.a((char) var8, (byte) 78)) {
                        var9 = lc.a(249, (char) var8);
                        if (var9 != 0) {
                          StringBuilder discarded$1 = var6.append(var9);
                          var7++;
                          continue L4;
                        } else {
                          var7++;
                          continue L4;
                        }
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final gi a(int param0) {
        gi var2 = ((rh) this).field_c.field_c.field_b;
        if (!(((rh) this).field_c.field_c != var2)) {
            ((rh) this).field_g = null;
            return null;
        }
        ((rh) this).field_g = var2.field_b;
        if (param0 > -71) {
            return null;
        }
        return var2;
    }

    rh(vd param0) {
        ((rh) this).field_c = param0;
    }

    final gi c(int param0) {
        gi var2 = ((rh) this).field_c.field_c.field_e;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 != -1) {
            Object var3 = null;
            gi discarded$0 = ((rh) this).a((gi) null, -101);
        }
        ((rh) this).field_g = var2.field_e;
        return var2;
    }

    public static void b(int param0) {
        field_l = null;
        field_f = null;
        field_k = null;
        field_d = null;
        field_h = null;
        field_b = null;
        if (param0 != -2) {
            rh.b(-8);
        }
        field_j = null;
    }

    final gi b(byte param0) {
        gi var2 = ((rh) this).field_g;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 != 87) {
            field_k = null;
        }
        ((rh) this).field_g = var2.field_b;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Quit";
        field_b = null;
    }
}
