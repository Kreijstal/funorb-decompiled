/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends kl {
    static int field_E;
    go field_w;
    private ai field_F;
    static od field_A;
    private boolean field_s;
    private int field_H;
    private int field_r;
    int field_q;
    boolean field_t;
    private cn field_m;
    private hb field_n;
    private String field_D;
    private pp field_z;
    private wd field_p;
    int field_B;
    private cn field_y;
    private cn field_o;
    private int field_C;
    static String field_v;
    private boolean field_u;
    private cn field_I;
    private boolean field_x;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        kc.field_Q[lc.field_d] = param0;
        ol.field_k[lc.field_d] = lc.field_d;
        i.field_t[lc.field_d] = param5;
        if (!(param5 <= ln.field_d)) {
            n.field_d = param5;
        }
        if (param1 >= -48) {
            oc.a(113, (byte) -124, -63, 82, 80, 14);
        }
        if (!(param5 >= ib.field_e)) {
            da.field_B = param5;
        }
        mf.field_d[lc.field_d] = param2;
        wa.field_m[lc.field_d] = param3;
        tc.field_w[lc.field_d] = param4;
        int var6 = param4 + param2 + param3;
        int var7 = -1 == (var6 ^ -1) ? 0 : 1000 * param2 / var6;
        ci.field_n[lc.field_d] = var7;
        if (!(var7 >= da.field_B)) {
            da.field_B = var7;
        }
        lc.field_d = lc.field_d + 1;
        if (var7 > n.field_d) {
            n.field_d = var7;
        }
    }

    final void c(byte param0) {
        int var2 = 87 % ((-34 - param0) / 57);
        super.c((byte) -113);
        ((oc) this).field_C = ((oc) this).field_C + 1;
        if (((oc) this).field_C == 100) {
            this.d(126);
        }
        if ((((oc) this).field_C ^ -1) == -116) {
            this.d(true);
        }
        ((oc) this).field_p.a((byte) 109, 20);
    }

    final void a(boolean param0) {
        super.a(param0);
        if ((Object) (Object) ((oc) this).field_z == (Object) (Object) hh.field_s) {
            if (-101 < (((oc) this).field_C ^ -1)) {
                ((oc) this).field_C = 100;
                this.d(127);
            } else {
                if (((oc) this).field_C > 175) {
                    ((oc) this).field_d = true;
                    if (null != ((oc) this).field_n.field_n.field_e) {
                        ((oc) this).field_n.field_n.field_e.a((byte) -19);
                    }
                    if (null != ((oc) this).field_n.field_n.field_t) {
                        ((oc) this).field_n.field_n.field_t.a((byte) -19);
                    }
                    if (!(null == ((oc) this).field_n.field_n.field_v)) {
                        ((oc) this).field_n.field_n.field_v.a((byte) -19);
                    }
                    System.gc();
                    ((oc) this).field_w.a(((oc) this).field_B, ((oc) this).field_q, ((oc) this).field_t, -1);
                }
            }
        }
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 != 4296) {
            oc.e(-11);
        }
        field_A = null;
    }

    private final void d(int param0) {
        ((oc) this).field_p.a(ga.field_n, ((oc) this).field_x ? ((oc) this).field_n.field_n.field_t : ((oc) this).field_n.field_n.field_v, -10872);
        if (param0 <= 124) {
            return;
        }
        if (((oc) this).field_x) {
            t.a(1024, dd.field_B, false, true);
        }
        if (((oc) this).field_x) {
            qh.a(-13716, (rj) (Object) ((oc) this).field_z, 10);
        } else {
            if (((oc) this).field_F.field_h.field_g != 3) {
                qh.a(-13716, (rj) (Object) ((oc) this).field_z, 11);
            }
        }
    }

    final void b(byte param0) {
        int[] var2 = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        ph var6 = null;
        cn var7 = null;
        cn var8 = null;
        int var9 = 0;
        int[] var10 = null;
        var9 = DungeonAssault.field_K;
        var10 = new int[64];
        var2 = var10;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= 64) {
            L1: {
              var3 = te.a(-32 + ((oc) this).field_a, ((oc) this).field_i + -28, var10, 16, 8, 0.125);
              var4 = te.b(-32 + ((oc) this).field_a, ((oc) this).field_i - 28, 0.125);
              var5 = new cn(0, 0);
              var5.field_v = -28 + ((oc) this).field_i;
              var5.field_y = -32 + ((oc) this).field_a;
              var5.field_B = var4;
              var6 = new ph(var3, var5);
              var7 = new cn(((oc) this).field_a, ((oc) this).field_i);
              var8 = new cn(((oc) this).field_a, ((oc) this).field_i);
              ((oc) this).field_l = new ph(var7, var8);
              jh.a(((oc) this).field_l);
              var6.b(16, 16);
              if (param0 == 37) {
                break L1;
              } else {
                ((oc) this).c((byte) -26);
                break L1;
              }
            }
            qe.a(23, 13, ((oc) this).field_a - 46, -34 + ((oc) this).field_i, 256, 32, 8, 128);
            jc.a(((oc) this).field_i - 26, 16, 14, 1, 2, 1);
            jc.a(-26 + ((oc) this).field_i, -24 + ((oc) this).field_a, 14, 1, param0 + -35, 1);
            vd.a(-16 + ((oc) this).field_a, 2, -14561, 2, 8, 0);
            vd.a(((oc) this).field_a, 2, param0 ^ -14534, 2, 0, 6);
            vd.a(((oc) this).field_a, 2, param0 + -14598, 2, 0, 54);
            vd.a(-16 + ((oc) this).field_a, 2, -14561, 2, 8, -16 + ((oc) this).field_i);
            vd.a(((oc) this).field_a, 2, param0 ^ -14534, 2, 0, -22 + ((oc) this).field_i);
            jc.a(40, 80, 14, 1, 2, 1);
            jc.a(40, -88 + ((oc) this).field_a, 14, 1, 2, 1);
            oe.field_m.h(8, 21);
            oe.field_m.j(-63 + ((oc) this).field_a, 21);
            ad.field_e.i(23, ((oc) this).field_i - 38);
            ad.field_e.f(-39 + ((oc) this).field_a, -38 + ((oc) this).field_i);
            da.a(bb.field_q, cm.field_M, ((oc) this).field_a >> -1853204767, param0 + 1917623580, 14 - -(ne.field_c.field_H + 36 >> 212455009), (se) (Object) ne.field_c);
            jh.b();
            return;
          } else {
            var10[var3_int] = mp.a(-2147483648, 1579032 - -(65793 * var3_int));
            var3_int++;
            continue L0;
          }
        }
    }

    oc(hb param0, ai param1, boolean param2, String param3) {
        super(350, 400);
        int var10 = 0;
        String var11 = null;
        ((oc) this).field_F = param1;
        ((oc) this).field_D = param3;
        ((oc) this).field_n = param0;
        ((oc) this).field_x = param2 ? true : false;
        ((oc) this).field_C = 0;
        ((oc) this).field_r = oi.b(0, 4);
        int discarded$0 = ub.a((byte) 15, ((oc) this).field_r);
        ((oc) this).field_H = oi.b(0, 4);
        int discarded$11 = ub.a((byte) 15, ((oc) this).field_H);
        ((oc) this).field_s = 0 == oi.b(0, 2) ? true : false;
        ((oc) this).field_u = oi.b(0, 2) == 0 ? true : false;
        ((oc) this).field_p = new wd(((oc) this).field_n.field_n.field_e);
        ((oc) this).field_z = tn.a((((oc) this).field_a + -jm.field_i.field_y >> 280309281) + ((oc) this).field_k, ((oc) this).field_i + ((oc) this).field_j - jm.field_i.field_v, (se) (Object) ne.field_c, jm.field_i, -75, hj.field_X);
        ((oc) this).field_f.a((ne) (Object) ((oc) this).field_z, false);
        int var5 = ((oc) this).field_a + -64;
        String[] var6 = jn.a(((oc) this).field_D, new int[1], -105, (se) (Object) la.field_b);
        int var7 = var6.length * la.field_b.field_H + la.field_b.field_E;
        jh.c();
        ((oc) this).field_m = new cn(var5, var7);
        ((oc) this).field_m.e();
        int var8 = la.field_b.field_H;
        String[] var13 = var6;
        String[] var9 = var13;
        for (var10 = 0; var13.length > var10; var10++) {
            var11 = var13[var10];
            la.field_b.c(var11, var5 >> 1108971361, var8, 16777215, -1);
            var8 = var8 + la.field_b.field_H;
        }
        ((oc) this).field_o = new cn(var5 + 4, 4 + var7);
        ((oc) this).field_o.e();
        ((oc) this).field_m.e(2, 2, 12690143);
        gf.d(2, 2, 0, 0, 4 + var5, 4 + var7);
        String var14 = ((oc) this).field_x ? ac.field_h : lp.field_n;
        String var9_ref = var14;
        var10 = !((oc) this).field_x ? 8421504 : 16744448;
        var5 = ne.field_c.b(var14);
        var7 = ne.field_c.field_E + ne.field_c.field_H;
        ((oc) this).field_y = new cn(var5, var7);
        ((oc) this).field_y.e();
        ne.field_c.b(var14, 0, ne.field_c.field_H, var10, -1);
        ((oc) this).field_I = rb.a(16, ((oc) this).field_y, var10, (byte) 100);
        ((oc) this).field_y.d(65793);
        jh.b();
        o discarded$12 = gd.a(64, bc.field_b);
    }

    private final void d(boolean param0) {
        if (!param0) {
            ((oc) this).c((byte) 56);
        }
        if (((oc) this).field_x) {
            // ifnull L85
            o discarded$0 = gd.a(64, ((oc) this).field_n.field_n.field_p);
        } else {
            if (!(((oc) this).field_n.field_n.field_g == null)) {
                o discarded$1 = gd.a(64, ((oc) this).field_n.field_n.field_g);
            }
        }
    }

    final void b(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        int var6 = 0;
        int[] var8 = null;
        int var9_int = 0;
        cn var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        cn var19 = null;
        cn var20 = null;
        L0: {
          var18 = DungeonAssault.field_K;
          super.b(105);
          var2 = Math.log(0.02) * -0.005;
          var4 = 0.5 / var2;
          var6 = (int)(-0.5 + var4 * (1.0 - Math.exp(-var2 * (double)((oc) this).field_C)) + (double)((oc) this).field_r);
          var6 = var6 % hf.field_ib.field_c;
          if (((oc) this).field_s) {
            var6 = -1 + (hf.field_ib.field_c - var6);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var19 = hf.field_ib.a(108, var6, 108, 0);
          if (var19 != null) {
            var19.c(10, 57);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = (int)(-0.5 + (1.0 - Math.exp(-var2 * (double)((oc) this).field_C)) * var4 + (double)((oc) this).field_H);
          var6 = var6 % hf.field_ib.field_c;
          if (!((oc) this).field_u) {
            break L2;
          } else {
            var6 = hf.field_ib.field_c + (-1 - var6);
            break L2;
          }
        }
        L3: {
          var20 = hf.field_ib.a(108, var6, 108, 0);
          if (var20 != null) {
            var20.c(518, 57);
            break L3;
          } else {
            break L3;
          }
        }
        var8 = new int[64];
        var9_int = 0;
        L4: while (true) {
          if (-65 >= (var9_int ^ -1)) {
            L5: {
              var9 = null;
              if (((oc) this).field_C < 250) {
                var9 = te.a(224, 224, ((oc) this).field_C, var8, 32, 24, 0.03125);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var10 = (((oc) this).field_a - 216 >> 571821953) + ((oc) this).field_k;
              var11 = ((oc) this).field_j + 80;
              var12 = ((oc) this).field_k - -(-((oc) this).field_o.field_y + ((oc) this).field_a >> -1601461631);
              var13 = 79 % ((41 - param0) / 63);
              var14 = 230 + (var11 + (60 + -((oc) this).field_o.field_v >> 505219809));
              gf.b(-8 + var10, var11 - 8, 232, 232, 0);
              rp.a(4, 224, (byte) 108, var10 - 4, 224, kc.field_S, var11 - 4);
              if (((oc) this).field_C >= 100) {
                L7: {
                  ((oc) this).field_p.a(216, var11, (byte) 102, var10, 216);
                  if (((oc) this).field_C >= 250) {
                    var15 = var10 + (-((oc) this).field_y.field_y + 216 >> 561741729);
                    var16 = var11 - -208 - ((oc) this).field_y.field_v;
                    ((oc) this).field_I.b(var15, var16, 256);
                    ((oc) this).field_y.h(var15, var16);
                    break L7;
                  } else {
                    var15 = 192 + -(192 * (-100 + ((oc) this).field_C) / 150);
                    var9.d(var10 - 4, var11 + -4, var15);
                    var15 = (((oc) this).field_C - 100 << 686413832) / 150;
                    var16 = var10 + (216 + -((oc) this).field_y.field_y >> 780905761);
                    var17 = var11 + (-((oc) this).field_y.field_v + 208);
                    ((oc) this).field_I.b(var16, var17, var15);
                    ((oc) this).field_y.d(var16, var17, var15);
                    break L7;
                  }
                }
                if (175 > ((oc) this).field_C) {
                  ((oc) this).field_o.b(-2 + var12, -2 + var14, (((oc) this).field_C * 256 + -25600) / 75);
                  break L6;
                } else {
                  if ((((oc) this).field_C ^ -1) <= -251) {
                    ((oc) this).field_m.b(var12, var14, 256);
                    break L6;
                  } else {
                    ((oc) this).field_o.b(var12 - 2, var14 + -2, -((256 * (((oc) this).field_C + -100) + -19200) / 75) + 256);
                    ((oc) this).field_m.b(var12, var14, (((oc) this).field_C - 100 - 150 + -75) * 256 / 75);
                    break L6;
                  }
                }
              } else {
                ((oc) this).field_p.a(216, var11, (byte) 102, var10, 216);
                var9.d(-4 + var10, -4 + var11, 192);
                break L6;
              }
            }
            return;
          } else {
            var8[var9_int] = mp.a(65793 * (24 + var9_int), -2147483648);
            var9_int++;
            continue L4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = -1;
        field_A = new od();
        field_v = "You are charging 1 Orb of Mastery!";
    }
}
