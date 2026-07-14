/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends cj implements nc, ij {
    private br field_H;
    static int field_P;
    static cr field_G;
    static ej field_N;
    static int[] field_O;
    private d field_L;
    private d field_M;
    oj field_K;
    static er[] field_I;
    static java.awt.Canvas field_F;

    public final void a(int param0) {
        if (param0 != -4384) {
          field_F = null;
          ((hk) (Object) ((ne) this).field_H.a((byte) -5)).h(-1);
          return;
        } else {
          ((hk) (Object) ((ne) this).field_H.a((byte) -5)).h(-1);
          return;
        }
    }

    private final void i(int param0) {
        if (param0 >= -92) {
            ne.c(false);
            if (!(this.k(-76))) {
                return;
            }
            kr.a(((ne) this).field_H.field_w, (byte) -70);
            return;
        }
        if (!(this.k(-76))) {
            return;
        }
        kr.a(((ne) this).field_H.field_w, (byte) -70);
    }

    final static void c(boolean param0) {
        L0: {
          il.field_k = new cr(0L, (cr) null);
          if (db.field_S) {
            il.field_k.b(bf.field_c, 121);
            break L0;
          } else {
            break L0;
          }
        }
        il.field_k.b(im.field_j, 118);
        if (param0) {
          return;
        } else {
          qo.field_D = new lb(fb.field_A, il.field_k);
          ca.field_h = new cr(0L, (cr) null);
          ca.field_h.b((cr) (Object) qo.field_D.field_b, 123);
          ca.field_h.b(vb.field_j, 123);
          jr.a(98);
          return;
        }
    }

    public static void a(byte param0) {
        field_G = null;
        if (param0 >= -106) {
          boolean discarded$2 = ne.j(36);
          field_O = null;
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        } else {
          field_O = null;
          field_N = null;
          field_I = null;
          field_F = null;
          return;
        }
    }

    private final boolean k(int param0) {
        if (!(this.a((ik) (Object) ((ne) this).field_H, true))) {
            return false;
        }
        int var2 = -24 / ((param0 - -7) / 56);
        return true;
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        Object var6 = null;
        if (param0 < 6) {
          var6 = null;
          ((ne) this).a(-59, (d) null, (byte) -25, -54, -33);
          super.a((byte) 122, param1, param2, param3);
          ((ne) this).field_L.field_F = this.k(-94);
          return;
        } else {
          super.a((byte) 122, param1, param2, param3);
          ((ne) this).field_L.field_F = this.k(-94);
          return;
        }
    }

    private final int a(int param0, int param1, String param2, int param3, int param4, String param5, iq param6) {
        mg var10 = new mg(20, param0, 120 + param1, 25, param6, false, 120, 3, qc.field_x, 16777215, param2);
        ((ne) this).c((byte) -78, (iq) (Object) var10);
        qe var9 = new qe(((ik) (Object) param6).a((byte) -5), param5, 126, param0 - -var10.field_s, param1 - param3, param4);
        var9.field_v = (uf) this;
        ((ne) this).c((byte) 104, (iq) (Object) var9);
        return var10.field_s + var9.field_s;
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        if (param1 != ((ne) this).field_M) {
          if (param1 == ((ne) this).field_L) {
            this.i(-95);
            var6 = -68 / ((param2 - -63) / 51);
            return;
          } else {
            var6 = -68 / ((param2 - -63) / 51);
            return;
          }
        } else {
          sd.f((byte) -1);
          var6 = -68 / ((param2 - -63) / 51);
          return;
        }
    }

    private final int a(String param0, String param1, iq param2, int param3, int param4, boolean param5) {
        if (param5) {
          field_O = null;
          return this.a(param4, param3, param0, -25, 35, param1, param2);
        } else {
          return this.a(param4, param3, param0, -25, 35, param1, param2);
        }
    }

    public final void a(String param0, int param1) {
        br var3 = null;
        String var4 = null;
        var3 = ((ne) this).field_H;
        if (param1 != 4944) {
          boolean discarded$2 = this.k(-123);
          var4 = param0;
          ((kp) (Object) var3).a(var4, -86, false);
          return;
        } else {
          var4 = param0;
          ((kp) (Object) var3).a(var4, -86, false);
          return;
        }
    }

    public ne() {
        super(0, 0, 496, 0, (ur) null);
        ((ne) this).field_H = new br("", (uf) null, 12);
        va var1 = new va(bl.field_N, 0, 0, 0, 0, 16777215, -1, 3, 0, qc.field_x.field_z, -1, 2147483647, true);
        iq var2 = new iq(km.field_v, (ur) (Object) var1, (uf) null);
        ((ne) this).field_L = new d(bm.field_y, (uf) null);
        ((ne) this).field_M = new d(mp.field_c, (uf) null);
        ((ne) this).field_H.field_q = ho.field_d;
        ((ne) this).field_H.a(true, (of) (Object) new hk((kp) (Object) ((ne) this).field_H));
        ((ne) this).field_L.field_F = false;
        ((ne) this).field_L.field_B = (ur) (Object) new vo();
        ((ne) this).field_M.field_B = (ur) (Object) new jc();
        ((ne) this).field_H.field_B = (ur) (Object) new ml(10000536);
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(false, 20, var3, 50, 270);
        var3 += 50;
        ((ne) this).c((byte) -117, var2);
        var3 = var3 + (this.a(kd.field_q, jg.field_m, (iq) (Object) ((ne) this).field_H, 170, var3, false) - -5);
        ((ne) this).field_L.a(false, -var5 + 496 >> 1794252993, var3, 40, var5);
        ((ne) this).field_M.a(false, 3 + var4, var3 + 15, 40, 60);
        ((ne) this).field_M.field_v = (uf) this;
        ((ne) this).field_L.field_v = (uf) this;
        ((ne) this).c((byte) -31, (iq) (Object) ((ne) this).field_L);
        ((ne) this).c((byte) -71, (iq) (Object) ((ne) this).field_M);
        ((ne) this).field_K = new oj((nc) this);
        ((ne) this).field_K.a(false, ((ne) this).field_H.field_o + (((ne) this).field_H.field_n - -60), 20, 150, -60 + ((ne) this).field_n + -((ne) this).field_H.field_o - ((ne) this).field_H.field_n);
        ((ne) this).c((byte) 125, (iq) (Object) ((ne) this).field_K);
        ((ne) this).a(false, 0, 0, var3 + 55 + var4, 496);
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        Object var6 = null;
        if (param1 == 13) {
          if (super.a(param0, param1 + 0, param2, param3)) {
            return true;
          } else {
            if (-99 != (param2 ^ -1)) {
              if ((param2 ^ -1) == -100) {
                return ((ne) this).b((byte) -98, param3);
              } else {
                return false;
              }
            } else {
              return ((ne) this).a(32345, param3);
            }
          }
        } else {
          var6 = null;
          int discarded$2 = this.a((String) null, (String) null, (iq) null, -104, -105, false);
          if (super.a(param0, param1 + 0, param2, param3)) {
            return true;
          } else {
            if (-99 != (param2 ^ -1)) {
              if ((param2 ^ -1) == -100) {
                return ((ne) this).b((byte) -98, param3);
              } else {
                return false;
              }
            } else {
              return ((ne) this).a(32345, param3);
            }
          }
        }
    }

    private final boolean a(ik param0, boolean param1) {
        of var3 = null;
        ba var4 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = param0.a((byte) -5);
        if (var3 != null) {
          var4 = var3.a(-23996);
          if (!param1) {
            return true;
          } else {
            L0: {
              if (qm.field_G != var4) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new int[8192];
        field_N = new ej("");
    }
}
