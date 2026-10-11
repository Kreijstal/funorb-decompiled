/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends qe {
    private cn field_I;
    private cn field_z;
    private tf field_B;
    private boolean field_E;
    private cn field_A;
    private cn field_u;
    static int[] field_r;
    static String field_s;
    private int field_C;
    static int[] field_J;
    private int field_t;
    static qh[] field_w;
    private int field_G;
    static tf field_x;
    private rh field_D;
    static String field_v;
    private wd field_F;
    private rh field_y;

    private final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        int var6;
        int var9;
        int var7;
        int var8;
        var9 = DungeonAssault.field_K;
        var4 = 0;
        for (var5 = 0; var5 < 2; var5++) {
          var6 = 0;
          while (var6 < 4) {
            var7 = var6 * 102 + 195;
            var8 = 104 * var5 + 60;
            if (var5 == 2) {
              var7 += 51;
            }
            if (var7 <= param2 &&
              param1 >= var8 &&
              param2 < 96 + var7 &&
              var8 + 96 > param1) {
              return var4;
            }
            if (var4 != 7) {
              var6++;
              var4++;
              continue;
            }
            break;
          }
        }
        if (param0 == -1) {
          return -1;
        }
        return 95;
    }

    final void c() {
        this.field_A = null;
        this.field_u = null;
        j.field_Q = null;
        ld.field_e = null;
        this.field_z = null;
        this.field_I = null;
        System.gc();
    }

    private final void d(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        var3 = DungeonAssault.field_K;
        if (gm.field_d.field_s >= ac.field_s) {
          if (!ed.c(true)) {
            ac.field_B.d((byte) -112, 56);
            for (var2 = 0; var2 < 8; var2++) {
              if (um.field_i[var2] == gm.field_d.field_a[var2]) {
                ac.field_B.a(6, -1);
              } else {
                if (um.field_i[var2] == null) {
                  ac.field_B.a(6, 0);
                } else {
                  ac.field_B.a(6, um.field_i[var2].field_c);
                }
              }
            }
          }
          var4 = 0;
          var2Lifetime1 = var4;
          while (8 > var4) {
            gm.field_d.field_a[var4] = um.field_i[var4];
            var4++;
          }
          gm.field_d.field_s = gm.field_d.field_s - ac.field_s;
          this.d(1793);
        }
        if (!param0) {
          field_r = (int[]) null;
        }
        ho.b((byte) -36);
    }

    final void a(boolean param0) {
        int var5_int = 0;
        cn stackIn_36_0 = null;
        Object var2;
        Object var3;
        rj var4;
        h var5;
        int var6;
        int var7;
        cn var8;
        int var9;
        rj var4Lifetime1;
        var9 = DungeonAssault.field_K;
        super.a(param0);
        this.field_e.b(0, 0);
        this.b(-123);
        var2 = null;
        if (this.field_t != -1 &&
          null != um.field_i[this.field_t]) {
          var2 = um.field_i[this.field_t];
        } else {
          if (this.field_C != -1 &&
            um.field_i[this.field_C] != null) {
            var2 = um.field_i[this.field_C];
          }
        }
        var3 = null;
        if (var2 == null) {
          if (op.field_d.field_l != null) {
            var3 = ((u) (op.field_d.field_l)).field_Q;
          }
        } else {
          var3 = ((hb) (var2)).field_n;
        }
        if (var2 != null) {
          ih.a(216, 275, (hb) (var2));
        } else {
          ih.a(216, 275, this.field_F, kc.field_S);
        }
        if (var2 == null) {
          ih.a(339, 289, (h) (var3));
        } else {
          ih.a(339, 289, (hb) (var2), 0);
        }
        this.b(286, 144, 476);
        var4 = (rj) (this.field_p.e(-24172));
        while (var4 != null) {
          var4.a(93);
          var4 = (rj) (this.field_p.a(4));
        }
        ad.field_e.h(188, 48);
        ad.field_e.i(188, -ad.field_e.field_b + 40);
        ad.field_e.i(460, -ad.field_e.field_b + 40);
        ad.field_e.f(-ad.field_e.field_d - be.field_o.field_d + 460, -ad.field_e.field_b + 40);
        oe.field_m.h(171, 360);
        oe.field_m.j(-oe.field_m.field_d + 620, 360);
        if (null != this.field_b) {
          this.field_b.a((byte) -101);
        }
        ih.e();
        this.field_q.a((byte) -40);
        var4Lifetime1 = (rj) (this.field_p.e(-24172));
        while (var4Lifetime1 != null) {
          var4Lifetime1.d(0);
          var4Lifetime1 = (rj) (this.field_p.a(4));
        }
        this.g(0);
        this.field_y.d();
        this.field_D.d();
        if (this.field_b != null) {
          for (var5_int = 0; gf.field_b.length > var5_int; var5_int++) {
            gf.field_b[var5_int] = nb.a(-50529028, gf.field_b[var5_int]) >>> 2;
          }
          this.field_b.b(108);
        }
        if (kn.field_g) {
          ab.a(0);
        }
        if (null != op.field_d.field_l) {
          var5 = ((u) (op.field_d.field_l)).field_Q;
          var6 = hj.field_S;
          var7 = eh.field_h - 40;
          rp.a(8, 40, (byte) 108, var6, 40, kc.field_S, var7);
          if (null != var5.field_e) {
            stackIn_36_0 = var5.field_e.a(40, 0, 40, 0);
          } else {
            stackIn_36_0 = null;
          }
          var8 = stackIn_36_0;
          if (var8 == null) {
            gf.b(var6, var7, 40, 40, 0, 128);
          } else {
            var8.d(var6, var7, 128);
          }
        }
        oh.a((byte) 99);
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = DungeonAssault.field_K;
        try {
          var10 = (CharSequence) ((Object) param2);
          var3_int = rm.a((byte) 105, var10, param1);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          if (param0 < 18) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ih.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        hb stackIn_30_0 = null;
        int stackIn_49_0 = 0;
        int var2;
        hb var2_ref_hb;
        wb[] var3;
        hb var3_ref;
        en var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        wb var13;
        int var14;
        hb var15;
        wb[] var16;
        hb var17;
        h var18;
        h var19;
        hb var20;
        h var21;
        var14 = DungeonAssault.field_K;
        this.field_t = -1;
        if (kn.field_g &&
          od.a((byte) -52)) {
          return;
        }
        if (param0 != -24900) {
          this.c(true);
        }
        if (super.d()) {
          return;
        }
        this.field_t = this.a(-1, eh.field_h, hj.field_S);
        if (this.field_t != -1 &&
          null != um.field_i[this.field_t]) {
          var15 = um.field_i[this.field_t];
          if (ld.field_e != var15) {
            j.field_Q = (en) ((Object) new fc((pj) null, var15));
            ld.field_e = var15;
          }
          var16 = var15.field_i;
          var3 = var16;
          var4 = j.field_Q;
          if (var3 != null) {
            var5 = this.field_t / 4;
            var6 = 3 & this.field_t;
            var7 = 102 * var6 + 195;
            var8 = 60 + var5 * 104;
            var8 += 78;
            var9 = 7;
            var7 += 78;
            var10 = var7;
            var11 = var8;
            var12 = 0;
            while (var12 < var16.length) {
              var13 = var16[var12];
              if (jg.a(false, var10, 12, 12, var11)) {
                var4 = var13.a();
              }
              var10 -= 16;
              var12++;
              if (var12 % var9 != 0) {
                continue;
              }
              var11 -= 16;
              var10 = var7;
            }
          }
          uj.a(var4, 95);
        }
        L7: {
          if (hh.field_s != sn.field_b) {
            if (hh.field_s == nl.field_a) {
              this.d(param0 + 26693);
              this.a((byte) -125, true);
            } else {
              if (in.field_y != hh.field_s) {
                if (hh.field_s != null &&
                  hh.field_s instanceof u) {
                  var18 = ((u) (hh.field_s)).field_Q;
                  this.a((byte) -112, -1);
                  if (null == this.field_F ||
                    var18.field_t != this.field_F.field_n) {
                    this.field_F = new wd(var18.field_e, var18.field_t, rf.field_M);
                    if (null == var18.field_p) {
                      break L7;
                    }
                    gd.a(64, var18.field_p);
                  }
                  break L7;
                }
                if (hh.field_s == hl.field_b) {
                  this.a(0, 0);
                } else {
                  if (hh.field_s == hi.field_a) {
                    this.a(1, 0);
                  } else {
                    if (hh.field_s != kl.field_h) {
                      if (cd.field_d == hh.field_s) {
                        this.a(5, 0);
                      } else {
                        if (hh.field_s == am.field_f) {
                          this.a(6, 0);
                        } else {
                          stackIn_49_0 = no.field_d;
                          if (stackIn_49_0 != 1) {
                            if (2 == no.field_d) {
                              var2 = this.a(-1, hm.field_k, lc.field_c);
                              if (var2 != -1) {
                                um.field_i[var2] = gm.field_d.field_a[var2];
                                if (null != um.field_i[var2] &&
                                  um.field_i[var2].field_b == null) {
                                  um.field_i[var2].field_b = new wd(um.field_i[var2].field_n.field_e);
                                }
                                ho.b((byte) -36);
                              }
                              this.field_F = null;
                              this.a((byte) -112, -1);
                              op.field_d.a((byte) 80);
                            }
                          } else {
                            var2 = this.a(-1, hm.field_k, lc.field_c);
                            if (-1 != var2) {
                              if (op.field_d.field_l == null) {
                                if (um.field_i[var2] != null) {
                                  op.field_d.a((byte) 80);
                                  this.field_F = null;
                                  this.a((byte) -112, var2);
                                  var20 = um.field_i[this.field_C];
                                  var3_ref = var20;
                                  var21 = var20.field_n;
                                  if (var3_ref != null &&
                                    var20.field_p != 255 &&
                                    var21.field_u != var20.field_b.field_n) {
                                    var20.field_b.a(124, var21.field_u);
                                    if (var20.field_n.field_p != null) {
                                      gd.a(param0 ^ -24836, var21.field_p);
                                    }
                                  }
                                }
                              } else {
                                var19 = ((u) (op.field_d.field_l)).field_Q;
                                um.field_i[var2] = new hb(var2, var19.field_w);
                                um.field_i[var2].field_b = new wd(var19.field_e);
                                ho.b((byte) -36);
                                op.field_d.a((byte) 80);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      this.a(2, param0 ^ -24900);
                    }
                  }
                }
              } else {
                if (-1 == this.field_C) {
                  stackIn_30_0 = null;
                } else {
                  stackIn_30_0 = um.field_i[this.field_C];
                }
                var17 = stackIn_30_0;
                var2_ref_hb = var17;
                if (var2_ref_hb != null) {
                  um.field_i[this.field_C] = new hb(this.field_C, var17.field_c);
                  um.field_i[this.field_C].field_b = new wd(var17.field_n.field_e);
                  ho.b((byte) -36);
                  this.a((byte) -112, -1);
                }
              }
            }
          } else {
            this.d(true);
            this.a((byte) -92, true);
          }
        }
    }

    final void b(boolean param0) {
        super.b(param0);
        fk.a((byte) 121, lf.field_w);
        bl.a((byte) 123);
        ih.b(this.field_e, 188, 48, 605, 279);
        ih.b(this.field_e, 188, 364, 605, 378);
        ih.b(this.field_e, 188, 401, 605, 407);
        jh.a(this.field_e);
        te.a(188, 280, 423, kc.field_M);
        te.a(188, 362, 423, kc.field_M);
        te.a(188, 378, 423, kc.field_M);
        te.a(188, 399, 423, kc.field_M);
        te.a(188, 408, 423, kc.field_M);
        ih.a(188, 281, 433, 80, 256, 32, 8, 128);
        ih.a(188, 379, 433, 20, 256, 32, 8, 128);
        ih.a(8, 8, 172, 32, 256, 64, 4, 128);
        ih.a(188, 8, 264, 32, 256, 64, 4, 128);
        ih.a(460, 8, 172, 32, 256, 64, 4, 128);
        this.field_B.b(12, 32, 640 - this.field_B.field_i >> 1);
        h.a(false, 425, 618, true, bk.field_e.field_b + 40);
        ke.a(55, 180, 480, 0);
        ke.a(51, 605, 480, bk.field_e.field_b + 40);
        ke.a(106, 640 - be.field_o.field_d, 480, 0);
        ke.a(66, 0, 480, 0);
        c.a(0, 640, 0, (byte) 30);
        c.a(0, 640, 40, (byte) 55);
        jc.a(32, 460 - be.field_o.field_d, 8, 1, 2, 1);
        c.a(0, 640, 480 - bk.field_e.field_b, (byte) 110);
        ih.b(be.field_o.field_d, 40 + bk.field_e.field_b, 170, 425, 16777215, 32, 128);
        h.a(false, 425, 20, true, bk.field_e.field_b + 40);
        ih.a(8, 47, 172, 425, 256, 32, 8, 128);
        ih.a(14, 55, 161, 36);
        jh.b();
        this.c(65);
        lb var3 = (lb) null;
        u.a(1, (lb) null);
        this.field_F = null;
        this.field_A = mf.a(10449103, 96, 6, 96, (byte) 72);
        this.field_u = mf.a(255, 96, 12, 96, (byte) 85);
        this.field_z = mf.a(16711680, 96, 12, 96, (byte) -87);
        this.field_I = mf.a(8454143, 96, 12, 96, (byte) -43);
        this.field_y = new rh(205, 371, 80, 160, 16711680, 768, 249);
        this.field_D = new rh(-oe.field_m.field_d + 640, 371, 80, 160, 16711680, 768, 249);
        qh.a(-13716, lf.field_y[1], 20);
    }

    final static void a(byte param0) {
        tc.field_u = ra.field_c.d(param0 ^ -92);
        CharSequence var2 = (CharSequence) ((Object) tc.field_u);
        nn.field_k = jm.a(param0, var2);
    }

    private final void b(int param0, int param1, int param2) {
        ih.a(param2, param0, param1, 30);
        ih.a(param2, 40 + param0, 144, 30);
        int var4 = 8 + param0 + la.field_b.field_H;
        db.field_v.b(pb.field_I, param2 + 7, var4, 16777215, -1);
        db.field_v.a(Integer.toString(gm.field_d.field_s / 10), 133 + param2, var4, 16777215, -1);
        var4 += 40;
        int var5 = ac.field_s > gm.field_d.field_s ? 16711680 : 16777215;
        db.field_v.b(ef.field_f, 7 + param2, var4, var5, -1);
        int var6 = ac.field_s / 10;
        if (ac.field_s % 10 != 0) {
          var6++;
        }
        db.field_v.a(Integer.toString(var6), param2 + 133, var4, var5, -1);
    }

    private final void c(int param0) {
        this.b();
        op.field_d = new nn(true);
        wd.field_f = new nn(false);
        ud.field_t = new ed(8, 90, 180, 382);
        sn.field_b = tn.a(16, 12, ne.field_c, jm.field_i, -107, lk.field_P);
        nl.field_a = tn.a(472, 12, ne.field_c, jm.field_i, -76, be.field_r.toUpperCase());
        in.field_y = tn.a((164 - jm.field_i.field_y >> 1) + 340, 376, ne.field_c, jm.field_i, -100, sa.field_e);
        hl.field_b = sj.a(22, param0 ^ 38, 65, uj.field_c, wd.field_f);
        hi.field_a = sj.a(55, 109, 65, gd.field_E, wd.field_f);
        kl.field_h = sj.a(86, 104, 65, jj.field_b, wd.field_f);
        cd.field_d = sj.a(117, 87, 65, wl.field_d, wd.field_f);
        am.field_f = sj.a(148, param0 + 54, param0, pk.field_o, wd.field_f);
        this.field_p.a(ud.field_t, false);
        this.field_p.a(sn.field_b, false);
        this.field_p.a(nl.field_a, false);
        this.field_p.a(in.field_y, false);
        this.field_p.a(hl.field_b, false);
        this.field_p.a(hi.field_a, false);
        this.field_p.a(kl.field_h, false);
        this.field_p.a(cd.field_d, false);
        this.field_p.a(am.field_f, false);
        this.a(-122);
        this.field_G = 0;
        this.field_E = false;
        wd.field_f.a(hl.field_b, -256);
        this.a(0, 0);
        this.field_q = new sa(262, 412, 280, 56);
        this.field_q.a(true, lg.field_h, (byte) 91, a.field_m, 16777215);
        hl.field_b.field_n = (en) ((Object) new e(jk.a(new String[]{tn.field_U}, ib.field_c, 30496)));
        hi.field_a.field_n = (en) ((Object) new e(jk.a(new String[]{qk.field_d}, ib.field_c, 30496)));
        kl.field_h.field_n = (en) ((Object) new e(jk.a(new String[]{dj.field_c}, ib.field_c, param0 ^ 30561)));
        cd.field_d.field_n = (en) ((Object) new e(jk.a(new String[]{pm.field_n}, ib.field_c, 30496)));
        am.field_f.field_n = (en) ((Object) new e(jk.a(new String[]{nf.field_x}, ib.field_c, 30496)));
        nl.field_a.field_n = (en) ((Object) new e((String) null, pm.field_o, nk.field_Lb));
        sn.field_b.field_n = (en) ((Object) new e((String) null, ud.field_u, oi.field_M));
        this.a((byte) -112, -1);
    }

    private final void g(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = DungeonAssault.field_K;
        var2 = param0;
        for (var3 = 0; 2 > var3; var3++) {
          for (var4 = 0; var4 < 4; var4++) {
            var5 = 195 + 102 * var4;
            var6 = 104 * var3 + 60;
            if (null != um.field_i[var2]) {
              um.field_i[var2].field_b.a(86, var6 + 5, (byte) 102, 5 + var5, 86);
              ih.a(var5 + 96, 96 + var6, 3, um.field_i[var2], 0);
            }
            var7 = (int)((te.c(mo.field_a, var2 * 10273, 0.015625) + 2.0) * 64.0);
            if (var7 < 0) {
              var7 = 0;
            }
            if (this.field_C != var2) {
              if (var2 != this.field_t) {
                if (um.field_i[var2] != gm.field_d.field_a[var2]) {
                  var8 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0) + 128;
                  this.field_I.b(var5, var6, var8);
                }
              } else {
                this.field_A.b(var5, var6, 64);
                this.field_u.b(var5, var6, var7);
              }
            } else {
              this.field_z.b(var5, var6, var7);
            }
            if (var2 != 7) {
              var2++;
              continue;
            }
            break;
          }
        }
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var5 = DungeonAssault.field_K;
        int var3Lifetime1;
        for (var3 = 0; var3 < 8; var3++) {
          if (um.field_i[var3] != gm.field_d.field_a[var3]) {
            break;
          }
        }
        if (var3 != 8) {
          this.field_b = (kl) ((Object) new lf(oa.field_h, pb.field_F));
          return;
        }
        if (kn.field_g &&
          gm.field_d.field_K == 0) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            if (null != gm.field_d.field_a[var3Lifetime1]) {
              break;
            }
          }
          if (var3Lifetime1 == 8) {
            fm.a(80, 21);
            return;
          }
          gd.a(g.field_Hb, 0, 2, param1);
          return;
        }
        int var4 = -29 / ((3 - param0) / 59);
        gd.a(g.field_Hb, 0, g.field_Hb, param1);
    }

    public static void e(int param0) {
        field_s = null;
        field_x = null;
        field_J = null;
        field_v = null;
        field_r = null;
        field_w = null;
        if (param0 != -2431) {
          field_x = (tf) null;
        }
    }

    private final void a(int param0, int param1) {
        int var6 = 0;
        boolean stackIn_49_1 = false;
        int[] var3;
        int var4;
        u[] var5;
        u var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var13;
        int var4Lifetime1;
        int var4Lifetime2;
        int[] var9Lifetime1;
        int[] var13Lifetime1;
        var8 = DungeonAssault.field_K;
        var13 = new int[hp.field_b.length];
        var11 = var13;
        var9 = var11;
        var12 = var9;
        var10 = var12;
        var3 = var10;
        var4 = param0;
        if (var4 == 0) {
          var9Lifetime1 = var12;
          var12 = var10;
          var13Lifetime1 = var11;
          for (var4 = 0; var4 < var12.length; var4++) {
            if (null != hp.field_b[var4]) {
              var3[var4] = hp.field_b[var4].field_B;
            }
          }
        } else if (var4 == 1) {
          var9Lifetime1 = var12;
          var12 = var10;
          var13Lifetime1 = var11;
          for (var4 = 0; var13Lifetime1.length > var4; var4++) {
            if (hp.field_b[var4] != null) {
              var9Lifetime1[var4] = hp.field_b[var4].field_m;
            }
          }
        } else if (2 == var4) {
          var9Lifetime1 = var12;
          var12 = var10;
          var13Lifetime1 = var11;
          for (var4 = 0; var12.length > var4; var4++) {
            if (hp.field_b[var4] != null) {
              var3[var4] = hp.field_b[var4].field_r;
            }
          }
        } else if (var4 == 5) {
          var9Lifetime1 = var12;
          var12 = var10;
          var13Lifetime1 = var11;
          for (var4 = 0; var4 < var12.length; var4++) {
            if (hp.field_b[var4] != null) {
              var3[var4] = hp.field_b[var4].field_b;
            }
          }
        } else {
          if (var4 == 6) {
            var9Lifetime1 = var12;
            var12 = var10;
            var13Lifetime1 = var11;
            for (var4 = 0; var12.length > var4; var4++) {
              if (null != hp.field_b[var4]) {
                var3[var4] = hp.field_b[var4].field_o;
              }
            }
          }
        }
        if (this.field_G != param0) {
          this.field_E = false;
        } else {
          stackIn_49_1 = !(this.field_E);
          this.field_E = stackIn_49_1;
        }
        this.field_G = param0;
        if (!this.field_E) {
          for (var4Lifetime1 = 0; var12.length > var4Lifetime1; var4Lifetime1++) {
            var3[var4Lifetime1] = -var12[var4Lifetime1];
          }
        }
        if (lf.field_y != null) {
          qm.field_r = (u[]) ((Object) lf.field_y.clone());
          ik.a(qm.field_r, -88, var12);
        }
        ud.field_t.field_J = null;
        ud.field_t.e(true);
        var4Lifetime2 = param1;
        var5 = qm.field_r;
        for (var6 = 0; var5.length > var6; var6++) {
          var7 = var5[var6];
          if (var7 != null) {
            var7.b(10, var4Lifetime2, (byte) 4);
            var4Lifetime2 = var4Lifetime2 + (8 + var7.field_x);
            ud.field_t.a(var7, (byte) -78);
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var4;
        eh stackIn_10_0 = null;
        eh var3;
        var4 = DungeonAssault.field_K;
        if (param0 != 1793) {
          this.field_t = 120;
        }
        for (var2 = 0; var2 < 8; var2++) {
          um.field_i[var2] = gm.field_d.field_a[var2];
          if (null != um.field_i[var2]) {
            if (um.field_i[var2].field_p == 255) {
              stackIn_10_0 = k.field_c;
            } else {
              stackIn_10_0 = um.field_i[var2].field_n.field_e;
            }
            var3 = stackIn_10_0;
            um.field_i[var2].field_b = new wd(var3);
          }
        }
        ho.b((byte) -36);
    }

    private final void b(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var8;
        int var5;
        int var6;
        int var7;
        var8 = DungeonAssault.field_K;
        if (param0 >= -100) {
          field_w = (qh[]) null;
        }
        var2 = 0;
        for (var3 = 0; var3 < 2; var3++) {
          var4 = 0;
          while (4 > var4) {
            var5 = 195 + 102 * var4;
            var6 = 60 + 104 * var3;
            gf.e(var5, var6, 96, 96, 0);
            var7 = 0;
            gf.b(var5 + 4, 4 + var6, 88, 88, var7);
            rp.a(4, 88, (byte) 108, var5 + 4, 88, kc.field_S, 4 + var6);
            if (7 != var2) {
              var4++;
              var2++;
              continue;
            }
            break;
          }
        }
    }

    private final void a(byte param0, int param1) {
        Object var3;
        h var4;
        int var5;
        var5 = DungeonAssault.field_K;
        this.field_C = param1;
        if (param0 != -112) {
          return;
        }
        var3 = null;
        if (this.field_C != -1) {
          var3 = um.field_i[this.field_C];
        }
        if (var3 == null) {
          mi.a(in.field_y, sa.field_e, ne.field_c, 13195, jm.field_i);
          in.field_y.field_w = false;
        } else {
          var4 = ((hb) (var3)).field_n;
          if (255 != ((hb) (var3)).field_p) {
            if (var4.field_m <= ((hb) (var3)).field_e &&
              ((hb) (var3)).field_g >= var4.field_r &&
              ((hb) (var3)).field_f >= var4.field_b &&
              ((hb) (var3)).field_k >= var4.field_o) {
              mi.a(in.field_y, sa.field_e, ne.field_c, 13195, jm.field_i);
              in.field_y.field_w = false;
              return;
            }
            mi.a(in.field_y, ae.field_e, ne.field_c, 13195, jm.field_i);
            in.field_y.field_n = (en) ((Object) new e((String) null, jk.a(new String[]{var4.field_F.toUpperCase(), gh.a(gj.a(-1704798751, var4), (byte) -111)}, t.field_c, 30496), (String) null));
            in.field_y.field_w = true;
          } else {
            mi.a(in.field_y, sa.field_e, ne.field_c, 13195, jm.field_i);
            in.field_y.field_n = (en) ((Object) new e((String) null, jk.a(new String[]{var4.field_F.toUpperCase(), gh.a(gj.a(-1704798751, var4), (byte) -102)}, e.field_g, 30496), (String) null));
            in.field_y.field_w = true;
          }
        }
        return;
    }

    private final void a(int param0) {
        int var3 = 0;
        int var2;
        h var4;
        int var6;
        u var5;
        var6 = DungeonAssault.field_K;
        if (param0 > -119) {
          this.b(-128, -72, -101);
        }
        lf.field_y = new u[hp.field_b.length];
        var2 = 0;
        for (var3 = 0; hp.field_b.length > var3; var3++) {
          var4 = hp.field_b[var3];
          if (var4 != null &&
            var4.field_x != -1 &&
            null != var4.field_F &&
            var4.field_c <= gm.field_d.field_m) {
            var5 = new u(10, var2, var4);
            var2 = var2 + (10 + var5.field_x);
            lf.field_y[var3] = var5;
            var5.field_n = (en) ((Object) new fc(var4));
            op.field_d.a((gd) (var5), (byte) -20);
          }
        }
    }

    final void c(boolean param0) {
        int var3 = 0;
        int var5;
        hb[] var2;
        hb var4;
        hb[] var6;
        lf var7;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        }
        if (!param0) {
          return;
        }
        while (ha.b((byte) 47)) {
          if (13 == mm.field_t) {
            this.a((byte) -61, false);
            continue;
          }
          super.f();
        }
        this.f(-24900);
        if (this.field_b != null &&
          this.field_b.field_d) {
          var7 = (lf) (this.field_b);
          if (var7.field_u) {
            this.d(true);
          } else {
            this.d(1793);
          }
          this.field_b.c(-127);
          this.field_b = null;
          gd.a(g.field_Hb, 0, g.field_Hb, false);
        }
        if (kn.field_g) {
          bl.a(0);
        }
        var6 = um.field_i;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.field_b.a((byte) 109, 20);
          }
        }
        if (this.field_F != null) {
          this.field_F.a((byte) 109, 20);
        }
        return;
    }

    ih() {
        this.field_B = new tf(ne.field_c, lg.field_h, cm.field_M);
        tf discarded$0 = new tf(db.field_v, ak.field_m.toUpperCase(), cm.field_M);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_J = new int[256];
        field_r = new int[128];
        field_s = "Spectre";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_J[var1] = var0;
        }
        field_v = "Chaos Champion";
    }
}
