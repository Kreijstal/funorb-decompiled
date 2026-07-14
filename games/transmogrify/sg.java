/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static sj field_p;
    int field_f;
    static String field_o;
    static sj field_d;
    int field_i;
    static char field_n;
    String field_h;
    static String field_k;
    static int field_e;
    private String field_m;
    private int field_b;
    private boolean field_g;
    int[] field_j;
    private long field_c;
    int field_l;
    static int[] field_a;

    final int a(boolean param0) {
        Object var3 = null;
        if (param0) {
          if (!((sg) this).field_g) {
            L0: {
              if (-3 != ((sg) this).field_i) {
                break L0;
              } else {
                if (-1 <= (((sg) this).field_b ^ -1)) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if ((((sg) this).field_c ^ -1L) != (ua.field_e ^ -1L)) {
              if ((kl.field_c ^ -1) == -3) {
                if (b.a(((sg) this).field_m, (byte) 24)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          var3 = null;
          int discarded$1 = sg.a(97, (byte) 55, 108, (byte[]) null);
          if (!((sg) this).field_g) {
            if (-3 == (((sg) this).field_i ^ -1)) {
              if (-1 >= ((sg) this).field_b) {
                if ((((sg) this).field_c ^ -1L) != (ua.field_e ^ -1L)) {
                  if (kl.field_c == -3) {
                    if (b.a(((sg) this).field_m, (byte) 24)) {
                      return 1;
                    } else {
                      return 0;
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 2;
              }
            } else {
              if ((((sg) this).field_c ^ -1L) != (ua.field_e ^ -1L)) {
                if (kl.field_c == -3) {
                  if (b.a(((sg) this).field_m, (byte) 24)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          } else {
            return 2;
          }
        }
    }

    final static int a(int param0, byte param1, int param2, byte[] param3) {
        int var7 = Transmogrify.field_A ? 1 : 0;
        int var4 = -1;
        int var5 = param0;
        int var6 = 36 / ((36 - param1) / 45);
        while (param2 > var5) {
            var4 = var4 >>> 1447584872 ^ hi.field_f[255 & (param3[var5] ^ var4)];
            var5++;
        }
        var4 = var4 ^ -1;
        return var4;
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_p = null;
        field_o = null;
        if (param0 > -87) {
          var2 = null;
          int discarded$2 = sg.a(27, (byte) 105, -29, (byte[]) null);
          field_k = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_k = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    sg(boolean param0) {
        ((sg) this).field_g = a.field_bb;
        ((sg) this).field_i = kd.field_a;
        ((sg) this).field_l = u.field_d;
        ((sg) this).field_m = fd.field_i;
        if (param0) {
            ((sg) this).field_j = a.field_T;
        } else {
            ((sg) this).field_j = null;
        }
        ((sg) this).field_f = jd.field_b;
        ((sg) this).field_h = l.field_c;
        ((sg) this).field_c = sj.field_m;
        ((sg) this).field_b = sh.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_e = -1;
        field_k = "Variety bonus:";
        field_a = new int[8192];
    }
}
