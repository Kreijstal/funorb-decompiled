/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class TorChallenge extends d {
    static sl field_I;
    static si field_H;
    static int field_G;
    static int field_E;
    public static boolean field_F;

    public final void init() {
        try {
          this.a((byte) 58, 12, "torchallenge");
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.init()");
        }
    }

    private final void t(int param0) {
        ka[] array$0 = null;
        ka[] array$1 = null;
        ka[] array$2 = null;
        ka[] array$3 = null;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_140_1 = 0;
        int stackIn_182_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_235_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3_int = 0;
        ka[] var3 = null;
        ka var4_ref_ka = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7_int = 0;
        ka var7 = null;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        ka var10 = null;
        ka var11 = null;
        int var12 = 0;
        var12 = field_F ? 1 : 0;
        try {
          tk.a(param0 + 101);
          ag.field_e = ad.a(ic.field_C, bh.field_q, "", "small_font", false);
          ph.field_o = new ka[7];
          ph.field_o[0] = qk.a("", "overlay_title", ic.field_C, TorChallenge.a(param0, 1));
          ph.field_o[1] = qk.a("", "overlay_pause", ic.field_C, 0);
          ph.field_o[2] = qk.a("", "overlay_highscores", ic.field_C, 0);
          ph.field_o[3] = qk.a("", "overlay_instructions", ic.field_C, param0 - 1);
          ph.field_o[4] = qk.a("", "overlay_achievements", ic.field_C, 0);
          ph.field_o[5] = qk.a("", "overlay_characters", ic.field_C, 0);
          ph.field_o[6] = qk.a("", "overlay_levels", ic.field_C, 0);
          ri.field_j = qk.a("", "overlay_title_tile", ic.field_C, param0 ^ 1);
          ui.field_i = v.a("frame", 26, "", ic.field_C);
          dh.field_cb = new ka[2][];
          hd.field_a = v.a("main_menu_frame", param0 + 123, "", ic.field_C);
          dh.field_cb[0] = hd.field_a;
          dh.field_cb[1] = lk.a(-127, "char_select_frame_selected", "", ic.field_C);
          ba.field_b = v.a("button_frame", 53, "", ic.field_C);
          aa.field_k = lk.a(-127, "nav_frame", "", ic.field_C);
          ph.field_m = lk.a(param0 - 129, "text_frame", "", ic.field_C);
          qf.field_c = lk.a(-127, "seal_list", "", ic.field_C);
          ib.field_M = lk.a(-127, "go_button", "", ic.field_C);
          dg.field_J = v.a("instructions_frame", 35, "", ic.field_C);
          lk.a(-127, "char_select_arrows", "", ic.field_C);
          ua.field_d = mh.a(param0 + 52, ic.field_C, "keys", "");
          dj.field_V = mh.a(113, ic.field_C, "keys2", "");
          tf.field_j = lk.a(-128, "achievements_large", "", ic.field_C);
          var2 = tf.field_j;
          var3_int = 0;
          do {
            if (var3_int >= var2.length) {
              fd.a((byte) -44, je.field_b);
              lj.field_o = lk.a(-127, "interface_clouds", "", ic.field_C);
              rd.field_i = lk.a(param0 ^ -127, "interface_border", "", ic.field_C);
              ng.field_L = lk.a(param0 - 128, "interface_score_health", "", ic.field_C);
              ph.field_h = lk.a(-127, "interface_lives_remaining", "", ic.field_C);
              di.field_t = lk.a(-128, "interface_lives_heads", "", ic.field_C);
              rc.field_p = lk.a(-127, "interface_bo_energy", "", ic.field_C);
              ni.field_h = lk.a(param0 - 128, "interface_sais_energy", "", ic.field_C);
              ba.field_d = lk.a(-128, "interface_glovepunch_energy", "", ic.field_C);
              wf.field_b = qk.a("", "interface_seals", ic.field_C, 0);
              dl.field_j = qk.a("", "interface_sealscollected", ic.field_C, param0 ^ 1);
              mb.field_d = lk.a(-128, "interface_health_icon", "", ic.field_C);
              rl.field_h = lk.a(param0 - 129, "boss_heads", "", ic.field_C);
              la.field_f.a(-63);
              ie.field_f = new ka[3][2];
              ie.field_f[0][0] = rc.field_p[0];
              ie.field_f[0][1] = rc.field_p[1];
              ie.field_f[1][0] = ni.field_h[0];
              ie.field_f[1][1] = ni.field_h[1];
              ie.field_f[2][0] = ba.field_d[0];
              ie.field_f[2][1] = ba.field_d[1];
              dh.field_Y = qk.a("", "menu_slider", ic.field_C, 0);
              wa.field_xb = rb.a(ic.field_C, "", (byte) -127, "intro4_bg");
              hl.a(wa.field_xb, false, gf.field_m[3][0]);
              break;
            }
            var4_ref_ka = var2[var3_int];
            fd.a((byte) -44, var4_ref_ka);
            var3_int++;
          } while (var12 == 0);
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int >= 5))) {
            array$0 = new ka[s.field_l[var2_int]];
            ef.field_h[var2_int] = array$0;
            var3_int = var2_int;
            stackIn_51_0 = var3_int;
            if (var12 == 0) {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      if (stackIn_51_0 == 0) {
                        ef.field_h[var2_int][0] = qk.a("", "intro1", ic.field_C, 0);
                        break L6;
                      } else if (var3_int != 1) {
                        switch (var3_int) {
                          case 2:
                            break L9;
                          case 3:
                            break L8;
                          case 4:
                            break L7;
                          default:
                            break L6;
                        }
                      }
                      ef.field_h[var2_int][0] = qk.a("", "intro2", ic.field_C, param0 - 1);
                      break L6;
                    }
                    ef.field_h[var2_int][0] = qk.a("", "intro3", ic.field_C, param0 - 1);
                    break L6;
                  }
                  ef.field_h[var2_int][0] = null;
                  ef.field_h[var2_int][1] = qk.a("", "intro4_enemies", ic.field_C, 0);
                  break L6;
                }
                ef.field_h[var2_int][0] = qk.a("", "intro5", ic.field_C, 0);
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            ef.field_h[3][0] = wa.field_xb.a();
            wa.field_xb = null;
            we.field_m = new ka[4];
            we.field_m[0] = null;
            qc.field_c = rb.a(ic.field_C, "", (byte) -116, "game_start_bg");
            we.field_m[1] = qk.a("", "game_start_henhui", ic.field_C, 0);
            we.field_m[2] = qk.a("", "game_start_ziren", ic.field_C, 0);
            we.field_m[3] = qk.a("", "game_start_damen", ic.field_C, 0);
            eb.field_p = new ka[2];
            eb.field_p[0] = qk.a("", "level_start_heads", ic.field_C, param0 - 1);
            eb.field_p[1] = qk.a("", "level_start_tower_1", ic.field_C, 0);
            pl.field_f = new ka[4];
            pl.field_f[0] = null;
            ad.field_e = rb.a(ic.field_C, "", (byte) -115, "level_start_boss_bg");
            hl.a(ad.field_e, false, 15245826);
            pl.field_f[1] = qk.a("", "level_start_boss_1", ic.field_C, param0 - 1);
            pl.field_f[2] = qk.a("", "level_start_boss_2", ic.field_C, 0);
            pl.field_f[3] = qk.a("", "level_start_boss_3", ic.field_C, 0);
            ei.field_w = new ka[4];
            ei.field_w[0] = null;
            lb.field_t = rb.a(ic.field_C, "", (byte) -128, "game_over_scene_bg");
            hl.a(lb.field_t, false, 6831816);
            ei.field_w[1] = qk.a("", "game_over_scene_henhui", ic.field_C, 0);
            ei.field_w[2] = qk.a("", "game_over_scene_ziren", ic.field_C, param0 - 1);
            ei.field_w[3] = qk.a("", "game_over_scene_damen", ic.field_C, 0);
            pf.field_a = new ka[5];
            pf.field_a[0] = null;
            mb.field_b = qc.field_c.b();
            hl.a(qc.field_c, false, 15245826);
            hl.a(mb.field_b, false, 6831816);
            pf.field_a[1] = qk.a("", "game_win_1_henhui", ic.field_C, 0);
            pf.field_a[2] = qk.a("", "game_win_1_ziren", ic.field_C, 0);
            pf.field_a[3] = qk.a("", "game_win_1_damen", ic.field_C, 0);
            pf.field_a[4] = qk.a("", "game_win_1_stars", ic.field_C, 0);
            pe.field_eb = lk.a(-127, "status_messages", "", ic.field_C);
            var2_int = pe.field_eb.length;
            stackIn_51_0 = 0;
          }
          var3_int = stackIn_51_0;
          do {
            if (var2_int <= var3_int) {
              dd.field_m = lk.a(param0 - 129, "rocket_trail", "", ic.field_C);
              qb.a((byte) 49, dd.field_m);
              wh.field_f = lk.a(-127, "dust_cloud", "", ic.field_C);
              qb.a((byte) 45, wh.field_f);
              ve.field_b = lk.a(param0 - 128, "monk1", "", ic.field_C);
              qb.a((byte) 87, ve.field_b);
              tf.field_a = lk.a(param0 - 128, "monk2", "", ic.field_C);
              qb.a((byte) 81, tf.field_a);
              oe.field_d = lk.a(param0 - 128, "monk3", "", ic.field_C);
              qb.a((byte) 23, oe.field_d);
              hc.field_T = lk.a(param0 ^ -127, "monk1_swooshes", "", ic.field_C);
              qb.a((byte) 57, hc.field_T);
              cg.field_d = lk.a(-127, "monk2_swooshes", "", ic.field_C);
              qb.a((byte) 16, cg.field_d);
              af.field_b = lk.a(-127, "boss1", "", ic.field_C);
              qb.a((byte) 64, af.field_b);
              aj.field_i = lk.a(-127, "boss1_attacks", "", ic.field_C);
              qb.a((byte) 33, aj.field_i);
              pl.field_c = lk.a(-127, "boss2", "", ic.field_C);
              qb.a((byte) 72, pl.field_c);
              s.field_n = lk.a(-127, "boss2_attacks", "", ic.field_C);
              qb.a((byte) 109, s.field_n);
              hi.field_F = lk.a(-127, "boss3", "", ic.field_C);
              qb.a((byte) 126, hi.field_F);
              nk.field_a = lk.a(-128, "boss3_attacks", "", ic.field_C);
              qb.a((byte) 14, nk.field_a);
              si.field_I = new ka[3][][];
              break;
            }
            pe.field_eb[var3_int].g();
            var3_int++;
          } while (var12 == 0);
          var6_int = 0;
          while (true) {
            stackIn_60_0 = -4;
            if (stackIn_60_0 < ~var6_int) {
              var5 = oj.field_g[var6_int][1];
              var4 = oj.field_g[var6_int][0];
              si.field_I[var6_int] = new ka[var4][var5];
              if (var12 == 0) {
                boolean decompiledFrameRemainder4 = true;
                if (var6_int != 0) {
                  if (1 != var6_int) {
                    decompiledFrameRemainder4 = (2 == var6_int);
                    if (decompiledFrameRemainder4) {
                      var3 = lk.a(-127, "boss3_swooshes", "", ic.field_C);
                    }
                  } else {
                    var3 = lk.a(-128, "boss2_swooshes", "", ic.field_C);
                  }
                } else {
                  var3 = lk.a(-128, "boss1_swooshes", "", ic.field_C);
                }
                if (decompiledFrameRemainder4) {
                  qb.a((byte) 4, var3);
                  var7_int = 0;
                  while (var7_int < var4) {
                    stackIn_60_0 = 0;
                    var8 = stackIn_60_0;
                    while (var5 > var8) {
                      si.field_I[var6_int][var7_int][var8] = var3[var5 * var7_int + var8];
                      var8++;
                    }
                    var7_int++;
                  }
                }
                var6_int++;
                continue;
              }
            } else {
              dj.field_O = qk.a("", "spear", ic.field_C, 0);
            }
            var3 = null;
            this.b(true);
            var6_int = 0;
            while (true) {
              stackIn_89_0 = 3;
              boolean decompiledFrameRemainder3 = true;
              if (stackIn_89_0 > var6_int) {
                stackIn_113_0 = 0;
                decompiledFrameRemainder3 = (var12 == 0);
                if (decompiledFrameRemainder3) {
                  var7_int = stackIn_113_0;
                  while (true) {
                    stackIn_93_0 = 20;
                    if (stackIn_93_0 > var7_int) {
                      array$1 = new ka[db.field_x[var7_int][var6_int]];
                      c.field_c[var7_int][var6_int] = array$1;
                      stackIn_89_0 = 0;
                      var8 = stackIn_89_0;
                      while (db.field_x[var7_int][var6_int] > var8) {
                        stackIn_93_0 = var6_int;
                        if (stackIn_93_0 == 0) {
                          c.field_c[var7_int][var6_int][var8] = ve.field_b[var8 + var7_int * 6];
                        }
                        if (var6_int == 1) {
                          c.field_c[var7_int][var6_int][var8] = tf.field_a[var8 + 6 * var7_int];
                        }
                        if (2 == var6_int) {
                          c.field_c[var7_int][var6_int][var8] = oe.field_d[var8 + 6 * var7_int];
                        }
                        var8++;
                      }
                      var7_int++;
                      continue;
                    }
                    break;
                  }
                  var6_int++;
                  continue;
                }
              }
              if (decompiledFrameRemainder3) {
                ve.field_b = null;
                oe.field_d = null;
                tf.field_a = null;
                stackIn_113_0 = 0;
              }
              var6_int = stackIn_113_0;
              while (true) {
                stackIn_115_0 = var6_int;
                boolean decompiledFrameRemainder2 = true;
                if (stackIn_115_0 < 2) {
                  stackIn_134_0 = 0;
                  decompiledFrameRemainder2 = (var12 == 0);
                  if (decompiledFrameRemainder2) {
                    var7_int = stackIn_134_0;
                    while (true) {
                      stackIn_119_0 = ~var7_int;
                      stackIn_119_1 = -21;
                      if (stackIn_119_0 > stackIn_119_1) {
                        array$2 = new ka[db.field_x[var7_int][var6_int]];
                        uf.field_o[var7_int][var6_int] = array$2;
                        stackIn_115_0 = 0;
                        var8 = stackIn_115_0;
                        while (var8 < db.field_x[var7_int][var6_int]) {
                          stackIn_119_0 = 0;
                          stackIn_119_1 = var6_int;
                          if (stackIn_119_0 == stackIn_119_1) {
                            uf.field_o[var7_int][var6_int][var8] = hc.field_T[var8 + 6 * var7_int];
                          }
                          if (1 == var6_int) {
                            uf.field_o[var7_int][var6_int][var8] = cg.field_d[var8 + 6 * var7_int];
                          }
                          var8++;
                        }
                        var7_int++;
                        continue;
                      }
                      break;
                    }
                    var6_int++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder2) {
                  cg.field_d = null;
                  hc.field_T = null;
                  ak.field_a[0] = lk.a(-127, "henhui_puff", "", ic.field_C);
                  ak.field_a[1] = lk.a(param0 - 129, "ziren_puff", "", ic.field_C);
                  ak.field_a[2] = lk.a(-128, "damen_puff", "", ic.field_C);
                  ra.field_b[0][0] = qk.a("", "damen_vert_swipe", ic.field_C, param0 - 1);
                  ra.field_b[0][1] = ra.field_b[0][0].i();
                  ra.field_b[1][0] = qk.a("", "damen_angled_swipe", ic.field_C, 0);
                  ra.field_b[1][1] = ra.field_b[1][0].i();
                  stackIn_134_0 = 0;
                }
                var6_int = stackIn_134_0;
                while (true) {
                  stackIn_136_0 = var6_int;
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_136_0 < 3) {
                    stackIn_182_0 = 0;
                    decompiledFrameRemainder1 = (var12 == 0);
                    if (decompiledFrameRemainder1) {
                      var7_int = stackIn_182_0;
                      while (true) {
                        stackIn_140_0 = var7_int;
                        stackIn_140_1 = 16;
                        if (stackIn_140_0 < stackIn_140_1) {
                          array$3 = new ka[kk.field_h[var7_int][var6_int]];
                          g.field_i[var7_int][var6_int] = array$3;
                          stackIn_136_0 = 0;
                          var8 = stackIn_136_0;
                          while (var8 < kk.field_h[var7_int][var6_int]) {
                            stackIn_140_0 = 0;
                            stackIn_140_1 = var6_int;
                            if (stackIn_140_0 == stackIn_140_1) {
                              if (8 > var7_int) {
                                g.field_i[var7_int][var6_int][var8] = af.field_b[var7_int * 8 + var8];
                              } else {
                                g.field_i[var7_int][var6_int][var8] = aj.field_i[var7_int * 8 - 64 + var8];
                              }
                            } else if (1 != var6_int) {
                              if (var6_int == 2) {
                                if (var7_int < 8) {
                                  g.field_i[var7_int][var6_int][var8] = hi.field_F[var8 + var7_int * 8];
                                } else {
                                  g.field_i[var7_int][var6_int][var8] = nk.field_a[var8 + var7_int * 8 - 64];
                                }
                              }
                            } else if (var7_int < 8) {
                              g.field_i[var7_int][var6_int][var8] = pl.field_c[var8 + 8 * var7_int];
                            } else {
                              g.field_i[var7_int][var6_int][var8] = s.field_n[8 * (-8 + var7_int) + var8];
                            }
                            var8++;
                          }
                          var7_int++;
                          continue;
                        }
                        break;
                      }
                      var6_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    ec.field_a = lk.a(param0 - 129, "tour_icon", "", ic.field_C);
                    qb.a((byte) 21, ec.field_a);
                    wi.field_d = lk.a(-127, "coins", "", ic.field_C);
                    qb.a((byte) 103, wi.field_d);
                    be.field_f = lk.a(-127, "tour_wall", "", ic.field_C);
                    ic.field_D = lk.a(param0 ^ -127, "tour_wall2", "", ic.field_C);
                    af.field_a = lk.a(-128, "tour_wall3", "", ic.field_C);
                    stackIn_182_0 = 0;
                  }
                  var6_int = stackIn_182_0;
                  L68: while (true) {
                    if (6 > var6_int) {
                      stackIn_194_0 = 0;
                      if (var12 != 0) {
                        break L68;
                      }
                      var7_int = stackIn_194_0;
                      while (var7_int < 2) {
                        we.field_e[var6_int][var7_int] = new ka(ic.field_D[0].field_u, ic.field_D[0].field_x);
                        var7_int++;
                      }
                      var6_int++;
                      continue;
                    }
                    stackIn_194_0 = 0;
                    break;
                  }
                  var6_int = stackIn_194_0;
                  L74: while (true) {
                    if (var6_int < 2) {
                      stackIn_206_0 = 0;
                      if (var12 != 0) {
                        break L74;
                      }
                      var7_int = stackIn_206_0;
                      while (var7_int < 2) {
                        re.field_v[var6_int][var7_int] = new ka(af.field_a[0].field_u, af.field_a[0].field_x);
                        var7_int++;
                      }
                      var6_int++;
                      continue;
                    }
                    stackIn_206_0 = 0;
                    break;
                  }
                  var6_int = stackIn_206_0;
                  while (true) {
                    stackIn_208_0 = ~var6_int;
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_208_0 > -5) {
                      stackIn_223_0 = 0;
                      decompiledFrameRemainder0 = (var12 == 0);
                      if (decompiledFrameRemainder0) {
                        var7_int = stackIn_223_0;
                        while (2 > var7_int) {
                          stackIn_208_0 = 0;
                          var8 = stackIn_208_0;
                          while (var8 < 2) {
                            sf.field_d[var6_int][var7_int][var8] = new ka(be.field_f[ea.field_e * 6 + var8].field_u, be.field_f[var8 + 6 * ea.field_e].field_x);
                            var8++;
                          }
                          var7_int++;
                        }
                        var6_int++;
                        continue;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      kj.field_C = lk.a(param0 - 129, "doors", "", ic.field_C);
                      qb.a((byte) 82, kj.field_C);
                      stackIn_223_0 = 8;
                    }
                    var6 = new int[stackIn_223_0];
                    var8 = 90;
                    var7 = new ka(var8, var8);
                    je.field_g = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    cj.field_c = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    od.a(33, 30, 68, 90, 34, 45, je.field_g, var7, var6);
                    var6 = null;
                    var7_ref = null;
                    je.field_g.h();
                    c.field_b = qk.a("", "door_sign", ic.field_C, 0);
                    c.field_b.h();
                    si.field_F = new ka(kj.field_C[0].field_q, kj.field_C[0].field_v);
                    si.field_F.d();
                    qg.f(33, 30, 68, 90, param0);
                    kj.field_C[1].g(0, 0);
                    la.field_f.a(101);
                    dk.field_c = new ka[4][9];
                    var9 = 0;
                    L89: while (true) {
                      if (var9 < 4) {
                        stackIn_235_0 = 0;
                        if (var12 != 0) {
                          break L89;
                        }
                        var10_int = stackIn_235_0;
                        while (9 > var10_int) {
                          dk.field_c[var9][var10_int] = wi.field_d[var10_int + var9 * 9];
                          var10_int++;
                        }
                        var9++;
                        continue;
                      }
                      wi.field_d = null;
                      lj.field_h = lk.a(param0 - 128, "clouds", "", ic.field_C);
                      qb.a((byte) 86, lj.field_h);
                      var9 = tf.field_x.field_x + tf.field_x.field_K;
                      hh.field_b = new ka(var9, var9);
                      hh.field_b.d();
                      bc.field_f.c(0, 0, var9, var9);
                      bc.field_f = null;
                      la.field_f.a(105);
                      stackIn_235_0 = 12476;
                      break;
                    }
                    oj.a(gi.b(stackIn_235_0), 0, 80, false, il.field_p, 255);
                    var10 = qk.a("", "mb_frames", ic.field_C, param0 ^ 1);
                    pl.a(13267, dl.field_E, var10);
                    nj.a(qk.a("", "mb_logo", ic.field_C, 0), 2);
                    pa.a(-99, lk.a(-127, "mb_sshots", "", ic.field_C));
                    var11 = qk.a("", "mb_pricing_bg", ic.field_C, 0);
                    hc.a(10, param0 ^ 100, 10, 30, 80, 1500, 80, 10, var11);
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "TorChallenge.B(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 1) {
            TorChallenge.a((String) null, false, -43, -1, (String) null, (String) null, 18);
          }
          field_I = null;
          field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "TorChallenge.L(" + param0 + ')');
        }
    }

    final void f(int param0) {
        boolean stackIn_82_0 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        ka var3_ref_ka = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ka var3_ref_kaLifetime1;
        int var4Lifetime1;
        var5 = field_F ? 1 : 0;
        try {
          var2 = ab.a(102);
          if (hc.c((byte) 57)) {
            ib.a(var2, param0 - 7783, ph.a((byte) -40));
            return;
          }
          if (!eb.field_o) {
            il.a(-20895, var2);
            return;
          }
          if (!jh.a((byte) 103)) {
            mh.a(wa.field_qb, (byte) -125, 100.0f);
            il.a(-20895, var2);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (~bc.field_o != ~bb.field_h) {
            if (16 <= hk.field_e) {
              if (-1 != bb.field_h) {
                ug.field_i[bb.field_h].e(param0 ^ 1014663489);
                if (var5 != 0) {
                  ji.field_m.c(param0 ^ 7856);
                }
              } else {
                ji.field_m.c(param0 ^ 7856);
              }
              var3_ref_ka = new ka(1, 1);
              var3_ref_ka.field_y = qg.field_i;
              var3_ref_ka.field_q = qg.field_g;
              var3_ref_ka.field_u = qg.field_g;
              var3_ref_ka.field_v = qg.field_f;
              var3_ref_ka.field_x = qg.field_f;
              var4 = 256 * (hk.field_e + 1 - 16) / 16;
              var3_ref_ka.e(0, 0, var4);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (bc.field_o != -1) {
                ug.field_i[bc.field_o].e(param0 ^ 1014663489);
                if (var5 != 0) {
                  ji.field_m.c(48);
                }
              } else {
                ji.field_m.c(48);
              }
              var3_ref_kaLifetime1 = new ka(1, 1);
              var3_ref_kaLifetime1.field_q = qg.field_g;
              var3_ref_kaLifetime1.field_u = qg.field_g;
              var3_ref_kaLifetime1.field_y = qg.field_i;
              var3_ref_kaLifetime1.field_v = qg.field_f;
              var3_ref_kaLifetime1.field_x = qg.field_f;
              var4Lifetime1 = (-(255 * hk.field_e) + 3825) / 15;
              var3_ref_kaLifetime1.e(0, 0, var4Lifetime1);
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (-1 == bc.field_o) {
              ji.field_m.c(48);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (bc.field_o == 8 ||
                9 == bc.field_o) {
                ug.field_i[8].e(1014667201);
                ug.field_i[9].e(1014667201);
                if (var5 != 0) {
                  if (bc.field_o != 10 &&
                    11 != bc.field_o) {
                    ug.field_i[bc.field_o].e(1014667201);
                    ug.field_i[10].e(1014667201);
                    ug.field_i[11].e(param0 + 1014659393);
                  } else {
                    ug.field_i[10].e(1014667201);
                    ug.field_i[11].e(param0 + 1014659393);
                  }
                }
              } else {
                boolean decompiledSharedTail0 = (bc.field_o == 10 ||
                  11 == bc.field_o);
                if (!decompiledSharedTail0) {
                  ug.field_i[bc.field_o].e(1014667201);
                  decompiledSharedTail0 = (var5 != 0);
                }
                if (decompiledSharedTail0) {
                  ug.field_i[10].e(1014667201);
                  ug.field_i[11].e(param0 + 1014659393);
                }
              }
            }
          }
          if (param0 != 7808) {
            field_G = -107;
          }
          if (vc.a(0)) {
            qg.d(0, 0, qg.field_g, qg.field_f);
            si.a(true, ui.field_i, ui.field_i[0].field_x + 16, 16 + ui.field_i[0].field_u);
          }
          if (rb.field_b != 0) {
            var3 = 256 * hk.field_e / 32;
            if (0 < var3) {
              qg.a(0, 0, qg.field_g, qg.field_f, 0, var3);
            }
          }
          if (lc.a(1)) {
            if (null == gi.field_d) {
              stackIn_82_0 = m.field_d;
            } else {
              stackIn_82_0 = true;
            }
            qk.a(stackIn_82_0, 0);
          }
          nj.a(0, 0, var2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "TorChallenge.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException runtimeException = null;
        kb var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_F ? 1 : 0;
        try {
          this.a(false, 11, 2, 3, false, 0, 1, 39);
          var2 = new kb();
          var2.b(128, -122, 9);
          kb.a(22050, 16239, sh.field_u, true, (java.awt.Component) ((Object) bg.field_P), var2);
          lg.field_f = 1;
          qa.field_f = 0;
          ai.field_d = 0;
          this.a(true, true, true, true, false);
          if (param0 > -62) {
            return;
          }
          var3 = 0;
          while (var3 < 3) {
            ii.field_f[var3] = new int[1];
            var3++;
            if (var4 != 0) {
              return;
            }
          }
          ja.a((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.H(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = field_F ? 1 : 0;
        try {
          var8_int = gl.field_l[param5][param6][1][0];
          var9 = gl.field_l[param5][param6][1][1];
          var10 = gl.field_l[param5][param6][2][0];
          var11 = gl.field_l[param5][param6][2][1];
          var12 = vb.field_a[param5][param6];
          if (param3) {
            TorChallenge.q(123);
          }
          qg.a(ae.field_y);
          var13 = 64;
          qg.a(var8_int, param1, var9, param4);
          var14 = var12 - 1;
          if (var14 < 0) {
            var14 += 64;
          }
          var15 = var12 + 1;
          if (64 <= var15) {
            var15 -= 64;
          }
          if (0 == param7 &&
            (64 & ic.field_E[var14][param2]) > 0) {
            qg.f(var10, param1, var9, param4);
            re.field_v[1][param6].a(var10, param1);
            qg.b(ae.field_y);
            if (var16 == 0) {
              return;
            }
          }
          if (param7 != 0) {
            if (param7 == 1 &&
              0 < (64 & ic.field_E[var15][param2])) {
              qg.f(var8_int, param1, var11, param4);
              re.field_v[1][param6].a(var8_int, param1);
              qg.b(ae.field_y);
              if (var16 == 0) {
                return;
              }
            }
            qg.f(var11, param1, -var11 + var9, var13, 0);
            qg.a(var8_int, param1, var11, param4);
            re.field_v[0][param6].a(var8_int, param1);
            qg.b(ae.field_y);
            if (var16 == 0) {
              return;
            }
          }
          qg.f(var8_int, param1, var10 - var8_int, var13, 0);
          qg.a(var10, param1, var9, param4);
          re.field_v[0][param6].a(var10, param1);
          qg.b(ae.field_y);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "TorChallenge.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void d(int param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ka[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (param1) {
            var3 = lk.a(-128, "skeleton_runner", "", ic.field_C);
            var4 = 3;
            var5 = 8;
            var6 = var3.length;
            var7 = var6 / var5;
            var8 = var4 * var6;
            var9 = new ka[var8];
            var10 = 0;
            while (true) {
              stackIn_4_0 = ~var5;
              if (stackIn_4_0 < ~var10) {
                stackIn_22_0 = 0;
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var11 = stackIn_22_0;
                while (var11 < var4) {
                  stackIn_4_0 = 0;
                  var12 = stackIn_4_0;
                  while (var7 > var12) {
                    var13 = var7 * var10 + var12;
                    var14 = var11 * var7 + var4 * var7 * var10 + var12;
                    var9[var14] = var3[var13];
                    var12++;
                  }
                  var11++;
                }
                var10++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              re.field_x[dg.field_T[1]] = var9;
            }
          }
          if (decompiledFrameCompleted0) {
            if (!param1 ||
              var15 != 0) {
              re.field_x[dg.field_T[1]] = lk.a(-128, "runner", "", ic.field_C);
            }
            qb.a((byte) 94, re.field_x[dg.field_T[1]]);
            stackIn_22_0 = param0;
          }
          if (stackIn_22_0 < 80) {
            field_H = (si) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3_ref), "TorChallenge.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        if (jd.field_e != null) {
          kc.a(jd.field_e, 0);
          jd.field_e = null;
          id.a(87);
        }
        if (param0 <= 111) {
          return;
        }
        try {
          ic.field_C = pe.b(4, -1);
          bh.field_q = pe.b(5, -1);
          pk.field_d = pe.b(6, -1);
          lk.field_f = pe.b(7, -1);
          cl.field_y = pe.b(8, -1);
          fh.field_f = pe.b(9, -1);
          qh.field_M = pe.b(10, -1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "TorChallenge.D(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        boolean discarded$0 = false;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        boolean stackIn_51_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rd var3_ref_rd = null;
        bk var3_ref_bk = null;
        eh var3_ref_eh = null;
        int var4 = 0;
        var4 = field_F ? 1 : 0;
        try {
          cl.b((byte) -117);
          if (gi.field_d != null &&
            gi.field_d.field_i) {
            ij.c((byte) -126);
            ki.a((byte) 116);
          }
          var2_int = 54 / ((param0 + 39) / 43);
          stackIn_11_1 = -115;
          stackIn_12_2 = (null != gi.field_d);
          this.b(stackIn_11_1, stackIn_12_2);
          if (tc.field_k) {
            this.s(119);
            tc.field_k = false;
          }
          if (hc.c((byte) 63)) {
            this.i(109);
            if (hc.c((byte) -108)) {
              if (ih.f((byte) -128)) {
                discarded$0 = this.a(false, (byte) 82);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!eb.field_o) {
            mc.a(bl.field_X, 83);
            decompiledFrameRemainder0 = !(!this.a(true, (byte) 63));
            if (decompiledFrameRemainder0) {
              eb.field_o = true;
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (jh.a((byte) 77)) {
              if (!vc.a(0)) {
                if (!lc.a(1)) {
                  this.u(0);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_51_1 = (null != gi.field_d);
                  var3 = this.a(stackIn_51_1, 127);
                  if (var3 == 1 ||
                    var3 == 2) {
                    if (gi.field_d != null) {
                      ij.c((byte) -120);
                    }
                    if (2 == var3) {
                      ef.a((byte) -93, gi.b(12476));
                    }
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (rb.field_b != 0) {
                  this.u(0);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  var3 = og.a(false);
                  switch (var3) {
                    default:
                      break;
                    case 4:
                      fh.a(0, 7284, -2);
                      if (var4 == 0) {
                        break;
                      }
                    case 3:
                      il.a(true, 0);
                      if (var4 == 0) {
                        break;
                      }
                    case 2:
                      ij.c((byte) -104);
                      break;
                  }
                  if (!vc.a(0)) {
                    ug.field_i[bc.field_o].a(3, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              aj.b(3);
              if (jh.a((byte) 57)) {
                bi.a(125);
                mf.b(2);
                if (ee.field_o <= 0) {
                  cd.field_o = true;
                  if (var4 != 0) {
                    cd.field_o = false;
                  }
                } else {
                  cd.field_o = false;
                }
                if (5 == bc.field_o &&
                  eh.field_l == 0) {
                  bc.field_o = 2;
                  be.a(2, (byte) -125, false);
                }
              }
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          L22: {
            if (!d.p(-77)) {
              while (true) {
                var3_ref_rd = (rd) (wc.field_g.a((byte) -100));
                if (null != var3_ref_rd) {
                  fc.a(var3_ref_rd, 4, false);
                  if (var4 == 0) {
                    continue;
                  }
                } else {
                  while (true) {
                    var3_ref_bk = (bk) (kj.field_B.a((byte) 102));
                    if (null == var3_ref_bk) {
                      break;
                    }
                    ee.a(var3_ref_bk, 5, (byte) -43);
                    if (var4 != 0) {
                      break L22;
                    }
                  }
                }
                break;
              }
              while (true) {
                var3_ref_eh = (eh) (wj.field_b.a((byte) -113));
                if (var3_ref_eh == null) {
                  break;
                }
                ki.a(var3_ref_eh, 6, 160);
                if (var4 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
          }
          if (decompiledFrameCompleted1) {
            while (p.a(16, qc.field_h)) {
              this.j(5000);
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              nb.a(0, -1);
            }
          }
          if (nb.a(-26375)) {
            var3 = this.e((byte) 110);
            if (var3 == 2) {
              kc.f(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.N(" + param0 + ')');
        }
    }

    final static int a(String param0, boolean param1, int param2, int param3, String param4, String param5, int param6) {
        qa var7 = null;
        RuntimeException var7_ref = null;
        qa var8 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new qa(param4);
          if (param2 != -20031) {
            TorChallenge.a((String) null, false, -109, -34, (String) null, (String) null, -9);
          }
          var8 = new qa(param0);
          stackIn_4_0 = pd.a(var8, param6, param5, param1, param3, -1, var7);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_8_0 = var7_ref;
          stackIn_8_1 = new StringBuilder().append("TorChallenge.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(')').toString());
        }
    }

    public TorChallenge() {
    }

    private final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object stackIn_99_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_F ? 1 : 0;
        try {
          t.a(-67);
          if (null != pk.field_d) {
            if (aj.field_f.b(-7957) &&
              aj.field_f.b(5, "basic")) {
              if (pk.field_d.b(-7957) &&
                pk.field_d.b((byte) 79)) {
                if (lk.field_f.b(-7957) &&
                  lk.field_f.b((byte) 79)) {
                  if (cl.field_y.b(-7957) &&
                    cl.field_y.b((byte) 79)) {
                    if (fh.field_f.b(-7957) &&
                      fh.field_f.b((byte) 79)) {
                      if (ic.field_C.b(-7957) &&
                        ic.field_C.b((byte) 79)) {
                        if (bh.field_q.b(-7957) &&
                          bh.field_q.b((byte) 79)) {
                          if (qh.field_M.b(-7957) &&
                            qh.field_M.b((byte) 79)) {
                            mh.a(pk.field_a, (byte) -125, 65.0f);
                            if (!param0) {
                              return false;
                            }
                            bi.a(124);
                            this.f(7808);
                            ub.field_d = new u(pk.field_d, lk.field_f);
                            cg.field_a[0] = q.a(pk.field_d, "", "Btn_Chime").b();
                            cg.field_a[1] = q.a(pk.field_d, "", "menu_change_character").b();
                            cg.field_a[2] = q.a(pk.field_d, "", "Slider").b();
                            wl.field_c[0][0] = q.a(pk.field_d, "", "H_Jump").b();
                            wl.field_c[0][1] = q.a(pk.field_d, "", "Z_Jump").b();
                            wl.field_c[0][2] = q.a(pk.field_d, "", "D_Jump").b();
                            wl.field_c[1][0] = q.a(pk.field_d, "", "H_Land").b();
                            wl.field_c[1][1] = q.a(pk.field_d, "", "Z_Land").b();
                            wl.field_c[1][2] = q.a(pk.field_d, "", "D_Land").b();
                            wl.field_c[2][0] = q.a(pk.field_d, "", "H_Slide").b();
                            wl.field_c[2][1] = q.a(pk.field_d, "", "Z_Slide").b();
                            wl.field_c[2][2] = q.a(pk.field_d, "", "D_Slide").b();
                            wl.field_c[3][0] = q.a(pk.field_d, "", "H_Step1").b();
                            wl.field_c[3][1] = q.a(pk.field_d, "", "Z_Step1").b();
                            wl.field_c[3][2] = q.a(pk.field_d, "", "D_Step1").b();
                            wl.field_c[4][0] = q.a(pk.field_d, "", "H_Step2").b();
                            wl.field_c[4][1] = q.a(pk.field_d, "", "Z_Step2").b();
                            wl.field_c[4][2] = q.a(pk.field_d, "", "D_Step2").b();
                            wl.field_c[5][0] = q.a(pk.field_d, "", "H_Weapon_Death_Impact").b();
                            wl.field_c[5][1] = q.a(pk.field_d, "", "Z_Weapon_Death_Impact").b();
                            wl.field_c[5][2] = q.a(pk.field_d, "", "D_Weapon_Death_Impact").b();
                            ia.field_i[0][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Death").b();
                            ia.field_i[0][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Death").b();
                            ia.field_i[0][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Death").b();
                            ia.field_i[2][dg.field_T[1]][0] = q.a(pk.field_d, "", "Run_1_Step").b();
                            ia.field_i[2][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_2_Step").b();
                            ia.field_i[2][dg.field_T[1]][2] = q.a(pk.field_d, "", "Run_3_Step").b();
                            ia.field_i[3][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_Jump").b();
                            ia.field_i[3][dg.field_T[1]][2] = ia.field_i[3][dg.field_T[1]][1];
                            ia.field_i[4][dg.field_T[1]][1] = q.a(pk.field_d, "", "Run_land").b();
                            ia.field_i[4][dg.field_T[1]][2] = ia.field_i[4][dg.field_T[1]][2];
                            ia.field_i[0][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Death").b();
                            ia.field_i[0][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Death").b();
                            ia.field_i[0][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Death").b();
                            ia.field_i[2][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Step").b();
                            ia.field_i[2][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Step").b();
                            ia.field_i[2][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Step").b();
                            ia.field_i[4][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_Land").b();
                            ia.field_i[4][dg.field_T[2]][1] = ia.field_i[4][dg.field_T[2]][0];
                            ia.field_i[4][dg.field_T[2]][2] = ia.field_i[4][dg.field_T[2]][0];
                            ia.field_i[6][dg.field_T[2]][0] = q.a(pk.field_d, "", "Spitter_1_Spit").b();
                            ia.field_i[6][dg.field_T[2]][1] = q.a(pk.field_d, "", "Spitter_2_Spit").b();
                            ia.field_i[6][dg.field_T[2]][2] = q.a(pk.field_d, "", "Spitter_3_Spit").b();
                            ia.field_i[4][dg.field_T[7]][0] = q.a(pk.field_d, "", "Spitter_1_Spit_Impact").b();
                            ia.field_i[4][dg.field_T[7]][1] = q.a(pk.field_d, "", "Spitter_2_Spit_Impact").b();
                            ia.field_i[4][dg.field_T[7]][2] = q.a(pk.field_d, "", "Spitter_3_Spit_Impact").b();
                            ia.field_i[0][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_1_Death").b();
                            ia.field_i[0][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_2_Death").b();
                            ia.field_i[0][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Death").b();
                            ia.field_i[7][dg.field_T[3]][2] = q.a(pk.field_d, "", "Thud_3_Charge_Step").b();
                            ia.field_i[4][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Land").b();
                            ia.field_i[4][dg.field_T[3]][1] = ia.field_i[4][dg.field_T[3]][0];
                            ia.field_i[4][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][0];
                            ia.field_i[6][dg.field_T[3]][1] = q.a(pk.field_d, "", "Thud_Rock_Throw").b();
                            ia.field_i[6][dg.field_T[3]][2] = ia.field_i[4][dg.field_T[3]][1];
                            ia.field_i[2][dg.field_T[3]][0] = q.a(pk.field_d, "", "Thud_Step").b();
                            ia.field_i[2][dg.field_T[3]][1] = ia.field_i[2][dg.field_T[3]][0];
                            ia.field_i[2][dg.field_T[3]][2] = ia.field_i[2][dg.field_T[3]][0];
                            ia.field_i[4][dg.field_T[22]][1] = q.a(pk.field_d, "", "Thud_Rock_Impact").b();
                            ia.field_i[4][dg.field_T[22]][2] = ia.field_i[4][dg.field_T[22]][1];
                            ia.field_i[0][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_1_Death").b();
                            ia.field_i[0][dg.field_T[4]][1] = q.a(pk.field_d, "", "Rocket_2_Death").b();
                            ia.field_i[0][dg.field_T[4]][2] = q.a(pk.field_d, "", "Rocket_3_Death").b();
                            ia.field_i[1][dg.field_T[4]][0] = q.a(pk.field_d, "", "Rocket_Roar_Loop").b();
                            ia.field_i[1][dg.field_T[4]][1] = ia.field_i[1][dg.field_T[4]][0];
                            ia.field_i[1][dg.field_T[4]][2] = ia.field_i[1][dg.field_T[4]][1];
                            ia.field_i[0][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_1_Death").b();
                            ia.field_i[0][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Death").b();
                            ia.field_i[0][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Death").b();
                            ia.field_i[2][dg.field_T[5]][1] = q.a(pk.field_d, "", "Slime_2_Move").b();
                            ia.field_i[2][dg.field_T[5]][2] = q.a(pk.field_d, "", "Slime_3_Move").b();
                            ia.field_i[5][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Fall").b();
                            ia.field_i[5][dg.field_T[5]][1] = ia.field_i[5][dg.field_T[5]][0];
                            ia.field_i[5][dg.field_T[5]][2] = ia.field_i[5][dg.field_T[5]][0];
                            ia.field_i[4][dg.field_T[5]][0] = q.a(pk.field_d, "", "Slime_Impact").b();
                            ia.field_i[4][dg.field_T[5]][1] = ia.field_i[4][dg.field_T[5]][0];
                            ia.field_i[4][dg.field_T[5]][2] = ia.field_i[4][dg.field_T[5]][0];
                            ia.field_i[0][dg.field_T[6]][0] = q.a(pk.field_d, "", "Grinder_2_Death").b();
                            ia.field_i[4][dg.field_T[6]][1] = q.a(pk.field_d, "", "Grinder_2_Wall_Impact").b();
                            ia.field_i[4][dg.field_T[6]][2] = q.a(pk.field_d, "", "Grinder_3_Wall_Impact").b();
                            bf.field_c[0][0] = q.a(pk.field_d, "", "Boss_1_Jump").b();
                            bf.field_c[0][1] = q.a(pk.field_d, "", "Boss_1_Land").b();
                            bf.field_c[0][2] = q.a(pk.field_d, "", "Boss_1_Miss_Combo").b();
                            bf.field_c[0][3] = q.a(pk.field_d, "", "Boss_1_Step").b();
                            bf.field_c[0][4] = q.a(pk.field_d, "", "Boss_1_Step2").b();
                            bf.field_c[0][5] = q.a(pk.field_d, "", "Boss_1_Weapon_Impact").b();
                            bf.field_c[1][0] = q.a(pk.field_d, "", "Boss_2_Jump").b();
                            bf.field_c[1][1] = q.a(pk.field_d, "", "Boss_2_Land").b();
                            bf.field_c[1][2] = q.a(pk.field_d, "", "Boss_2_Miss_Combo").b();
                            bf.field_c[1][3] = q.a(pk.field_d, "", "Boss_2_Step").b();
                            bf.field_c[1][5] = q.a(pk.field_d, "", "Boss_2_Weapon_Impact").b();
                            bf.field_c[2][0] = q.a(pk.field_d, "", "Boss_3_Jump").b();
                            bf.field_c[2][1] = q.a(pk.field_d, "", "Boss_3_Land").b();
                            bf.field_c[2][2] = q.a(pk.field_d, "", "Boss_3_Miss_Combo").b();
                            bf.field_c[2][3] = q.a(pk.field_d, "", "Boss_3_Step").b();
                            bf.field_c[2][4] = q.a(pk.field_d, "", "Boss_3_Step2").b();
                            bf.field_c[2][5] = q.a(pk.field_d, "", "Boss_3_Weapon_Impact").b();
                            cj.field_h[0] = q.a(pk.field_d, "", "collect1").b();
                            cj.field_h[1] = q.a(pk.field_d, "", "collect2").b();
                            cj.field_h[2] = q.a(pk.field_d, "", "Exit_Door").b();
                            cj.field_h[3] = q.a(pk.field_d, "", "Extra_HP").b();
                            cj.field_h[4] = q.a(pk.field_d, "", "Extra_Life").b();
                            cj.field_h[5] = q.a(pk.field_d, "", "Health_Drink").b();
                            cj.field_h[6] = q.a(pk.field_d, "", "Help_Bubble").b();
                            cj.field_h[7] = q.a(pk.field_d, "", "seal_active").b();
                            cj.field_h[8] = q.a(pk.field_d, "", "seal_achieved").b();
                            cj.field_h[9] = q.a(pk.field_d, "", "Timer").b();
                            cj.field_h[10] = q.a(pk.field_d, "", "Timer_Ending").b();
                            cj.field_h[11] = cj.field_h[7];
                            cj.field_h[12] = q.a(pk.field_d, "", "Exit_Door_active").b();
                            pk.field_d = null;
                            id.a(62);
                            return false;
                          }
                          mh.a(pk.a(256, "Loading Levels", "", qh.field_M, "Waiting for Levels"), (byte) -125, 60.0f);
                          return false;
                        }
                        mh.a(pk.a(256, ij.field_x, "", bh.field_q, wf.field_a), (byte) -125, 60.0f);
                        return false;
                      }
                      mh.a(pk.a(256, ra.field_m, "", ic.field_C, uk.field_K), (byte) -125, 50.0f);
                      return false;
                    }
                    mh.a(pk.a(256, ui.field_e, "", fh.field_f, qh.field_L), (byte) -125, 40.0f);
                    return false;
                  }
                  mh.a(fc.a(qh.field_L, cl.field_y, 0, 89, ui.field_e), (byte) -125, 30.0f);
                  return false;
                }
                mh.a(pk.a(256, ie.field_c, "", lk.field_f, cb.field_a), (byte) -125, 20.0f);
                return false;
              }
              mh.a(pk.a(256, ie.field_c, "", pk.field_d, cb.field_a), (byte) -125, 10.0f);
              return false;
            }
            mh.a(pk.a(256, ra.field_m, "basic", aj.field_f, uk.field_K), (byte) -125, 3.0f);
            return false;
          }
          if (qh.field_M != null) {
            je.field_c = new byte[cg.field_c.length][];
            var3_int = 0;
            do {
              if (!(var3_int < je.field_c.length)) {
                qh.field_M = null;
                id.a(108);
                break;
              }
              je.field_c[var3_int] = qh.field_M.a(-2, cg.field_c[var3_int], "");
              var3_int++;
            } while (var4 == 0);
            return false;
          }
          if (null != lk.field_f) {
            mh.a(pk.field_a, (byte) -125, 70.0f);
            this.f(7808);
            cg.field_a[3] = wg.a(lk.field_f, "", "Henhui_character_select").c();
            cg.field_a[4] = wg.a(lk.field_f, "", "Ziren_character_select").c();
            cg.field_a[5] = wg.a(lk.field_f, "", "Damen_character_select").c();
            cg.field_a[6] = wg.a(lk.field_f, "", "TOR_Challenge_Menu").c();
            cg.field_a[7] = wg.a(lk.field_f, "", "menu_character_selected_gong").c();
            cg.field_a[8] = wg.a(lk.field_f, "", "menu_TOWER").c();
            cg.field_a[9] = wg.a(lk.field_f, "", "menu_ONE").c();
            cg.field_a[10] = wg.a(lk.field_f, "", "menu_TWO").c();
            cg.field_a[11] = wg.a(lk.field_f, "", "menu_THREE").c();
            cg.field_a[12] = wg.a(lk.field_f, "", "menu_FOUR").c();
            cg.field_a[13] = wg.a(lk.field_f, "", "menu_FIVE").c();
            cg.field_a[14] = wg.a(lk.field_f, "", "menu_SIX").c();
            cg.field_a[15] = wg.a(lk.field_f, "", "menu_READY").c();
            cg.field_a[16] = wg.a(lk.field_f, "", "menu_YOU_LOSE").c();
            wl.field_c[6][0] = wg.a(lk.field_f, "", "H_Attack_1").c();
            wl.field_c[6][1] = wg.a(lk.field_f, "", "Z_Attack_1").c();
            wl.field_c[6][2] = wg.a(lk.field_f, "", "D_Attack_1").c();
            wl.field_c[7][0] = wg.a(lk.field_f, "", "H_Attack_2").c();
            wl.field_c[7][1] = wg.a(lk.field_f, "", "Z_Attack_2").c();
            wl.field_c[7][2] = wg.a(lk.field_f, "", "D_Attack_2").c();
            wl.field_c[8][0] = wg.a(lk.field_f, "", "H_Attack_3_combo").c();
            wl.field_c[8][1] = wg.a(lk.field_f, "", "Z_Attack_3_combo").c();
            wl.field_c[8][2] = wg.a(lk.field_f, "", "D_Attack_3_combo").c();
            wl.field_c[9][0] = wg.a(lk.field_f, "", "H_Attack_2_spec").c();
            wl.field_c[9][1] = wg.a(lk.field_f, "", "Z_Attack_2_spec").c();
            wl.field_c[9][2] = wg.a(lk.field_f, "", "D_Attack_2_spec").c();
            wl.field_c[10][0] = wg.a(lk.field_f, "", "H_Death").c();
            wl.field_c[10][1] = wg.a(lk.field_f, "", "Z_Death").c();
            wl.field_c[10][2] = wg.a(lk.field_f, "", "D_Death").c();
            wl.field_c[11][0] = wg.a(lk.field_f, "", "H_Hit_1").c();
            wl.field_c[11][1] = wg.a(lk.field_f, "", "Z_Hit_1").c();
            wl.field_c[11][2] = wg.a(lk.field_f, "", "D_Hit_1").c();
            wl.field_c[12][0] = wg.a(lk.field_f, "", "H_Hit_2").c();
            wl.field_c[12][1] = wg.a(lk.field_f, "", "Z_Hit_2").c();
            wl.field_c[12][2] = wg.a(lk.field_f, "", "D_Hit_2").c();
            wl.field_c[13][0] = wg.a(lk.field_f, "", "H_Hit_3").c();
            wl.field_c[13][1] = wg.a(lk.field_f, "", "Z_Hit_3").c();
            wl.field_c[13][2] = wg.a(lk.field_f, "", "D_Hit_3").c();
            bf.field_c[0][6] = wg.a(lk.field_f, "", "Boss_1_Attack_combo").c();
            bf.field_c[0][7] = wg.a(lk.field_f, "", "Boss_1_Death").c();
            bf.field_c[0][8] = wg.a(lk.field_f, "", "Boss_1_Hit").c();
            bf.field_c[1][6] = wg.a(lk.field_f, "", "Boss_2_Attack_combo").c();
            bf.field_c[1][7] = wg.a(lk.field_f, "", "Boss_2_Death").c();
            bf.field_c[1][8] = wg.a(lk.field_f, "", "Boss_2_Hit").c();
            bf.field_c[2][6] = wg.a(lk.field_f, "", "Boss_3_Attack_combo").c();
            bf.field_c[2][7] = wg.a(lk.field_f, "", "Boss_3_Death").c();
            bf.field_c[2][8] = wg.a(lk.field_f, "", "Boss_3_Hit").c();
            lk.field_f = null;
            id.a(102);
            return false;
          }
          if (null != fh.field_f) {
            mh.a(wc.field_a, (byte) -125, 75.0f);
            this.f(7808);
            al.field_x[0] = ej.a(fh.field_f, "", "TOR_Lvl_1");
            al.field_x[1] = ej.a(fh.field_f, "", "TOR_Lvl_2");
            al.field_x[2] = ej.a(fh.field_f, "", "TOR_Lvl_3");
            al.field_x[3] = ej.a(fh.field_f, "", "TOR_Lvl_4");
            al.field_x[4] = ej.a(fh.field_f, "", "TOR_Lvl_5");
            al.field_x[5] = ej.a(fh.field_f, "", "TOR_Lvl_6");
            al.field_x[6] = ej.a(fh.field_f, "", "TOR_Boss_Fight");
            al.field_x[7] = ej.a(fh.field_f, "", "TOR_Title");
            al.field_x[8] = ej.a(fh.field_f, "", "TOR_Menu");
            al.field_x[9] = ej.a(fh.field_f, "", "TOR_lvl_start_jingle");
            al.field_x[10] = ej.a(fh.field_f, "", "TOR_lvl_complete_jingle");
            al.field_x[11] = ej.a(fh.field_f, "", "TOR_boss_complete_jingle");
            al.field_x[12] = ej.a(fh.field_f, "", "TOR_game_over_jingle");
            al.field_x[13] = ej.a(fh.field_f, "", "TOR_Complete");
            fh.field_f = null;
            id.a(126);
            return false;
          }
          if (cl.field_y != null) {
            var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (14 <= var3_int))) {
              stackIn_99_0 = null;
              if (var4 == 0) {
                if (stackIn_99_0 != al.field_x[var3_int] &&
                  !la.field_a.a(false, ub.field_d, al.field_x[var3_int], cl.field_y, 176400)) {
                  return false;
                }
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              la.field_a.b(true);
              cl.field_y = null;
              stackIn_99_0 = null;
            }
            ub.field_d = (u) (stackIn_99_0);
            id.a(47);
            return false;
          }
          if (aj.field_f != null) {
            je.field_b = qk.a("basic", "unachieved", aj.field_f, 0);
            bc.field_f = qk.a("basic", "orbcoin", aj.field_f, 0);
            hb.field_c = qk.a("basic", "locked", aj.field_f, 0);
            fd.a((byte) -44, je.field_b);
            fd.a((byte) -44, bc.field_f);
            fd.a((byte) -44, hb.field_c);
            ul.a(aj.field_f, -1656370552, ad.field_g);
            aj.field_f = null;
            id.a(51);
            return false;
          }
          if (ic.field_C != null) {
            mh.a(vb.field_e, (byte) -125, 90.0f);
            this.f(7808);
            this.t(1);
            ic.field_C = null;
            bh.field_q = null;
            id.a(67);
            return false;
          }
          if (param0) {
            m.b((byte) -98);
            var3_int = 0;
            while (true) {
              if (16 > var3_int) {
                ug.field_i[var3_int] = new pd(var3_int, this);
                var3_int++;
                if (var4 == 0) {
                  continue;
                }
              } else {
                bb.field_h = 12;
                bc.field_o = 12;
                ug.field_i[12].a(3, true);
                al.b(50, true);
                u.a((byte) 102, 50);
                o.a(-126, 50);
              }
              if (d.p(-83)) {
                break;
              }
              qa.field_g = be.a(4, 31315);
              vh.field_d = new tc[3];
              vh.field_d[0] = v.b(1, 256, 5, 0);
              vh.field_d[1] = v.b(1, 256, 5, 1);
              vh.field_d[2] = v.b(1, 256, 5, 2);
              eb.field_l = kk.b(6, -6262);
              break;
            }
          }
          if (param1 <= 34) {
            TorChallenge.q(-52);
          }
          id.a(60);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "TorChallenge.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_F ? 1 : 0;
        try {
          if (param0 != 0) {
            field_H = (si) null;
          }
          if (rb.field_b != 0) {
            if (rb.field_b != 1) {
              if (rb.field_b != 2) {
                if (hk.field_e > 0) {
                  hk.field_e = hk.field_e - 1;
                }
                if (0 > hk.field_e) {
                  hk.field_e = 0;
                }
                if (hk.field_e != 0) {
                  return;
                }
                rb.field_b = 0;
                if (var3 == 0) {
                  return;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (d.p(-115)) {
                bc.field_o = m.field_h;
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                qa.field_g = be.a(4, param0 ^ 31315);
                vh.field_d = new tc[4];
                vh.field_d[0] = v.b(1, TorChallenge.a(param0, 256), 5, 0);
                vh.field_d[1] = v.b(1, 256, 5, 1);
                vh.field_d[2] = v.b(1, 256, 5, 2);
                eb.field_l = kk.b(6, param0 - 6262);
                if (null != ji.field_m) {
                  gl.field_a = true;
                  oi.a(true, true, false);
                }
                if (ji.field_m != null) {
                  ji.field_m.c((byte) -66);
                }
                bc.field_o = lj.field_e;
                if (bc.field_o == -2) {
                  bc.field_o = 0;
                  il.a(false, 0);
                }
              }
              rb.field_b = 3;
              hk.field_e = 31;
              bb.field_h = bc.field_o;
              if (var3 == 0) {
                return;
              }
            }
            hk.field_e = hk.field_e + 1;
            if (32 != hk.field_e) {
              return;
            }
            if (vc.a(0)) {
              vl.a((byte) -88);
              if (var3 != 0) {
                dj.f((byte) -83);
              }
            } else {
              dj.f((byte) -83);
            }
            rb.field_b = 2;
            if (var3 == 0) {
              return;
            }
          }
          if (bc.field_o != bb.field_h) {
            hk.field_e = hk.field_e + 1;
            if (16 <= hk.field_e &&
              bc.field_o == 3 &&
              bb.field_h == 1 &&
              oi.field_g) {
              if (dj.field_Q >= 0 &&
                ~n.field_jb != ~dj.field_Q) {
                n.field_jb = dj.field_Q;
                if (var3 != 0) {
                  n.field_jb = 0;
                }
              } else {
                n.field_jb = 0;
              }
              oi.field_g = false;
              if (!(kj.field_A >= 0) ||
                i.field_r == kj.field_A) {
                i.field_r = 0;
                if (var3 != 0) {
                  i.field_r = kj.field_A;
                }
              } else {
                i.field_r = kj.field_A;
              }
            }
            if (32 != hk.field_e) {
              return;
            }
            if (bc.field_o == 2) {
              rc.field_r = null;
            }
            if (bc.field_o == 1) {
              vd.b(0);
            }
            bc.field_o = bb.field_h;
            cf.field_b = bc.field_o;
            hk.field_e = 0;
            if (bc.field_o != 0) {
              return;
            }
            if (!cj.field_e) {
              return;
            }
            h.a(6, 4);
            cj.field_e = false;
            if (var3 == 0) {
              return;
            }
          }
          if (bc.field_o != -1) {
            if (8 == bc.field_o ||
              bc.field_o == 9) {
              ug.field_i[8].f(9504);
              ug.field_i[9].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            if (bc.field_o == 10 ||
              11 == bc.field_o) {
              ug.field_i[10].f(9504);
              ug.field_i[11].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            if (3 != bc.field_o) {
              ug.field_i[bc.field_o].f(9504);
              if (var3 == 0) {
                return;
              }
            }
            ug.field_i[3].f(9504);
            ug.field_i[14].f(9504);
            if (var3 == 0) {
              return;
            }
          }
          ji.field_m.a(param0 + 21);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.O(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ae.a(4);
          if (gi.field_d != null) {
            ij.c((byte) -94);
          }
          var2_int = -126 / ((11 - param0) / 36);
          rl.c(-94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.J(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        ka[] array$0 = null;
        ka[] array$1 = null;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        var9 = field_F ? 1 : 0;
        try {
          var2_int = g.a(124, 0) ? 1 : 0;
          this.d(83, var2_int != 0);
          re.field_x[dg.field_T[2]] = lk.a(-128, "spitter", "", ic.field_C);
          qb.a((byte) 69, re.field_x[dg.field_T[2]]);
          re.field_x[dg.field_T[7]] = lk.a(-127, "spittle", "", ic.field_C);
          qb.a((byte) 85, re.field_x[dg.field_T[7]]);
          if (!param0) {
            this.d((byte) 102);
          }
          re.field_x[dg.field_T[3]] = lk.a(-127, "thudder", "", ic.field_C);
          qb.a((byte) 46, re.field_x[dg.field_T[3]]);
          re.field_x[dg.field_T[4]] = lk.a(-127, "rocketeer", "", ic.field_C);
          qb.a((byte) 114, re.field_x[dg.field_T[4]]);
          re.field_x[dg.field_T[5]] = lk.a(-127, "slimer", "", ic.field_C);
          qb.a((byte) 65, re.field_x[dg.field_T[5]]);
          re.field_x[dg.field_T[6]] = lk.a(-127, "grinder", "", ic.field_C);
          qb.a((byte) 21, re.field_x[dg.field_T[6]]);
          re.field_x[dg.field_T[22]] = lk.a(-128, "rock", "", ic.field_C);
          qb.a((byte) 56, re.field_x[dg.field_T[22]]);
          var3 = new int[8];
          var4 = new int[8];
          var5 = 0;
          do {
            if (var5 >= 8) {
              var5 = 0;
              break;
            }
            var3[var5] = re.field_x[var5].length / 8;
            var4[var5] = var3[var5] / 3;
            var5++;
          } while (var9 == 0);
          while (true) {
            stackIn_12_0 = 8;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_12_0 > var5) {
              stackIn_32_0 = 1;
              decompiledFrameRemainder0 = (var9 == 0);
              if (decompiledFrameRemainder0) {
                var6 = stackIn_32_0;
                L8: while (true) {
                  stackIn_16_0 = ~var6;
                  if (stackIn_16_0 > -9) {
                    stackIn_12_0 = 0;
                    var7 = stackIn_12_0;
                    while (var7 < 3) {
                      array$0 = new ka[h.field_b[var6][var5][var7]];
                      ah.field_d[var5][var6][var7] = array$0;
                      stackIn_16_0 = 0;
                      var8 = stackIn_16_0;
                      while (h.field_b[var6][var5][var7] > var8) {
                        ah.field_d[var5][var6][var7][var8] = re.field_x[var5][var8 + var7 * var4[var5] + var6 * var3[var5]];
                        var8++;
                      }
                      var7++;
                    }
                    var6++;
                    continue L8;
                  }
                  break;
                }
                var5++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_32_0 = 0;
            }
            var5 = stackIn_32_0;
            L16: while (true) {
              stackIn_34_0 = var5;
              if (stackIn_34_0 < 8) {
                if (var9 != 0) {
                  return;
                }
                var6Lifetime1 = 0;
                while (var6Lifetime1 < 3) {
                  array$1 = new ka[h.field_b[0][var5][var6Lifetime1]];
                  ah.field_d[var5][0][var6Lifetime1] = array$1;
                  stackIn_34_0 = 0;
                  var7Lifetime1 = stackIn_34_0;
                  while (var7Lifetime1 < h.field_b[0][var5][var6Lifetime1]) {
                    ah.field_d[var5][0][var6Lifetime1][var7Lifetime1] = ah.field_d[var5][1][var6Lifetime1][var7Lifetime1];
                    var7Lifetime1++;
                  }
                  var6Lifetime1++;
                }
                var5++;
                continue L16;
              }
              break;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.M(" + param0 + ')');
        }
    }

    final static boolean r(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1592) {
            field_H = (si) null;
          }
          stackIn_4_0 = eb.field_m;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "TorChallenge.I(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          TorChallenge.q(1);
          sl.e(25840);
          lj.a(11446);
          ki.a(64);
          ea.a((byte) -106);
          sd.a((byte) -55);
          ac.b(-93);
          id.a(false);
          gb.a(123);
          kf.a((byte) -100);
          d.h(127);
          jd.a(640);
          ug.a((byte) -57);
          we.a(25910);
          mj.a((byte) -36);
          vf.a((byte) -79);
          og.a(-117);
          if (param0 < 103) {
            TorChallenge.a((String) null, true, -106, 32, (String) null, (String) null, -51);
          }
          qg.c();
          eg.a();
          qc.a((byte) 26);
          nk.a(250);
          uf.d(128);
          ol.a((byte) -99);
          mb.a((byte) -116);
          ik.a(true);
          c.b(0);
          ub.a((byte) -52);
          hk.b(0);
          wj.a(23801);
          pl.a((byte) -74);
          bf.a(-14471);
          wh.a(false);
          ve.a(-126);
          gi.a(10);
          jl.b(118);
          oe.b(-15721);
          r.a((byte) 96);
          ad.a(0);
          cd.b((byte) 79);
          u.a(-26193);
          pd.k(1);
          wl.b(10);
          lk.a(-89);
          qb.a(2316);
          vd.a(-38);
          vb.d(0);
          rb.b(-98);
          oa.b(122);
          rk.b(true);
          wb.a(true);
          da.a((byte) -92);
          kb.c(128);
          dl.b(false);
          pc.b();
          pg.c(16);
          kh.a();
          fj.b(false);
          a.b((byte) 106);
          rl.b((byte) -82);
          rc.b(true);
          h.a(38);
          ec.a(-1);
          ck.b(255);
          qe.d(true);
          ra.a((byte) 125);
          tf.a((byte) 106);
          hd.a((byte) 102);
          kl.a(-102);
          le.a(true);
          mg.a((byte) 113);
          vj.a((byte) 95);
          si.d((byte) 69);
          ta.p(255);
          pe.m(4210752);
          jf.n(-118);
          wa.n(104);
          dg.h(-110);
          ih.h(99);
          fg.f((byte) -86);
          ib.c(false);
          qa.a(-1);
          dk.a(23592);
          tj.a(120);
          dc.a();
          wg.b();
          l.b();
          sa.a((byte) 104);
          ok.a(32097);
          jj.a((byte) 124);
          de.a((byte) 103);
          hh.a((byte) 126);
          pa.n(6);
          bi.b(0);
          jc.a(-108);
          tg.b(false);
          w.b((byte) 68);
          fi.d();
          vl.a(0);
          jh.a(-14282);
          ah.a(44);
          am.a(98);
          t.b(68);
          cg.b((byte) -13);
          aj.a(0);
          fh.a((byte) -88);
          wi.c(1);
          of.a(8727);
          wc.a((byte) -48);
          nl.a();
          ei.a(-113);
          ed.a(91);
          bb.b(6);
          fl.e(-25984);
          ii.b(16711680);
          db.h(117);
          la.b((byte) -64);
          al.c((byte) 99);
          di.a(false);
          nd.a(0);
          ai.a(2048);
          sh.b(true);
          cb.b(-9386);
          nh.l(-25725);
          te.a((byte) -50);
          bc.a((byte) 46);
          oc.a();
          nb.b(-128);
          ti.a(true);
          vg.c(606002657);
          pi.b((byte) -119);
          mh.a((byte) -55);
          oj.a(106);
          ch.a(false);
          af.a(-7604);
          kg.e(-8796);
          aa.a(2432);
          pk.a(false);
          vc.a(false);
          gh.a(-16742);
          mf.a(3);
          ob.a(887316838);
          mc.a(false);
          ga.b((byte) -79);
          g.a(28215);
          ph.a(2);
          lg.a(-27840);
          ee.f(107);
          ng.c(true);
          ic.g(1);
          v.c(false);
          b.a(0);
          kj.g(-10365);
          nj.b((byte) -40);
          pf.a(0);
          oh.a(-4);
          lh.g(116);
          cj.b(0);
          sf.a(false);
          je.a(-98);
          hl.a(-106);
          ca.a(32);
          ba.a((byte) -5);
          ie.a((byte) 33);
          gl.a(-26425);
          bj.b(-38);
          bd.b((byte) 126);
          dd.d(15752);
          ja.a(75);
          s.a(2);
          ua.a(102);
          ul.d(-31397);
          td.c(0);
          fb.a(1012);
          ab.a(true);
          bg.h(0);
          rf.i((byte) 96);
          dj.l(65);
          n.l(5);
          ek.c((byte) 123);
          li.c(true);
          df.a(-1);
          tk.c((byte) 87);
          dh.g(112);
          hc.a(-110);
          wf.a((byte) -116);
          qh.f((byte) -36);
          uc.a(-15087);
          bl.e(false);
          ce.a();
          be.a(3366);
          oi.d(10166);
          fa.b(-3);
          m.a(128);
          uk.d((byte) 50);
          k.a(true);
          fd.b(0);
          ak.a((byte) -103);
          lb.d(18972);
          re.e((byte) -114);
          fc.c(67);
          qf.a((byte) 75);
          md.b(-1);
          ag.b(640);
          ae.b(true);
          ji.a(65535);
          vk.a(68);
          e.b((byte) -83);
          o.b(true);
          cl.c((byte) 110);
          me.a(-13978);
          fk.b((byte) -88);
          ij.b(42);
          hf.b(19199);
          hi.h(-1);
          qk.c(false);
          ue.c((byte) 126);
          ni.a(true);
          ql.a(4707);
          rd.b((byte) -60);
          tc.a(127);
          bk.b((byte) -128);
          eb.a(237);
          eh.c((byte) 121);
          ne.a((byte) -116);
          ef.b(-124);
          vh.c(-44);
          cf.a(-113);
          lc.b((byte) -75);
          sj.a(15638);
          hb.a(false);
          na.e(-7345);
          ri.g(12);
          kk.f(61);
          ll.a(256);
          kd.a(8192);
          gj.a(-909082559);
          qi.a((byte) -81);
          i.g(-14298);
          bh.f(1);
          il.g(8);
          kc.d((byte) 102);
          ci.f(68);
          gf.d((byte) -113);
          p.a(true);
          ia.b((byte) 79);
          rj.a(10);
          ui.c((byte) -125);
          vi.a(-57);
          this.field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "TorChallenge.P(" + param0 + ')');
        }
    }

    static {
        field_I = null;
        field_E = 0;
        field_G = 640;
    }
}
