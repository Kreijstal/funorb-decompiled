/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends pn implements hh {
    private long field_V;
    private an field_T;
    static String field_X;
    private an field_W;
    private ga field_U;

    nj(dn param0) {
        super(param0, 200, 200);
        ((nj) this).field_V = pd.a(-22826);
        ga var3 = new ga(ag.field_c, (sk) null);
        var3.field_i = ((nj) this).field_i;
        var3.field_n = 100;
        var3.field_j = 50;
        var3.field_k = 0;
        var3.field_h = (io) (Object) new vf(ii.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((nj) this).a(var3, 10);
        ((nj) this).field_U = new ga(ag.field_c, (sk) null);
        ((nj) this).field_U.field_k = 0;
        ((nj) this).field_U.field_j = 20 + var3.field_n + var3.field_j;
        ((nj) this).field_U.field_i = ((nj) this).field_i;
        ((nj) this).field_U.field_n = 80;
        ((nj) this).field_U.field_h = (io) (Object) new vf(rk.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((nj) this).a(((nj) this).field_U, 10);
        ((nj) this).field_T = this.a((byte) 32, (sk) this, ap.field_s);
        ((nj) this).field_W = this.a((byte) 32, (sk) this, ki.field_bb);
    }

    final boolean a(int param0, int param1, ga param2, char param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = -59 % ((-83 - param0) / 32);
        var6 = param1;
        if (var6 != -100) {
          if (-99 != var6) {
            return super.a(-127, param1, param2, param3);
          } else {
            boolean discarded$4 = ((nj) this).field_T.a((byte) 116, (ga) this);
            return true;
          }
        } else {
          boolean discarded$5 = ((nj) this).field_W.a((byte) 115, (ga) this);
          return true;
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          super.a(param0, (byte) 90, param2, param3);
          if (ll.field_a) {
            param0.c((byte) 57);
            break L0;
          } else {
            break L0;
          }
        }
        var5 = pd.a(-22826) - ((nj) this).field_V;
        var7 = (int)((10999L - var5) / 1000L);
        if (0 >= var7) {
          L1: {
            re.a((byte) -71);
            this.g((byte) 35);
            ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, rc.field_h), true);
            var8 = -48 % ((param1 - 46) / 42);
            if (!((nj) this).field_H) {
              break L1;
            } else {
              if (null == cn.field_b) {
                this.g((byte) -108);
                ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                break L1;
              } else {
                if (null != cn.field_b) {
                  if (cn.field_b.field_a) {
                    this.g((byte) -121);
                    ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          if (null != cn.field_b) {
            if (cn.field_b.field_a) {
              this.g((byte) -121);
              ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((nj) this).field_U.field_o = "" + var7;
          var8 = -48 % ((param1 - 46) / 42);
          if (((nj) this).field_H) {
            L2: {
              if (null == cn.field_b) {
                this.g((byte) -108);
                ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != cn.field_b) {
              if (cn.field_b.field_a) {
                this.g((byte) -121);
                ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (null != cn.field_b) {
              if (!cn.field_b.field_a) {
                return;
              } else {
                this.g((byte) -121);
                ((nj) this).field_F.a((ga) (Object) new i(((nj) this).field_F, gf.field_b), true);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final an a(byte param0, sk param1, String param2) {
        an var4 = null;
        int var5 = 0;
        var4 = new an(param2, param1);
        var4.field_h = (io) (Object) new vm();
        if (param0 != 32) {
          ((nj) this).field_T = null;
          var5 = -6 + ((nj) this).field_n;
          ((nj) this).field_n = ((nj) this).field_n + 38;
          var4.a(-88, var5, 15, ((nj) this).field_i - 30, 30);
          ((nj) this).a((ga) (Object) var4, 10);
          ((nj) this).a(true);
          return var4;
        } else {
          var5 = -6 + ((nj) this).field_n;
          ((nj) this).field_n = ((nj) this).field_n + 38;
          var4.a(-88, var5, 15, ((nj) this).field_i - 30, 30);
          ((nj) this).a((ga) (Object) var4, 10);
          ((nj) this).a(true);
          return var4;
        }
    }

    public static void b(boolean param0) {
        field_X = null;
        if (param0) {
            nj.b(false);
        }
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        if (param1 == -6) {
          if (param2 != ((nj) this).field_T) {
            if (param2 != ((nj) this).field_W) {
              return;
            } else {
              re.a((byte) -71);
              this.g((byte) 85);
              return;
            }
          } else {
            this.g((byte) -126);
            return;
          }
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        int var2 = -75 % ((param0 - -62) / 46);
        if (!((nj) this).field_H) {
            return;
        }
        ((nj) this).field_H = false;
    }

    static {
    }
}
