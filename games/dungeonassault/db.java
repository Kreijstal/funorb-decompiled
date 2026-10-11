/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends qe {
    private rh field_r;
    static String field_u;
    private ae field_w;
    private tf[] field_s;
    private rh field_t;
    static gp field_v;

    private final void b(int param0) {
        int var2;
        int var3;
        String var4;
        String var5;
        int var6;
        int var7;
        int var8_int;
        String var8;
        String var9;
        int var10;
        int[] var11;
        String var12;
        int var8_intLifetime1;
        var10 = DungeonAssault.field_K;
        if (param0 > -20) {
          this.b((byte) 115);
        }
        var2 = 241;
        field_v.c(fd.field_a, 213, var2, 16777215, -1);
        var3 = gm.field_d.field_w;
        if (null != fo.field_d.field_l) {
          var3 = ((Integer) (fo.field_d.field_l.field_u)).intValue();
        }
        L2: {
          var11 = (int[]) null;
          if (o.a(gj.field_c, (int[]) null, var3, gm.field_d, true)) {
            var12 = jk.a(new String[]{pj.a((byte) 66, gm.field_d.field_w, tc.field_u)}, DungeonAssault.field_G, 30496);
            la.field_b.a(var12, 70, 338, 270, 180, 16760960, -1, 1, 0, la.field_b.field_H + la.field_b.field_E);
            if (var10 == 0) {
              break L2;
            }
          }
          var4 = ib.a((byte) -15, 16760960, pj.a((byte) 66, var3, tc.field_u));
          var5 = jk.a(new String[]{var4}, dk.field_e, 30496);
          var6 = 127 & var3;
          if (wh.field_a > var6) {
            L4: {
              if (var6 < cp.field_R) {
                if (ok.field_z <= var6) {
                  var7 = -ok.field_z + var6;
                  if (bl.field_n.length > var7) {
                    var8_int = bl.field_n[var7];
                    var9 = ib.a((byte) 6, 16760960, ce.field_o[var8_int]);
                    var5 = jk.a(new String[]{var9, var4}, l.field_c, 30496);
                  }
                  if (var10 == 0) {
                    break L4;
                  }
                }
                if (gn.field_d > var6) {
                  if (uf.field_a <= var6) {
                    var7 = -uf.field_a + var6;
                    if (var7 < hb.field_m.length) {
                      var8_intLifetime1 = hb.field_m[var7];
                      var9 = ib.a((byte) -128, 16760960, Integer.toString(var8_intLifetime1));
                      if (1 != var8_intLifetime1) {
                        var5 = jk.a(new String[]{var9, var4}, wf.field_y, 30496);
                        if (var10 != 0) {
                          var5 = jk.a(new String[]{var9, var4}, tl.field_c, 30496);
                        }
                      } else {
                        var5 = jk.a(new String[]{var9, var4}, tl.field_c, 30496);
                      }
                    }
                    if (var10 == 0) {
                      break L4;
                    }
                  }
                  if (!(wm.field_a > var6)) {
                    var7 = -wm.field_a + var6;
                    if (var7 < dc.field_p.length) {
                      var8_intLifetime1 = dc.field_p[var7];
                      var9 = ib.a((byte) -125, 16760960, Integer.toString(var8_intLifetime1));
                      if (var8_intLifetime1 == 1) {
                        var5 = jk.a(new String[]{var9, var4}, be.field_m, 30496);
                        if (var10 != 0) {
                          var5 = jk.a(new String[]{var9, var4}, vj.field_i, 30496);
                        }
                      } else {
                        var5 = jk.a(new String[]{var9, var4}, vj.field_i, 30496);
                      }
                    }
                    if (var10 != 0) {
                      var7 = var6 - gn.field_d;
                      if (var7 < ci.field_s.length) {
                        var8_intLifetime1 = ci.field_s[var7];
                        var9 = ib.a((byte) 91, 16760960, Integer.toString(var8_intLifetime1));
                        var5 = jk.a(new String[]{var9, var4}, ac.field_f, 30496);
                      }
                      var7 = -cp.field_R + var6;
                      if (var7 < id.field_j.length) {
                        var8 = ib.a((byte) 115, 16760960, ab.field_d[var7]);
                        var9 = ib.a((byte) 115, 16760960, ka.field_b[var7]);
                        var5 = jk.a(new String[]{var9, var8, var4}, uk.field_b, 30496);
                      }
                    }
                  }
                } else {
                  var7 = var6 - gn.field_d;
                  if (var7 < ci.field_s.length) {
                    var8_intLifetime1 = ci.field_s[var7];
                    var9 = ib.a((byte) 91, 16760960, Integer.toString(var8_intLifetime1));
                    var5 = jk.a(new String[]{var9, var4}, ac.field_f, 30496);
                  }
                  if (var10 != 0) {
                    var7 = -cp.field_R + var6;
                    if (var7 < id.field_j.length) {
                      var8 = ib.a((byte) 115, 16760960, ab.field_d[var7]);
                      var9 = ib.a((byte) 115, 16760960, ka.field_b[var7]);
                      var5 = jk.a(new String[]{var9, var8, var4}, uk.field_b, 30496);
                    }
                  }
                }
              } else {
                var7 = -cp.field_R + var6;
                if (var7 < id.field_j.length) {
                  var8 = ib.a((byte) 115, 16760960, ab.field_d[var7]);
                  var9 = ib.a((byte) 115, 16760960, ka.field_b[var7]);
                  var5 = jk.a(new String[]{var9, var8, var4}, uk.field_b, 30496);
                }
              }
            }
            la.field_b.a(var5, 75, 338, 260, 180, 8421504, -1, 1, 0, la.field_b.field_E + la.field_b.field_H);
          } else {
            la.field_b.a(var5, 75, 338, 260, 180, 8421504, -1, 1, 0, la.field_b.field_E + la.field_b.field_H);
          }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = tg.field_f[3][param0];
        String var4 = this.a(var3, 0);
        int var5 = ne.field_c.b(var4);
        int var6 = ne.field_c.field_E + ne.field_c.field_H;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        ne.field_c.b(var4, 0, ne.field_c.field_H, 16760960, -1);
        jh.b();
        if (param1 != -121) {
          db.c((byte) 98);
        }
        ga.field_r = rb.a(8, var7, 16760960, (byte) 109);
        co.field_F = rb.a(16, var7, 6307840, (byte) -111);
        nf.field_y = param0;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        String var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var13;
        if (param2 <= 69) {
          this.a((byte) 8, 36);
        }
        var4 = tg.field_f[3][param1];
        var5 = this.a(var4, 0);
        var6 = ne.field_c.b(var5);
        var7 = bh.b(param1, 3, false);
        var8 = qd.a(param1, 380, 3);
        var9 = o.a(3, (byte) 101, param1);
        var10 = -var6 + (var7 + var8) >> 1;
        if (!ke.a(97, var4)) {
          var9 += 4;
        }
        var11 = rp.a(15204376, var4) ? 1 : 0;
        if (!param0) {
          if (var11 != 0) {
            var12 = ag.field_c;
          } else {
            var12 = tf.field_k;
          }
        } else {
          if (var11 == 0) {
            var12 = ug.field_E;
          } else {
            var12 = ml.field_b;
          }
        }
        L3: {
          if (var11 == 0) {
            if (of.field_k) {
              if (var4 != 22) {
                break L3;
              }
            } else {
              if (23 != var4) {
                break L3;
              }
            }
            var12 = fo.field_c;
          }
        }
        if (null == this.field_s[param1] ||
          this.field_s[param1].field_f != var5 ||
          this.field_s[param1].field_h != var12) {
          this.field_s[param1] = new tf(ne.field_c, var5, var12);
        }
        this.field_s[param1].b(var9, 32, var10);
        if (var4 == 22 &&
          ak.field_o[0] > gm.field_d.field_m) {
          hj.field_T.h(-20 + var10, ne.field_c.field_H + var9 - 15);
        }
        if (param0) {
          if (param1 != nf.field_y) {
            this.a(param1, (byte) -121);
          }
          ga.field_r.b(var10, var9, 64);
          var13 = (int)((1.0 + te.a(mo.field_a)) * 128.0);
          if (var13 < 0) {
            var13 = 0;
          }
          if (var13 > 256) {
            var13 = 256;
          }
          co.field_F.b(var10, var9, var13);
        }
    }

    final void c() {
        super.c();
        this.field_s = null;
    }

    final void c(boolean param0) {
        int stackIn_35_0 = 0;
        pp stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        bf[] var2 = null;
        int var2_int = 0;
        pp var2_ref = null;
        int var3 = 0;
        bf var4_ref_bf = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        bf[] var8 = null;
        pk var9 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        var6 = DungeonAssault.field_K;
        super.c(param0);
        var8 = wd.field_l;
        var2 = var8;
        var3 = 0;
        L1: while (true) {
          boolean decompiledFrameRemainder0 = true;
          if (var8.length > var3) {
            var4_ref_bf = var8[var3];
            var4_ref_bf.a(-87);
            var3++;
            if (var6 == 0) {
              continue;
            }
          } else {
            if (kh.field_s) {
              decompiledFrameRemainder0 = !(param0);
              if (decompiledFrameRemainder0) {
                this.b((byte) -50);
              }
            } else {
              this.b((byte) -50);
            }
          }
          if (decompiledFrameRemainder0) {
            if (hh.field_s != null &&
              hh.field_s.field_u instanceof Integer) {
              var2_int = ((Integer) (hh.field_s.field_u)).intValue();
              var7 = (int[]) null;
              if (o.a(gj.field_c, (int[]) null, var2_int, gm.field_d, true)) {
                gm.field_d.field_w = var2_int;
                ac.field_B.d((byte) -106, 59);
                ac.field_B.a(6, var2_int);
              }
            }
            while (ha.b((byte) 47)) {
              this.f();
              if (var6 != 0) {
                break L1;
              }
            }
          }
          if (this.field_b != null &&
            this.field_b.field_d) {
            if (this.field_b instanceof pk) {
              var9 = (pk) (this.field_b);
              if (var9.field_r) {
                this.a((byte) 111, var9.field_u);
              }
            }
            this.field_b.c(-123);
            this.field_b = null;
          }
          break;
        }
        if (null != mk.field_j.field_l) {
          var2_intLifetime1 = ((lk) (mk.field_j.field_l)).field_O;
          var3Lifetime1 = gm.field_d.field_J[var2_intLifetime1] + gm.field_d.field_F[var2_intLifetime1];
          var4 = (var3Lifetime1 * 1 + 10) * fj.field_g[var2_intLifetime1] / 10;
          if (ve.a(false)) {
            if (var3Lifetime1 >= 5) {
              stackIn_35_0 = (hm.field_m[var2_intLifetime1]) ? 1 : 0;
            } else {
              stackIn_35_0 = 0;
            }
          } else {
            stackIn_35_0 = 0;
          }
          var5 = stackIn_35_0;
          hf.field_mb.field_D = og.field_e.field_N;
          stackIn_39_0 = hf.field_mb;
          stackIn_40_1 = (hf.field_mb.field_D) && (var5 == 0) && (var4 <= gm.field_d.field_s);
          stackIn_39_0.field_w = stackIn_40_1;
          if (var6 == 0) {
            return;
          }
        }
        hf.field_mb.field_w = false;
        var2_ref = hf.field_mb;
        var2_ref.field_D = false;
        return;
    }

    private final String a(int param0, int param1) {
        String var3;
        if (param1 != 0) {
          this.d(false);
        }
        var3 = ll.field_m[param0];
        if (param0 == 10 && (ec.field_p == 0 ||
          dc.field_z == 0 ||
          12 == ec.field_p ||
          dc.field_z == 12 ||
          ec.field_p == 1 ||
          dc.field_z == 1)) {
          var3 = ll.field_m[9];
        }
        return var3;
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var3 = tg.field_f[3][param1];
        var4 = bh.b(param1, 3, false);
        var5 = qd.a(param1, 380, 3);
        if (param0 < 60) {
          this.b((byte) -57);
        }
        var6 = o.a(3, (byte) 110, param1);
        var7 = kf.a(param1, 3, -114);
        if (ke.a(76, var3)) {
          gf.e(-4 + var4, -6 + var6, 8 + var5 - var4, var7 + 8, 0);
          db.b(var4, var6 - 2, var5 - var4, var7, 8421504, 128, 128);
          rp.a(4, var5 - var4, (byte) 108, var4, var7, kc.field_S, var6 - 2);
          db.a(var4, -2 + var6, var5 - var4, var7, 224, 64, 3, 128);
          if (DungeonAssault.field_K != 0) {
            of.field_j.h(-of.field_j.field_y + (var4 + var5) >> 1, var6);
            var6 += 4;
          }
        } else {
          of.field_j.h(-of.field_j.field_y + (var4 + var5) >> 1, var6);
          var6 += 4;
        }
    }

    private final void a(byte param0) {
        int stackIn_5_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        boolean stackOut_5_0;
        boolean stackOut_16_0;
        boolean stackOut_29_0;
        boolean stackOut_41_0;
        int var2 = 0;
        int var3 = 0;
        int var5_int = 0;
        ed var5 = null;
        int var6_int = 0;
        pp var6 = null;
        int var7 = 0;
        int var8 = 0;
        lk var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        gd var16 = null;
        gd var17 = null;
        gd var18 = null;
        gd var19 = null;
        gd var20 = null;
        gd var21 = null;
        gd var22 = null;
        gd var23 = null;
        gd var24 = null;
        gd var25 = null;
        gd var26 = null;
        int var3Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var5_intLifetime3;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        var10 = DungeonAssault.field_K;
        var2 = 241;
        this.b();
        var3 = 0;
        fo.field_d = new nn(true);
        eh.field_o = new ed(90, var2 + 7, 250, -var2 + 328);
        this.field_p.a(eh.field_o, false);
        var16 = this.a(var3, -1, -111, true);
        var3 = var3 + (var16.field_x + 3);
        var5_int = 0;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (!(bl.field_n.length > var5_int)))) {
          var6_int = ok.field_z + var5_int;
          var11 = (int[]) null;
          stackIn_5_0 = (!o.a(gj.field_c, (int[]) null, var6_int, gm.field_d, true)) ? 0 : 1;
          var7 = stackIn_5_0;
          var17 = this.a(var3, var6_int, 32, var7 != 0);
          var3 = var3 + (3 + var17.field_x);
          stackOut_5_0 = bh.a(126, var6_int).equals(bh.a(123, var6_int + rj.field_l));
          stackIn_10_0 = stackOut_5_0 ? 1 : 0;
          stackIn_6_0 = stackOut_5_0;
          if (var10 == 0) {
            if (!stackIn_6_0) {
              var18 = this.a(var3, rj.field_l + var6_int, -7, var7 != 0);
              var3 = var3 + (3 + var18.field_x);
            }
            var5_int++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          var5_int = 0;
          stackIn_10_0 = param0;
        }
        if (stackIn_10_0 >= -65) {
          field_u = (String) null;
        }
        L7: while (true) {
          if (dc.field_p.length > var5_int) {
            var6_intLifetime1 = var5_int + wm.field_a;
            var12 = (int[]) null;
            stackIn_16_0 = (!o.a(gj.field_c, (int[]) null, var6_intLifetime1, gm.field_d, true)) ? 0 : 1;
            var7Lifetime1 = stackIn_16_0;
            var19 = this.a(var3, var6_intLifetime1, 2, var7Lifetime1 != 0);
            var3 = var3 + (var19.field_x + 3);
            stackOut_16_0 = bh.a(117, var6_intLifetime1).equals(bh.a(122, rj.field_l + var6_intLifetime1));
            stackIn_24_0 = stackOut_16_0 ? 1 : 0;
            stackIn_17_0 = stackOut_16_0;
            if (var10 != 0) {
              break L7;
            }
            if (!stackIn_17_0) {
              var20 = this.a(var3, var6_intLifetime1 + rj.field_l, 99, var7Lifetime1 != 0);
              var3 = var3 + (3 + var20.field_x);
            }
            if (var7Lifetime1 != 0) {
              var5_int++;
              continue;
            }
          }
          stackIn_24_0 = 0;
          break;
        }
        var5_intLifetime1 = stackIn_24_0;
        L12: while (true) {
          if (hb.field_m.length > var5_intLifetime1) {
            var6_intLifetime2 = uf.field_a + var5_intLifetime1;
            var13 = (int[]) null;
            stackIn_29_0 = (!o.a(gj.field_c, (int[]) null, var6_intLifetime2, gm.field_d, true)) ? 0 : 1;
            var7Lifetime2 = stackIn_29_0;
            var21 = this.a(var3, var6_intLifetime2, -117, var7Lifetime2 != 0);
            var3 = var3 + (var21.field_x + 3);
            stackOut_29_0 = bh.a(120, var6_intLifetime2).equals(bh.a(120, var6_intLifetime2 + rj.field_l));
            stackIn_36_0 = stackOut_29_0 ? 1 : 0;
            stackIn_30_0 = stackOut_29_0;
            if (var10 != 0) {
              break L12;
            }
            if (!stackIn_30_0) {
              var22 = this.a(var3, rj.field_l + var6_intLifetime2, 47, var7Lifetime2 != 0);
              var3 = var3 + (var22.field_x + 3);
            }
            if (var7Lifetime2 != 0) {
              var5_intLifetime1++;
              continue;
            }
          }
          stackIn_36_0 = 0;
          break;
        }
        var5_intLifetime2 = stackIn_36_0;
        L17: while (true) {
          if (var5_intLifetime2 < ci.field_s.length) {
            var6_intLifetime3 = var5_intLifetime2 + gn.field_d;
            var14 = (int[]) null;
            stackIn_41_0 = (!o.a(gj.field_c, (int[]) null, var6_intLifetime3, gm.field_d, true)) ? 0 : 1;
            var7Lifetime3 = stackIn_41_0;
            var23 = this.a(var3, var6_intLifetime3, -112, var7Lifetime3 != 0);
            var3 = var3 + (var23.field_x + 3);
            stackOut_41_0 = bh.a(120, var6_intLifetime3).equals(bh.a(119, rj.field_l + var6_intLifetime3));
            stackIn_49_0 = stackOut_41_0 ? 1 : 0;
            stackIn_42_0 = stackOut_41_0;
            if (var10 != 0) {
              break L17;
            }
            if (!stackIn_42_0) {
              var24 = this.a(var3, var6_intLifetime3 + rj.field_l, 18, var7Lifetime3 != 0);
              var3 = var3 + (var24.field_x + 3);
            }
            if (var7Lifetime3 != 0) {
              var5_intLifetime2++;
              continue;
            }
          }
          stackIn_49_0 = 0;
          break;
        }
        var5_intLifetime3 = stackIn_49_0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(id.field_j.length > var5_intLifetime3)))) {
          var6_intLifetime4 = cp.field_R + var5_intLifetime3;
          var15 = (int[]) null;
          stackIn_54_0 = (!o.a(gj.field_c, (int[]) null, var6_intLifetime4, gm.field_d, true)) ? 0 : 1;
          var7Lifetime4 = stackIn_54_0;
          var25 = this.a(var3, var6_intLifetime4, -121, var7Lifetime4 != 0);
          var3 = var3 + (3 + var25.field_x);
          if (var10 == 0) {
            if (!bh.a(122, var6_intLifetime4).equals(bh.a(121, rj.field_l + var6_intLifetime4))) {
              var26 = this.a(var3, rj.field_l + var6_intLifetime4, -111, var7Lifetime4 != 0);
              var3 = var3 + (3 + var26.field_x);
            }
            var5_intLifetime3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          mk.field_j = new nn(true);
          og.field_e = new ed(90, 7 + var2, 250, -var2 + 328);
        }
        var5 = og.field_e;
        og.field_e.field_N = false;
        var5.field_w = false;
        this.field_p.a(og.field_e, false);
        hf.field_mb = tn.a(-(kg.field_a.field_y / 2) + (363 + (200 - ao.field_n.field_E >> 1)) + ao.field_n.field_E / 2, 337, field_v, kg.field_a, -81, bg.field_x.toUpperCase());
        var6 = hf.field_mb;
        hf.field_mb.field_D = false;
        var6.field_w = false;
        var3Lifetime1 = 0;
        this.field_p.a(hf.field_mb, false);
        var7Lifetime5 = 1;
        var8 = 0;
        while (var8 < 6) {
          if (var10 != 0) {
            return;
          }
          if (gm.field_d.field_m >= ak.field_o[var8] && (cf.field_b[var8] ||
            var10 != 0)) {
            var9 = new lk(0, var3Lifetime1, 200, 40, var8);
            og.field_e.a(var9, (byte) -101);
            var3Lifetime1 += 40;
            mk.field_j.a((gd) (var9), (byte) -20);
            if (var7Lifetime5 != 0) {
              var7Lifetime5 = 0;
              mk.field_j.a(var9, -256);
            }
          }
          var8++;
        }
        og.field_e.e(49);
        og.field_e.c(107, 8);
        return;
    }

    private final void b(byte param0) {
        int var2;
        if (super.d()) {
          return;
        }
        this.field_w.a(-7734, this.a(hm.field_k, lc.field_c, (byte) -117), this.a(eh.field_h, hj.field_S, (byte) -117));
        if (param0 != -50) {
          this.field_w = (ae) null;
        }
        if (this.field_w.field_b != -1) {
          this.a(this.field_w.field_b, -1, true);
        }
        if (hh.field_s == hf.field_mb) {
          var2 = ((lk) (mk.field_j.field_l)).field_O;
          if (0 == gm.field_d.field_e) {
            this.field_b = (kl) ((Object) new pk(ag.field_b, oj.field_c, var2));
            if (DungeonAssault.field_K != 0) {
              this.a((byte) 88, var2);
            }
          } else {
            this.a((byte) 88, var2);
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        gm.field_d.field_F[param1] = gm.field_d.field_F[param1] + 1;
        gm.field_d.field_e = gm.field_d.field_e + 1;
        int var3 = gm.field_d.field_F[param1] + gm.field_d.field_J[param1];
        if (param0 > 29) {
          var4 = fj.field_g[param1] * (var3 * 1 + 10) / 10;
          gm.field_d.field_s = gm.field_d.field_s - var4;
          if (gm.field_d.field_A != -1) {
            gm.field_d.field_A = fm.field_i + (int)(-16912800L + kd.c(-2456) / 60000L);
          }
          ac.field_B.d((byte) -79, 73);
          ac.field_B.a(6, param1);
          hi.b(1);
          return;
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var18 = 0;
        lb var19 = null;
        lb var20 = null;
        int stackIn_21_0 = 0;
        int var13 = 0;
        int var14 = 0;
        long var15 = 0L;
        String var17 = null;
        String var10Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var14Lifetime1;
        long var15Lifetime1;
        var18 = DungeonAssault.field_K;
        var19 = gm.field_d;
        var20 = var19;
        var3 = 370;
        var4 = 130;
        var5 = kk.field_l.field_E + kk.field_l.field_H;
        var6 = 40;
        gf.b(var3 - 3, var4 - 16, 186, 70, 16777215, var6);
        field_v.b(jk.a(new String[]{gh.a(var19.field_N, (byte) -118)}, kk.field_s, 30496), var3, var4, 0, -1);
        var4 += 16;
        field_v.b(jk.a(new String[]{gh.a(var19.field_m, (byte) -101)}, mm.field_j, 30496), var3, var4, 0, -1);
        var4 += 16;
        field_v.b(jk.a(new String[]{Integer.toString(var19.field_s / 10)}, bp.field_h, 30496), var3, var4, 0, -1);
        var4 += 16;
        var7 = 60 * (int)(0.5 + Math.pow(2.0, (double)(-var20.field_N) / 10000.0) * 250.0) / 60;
        var7 = var7 + 10 * gm.field_d.field_J[2];
        kk.field_l.b(jk.a(new String[]{gh.a(var7, (byte) -112)}, la.field_j, 30496), var3, var4, 0, -1);
        if (param0 != 197376) {
          field_v = (gp) null;
        }
        var8 = 9;
        var4 = var4 + (var8 + 16);
        boolean decompiledSharedTail0 = !(var20.field_B <= 0);
        if (!decompiledSharedTail0) {
          var9 = wa.field_f;
          decompiledSharedTail0 = (var18 != 0);
        }
        if (decompiledSharedTail0) {
          var9 = jk.a(new String[]{Integer.toString(var19.field_B), Integer.toString(var19.field_h), Integer.toString(var19.field_D)}, ip.field_k, 30496);
          var10 = var9;
          var10 = var9;
        }
        if (var20.field_y <= 0) {
          var10Lifetime1 = jk.a(new String[]{Integer.toString(var19.field_y), Integer.toString(var19.field_r), Integer.toString(var19.field_I)}, uh.field_V, param0 ^ 226336);
          if (var18 != 0) {
            var10Lifetime1 = jk.a(new String[]{Integer.toString(var19.field_y), Integer.toString(var19.field_r), Integer.toString(var19.field_I)}, ip.field_k, param0 ^ 226336);
          }
        } else {
          var10Lifetime1 = jk.a(new String[]{Integer.toString(var19.field_y), Integer.toString(var19.field_r), Integer.toString(var19.field_I)}, ip.field_k, param0 ^ 226336);
        }
        boolean decompiledFrameCompleted3 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var11 = -55 + bl.field_s.field_y;
        var12 = 2 + kk.field_l.c(var9, var11) + kk.field_l.c(var10Lifetime1, var11);
        gf.b(-3 + var3, -16 + var4, 186, 6 + var12 * 16, 16777215, var6);
        field_v.b(p.field_r, var3, var4, 0, -1);
        var4 += 16;
        var12Lifetime1 = kk.field_l.a(var9, 10 + var3, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
        var4 = var4 + 16 * var12Lifetime1;
        field_v.b(rb.field_M, var3, var4, 0, -1);
        var4 += 16;
        var12Lifetime2 = kk.field_l.a(var10Lifetime1, var3 + 10, -var5 + var4, var11, 100, 0, -1, 0, 0, var5);
        var4 = var4 + (16 * var12Lifetime2 + var8);
        if (var19.field_t[0] != -1L) {
          var12Lifetime3 = 0;
          var13 = var4;
          var14 = 0;
          L7: while (true) {
            if (10 > var14) {
              var15 = var19.field_t[var14];
              stackIn_21_0 = $cfr$lcmp(-1L, var15);
              if (var18 != 0) {
                break L7;
              }
              if (stackIn_21_0 != 0) {
                var12Lifetime3++;
                var4 = var4 + kk.field_l.field_H;
                if (var4 <= 350 ||
                  var18 != 0) {
                  var14++;
                  continue;
                }
              }
            }
            var4 = var13;
            gf.b(var3 - 3, var4 - 16, 186, 20 + kk.field_l.field_H * 6, 16777215, var6);
            field_v.b(oh.field_o, var3, var4, 0, -1);
            var4 += 16;
            stackIn_21_0 = 0;
            break;
          }
          var14Lifetime1 = stackIn_21_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var14Lifetime1 >= 10))) {
            var15Lifetime1 = var19.field_t[var14Lifetime1];
            if (var18 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            if (var15Lifetime1 == -1L) {
              this.b(-121);
              decompiledFrameCompleted1 = false;
              break;
            }
            var17 = uj.a(var15Lifetime1, param0 - 197377);
            kk.field_l.b(var17, var3 + 10, var4, 14352640, -1);
            var4 = var4 + kk.field_l.field_H;
            if (var4 > 350 &&
              var18 == 0) {
              this.b(-121);
              decompiledFrameCompleted0 = false;
              break;
            }
            var14Lifetime1++;
          }
          if (decompiledNaturalLoopExit0) {
            this.b(-121);
            decompiledFrameCompleted3 = false;
          }
        }
        if ((decompiledFrameCompleted3) &&
          (decompiledFrameCompleted2) &&
          (decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          this.b(-121);
        }

    }

    final void b(boolean param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = DungeonAssault.field_K;
        super.b(param0);
        tg.field_f[3] = nb.field_e;
        this.field_w = new ae(tg.field_f[3].length);
        fk.a((byte) 121, lf.field_w);
        jh.a(this.field_e);
        bf.a(false, -128);
        var7 = new int[4];
        var6 = var7;
        var5 = var6;
        var2 = var5;
        gf.a(var7);
        gf.e(41, 48, 599, 416);
        am.field_a.h(-(am.field_a.field_E / 2) + 320, 48);
        gf.b(var7);
        jh.b();
        this.field_s = new tf[this.field_w.field_i];
        this.a((byte) -127);
        wd.field_l = new bf[6];
        var3 = 0;
        while (var3 < 6) {
          wd.field_l[var3] = new bf(sf.field_b[var3]);
          var3++;
          if (var4 != 0) {
            return;
          }
        }
        this.field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        this.field_t = new rh(580, 394, 80, 160, 255, 197376, 240);
        mh.b(-1);
        return;
    }

    private final gd a(int param0, int param1, int param2, boolean param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        int var10;
        cn var11;
        cn var12;
        cn var13;
        int var14;
        cn var15;
        cn var16;
        gd var17;
        stackIn_3_0 = (param3) ? 16777215 : 8421504;
        var5 = stackIn_3_0;
        stackIn_6_0 = (param3) ? 8421616 : 4210816;
        var6 = stackIn_6_0;
        stackIn_9_0 = (!param3) ? 65793 : 12690143;
        var7 = stackIn_9_0;
        var8 = u.a(field_v, (byte) 68, tc.field_u, param1, var5, eh.field_o.field_q - 25);
        var9 = field_v.b(var8);
        var10 = field_v.field_H + la.field_b.field_E;
        var11 = new cn(var9, var10);
        var12 = new cn(var9, var10);
        var13 = new cn(var9, var10);
        jh.c();
        var11.e();
        field_v.b(var8, 0, la.field_b.field_H, var6, -1);
        var12.e();
        gf.a();
        var11.e(0, 0, 16744448);
        var13.e();
        gf.a();
        var11.e(0, 0, var7);
        var14 = -55 % ((-49 - param2) / 36);
        jh.b();
        var15 = rb.a(16, var12, 255, (byte) 81);
        var16 = rb.a(16, var12, 16711680, (byte) -44);
        var17 = new gd(var11, var13, var15, var12, var16, 0, param0);
        var17.field_u = new Integer(param1);
        eh.field_o.a(var17, (byte) -49);
        fo.field_d.a(var17, (byte) -20);
        if (gm.field_d.field_w == param1) {
          fo.field_d.a(var17, -256);
        }
        return var17;
    }

    final void a(boolean param0) {
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackIn_24_1 = false;
        boolean stackIn_27_0 = false;
        boolean stackOut_2_0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var11 = null;
        rj var5Lifetime1;
        var7 = DungeonAssault.field_K;
        this.field_e.b(0, 0);
        var2 = 0;
        boolean decompiledNaturalLoopExit1 = false;
        while (!(decompiledNaturalLoopExit1 = (!(this.field_w.field_i > var2)))) {
          stackOut_2_0 = sg.a(3, 3, var2);
          stackIn_8_0 = stackOut_2_0 ? 1 : 0;
          stackIn_3_0 = stackOut_2_0;
          if (var7 == 0) {
            if (stackIn_3_0) {
              this.b(83, var2);
            }
            var2++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit1) {
          stackIn_8_0 = 4;
        }
        var11 = new int[stackIn_8_0];
        gf.a(var11);
        gf.e(41, 48, 599, 416);
        var3 = 10;
        var4 = 88;
        le.field_f.h(40 + var3, var4 - 28);
        dh.a(32, 360, 220, 120);
        gf.b(var11);
        gf.b(80, 250, 256, 85, 1118481, 128);
        gf.e(80, 250, 256, 85, 5592405, 128);
        var5 = (rj) (this.field_p.e(-24172));
        L5: while (true) {
          if (var5 != null) {
            var5.a(102);
            var5 = (rj) (this.field_p.a(4));
            if (var7 == 0) {
              continue;
            }
          } else {
            if (null == this.field_b) {
              break L5;
            }
          }
          this.field_b.a((byte) -118);
          break;
        }
        oe.field_m.h(24, 383);
        oe.field_m.j(560, 383);
        db.e();
        this.field_r.d();
        this.field_t.d();
        var6 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(this.field_w.field_i > var6)))) {
          stackIn_27_0 = sg.a(3, 3, var6);
          if (var7 == 0) {
            if (stackIn_27_0) {
              stackIn_24_1 = (this.field_w.field_b == var6);
              this.a(stackIn_24_1, var6, 123);
            }
            var6++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_27_0 = of.field_k;
        }
        if (stackIn_27_0) {
          this.d(true);
          if (var7 != 0) {
            this.a(197376);
          }
        } else {
          this.a(197376);
        }
        var5Lifetime1 = (rj) (this.field_p.e(-24172));
        while (var5Lifetime1 != null) {
          var5Lifetime1.d(0);
          var5Lifetime1 = (rj) (this.field_p.a(4));
          if (var7 != 0) {
            return;
          }
        }
        if (null != this.field_b) {
          this.field_b.b(117);
        }
        bf.field_m.a(320, 25, 1699);
        return;
    }

    private final void d(boolean param0) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        int var3;
        int var4_int;
        String var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        int var8;
        int var9;
        int var5Lifetime1;
        var9 = DungeonAssault.field_K;
        var2 = 461;
        if (!param0) {
          this.field_t = (rh) null;
        }
        var3 = 170;
        if (null != mk.field_j.field_l) {
          gf.b(370, 110, 182, 124, 0, 208);
          var4_int = ((lk) (mk.field_j.field_l)).field_O;
          wd.field_l[var4_int].a(var3, var2, true, 100);
          field_v.c(li.field_b[var4_int], var2, var3 + 90, 0, -1);
          var5 = gm.field_d.field_J[var4_int] + gm.field_d.field_F[var4_int];
          if (ve.a(false)) {
            if (hm.field_m[var4_int]) {
              stackIn_11_0 = (var5 >= 5) ? 1 : 0;
            } else {
              stackIn_11_0 = 0;
            }
          } else {
            stackIn_11_0 = 0;
          }
          var6_int = stackIn_11_0;
          if (var6_int == 0) {
            var7 = (10 + 1 * var5) * fj.field_g[var4_int] / 10;
            stackIn_15_0 = (var7 <= gm.field_d.field_s) ? 0 : 16711680;
            var8 = stackIn_15_0;
            field_v.c(jk.a(new String[]{Integer.toString(var7 / 10)}, ho.field_c, 30496), var2, 105 + var3, var8, -1);
            la.field_b.a(un.field_a[var4_int], -80 + var2, var3 + 120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
            if (var9 != 0) {
              la.field_b.a(bl.field_b, -80 + var2, var3 + 120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
            }
          } else {
            la.field_b.a(bl.field_b, -80 + var2, var3 + 120, 160, 100, 0, -1, 1, 0, la.field_b.field_H);
          }
        }
        var4 = ng.field_L;
        var5Lifetime1 = 16777215;
        if (0 < gm.field_d.field_e) {
          if (1 >= gm.field_d.field_e) {
            var4 = oc.field_v;
            if (var9 != 0) {
              var4 = jk.a(new String[]{Integer.toString(gm.field_d.field_e)}, dg.field_G, 30496);
            }
          } else {
            var4 = jk.a(new String[]{Integer.toString(gm.field_d.field_e)}, dg.field_G, 30496);
          }
          var5Lifetime1 = 16711680;
          var6 = jk.a(new String[]{jk.a(120, gm.field_d.field_A)}, fl.field_n, 30496);
          la.field_b.a(var6, 80, 338, 250, 180, var5Lifetime1, -1, 1, 0, field_v.field_H);
        }
        la.field_b.a(var4, 80, -la.field_b.field_H + 211, 250, 45, var5Lifetime1, -1, 1, 2, field_v.field_H);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4;
        var4 = tg.field_f[3][param0];
        if (param1 != -1) {
          field_u = (String) null;
        }
        if (this.field_w.c(97) &&
          sg.a(3, 3, param0) && rp.a(param1 ^ -15204377, var4)) {
          hm.a(var4, param0, param2, -64);
        }
    }

    final void f() {
        if (mm.field_t == 13) {
          gd.a(ec.field_p, 0, ec.field_p, false);
          return;
        }
        if (ll.field_k &&
          mm.field_t == 1) {
          ld.field_b = !ld.field_b ? true : false;
        }
        if (null != this.field_b) {
          this.field_b.b(false);
          return;
        }
        this.field_w.d(0);
        if (this.field_w.field_b == -1) {
          return;
        }
        this.a(this.field_w.field_b, -1, false);
        if (DungeonAssault.field_K == 0) {
          return;
        }
        this.field_b.b(false);
    }

    private final int a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_7_0 = false;
        var6 = DungeonAssault.field_K;
        if (param2 != -117) {
          this.c(true);
        }
        var4 = 0;
        while (true) {
          if (tg.field_f[3].length <= var4) {
            return -1;
          }
          var5 = o.a(3, (byte) 95, var4);
          stackIn_7_0 = sg.a(3, 3, var4);
          if (var6 != 0) {
            return stackIn_7_0 ? 1 : 0;
          }
          if (stackIn_7_0 &&
            param1 >= bh.b(var4, 3, false) &&
            qd.a(var4, param2 ^ -265, 3) > param1 &&
            param0 >= var5 &&
            param0 < var5 + kf.a(var4, 3, -100)) {
            return var4;
          }
          var4++;
        }
    }

    public static void c(byte param0) {
        field_v = null;
        if (param0 < 87) {
          field_u = (String) null;
        }
        field_u = null;
    }

    db() {
    }

    static {
        field_u = "Quit to website";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
