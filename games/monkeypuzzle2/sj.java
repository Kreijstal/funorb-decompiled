/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_J;
    byte field_D;
    short field_k;
    int field_G;
    int[] field_B;
    short[] field_p;
    int[] field_E;
    short[] field_m;
    short[] field_c;
    short[] field_L;
    short[] field_O;
    short[] field_C;
    short[] field_I;
    short[] field_u;
    static fk field_g;
    short[] field_n;
    short[] field_h;
    short[] field_M;
    int[] field_o;
    private boolean field_i;
    int field_x;
    int field_q;
    short[] field_z;
    short[] field_l;
    int[] field_w;
    int field_j;
    short[] field_d;
    short field_e;
    byte[] field_N;
    int[] field_F;
    short field_r;
    int[] field_s;
    int field_b;
    int[] field_H;
    short[] field_a;
    int[] field_v;
    short[] field_A;
    static sg field_f;
    short[] field_y;
    int field_t;
    short[] field_K;

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var6 = 0;
        if (param4) {
            return;
        }
        while (var6 < ((sj) this).field_e) {
            ((sj) this).field_O[var6] = (short)(((sj) this).field_O[var6] * param1 / param3);
            ((sj) this).field_M[var6] = (short)(param0 * ((sj) this).field_M[var6] / param3);
            ((sj) this).field_z[var6] = (short)(param2 * ((sj) this).field_z[var6] / param3);
            var6++;
        }
        this.a((byte) -113);
    }

    private final void a(byte param0) {
        if (param0 > -97) {
            sj.a(3);
        }
        ((sj) this).field_i = false;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var5 = 0;
        if (param1 <= 11) {
            return;
        }
        while (((sj) this).field_e > var5) {
            ((sj) this).field_O[var5] = (short)(((sj) this).field_O[var5] + param2);
            ((sj) this).field_M[var5] = (short)(((sj) this).field_M[var5] + param3);
            ((sj) this).field_z[var5] = (short)(((sj) this).field_z[var5] + param0);
            var5++;
        }
        this.a((byte) -119);
    }

    final static void a(ad param0, ad param1, ad param2, ad param3, int param4) {
        int var6_int = 0;
        le[] var6 = null;
        int var7 = 0;
        int var8_int = 0;
        le[] var8 = null;
        int var9_int = 0;
        ai[] var9 = null;
        int var10_int = 0;
        int[] var10 = null;
        le var11_ref_le = null;
        int var11 = 0;
        int var12 = 0;
        ai[] var13 = null;
        le var14 = null;
        le[] var15 = null;
        le[] var16 = null;
        le[] var17 = null;
        ai[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        sb.field_r = vd.a(true, "", param0, param3, "big_font");
        pl.field_e = vd.a(true, "kartika13", param2, param1, "");
        ke.field_i = ma.a(param3, "background", 16711680, "");
        fi.field_a = lb.a(false, "", param3, "river_background");
        var13 = uj.a("", "jungle_background", param3, false);
        m.field_k = var13[0];
        m.field_k.b();
        ib.field_b = var13[1].a();
        ne.field_a = uj.a("", "waterfall_background", param3, false);
        var6_int = 0;
        L0: while (true) {
          if (var6_int >= ne.field_a.length) {
            tj.field_a = ma.a(param3, "aztec_background", 16711680, "");
            eg.field_d = new ai[4];
            eg.field_d[0] = df.a("", param3, (byte) 118, "river_borders");
            eg.field_d[1] = df.a("", param3, (byte) 118, "jungle_borders");
            eg.field_d[2] = df.a("", param3, (byte) 118, "waterfall_borders");
            eg.field_d[3] = df.a("", param3, (byte) 118, "aztec_borders");
            var6_int = 0;
            L1: while (true) {
              if (var6_int >= eg.field_d.length) {
                ka.field_b = ma.a(param1, "unachieved", 16711680, "basic");
                aj.field_e = ma.a(param1, "orbcoin", 16711680, "basic");
                le discarded$1 = ma.a(param1, "locked", 16711680, "basic");
                lb.field_E = lb.a(false, "", param3, "totems");
                dj.field_a = lb.a(false, "", param3, "vines");
                j.field_f = lb.a(false, "", param3, "birds");
                qi.field_K = lb.a(false, "", param3, "blocks");
                var6_int = 0;
                L2: while (true) {
                  if (dj.field_a.length <= var6_int) {
                    ac.field_a.a((byte) 120);
                    ba.field_a[0] = lb.a(false, "", param3, "sprite_explorer_idle");
                    ba.field_a[4] = lb.a(false, "", param3, "sprite_explorer_celebrate_maj");
                    ba.field_a[3] = lb.a(false, "", param3, "sprite_explorer_celebrate_min");
                    ba.field_a[2] = lb.a(false, "", param3, "sprite_explorer_climbing");
                    ba.field_a[1] = lb.a(false, "", param3, "sprite_explorer_shoot");
                    ba.field_a[5] = lb.a(false, "", param3, "sprite_explorer_lose");
                    ba.field_a[6] = lb.a(false, "", param3, "sprite_explorer_idle_panic");
                    kb.field_a = new le[8];
                    var6 = lb.a(false, "", param3, "menu_titles");
                    kb.field_a[6] = var6[6];
                    kb.field_a[2] = var6[2];
                    kb.field_a[5] = var6[4];
                    kb.field_a[3] = var6[3];
                    kb.field_a[1] = var6[1];
                    kb.field_a[0] = var6[0];
                    kb.field_a[7] = var6[5];
                    cm.field_F = new le[ba.field_a[0].length];
                    var7 = 0;
                    L3: while (true) {
                      if (cm.field_F.length <= var7) {
                        ac.field_a.a((byte) 119);
                        wl.field_f = lb.a(false, "", param3, "catapult");
                        hf.field_d = ma.a(param3, "sun", 16711680, "");
                        qa.field_i = ma.a(param3, "moon", 16711680, "");
                        l.field_D = new le[5];
                        l.field_D[0] = ma.a(param3, "world_one_complete", 16711680, "");
                        l.field_D[1] = ma.a(param3, "world_two_complete", 16711680, "");
                        l.field_D[2] = ma.a(param3, "world_three_complete", 16711680, "");
                        l.field_D[3] = ma.a(param3, "world_four_complete", 16711680, "");
                        l.field_D[4] = ma.a(param3, "game_complete", 16711680, "");
                        ib.field_d = ma.a(param3, "game_over", 16711680, "");
                        m.field_i = lb.a(false, "", param3, "water");
                        ph.field_d = ma.a(param3, "map", 16711680, "");
                        var15 = lb.a(false, "", param3, "monkeys_idle");
                        var8_int = 0;
                        L4: while (true) {
                          if (var8_int >= 5) {
                            var16 = lb.a(false, "", param3, "monkeys_falling");
                            var8_int = 0;
                            L5: while (true) {
                              if (5 <= var8_int) {
                                ck.field_a = lb.a(false, "", param3, "basket");
                                j.field_g = ma.a(param3, "raft", 16711680, "");
                                ci.field_d = ma.a(param3, "arrow", 16711680, "");
                                ak.field_t = lb.a(false, "", param3, "sprite_coconuts");
                                qh.field_a = lb.a(false, "", param3, "gecko");
                                ik.field_p = lb.a(false, "", param3, "waterfall_central");
                                cl.field_c = lb.a(false, "", param3, "waterfall_bottom");
                                cc.field_a[0] = lb.a(false, "", param3, "fish_a");
                                cc.field_a[1] = lb.a(false, "", param3, "fish_b");
                                cc.field_a[2] = lb.a(false, "", param3, "fish_c");
                                pc.field_U = lb.a(false, "", param3, "eyes");
                                ie.field_b = lb.a(false, "", param3, "achievements_large");
                                wc.field_e = lb.a(false, "", param3, "menu_frame");
                                df.field_q = lb.a(false, "", param3, "menu_monkey");
                                kj.field_F = ma.a(param3, "menu_vine", 16711680, "");
                                wg.field_g = ma.a(param3, "title_logo", 16711680, "");
                                we.field_f = lb.a(false, "", param3, "title_monkey");
                                w.field_b = lb.a(false, "", param3, "title_flashes");
                                j.field_c = ma.a(param3, "intro_screen", 16711680, "");
                                uk.field_n = ma.a(param3, "title_2", 16711680, "");
                                fe.field_f = lb.a(false, "", param3, "river");
                                de.field_f = ma.a(param3, "slider", 16711680, "");
                                sd.field_f = ma.a(param3, "bar", 16711680, "");
                                wc.field_h = ma.a(param3, "web", 16711680, "");
                                tl.field_b = ma.a(param3, "heavy_nut", 16711680, "");
                                ni.field_c[0] = df.a("", param3, (byte) 118, "x1");
                                ni.field_c[1] = df.a("", param3, (byte) 118, "x2");
                                ni.field_c[2] = df.a("", param3, (byte) 118, "x3");
                                ni.field_c[3] = df.a("", param3, (byte) 118, "x4");
                                ik.field_o = lb.a(false, "", param3, "fs_frame");
                                ji.field_b = lb.a(false, "", param3, "fs_frame_inv");
                                var8_int = 0;
                                L6: while (true) {
                                  if (ni.field_c.length <= var8_int) {
                                    qc.field_L = lb.a(false, "", param3, "map_explorer");
                                    var8 = lb.a(false, "", param3, "spider");
                                    var9_int = 4;
                                    L7: while (true) {
                                      if (var9_int < 0) {
                                        ac.field_a.a((byte) 113);
                                        var17 = ie.field_b;
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var10_int >= var17.length) {
                                            wh.a((byte) -68, ka.field_b);
                                            var9_int = 0;
                                            L9: while (true) {
                                              if (var9_int >= 300) {
                                                var18 = new ai[6];
                                                var9 = var18;
                                                var9[0] = df.a("", param3, (byte) 118, "keyboard_left");
                                                var9[1] = df.a("", param3, (byte) 118, "keyboard_right");
                                                var9[2] = df.a("", param3, (byte) 118, "keyboard_enter");
                                                var9[3] = df.a("", param3, (byte) 118, "keyboard_space");
                                                var9[4] = df.a("", param3, (byte) 118, "keyboard_esc");
                                                var9[5] = df.a("", param3, (byte) 118, "keyboard_ctrl");
                                                var22 = new int[var18.length];
                                                var21 = var22;
                                                var20 = var21;
                                                var19 = var20;
                                                var10 = var19;
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var11 >= var22.length) {
                                                    pl.field_e.a((bh[]) (Object) var9, var22);
                                                    ac.field_a.a((byte) 110);
                                                    return;
                                                  } else {
                                                    var10[var11] = -3 + var18[var11].field_l;
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                sc.field_h[var9_int] = pf.a((byte) 125, 16);
                                                var9_int++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            var11_ref_le = var17[var10_int];
                                            wh.a((byte) -114, var11_ref_le);
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        hb.field_m[var9_int] = new le[var8.length];
                                        var10_int = 0;
                                        L11: while (true) {
                                          if (var8.length <= var10_int) {
                                            var9_int--;
                                            continue L7;
                                          } else {
                                            hb.field_m[var9_int][var10_int] = new le(var8[var10_int].field_m, var8[var10_int].field_n);
                                            hb.field_m[var9_int][var10_int].e();
                                            var8[var10_int].d(0, 0, vg.field_K[var9_int]);
                                            var10_int++;
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    ni.field_c[var8_int].b();
                                    var8_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                nh.field_f[1][var8_int] = new le[4];
                                var9_int = var8_int;
                                var10_int = 0;
                                L12: while (true) {
                                  if (var9_int >= 20) {
                                    var8_int++;
                                    continue L5;
                                  } else {
                                    nh.field_f[1][var8_int][var10_int] = new le(var16[var9_int].field_m, var16[var9_int].field_n);
                                    nh.field_f[1][var8_int][var10_int] = var16[var9_int];
                                    var9_int += 5;
                                    var10_int++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          } else {
                            nh.field_f[0][var8_int] = new le[4];
                            var9_int = var8_int;
                            var10_int = 0;
                            L13: while (true) {
                              if (20 <= var9_int) {
                                var8_int++;
                                continue L4;
                              } else {
                                nh.field_f[0][var8_int][var10_int] = new le(var15[var9_int].field_m, var15[var9_int].field_n);
                                nh.field_f[0][var8_int][var10_int] = var15[var9_int];
                                var10_int++;
                                var9_int += 5;
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        cm.field_F[var7] = new le(6 + ba.field_a[0][var7].field_m, ba.field_a[0][var7].field_n - -6);
                        cm.field_F[var7].e();
                        ba.field_a[0][var7].a(3, 3);
                        h.a(3, 16777215, 0, false, cm.field_F[var7].field_j, 0, cm.field_F[var7].field_k, cm.field_F[var7]);
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var14 = new le(2 + dj.field_a[var6_int].field_m, dj.field_a[var6_int].field_n - -1);
                    var14.e();
                    dj.field_a[var6_int].c(1, 0);
                    var14.e(1);
                    dj.field_a[var6_int] = var14;
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                eg.field_d[var6_int].b();
                var6_int++;
                continue L1;
              }
            }
          } else {
            ne.field_a[var6_int].b();
            var6_int++;
            continue L0;
          }
        }
    }

    final static le a(int param0, int param1, int param2) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        le var6 = new le(param0, param0);
        le var3 = var6;
        int var4 = 0;
        if (param1 != 74) {
            return null;
        }
        while (var3.field_s.length > var4) {
            var6.field_s[var4] = param2;
            var4++;
        }
        return var3;
    }

    final static void a(int param0) {
        cb.field_c[91] = 42;
        cb.field_c[47] = 73;
        cb.field_c[93] = 43;
        cb.field_c[222] = 58;
        cb.field_c[520] = 59;
        cb.field_c[192] = 28;
        cb.field_c[59] = 57;
        cb.field_c[param0] = 74;
        cb.field_c[44] = 71;
        cb.field_c[46] = 72;
        cb.field_c[61] = 27;
        cb.field_c[45] = 26;
    }

    public static void b(int param0) {
        field_g = null;
        field_f = null;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == 74) {
            break L0;
          } else {
            ((sj) this).field_y = null;
            break L0;
          }
        }
        if (!((sj) this).field_i) {
          ((sj) this).field_i = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((sj) this).field_e) {
              ((sj) this).field_t = var7;
              ((sj) this).field_q = var5;
              ((sj) this).field_j = var3;
              ((sj) this).field_b = var6;
              ((sj) this).field_G = var2;
              ((sj) this).field_x = var4;
              return;
            } else {
              L2: {
                var9 = ((sj) this).field_O[var8];
                var10 = ((sj) this).field_M[var8];
                if (var3 > var10) {
                  var3 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var2 > var9) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var6 < var10) {
                  var6 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 > var5) {
                  var5 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var11 = ((sj) this).field_z[var8];
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    sj() {
        ((sj) this).field_i = false;
        ((sj) this).field_D = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new fk(2);
        field_f = new sg(1);
    }
}
