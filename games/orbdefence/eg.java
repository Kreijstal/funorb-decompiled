/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends fg {
    static String[] field_w;
    static ki field_x;
    static int field_v;

    final static boolean a(se param0, int param1) {
        if (param1 != 26678) {
            return false;
        }
        return -2 == (param0.h(1, 8) ^ -1) ? true : false;
    }

    final static boolean c(byte param0) {
        if (param0 == -126) {
          if (-21 >= (vh.field_n ^ -1)) {
            if (fe.c((byte) -121)) {
              if (0 < cb.field_j) {
                if (ld.a((byte) 85)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_w = null;
          if (-21 >= (vh.field_n ^ -1)) {
            if (fe.c((byte) -121)) {
              if (0 < cb.field_j) {
                if (ld.a((byte) 85)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_x = null;
        int var1 = -71 / ((param0 - -53) / 62);
        field_w = null;
    }

    private eg(kc param0, int param1) {
        super(param0, param1);
    }

    final static e b(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        var2 = param1.length();
        if (var2 == 0) {
          return oc.field_M;
        } else {
          if ((var2 ^ -1) < -64) {
            return vj.field_c;
          } else {
            var3 = param0;
            L0: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (-1 == vi.field_H.indexOf(var4)) {
                    return ba.field_a;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (-1 == (var3 ^ -1)) {
                      break L1;
                    } else {
                      if (-1 + var2 != var3) {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return ba.field_a;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final String a(byte param0, pj param1) {
        Object var4 = null;
        if (param0 != -95) {
          var4 = null;
          boolean discarded$2 = eg.a((se) null, -102);
          return im.a('*', param1.field_l.length(), 77);
        } else {
          return im.a('*', param1.field_l.length(), 77);
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        if (param1 != 0) {
            return -35;
        }
        return sd.a(0, param0, param2, 0);
    }

    eg(int param0) {
        this(lm.field_f, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[]{"All scores", "My scores", "Best each"};
    }
}
