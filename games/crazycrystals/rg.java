/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_b;
    static String field_c;
    static int[] field_a;

    final static ce a(String param0, byte param1) {
        String var2 = null;
        ce var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = CrazyCrystals.field_B;
        if (me.field_f != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var7 = (CharSequence) (Object) param0;
              var2 = fe.a(60136, var7);
              if (var2 != null) {
                var3 = (ce) (Object) me.field_f.a((long)var2.hashCode(), true);
                var4 = -77 % ((-63 - param1) / 52);
                L0: while (true) {
                  if (var3 != null) {
                    var8 = (CharSequence) (Object) var3.field_fb;
                    var5 = fe.a(60136, var8);
                    if (var5.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (ce) (Object) me.field_f.b(50);
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        dj.field_t = false;
        if (param2 == -257) {
          qd.field_q = false;
          if (sp.field_a != null) {
            if (sp.field_a.field_C) {
              L0: {
                if ((param1 ^ -1) == -9) {
                  L1: {
                    param1 = 2;
                    if (!ne.field_d) {
                      param0 = al.field_d;
                      break L1;
                    } else {
                      param0 = cb.field_r;
                      break L1;
                    }
                  }
                  mk.field_b.a(jd.field_G, (byte) 61);
                  break L0;
                } else {
                  break L0;
                }
              }
              L2: {
                var3 = 1;
                if (-11 == (param1 ^ -1)) {
                  var3 = 0;
                  gh.f((byte) -10);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var3 != 0) {
                  L4: {
                    if (!qd.field_q) {
                      break L4;
                    } else {
                      param0 = ci.a(new String[1], am.field_a, param2 + 260);
                      break L4;
                    }
                  }
                  L5: {
                    if (ud.field_U) {
                      param0 = be.field_a;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  sp.field_a.a(param1, 1833, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              if (-257 != (param1 ^ -1)) {
                if (param1 != 10) {
                  if (ne.field_d) {
                    return;
                  } else {
                    mk.field_b.e((byte) 86);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "If you do nothing the game will revert to normal view in <%0> second.";
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
