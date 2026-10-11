/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends qe {
    private rh field_r;
    static cn field_z;
    private rh field_v;
    private cn[] field_s;
    static boolean field_t;
    private int field_B;
    static int field_w;
    private cn[] field_A;
    private ae field_x;
    static int field_y;
    private tf[] field_u;

    private final void a(boolean param0, int param1) {
        int stackIn_10_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var3 = tg.field_f[this.field_B][param1];
        var4 = bh.b(param1, this.field_B, param0);
        var5 = qd.a(param1, 380, this.field_B);
        var6 = o.a(this.field_B, (byte) 122, param1);
        var7 = kf.a(param1, this.field_B, -96);
        if (!ke.a(105, var3) &&
          this.field_B != 3) {
          of.field_j.h(640 - of.field_j.field_y >> 1, var6);
          var6 += 4;
        } else {
          gf.e(var4 - 4, var6 - 6, var5 + (-var4 + 8), var7 + 8, 0);
          qc.b(var4, -2 + var6, var5 - var4, var7, 8421504, 128, 128);
          rp.a(4, var5 - var4, (byte) 108, var4, var7, kc.field_S, -2 + var6);
          qc.a(var4, var6 - 2, var5 - var4, var7, 224, 64, 3, 128);
        }
        if (var3 == 13 ||
          var3 == 14) {
          var8 = qi.field_b + 120;
          var9 = var5 - (-var4 + var8) >> 1;
          var9 = var9 + qi.field_b;
          if (var3 != 13) {
            stackIn_10_0 = 120 * ql.field_d / 256;
          } else {
            stackIn_10_0 = oo.field_d * 120 / 256;
          }
          var10 = stackIn_10_0;
          var11 = (var7 - bk.field_e.field_b) / 2;
          vd.a(120, 2, -14561, 2, var9, var11 + var6);
          jc.a(var7 - 6, var10 + var9 - 1, var6 + 3, 2, 2, 2);
        }
    }

    final void f() {
        int stackIn_10_0 = 0;
        if (this.field_b != null) {
          this.field_b.b(false);
          return;
        }
        if (ll.field_k &&
          qk.field_e[82] &&
          mm.field_t == 49) {
          stackIn_10_0 = (!ve.a(false)) ? 0 : 12;
          gd.a(stackIn_10_0, 0, -2, false);
        } else {
          this.field_x.d(0);
        }
    }

    private final int a(int param0, int param1) {
        int var3 = -74 % ((58 - param1) / 60);
        return o.a(this.field_B, (byte) 109, param0);
    }

    private final void c(int param0, int param1, int param2, int param3, int param4) {
        gf.b(param3, param1, param4, param2, 1, param0);
    }

    private final void c(int param0, int param1) {
        sf.d(-101, param0);
        go var3 = ik.field_e;
        if (var3 == null) {
          return;
        }
        if (param1 != -2) {
          this.field_v = (rh) null;
        }
        var3.field_D.d(param0);
        var3.field_L.d(param0);
    }

    final void a(boolean param0) {
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_43_0;
        boolean stackIn_43_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = DungeonAssault.field_K;
        super.a(param0);
        if (this.field_B == 12) {
          gf.a();
          if (!om.b(124)) {
            return;
          }
          he.e((byte) 87);
          return;
        }
        this.a((byte) -107);
        var2 = tg.field_h[this.field_B];
        var3 = 640 - tm.field_p.field_y >> 1;
        for (var4 = 0; this.field_x.field_i > var4; var4++) {
          if (this.d(var4, -7228)) {
            this.a(false, var4);
          }
        }
        if (8 != mn.field_b &&
          mn.field_b != 9) {
          le.field_f.h(4 + var3, -28 + var2);
          e.field_j.h(var3 + 198, -28 + var2);
          wj.field_w.h(var3 + 214, (-3 + this.field_x.field_i) * tg.field_d[this.field_B] + (var2 - 5));
          oj.field_a.h(var3 + 4, 293 + var2);
        } else {
          am.field_a.h(-(am.field_a.field_E / 2) + 320, 48);
        }
        if (8 != this.field_B) {
          if (9 != this.field_B) {
            if (this.field_B == 10) {
              this.b((byte) 59);
            } else {
              if (this.field_B == 11) {
                ne.field_c.a(ul.field_d, 80, 80, 480, 1000, 16777215, -1, 0, 0, ne.field_c.field_R);
              } else {
                if (this.field_B == 0) {
                  fp.field_d.a(320, 25, 1699);
                  if (ll.field_k) {
                    kk.field_l.c("Press CTRL-S to start a random single player debug test game", 320, 44, 16777215, 0);
                  }
                }
              }
            }
          } else {
            this.b(true, -11931);
          }
        } else {
          this.b(false, -11931);
        }
        if (this.field_b != null) {
          this.field_b.a((byte) -61);
        }
        oe.field_m.h(24, 383);
        oe.field_m.j(560, 383);
        if (!ib.a((byte) 40)) {
          qc.e();
        }
        for (var4Lifetime1 = 0; this.field_x.field_i > var4Lifetime1; var4Lifetime1++) {
          if (this.d(var4Lifetime1, -7228)) {
            stackIn_42_1 = var4Lifetime1;
            stackIn_42_2 = -31;
            if (this.field_x.field_b != var4Lifetime1) {
              stackIn_43_0 = this;
              stackIn_43_3 = false;
            } else {
              stackIn_43_0 = this;
              stackIn_43_3 = true;
            }
            this.a(stackIn_42_1, (byte) stackIn_42_2, stackIn_43_3);
          }
        }
        if (this.field_B == 8) {
          this.c(false, 127);
        } else {
          if (this.field_B == 9) {
            this.c(true, 127);
          }
        }
        if (this.field_b != null) {
          gf.g(0, 0, 640, 480);
          this.field_b.b(-113);
        }
        oh.a((byte) 113);
        this.field_r.d();
        this.field_v.d();
        return;
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        cf[] var6_ref_cf__;
        int var7;
        int var8;
        cf var8_ref_cf;
        int var9;
        var9 = DungeonAssault.field_K;
        var4 = tg.field_f[this.field_B][param1];
        if (param0 >= -101) {
          field_w = 68;
        }
        if (this.field_x.c(31) &&
          this.d(param1, -7228) &&
          rp.a(15204376, var4)) {
          hm.a(var4, param1, param2, -28);
        }
        var6 = var4;
        if (var6 == 13) {
          var5 = 0;
          if (this.field_x.b(-1) &&
            oo.field_d > 0) {
            var5 = 1;
            this.c(0, -2);
          }
          if (this.field_x.a(false) &&
            256 > oo.field_d) {
            var5 = 1;
            this.c(256, -2);
          }
          if (this.field_x.b((byte) -48)) {
            var6 = -120 + (this.e(param1, 82) + this.f(-77, param1)) + qi.field_b >> 1;
            var7 = hj.field_S - var6;
            var8 = 256 * var7 / 120;
            if (var8 <= 0) {
              this.c(0, -2);
            } else {
              if (var8 >= 256) {
                this.c(256, -2);
              } else {
                this.c(var8, -2);
              }
            }
            var5 = 1;
          }
          if (this.field_x.a(0) &&
            oo.field_d > 0) {
            ig.c(-89);
            var5 = 1;
          }
          if (this.field_x.c((byte) 109) &&
            256 > oo.field_d) {
            m.b((byte) 64);
            var5 = 1;
          }
          if (var5 != 0 && (!this.field_x.b((byte) 127) ||
            !(mo.field_a <= ia.field_X))) {
            var6_ref_cf__ = eb.field_O;
            var7 = oi.b(0, var6_ref_cf__.length);
            var8_ref_cf = var6_ref_cf__[var7];
            cf.a(100, var8_ref_cf.field_e, var8_ref_cf.field_a << 2);
            ia.field_X = 20 + mo.field_a;
          }
        } else {
          if (var6 == 14) {
            if (this.field_x.b(-1)) {
              um.a(0, false);
            }
            if (this.field_x.a(false)) {
              um.a(256, false);
            }
            if (this.field_x.b((byte) -87)) {
              var6 = -120 + (this.e(param1, 82) + (this.f(76, param1) + qi.field_b)) >> 1;
              var7 = hj.field_S - var6;
              var8 = 256 * var7 / 120;
              if (var8 > 0) {
                if (var8 >= 256) {
                  um.a(256, false);
                } else {
                  um.a(var8, false);
                }
              } else {
                um.a(0, false);
              }
            }
            if (this.field_x.a(0)) {
              jd.b(true);
            }
            if (this.field_x.c((byte) 66)) {
              mi.b(210041889);
            }
          }
        }
    }

    private final cn a(int param0, q param1) {
        RuntimeException var3 = null;
        cn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 120) {
            this.f();
          }
          stackIn_3_0 = this.a(param1.a(), 320);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = DungeonAssault.field_K;
        for (var4 = 0; var4 < tg.field_f[this.field_B].length; var4++) {
          var5 = this.a(var4, 125);
          if (this.d(var4, -7228) &&
            this.e(var4, 82) <= param2 &&
            this.f(97, var4) > param2 &&
            var5 <= param0 &&
            param0 < var5 + this.b(394, var4)) {
            return var4;
          }
        }
        if (!param1) {
          this.b(true, -7);
        }
        return -1;
    }

    private final void a(byte param0) {
        if (param0 > -91) {
          this.a((byte) 26, 60, true);
        }
        this.field_e.b(0, 0);
    }

    private final boolean d(int param0, int param1) {
        if (param1 != -7228) {
          return false;
        }
        return sg.a(3, this.field_B, param0);
    }

    private final void a(byte param0, int param1) {
        int var3 = tg.field_f[this.field_B][param1];
        String var4 = ui.a(var3, 19435);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_H + ne.field_c.field_E;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        if (param0 != -125) {
          return;
        }
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        this.field_A[param1] = rb.a(8, var7, 16760960, (byte) 105);
        this.field_s[param1] = rb.a(16, var7, 6307840, (byte) -124);
    }

    private final void b(boolean param0, int param1) {
        this.c(param1 ^ -11995, 90, 94, 82, 476);
        this.c(64, 186, 180, 82, 142);
        if (param1 != -11931) {
          return;
        }
        this.c(param1 + 11995, 186, 180, 226, 332);
        cg.field_a.a(320, 25, 1699);
    }

    final void c() {
        super.c();
        um.field_g = null;
        this.field_s = null;
        fj.field_f = null;
        this.field_A = null;
        ud.field_s = null;
        this.field_u = null;
        if (dd.field_E != null) {
          dd.field_E.b((byte) 30);
          dd.field_E = null;
        }
        if (nj.field_f != null) {
          nj.field_f.b(-4);
          nj.field_f = null;
        }
        u.field_P = -1;
        tf.field_j = null;
    }

    private final cn a(cn param0, int param1) {
        RuntimeException var3 = null;
        cn var4 = null;
        cn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jh.c();
          var4 = new cn(param0.field_E >> 1, param0.field_G >> 1);
          var4.e();
          param0.b(param0.field_E >> 3, param0.field_G >> 3, param0.field_E >> 2, param0.field_G >> 2, 16777215);
          if (param1 != 320) {
            this.field_A = (cn[]) null;
          }
          var4.d(16777215);
          var4.e();
          param0.b(param0.field_E >> 3, param0.field_G >> 3, param0.field_E >> 2, param0.field_G >> 2, 0);
          jh.b();
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qc.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -117 % ((46 - param1) / 42);
          if (param0 >= ib.field_d * (-1 + ib.field_j)) {
            var4 = param0 - (-1 + ib.field_j) * ib.field_d;
            var5 = var4 + ib.field_j;
          } else {
            var4 = param0 % (-1 + ib.field_j) + param0 / (-1 + ib.field_j) * ib.field_j;
            var5 = var4 + 1;
          }
          if (param2[var4] < param2[var5]) {
            stackIn_6_0 = param2[var4];
          } else {
            stackIn_6_0 = param2[var5];
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_z = null;
        if (param0 != 0) {
          field_w = 61;
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 394) {
          return 54;
        }
        return kf.a(param1, this.field_B, -116);
    }

    private final void c(boolean param0, int param1) {
        int discarded$0 = 0;
        String[] array$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var16 = 0;
        int stackIn_31_0 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_40_0 = 0;
        String[] stackIn_42_0 = null;
        String[] stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_45_2 = 0;
        String stackIn_46_3 = null;
        String[] stackIn_63_0 = null;
        String stackIn_64_1 = null;
        int var3;
        hm var4;
        int[] var4_array;
        cn var5_ref_cn;
        int var5;
        cn var6_ref_cn;
        int var6;
        String var7;
        int var8;
        StringBuilder var9;
        Object var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var17;
        String[] var18;
        int[] var19;
        int[] var20;
        String[] var21;
        int[] var22;
        int var3Lifetime1;
        int var12Lifetime1;
        Object var10Lifetime1;
        Object var10Lifetime2;
        var17 = DungeonAssault.field_K;
        if (param1 < 114) {
          discarded$0 = this.e(6, 36);
        }
        if (nj.field_f != null) {
          gf.a(kd.field_g);
          gf.e(94, 90, 546, 184);
          var3 = ig.b(31131);
          var4 = (hm) (nj.field_f.e(-24172));
          while (var4 != null) {
            var5_ref_cn = f.field_a;
            if (var4.field_r) {
              if (var4.field_i != u.field_P) {
                tf.field_j = ec.field_j[var4.field_i].a();
                u.field_P = var4.field_i;
              }
              var5_ref_cn = tf.field_j;
            }
            var5_ref_cn.e(94 + var4.field_o - var3, var4.field_p);
            if (var4.field_r) {
              var6_ref_cn = ud.field_s[var4.field_i];
            } else {
              var6_ref_cn = ud.field_s[46];
            }
            if (var4.field_i == kg.field_f) {
              um.field_g.field_g = -var3 + 94 + (16 + var4.field_o);
              um.field_g.field_b = var4.field_p + 32;
              if (0 == (li.field_k & 1)) {
                um.field_g.a(var6_ref_cn, -12, 32);
              } else {
                um.field_g.a();
              }
            }
            if (ak.field_n == var4.field_i) {
              fj.field_f.field_b = 32 + var4.field_p;
              fj.field_f.field_g = 94 - var3 + 16 + var4.field_o;
              if ((1 & li.field_k) != 0) {
                fj.field_f.a();
              } else {
                fj.field_f.a(var6_ref_cn, -12, 32);
              }
            }
            var4 = (hm) (nj.field_f.a(4));
          }
          gf.b(kd.field_g);
        }
        if (null != dd.field_E &&
          dd.field_E.field_w) {
          dd.field_E.d(0);
        }
        if (kg.field_f == -1) {
          stackIn_31_0 = ak.field_n;
        } else {
          stackIn_31_0 = kg.field_f;
        }
        var3Lifetime1 = stackIn_31_0;
        if (param0) {
          stackIn_34_0 = bp.field_e;
        } else {
          stackIn_34_0 = gj.field_c;
        }
        var22 = stackIn_34_0;
        var20 = var22;
        var19 = var20;
        var4_array = var19;
        if (var3Lifetime1 != -1) {
          stackIn_40_0 = (!vl.a(var3Lifetime1, -121, var22)) ? 0 : 1;
          var5 = stackIn_40_0;
          var6 = la.field_b.field_E + la.field_b.field_H;
          array$1 = new String[3];
          stackIn_42_0 = array$1;
          stackIn_42_1 = array$1;
          stackIn_42_2 = 1;
          if (var5 != 0) {
            stackIn_43_3 = 8454016;
          } else {
            stackIn_43_3 = 16744576;
          }
          stackIn_42_1[stackIn_42_2] = Integer.toString(stackIn_43_3, 16);
          stackIn_45_2 = 2;
          if (var5 != 0) {
            stackIn_46_3 = fa.field_m;
          } else {
            stackIn_46_3 = fi.field_x;
          }
          stackIn_42_0[stackIn_45_2] = stackIn_46_3;
          var7 = jk.a(stackIn_42_0, f.field_b, 30496);
          var10 = var7;
          var10Lifetime1 = var7;
          db.field_v.b(var7, 239, var6 + 195, 16777215, -1);
          var8 = 210;
          if (var5 != 0) {
            ec.field_j[var3Lifetime1].a(89, var8);
          } else {
            f.field_a.h(89, var8);
          }
          var8 = var8 + la.field_b.field_H;
          var8 = var8 + la.field_b.field_H;
          var9 = new StringBuilder(bb.field_k[var3Lifetime1]);
          if (null != gm.field_d &&
            var5 == 0) {
            var10Lifetime2 = null;
            if (var3Lifetime1 == 18) {
              if (0 < gm.field_d.field_u) {
                stackIn_63_0 = new String[]{Integer.toString(gm.field_d.field_u)};
                if (gm.field_d.field_u == 1) {
                  stackIn_64_1 = i.field_y;
                } else {
                  stackIn_64_1 = ji.field_H;
                }
                var10Lifetime2 = jk.a(stackIn_63_0, stackIn_64_1, 30496);
              }
            } else {
              if (var3Lifetime1 != 41) {
                if (var3Lifetime1 == 42 &&
                  df.a((byte) -38) < gm.field_d.field_p &&
                  gm.field_d.field_p >= gm.field_d.field_i) {
                  var10Lifetime2 = jk.a(new String[]{np.b(3, gm.field_d.field_p), np.b(3, gm.field_d.field_i)}, wl.field_b, 30496);
                }
              } else {
                var10Lifetime2 = jk.a(new String[]{ve.a(1, (long)gm.field_d.field_g, -17311, hc.field_d, true)}, fn.field_q, 30496);
              }
            }
            if (var10Lifetime2 != null) {
              discarded$2 = var9.append("<br><br>");
              discarded$3 = var9.append((String) (var10Lifetime2));
            }
          }
          var18 = new String[16];
          var21 = var18;
          var11 = la.field_b.a(var9.toString(), new int[]{306}, var21);
          for (var12 = 0; var12 < var11; var12++) {
            la.field_b.b(var18[var12], 239, var8, 16777215, -1);
            var8 = var8 + var6;
          }
          var12Lifetime1 = 355 - cf.field_f.field_G;
          var13 = (2 * var12Lifetime1 + cf.field_f.field_G) / 2 + ne.field_c.field_E;
          gf.b(239, var12Lifetime1 - 6, 306, 8421504);
          la.field_b.b(op.field_a + sg.field_c[var3Lifetime1], 239, var13, 16777215, -1);
          var14 = 120;
          la.field_b.b(mp.field_f, var14 + 239, var13, 16777215, -1);
          var15 = 239 + var14 + la.field_b.b(mp.field_f);
          for (var16 = 0; sg.field_d[var3Lifetime1] > var16; var16++) {
            cf.field_f.h(var15, var12Lifetime1);
            var15 = var15 + cf.field_f.field_y / 3;
          }
        } else {
          la.field_b.c(ql.field_h, 392, 260, 16777215, -1);
          if (ed.c(true)) {
            var5 = 300;
            db.field_v.a(ld.field_a, 239, var5, 306, 100, 16777215, -1, 1, 0, db.field_v.field_H);
          }
        }
    }

    private final void a(int param0, byte param1, boolean param2) {
        boolean stackIn_16_0 = false;
        boolean stackIn_17_1 = false;
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12_int;
        int[] var12;
        int var13;
        var4 = tg.field_f[this.field_B][param0];
        var5 = ui.a(var4, 19435);
        var6 = ne.field_c.b(var5);
        if (param1 != -31) {
          this.field_x = (ae) null;
        }
        var7 = bh.b(param0, this.field_B, false);
        var8 = qd.a(param0, 380, this.field_B);
        var9 = o.a(this.field_B, (byte) 105, param0);
        if (var4 == 13 ||
          var4 == 14) {
          var6 = 120 + qi.field_b;
        }
        kf.a(param0, this.field_B, param1 - 46);
        var10 = -var6 + var8 + var7 >> 1;
        if (!ke.a(param1 + 105, var4) &&
          this.field_B != 3) {
          var9 += 4;
        }
        var11 = rp.a(param1 + 15204407, var4) ? 1 : 0;
        if (20 == var4 &&
          -1 != this.field_x.field_b &&
          tg.field_f[this.field_B].length > this.field_x.field_b) {
          var12_int = tg.field_f[this.field_B][this.field_x.field_b];
          stackIn_16_0 = param2;
          stackIn_17_1 = (rp.a(15204376, var12_int)) ? false : true;
          param2 = stackIn_16_0 | stackIn_17_1;
        }
        if (!param2) {
          if (var11 == 0) {
            var12 = tf.field_k;
          } else {
            var12 = ag.field_c;
          }
        } else {
          if (var11 != 0) {
            var12 = ml.field_b;
          } else {
            var12 = ug.field_E;
          }
        }
        if (null == this.field_u[param0] ||
          this.field_u[param0].field_f != var5 &&
          !this.field_u[param0].field_f.equals(var5) ||
          this.field_u[param0].field_h != var12) {
          this.field_u[param0] = new tf(ne.field_c, var5, var12);
          this.field_A[param0] = null;
        }
        this.field_u[param0].b(var9, 32, var10);
        if (var11 == 0) {
          hj.field_T.h(-20 + var10, ne.field_c.field_H + (var9 - 15));
        }
        if (param2) {
          if (null == this.field_A[param0]) {
            this.a((byte) -125, param0);
          }
          this.field_A[param0].b(var10, var9, 64);
          var13 = (int)(128.0 * (1.0 + te.a(mo.field_a)));
          if (0 > var13) {
            var13 = 0;
          }
          if (var13 > 256) {
            var13 = 256;
          }
          this.field_s[param0].b(var10, var9, var13);
        }
    }

    private final int f(int param0, int param1) {
        int var3 = -3 % ((param0 + 21) / 56);
        return qd.a(param1, 380, this.field_B);
    }

    final void b(boolean param0) {
        int var3_int = 0;
        int stackIn_6_0 = 0;
        int stackIn_18_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        boolean stackIn_67_0 = false;
        int var2;
        cn var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        hm var14;
        int var15;
        int[] var16;
        int[] var17;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        var15 = DungeonAssault.field_K;
        super.b(param0);
        if (this.field_B == 0) {
          o.a(121);
          if (ed.c(true)) {
            gm.field_d = null;
          }
        }
        fk.a((byte) 121, lf.field_w);
        stackIn_6_0 = (this.field_x.field_i > 0) ? 0 : -1;
        var2 = stackIn_6_0;
        if (-1 != this.field_x.field_b) {
          var2 = this.field_x.field_b;
        }
        this.field_x.a(false, param0, var2, this.a(eh.field_h, true, hj.field_S));
        kg.field_f = -1;
        um.field_g = null;
        fj.field_f = null;
        ia.field_X = mo.field_a;
        ak.field_n = -1;
        if (this.field_B == 8 ||
          this.field_B == 9) {
          ud.field_s = new cn[47];
          u.field_P = -1;
          for (var3_int = 0; var3_int < 46; var3_int++) {
            ud.field_s[var3_int] = this.a(120, ec.field_j[var3_int]);
          }
          jh.c();
          var3 = new cn(64, 64);
          var3.e();
          gf.h(32, 31, 14, 16777215);
          ud.field_s[46] = var3;
          jh.b();
          stackIn_18_0 = (9 != this.field_B) ? 0 : 1;
          var4 = stackIn_18_0;
          if (var4 != 0) {
            stackIn_21_0 = bp.field_e;
          } else {
            stackIn_21_0 = gj.field_c;
          }
          var17 = stackIn_21_0;
          var16 = var17;
          var5 = var16;
          nj.field_f = new md();
          var6 = 0;
          for (var7 = 0; var7 < 46; var7++) {
            stackIn_26_0 = (!vl.a(var7, -124, var17)) ? 0 : 1;
            var8 = stackIn_26_0;
            if (var4 == 0) {
              stackIn_35_0 = (vl.a(var7, -63, ia.field_P)) ? 0 : 1;
              var9 = stackIn_35_0;
              if (var9 != 0 ||
                var8 != 0) {
                var6++;
                nj.field_f.a(new hm(var7, var8 != 0), false);
              }
            } else {
              if (var8 != 0) {
                nj.field_f.a(new hm(var7, var8 != 0), false);
                var6++;
              }
            }
          }
          if (var6 >= 8) {
            stackIn_45_0 = (1 + var6) / 2;
          } else {
            stackIn_45_0 = var6;
          }
          var7Lifetime1 = stackIn_45_0;
          stackIn_48_0 = (0 == (var6 & 1)) ? 0 : 1;
          var8Lifetime1 = stackIn_48_0;
          var9Lifetime1 = 0;
          if (var7Lifetime1 <= 11) {
            var9Lifetime2 = (8 + (-(var7Lifetime1 * 40) + 452)) / 2;
          } else {
            dd.field_E = new dd(82, 176, 0, 476, 65536, 0);
            var9Lifetime2 = 12;
          }
          of.field_l = 0;
          var10 = var9Lifetime2;
          var11 = 100;
          var12 = 0;
          var13 = 0;
          var14 = (hm) (nj.field_f.e(-24172));
          while (var14 != null) {
            var14.field_o = var10;
            var14.field_p = var11;
            var13 += 40;
            var10 += 40;
            if (var13 > of.field_l) {
              of.field_l = var13;
            }
            var14 = (hm) (nj.field_f.a(4));
            var12++;
            if (var12 != var7Lifetime1) {
              continue;
            }
            var13 = 0;
            var10 = var9Lifetime2;
            if (var8Lifetime1 != 0) {
              var10 += 20;
              var13 += 20;
            }
            var11 += 40;
          }
        }
        this.field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        this.field_v = new rh(580, 394, 80, 160, 255, 197376, 240);
        this.field_s = new cn[this.field_x.field_i];
        this.field_u = new tf[this.field_x.field_i];
        this.field_A = new cn[this.field_x.field_i];
        jh.a(this.field_e);
        stackIn_67_0 = (mn.field_b != 8) && (9 != mn.field_b);
        bf.a(stackIn_67_0, -128);
        gf.a(kd.field_g);
        gf.e(41, 48, 599, 416);
        if (mn.field_b != 8 &&
          mn.field_b != 9) {
          tm.field_p.h(640 - tm.field_p.field_y >> 1, 0);
        }
        gf.b(kd.field_g);
        jh.b();
    }

    final void c(boolean param0) {
        boolean stackIn_5_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_44_0 = 0;
        int var2;
        int var3;
        int var4;
        pk var5;
        var4 = DungeonAssault.field_K;
        super.c(param0);
        if (12 == this.field_B) {
          stackIn_5_0 = !(kk.d(0));
          var2 = hm.a(stackIn_5_0, (byte) -20);
          if (var2 == 3) {
            if (null != cm.field_R) {
              ib.a(930);
            }
            sf.a(false, m.c(true));
          }
          if (var2 == 1) {
            gd.a(dc.field_z, 0, 0, false);
          }
          if (var2 == 2) {
            gd.a(dc.field_z, 0, 0, true);
          }
          return;
        }
        if (!kh.field_s ||
          !param0) {
          while (ha.b((byte) 47)) {
            if (mm.field_t != 13) {
              this.f();
              if (this.field_x.field_b == -1) {
                continue;
              }
              this.a((byte) -127, this.field_x.field_b, false);
              continue;
            }
            if (this.field_B == 1) {
              stackIn_28_0 = (ve.a(false)) ? 12 : 0;
              gd.a(stackIn_28_0, 0, -1, false);
              continue;
            }
            if (mn.field_b == 10) {
              continue;
            }
            if (0 == mn.field_b) {
              continue;
            }
            gd.a(g.field_Hb, 0, g.field_Hb, false);
          }
          if (!this.d()) {
            this.field_x.a(-7734, this.a(hm.field_k, true, lc.field_c), this.a(eh.field_h, true, hj.field_S));
            if (this.field_x.field_b != -1) {
              this.a((byte) -112, this.field_x.field_b, true);
            }
          }
        }
        if (null != this.field_b &&
          this.field_b.field_d) {
          var5 = (pk) (this.field_b);
          var3 = var5.field_r ? 1 : 0;
          this.field_b.c(-121);
          this.field_b = null;
          if (var3 == 0) {
            stackIn_44_0 = (!ve.a(false)) ? 0 : 12;
            gd.a(stackIn_44_0, 0, -3, false);
          } else {
            tl.field_d = false;
            ik.a(ve.field_c, 89, -3);
          }
        }
        if (this.field_B == 8 ||
          this.field_B == 9 ||
          10 == mn.field_b) {
          ra.a(0);
        }
    }

    private final void b(byte param0) {
        int discarded$0 = 0;
        int var2 = en.a(-1, bp.field_e) ? 1 : 0;
        String var3 = kp.field_d;
        if (param0 <= 49) {
          discarded$0 = this.a(-114, 14);
        }
        var3 = var3 + " " + tg.a('#', jk.a(new String[]{jg.field_e}, g.a(false, false, (byte) -111, var2 != 0), 30496), 3, "<br><br>");
        ne.field_c.a(var3, 80, 80, 480, 10 * ne.field_c.field_R, 16777215, -1, 1, 0, ne.field_c.field_R);
    }

    private final int e(int param0, int param1) {
        if (param1 != 82) {
          this.field_u = (tf[]) null;
        }
        return bh.b(param0, this.field_B, false);
    }

    qc(int param0) {
        this.field_B = param0;
        this.field_x = new ae(tg.field_f[this.field_B].length);
    }

    static {
        field_y = -1;
    }
}
