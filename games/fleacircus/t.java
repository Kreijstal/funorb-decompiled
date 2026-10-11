/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class t {
    static String field_c;
    private pl field_b;
    private int field_f;
    private int field_e;
    private int field_g;
    static int field_d;
    static int field_a;
    private int field_i;
    static dd[] field_h;

    private final boolean a(byte param0, int param1) {
        int var3;
        int var4;
        if (3 == this.field_i) {
          if (0 == param1 &&
            g.field_s == 0) {
            return false;
          }
          if (param1 == 2 &&
            g.field_s == -1 + kb.field_k.length) {
            return false;
          }
        }
        var3 = 32 % ((param0 - 19) / 41);
        var4 = ia.field_p[this.field_i][param1];
        if (var4 != 20) {
          return true;
        }
        if ((fleas.field_E != 0 ||
          !(rh.field_c.field_x >= 15) ||
          !qh.c((byte) 62) &&
          !(0 >= wc.field_q)) && rh.field_c.a(rh.field_c.field_x, 98)) {
          return true;
        }
        return false;
    }

    private final void h(int param0) {
        int var2 = 160;
        int var3 = 0;
        int var4 = 0;
        tl.field_p.a(fi.field_l, 320, var2, var3, var4);
        var2 += 40;
        int var5 = tj.field_a;
        if (!(tj.field_a < nl.field_c[fleas.field_E].length)) {
          var5 = -1 + nl.field_c[fleas.field_E].length;
        }
        tl.field_p.a(db.a(pk.field_G, new String[]{wj.field_c[fleas.field_E][var5]}, true), 170, var2 - 27, 300, 320, var3, var4, 1, 0, tl.field_p.field_H);
        var2 += 90;
        tl.field_p.a(db.a(va.field_s, new String[]{Integer.toString(pl.field_f), Integer.toString((int) ia.field_m[fleas.field_E][var5].field_f)}, true), 320, var2, var3, var4);
        var2 += 40;
        tl.field_p.a(db.a(hm.field_h, new String[]{Integer.toString(wi.field_b)}, true), 320, var2, var3, var4);
        int var7 = -113 % ((param0 - 12) / 34);
        String var6 = db.a(fleas.field_I, new String[]{wa.a(false)}, true);
        tl.field_p.a(db.a(var6, new String[]{"0"}, true), 320, var2 + tl.field_p.field_N, var3, var4);
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
          return;
        }
        int var3 = 0;
        if (this.field_i == 7) {
          var3 = -1;
        }
        if (0 == this.field_i &&
          this.field_b.field_k != -1) {
          var3 = this.field_b.field_k;
        }
        if (1 == this.field_i &&
          this.field_b.field_k != -1 &&
          -1 != ab.field_b) {
          var3 = this.field_b.field_k;
        }
        if (this.field_i == 3) {
          var3 = 2;
        }
        this.field_b.a(this.a(ag.field_f, kc.field_b, (byte) -57), var3, param0, -60);
        this.field_f = -1;
        if (this.field_i == 7) {
          qh.a(param0, false);
        }
    }

    private final void d(int param0) {
        int var9 = 0;
        int var13 = 0;
        String var2;
        fa var3;
        ll var4_ref_ll;
        int var4;
        String[] var5;
        int var7;
        int var8;
        int var10;
        int var11;
        String var12;
        int var14;
        int[] var18;
        L0: {
          var14 = fleas.field_A ? 1 : 0;
          var3 = lk.field_Q;
          this.b(2, nb.field_g);
          if (!qh.c((byte) 122)) {
            if (m.field_b == null) {
              m.field_b = bm.a(false, 3, 1, 10, 40);
            }
            var4_ref_ll = m.field_b;
            if (!var4_ref_ll.field_l) {
              var2 = ja.field_L;
            } else {
              if (null != var4_ref_ll.field_i) {
                var2 = bh.field_n;
                var5 = var4_ref_ll.field_i[nb.field_g];
                var18 = var4_ref_ll.field_p[nb.field_g];
                var7 = cd.a(var4_ref_ll, cm.field_b, 0, nb.field_g);
                var8 = 115 + var3.field_H;
                for (var9 = 0; var9 < 10; var9++) {
                  if (var5[var9] != null) {
                    var10 = 0;
                    var11 = var18[var9];
                    if (var9 == var7) {
                      var10 = 16711680;
                    }
                    var12 = var5[var9];
                    var3.b(var9 + 1 + ". ", 180, var8, var10, -1);
                    var3.c(var12, 180, var8, var10, -1);
                    var3.b(Integer.toString(var11), 500, var8, var10, -1);
                    for (var13 = 180; var13 < 500; var13 += 2) {
                      gb.b(var13, 1 + var8, 1, 1);
                    }
                    var2 = "";
                  }
                  var8 += 21;
                }
                if (((wi.field_p != null)) &&
                  ((var7 == -1))) {
                  var3.c(b.field_e, 180, var8, 16711680, -1);
                  var3.b(Integer.toString(wi.field_b), 500, var8, 16711680, -1);
                }
                break L0;
              }
              var2 = qi.field_e;
            }
          } else {
            var2 = bh.field_n;
          }
        }
        var4 = 115 - (-var3.field_H - 105);
        var3.a(var2, 320, var4, 0, -1);
        if (param0 != -1) {
          this.d(73);
        }
        if (!qh.c((byte) 32)) {
          ve.field_d.a(qi.field_a, 195, -31 + ia.field_j[2], 250, 100, 0, -1, 1, 0, ve.field_d.field_N);
        } else {
          var3.a(sc.field_b, 190, ia.field_j[2] - 120, 260, 100, 0, -1, 1, 0, var3.field_N);
        }
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = (-je.field_O[3].field_w + 640) / param0;
        var4 = (480 - je.field_O[3].field_t) / 2;
        var4 += 50;
        var5 = param1 % je.field_O.length;
        if (var5 == 0 ||
          var5 == 1) {
          var4 += 180;
        }
        je.field_O[var5].b(var3, var4, 16, 13089168);
    }

    final void e(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int discarded$0 = 0;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        for (var2 = 0; b.field_d.length > var2; var2++) {
          dupTemp$1 = b.field_d[var2] + (2 + var2);
          b.field_d[var2] = dupTemp$1;
          if (dupTemp$1 > 640) {
            b.field_d[var2] = -400;
            h.field_g[var2] = je.field_O[this.b(param0 + 399)];
          }
          dupTemp$2 = hd.field_h[var2] - (2 + var2);
          hd.field_h[var2] = dupTemp$2;
          if (dupTemp$2 < -400) {
            hd.field_h[var2] = 1040;
            ua.field_tb[var2] = je.field_O[this.b(df.a(param0, 399))];
          }
        }
        if (param0 != -400) {
          discarded$0 = this.b((byte) -118, -47);
        }
    }

    private final int b(byte param0, int param1) {
        if (2 == this.field_i &&
          !qh.c((byte) 73)) {
          if (param1 < 3) {
            return ia.field_t[this.field_i] + 180 * param1;
          }
          return 180 + ia.field_t[this.field_i];
        }
        if (this.field_i == 3) {
          return ia.field_t[this.field_i] + param1 * 160;
        }
        if (param0 != -13) {
          this.field_b = (pl) null;
        }
        return ia.field_t[this.field_i];
    }

    private final void a(boolean param0) {
        int discarded$0 = 0;
        int var2 = 150;
        tl.field_p.b(bh.field_u[0], 320, var2 + 2 * tl.field_p.field_N, 0, -1, ni.field_j / 3);
        tl.field_p.b(qh.c((byte) 111) ? nc.field_b : bh.field_u[1], 320, var2 + (int)((double)tl.field_p.field_N * 3.5), 0, -1, ni.field_j / 3);
        jj.field_P.d((640 - jj.field_P.field_w) / 2, var2 + tl.field_p.field_N * 4);
        tl.field_p.a(hm.field_h + wi.field_b, 320, 200 + var2, 0, -1);
        ca.field_L.a(50, 100, 0, -4575, 380);
        fb.field_a.a(50, 100, 0, -4575, 380);
        mg.field_b.a(50, 100, 0, -4575, 380);
        cm.field_i.a(50, 100, 540, -4575, 380);
        th.field_z.a(50, 100, 540, -4575, 380);
        mf.field_e.a(50, 100, 540, -4575, 380);
        ca.field_L.a(1);
        fb.field_a.a(1);
        mg.field_b.a(1);
        cm.field_i.a(1);
        th.field_z.a(1);
        mf.field_e.a(1);
        if (param0) {
          discarded$0 = this.a(24, -60, (byte) 102);
        }
    }

    private final void c(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        String var9;
        fa var10;
        var10 = tl.field_p;
        if (param0 != 2758) {
          this.field_e = -80;
        }
        if (qh.c((byte) 94)) {
          var3 = 150 + var10.field_N;
          var4 = var10.field_K + (var10.field_y + 4);
          stackIn_7_0 = (fleas.field_L == 0) ? 0 : 1;
          var5 = stackIn_7_0;
          stackIn_10_0 = (wi.field_b == 0) ? 0 : 1;
          var6 = stackIn_10_0;
          if (hj.field_a[1] == 0) {
            stackIn_16_0 = (hj.field_a[0] != 0) ? 1 : 0;
          } else {
            stackIn_16_0 = 1;
          }
          var7 = stackIn_16_0;
          var8 = vi.a(param0 ^ -2780, var6 != 0, var5 != 0, var7 != 0);
          if (var8 == null) {
            var8 = "";
          }
          var9 = jj.field_X + " " + var8;
          var10.a(var9, 165, -100 + var3, 310, 215, 0, -1, 1, 2, var10.field_N);
          var10.a(kf.a(var6 != 0, -121, var7 != 0, var5 != 0), 320, 90 + (var3 + 3 * var4 + 10), 0, -1);
          var10.a(ic.a(param0 - 2634, var6 != 0, var7 != 0, var5 != 0), 160, 90 + var4 * 4 + (var3 + 10), 320, 100, 0, -1, 1, 0, var10.field_N);
        } else {
          var10.a(nc.field_b, 320, 240, 0, -1);
          ca.field_L.a(50, 100, 0, param0 - 7333, 380);
          fb.field_a.a(50, 100, 0, param0 ^ -6937, 380);
          mg.field_b.a(50, 100, 0, -4575, 380);
          cm.field_i.a(50, 100, 540, param0 - 7333, 380);
          th.field_z.a(50, 100, 540, -4575, 380);
          mf.field_e.a(50, 100, 540, -4575, 380);
          ca.field_L.a(1);
          fb.field_a.a(1);
          mg.field_b.a(1);
          cm.field_i.a(1);
          th.field_z.a(1);
          mf.field_e.a(1);
        }
    }

    private final void a(boolean param0, byte param1) {
        int discarded$0 = 0;
        int incrementValue$1 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        dd stackIn_16_0 = null;
        int stackIn_54_0 = 0;
        fa stackIn_56_0 = null;
        String stackIn_57_1 = null;
        int stackIn_59_2;
        int stackIn_59_3;
        int stackIn_60_4;
        dd stackIn_70_0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        int var14;
        fa var15;
        int var4Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        var14 = fleas.field_A ? 1 : 0;
        if (param1 <= 2) {
          discarded$0 = this.a(-16, 3, (byte) 34);
        }
        var15 = tl.field_p;
        var4 = 164;
        var5 = 110;
        this.b(2, ae.field_e);
        og.a(var5 - pd.field_k[0].field_r, pd.field_k, 91, var4 - pd.field_k[0].field_x, pd.field_k[6].field_r + (pd.field_k[0].field_r + 80) - 8, 312 - (-pd.field_k[0].field_x - pd.field_k[2].field_x));
        if (!param0) {
          stackIn_5_0 = kh.field_b;
        } else {
          stackIn_5_0 = fleas.field_L;
        }
        var6 = stackIn_5_0;
        var7 = 0;
        var8 = -1;
        for (var9 = 0; var9 < wa.field_f.length; var9++) {
          L11: {
            if ((var6 & 1 << var9) != 0) {
              il.field_d[var9].c(var4, var5);
            } else {
              if (param0) {
                break L11;
              }
              if (wc.field_q <= 0 &&
                rh.field_j[var9]) {
                stackIn_16_0 = mf.field_g;
              } else {
                stackIn_16_0 = cb.field_u;
              }
              ((dd) (Object) stackIn_16_0).c(var4, var5);
            }
            if (ag.field_f >= var4 &&
              32 + var4 >= ag.field_f &&
              kc.field_b >= var5 &&
              32 + var5 >= kc.field_b) {
              gb.d(-3 + var4, var5 - 3, 37, 37, 6, 8421504);
              var8 = var9;
            }
            if (this.field_g >= var4 &&
              32 + var4 >= this.field_g &&
              this.field_e >= var5 &&
              var5 + 32 >= this.field_e) {
              if (var9 == this.field_f) {
                this.field_f = -1;
              } else {
                this.field_f = var9;
              }
              this.field_g = -1;
            }
            if (this.field_f == var9) {
              gb.d(var4 - 3, -3 + var5, 37, 37, 6, 16777215);
            }
            incrementValue$1 = var7;
            var7++;
            if (incrementValue$1 != 7) {
              var4 += 40;
            } else {
              var7 = 0;
              var4 = 164;
              var5 += 40;
            }
          }
        }
        for (var9Lifetime1 = 0; var9Lifetime1 < 2; var9Lifetime1++) {
          gb.b(100, var9Lifetime1 * 2 + 200, 440, 1);
        }
        if (this.field_f >= 0) {
          var8 = this.field_f;
        }
        if (var8 != -1) {
          var9Lifetime2 = var15.field_N;
          var15.a(wa.field_f[var8], 320, 230, 0, -1);
          stackIn_54_0 = (0 == (var6 & 1 << var8)) ? 0 : 1;
          var10 = stackIn_54_0;
          stackIn_56_0 = lk.field_Q;
          if (var10 != 0) {
            stackIn_57_1 = vk.field_M;
          } else {
            stackIn_57_1 = jk.field_i;
          }
          stackIn_59_2 = 320;
          stackIn_59_3 = lk.field_Q.field_N + 225;
          if (var10 == 0) {
            stackIn_60_4 = 8388608;
          } else {
            stackIn_60_4 = 24576;
          }
          ((fa) (Object) stackIn_56_0).a(stackIn_57_1, stackIn_59_2, stackIn_59_3, stackIn_60_4, -1);
          var11 = 200;
          var11 += 60;
          lk.field_Q.a(ij.field_J[var8], 100, var11, 320, 100, 0, -1, 0, 0, lk.field_Q.field_N - 7);
          var12 = ii.field_a + 100 * rf.field_c[var8];
          var4Lifetime1 = 100;
          var15.c(var12, 100, ia.field_j[4] - (int)((double)var15.field_N * 1.5), 0, -1);
          var11 = var11 + var9Lifetime2;
          var15.c(me.field_e, 100, -(int)(0.5 * (double)var15.field_N) + ia.field_j[4], 0, -1);
          var4Lifetime1 = var4Lifetime1 + var15.b(me.field_e);
          for (var13 = 0; rf.field_c[var8] > var13; var13++) {
            vb.field_a.d(var4Lifetime1, ia.field_j[4] - (-var15.field_K + var15.field_N) - (var15.field_H - (int)((double)var15.field_N * 0.5)));
            var4Lifetime1 = var4Lifetime1 + vb.field_a.field_w / 3;
          }
          if (var10 != 0) {
            il.field_d[var8].d(420, 252);
          } else if (0 < wc.field_q) {
            cb.field_u.d(420, 252);
          } else {
            if (!rh.field_j[var8]) {
              stackIn_70_0 = cb.field_u;
            } else {
              stackIn_70_0 = mf.field_g;
            }
            ((dd) (Object) stackIn_70_0).d(420, 252);
          }
        } else {
          var15.a(al.field_d, 165, 200, 310, 100, 0, -1, 1, 0, var15.field_N);
          if (qh.c((byte) 90)) {
            var15.a(sc.field_b, 165, 280, 310, 100, 0, -1, 1, 0, var15.field_N);
          }
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        Object stackIn_74_0;
        boolean stackIn_74_3;
        Object var2;
        Object var3;
        int var4;
        int var5;
        int var4Lifetime1;
        Object var2Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        rh.field_c.field_a = 100;
        if (this.field_i != 1) {
          qi.field_c.f(0, 0);
          for (var2_int = 0; var2_int < h.field_g.length; var2_int++) {
            h.field_g[var2_int].d(b.field_d[var2_int], 200 + var2_int * 5);
            ua.field_tb[var2_int].g(hd.field_h[var2_int], 200 + 5 * var2_int);
          }
        } else {
          fc.c(param0 ^ 124);
          gb.d(0, 0, 640, 480);
        }
        var2 = null;
        var3 = null;
        var4 = this.field_i;
        if (var4 != 0 &&
          -2 != var4 &&
          1 != var4) {
          if (var4 == 10) {
            if (pl.field_l[fleas.field_E] / 3 > tj.field_a) {
              var3 = f.field_E;
            } else {
              if (tj.field_a < pl.field_l[fleas.field_E] * 2 / 3) {
                var3 = me.field_g;
              } else {
                var3 = tk.field_s;
              }
            }
            var2Lifetime1 = db.field_I;
          } else if (8 == var4) {
            var2Lifetime1 = a.field_f;
          } else if (var4 == 3) {
            var2Lifetime1 = aj.field_v;
            var3 = ek.field_c;
          } else if (2 == var4) {
            var2Lifetime1 = va.field_g;
            var3 = uh.field_k;
          } else if (4 != var4 &&
            var4 != 5) {
            if (var4 == 6) {
              var3 = uh.field_k;
              var2Lifetime1 = de.field_a;
            } else if (9 != var4) {
              var3 = null;
              var2Lifetime1 = null;
            } else {
              var2Lifetime1 = lc.field_t;
              var3 = uh.field_k;
            }
          } else {
            var2Lifetime1 = fg.field_j;
            var3 = ek.field_c;
          }
        } else {
          var2Lifetime1 = de.field_a;
        }
        if (var3 != null) {
          ((dd) (var3)).d((-((dd) (var3)).field_x + 640) / 2, 45);
        }
        if (this.field_i != 1 &&
          this.field_i != 7) {
          si.field_C.d(0, 0);
        }
        if (param0 != 2) {
          field_a = 76;
        }
        if (var2Lifetime1 != null) {
          ((dd) (var2Lifetime1)).d((-((dd) (var2Lifetime1)).field_x + 640) / 2, 10);
        }
        if (this.field_i == 2) {
          this.d(-1);
        } else {
          if (this.field_i != 3) {
            if (this.field_i == 4) {
              this.a(false, (byte) 60);
            } else {
              if (this.field_i == 5) {
                this.a(true, (byte) 116);
              } else {
                if (this.field_i == 6) {
                  this.c(2758);
                } else {
                  if (this.field_i == 7) {
                    ed.c(param0 ^ -110);
                    return;
                  }
                  if (8 != this.field_i) {
                    if (this.field_i != 10) {
                      if (this.field_i == 9) {
                        this.a(false);
                      }
                    } else {
                      this.h(param0 ^ 98);
                    }
                  } else {
                    this.a(-25155);
                  }
                }
              }
            }
          } else {
            this.c((byte) -123);
          }
        }
        for (var4Lifetime1 = 0; this.field_b.field_m > var4Lifetime1; var4Lifetime1++) {
          if (this.a((byte) 120, var4Lifetime1)) {
            stackIn_73_1 = -1;
            stackIn_73_2 = var4Lifetime1;
            if (var4Lifetime1 != this.field_b.field_k) {
              stackIn_74_0 = this;
              stackIn_74_3 = false;
            } else {
              stackIn_74_0 = this;
              stackIn_74_3 = true;
            }
            this.a(stackIn_73_1, stackIn_73_2, stackIn_74_3);
          }
        }
    }

    private final int a(int param0, int param1) {
        if (this.field_i == 2 &&
          !qh.c((byte) 32)) {
          return 165 + this.b((byte) -13, param0);
        }
        if (param1 != -19631) {
          this.a(52);
        }
        if (3 == this.field_i) {
          return 150 + this.b((byte) -13, param0);
        }
        return ia.field_l[this.field_i];
    }

    private final int c(int param0, int param1) {
        if (param1 != 1205) {
          this.field_e = -69;
        }
        return 30;
    }

    private final void a(int param0) {
        int stackIn_6_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        kh var8;
        int var9_int;
        fa var9;
        String var10;
        int var11;
        int var6Lifetime1;
        var11 = fleas.field_A ? 1 : 0;
        og.a(rh.field_c.field_a + 22, ad.field_b, 93, -4 + rh.field_c.field_l, rh.field_c.field_d - 17, rh.field_c.field_n + 9);
        rh.field_c.c(-1);
        if (rh.field_c.field_i) {
          gb.e(rh.field_c.field_l, rh.field_c.field_D.field_N + rh.field_c.field_a, rh.field_c.field_n + 1, rh.field_c.field_d - rh.field_c.field_D.field_N + 1, 32928, 256);
        }
        stackIn_6_0 = (rh.field_c.field_x > hj.field_a[fleas.field_E]) ? 0 : 1;
        var2 = stackIn_6_0;
        var3 = 0;
        if (fleas.field_E == 0 &&
          rh.field_c.field_x >= 15 && (qh.c((byte) 36) ||
          !(wc.field_q > 0))) {
          var2 = 0;
          var3 = 1;
        }
        var4 = rh.field_c.field_l + rh.field_c.field_n + 20;
        var5 = rh.field_c.field_D.field_N + rh.field_c.field_a;
        var6 = fl.field_b.field_w / 4;
        var7 = fl.field_b.field_t / 4;
        og.a(var5 - 6, ad.field_b, param0 + 25267, -6 + var4, rh.field_c.field_d - 17, pf.field_a.field_w + 12);
        if (null != fl.field_b) {
          var8_int = -(mf.field_g.field_x / 4) + var6 / 2 + (var4 + 13);
          var9_int = -(mf.field_g.field_t / 4) + var5 + 14 + var7 / 2;
          if (var2 == 0) {
            gb.e(var4 + 13, var5 + 14, var6, var7, 1);
            tl.field_p.a(fc.field_b, 25 + var4 + 13, 30 + var5 + 14, 0, -1);
            tl.field_p.a(fc.field_b, var6 + var4 - 12, -15 + (var5 - (-var7 - 14)), 0, -1);
            cb.field_u.e(var8_int, var9_int);
          } else {
            fl.field_b.c(var4 + 13, var5 + 14);
          }
          if (var3 != 0) {
            mf.field_g.e(var8_int, var9_int);
          }
          pf.field_a.d(var4, var5);
          var5 = var5 + (20 + var7);
        }
        if (param0 != -25155) {
          return;
        }
        var6Lifetime1 = pf.field_a.field_w;
        var5 += 15;
        var8 = ia.field_m[fleas.field_E][rh.field_c.field_x];
        rd.field_e.d(-(rd.field_e.field_x / 2) + (var6Lifetime1 / 2 + var4), var5);
        if (rh.field_c.field_d + rh.field_c.field_a >= 397) {
          rd.field_e.b(var6Lifetime1 / 2 + (var4 - rd.field_e.field_x / 2), -20 + (rh.field_c.field_d + rh.field_c.field_a));
        }
        var9 = lk.field_Q;
        var5 = var5 + (20 + var9.field_N);
        var9.a(rh.field_c.field_z[rh.field_c.field_x], var4 + var6Lifetime1 / 2, var5, 1, -1);
        if (var2 != 0) {
          var5 = var5 + (var9.field_N + 15);
          var9.a(db.a(kl.field_b, new String[]{Integer.toString((int) var8.field_f)}, true), var4 + var6Lifetime1 / 2, var5, 1, -1);
          var5 = var5 + var9.field_N;
          var9.a(db.a(fleas.field_H, new String[]{Integer.toString((int) var8.field_e)}, true), var4 + var6Lifetime1 / 2, var5, 1, -1);
        } else {
          var10 = ej.field_b;
          var5 += 10;
          if (var3 != 0) {
            var10 = ri.field_u;
          }
          ve.field_d.a(var10, var4 + 5, var5, -10 + var6Lifetime1, var7, 1, -1, 0, 0, ve.field_d.field_N);
          if (qh.c((byte) 125)) {
            var5 = var5 + ve.field_d.field_N * 3;
            ve.field_d.a(pc.field_m, var4 + 5, var5, -10 + var6Lifetime1, var7, 1, -1, 0, 0, ve.field_d.field_N);
          }
        }
        return;
    }

    private final int b(int param0) {
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        var2 = param0;
        while (true) {
          if (var2 > 0 &&
            h.field_g[0] != je.field_O[var2] &&
            h.field_g[1] != je.field_O[var2] &&
            ua.field_tb[0] != je.field_O[var2] &&
            ua.field_tb[1] != je.field_O[var2]) {
            return var2;
          }
          var2 = db.a((byte) -115, fleas.field_F, je.field_O.length);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_17_0 = 0;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        int var10;
        dd[] var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        fa var17;
        fa var18;
        var16 = fleas.field_A ? 1 : 0;
        var17 = tl.field_p;
        var18 = var17;
        var5 = this.a(param1, (byte) 118);
        var6 = this.b((byte) -13, param1);
        var7 = ia.field_p[this.field_i][param1];
        var8 = pa.field_i[var7];
        if (var8 == null) {
          var8 = "ERROR: missing text";
        }
        var9 = this.a(param1, -19631) - var6;
        var10 = this.c(param1, 1205) + 2;
        var11 = ta.field_z;
        if (param2) {
          var11 = a.field_b;
        }
        if (8 <= var7 &&
          var7 <= 10 &&
          param1 == nb.field_g) {
          var11 = gj.field_E;
        }
        if (6 == this.field_i) {
          var6 = var6 + var9 / 2;
          var9 = 20 + var18.b(var8);
          var6 = var6 - var9 / 2;
        }
        og.a(var5, var11, 86, var6, var10, var9);
        stackIn_17_0 = (!param2) ? 0 : 1;
        var12 = stackIn_17_0;
        if (var7 == 19 &&
          lk.field_D.field_k) {
          var12 = 2;
        }
        if (param0 != -1) {
          return;
        }
        var13 = 0;
        if (ta.field_z != null) {
          var13 = -var17.field_K + (var10 - ta.field_z[0].field_r - ta.field_z[6].field_r) - var18.field_H;
        }
        var14 = 0;
        if (ta.field_z != null &&
          ta.field_z[0] != null) {
          var14 = ta.field_z[0].field_r;
        }
        var15 = var18.field_H + var5 + (var14 + (var13 >> 1));
        var15 -= 3;
        if (var7 == 12) {
          f.field_G.field_l = (-ia.field_t[this.field_i] + ia.field_l[this.field_i]) / 2 + (-20 + ia.field_t[this.field_i]);
          f.field_G.field_a = var15 - 13;
          f.field_G.c((byte) 72);
          f.field_G.field_w.field_v = 6;
          var18.b(var8, f.field_G.field_l, var15, var12, -1);
        } else {
          if (13 == var7) {
            cb.field_w.field_l = (-ia.field_t[this.field_i] + ia.field_l[this.field_i]) / 2 + ia.field_t[this.field_i] - 20;
            cb.field_w.field_a = var15 - 13;
            cb.field_w.c((byte) 72);
            var18.b(var8, cb.field_w.field_l, var15, var12, -1);
          } else {
            var18.a(var8, var6 + (var9 >> 1), var15, var12, -1);
          }
        }
        return;
    }

    private final void a(boolean param0, byte param1, int param2) {
        int stackIn_48_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_175_0 = 0;
        boolean stackIn_187_0 = false;
        int stackIn_190_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var11;
        var7 = fleas.field_A ? 1 : 0;
        if (param1 >= -24) {
          this.a(-100, 39, false);
        }
        var5 = ia.field_p[this.field_i][param2];
        if (this.field_b.b(120) &&
          var5 != 12 &&
          var5 != 13) {
          ik.a(wj.field_b[0], (byte) -84);
        }
        L2: {
          var6 = var5;
          if (var6 != 0 &&
            21 != var6) {
            if (1 == var6) {
              if (!(!this.field_b.b(-17))) {
                oa.a(-1, param0, -86);
                stackIn_54_0 = (0 < wc.field_q) ? 0 : 7;
                bj.field_m = stackIn_54_0;
              }
            } else {
              if (var6 == 5) {
                if (!(!this.field_b.b(111))) {
                  oa.a(0, param0, -79);
                }
              } else {
                if (16 == var6) {
                  if (!(!this.field_b.b(-38))) {
                    oa.a(7, param0, 69);
                    var11 = hj.field_a;
                    hj.field_a[1] = 0;
                    fleas.field_L = 0;
                    kh.field_b = 0;
                    var11[0] = 0;
                    a.field_e.f(1);
                  }
                } else {
                  if (var6 == 14) {
                    if (!(!this.field_b.b(109))) {
                      oa.a(4, param0, 99);
                      bj.field_m = this.field_i;
                      ae.field_e = db.a((byte) -115, fleas.field_F, je.field_O.length);
                    }
                  } else {
                    if (var6 == 3) {
                      if (!(!this.field_b.b(103))) {
                        g.field_s = 0;
                        oa.a(3, param0, 75);
                        bj.field_m = this.field_i;
                      }
                    } else {
                      if (var6 == 6) {
                        if (this.field_b.b(-64)) {
                          oa.a(bj.field_m, param0, 14);
                          break L2;
                        }
                      } else {
                        if (var6 == 2) {
                          if (!(!this.field_b.b(125))) {
                            oa.a(2, param0, -127);
                          }
                          break L2;
                        }
                        if (var6 != 12) {
                          if (var6 == 13) {
                            var4 = th.field_D;
                            if (this.field_b.g(-115)) {
                              lg.a(-104, 0);
                            }
                            if (this.field_b.a((byte) -29)) {
                              lg.a(-99, 256);
                            }
                            if (this.field_b.e(96)) {
                              nc.a((byte) -102);
                            }
                            if (this.field_b.a(-23670)) {
                              pa.a((byte) 93);
                            }
                            if (this.field_b.a(false)) {
                              cb.field_w.c(94);
                              if (cb.field_w.field_g) {
                                lg.a(-119, cb.field_w.field_A);
                              } else {
                                if (cb.field_w.field_l <= ag.field_f) {
                                  lg.a(-107, 256);
                                } else {
                                  lg.a(-118, 0);
                                }
                              }
                            }
                            if (var4 != th.field_D) {
                              cb.field_w.field_A = th.field_D;
                              ik.a(wj.field_b[1], (byte) -84);
                              break L2;
                            }
                          } else {
                            if (4 == var6) {
                              if (this.field_b.b(119)) {
                                if (rh.field_p != null) {
                                  lh.a(false);
                                } else {
                                  var6 = param0 ? 1 : 0;
                                  c.a(320, (byte) 78, tl.field_p.field_K + tl.field_p.field_y, a.field_b, 8, 2, tl.field_p, ta.field_z, 240, tl.field_p.field_y, var6 != 0, 8);
                                }
                                break L2;
                              }
                            } else {
                              switch (var6) {
                                case 9:
                                  if (this.field_b.b(-28)) {
                                    nb.field_g = 1;
                                    break L2;
                                  }
                                  break;
                                case 15:
                                  if (!this.field_b.b(118)) {
                                    break L2;
                                  }
                                  if (this.field_i != 4 &&
                                    this.field_i != 2) {
                                    if (this.field_i != 6 &&
                                      this.field_i != 9) {
                                      if (8 == this.field_i) {
                                        me.a(this.field_i, this.field_i, false);
                                      } else {
                                        if (this.field_i != 7) {
                                          break;
                                        }
                                        il.a((byte) 77, rl.a((byte) -66));
                                      }
                                    } else {
                                      stackIn_150_0 = (fleas.field_L == 0) ? 2 : 5;
                                      me.a(stackIn_150_0, 6, false);
                                    }
                                    break L2;
                                  }
                                  me.a(this.field_i, this.field_i, false);
                                  break L2;
                                case 11:
                                  if (!this.field_b.b(108)) {
                                    break L2;
                                  }
                                  if (rh.field_p != null) {
                                    lh.a(false);
                                  }
                                  hf.a(rl.a((byte) -51), -80);
                                  break L2;
                                case 19:
                                  if (this.field_b.b(106)) {
                                    if (!(lk.field_D.field_k)) {
                                      cf.a(-25319);
                                      oa.a(-1, param0, -126);
                                      stackIn_175_0 = (wc.field_q > 0) ? 0 : 7;
                                      bj.field_m = stackIn_175_0;
                                    }
                                    break L2;
                                  }
                                  break;
                                case 20:
                                  if (!this.field_b.b(111)) {
                                    break L2;
                                  }
                                  cm.field_b = null;
                                  m.field_b = null;
                                  wi.field_p = new vj();
                                  tj.field_a = rh.field_c.field_x;
                                  if (rh.field_c.field_x <= hj.field_a[fleas.field_E] &&
                                    rh.field_c.a(rh.field_c.field_x, 110)) {
                                    ej.a((byte) -39);
                                    stackIn_187_0 = (tj.field_a == 0);
                                    tg.field_g = stackIn_187_0;
                                    oa.a(-1, param0, 45);
                                    stackIn_190_0 = (wc.field_q > 0) ? 0 : 7;
                                    bj.field_m = stackIn_190_0;
                                    break L2;
                                  }
                                  if (nb.field_e != rh.field_c.field_z[rh.field_c.field_x]) {
                                    break L2;
                                  }
                                  bj.field_m = this.field_i;
                                  oa.a(7, param0, 43);
                                  break L2;
                                default:
                                  break L2;
                                case 22:
                                  if (this.field_b.b(-76)) {
                                    if (this.field_i != 9 &&
                                      6 != this.field_i) {
                                      if (tj.field_a + 1 < ia.field_m[fleas.field_E].length && (fleas.field_E != 0 ||
                                        !(wc.field_q <= 0) ||
                                        !(tj.field_a + 1 >= 15))) {
                                        oa.a(-1, param0, 101);
                                        break L2;
                                      }
                                      if (!qh.c((byte) 109)) {
                                        wi.field_p.a(-1);
                                      }
                                      m.field_b = null;
                                      oa.a(9, param0, -93);
                                    } else {
                                      if (qh.c((byte) 64)) {
                                        oa.a(6, param0, 81);
                                      } else {
                                        if (fleas.field_L == 0) {
                                          oa.a(2, param0, -66);
                                        } else {
                                          oa.a(5, param0, 29);
                                        }
                                      }
                                      break L2;
                                    }
                                  }
                                  break;
                                case 18:
                                  if (this.field_b.b(125)) {
                                    if (!(!this.a((byte) -94, param2))) {
                                      g.field_s = g.field_s + 1;
                                    }
                                    break L2;
                                  }
                                  break;
                                case 17:
                                  if (this.field_b.b(-23)) {
                                    if (!(!this.a((byte) -97, param2))) {
                                      g.field_s = g.field_s - 1;
                                    }
                                    break L2;
                                  }
                                  break;
                                case 10:
                                  if (this.field_b.b(107)) {
                                    nb.field_g = 2;
                                    break L2;
                                  }
                                  break;
                                case 8:
                                  if (this.field_b.b(116)) {
                                    nb.field_g = 0;
                                    break L2;
                                  }
                                  break;
                                case 7:
                                  if (this.field_b.b(-80)) {
                                    if (qh.c((byte) 68)) {
                                      if ((qh.c((byte) 72) ||
                                        !(wc.field_q > 0)) &&
                                        pc.a(true)) {
                                        stackIn_124_0 = 6;
                                      } else {
                                        stackIn_124_0 = 0;
                                      }
                                      oa.a(stackIn_124_0, param0, -84);
                                    } else {
                                      wi.field_p.a(-1);
                                      m.field_b = null;
                                      if (fleas.field_L == 0) {
                                        oa.a(2, param0, -70);
                                      } else {
                                        oa.a(5, param0, 57);
                                      }
                                    }
                                    if (wc.field_q > 0) {
                                      bj.field_m = 0;
                                    } else {
                                      if (!pc.a(true)) {
                                        bj.field_m = 0;
                                      } else {
                                        stackIn_131_0 = 7;
                                        bj.field_m = stackIn_131_0;
                                      }
                                    }
                                    break L2;
                                  }
                                  break;
                              }
                            }
                          }
                        } else {
                          var4 = gf.field_d;
                          if (this.field_b.g(-63)) {
                            ia.a(true, 0);
                          }
                          if (this.field_b.a((byte) -29)) {
                            ia.a(true, 256);
                          }
                          if (this.field_b.e(96)) {
                            nj.a(-9340);
                          }
                          if (this.field_b.a(-23670)) {
                            h.a(-32);
                          }
                          if (this.field_b.a(false)) {
                            f.field_G.c(103);
                            if (f.field_G.field_g) {
                              ia.a(true, f.field_G.field_A);
                            } else {
                              if (f.field_G.field_l <= ag.field_f) {
                                ia.a(true, 256);
                              } else {
                                ia.a(true, 0);
                              }
                            }
                          }
                          if (gf.field_d != var4) {
                            f.field_G.field_A = gf.field_d;
                            ik.a(wj.field_b[1], (byte) -84);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L2;
          }
          if (this.field_b.b(111)) {
            stackIn_48_0 = (var5 == 0) ? 0 : 1;
            fleas.field_E = stackIn_48_0;
            vf.e(-6359);
            oa.a(8, param0, -67);
          }
        }
    }

    private final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        int var4 = -12 % ((param2 + 6) / 33);
        for (var5 = 0; var5 < ia.field_p[this.field_i].length; var5++) {
          var6 = this.a(var5, (byte) 127);
          if (this.a((byte) 87, var5) &&
            !(this.b((byte) -13, var5) > param0) &&
            !(this.a(var5, -19631) <= param0) &&
            param1 >= var6 &&
            !(var6 + this.c(var5, 1205) <= param1)) {
            return var5;
          }
        }
        return -1;
    }

    final void a(byte param0) {
        StringBuilder discarded$0 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_42_0 = 0;
        int var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        this.e(-400);
        if (this.field_i == 7) {
          stackIn_4_0 = 26;
          stackIn_5_1 = (il.a((byte) 78)) ? false : true;
          var2 = si.a(stackIn_4_0, stackIn_5_1);
          if (var2 == 3) {
            if (null != rh.field_p) {
              lh.a(false);
            }
            il.a((byte) 77, rl.a((byte) -99));
          }
          if (var2 == 1) {
            oa.a(0, false, 40);
          }
          if (var2 != 2) {
            return;
          }
          oa.a(0, true, param0 - 134);
          return;
        }
        if (this.field_i == 0) {
          fleas.field_L = 0;
        }
        if (this.field_i == 8) {
          rh.field_c.e(param0 ^ 121);
          if (rh.field_c.field_J) {
            ll.d(param0 ^ 330);
          }
          if (0 <= rh.field_c.field_x &&
            rh.field_c.field_x < rh.field_c.field_z.length) {
            discarded$0 = new StringBuilder(rh.field_c.field_z[rh.field_c.field_x]);
          } else {
            pa.field_i[20] = hg.field_o;
          }
        }
        if (this.field_i == 3) {
          gj.field_A.field_t = fl.field_f;
          gj.field_A.c(106);
          fl.field_f = gj.field_A.field_t;
        }
        if (this.field_i == 10) {
          if (em.field_b <= 30) {
            if (0 < em.field_b) {
              wi.field_p.a(param0 - 150, em.field_b);
              em.field_b = 0;
            }
          } else {
            em.field_b = em.field_b - 30;
            wi.field_p.a(-116, 30);
          }
          wi.field_p.a(false);
          qh.field_y = qh.field_y + 1;
        }
        while (wf.b(-97)) {
          if (ji.field_a != 13) {
            this.b((byte) 72);
            if (-1 == this.field_b.field_k) {
              continue;
            }
            this.a(false, (byte) -44, this.field_b.field_k);
            continue;
          }
          if (1 == this.field_i) {
            oa.a(-1, false, -96);
            stackIn_42_0 = (wc.field_q <= 0) ? 7 : 0;
            bj.field_m = stackIn_42_0;
            continue;
          }
          if (6 == this.field_i) {
            continue;
          }
          oa.a(bj.field_m, false, 126);
        }
        this.field_b.b(112, this.a(pb.field_d, ob.field_e, (byte) 41), this.a(ag.field_f, kc.field_b, (byte) 103));
        if (param0 != 26) {
          this.b(-77, 70);
        }
        if (this.field_b.field_k != -1) {
          this.a(true, (byte) -99, this.field_b.field_k);
        }
        if (jk.field_r != 0) {
          this.field_g = pb.field_d;
          this.field_e = ob.field_e;
        }
    }

    public static void g(int param0) {
        if (param0 != 9973) {
          return;
        }
        field_c = null;
        field_h = null;
    }

    private final void b(byte param0) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        ik stackIn_56_0 = null;
        boolean stackIn_57_1 = false;
        int var2;
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        if (2 == this.field_i &&
          !qh.c((byte) 34)) {
          if (96 == ji.field_a) {
            if (this.field_b.field_k > 0) {
              if (this.field_b.field_k != 3) {
                this.field_b.a(-1 + this.field_b.field_k, (byte) -120);
              }
            } else {
              this.field_b.a(2, (byte) -102);
            }
          }
          if (ji.field_a == 97) {
            if (this.field_b.field_k < 2) {
              this.field_b.a(1 + this.field_b.field_k, (byte) -123);
            } else {
              if (2 == this.field_b.field_k) {
                this.field_b.a(0, (byte) -111);
              }
            }
          }
          if (ji.field_a == 99) {
            if (this.field_b.field_k >= 0 &&
              2 >= this.field_b.field_k) {
              this.field_b.a(3, (byte) -97);
            } else {
              this.field_b.a(nb.field_g, (byte) -117);
            }
          }
          if (ji.field_a == 98) {
            if (this.field_b.field_k != 3) {
              this.field_b.a(3, (byte) -106);
            } else {
              this.field_b.a(nb.field_g, (byte) -79);
            }
          }
          this.field_b.i(-13093);
          return;
        }
        if (this.field_i != 3) {
          if (8 == this.field_i) {
            if (ji.field_a != 96 &&
              ji.field_a != 97) {
              if (rh.field_c.field_i) {
                return;
              }
            } else {
              stackIn_56_0 = rh.field_c;
              stackIn_57_1 = !(rh.field_c.field_i);
              stackIn_56_0.field_i = stackIn_57_1;
            }
          }
          this.field_b.h(0);
          if (param0 < 21) {
            field_a = 42;
          }
          return;
        }
        stackIn_30_0 = (g.field_s != 0) ? 0 : 1;
        var2 = stackIn_30_0;
        stackIn_33_0 = (kb.field_k.length - 1 != g.field_s) ? 0 : 1;
        var3 = stackIn_33_0;
        if ((var2 != 0 ||
          var3 != 0) && (96 == ji.field_a ||
          97 == ji.field_a)) {
          this.field_b.c(-42);
          if (var2 != 0 &&
            this.field_b.field_k == 0) {
            this.field_b.c(-125);
            return;
          }
          if (var3 != 0 &&
            2 == this.field_b.field_k) {
            this.field_b.c(-78);
          }
          return;
        }
        this.field_b.c(-46);
        return;
    }

    private final void c(byte param0) {
        int discarded$0 = 0;
        int stackIn_6_0 = 0;
        dd[] stackIn_14_0 = null;
        int stackIn_15_1 = 0;
        dd[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        dd[] stackIn_23_0 = null;
        int stackIn_24_1 = 0;
        dd[] stackIn_26_0 = null;
        int stackIn_27_1 = 0;
        dd[] stackIn_31_0 = null;
        int stackIn_32_1 = 0;
        dd[] stackIn_41_0 = null;
        int stackIn_42_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fa var9;
        fa var10;
        int var3Lifetime1;
        var8 = fleas.field_A ? 1 : 0;
        var9 = ve.field_d;
        var10 = var9;
        this.b(2, g.field_s);
        var10.b(o.a((byte) 85, 1 + g.field_s, kb.field_k.length), 530, 110, 1, 16777215);
        ga.field_s[6][3] = 310;
        tl.field_p.c(v.field_R[g.field_s], 95, 145, 0, -1);
        for (var3 = 0; var3 < kb.field_k[g.field_s].length; var3++) {
          var9.a(kb.field_k[g.field_s][var3], 95 + ib.field_a[g.field_s][var3], ga.field_s[g.field_s][var3], -ib.field_a[g.field_s][var3] + 450, 50, 2105392, -1, 0, 0, var10.field_N);
        }
        stackIn_6_0 = ((19 & ni.field_j) >>> 4 != 0) ? 0 : 1;
        var3Lifetime1 = stackIn_6_0;
        var4 = (ni.field_j >>> 5) % se.field_a.length;
        if (param0 > -82) {
          discarded$0 = this.a(-42, 28);
        }
        if (g.field_s == 0) {
          gj.field_A.field_l = 265;
          gj.field_A.field_a = 320;
          gj.field_A.b((byte) -107);
        } else {
          boolean decompiledFrameRemainder0 = true;
          if (g.field_s == 1) {
            aj.field_t[2].d(105, ga.field_s[g.field_s][1] - 2);
            oj.a(ga.field_s[g.field_s][1] + 2, 0, 109, var4);
            aj.field_t[3].d(95, ga.field_s[g.field_s][2] + 1);
            aj.field_t[4].d(116, 1 + ga.field_s[g.field_s][2]);
            for (var5 = 4; var5 <= 6; var5++) {
              var6 = 88 + ib.field_a[g.field_s][var5];
              var7 = ga.field_s[g.field_s][var5] + 7;
              gb.f(var6, var7, 3, 1);
            }
          } else {
            if (2 == g.field_s) {
              aj.field_t[1].d(95, ga.field_s[g.field_s][1] + 3);
              aj.field_t[2].d(95, ga.field_s[g.field_s][2] + 3);
              oj.a(ga.field_s[g.field_s][2] + 7, 0, 99, var4);
              aj.field_t[3].d(95, ga.field_s[g.field_s][3] + 3);
              aj.field_t[11].d(95, ga.field_s[g.field_s][4] + 12);
              aj.field_t[5].d(95, 3 + ga.field_s[g.field_s][4]);
              aj.field_t[6].d(95, ga.field_s[g.field_s][5] + 6);
              stackIn_41_0 = aj.field_t;
              if (var3Lifetime1 != 0) {
                stackIn_42_1 = 8;
              } else {
                stackIn_42_1 = 9;
              }
              ((dd) (Object) stackIn_41_0[stackIn_42_1]).d(95, 6 + ga.field_s[g.field_s][6]);
            } else {
              if (g.field_s != 3) {
                if (g.field_s != 4) {
                  if ((g.field_s == 5 ||
                    g.field_s == 6)) {
                    for (var5 = 0; var5 < ga.field_s[g.field_s].length; var5++) {
                      var6 = ib.field_a[g.field_s][var5] + 88;
                      var7 = 7 + ga.field_s[g.field_s][var5];
                      gb.f(var6, var7, 3, 1);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  aj.field_t[19].d(95, 3 + ga.field_s[g.field_s][1]);
                  aj.field_t[20].d(111, 3 + ga.field_s[g.field_s][2]);
                  aj.field_t[23].d(95, 3 + ga.field_s[g.field_s][2]);
                  aj.field_t[21].d(95, ga.field_s[g.field_s][3] + 3);
                  stackIn_31_0 = aj.field_t;
                  if (var3Lifetime1 == 0) {
                    stackIn_32_1 = 26;
                  } else {
                    stackIn_32_1 = 22;
                  }
                  ((dd) (Object) stackIn_31_0[stackIn_32_1]).d(95, 6 + ga.field_s[g.field_s][4]);
                  aj.field_t[24].d(95, ga.field_s[g.field_s][5] + 3);
                  aj.field_t[25].d(95, 3 + ga.field_s[g.field_s][6]);
                }
              } else {
                aj.field_t[10].d(95, ga.field_s[g.field_s][1] + 3);
                stackIn_14_0 = aj.field_t;
                if (var3Lifetime1 != 0) {
                  stackIn_15_1 = 13;
                } else {
                  stackIn_15_1 = 27;
                }
                ((dd) (Object) stackIn_14_0[stackIn_15_1]).d(95, -5 + ga.field_s[g.field_s][2]);
                stackIn_17_0 = aj.field_t;
                if (var3Lifetime1 != 0) {
                  stackIn_18_1 = 14;
                } else {
                  stackIn_18_1 = 28;
                }
                ((dd) (Object) stackIn_17_0[stackIn_18_1]).d(95, ga.field_s[g.field_s][3] + 3);
                aj.field_t[30].d(95, ga.field_s[g.field_s][4] + 3);
                var5 = (int)((double)ni.field_j / 2.0 % 16.0 * 2.0);
                if (var5 > 16) {
                  var5 = -var5 + 32;
                }
                aj.field_t[15].d(95, ga.field_s[g.field_s][4] + (3 + var5));
                stackIn_23_0 = aj.field_t;
                if (var3Lifetime1 != 0) {
                  stackIn_24_1 = 16;
                } else {
                  stackIn_24_1 = 29;
                }
                ((dd) (Object) stackIn_23_0[stackIn_24_1]).d(95, 3 + ga.field_s[g.field_s][5]);
                stackIn_26_0 = aj.field_t;
                if (var3Lifetime1 != 0) {
                  stackIn_27_1 = 17;
                } else {
                  stackIn_27_1 = 31;
                }
                ((dd) (Object) stackIn_26_0[stackIn_27_1]).d(95, 3 + ga.field_s[g.field_s][6]);
                ql.a(var4, -121, ga.field_s[g.field_s][7] + 3, 95);
              }
            }
          }
        }
    }

    private final int a(int param0, byte param1) {
        if (this.field_i == 2 &&
          !qh.c((byte) 97)) {
          if (param0 < 3) {
            return ia.field_j[this.field_i];
          }
          return ia.field_j[this.field_i] + ia.field_r[this.field_i];
        }
        if (this.field_i == 3) {
          return ia.field_j[this.field_i];
        }
        if (param1 <= 117) {
          field_a = -121;
        }
        return ia.field_r[this.field_i] * param0 + ia.field_j[this.field_i];
    }

    t(int param0) {
        this.field_g = -1;
        this.field_f = -1;
        this.field_i = param0;
        this.field_b = new pl(ia.field_p[param0].length);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
