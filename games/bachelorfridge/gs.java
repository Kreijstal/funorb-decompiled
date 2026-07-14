/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gs {
    sna field_h;
    int field_b;
    boolean field_i;
    int field_m;
    int field_p;
    static eaa field_l;
    int field_j;
    String field_k;
    String field_g;
    String field_n;
    static saa field_f;
    int field_d;
    long field_a;
    static int[] field_c;
    int[] field_o;
    String field_e;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            return;
        }
        field_f = null;
        field_l = null;
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        var2 = param1.length;
        var3 = new byte[var2];
        bl.a(param1, 0, var3, 0, var2);
        if (param0 < 118) {
          gs.a(-47);
          return var3;
        } else {
          return var3;
        }
    }

    final int a(byte param0) {
        if (!((gs) this).field_i) {
          if (((gs) this).field_p != -3) {
            if ((((gs) this).field_a ^ -1L) == (ge.field_F ^ -1L)) {
              return 1;
            } else {
              if (-3 != (um.field_c ^ -1)) {
                if (param0 < 117) {
                  ((gs) this).field_h = null;
                  return 0;
                } else {
                  return 0;
                }
              } else {
                if (!gl.a(3, ((gs) this).field_g)) {
                  if (param0 < 117) {
                    ((gs) this).field_h = null;
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (-1 >= ((gs) this).field_b) {
              if ((((gs) this).field_a ^ -1L) == (ge.field_F ^ -1L)) {
                return 1;
              } else {
                if (-3 != (um.field_c ^ -1)) {
                  if (param0 < 117) {
                    ((gs) this).field_h = null;
                    return 0;
                  } else {
                    return 0;
                  }
                } else {
                  if (!gl.a(3, ((gs) this).field_g)) {
                    if (param0 < 117) {
                      ((gs) this).field_h = null;
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    gs(boolean param0) {
        ((gs) this).field_m = ad.field_g;
        ((gs) this).field_i = gq.field_x;
        ((gs) this).field_e = gba.field_yb;
        ((gs) this).field_b = vv.field_d;
        ((gs) this).field_k = to.field_a;
        ((gs) this).field_d = laa.field_m;
        ((gs) this).field_g = qia.field_b;
        ((gs) this).field_n = qk.field_n;
        ((gs) this).field_p = wka.field_a;
        ((gs) this).field_j = bna.field_w;
        if (param0) {
            ((gs) this).field_o = hv.field_a;
        } else {
            ((gs) this).field_o = null;
        }
        ((gs) this).field_a = sr.field_a;
    }

    gs(int param0, String param1, int param2, String param3, String param4) {
        ((gs) this).field_k = param3;
        ((gs) this).field_i = true;
        ((gs) this).field_e = param1;
        ((gs) this).field_b = 0;
        ((gs) this).field_a = 0L;
        ((gs) this).field_j = 0;
        ((gs) this).field_o = null;
        ((gs) this).field_d = param2;
        ((gs) this).field_n = param4;
        ((gs) this).field_m = 0;
        ((gs) this).field_g = param1;
        ((gs) this).field_p = param0;
    }

    final static pp a(boolean param0, lu param1) {
        if (!param0) {
            return null;
        }
        int var2 = param1.e((byte) 113);
        return (pp) (Object) new o(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new eaa();
        field_c = new int[24];
    }
}
