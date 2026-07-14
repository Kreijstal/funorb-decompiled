/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends ki implements ka {
    private pj field_G;
    static int[] field_H;
    private pj field_E;
    static int[] field_D;
    private pj field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((ig) this).field_m;
        int var6 = ((ig) this).field_j + param0;
        int discarded$0 = ua.field_G.a(se.field_z, 20 + var5, 20 + var6, -40 + ((ig) this).field_t, -50 + ((ig) this).field_x, 16777215, -1, 1, param3, ua.field_G.field_F);
        super.a(param0, param1, param2, 0);
    }

    public static void e(byte param0) {
        Object var2 = null;
        field_H = null;
        if (param0 >= -85) {
          var2 = null;
          o discarded$2 = ig.a((o) null, 0, 30, 35, 43, 70);
          field_D = null;
          return;
        } else {
          field_D = null;
          return;
        }
    }

    public ig() {
        super(0, 0, 476, 225, (j) null);
        ((ig) this).field_E = new pj(wk.field_g, (dg) null);
        ((ig) this).field_F = new pj(mf.field_F, (dg) null);
        ((ig) this).field_G = new pj(pf.field_c, (dg) null);
        gh var1 = new gh();
        ((ig) this).field_E.field_w = (j) (Object) var1;
        ((ig) this).field_F.field_w = (j) (Object) var1;
        ((ig) this).field_G.field_w = (j) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -350381631;
        ((ig) this).field_F.b(30, var4, ((ig) this).field_t + -var3 >> -1814233919, 0, -var2 + (-48 + ((ig) this).field_x));
        ((ig) this).field_G.b(30, var4, var2 + ((((ig) this).field_t + -var3 >> 408475841) + var4), 0, -var2 + (-48 + ((ig) this).field_x));
        ((ig) this).field_E.b(30, var3, -var3 + ((ig) this).field_t >> 1254185761, 0, -(2 * var2) + (-78 + ((ig) this).field_x));
        ((ig) this).field_F.field_n = (dg) this;
        ((ig) this).field_E.field_n = (dg) this;
        ((ig) this).field_E.field_z = id.field_b;
        ((ig) this).field_G.field_n = (dg) this;
        ((ig) this).field_G.field_z = a.field_g;
        ((ig) this).a((rc) (Object) ((ig) this).field_F, 5411);
        ((ig) this).a((rc) (Object) ((ig) this).field_E, 5411);
        ((ig) this).a((rc) (Object) ((ig) this).field_G, 5411);
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        if (!super.a(param0, (byte) -106, param2, param3)) {
          if ((param2 ^ -1) == -99) {
            return ((ig) this).a((byte) -122, param3);
          } else {
            var5 = 67 % ((param1 - 31) / 56);
            if ((param2 ^ -1) != -100) {
              return false;
            } else {
              return ((ig) this).b(97, param3);
            }
          }
        } else {
          return true;
        }
    }

    final static void h(int param0) {
        if (param0 > -102) {
            ig.h(102);
        }
    }

    final static o a(o param0, int param1, int param2, int param3, int param4, int param5) {
        o var6 = null;
        if (param1 != 30) {
          return null;
        } else {
          var6 = new o(param4, param5);
          o.a(param0, var6, param3, param2, 0, 0, param4, param5);
          return var6;
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (param2) {
            ig.h(70);
            return cj.a(-69);
        }
        return cj.a(-69);
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        if (param3 != ((ig) this).field_F) {
          if (param3 != ((ig) this).field_E) {
            if (((ig) this).field_G == param3) {
              qk.f(4);
              if (!param4) {
                ig.e((byte) 30);
                return;
              } else {
                return;
              }
            } else {
              if (!param4) {
                ig.e((byte) 30);
                return;
              } else {
                return;
              }
            }
          } else {
            wf.d(350);
            if (param4) {
              return;
            } else {
              ig.e((byte) 30);
              return;
            }
          }
        } else {
          ok.a((byte) 96);
          if (param4) {
            return;
          } else {
            ig.e((byte) 30);
            return;
          }
        }
    }

    final static void a(byte param0) {
        gf.field_cb.c(-3399, (rc) (Object) new ig());
        if (param0 > -31) {
            Object var2 = null;
            o discarded$0 = ig.a((o) null, 122, 9, -53, 119, 102);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = new int[8192];
    }
}
