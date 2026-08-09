/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public final class wizardrun extends u {
    private static o[] field_D;
    private int field_Q;
    static byte[] field_O;
    private int field_I;
    private int field_M;
    private int field_R;
    private int field_S;
    private int field_N;
    static int field_E;
    static String field_F;
    static java.awt.Canvas field_G;
    static volatile int field_T;
    private boolean field_J;
    private int field_K;
    private boolean field_P;
    private boolean field_L;
    public static int field_H;

    private final void a(boolean param0, int param1) {
        o var4;
        int var5_int;
        Object var5;
        int var6_int;
        Object var6;
        int var7_int;
        ob var7;
        int var8;
        int var9;
        i var10;
        ue var11;
        o var12;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        ue var18;
        L0: {
          var9 = field_H;
          ab.a((byte) -69);
          if (!param0) {
            break L0;
          } else {
            ac.a(0, gi.field_c);
            break L0;
          }
        }
        L1: {
          if (!mi.field_E.b(17820)) {
            break L1;
          } else {
            if (!mi.field_E.d(-56)) {
              break L1;
            } else {
              L2: {
                if (!mh.field_jb.b(17820)) {
                  break L2;
                } else {
                  if (mh.field_jb.d(param1 ^ -94)) {
                    L3: {
                      if (!mi.field_y.b(17820)) {
                        break L3;
                      } else {
                        if (!mi.field_y.d(-110)) {
                          break L3;
                        } else {
                          L4: {
                            if (!jl.field_u.b(17820)) {
                              break L4;
                            } else {
                              if (jl.field_u.d(-85)) {
                                L5: {
                                  if (!eg.field_u.b(param1 ^ 17842)) {
                                    break L5;
                                  } else {
                                    if (eg.field_u.d(-67)) {
                                      L6: {
                                        if (!md.field_b.b(17820)) {
                                          break L6;
                                        } else {
                                          if (md.field_b.d(83)) {
                                            L7: {
                                              if (!bb.field_h.b(17820)) {
                                                break L7;
                                              } else {
                                                if (bb.field_h.a((byte) 29, "basic")) {
                                                  L8: {
                                                    if (!bc.field_a.b(param1 ^ 17842)) {
                                                      break L8;
                                                    } else {
                                                      if (!bc.field_a.d(-85)) {
                                                        break L8;
                                                      } else {
                                                        ok.a(nh.field_o, 100.0f, 0);
                                                        if (!param0) {
                                                          return;
                                                        } else {
                                                          cf.a((byte) 79);
                                                          this.f(-98);
                                                          a.field_a = ti.a(800863586, "", mi.field_E, "b12", bc.field_a);
                                                          hj.field_g = ti.a(800863586, "", mi.field_E, "wizfont", bc.field_a);
                                                          jj.field_b = ti.a(param1 + 800863540, "", mi.field_E, "wizfont2", bc.field_a);
                                                          lk.field_b = new o[16];
                                                          bc.field_a = null;
                                                          field_D = pe.a("", mi.field_E, "numbers", param1 + 45);
                                                          jj.field_a = pe.a("", mi.field_E, "gems", 114);
                                                          oc.field_c = pe.a("", mi.field_E, "playerintro", 117);
                                                          lg.field_a = pe.a("", mi.field_E, "highwizard", 100);
                                                          sh.field_b = vg.a(15, "benefits", mi.field_E, "");
                                                          fa.field_b = pe.a("", mi.field_E, "screenshots", 87);
                                                          var12 = vg.a(15, "gamelogo", mi.field_E, "");
                                                          var4 = vg.a(15, "mbstar", mi.field_E, "");
                                                          uc.a(-1, vk.field_u, sh.field_b);
                                                          pk.a(var12, false);
                                                          tk.a(0, var4, var4.field_x, 0, 2500, 0, 2, var4.field_s, 0);
                                                          ui.a(true, fa.field_b);
                                                          ck.a((java.applet.Applet) (this), l.field_O, 0, 34, 16777215, 255);
                                                          md.field_c = null;
                                                          oe.field_a = vg.a(param1 + -31, "paused", mi.field_E, "");
                                                          ok.field_d[0] = vg.a(15, "selstar", mi.field_E, "");
                                                          ok.field_d[1] = vg.a(15, "selstar2", mi.field_E, "");
                                                          ok.field_d[2] = vg.a(15, "selstar3", mi.field_E, "");
                                                          vg.a(15, "gameover", mi.field_E, "");
                                                          mg.field_s = vg.a(15, "bosshealth2", mi.field_E, "");
                                                          ve.field_c = pe.a("", mi.field_E, "wizard", 95);
                                                          ra.field_m = pe.a("", mi.field_E, "wizardnohat", param1 + 42);
                                                          rk.field_m = vg.a(param1 ^ 33, "explosion", mi.field_E, "");
                                                          ui.field_a = pe.a("", mi.field_E, "achievements", 108);
                                                          sk.field_z = vg.a(15, "unachieved", bb.field_h, "basic");
                                                          wc.field_f = vg.a(15, "orbcoin", bb.field_h, "basic");
                                                          fa.field_c = vg.a(15, "locked", bb.field_h, "basic");
                                                          kk.field_Bb = new o[5];
                                                          kk.field_Bb[0] = vg.a(15, "highscore", mi.field_E, "");
                                                          kk.field_Bb[1] = vg.a(15, "highscorebar", mi.field_E, "");
                                                          kk.field_Bb[2] = vg.a(param1 + -31, "stage", mi.field_E, "");
                                                          kk.field_Bb[3] = vg.a(sg.a(param1, 33), "score", mi.field_E, "");
                                                          kk.field_Bb[4] = field_D[10];
                                                          pd.field_H = pe.a("", mi.field_E, "frame", 91);
                                                          qc.field_E = pe.a("", mi.field_E, "buttonframe", 119);
                                                          ob.field_c = new o(32, 32);
                                                          ob.field_c.b();
                                                          ve.field_c[6].c(-18, -18);
                                                          hl.field_b.b(68);
                                                          ec.field_b = new o(64, 64);
                                                          ec.field_b.b();
                                                          ed.a(32, 32, 30, 16777215);
                                                          hl.field_b.b(param1 + 17);
                                                          gf.field_bb = ve.field_c[1];
                                                          ld.field_d = vg.a(param1 + -31, "selector", mi.field_E, "");
                                                          u.field_x = vg.a(param1 + -31, "bosshealth", mi.field_E, "");
                                                          jl.field_w = vg.a(param1 + -31, "title", mi.field_E, "");
                                                          wh.field_d = vg.a(15, "highscorescreen", mi.field_E, "");
                                                          l.field_M = vg.a(param1 ^ 33, "achievementscreen", mi.field_E, "");
                                                          bk.field_b = vg.a(param1 ^ 33, "controlscreen", mi.field_E, "");
                                                          bk.field_b.b();
                                                          var5_int = param1;
                                                          var13 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 112, og.field_P);
                                                          this.b(param1 ^ -12884, var13, 15583488, jj.field_b.b(var13) / 2 + 165, 180 + var5_int);
                                                          var14 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 49, qj.field_a);
                                                          this.b(-12926, var14, 15583488, jj.field_b.b(var14) / 2 + 165, var5_int * 2 + 180);
                                                          var15 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 94, kj.field_e);
                                                          this.b(-12926, var15, 15583488, 165 - -(jj.field_b.b(var15) / 2), 180 + 3 * var5_int);
                                                          var16 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 124, oi.field_d);
                                                          this.b(-12926, var16, 15583488, jj.field_b.b(var16) / 2 + 165, -15 + var5_int * 4 + 180);
                                                          var17 = di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 97, sk.field_C);
                                                          this.b(-12926, var17, 15583488, jj.field_b.b(var17) / 2 + 165, 5 * var5_int + 180);
                                                          hl.field_b.b(106);
                                                          kb.field_jb = vg.a(15, "optionscreen", mi.field_E, "");
                                                          we.field_b = vg.a(param1 + -31, "endscreen", mi.field_E, "");
                                                          il.a(240, jj.field_b, pd.field_H, (byte) -113, pd.field_H, 16777215, 16777088, 12, 12, 16776960, 320, 12, pd.field_H, 12, 12);
                                                          ug.a((byte) -94);
                                                          fl.field_T = new byte[6][6][];
                                                          mi.field_E = null;
                                                          var5_int = 0;
                                                          L9: while (true) {
                                                            if ((var5_int ^ -1) < -6) {
                                                              mh.field_jb = null;
                                                              var10 = new i(22050, c.field_l);
                                                              si.field_j[0] = b.a(mi.field_y, "", "spell").b().a(var10);
                                                              si.field_j[1] = b.a(mi.field_y, "", "spell2").b().a(var10);
                                                              si.field_j[2] = b.a(mi.field_y, "", "bubblefire").b().a(var10);
                                                              si.field_j[3] = b.a(mi.field_y, "", "jump").b().a(var10);
                                                              si.field_j[4] = b.a(mi.field_y, "", "land").b().a(var10);
                                                              si.field_j[5] = b.a(mi.field_y, "", "bigthud").b().a(var10);
                                                              si.field_j[6] = b.a(mi.field_y, "", "bubblepop").b().a(var10);
                                                              si.field_j[7] = b.a(mi.field_y, "", "gotgem2").b().a(var10);
                                                              si.field_j[10] = b.a(mi.field_y, "", "enemyhit").b().a(var10);
                                                              si.field_j[11] = b.a(mi.field_y, "", "shield").b().a(var10);
                                                              si.field_j[12] = b.a(mi.field_y, "", "slimesplit").b().a(var10);
                                                              si.field_j[13] = b.a(mi.field_y, "", "zapshot").b().a(var10);
                                                              si.field_j[14] = b.a(mi.field_y, "", "fireball").b().a(var10);
                                                              si.field_j[15] = b.a(mi.field_y, "", "alljump").b().a(var10);
                                                              si.field_j[16] = b.a(mi.field_y, "", "stars").b().a(var10);
                                                              si.field_j[23] = b.a(mi.field_y, "", "spell_higher").b().a(var10);
                                                              si.field_j[24] = b.a(mi.field_y, "", "spell_highest").b().a(var10);
                                                              nl.field_q[0] = b.a(mi.field_y, "", "intro_bird_squawk").b().a(var10);
                                                              nl.field_q[1] = b.a(mi.field_y, "", "end_cage_release").b().a(var10);
                                                              nl.field_q[2] = b.a(mi.field_y, "", "end_cage_smash").b().a(var10);
                                                              nl.field_q[3] = b.a(mi.field_y, "", "rat_death").b().a(var10);
                                                              nl.field_q[4] = b.a(mi.field_y, "", "wasp_death").b().a(var10);
                                                              nl.field_q[5] = b.a(mi.field_y, "", "spider_death").b().a(var10);
                                                              nl.field_q[6] = b.a(mi.field_y, "", "spider_boss_land").b().a(var10);
                                                              nl.field_q[7] = b.a(mi.field_y, "", "spider_boss_death").b().a(var10);
                                                              nl.field_q[8] = b.a(mi.field_y, "", "small_crab_death").b().a(var10);
                                                              nl.field_q[9] = b.a(mi.field_y, "", "crab_death").b().a(var10);
                                                              nl.field_q[10] = b.a(mi.field_y, "", "seagull_death").b().a(var10);
                                                              nl.field_q[11] = b.a(mi.field_y, "", "cannibal_death").b().a(var10);
                                                              nl.field_q[15] = b.a(mi.field_y, "", "green_bird_death").b().a(var10);
                                                              nl.field_q[16] = b.a(mi.field_y, "", "ghost_death").b().a(var10);
                                                              nl.field_q[17] = b.a(mi.field_y, "", "ghost_spit").b().a(var10);
                                                              nl.field_q[18] = b.a(mi.field_y, "", "skeleton_cannon_fire").b().a(var10);
                                                              nl.field_q[22] = b.a(mi.field_y, "", "venus_death").b().a(var10);
                                                              nl.field_q[23] = b.a(mi.field_y, "", "bat_death").b().a(var10);
                                                              nl.field_q[25] = b.a(mi.field_y, "", "ogre_boss_rock").b().a(var10);
                                                              nl.field_q[32] = b.a(mi.field_y, "", "fireimp_death").b().a(var10);
                                                              nl.field_q[35] = b.a(mi.field_y, "", "harpie_death").b().a(var10);
                                                              nl.field_q[36] = b.a(mi.field_y, "", "dark_knight_attack").b().a(var10);
                                                              nl.field_q[37] = b.a(mi.field_y, "", "dark_knight_death").b().a(var10);
                                                              si.field_j[8] = nc.a(jl.field_u, "", "wizard_ooh").b().a(var10);
                                                              si.field_j[9] = nc.a(jl.field_u, "", "enemyeek").b().a(var10);
                                                              si.field_j[17] = nc.a(jl.field_u, "", "lizard_boss").b().a(var10);
                                                              si.field_j[18] = nc.a(jl.field_u, "", "hissing").b().a(var10);
                                                              si.field_j[19] = nc.a(jl.field_u, "", "vampire_laugh").b().a(var10);
                                                              si.field_j[20] = nc.a(jl.field_u, "", "ogre_boss").b().a(var10);
                                                              si.field_j[21] = nc.a(jl.field_u, "", "dragon_boss").b().a(var10);
                                                              si.field_j[22] = nc.a(jl.field_u, "", "demon_boss").b().a(var10);
                                                              si.field_j[25] = nc.a(jl.field_u, "", "spiderhit").b().a(var10);
                                                              si.field_j[26] = nc.a(jl.field_u, "", "ogrehit").b().a(var10);
                                                              si.field_j[27] = nc.a(jl.field_u, "", "dragonhit").b().a(var10);
                                                              si.field_j[28] = nc.a(jl.field_u, "", "demonhit").b().a(var10);
                                                              si.field_j[29] = nc.a(jl.field_u, "", "vampirehit").b().a(var10);
                                                              si.field_j[30] = nc.a(jl.field_u, "", "spiderboss").b().a(var10);
                                                              nl.field_q[13] = nc.a(jl.field_u, "", "voodoo_boss_death").b().a(var10);
                                                              nl.field_q[19] = nc.a(jl.field_u, "", "skeleton_cannon_death").b().a(var10);
                                                              nl.field_q[21] = nc.a(jl.field_u, "", "pirate_boss_death").b().a(var10);
                                                              nl.field_q[26] = nc.a(jl.field_u, "", "ogre_boss_death").b().a(var10);
                                                              nl.field_q[27] = nc.a(jl.field_u, "", "cyclops_death").b().a(var10);
                                                              nl.field_q[29] = nc.a(jl.field_u, "", "yeti_death").b().a(var10);
                                                              nl.field_q[30] = nc.a(jl.field_u, "", "dragon_death").b().a(var10);
                                                              nl.field_q[31] = nc.a(jl.field_u, "", "ice_dragon_boss_death").b().a(var10);
                                                              nl.field_q[33] = nc.a(jl.field_u, "", "city_guard_death").b().a(var10);
                                                              nl.field_q[34] = nc.a(jl.field_u, "", "executioner_death").b().a(var10);
                                                              nl.field_q[12] = nc.a(jl.field_u, "", "voodoo_boss_attack").b().a(var10);
                                                              nl.field_q[14] = nc.a(jl.field_u, "", "skeleton_death").b().a(var10);
                                                              nl.field_q[24] = nc.a(jl.field_u, "", "goblin_death").b().a(var10);
                                                              nl.field_q[28] = nc.a(jl.field_u, "", "horned_demon_death").b().a(var10);
                                                              var5 = null;
                                                              pj.field_G = ji.a(md.field_b, "", "wizard_run_forest");
                                                              ka.field_l = ji.a(md.field_b, "", "wizard_run_swamp");
                                                              ml.field_u = ji.a(md.field_b, "", "wizard_run_caves");
                                                              ne.field_b = ji.a(md.field_b, "", "wizard_run_mountains");
                                                              va.field_j = ji.a(md.field_b, "", "wizard_run_volcano");
                                                              ec.field_d = ji.a(md.field_b, "", "wizard_run_lair");
                                                              fb.field_a = ji.a(md.field_b, "", "wizard_run_boss");
                                                              kh.field_j = ji.a(md.field_b, "", "wizard_run_intro");
                                                              bh.field_e = ji.a(md.field_b, "", "wizard_run_cutscene");
                                                              qj.field_e = ji.a(md.field_b, "", "wizard_run_endscene");
                                                              md.field_b = null;
                                                              sl.field_q = new ji[7];
                                                              sl.field_q[3] = ne.field_b;
                                                              sl.field_q[5] = ec.field_d;
                                                              sl.field_q[4] = va.field_j;
                                                              sl.field_q[2] = ml.field_u;
                                                              sl.field_q[6] = kh.field_j;
                                                              sl.field_q[0] = pj.field_G;
                                                              sl.field_q[1] = ka.field_l;
                                                              var11 = new ue(mi.field_y, jl.field_u);
                                                              var18 = var11;
                                                              mi.field_y = null;
                                                              jl.field_u = null;
                                                              var7_int = 0;
                                                              L10: while (true) {
                                                                if (7 <= var7_int) {
                                                                  mi.field_D.a(eg.field_u, -1, var18, bh.field_e, 0);
                                                                  mi.field_D.a(eg.field_u, -1, var18, qj.field_e, 0);
                                                                  mi.field_D.a(eg.field_u, param1 ^ -47, var18, fb.field_a, 0);
                                                                  mi.field_D.b(true);
                                                                  eg.field_u = null;
                                                                  var6 = null;
                                                                  var7_int = 0;
                                                                  L11: while (true) {
                                                                    if (-1001 >= (var7_int ^ -1)) {
                                                                      L12: {
                                                                        wi.field_K = 1;
                                                                        cd.field_e = 500;
                                                                        var7 = new ob();
                                                                        fi.field_x = 0;
                                                                        var7.field_a = 1;
                                                                        var7.field_b = 3;
                                                                        tj.field_I = 0;
                                                                        sc.field_m = new jk();
                                                                        uk.a((byte) 91, 50);
                                                                        vk.a((byte) -74);
                                                                        ga.field_e = sl.field_q[6];
                                                                        mi.field_D.a(-1, hc.field_o);
                                                                        if (tl.field_e) {
                                                                          mi.field_D.a(true, param1 ^ -72, ga.field_e);
                                                                          break L12;
                                                                        } else {
                                                                          break L12;
                                                                        }
                                                                      }
                                                                      var8 = 0;
                                                                      L13: while (true) {
                                                                        if ((var8 ^ -1) <= -301) {
                                                                          th.field_h = true;
                                                                          sf.field_h = 0;
                                                                          wg.field_e = jl.field_w;
                                                                          md.field_a = new int[100][3];
                                                                          jj.b(0);
                                                                          return;
                                                                        } else {
                                                                          tc.field_l.field_j[var8] = 0;
                                                                          tc.field_l.field_f[var8] = 0;
                                                                          tc.field_l.field_d[var8] = false;
                                                                          tc.field_l.field_a[var8] = 0;
                                                                          var8++;
                                                                          continue L13;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      ii.field_e[var7_int] = new eg();
                                                                      var7_int++;
                                                                      continue L11;
                                                                    }
                                                                  }
                                                                } else {
                                                                  mi.field_D.a(eg.field_u, -1, var11, sl.field_q[var7_int], 0);
                                                                  var7_int++;
                                                                  continue L10;
                                                                }
                                                              }
                                                            } else {
                                                              var6_int = 0;
                                                              L14: while (true) {
                                                                if (-6 > (var6_int ^ -1)) {
                                                                  var5_int++;
                                                                  continue L9;
                                                                } else {
                                                                  fl.field_T[var5_int][var6_int] = mh.field_jb.a(52, "level" + var5_int + var6_int + ".dat", "");
                                                                  var6_int++;
                                                                  continue L14;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ok.a(de.a(-40, mj.field_d, bc.field_a, hj.field_d), 95.0f, 0);
                                                  return;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                            ok.a(oh.a(qb.field_q, tk.field_e, bb.field_h, param1 ^ -90, "basic"), 85.0f, param1 ^ 46);
                                            return;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      ok.a(de.a(-40, ej.field_e, md.field_b, lj.field_d), 80.0f, 0);
                                      return;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                ok.a(de.a(-40, pa.field_d, eg.field_u, jf.field_g), 70.0f, 0);
                                return;
                              } else {
                                break L4;
                              }
                            }
                          }
                          ok.a(de.a(-40, ge.field_i, jl.field_u, il.field_d), 60.0f, 0);
                          return;
                        }
                      }
                    }
                    ok.a(de.a(-40, ge.field_i, mi.field_y, il.field_d), 50.0f, param1 + -46);
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              ok.a(de.a(-40, qk.field_e, mh.field_jb, aa.field_gb), 40.0f, 0);
              return;
            }
          }
        }
        ok.a(de.a(-40, tk.field_e, mi.field_E, qb.field_q), 30.0f, param1 ^ 46);
    }

    private final void s(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        L0: {
          if (5 < ql.field_c) {
            hi.field_c = hi.field_c - ql.field_c;
            me.field_f = me.field_f - 5;
            ql.field_c = 5;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          da.a(7775, 64 * sg.field_f + (ql.field_c - -(6 * qh.field_l)));
          rc.field_a = 0;
          sf.field_h = 2;
          stackIn_5_0 = this;

          if (0 >= hl.field_a) {
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
            break L1;
          } else {
            stackIn_6_0 = this;
            stackIn_6_1 = 1;
            break L1;
          }
        }
        L2: {
          ((wizardrun) (this)).field_J = stackIn_6_1 != 0;
          rf.field_b = 0;
          tc.field_j = false;
          wg.field_e = wh.field_d;
          if (0 >= qf.field_l) {
            break L2;
          } else {
            sf.field_h = 5;
            wg.field_e = l.field_M;
            break L2;
          }
        }
        ga.field_e = pj.field_G;
        if (param0 == 208) {
          L3: {
            hg.field_a = 500;
            if (e.a(-96)) {
              sf.field_h = 6;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-1 != (sg.field_f ^ -1)) {
              break L4;
            } else {
              if (qf.field_l != 0) {
                break L4;
              } else {
                if (!ke.field_u.f(8192)) {
                  break L4;
                } else {
                  sf.field_h = 0;
                  this.field_J = true;
                  hi.field_a = -350;
                  break L4;
                }
              }
            }
          }
          L5: {
            if (!e.a(-90)) {
              hi.field_c = hi.field_c - (ql.field_c - 6);
              wg.field_b = wg.field_b - (sg.field_f << 696469926);
              me.field_f = me.field_f + (qh.field_l * 6 - -6);
              qh.field_l = -1;
              sg.field_f = 0;
              ql.field_c = 6;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            hi.field_c = hi.field_c + qh.field_g;
            wg.field_b = wg.field_b - 5;
            od.field_k = 0;
            ga.field_e = sl.field_q[6];
            wi.field_K = 1;
            cd.field_e = 500;
            qh.field_g = 5;
            if (!tl.field_e) {
              break L6;
            } else {
              mi.field_D.a(true, param0 + -314, ga.field_e);
              break L6;
            }
          }
          tj.field_I = 255;
          hi.field_a = -350;
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int var2;
        int var3;
        int var4;
        dc var5;
        pg var6;
        L0: {
          var4 = field_H;
          wh.field_k.e();
          pc.field_d.e();
          if (null == ki.field_E) {
            break L0;
          } else {
            if (ki.field_E.field_b) {
              di.a((byte) 60);
              bb.b((byte) -100);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackIn_6_0 = this;

          stackIn_6_1 = -4114;

          if (null == ki.field_E) {
            stackIn_7_0 = this;
            stackIn_7_1 = stackIn_6_1;
            stackIn_7_2 = 0;
            break L1;
          } else {
            stackIn_7_0 = this;
            stackIn_7_1 = stackIn_6_1;
            stackIn_7_2 = 1;
            break L1;
          }
        }
        L2: {
          this.c(stackIn_7_1, stackIn_7_2 != 0);
          if (!f.field_c) {
            break L2;
          } else {
            this.u(-51);
            f.field_c = false;
            break L2;
          }
        }
        L3: {
          if (!ta.a((byte) 60)) {
            break L3;
          } else {
            L4: {
              this.d((byte) -122);
              if (th.field_h) {
                break L4;
              } else {
                if (!ph.a((byte) 123)) {
                  break L4;
                } else {
                  this.a(false, 46);
                  break L4;
                }
              }
            }
            if (ta.a((byte) 60)) {
              return;
            } else {
              break L3;
            }
          }
        }
        L5: {
          if (th.field_h) {
            if (!cg.c((byte) 54)) {
              hc.c(true);
              break L5;
            } else {
              if (oa.a(-25231)) {
                var2 = pg.d((byte) -48);
                if (var2 == 2) {
                  di.a((byte) 60);
                  break L5;
                } else {
                  if (3 != var2) {
                    if (4 != var2) {
                      break L5;
                    } else {
                      gf.h((byte) 107);
                      break L5;
                    }
                  } else {
                    pd.a(true, false);
                    break L5;
                  }
                }
              } else {
                if (!dg.b(-76)) {
                  this.t(640);
                  break L5;
                } else {
                  L6: {
                    stackIn_23_0 = this;

                    stackIn_23_1 = 39;

                    if (null == ki.field_E) {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_23_1;
                      stackIn_24_2 = 0;
                      break L6;
                    } else {
                      stackIn_24_0 = this;
                      stackIn_24_1 = stackIn_23_1;
                      stackIn_24_2 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var2 = this.a((byte) stackIn_24_1, stackIn_24_2 != 0);
                    if (var2 == 1) {
                      break L7;
                    } else {
                      if (-3 == (var2 ^ -1)) {
                        break L7;
                      } else {
                        break L5;
                      }
                    }
                  }
                  di.a((byte) 60);
                  if (-3 != (var2 ^ -1)) {
                    break L5;
                  } else {
                    bc.a(127, jg.f(1));
                    break L5;
                  }
                }
              }
            }
          } else {
            this.a(true, 46);
            break L5;
          }
        }
        L8: {
          if (!e.a(-81)) {
            L9: while (true) {
              var6 = (pg) ((Object) ie.field_l.b(114));
              if (var6 != null) {
                hc.a(var6, false, 4);
                continue L9;
              } else {
                L10: while (true) {
                  var5 = (dc) ((Object) ke.field_u.b(109));
                  if (var5 == null) {
                    break L8;
                  } else {
                    ml.a(var5, 5, -1);
                    continue L10;
                  }
                }
              }
            }
          } else {
            break L8;
          }
        }
        var2 = 40 / ((-56 - param0) / 41);
        L11: while (true) {
          if (!ub.a(0, kc.field_G)) {
            L12: {
              id.a((byte) -67, 0);
              if (h.b(true)) {
                var3 = this.o(-10618);
                if (var3 == 2) {
                  ci.a((byte) -124);
                  break L12;
                } else {
                  break L12;
                }
              } else {
                break L12;
              }
            }
            return;
          } else {
            this.b(true);
            continue L11;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int var4;
        int var5;
        int var6;
        var6 = field_H;
        if ((pa.field_c ^ -1) < -1) {
          return;
        } else {
          L0: {
            if (param1 != 2) {
              break L0;
            } else {
              if ((param2 ^ -1) == -3) {
                break L0;
              } else {
                if ((param2 ^ -1) == -4) {
                  break L0;
                } else {
                  param1 = 0;
                  break L0;
                }
              }
            }
          }
          L1: {
            var4 = 43 % ((-44 - param0) / 58);
            var5 = param2;
            if (-1 != (var5 ^ -1)) {
              if (1 == var5) {
                if ((param1 ^ -1) != -1) {
                  break L1;
                } else {
                  th.field_i = 1;
                  pa.field_c = 32;
                  if (pk.field_s) {
                    tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                L2: {
                  if (var5 != 2) {
                    if (3 != var5) {
                      if (4 != var5) {
                        if (-6 != (var5 ^ -1)) {
                          if (6 != var5) {
                            if ((var5 ^ -1) == -8) {
                              if (-1 == (param1 ^ -1)) {
                                L3: {
                                  if (pk.field_s) {
                                    tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                bc.a(124, jg.f(1));
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            if (param1 == 0) {
                              th.field_i = 4;
                              pa.field_c = 32;
                              if (pk.field_s) {
                                tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                                break L1;
                              } else {
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          }
                        } else {
                          if (param1 == 0) {
                            th.field_i = 3;
                            pa.field_c = 32;
                            if (pk.field_s) {
                              tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        if (-1 != (param1 ^ -1)) {
                          break L1;
                        } else {
                          if (null == ki.field_E) {
                            pd.a(false, false);
                            break L1;
                          } else {
                            di.a((byte) 60);
                            break L1;
                          }
                        }
                      }
                    } else {
                      L4: {
                        if (-1 != param1) {
                          break L4;
                        } else {
                          param1 = -25;
                          break L4;
                        }
                      }
                      L5: {
                        if ((param1 ^ -1) == -2) {
                          param1 = 25;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (param1 == -3) {
                          param1 = -200;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (3 == param1) {
                          param1 = 200;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (param1 == 2) {
                          L9: {
                            if (-145 < (pg.field_n ^ -1)) {
                              break L9;
                            } else {
                              if (!tl.field_e) {
                                break L9;
                              } else {
                                L10: {
                                  param1 = 0;
                                  if ((pg.field_n ^ -1) <= (168 - -(108 * hc.field_o / 200) ^ -1)) {
                                    break L10;
                                  } else {
                                    param1 = 200 * (pg.field_n - (hc.field_o * 108 / 200 + 172)) / 108;
                                    break L10;
                                  }
                                }
                                if (pg.field_n <= 172 - -(108 * hc.field_o / 200) - -4) {
                                  break L8;
                                } else {
                                  param1 = 200 * (-(hc.field_o * 108 / 200) + -172 + pg.field_n) / 108;
                                  break L8;
                                }
                              }
                            }
                          }
                          L11: {
                            if (tl.field_e) {
                              stackIn_99_0 = 0;
                              break L11;
                            } else {
                              stackIn_99_0 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            if (stackIn_99_0 == 0) {
                              tl.field_e = false;
                              mi.field_D.d(-89);
                              break L12;
                            } else {
                              tl.field_e = true;
                              mi.field_D.a(true, -93, ga.field_e);
                              break L12;
                            }
                          }
                          param1 = 0;
                          break L8;
                        } else {
                          if (param1 == 0) {
                            L13: {
                              stackIn_86_0 = 0;

                              if (tl.field_e) {
                                stackIn_87_0 = stackIn_86_0;
                                stackIn_87_1 = 0;
                                break L13;
                              } else {
                                stackIn_87_0 = stackIn_86_0;
                                stackIn_87_1 = 1;
                                break L13;
                              }
                            }
                            if (stackIn_87_0 != stackIn_87_1) {
                              tl.field_e = true;
                              mi.field_D.a(true, -85, ga.field_e);
                              break L8;
                            } else {
                              tl.field_e = false;
                              mi.field_D.d(-38);
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      L14: {
                        if (0 <= (param1 ^ -1)) {
                          hc.field_o = hc.field_o + param1;
                          if (-1 > (hc.field_o ^ -1)) {
                            mi.field_D.a(-1, hc.field_o);
                            break L14;
                          } else {
                            L15: {
                              hc.field_o = 0;
                              stackIn_108_0 = 0;

                              if (tl.field_e) {
                                stackIn_109_0 = stackIn_108_0;
                                stackIn_109_1 = 0;
                                break L15;
                              } else {
                                stackIn_109_0 = stackIn_108_0;
                                stackIn_109_1 = 1;
                                break L15;
                              }
                            }
                            if (stackIn_109_0 != stackIn_109_1) {
                              break L14;
                            } else {
                              tl.field_e = false;
                              mi.field_D.d(-104);
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      L16: {
                        if (-2 < (param1 ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            hc.field_o = hc.field_o + param1;
                            if (hc.field_o > 200) {
                              hc.field_o = 200;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          mi.field_D.a(-1, hc.field_o);
                          if (tl.field_e) {
                            break L16;
                          } else {
                            tl.field_e = true;
                            mi.field_D.a(true, -120, ga.field_e);
                            break L16;
                          }
                        }
                      }
                      if (!pk.field_s) {
                        break L2;
                      } else {
                        L18: {
                          if (-1 <= (nl.field_y ^ -1)) {
                            tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                            nl.field_y = 25;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L19: {
                      if (0 != (param1 ^ -1)) {
                        break L19;
                      } else {
                        param1 = -13;
                        break L19;
                      }
                    }
                    L20: {
                      if ((param1 ^ -1) != -2) {
                        break L20;
                      } else {
                        param1 = 13;
                        break L20;
                      }
                    }
                    L21: {
                      if (2 != (param1 ^ -1)) {
                        break L21;
                      } else {
                        param1 = -104;
                        break L21;
                      }
                    }
                    L22: {
                      if (3 == param1) {
                        param1 = 104;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (-3 != (param1 ^ -1)) {
                        if (param1 != 0) {
                          break L23;
                        } else {
                          L24: {
                            if (pk.field_s) {
                              stackIn_56_0 = 0;
                              break L24;
                            } else {
                              stackIn_56_0 = 1;
                              break L24;
                            }
                          }
                          pk.field_s = stackIn_56_0 != 0;
                          break L23;
                        }
                      } else {
                        L25: {
                          if ((pg.field_n ^ -1) > -145) {
                            break L25;
                          } else {
                            if (!pk.field_s) {
                              break L25;
                            } else {
                              L26: {
                                param1 = 0;
                                if ((pg.field_n ^ -1) > (-1 + (172 - -(ee.field_p * 108 / 104)) ^ -1)) {
                                  param1 = (-(108 * ee.field_p / 104) - 172 + pg.field_n) * 104 / 108;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              if (108 * ee.field_p / 104 + 172 + 1 >= pg.field_n) {
                                break L23;
                              } else {
                                param1 = 104 * (pg.field_n - (172 + ee.field_p * 108 / 104)) / 108;
                                break L23;
                              }
                            }
                          }
                        }
                        L27: {
                          param1 = 0;
                          if (pk.field_s) {
                            stackIn_51_0 = 0;
                            break L27;
                          } else {
                            stackIn_51_0 = 1;
                            break L27;
                          }
                        }
                        pk.field_s = stackIn_51_0 != 0;
                        break L23;
                      }
                    }
                    L28: {
                      if (-1 >= param1) {
                        ee.field_p = ee.field_p + param1;
                        if ((ee.field_p ^ -1) >= -1) {
                          pk.field_s = false;
                          ee.field_p = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (param1 < 1) {
                        break L29;
                      } else {
                        ee.field_p = ee.field_p + param1;
                        pk.field_s = true;
                        if (ee.field_p <= 104) {
                          break L29;
                        } else {
                          ee.field_p = 104;
                          break L29;
                        }
                      }
                    }
                    if (!pk.field_s) {
                      break L2;
                    } else {
                      L30: {
                        if (0 >= nl.field_y) {
                          tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                          nl.field_y = 25;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              nj.field_r = 255;
              wg.field_b = wg.field_b - (sg.field_f << -30995034);
              sg.field_f = 0;
              if (param1 == 0) {
                th.field_i = 5;
                pa.field_c = 32;
                if (pk.field_s) {
                  tl.field_a.a(si.field_j[0], 100, ee.field_p * 256 / 100);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
          L31: {
            if (!pk.field_s) {
              break L31;
            } else {
              if ((param1 ^ -1) == -3) {
                break L31;
              } else {
                tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                break L31;
              }
            }
          }
          return;
        }
    }

    final void f(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        boolean discarded$5 = false;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_309_0 = 0;
        int stackIn_309_1 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        int stackIn_359_0 = 0;
        int stackIn_359_1 = 0;
        int stackIn_369_0 = 0;
        int stackIn_369_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_513_0 = 0;
        int stackIn_513_1 = 0;
        int stackIn_524_0 = 0;
        int stackIn_561_0 = 0;
        int stackIn_561_1 = 0;
        int stackIn_567_0 = 0;
        int stackIn_567_1 = 0;
        int stackIn_574_0 = 0;
        int stackIn_617_0 = 0;
        int stackIn_617_1 = 0;
        int stackIn_651_0 = 0;
        int stackIn_651_1 = 0;
        gb stackIn_656_0 = null;
        gb stackIn_657_0 = null;
        gb stackIn_658_0 = null;
        int stackIn_658_1 = 0;
        gb stackIn_659_0 = null;
        int stackIn_659_1 = 0;
        gb stackIn_660_0 = null;
        int stackIn_660_1 = 0;
        gb stackIn_661_0 = null;
        int stackIn_661_1 = 0;
        int stackIn_661_2 = 0;
        gb stackIn_662_0 = null;
        int stackIn_662_1 = 0;
        int stackIn_662_2 = 0;
        gb stackIn_663_0 = null;
        int stackIn_663_1 = 0;
        int stackIn_663_2 = 0;
        gb stackIn_664_0 = null;
        int stackIn_664_1 = 0;
        int stackIn_664_2 = 0;
        int stackIn_664_3 = 0;
        gb stackIn_666_0 = null;
        gb stackIn_667_0 = null;
        gb stackIn_668_0 = null;
        int stackIn_668_1 = 0;
        gb stackIn_669_0 = null;
        int stackIn_669_1 = 0;
        int stackIn_669_2 = 0;
        gb stackIn_670_0 = null;
        int stackIn_670_1 = 0;
        int stackIn_670_2 = 0;
        gb stackIn_671_0 = null;
        int stackIn_671_1 = 0;
        int stackIn_671_2 = 0;
        int stackIn_671_3 = 0;
        gb stackIn_672_0 = null;
        int stackIn_672_1 = 0;
        int stackIn_672_2 = 0;
        int stackIn_672_3 = 0;
        gb stackIn_673_0 = null;
        int stackIn_673_1 = 0;
        int stackIn_673_2 = 0;
        int stackIn_673_3 = 0;
        gb stackIn_674_0 = null;
        int stackIn_674_1 = 0;
        int stackIn_674_2 = 0;
        int stackIn_674_3 = 0;
        int stackIn_674_4 = 0;
        gb stackIn_675_0 = null;
        gb stackIn_676_0 = null;
        gb stackIn_677_0 = null;
        int stackIn_677_1 = 0;
        gb stackIn_678_0 = null;
        int stackIn_678_1 = 0;
        int stackIn_678_2 = 0;
        int stackIn_678_3 = 0;
        gb stackIn_679_0 = null;
        int stackIn_679_1 = 0;
        int stackIn_679_2 = 0;
        int stackIn_679_3 = 0;
        gb stackIn_680_0 = null;
        int stackIn_680_1 = 0;
        int stackIn_680_2 = 0;
        int stackIn_680_3 = 0;
        int stackIn_680_4 = 0;
        Object stackIn_688_0 = null;
        Object stackIn_689_0 = null;
        Object stackIn_690_0 = null;
        int stackIn_690_1 = 0;
        int stackIn_737_0 = 0;
        int stackIn_740_0 = 0;
        int stackIn_741_0 = 0;
        int stackIn_741_1 = 0;
        int statePc = 0;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        String var3_ref_String = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        double var7_double = 0.0;
        String[] var7_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ai var10_ref_ai = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        java.awt.Canvas var19 = null;
        String var20 = null;
        StringBuilder var21 = null;
        String[] var22 = null;
        String var25 = null;
        String[] var26 = null;
        String var27 = null;
        String var28 = null;
        String[] var29 = null;
        String var30 = null;
        String var31 = null;
        gb var32 = null;
        Object var33 = null;
        ra var33_ref = null;
        long[] var38 = null;
        int[] var39 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var33 = null;
                    var18 = field_H;
                    var19 = hi.d((byte) 72);
                    if (!ta.a((byte) 60)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ud.a((byte) 38, dh.a(255), var19);
                    return;
                }
                case 2: {
                    if (th.field_h) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    uc.a(false, var19);
                    return;
                }
                case 4: {
                    if (!cg.c((byte) 54)) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ok.a(od.field_s, 100.0f, 0);
                    uc.a(false, var19);
                    return;
                }
                case 7: {
                    wg.field_e.c(0, 0);
                    if (wi.field_K != 1) {
                        statePc = 304;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (-1 == (sf.field_h ^ -1)) {
                        statePc = 10;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var3 = 208;
                    var5 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if ((rc.field_a ^ -1) >= (var5 ^ -1)) {
                        statePc = 45;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_741_0 = var5;
                    stackIn_13_0 = stackIn_741_0;
                    stackIn_741_1 = si.field_h;
                    stackIn_13_1 = stackIn_741_1;
                    if (false) {
                        statePc = 741;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (stackIn_13_0 != stackIn_13_1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = 16777215;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = 15583488;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var4_int = stackIn_16_0;
                    var20 = og.field_R[var5];
                    var7 = 177;
                    if ((var5 ^ -1) == -3) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var5 != 3) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var7 = var7 - (50 + jj.field_b.b(var20) / 2);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    this.b(-12926, var20, var4_int, var7, var3);
                    if (-3 == (var5 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (!pk.field_s) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = ee.field_p;
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    var8 = stackIn_25_0;
                    ok.field_d[0].a(174, -10 + var3 + -6, -93, 20, 0);
                    ok.field_d[0].a(174, 10 + (-6 + var3), -107, 20, 0);
                    ok.field_d[0].a(174, var3 + -6, -108, 30, 0);
                    ok.field_d[0].a(282, -6 + (var3 + -10), -123, 20, 0);
                    ok.field_d[0].a(282, 10 + (var3 + -6), -98, 20, 0);
                    ok.field_d[0].a(282, var3 - 6, -87, 30, 0);
                    var9 = 172;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (268 <= var9) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ok.field_d[0].b(var9, -14 + var3 - 6, 28, 28, 64);
                    var9 += 14;
                    statePc = 26;
                    continue stateLoop;
                }
                case 28: {
                    ed.c(0, 0, 174 + var8 * 108 / 104, 480);
                    var9 = 172;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if ((var9 ^ -1) <= -269) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    ok.field_d[0].a(var9, -20 + var3, 28, 28);
                    var9 += 14;
                    statePc = 29;
                    continue stateLoop;
                }
                case 31: {
                    ed.c();
                    ok.field_d[0].a(var8 * 108 / 104 + 174, -10 + (var3 - 6), -103, 30, 0);
                    ok.field_d[0].a(174 + 108 * var8 / 104, -6 + var3 + 10, -99, 30, 0);
                    ok.field_d[0].a(174 + var8 * 108 / 104, var3 + -6, -95, 40, 0);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (3 == var5) {
                        statePc = 34;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (tl.field_e) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = hc.field_o;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var8 = stackIn_37_0;
                    ok.field_d[0].a(174, -10 + (var3 + -6), -93, 20, 0);
                    ok.field_d[0].a(174, 10 + (var3 + -6), -121, 20, 0);
                    ok.field_d[0].a(174, var3 + -6, -91, 30, 0);
                    ok.field_d[0].a(282, -6 + var3 + -10, -86, 20, 0);
                    ok.field_d[0].a(282, 10 + (var3 - 6), -122, 20, 0);
                    ok.field_d[0].a(282, var3 - 6, -117, 30, 0);
                    var9 = 172;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var9 >= 268) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ok.field_d[0].b(var9, -6 + (-14 + var3), 28, 28, 64);
                    var9 += 14;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    ed.c(0, 0, 108 * var8 / 200 + 172 - -2, 480);
                    var9 = 172;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if ((var9 ^ -1) <= -269) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ok.field_d[0].a(var9, -14 + (var3 - 6), 28, 28);
                    var9 += 14;
                    statePc = 41;
                    continue stateLoop;
                }
                case 43: {
                    ed.c();
                    ok.field_d[0].a(2 + var8 * 108 / 200 + 172, -6 + var3 - 10, -112, 30, 0);
                    ok.field_d[0].a(2 + (var8 * 108 / 200 + 172), 10 + (-6 + var3), -114, 30, 0);
                    ok.field_d[0].a(2 + (108 * var8 / 200 + 172), -6 + var3, -96, 40, 0);
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var3 += 32;
                    var5++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 45: {
                    var5 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (var5 >= 100) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    stackIn_52_0 = md.field_a[var5][2];
                    stackIn_48_0 = stackIn_52_0;
                    if (false) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 <= 0) {
                        statePc = 50;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ok.field_d[0].a(md.field_a[var5][0], md.field_a[var5][1], -128, md.field_a[var5][2], md.field_a[var5][2] * 2);
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var5++;
                    statePc = 46;
                    continue stateLoop;
                }
                case 51: {
                    stackIn_52_0 = 11;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (stackIn_52_0 != sf.field_h) {
                        statePc = 144;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ed.c(16, 153, 608, 311, 13158);
                    ig.a(pd.field_H, 16, (byte) -110, 311, 608, 153);
                    jj.field_b.b(uh.field_b, 320, jj.field_b.field_M + 169, 16777215, -1);
                    var3 = 96;
                    if (-1 < (qh.field_l ^ -1)) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    hi.field_c = hi.field_c - qh.field_l * 6;
                    qh.field_l = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var4_int = var3 * 96 / 128;
                    if ((qh.field_l ^ -1) >= -6) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    wg.field_b = wg.field_b + 30;
                    hi.field_c = hi.field_c - qh.field_l * 6;
                    qh.field_l = 5;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var5 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    if (-7 >= (var5 ^ -1)) {
                        statePc = 79;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var6 = var3 * var5 - -32;
                    var7 = 208;
                    bd.field_c[var5].a(var3 * var5 + 32, 208, var3, var4_int);
                    stackIn_80_0 = var5 ^ -1;
                    stackIn_61_0 = stackIn_80_0;
                    stackIn_80_1 = pl.field_A ^ -1;
                    stackIn_61_1 = stackIn_80_1;
                    if (false) {
                        statePc = 80;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 < stackIn_61_1) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if (-1 > (hl.field_a ^ -1)) {
                        statePc = 69;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (1 < var5) {
                        statePc = 65;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 65: {
                    ed.d(var6, var7, var3, var4_int, 0, 192);
                    if (hl.field_a > 0) {
                        statePc = 69;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (-2 > (var5 ^ -1)) {
                        statePc = 68;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 68: {
                    fa.field_c.c(var3 / 2 + (32 + (var5 * var3 - var4_int / 2)), 208, var4_int, var4_int);
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (var5 != qh.field_l) {
                        statePc = 71;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    ed.a(var3 * var5 - -32, 208, var3, var4_int, 0);
                    ed.a(32 + var3 * var5, 208, var3, var4_int, 1, 16776960);
                    ed.a(var3 * var5 - -32, 208, var3, var4_int, 2, 16777215);
                    ed.a(var3 * var5 - -32, 208, var3, var4_int, 3, 16776960);
                    statePc = 72;
                    continue stateLoop;
                }
                case 71: {
                    ed.a(var5 * var3 + 32, 208, var3, var4_int, 0);
                    ed.a(32 + var5 * var3, 208, var3, var4_int, 1, 8421376);
                    ed.a(var3 * var5 + 32, 208, var3, var4_int, 2, 16776960);
                    ed.a(var5 * var3 - -32, 208, var3, var4_int, 3, 8421376);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if ((pg.field_n ^ -1) > (var6 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if ((var6 - -var3 ^ -1) >= (pg.field_n ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if ((fi.field_B ^ -1) > (var7 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if ((var7 - -var4_int ^ -1) >= (fi.field_B ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ed.a(var3 * var5 + 32, 208, var3, var4_int, 16777215);
                    if (sh.field_c != 1) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    hi.field_c = hi.field_c - qh.field_l * 6;
                    wg.field_b = wg.field_b + var5 * 6;
                    qh.field_l = var5;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    var5++;
                    statePc = 59;
                    continue stateLoop;
                }
                case 79: {
                    var5 = 16777215;
                    stackIn_80_0 = qh.field_l;
                    stackIn_80_1 = pl.field_A;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (stackIn_80_0 > stackIn_80_1) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (-2 <= (qh.field_l ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (hl.field_a <= 0) {
                        statePc = 84;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var5 = 16777088;
                    if (-2 <= (qh.field_l ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (hl.field_a > 0) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var5 = 16711680;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    var6_ref_String = "BLAH BLAH BLAH!";
                    if (qh.field_l != 0) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var6_ref_String = aa.field_kb;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (qh.field_l == 1) {
                        statePc = 91;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 91: {
                    var6_ref_String = u.field_o;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if ((qh.field_l ^ -1) != -3) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var6_ref_String = ra.field_l;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    if (qh.field_l != 3) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var6_ref_String = de.field_c;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (4 == qh.field_l) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    var6_ref_String = wi.field_H;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    if ((qh.field_l ^ -1) == -6) {
                        statePc = 101;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var6_ref_String = kk.field_vb;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    jj.field_b.b(qj.field_c + (qh.field_l - -1), 320, var4_int + 192 + (16 + jj.field_b.field_M), var5, -1);
                    jj.field_b.b(var6_ref_String, 320, 2 * jj.field_b.field_M + (208 - -var4_int), var5, -1);
                    if (-16777089 == (var5 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 104: {
                    jj.field_b.b(si.field_g, 320, 192 - -var4_int - -16 + 3 * jj.field_b.field_M, var5, -1);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (16711680 != var5) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    jj.field_b.b(oj.field_a, 320, 192 - (-var4_int + -16 + -(3 * jj.field_b.field_M)), var5, -1);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (!e.a(-109)) {
                        statePc = 129;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var7 = 98;
                    if (-3 != (mh.field_tb ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    var7 += 20;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (!this.a(400, var7, 65535, ue.field_b, 1)) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (tj.field_I >= 5) {
                        statePc = 114;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if ((pa.field_c ^ -1) < -1) {
                        statePc = 114;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    sl.a(11, 11, -127);
                    statePc = 114;
                    continue stateLoop;
                }
                case 114: {
                    if ((var5 ^ -1) == -16777216) {
                        statePc = 116;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var7 = 320;
                    if (-3 != (mh.field_tb ^ -1)) {
                        statePc = 118;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var7 += 30;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (this.a(400, var7, 65535, sc.field_l, 1)) {
                        statePc = 120;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if ((tj.field_I ^ -1) <= -6) {
                        statePc = 139;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if ((pa.field_c ^ -1) < -1) {
                        statePc = 139;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    wg.field_b = wg.field_b + qh.field_g;
                    qh.field_g = 0;
                    tj.field_I = 5;
                    if (qh.field_l <= 0) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    gd.field_b = false;
                    me.field_f = me.field_f + 5;
                    qh.field_g = 5;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    od.field_k = 0;
                    nk.field_T = 0;
                    if ((qh.field_l ^ -1) < -1) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    nk.field_T = 400;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    sj.field_l = 0;
                    statePc = 139;
                    continue stateLoop;
                }
                case 129: {
                    if ((var5 ^ -1) != -16777216) {
                        statePc = 139;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (this.a(400, 128, 65535, sc.field_l, 1)) {
                        statePc = 132;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (5 <= tj.field_I) {
                        statePc = 139;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    if (0 < pa.field_c) {
                        statePc = 139;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    ic.field_a = ic.field_a - qh.field_g;
                    qh.field_g = 0;
                    nk.field_T = 0;
                    if (0 >= qh.field_l) {
                        statePc = 136;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    hi.field_c = hi.field_c - 5;
                    gd.field_b = false;
                    qh.field_g = 5;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    od.field_k = 0;
                    tj.field_I = 5;
                    sj.field_l = 0;
                    if (-1 > (qh.field_l ^ -1)) {
                        statePc = 138;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 138: {
                    nk.field_T = 400;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (!this.a(400, 556, 65535, ne.field_a, 1)) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (tj.field_I >= 5) {
                        statePc = 144;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (pa.field_c <= 0) {
                        statePc = 143;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 143: {
                    pa.field_c = 32;
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (5 != sf.field_h) {
                        statePc = 223;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    cb.field_f = -1;
                    var3 = 5 * jj.field_b.field_M / 2 + 231;
                    ed.c(314, 119, 254, 94, 13158);
                    ig.a(pd.field_H, 309, (byte) -110, 104, 264, 114);
                    ed.c(249, 5 + var3 + -68, 382, 198, 13158);
                    ig.a(pd.field_H, 244, (byte) -110, 208, 392, -64 + var3 + -4);
                    var3 = 345;
                    var4_int = 130;
                    if (0 >= qf.field_l) {
                        statePc = 147;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    stackIn_148_0 = qf.field_l;
                    statePc = 148;
                    continue stateLoop;
                }
                case 147: {
                    stackIn_148_0 = ti.field_a;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    var5 = stackIn_148_0;
                    if (ve.a((byte) 50, 0)) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if ((var5 & 2048) > 0) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    var3 = 325;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    var6 = 0;
                    var7 = 1;
                    var8 = a.field_a.field_E;
                    var9 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (nl.field_t.length <= var9) {
                        statePc = 216;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var10 = 1;
                    stackIn_224_0 = var9 ^ -1;
                    stackIn_155_0 = stackIn_224_0;
                    stackIn_224_1 = -12;
                    stackIn_155_1 = stackIn_224_1;
                    if (false) {
                        statePc = 224;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (stackIn_155_0 != stackIn_155_1) {
                        statePc = 160;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (-1 != (1 << var9 & var5 ^ -1)) {
                        statePc = 159;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    if (ve.a((byte) 103, 0)) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    var10 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var3 = 525;
                    var4_int = 130;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (var10 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var11 = 0;
                    if (tk.field_a != var9) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var11 = 2;
                    ok.field_d[0].a(var3 - 8, -8 + var4_int, 48, 48);
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    if ((pg.field_n ^ -1) > (var3 ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    if (pg.field_n > var3 - -32) {
                        statePc = 175;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (fi.field_B < var4_int) {
                        statePc = 175;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if ((fi.field_B ^ -1) < (32 + var4_int ^ -1)) {
                        statePc = 175;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    if (qf.field_l == 0) {
                        statePc = 171;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (0 == (1 << var9 & var5)) {
                        statePc = 175;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var11 = 2;
                    if ((tk.field_a ^ -1) != (var9 ^ -1)) {
                        statePc = 173;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 173: {
                    ok.field_d[0].d(-4 + var3, var4_int + -4, 40, 40, 128);
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    cb.field_f = var9;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if (0 == (1 << var9 & var5)) {
                        statePc = 177;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    ui.field_a[var9].c(-var11 + var3, var4_int + -var11, 2 * var11 + 32, 2 * var11 + 32);
                    statePc = 185;
                    continue stateLoop;
                }
                case 177: {
                    if (0 < qf.field_l) {
                        statePc = 215;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if ((hl.field_a ^ -1) < -1) {
                        statePc = 184;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (1 == var9) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (-3 == (var9 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (-6 == (var9 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (-7 == (var9 ^ -1)) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    fa.field_c.c(-var11 + var3, var4_int - var11, var11 * 2 + 32, 2 * var11 + 32);
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    sk.field_z.c(-var11 + var3, -var11 + var4_int, var11 * 2 + 32, 32 + var11 * 2);
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    if ((var9 ^ -1) == (tk.field_a ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if ((pg.field_n ^ -1) > (var3 ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if ((pg.field_n ^ -1) < (var3 - -32 ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if ((var4_int ^ -1) < (fi.field_B ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (32 + var4_int < fi.field_B) {
                        statePc = 212;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (0 == (tk.field_a ^ -1)) {
                        statePc = 192;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var7 = 0;
                    this.b(-12926, nl.field_t[var9], 15583488, 440, 255);
                    if ((1 << var9 & var5) == 0) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    a.field_a.a(bc.field_c, 619, jj.field_b.field_M + 247, 0, 0);
                    a.field_a.a(bc.field_c, 620, 246 - -jj.field_b.field_M, 0, 0);
                    a.field_a.a(bc.field_c, 620, 247 + jj.field_b.field_M, 16777215, -1);
                    statePc = 195;
                    continue stateLoop;
                }
                case 194: {
                    a.field_a.a(uf.field_b, 620, 247 + (jj.field_b.field_M - 1), 0, 0);
                    a.field_a.a(uf.field_b, 619, jj.field_b.field_M + 247, 0, 0);
                    a.field_a.a(uf.field_b, 620, jj.field_b.field_M + 247, 16727871, -1);
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    var12 = jj.field_b.field_M * 5 / 2 + 231;
                    if (-1 != (1 << var9 & var5 ^ -1)) {
                        statePc = 204;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (-1 > (hl.field_a ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (-2 == (var9 ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if ((var9 ^ -1) == -3) {
                        statePc = 202;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    if (-6 == (var9 ^ -1)) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if ((var9 ^ -1) != -7) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    sk.field_z.e(260, var12);
                    statePc = 205;
                    continue stateLoop;
                }
                case 203: {
                    fa.field_c.e(260, var12);
                    statePc = 205;
                    continue stateLoop;
                }
                case 204: {
                    ui.field_a[var9].e(260, var12);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var12 = var12 + jj.field_b.field_M;
                    if (0 != (var5 & 1 << var9)) {
                        statePc = 209;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    if (5 > var9) {
                        statePc = 209;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 207: {
                    if (var9 == 11) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    a.field_a.a(f.field_f, 398, var12 - 1, 222, 480, 0, 0, 0, 0, var8);
                    a.field_a.a(f.field_f, 397, var12, 222, 480, 0, 0, 0, 0, var8);
                    var12 = var12 + (var8 * 3 + 0 * a.field_a.a(f.field_f, 398, var12, 222, 480, 16777215, -1, 0, 0, var8));
                    statePc = 212;
                    continue stateLoop;
                }
                case 209: {
                    a.field_a.a(mh.field_sb[var9], 397, -a.field_a.field_M + var12, 222, 480, 0, 0, 0, 0, var8);
                    a.field_a.a(mh.field_sb[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, var8);
                    var12 = var12 + (3 * var8 - -(a.field_a.a(mh.field_sb[var9], 398, var12 + -a.field_a.field_M, 222, 480, 16777215, -1, 0, 0, var8) * 0));
                    jj.field_b.a(kl.field_e + u.field_m[var9], 397, var12 - a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                    jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                    var12 = var12 + jj.field_b.field_M * jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                    jj.field_b.a(nf.field_a, 397, var12 + -a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                    jj.field_b.a(nf.field_a, 398, -a.field_a.field_M + -1 - -var12, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                    jj.field_b.a(nf.field_a, 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                    var13 = md.field_e[var9];
                    var14 = 0;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if ((var14 ^ -1) <= (var13 ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    wc.field_f.b(jj.field_b.b(nf.field_a) + -(var13 * 3 / 2) + (8 * var14 + 398), 4 + var12 + -a.field_a.field_M);
                    var14++;
                    statePc = 210;
                    continue stateLoop;
                }
                case 212: {
                    incrementValue$0 = var6;
                    var6++;
                    if (4 == incrementValue$0) {
                        statePc = 214;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var3 += 40;
                    statePc = 215;
                    continue stateLoop;
                }
                case 214: {
                    var3 = 325;
                    var4_int += 40;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    var9++;
                    statePc = 153;
                    continue stateLoop;
                }
                case 216: {
                    if (var7 == 0) {
                        statePc = 223;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (-1 > (qf.field_l ^ -1)) {
                        statePc = 219;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 219: {
                    jj.field_b.b(rb.field_b, 440, 230 + jj.field_b.field_M, 0, 0);
                    jj.field_b.b(rb.field_b, 439, 231 + jj.field_b.field_M, 0, 0);
                    jj.field_b.b(rb.field_b, 440, jj.field_b.field_M + 231, 16777215, -1);
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    var9 = jj.field_b.field_M * 5 / 2 + 231;
                    var9 = var9 + jj.field_b.field_M;
                    jj.field_b.a(gk.field_r, 260, -1 + (var9 + -32), 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(gk.field_r, 259, -32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(gk.field_r, 260, -32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                    if (e.a(-86)) {
                        statePc = 222;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 222: {
                    jj.field_b.a(vl.field_n, 260, -1 + var9 - -32, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(vl.field_n, 259, 32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(vl.field_n, 260, 32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    stackIn_224_0 = sf.field_h;
                    stackIn_224_1 = 2;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (stackIn_224_0 == stackIn_224_1) {
                        statePc = 226;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 226: {
                    ed.c(290, 125, 340, 300, 13158);
                    ig.a(pd.field_H, 285, (byte) -110, 310, 350, 120);
                    var21 = new StringBuilder(0);
                    var5_ref_String = var21.toString();
                    if (!e.a(-122)) {
                        statePc = 228;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    a.field_a.b(dj.field_c, 466, 248, 16744448, -1);
                    statePc = 512;
                    continue stateLoop;
                }
                case 228: {
                    a.field_a.a(we.field_e, 289, 370, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
                    a.field_a.a(we.field_e, 290, 369, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
                    a.field_a.a(we.field_e, 290, 370, 340, 64, 16744448, -1, 1, 1, a.field_a.field_M);
                    if (null != th.field_g) {
                        statePc = 230;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    th.field_g = ff.a(10, 2, (byte) 59, 3, 1);
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    if (th.field_g.field_m) {
                        statePc = 232;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 231: {
                    a.field_a.b(lf.field_a, 466, 144, 16744448, -1);
                    statePc = 303;
                    continue stateLoop;
                }
                case 232: {
                    if (null != th.field_g.field_n) {
                        statePc = 234;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    a.field_a.b(rd.field_a, 466, 248, 16744448, -1);
                    statePc = 303;
                    continue stateLoop;
                }
                case 234: {
                    var22 = th.field_g.field_n[cd.field_c];
                    var38 = th.field_g.field_q[cd.field_c];
                    var3 = 128;
                    var39 = th.field_g.field_i[cd.field_c];
                    var9 = 0;
                    var10_ref_ai = fa.field_a;
                    var11 = 0;
                    var12 = 0;
                    statePc = 235;
                    continue stateLoop;
                }
                case 235: {
                    if (11 <= var12) {
                        statePc = 303;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var13 = 16744448;
                    stackIn_513_0 = var12 ^ -1;
                    stackIn_237_0 = stackIn_513_0;
                    stackIn_513_1 = -11;
                    stackIn_237_1 = stackIn_513_1;
                    if (false) {
                        statePc = 513;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    if (stackIn_237_0 <= stackIn_237_1) {
                        statePc = 245;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var9 != 0) {
                        statePc = 245;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    if (var10_ref_ai == null) {
                        statePc = 245;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (!qj.a(var22[var12], 66)) {
                        statePc = 245;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (var10_ref_ai.field_n != var38[var12]) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (ei.field_k == var39[var12]) {
                        statePc = 244;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 244: {
                    var13 = 16777215;
                    var9 = 1;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (var12 >= 10) {
                        statePc = 248;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    if (null != var22[var12]) {
                        statePc = 252;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (-11 != (var12 ^ -1)) {
                        statePc = 275;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (ei.field_k <= 0) {
                        statePc = 275;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (var9 != 0) {
                        statePc = 275;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var11 = 1;
                    if (-1 != (var12 ^ -1)) {
                        statePc = 256;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    a.field_a.c(bb.field_l, 299, 16 + var3, 0, 0);
                    a.field_a.a(qj.field_f, 619, var3 - -16, 0, 0);
                    a.field_a.c(bb.field_l, 300, 16 + (var3 - 1), 0, 0);
                    a.field_a.a(qj.field_f, 620, -1 + (var3 - -16), 0, 0);
                    a.field_a.c(bb.field_l, 300, var3 - -16, 16777215, -1);
                    a.field_a.a(qj.field_f, 620, var3 + 16, 16777215, -1);
                    if ((a.field_a.b(nj.field_p) / 2 + 510 ^ -1) > (620 - (a.field_a.b(qj.field_f) - -8) ^ -1)) {
                        statePc = 255;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var14 = -a.field_a.b(qj.field_f) + 620 - 8;
                    a.field_a.a(nj.field_p, var14 - 1, var3 + 16, 0, 0);
                    a.field_a.a(nj.field_p, var14, 16 + (var3 - 1), 0, 0);
                    a.field_a.a(nj.field_p, var14, var3 - -16, 16777215, -1);
                    statePc = 256;
                    continue stateLoop;
                }
                case 255: {
                    a.field_a.b(nj.field_p, 509, 16 + var3, 0, 0);
                    a.field_a.b(nj.field_p, 510, -1 + var3 - -16, 0, 0);
                    a.field_a.b(nj.field_p, 510, 16 + var3, 16777215, -1);
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    var14 = 0;
                    if (-11 >= (var12 ^ -1)) {
                        statePc = 259;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (null == var22[var12]) {
                        statePc = 259;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    var5_ref_String = 1 + var12 + "." + var22[var12];
                    var14 = var39[var12];
                    statePc = 263;
                    continue stateLoop;
                }
                case 259: {
                    if ((var12 ^ -1) != -11) {
                        statePc = 263;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (-1 <= (ei.field_k ^ -1)) {
                        statePc = 263;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var9 != 0) {
                        statePc = 263;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    var13 = 16777215;
                    var14 = ei.field_k;
                    var5_ref_String = d.field_a;
                    statePc = 263;
                    continue stateLoop;
                }
                case 263: {
                    var15 = 300;
                    var16 = var14 % 64;
                    var17 = (-var16 + var14) / 64;
                    if (0 == var12) {
                        statePc = 265;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 265: {
                    oe.field_d[0].field_a = var17;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    var3 = 154 + var12 * 22;
                    if (-11 < (var12 ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (var9 != 0) {
                        statePc = 302;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (-1 > (ei.field_k ^ -1)) {
                        statePc = 270;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 270: {
                    ed.c(0, 0, 510 + -(a.field_a.b(q.field_l) / 2), 640);
                    a.field_a.c(var5_ref_String, 2 + var15, 10 + var3, 0, -1);
                    a.field_a.c(var5_ref_String, var15 - -4, var3 - -10, 0, -1);
                    a.field_a.c(var5_ref_String, 3 + var15, var3 - -9, 0, -1);
                    a.field_a.c(var5_ref_String, var15 - -3, var3 + 11, 0, -1);
                    a.field_a.c(var5_ref_String, var15 + 3, 10 + var3, var13, -1);
                    ed.c();
                    var5_ref_String = 1 + var16 / 6 + "-" + (1 + var16 % 6);
                    if (1 + var16 / 6 == 7) {
                        statePc = 272;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 272: {
                    var5_ref_String = q.field_l;
                    statePc = 273;
                    continue stateLoop;
                }
                case 273: {
                    a.field_a.b(var5_ref_String, 508, 10 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 510, 10 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 509, 9 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 509, var3 + 11, 0, -1);
                    a.field_a.b(var5_ref_String, 509, 10 + var3, var13, -1);
                    var25 = Integer.toString(var17);
                    a.field_a.a(var25, 621, 10 + var3, 0, -1);
                    a.field_a.a(var25, 623, 10 + var3, 0, -1);
                    a.field_a.a(var25, 622, var3 - -9, 0, -1);
                    a.field_a.a(var25, 622, var3 - -11, 0, -1);
                    a.field_a.a(var25, 622, 10 + var3, var13, -1);
                    statePc = 302;
                    continue stateLoop;
                }
                case 275: {
                    if (10 > var12) {
                        statePc = 278;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    var12++;
                    statePc = 235;
                    continue stateLoop;
                }
                case 278: {
                    var3 = 24 * var12 + 144;
                    var5_ref_String = 1 + var12 + ".";
                    if (-1 != (var12 ^ -1)) {
                        statePc = 283;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if ((cd.field_c ^ -1) == -2) {
                        statePc = 283;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (var11 == 0) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    var5_ref_String = pd.field_G;
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    if (-2 != (var12 ^ -1)) {
                        statePc = 288;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (cd.field_c == 1) {
                        statePc = 288;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (var11 == 0) {
                        statePc = 287;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var5_ref_String = ef.field_G;
                    statePc = 288;
                    continue stateLoop;
                }
                case 288: {
                    if ((var12 ^ -1) != -1) {
                        statePc = 293;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    if (cd.field_c != 1) {
                        statePc = 293;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (var11 == 0) {
                        statePc = 292;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 292: {
                    var5_ref_String = af.field_b;
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    if (-2 != (var12 ^ -1)) {
                        statePc = 298;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    if (-2 != (cd.field_c ^ -1)) {
                        statePc = 298;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (var11 == 0) {
                        statePc = 297;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 297: {
                    var5_ref_String = ai.field_s;
                    statePc = 298;
                    continue stateLoop;
                }
                case 298: {
                    if (var11 != 0) {
                        statePc = 301;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if (1 < var12) {
                        statePc = 302;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    a.field_a.b(var5_ref_String, 468, 10 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 470, var3 + 10, 0, -1);
                    a.field_a.b(var5_ref_String, 469, 9 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 469, 11 + var3, 0, -1);
                    a.field_a.b(var5_ref_String, 469, var3 - -10, var13, -1);
                    statePc = 302;
                    continue stateLoop;
                }
                case 301: {
                    a.field_a.c(var5_ref_String, 322, 10 + var3, 0, -1);
                    a.field_a.c(var5_ref_String, 324, 10 + var3, 0, -1);
                    a.field_a.c(var5_ref_String, 323, var3 + 9, 0, -1);
                    a.field_a.c(var5_ref_String, 323, 11 + var3, 0, -1);
                    a.field_a.c(var5_ref_String, 323, var3 - -10, var13, -1);
                    statePc = 302;
                    continue stateLoop;
                }
                case 302: {
                    var12++;
                    statePc = 235;
                    continue stateLoop;
                }
                case 303: {
                    var3 = 418;
                    statePc = 512;
                    continue stateLoop;
                }
                case 304: {
                    fe.c((byte) 108);
                    if (-6 >= (ql.field_c ^ -1)) {
                        statePc = 306;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var3 = 0;
                    var4_int = 0;
                    var5 = 1;
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if (od.field_k <= var5) {
                        statePc = 317;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    stackIn_318_0 = ii.field_e[var5].field_d;
                    stackIn_309_0 = stackIn_318_0;
                    stackIn_318_1 = var3;
                    stackIn_309_1 = stackIn_318_1;
                    if (false) {
                        statePc = 318;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (stackIn_309_0 != stackIn_309_1) {
                        statePc = 313;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if ((ii.field_e[var5].field_p ^ -1) < (ii.field_e[var4_int].field_p ^ -1)) {
                        statePc = 312;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 312: {
                    var3 = ii.field_e[var5].field_d;
                    var4_int = var5;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if (var3 < ii.field_e[var5].field_d) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var3 = ii.field_e[var5].field_d;
                    var4_int = var5;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    var5++;
                    statePc = 307;
                    continue stateLoop;
                }
                case 317: {
                    var5 = 50;
                    stackIn_318_0 = -3;
                    stackIn_318_1 = qh.field_l ^ -1;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0 == stackIn_318_1) {
                        statePc = 320;
                    } else {
                        statePc = 321;
                    }
                    continue stateLoop;
                }
                case 320: {
                    var5 = 75;
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    if ((qh.field_l ^ -1) != -4) {
                        statePc = 323;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var5 = 75;
                    statePc = 323;
                    continue stateLoop;
                }
                case 323: {
                    if (4 == qh.field_l) {
                        statePc = 325;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 325: {
                    var5 = 75;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (qh.field_l == 5) {
                        statePc = 328;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var5 = 200;
                    statePc = 329;
                    continue stateLoop;
                }
                case 329: {
                    var6 = 0;
                    if (0 == qh.field_l) {
                        statePc = 331;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var6 = 64;
                    statePc = 332;
                    continue stateLoop;
                }
                case 332: {
                    if (qh.field_l == 1) {
                        statePc = 334;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 334: {
                    var6 = 64;
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (qh.field_l != 2) {
                        statePc = 337;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var6 = -u.field_x.field_s + 384;
                    statePc = 337;
                    continue stateLoop;
                }
                case 337: {
                    if (3 != qh.field_l) {
                        statePc = 339;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 338: {
                    var6 = 64;
                    statePc = 339;
                    continue stateLoop;
                }
                case 339: {
                    if (4 == qh.field_l) {
                        statePc = 341;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var6 = 384 - u.field_x.field_s;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (-6 != (qh.field_l ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var6 = 64;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    mg.field_s.e(320 + -(u.field_x.field_x / 2), var6);
                    if ((var4_int ^ -1) != -1) {
                        statePc = 346;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 346: {
                    ed.c(1 + (320 - u.field_x.field_x / 2), 0, 320 + -(u.field_x.field_x / 2) - -((-2 + u.field_x.field_x) * ii.field_e[var4_int].field_p / var5), 480);
                    u.field_x.e(320 + -(u.field_x.field_x / 2), var6);
                    ed.c();
                    statePc = 347;
                    continue stateLoop;
                }
                case 347: {
                    if ((qh.field_l ^ -1) < 0) {
                        statePc = 349;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (pg.field_q) {
                        statePc = 364;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    var26 = new String[9];
                    var3_ref_String__ = var26;
                    var4_int = 0;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    if (9 <= var4_int) {
                        statePc = 353;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    var3_ref_String__[var4_int] = sc.a((byte) -108, bb.field_g.charAt(var4_int));
                    var4_int++;
                    statePc = 351;
                    continue stateLoop;
                }
                case 353: {
                    var4_int = 0;
                    var5 = 440;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if ((var5 ^ -1) < -611) {
                        statePc = 356;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    ok.field_d[0].b(var5, 0, 30, 30, 64);
                    jj.field_b.b(var26[var4_int], var5 + 15, 24, 0, -1);
                    jj.field_b.b(var26[var4_int], var5 + 15, 26, 0, -1);
                    jj.field_b.b(var26[var4_int], -1 + (15 + var5), 25, 0, -1);
                    jj.field_b.b(var26[var4_int], 1 + (var5 - -15), 25, 0, -1);
                    incrementValue$1 = var4_int;
                    var4_int++;
                    jj.field_b.b(var3_ref_String__[incrementValue$1], var5 - -15, 25, 16777215, -1);
                    var5 += 20;
                    statePc = 354;
                    continue stateLoop;
                }
                case 356: {
                    ed.c(440, 0, 440 - -(2 * fi.field_x), 64);
                    var4_int = 0;
                    var5 = 440;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    if (var5 > 610) {
                        statePc = 363;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    ok.field_d[0].a(var5, 0, 30, 30);
                    incrementValue$2 = var4_int;
                    var4_int++;
                    jj.field_b.b(var3_ref_String__[incrementValue$2], var5 + 15, 25, 0, -1);
                    stackIn_513_0 = -101;
                    stackIn_359_0 = stackIn_513_0;
                    stackIn_513_1 = fi.field_x ^ -1;
                    stackIn_359_1 = stackIn_513_1;
                    if (false) {
                        statePc = 513;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (stackIn_359_0 <= stackIn_359_1) {
                        statePc = 362;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    if (fi.field_x >= 110) {
                        statePc = 362;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    ok.field_d[0].a(var5 + 5, 5, 20, 20);
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    var5 += 20;
                    statePc = 357;
                    continue stateLoop;
                }
                case 363: {
                    ed.c();
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    var3 = 2;
                    if (qh.field_g > 0) {
                        statePc = 366;
                    } else {
                        statePc = 377;
                    }
                    continue stateLoop;
                }
                case 366: {
                    jj.field_b.c(hh.field_J, 8, 471, 0, -1);
                    jj.field_b.c(hh.field_J, 8, 473, 0, -1);
                    jj.field_b.c(hh.field_J, 7, 472, 0, -1);
                    jj.field_b.c(hh.field_J, 9, 472, 0, -1);
                    jj.field_b.c(hh.field_J, 8, 472, 16777215, -1);
                    var3 = jj.field_b.b(hh.field_J) + 8;
                    var4_int = 0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (var4_int >= qh.field_g) {
                        statePc = 377;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    stackIn_378_0 = qh.field_g;
                    stackIn_369_0 = stackIn_378_0;
                    stackIn_378_1 = 25 + var4_int;
                    stackIn_369_1 = stackIn_378_1;
                    if (false) {
                        statePc = 378;
                    } else {
                        statePc = 369;
                    }
                    continue stateLoop;
                }
                case 369: {
                    if (stackIn_369_0 <= stackIn_369_1) {
                        statePc = 371;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    ok.field_d[0].a(var3, 446, 32, 32);
                    gf.field_bb.a(var3, 446, 32, 32);
                    a.field_a.c("25", var3, 461, 16777215, -1);
                    var3 += 32;
                    var4_int += 24;
                    statePc = 376;
                    continue stateLoop;
                }
                case 371: {
                    if ((qh.field_g ^ -1) >= (var4_int - -10 ^ -1)) {
                        statePc = 373;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    ok.field_d[0].a(var3, 446, 32, 32);
                    gf.field_bb.a(var3, 446, 32, 32);
                    a.field_a.c("10", var3, 461, 16777215, -1);
                    var3 += 32;
                    var4_int += 9;
                    statePc = 376;
                    continue stateLoop;
                }
                case 373: {
                    if ((var4_int - -5 ^ -1) <= (qh.field_g ^ -1)) {
                        statePc = 375;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    ok.field_d[0].a(var3, 446, 32, 32);
                    gf.field_bb.a(var3, 446, 32, 32);
                    a.field_a.c("5", var3, 461, 16777215, -1);
                    var3 += 32;
                    var4_int += 4;
                    statePc = 376;
                    continue stateLoop;
                }
                case 375: {
                    ok.field_d[0].a(var3, 446, 24, 24);
                    gf.field_bb.a(var3, 446, 24, 24);
                    var3 += 24;
                    statePc = 376;
                    continue stateLoop;
                }
                case 376: {
                    var4_int++;
                    statePc = 367;
                    continue stateLoop;
                }
                case 377: {
                    stackIn_378_0 = sg.field_f ^ -1;
                    stackIn_378_1 = -1;
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (stackIn_378_0 < stackIn_378_1) {
                        statePc = 380;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 380: {
                    var27 = tf.field_d + sg.field_f;
                    jj.field_b.c(var27, 8, jj.field_b.field_M - 1, 0, -1);
                    jj.field_b.c(var27, 8, jj.field_b.field_M - -1, 0, -1);
                    jj.field_b.c(var27, 7, jj.field_b.field_M, 0, -1);
                    jj.field_b.c(var27, 9, jj.field_b.field_M, 0, -1);
                    jj.field_b.c(var27, 8, jj.field_b.field_M, 16777215, -1);
                    statePc = 381;
                    continue stateLoop;
                }
                case 381: {
                    if ((wi.field_K ^ -1) != -3) {
                        statePc = 392;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (pg.field_q) {
                        statePc = 389;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 383: {
                    if (5 != qh.field_l) {
                        statePc = 389;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (5 <= ql.field_c) {
                        statePc = 386;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 386: {
                    this.field_Q = this.field_Q + 1;
                    if (-41 < (this.field_Q ^ -1)) {
                        statePc = 388;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    this.field_Q = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
                    statePc = 389;
                    continue stateLoop;
                }
                case 389: {
                    var4_int = 0;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if (od.field_k <= var4_int) {
                        statePc = 392;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    ii.field_e[var4_int].d(true);
                    var4_int++;
                    statePc = 390;
                    continue stateLoop;
                }
                case 392: {
                    if (!pg.field_q) {
                        statePc = 512;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    if (-12 == (this.field_R ^ -1)) {
                        statePc = 395;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 395: {
                    this.field_Q = this.field_Q + 1;
                    if (-41 < (this.field_Q ^ -1)) {
                        statePc = 397;
                    } else {
                        statePc = 396;
                    }
                    continue stateLoop;
                }
                case 396: {
                    this.field_Q = 0;
                    statePc = 397;
                    continue stateLoop;
                }
                case 397: {
                    lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
                    var4_int = -32 + ((15 - ii.field_e[0].field_i.field_a + -1) * 32 - ii.field_e[0].field_f.field_a * 32 / 240);
                    var3 = ii.field_e[0].field_i.field_b * 32 - -(ii.field_e[0].field_f.field_b * 32 / 240);
                    if ((ii.field_e[0].field_h ^ -1) != 0) {
                        statePc = 399;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    ve.field_c[ii.field_e[0].field_n].e(var3, var4_int);
                    statePc = 400;
                    continue stateLoop;
                }
                case 399: {
                    ve.field_c[ii.field_e[0].field_n].d(var3, var4_int);
                    statePc = 400;
                    continue stateLoop;
                }
                case 400: {
                    if ((this.field_R ^ -1) == -13) {
                        statePc = 402;
                    } else {
                        statePc = 419;
                    }
                    continue stateLoop;
                }
                case 402: {
                    var4_int = 352;
                    lg.field_a[12 + (2 + this.field_Q / 10) % 4].e(512, 0);
                    var3 = 64;
                    if (this.field_Q < 10) {
                        statePc = 404;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 404: {
                    var4_int = -64 + -(ii.field_e[0].field_i.field_a * 32) + (480 - ii.field_e[0].field_f.field_a * 32 / 240);
                    var3 = 32 * ii.field_e[0].field_f.field_b / 240 + ii.field_e[0].field_i.field_b * 32;
                    var5 = -var3 + 64;
                    var3 = var3 + var5 * this.field_Q / 10;
                    var6 = -var4_int + 352;
                    var4_int = var4_int + var6 * this.field_Q / 10;
                    statePc = 405;
                    continue stateLoop;
                }
                case 405: {
                    var5 = 15;
                    if ((this.field_Q ^ -1) < -51) {
                        statePc = 407;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 407: {
                    var5 = 16;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    if (this.field_Q > 60) {
                        statePc = 410;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 410: {
                    var5 = 12;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    oc.field_c[var5].d(var3, var4_int);
                    if (50 > this.field_Q) {
                        statePc = 413;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 413: {
                    var6 = this.field_Q * 256 / 50;
                    var7_double = 0.0;
                    var9 = 0;
                    statePc = 414;
                    continue stateLoop;
                }
                case 414: {
                    if (var9 >= 5) {
                        statePc = 416;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 415: {
                    var7_double = (double)this.field_Q + 6.28 * (double)var9 / 5.0;
                    ob.field_c.d(-6 + ((int)(32.0 + 32.0 * Math.cos(var7_double)) + var3), var4_int - (-(int)(32.0 + Math.sin(var7_double) * 32.0) - -6), 12, 12, var6);
                    var9++;
                    statePc = 414;
                    continue stateLoop;
                }
                case 416: {
                    if ((this.field_Q ^ -1) > -51) {
                        statePc = 419;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 417: {
                    if ((this.field_Q ^ -1) <= -91) {
                        statePc = 419;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    var6 = 576 - (64 + var3);
                    var7 = 64 + -var4_int;
                    var8 = var6 * (-50 + this.field_Q) / 40 + var3;
                    var9 = var7 * (this.field_Q + -50) / 40 + var4_int;
                    ob.field_c.a(var8, var9, -123, 128, 2 * this.field_Q);
                    var8 = var3 + (int)(Math.sin(3.14 * (double)(this.field_Q + -50) / 80.0) * (double)var6);
                    var9 = var4_int - -(var7 * (-50 + this.field_Q) / 40);
                    ob.field_c.a(var8, var9, -118, 128, this.field_Q * 2);
                    var8 = var6 * (this.field_Q + -50) / 40 + var3;
                    var9 = (int)((double)var7 * Math.sin((double)(-50 + this.field_Q) * 3.14 / 80.0)) + var4_int;
                    ob.field_c.a(var8, var9, -115, 128, 2 * this.field_Q);
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if (-14 == (this.field_R ^ -1)) {
                        statePc = 421;
                    } else {
                        statePc = 431;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var3 = 64;
                    var4_int = 352;
                    var5 = this.field_Q / 5 % 2 + 13;
                    if ((this.field_Q ^ -1) < -71) {
                        statePc = 423;
                    } else {
                        statePc = 424;
                    }
                    continue stateLoop;
                }
                case 423: {
                    var5 = 12;
                    statePc = 424;
                    continue stateLoop;
                }
                case 424: {
                    if (this.field_Q <= 80) {
                        statePc = 426;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 425: {
                    var5 = 11;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    if (this.field_Q <= 90) {
                        statePc = 428;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    var5 = 10;
                    statePc = 428;
                    continue stateLoop;
                }
                case 428: {
                    oc.field_c[var5].d(var3, var4_int);
                    if (-51 >= (this.field_Q ^ -1)) {
                        statePc = 430;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    lg.field_a[this.field_Q / 10 % 4 - -18].e(512, this.field_Q * 288 / 50);
                    statePc = 431;
                    continue stateLoop;
                }
                case 430: {
                    lg.field_a[this.field_Q / 10 % 4 - -22].e(512, 288);
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    if (14 == this.field_R) {
                        statePc = 433;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 433: {
                    lg.field_a[22 + (2 + this.field_Q / 10) % 4].e(512, 288);
                    var3 = this.field_Q + 64;
                    var4_int = 352;
                    var5 = 2 - -(this.field_Q / 10 % 4);
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 434;
                    continue stateLoop;
                }
                case 434: {
                    if ((this.field_R ^ -1) == -16) {
                        statePc = 436;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 436: {
                    var3 = 164;
                    if (this.field_Q < 50) {
                        statePc = 438;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    lg.field_a[this.field_Q / 10 % 4 - -26].e(512, 288);
                    statePc = 439;
                    continue stateLoop;
                }
                case 438: {
                    lg.field_a[22 + this.field_Q / 10 % 4].e(512, 288);
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    var4_int = 352;
                    var5 = this.field_Q / 5 % 2 + 19;
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 440;
                    continue stateLoop;
                }
                case 440: {
                    if (-17 == (this.field_R ^ -1)) {
                        statePc = 442;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 442: {
                    var4_int = 352;
                    lg.field_a[26 + (2 + this.field_Q / 10) % 4].e(512, 288);
                    var3 = 164;
                    var5 = 10;
                    if ((this.field_Q ^ -1) < -11) {
                        statePc = 444;
                    } else {
                        statePc = 445;
                    }
                    continue stateLoop;
                }
                case 444: {
                    var5 = 11;
                    statePc = 445;
                    continue stateLoop;
                }
                case 445: {
                    if (25 >= this.field_Q) {
                        statePc = 447;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    var5 = 12;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if (50 > this.field_Q) {
                        statePc = 449;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var5 = 13;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    if (this.field_R == 17) {
                        statePc = 452;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 452: {
                    lg.field_a[(this.field_Q / 10 - -2) % 4 + 30].e(512, 288);
                    oc.field_c[(this.field_Q / 5 - -2) % 2 - -17].e(164, 352);
                    statePc = 453;
                    continue stateLoop;
                }
                case 453: {
                    if ((this.field_R ^ -1) == -2) {
                        statePc = 455;
                    } else {
                        statePc = 456;
                    }
                    continue stateLoop;
                }
                case 455: {
                    var3 = 256;
                    var4_int = 288;
                    var5 = this.field_Q / 10 % 8 - 0;
                    lg.field_a[var5].e(var3, var4_int);
                    statePc = 456;
                    continue stateLoop;
                }
                case 456: {
                    if (2 == this.field_R) {
                        statePc = 458;
                    } else {
                        statePc = 459;
                    }
                    continue stateLoop;
                }
                case 458: {
                    var5 = this.field_Q / 10 % 8 - 0;
                    var3 = 256;
                    var4_int = 288;
                    lg.field_a[var5].e(var3, var4_int);
                    var4_int = var4_int - (32 + -this.field_Q + 100);
                    var5 = this.field_Q / 5 % 4 + 6;
                    var3 = var3 - (-64 + (100 - this.field_Q) * 5);
                    ok.field_e[5][3][var5].d(var3, var4_int);
                    statePc = 459;
                    continue stateLoop;
                }
                case 459: {
                    if (this.field_R == 3) {
                        statePc = 461;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 461: {
                    var4_int = 288;
                    var5 = this.field_Q / 10 % 4 - -8;
                    var3 = 256;
                    var4_int = var4_int - this.field_Q;
                    var3 = var3 + 5 * this.field_Q;
                    lg.field_a[var5].e(var3, var4_int);
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    if (-5 != (this.field_R ^ -1)) {
                        statePc = 464;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    var3 = 2 * this.field_Q - 64;
                    var5 = 6 + this.field_Q / 10 % 4;
                    var4_int = 352;
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 464;
                    continue stateLoop;
                }
                case 464: {
                    if (this.field_R != 5) {
                        statePc = 473;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 465: {
                    var5 = 6 + (2 + this.field_Q / 10) % 4;
                    var4_int = 352;
                    if ((this.field_Q ^ -1) > -101) {
                        statePc = 469;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    var3 = 336;
                    var5 = 7;
                    if (this.field_Q < 150) {
                        statePc = 468;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 470;
                    continue stateLoop;
                }
                case 468: {
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 470;
                    continue stateLoop;
                }
                case 469: {
                    var3 = -64 + (2 * this.field_Q - -200);
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 470;
                    continue stateLoop;
                }
                case 470: {
                    if (100 < this.field_Q) {
                        statePc = 472;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 472: {
                    var3 = 64 + (int)(Math.sin(3.14 * (double)this.field_Q / 100.0) * 32.0);
                    var4_int = -448 + 2 * this.field_Q;
                    var5 = 36 + this.field_Q / 25 % 2;
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 473;
                    continue stateLoop;
                }
                case 473: {
                    if (6 == this.field_R) {
                        statePc = 475;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 475: {
                    var4_int = 352;
                    var5 = 6 + this.field_Q / 10 % 4;
                    var3 = 336;
                    var5 = 7;
                    if ((this.field_Q ^ -1) < -21) {
                        statePc = 477;
                    } else {
                        statePc = 478;
                    }
                    continue stateLoop;
                }
                case 477: {
                    var5 = 28;
                    statePc = 478;
                    continue stateLoop;
                }
                case 478: {
                    if (this.field_Q <= 40) {
                        statePc = 480;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    var5 = 27;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    if (-151 <= (this.field_Q ^ -1)) {
                        statePc = 482;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    var5 = 28;
                    statePc = 482;
                    continue stateLoop;
                }
                case 482: {
                    if ((this.field_Q ^ -1) >= -176) {
                        statePc = 484;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    var5 = 29;
                    statePc = 484;
                    continue stateLoop;
                }
                case 484: {
                    oc.field_c[var5].e(var3, var4_int);
                    var3 = (int)(Math.sin((double)this.field_Q * 3.14 / 100.0) * 32.0) + 64;
                    var5 = 36 + this.field_Q / 25 % 2;
                    var4_int = 2 * this.field_Q + -48;
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 485;
                    continue stateLoop;
                }
                case 485: {
                    if (this.field_R != 7) {
                        statePc = 491;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    if (this.field_Q >= 50) {
                        statePc = 488;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    var5 = this.field_Q / 5 % 4 + 6;
                    var3 = 336;
                    var4_int = 352;
                    var6 = 64 + -var3;
                    var3 = var3 + var6 * this.field_Q / 50;
                    oc.field_c[var5].e(var3, var4_int);
                    var5 = 36;
                    var3 = 64;
                    var4_int = 352;
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 491;
                    continue stateLoop;
                }
                case 488: {
                    var4_int = 352;
                    var3 = 64;
                    if (this.field_Q >= 75) {
                        statePc = 490;
                    } else {
                        statePc = 489;
                    }
                    continue stateLoop;
                }
                case 489: {
                    oc.field_c[0].e(var3, var4_int);
                    oc.field_c[36].e(var3, var4_int);
                    statePc = 491;
                    continue stateLoop;
                }
                case 490: {
                    oc.field_c[10].e(var3, var4_int);
                    statePc = 491;
                    continue stateLoop;
                }
                case 491: {
                    if (this.field_R == 8) {
                        statePc = 493;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 493: {
                    var5 = this.field_Q / 5 % 4 + 2;
                    var4_int = 352;
                    if (40 <= this.field_Q) {
                        statePc = 495;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    var3 = 64 - -(this.field_Q * 3);
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 495;
                    continue stateLoop;
                }
                case 495: {
                    if ((this.field_Q ^ -1) > -41) {
                        statePc = 499;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (this.field_Q < 60) {
                        statePc = 498;
                    } else {
                        statePc = 499;
                    }
                    continue stateLoop;
                }
                case 498: {
                    var3 = 184;
                    oc.field_c[3].d(var3, var4_int);
                    statePc = 499;
                    continue stateLoop;
                }
                case 499: {
                    if (this.field_Q < 60) {
                        statePc = 502;
                    } else {
                        statePc = 500;
                    }
                    continue stateLoop;
                }
                case 500: {
                    if (-101 > (this.field_Q ^ -1)) {
                        statePc = 502;
                    } else {
                        statePc = 501;
                    }
                    continue stateLoop;
                }
                case 501: {
                    var3 = 364 + -(this.field_Q * 3);
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 502;
                    continue stateLoop;
                }
                case 502: {
                    if ((this.field_R ^ -1) == -10) {
                        statePc = 504;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 504: {
                    var4_int = 352;
                    var5 = 10;
                    var3 = 64;
                    if ((this.field_Q ^ -1) >= -26) {
                        statePc = 506;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    var5 = 11;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    if ((this.field_Q ^ -1) < -51) {
                        statePc = 508;
                    } else {
                        statePc = 509;
                    }
                    continue stateLoop;
                }
                case 508: {
                    var5 = 12;
                    statePc = 509;
                    continue stateLoop;
                }
                case 509: {
                    if (3 < qh.field_g) {
                        statePc = 511;
                    } else {
                        statePc = 510;
                    }
                    continue stateLoop;
                }
                case 510: {
                    oc.field_c[var5].e(var3, var4_int);
                    statePc = 512;
                    continue stateLoop;
                }
                case 511: {
                    oc.field_c[var5].d(var3, var4_int);
                    statePc = 512;
                    continue stateLoop;
                }
                case 512: {
                    hl.field_b.b(43);
                    stackIn_513_0 = 0;
                    stackIn_513_1 = tj.field_I;
                    statePc = 513;
                    continue stateLoop;
                }
                case 513: {
                    if (stackIn_513_0 >= stackIn_513_1) {
                        statePc = 517;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    if (tj.field_I < 256) {
                        statePc = 516;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 515: {
                    ed.d(0, 0, 640, 480, 0, -tj.field_I + 510);
                    statePc = 517;
                    continue stateLoop;
                }
                case 516: {
                    ed.d(0, 0, 640, 480, 0, tj.field_I);
                    statePc = 517;
                    continue stateLoop;
                }
                case 517: {
                    if (-350 < hi.field_a) {
                        statePc = 520;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 518: {
                    if ((qh.field_l ^ -1) != -1) {
                        statePc = 578;
                    } else {
                        statePc = 520;
                    }
                    continue stateLoop;
                }
                case 520: {
                    var3 = hi.field_a;
                    if (qh.field_l != 0) {
                        statePc = 525;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 521: {
                    if (pg.field_q) {
                        statePc = 523;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    stackIn_524_0 = 1;
                    statePc = 524;
                    continue stateLoop;
                }
                case 523: {
                    stackIn_524_0 = 0;
                    statePc = 524;
                    continue stateLoop;
                }
                case 524: {
                    if (stackIn_524_0 != 1) {
                        statePc = 525;
                    } else {
                        statePc = 525;
                    }
                    continue stateLoop;
                }
                case 525: {
                    if (-241 < (hi.field_a ^ -1)) {
                        statePc = 527;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 527: {
                    hi.field_a = hi.field_a + 250;
                    if (hi.field_a > 240) {
                        statePc = 529;
                    } else {
                        statePc = 530;
                    }
                    continue stateLoop;
                }
                case 529: {
                    hi.field_a = 240;
                    statePc = 530;
                    continue stateLoop;
                }
                case 530: {
                    var4_int = (-240 + hi.field_a) * (-240 + hi.field_a) / 120;
                    if (-241 >= (hi.field_a ^ -1)) {
                        statePc = 532;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 531: {
                    var4_int = -var4_int;
                    statePc = 532;
                    continue stateLoop;
                }
                case 532: {
                    var4_int += 240;
                    ed.c(5 + (-(jj.field_b.b(bb.field_j) / 2) + 320 - 16), -11 + -jj.field_b.field_M + var4_int, jj.field_b.b(bb.field_j) - -32 - 10, -10 + hj.field_g.field_M - -16, 13158);
                    ig.a(pd.field_H, -16 + -(jj.field_b.b(bb.field_j) / 2) + 320, (byte) -110, 16 + hj.field_g.field_M, 32 + jj.field_b.b(bb.field_j), var4_int - jj.field_b.field_M + -16);
                    this.a(var4_int, bb.field_j, 16777215, -57, 319);
                    if (-1 != (qh.field_l ^ -1)) {
                        statePc = 577;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    if ((qh.field_g ^ -1) <= -1) {
                        statePc = 535;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 535: {
                    var5 = 64 + var4_int;
                    if (0 != ql.field_c) {
                        statePc = 539;
                    } else {
                        statePc = 536;
                    }
                    continue stateLoop;
                }
                case 536: {
                    if (ef.field_F != bb.field_j) {
                        statePc = 538;
                    } else {
                        statePc = 539;
                    }
                    continue stateLoop;
                }
                case 538: {
                    var6 = jj.field_b.b(ol.field_d);
                    ed.c(5 + (320 - var6 / 2 - 16), 5 + (-jj.field_b.field_M + (var5 + -16)), var6 - -32 + -10, 118 + hj.field_g.field_M, 13158);
                    ig.a(pd.field_H, -16 + (320 + -(var6 / 2)), (byte) -110, hj.field_g.field_M + 128, var6 + 32, var5 - jj.field_b.field_M - 16);
                    this.a(var5, r.field_c, 16777215, 123, 319);
                    var5 += 32;
                    this.a(var5, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 45, i.field_c), 16777215, -83, 319);
                    var5 += 32;
                    this.a(var5, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 126, pb.field_i), 16777215, -91, 319);
                    var5 += 32;
                    statePc = 539;
                    continue stateLoop;
                }
                case 539: {
                    if (1 != ql.field_c) {
                        statePc = 541;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    var6 = 500;
                    ed.c(304 - var6 / 2 - -5, -jj.field_b.field_M + (var5 - 16 - -5), -10 + var6 + 32, 96 + (hj.field_g.field_M + -10), 13158);
                    ig.a(pd.field_H, -16 + (-(var6 / 2) + 320), (byte) -110, hj.field_g.field_M + 96, var6 + 32, -16 + (var5 - jj.field_b.field_M));
                    jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6 / 2) + 320 + -1, 5 + (-16 + var5 - (-4 - (-jj.field_b.field_M + -1))), var6, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6 / 2) + 320 + -1, 5 + -jj.field_b.field_M + 4 + (var5 - 16) - 1, var6, 480, 0, 0, 1, 0, jj.field_b.field_M);
                    jj.field_b.a(fa.field_d + " " + ta.field_f, 320 + -(var6 / 2), -16 + -jj.field_b.field_M + 4 + (var5 + 5), var6, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                    var5 += 64;
                    statePc = 541;
                    continue stateLoop;
                }
                case 541: {
                    if (2 != ql.field_c) {
                        statePc = 548;
                    } else {
                        statePc = 542;
                    }
                    continue stateLoop;
                }
                case 542: {
                    var6 = jj.field_b.b(vl.field_a);
                    if ((jj.field_b.b(ol.field_d) ^ -1) >= (var6 ^ -1)) {
                        statePc = 544;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 543: {
                    var6 = jj.field_b.b(ol.field_d);
                    statePc = 544;
                    continue stateLoop;
                }
                case 544: {
                    if (608 >= var6) {
                        statePc = 546;
                    } else {
                        statePc = 545;
                    }
                    continue stateLoop;
                }
                case 545: {
                    var6 = 608;
                    ed.c(5 + -(var6 / 2) + 320 - 16, -jj.field_b.field_M + var5 - 16 + 5, -10 + (32 + var6), 128 + (hj.field_g.field_M + -10), 13158);
                    ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 128, 32 + var6, -jj.field_b.field_M + var5 + -16);
                    var28 = cd.field_h + " " + vl.field_a + " " + ld.field_a;
                    a.field_a.a(var28, 32, -20 + var5, 575, 48, 0, 0, 1, 1, 14);
                    a.field_a.a(var28, 32, -20 + var5 - 1, 576, 48, 0, 0, 1, 1, 14);
                    a.field_a.a(var28, 32, var5 - 20, 576, 48, 16777215, -1, 1, 1, 14);
                    var5 += 48;
                    statePc = 547;
                    continue stateLoop;
                }
                case 546: {
                    ed.c(5 + -(var6 / 2) + 320 - 16, -11 + (-jj.field_b.field_M + var5), -10 + (32 + var6), hj.field_g.field_M - -150, 13158);
                    ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 160, var6 + 32, var5 - jj.field_b.field_M + -16);
                    this.a(var5, cd.field_h, 16777215, -102, 319);
                    var5 += 32;
                    this.a(var5, vl.field_a, 16777215, -126, 319);
                    var5 += 32;
                    this.a(var5, ld.field_a, 16777215, -35, 319);
                    var5 += 32;
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    jj.field_a[0].e(222, -20 + var5);
                    jj.field_a[2].e(254, var5 + -20);
                    jj.field_a[1].e(286, var5 - 20);
                    jj.field_a[3].e(318, var5 + -20);
                    jj.field_a[4].e(350, -20 + var5);
                    jj.field_a[6].e(382, -20 + var5);
                    var5 += 32;
                    statePc = 548;
                    continue stateLoop;
                }
                case 548: {
                    if ((ql.field_c ^ -1) == -4) {
                        statePc = 550;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 550: {
                    var6 = 600;
                    ed.c(-11 + (-(var6 / 2) + 320), -11 + (-jj.field_b.field_M + var5), 22 + var6, 160 + (hj.field_g.field_M + -10), 13158);
                    ig.a(pd.field_H, -16 + -(var6 / 2) + 320, (byte) -110, 160 + hj.field_g.field_M, 32 + var6, -16 + var5 + -jj.field_b.field_M);
                    jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 102, ag.field_w), -(var6 / 2) + 319, var5 - 24, var6, 480, 0, 0, 0, 0, 20);
                    jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 61, ag.field_w), -(var6 / 2) + 320, -25 + var5, var6, 480, 0, 0, 0, 0, 20);
                    jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 107, ag.field_w), -(var6 / 2) + 320, -24 + var5, var6, 480, 16777215, -1, 0, 0, 20);
                    var5 += 32;
                    var5 -= 24;
                    var29 = new String[9];
                    var7_ref_String__ = var29;
                    var8 = 0;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    if ((var8 ^ -1) <= -10) {
                        statePc = 553;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    var7_ref_String__[var8] = sc.a((byte) 127, bb.field_g.charAt(var8));
                    var8++;
                    statePc = 551;
                    continue stateLoop;
                }
                case 553: {
                    var8 = 0;
                    var9 = 0;
                    if ((mh.field_tb ^ -1) != -2) {
                        statePc = 555;
                    } else {
                        statePc = 554;
                    }
                    continue stateLoop;
                }
                case 554: {
                    var9 = -80;
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    var10 = var9 + 440;
                    statePc = 556;
                    continue stateLoop;
                }
                case 556: {
                    if (var10 > 610 - -var9) {
                        statePc = 558;
                    } else {
                        statePc = 557;
                    }
                    continue stateLoop;
                }
                case 557: {
                    ok.field_d[0].b(-140 + var10, 0 + var5, 30, 30, 64);
                    jj.field_b.b(var29[var8], var10 + -140 + 15, var5 + 24, 0, -1);
                    jj.field_b.b(var29[var8], var10 + -125, 26 - -var5, 0, -1);
                    jj.field_b.b(var29[var8], -1 + (var10 - 140 + 15), 25 + var5, 0, -1);
                    jj.field_b.b(var29[var8], 15 + var10 + -140 - -1, var5 + 25, 0, -1);
                    incrementValue$3 = var8;
                    var8++;
                    jj.field_b.b(var7_ref_String__[incrementValue$3], var10 + -140 + 15, var5 + 25, 16777215, -1);
                    var10 += 20;
                    statePc = 556;
                    continue stateLoop;
                }
                case 558: {
                    var8 = 0;
                    ed.c(0, 0, 395 + var9, 480);
                    var10 = 440 + var9;
                    statePc = 559;
                    continue stateLoop;
                }
                case 559: {
                    if (610 + var9 < var10) {
                        statePc = 565;
                    } else {
                        statePc = 560;
                    }
                    continue stateLoop;
                }
                case 560: {
                    ok.field_d[0].a(-140 + var10, var5 + 0, 30, 30);
                    incrementValue$4 = var8;
                    var8++;
                    jj.field_b.b(var7_ref_String__[incrementValue$4], 15 + var10 + -140, var5 + 25, 0, -1);
                    stackIn_567_0 = fi.field_x ^ -1;
                    stackIn_561_0 = stackIn_567_0;
                    stackIn_567_1 = -101;
                    stackIn_561_1 = stackIn_567_1;
                    if (false) {
                        statePc = 567;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 561: {
                    if (stackIn_561_0 >= stackIn_561_1) {
                        statePc = 564;
                    } else {
                        statePc = 562;
                    }
                    continue stateLoop;
                }
                case 562: {
                    if ((fi.field_x ^ -1) <= -111) {
                        statePc = 564;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 563: {
                    ok.field_d[0].a(-140 + (var10 - -5), 5 + var5, 20, 20);
                    statePc = 564;
                    continue stateLoop;
                }
                case 564: {
                    var10 += 20;
                    statePc = 559;
                    continue stateLoop;
                }
                case 565: {
                    ed.c();
                    var5 += 24;
                    var5 += 32;
                    jj.field_b.a(lc.field_c + " " + sd.field_e, -(var6 / 2) + 320, -25 + var5, var6, 480, 0, 0, 1, 0, 20);
                    jj.field_b.a(lc.field_c + " " + sd.field_e, 319 + -(var6 / 2), var5 - 24, var6, 480, 0, 0, 1, 0, 20);
                    jj.field_b.a(lc.field_c + " " + sd.field_e, 320 + -(var6 / 2), var5 - 24, var6, 480, 16777215, -1, 1, 0, 20);
                    var5 += 64;
                    statePc = 566;
                    continue stateLoop;
                }
                case 566: {
                    stackIn_567_0 = -5;
                    stackIn_567_1 = ql.field_c ^ -1;
                    statePc = 567;
                    continue stateLoop;
                }
                case 567: {
                    if (stackIn_567_0 != stackIn_567_1) {
                        statePc = 569;
                    } else {
                        statePc = 568;
                    }
                    continue stateLoop;
                }
                case 568: {
                    var6 = jj.field_b.b(ab.field_b);
                    ed.c(-11 + -(var6 / 2) + 320, -jj.field_b.field_M + var5 + -11, 22 + var6, 96 + (hj.field_g.field_M + -10), 13158);
                    ig.a(pd.field_H, -16 + (-(var6 / 2) + 320), (byte) -110, hj.field_g.field_M - -96, var6 + 32, -16 + var5 - jj.field_b.field_M);
                    jj.field_b.a(ab.field_b + " " + he.field_r, 320 + -(var6 / 2), -25 + var5, var6, 480, 0, 0, 1, 0, 22);
                    jj.field_b.a(ab.field_b + " " + he.field_r, -(var6 / 2) + 319, -24 + var5, var6, 480, 0, 0, 1, 0, 22);
                    jj.field_b.a(ab.field_b + " " + he.field_r, 320 + -(var6 / 2), var5 + -24, var6, 480, 16777215, -1, 1, 0, 22);
                    var5 += 64;
                    statePc = 569;
                    continue stateLoop;
                }
                case 569: {
                    if ((ql.field_c ^ -1) != -6) {
                        statePc = 571;
                    } else {
                        statePc = 570;
                    }
                    continue stateLoop;
                }
                case 570: {
                    var6 = jj.field_b.b(ol.field_d);
                    ed.c(-11 + -(var6 / 2) + 320, -11 + var5 - jj.field_b.field_M, var6 + 22, 128 + hj.field_g.field_M - 10, 13158);
                    ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 128, var6 - -32, -16 + (var5 + -jj.field_b.field_M));
                    this.a(var5, jd.field_c, 16777215, -52, 319);
                    var5 += 32;
                    this.a(var5, ql.field_a, 16777215, 78, 319);
                    var5 += 32;
                    this.a(var5, ug.field_P, 16777215, 95, 319);
                    var5 += 32;
                    statePc = 571;
                    continue stateLoop;
                }
                case 571: {
                    var5 += 16;
                    if (pg.field_q) {
                        statePc = 573;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    stackIn_574_0 = 1;
                    statePc = 574;
                    continue stateLoop;
                }
                case 573: {
                    stackIn_574_0 = 0;
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    if (stackIn_574_0 != 0) {
                        statePc = 576;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 576: {
                    this.a(var5, ol.field_d, 16777215, -74, 319);
                    statePc = 577;
                    continue stateLoop;
                }
                case 577: {
                    hi.field_a = var3;
                    statePc = 578;
                    continue stateLoop;
                }
                case 578: {
                    if (da.field_e == null) {
                        statePc = 580;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 579: {
                    da.field_e.c(40);
                    statePc = 580;
                    continue stateLoop;
                }
                case 580: {
                    if (1 == sf.field_h) {
                        statePc = 584;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 581: {
                    if (sf.field_h == 2) {
                        statePc = 584;
                    } else {
                        statePc = 582;
                    }
                    continue stateLoop;
                }
                case 582: {
                    if ((sf.field_h ^ -1) == -6) {
                        statePc = 584;
                    } else {
                        statePc = 650;
                    }
                    continue stateLoop;
                }
                case 584: {
                    var30 = ne.field_a;
                    ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
                    var4_int = 16776960;
                    if ((this.field_N ^ -1) == -1) {
                        statePc = 590;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    if ((this.field_N ^ -1) != 0) {
                        statePc = 595;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 586: {
                    if (0 > pg.field_n) {
                        statePc = 595;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    if (pg.field_n >= 88) {
                        statePc = 595;
                    } else {
                        statePc = 588;
                    }
                    continue stateLoop;
                }
                case 588: {
                    if (fi.field_B >= 436) {
                        statePc = 590;
                    } else {
                        statePc = 595;
                    }
                    continue stateLoop;
                }
                case 590: {
                    var4_int = 16777215;
                    if (-2 == (sh.field_c ^ -1)) {
                        statePc = 593;
                    } else {
                        statePc = 591;
                    }
                    continue stateLoop;
                }
                case 591: {
                    if (!hi.field_p[84]) {
                        statePc = 595;
                    } else {
                        statePc = 593;
                    }
                    continue stateLoop;
                }
                case 593: {
                    if (-33 >= (pa.field_c ^ -1)) {
                        statePc = 595;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    pa.field_c = 32;
                    statePc = 595;
                    continue stateLoop;
                }
                case 595: {
                    this.b(-12926, var30, var4_int, 44, 458 + jj.field_b.field_M / 4);
                    if (-6 != (sf.field_h ^ -1)) {
                        statePc = 611;
                    } else {
                        statePc = 596;
                    }
                    continue stateLoop;
                }
                case 596: {
                    if (qf.field_l <= 0) {
                        statePc = 611;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    var4_int = -32 + -hj.field_g.b(var30) + 640;
                    var31 = cf.field_m;
                    var4_int = var4_int - (jj.field_b.b(var31) + 32);
                    ig.a(qc.field_E, var4_int, (byte) -110, 44, 32 + jj.field_b.b(var31), 436);
                    var5 = 16776960;
                    if (-2 == (this.field_N ^ -1)) {
                        statePc = 603;
                    } else {
                        statePc = 598;
                    }
                    continue stateLoop;
                }
                case 598: {
                    if ((pg.field_n ^ -1) > (var4_int ^ -1)) {
                        statePc = 610;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    if ((pg.field_n ^ -1) <= (jj.field_b.b(var31) + 32 + var4_int ^ -1)) {
                        statePc = 610;
                    } else {
                        statePc = 600;
                    }
                    continue stateLoop;
                }
                case 600: {
                    if (436 > fi.field_B) {
                        statePc = 610;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    if (this.field_N != -1) {
                        statePc = 610;
                    } else {
                        statePc = 603;
                    }
                    continue stateLoop;
                }
                case 603: {
                    if (sh.field_c != 0) {
                        statePc = 606;
                    } else {
                        statePc = 604;
                    }
                    continue stateLoop;
                }
                case 604: {
                    if (!hi.field_p[84]) {
                        statePc = 609;
                    } else {
                        statePc = 606;
                    }
                    continue stateLoop;
                }
                case 606: {
                    if (0 == pa.field_c) {
                        statePc = 608;
                    } else {
                        statePc = 609;
                    }
                    continue stateLoop;
                }
                case 608: {
                    th.field_i = 3;
                    pa.field_c = 32;
                    statePc = 609;
                    continue stateLoop;
                }
                case 609: {
                    var5 = 16777215;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    this.b(-12926, var31, var5, 16 + var4_int + jj.field_b.b(var31) / 2, 458 - -(jj.field_b.field_M / 4));
                    statePc = 611;
                    continue stateLoop;
                }
                case 611: {
                    if (-3 != (sf.field_h ^ -1)) {
                        statePc = 634;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    if (!e.a(-108)) {
                        statePc = 614;
                    } else {
                        statePc = 634;
                    }
                    continue stateLoop;
                }
                case 614: {
                    var4_int = 88;
                    var5 = 0;
                    statePc = 615;
                    continue stateLoop;
                }
                case 615: {
                    if (var5 > 2) {
                        statePc = 634;
                    } else {
                        statePc = 616;
                    }
                    continue stateLoop;
                }
                case 616: {
                    var4_int += 8;
                    var6 = 176;
                    var3_ref_String = wh.field_l[var5];
                    ig.a(qc.field_E, var4_int, (byte) -110, 44, var6, 436);
                    var7 = 16776960;
                    stackIn_651_0 = cd.field_c ^ -1;
                    stackIn_617_0 = stackIn_651_0;
                    stackIn_651_1 = var5 ^ -1;
                    stackIn_617_1 = stackIn_651_1;
                    if (false) {
                        statePc = 651;
                    } else {
                        statePc = 617;
                    }
                    continue stateLoop;
                }
                case 617: {
                    if (stackIn_617_0 == stackIn_617_1) {
                        statePc = 619;
                    } else {
                        statePc = 620;
                    }
                    continue stateLoop;
                }
                case 619: {
                    var7 = 16711680;
                    statePc = 620;
                    continue stateLoop;
                }
                case 620: {
                    if (this.field_N == var5 + 1) {
                        statePc = 626;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    if (0 != (this.field_N ^ -1)) {
                        statePc = 633;
                    } else {
                        statePc = 622;
                    }
                    continue stateLoop;
                }
                case 622: {
                    if ((pg.field_n ^ -1) > (var4_int ^ -1)) {
                        statePc = 633;
                    } else {
                        statePc = 623;
                    }
                    continue stateLoop;
                }
                case 623: {
                    if (pg.field_n >= var6 + var4_int) {
                        statePc = 633;
                    } else {
                        statePc = 624;
                    }
                    continue stateLoop;
                }
                case 624: {
                    if ((fi.field_B ^ -1) > -437) {
                        statePc = 633;
                    } else {
                        statePc = 626;
                    }
                    continue stateLoop;
                }
                case 626: {
                    if (-1 != (sh.field_c ^ -1)) {
                        statePc = 629;
                    } else {
                        statePc = 627;
                    }
                    continue stateLoop;
                }
                case 627: {
                    if (!hi.field_p[84]) {
                        statePc = 630;
                    } else {
                        statePc = 629;
                    }
                    continue stateLoop;
                }
                case 629: {
                    cd.field_c = var5;
                    statePc = 630;
                    continue stateLoop;
                }
                case 630: {
                    if ((var7 ^ -1) != -16711681) {
                        statePc = 632;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 631: {
                    var7 = 16744576;
                    statePc = 633;
                    continue stateLoop;
                }
                case 632: {
                    var7 = 16777215;
                    statePc = 633;
                    continue stateLoop;
                }
                case 633: {
                    this.b(-12926, var3_ref_String, var7, var4_int - -(var6 / 2), jj.field_b.field_M / 4 + 458);
                    var4_int = var4_int + var6;
                    var5++;
                    statePc = 615;
                    continue stateLoop;
                }
                case 634: {
                    if (!e.a(-128)) {
                        statePc = 650;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 635: {
                    if (2 == sf.field_h) {
                        statePc = 638;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    if (sf.field_h != 5) {
                        statePc = 650;
                    } else {
                        statePc = 638;
                    }
                    continue stateLoop;
                }
                case 638: {
                    var3_ref_String = ue.field_b;
                    ig.a(qc.field_E, 96, (byte) -110, 44, 176, 436);
                    var4_int = 16776960;
                    if (this.field_N == 1) {
                        statePc = 644;
                    } else {
                        statePc = 639;
                    }
                    continue stateLoop;
                }
                case 639: {
                    if (96 >= pg.field_n) {
                        statePc = 649;
                    } else {
                        statePc = 640;
                    }
                    continue stateLoop;
                }
                case 640: {
                    if ((pg.field_n ^ -1) <= -265) {
                        statePc = 649;
                    } else {
                        statePc = 641;
                    }
                    continue stateLoop;
                }
                case 641: {
                    if (-437 < (fi.field_B ^ -1)) {
                        statePc = 649;
                    } else {
                        statePc = 642;
                    }
                    continue stateLoop;
                }
                case 642: {
                    if (-1 != this.field_N) {
                        statePc = 649;
                    } else {
                        statePc = 644;
                    }
                    continue stateLoop;
                }
                case 644: {
                    if (-1 != (sh.field_c ^ -1)) {
                        statePc = 647;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 645: {
                    if (hi.field_p[84]) {
                        statePc = 647;
                    } else {
                        statePc = 648;
                    }
                    continue stateLoop;
                }
                case 647: {
                    sl.a(sf.field_h, sf.field_h, -128);
                    statePc = 648;
                    continue stateLoop;
                }
                case 648: {
                    var4_int = 16777215;
                    statePc = 649;
                    continue stateLoop;
                }
                case 649: {
                    this.b(-12926, var3_ref_String, var4_int, 184, 458 - -(jj.field_b.field_M / 4));
                    statePc = 650;
                    continue stateLoop;
                }
                case 650: {
                    stackIn_651_0 = -10;
                    stackIn_651_1 = sf.field_h ^ -1;
                    statePc = 651;
                    continue stateLoop;
                }
                case 651: {
                    if (stackIn_651_0 == stackIn_651_1) {
                        statePc = 653;
                    } else {
                        statePc = 654;
                    }
                    continue stateLoop;
                }
                case 653: {
                    ed.c(0, 0, 640, 480, 0);
                    df.a(2);
                    statePc = 654;
                    continue stateLoop;
                }
                case 654: {
                    var3 = 8 / ((param0 - -43) / 50);
                    if ((sf.field_h ^ -1) != -7) {
                        statePc = 681;
                    } else {
                        statePc = 655;
                    }
                    continue stateLoop;
                }
                case 655: {
                    var32 = a.field_a;
                    var5 = 180 - -var32.field_M;
                    var6 = 4 + (var32.field_B + var32.field_q);
                    ed.d(40, 170, 560, 20 + (120 + 5 * var6), 0, 192);
                    ig.a(pd.field_H, 31, (byte) -110, 14 + (20 + (5 * var6 - -120)), 578, 163);
                    var32.b(vg.field_U, 320, var5, 16777215, -1);
                    stackIn_657_0 = (gb) (var32);
                    stackIn_656_0 = stackIn_657_0;
                    if (0 == qf.field_l) {
                        statePc = 657;
                    } else {
                        statePc = 656;
                    }
                    continue stateLoop;
                }
                case 656: {
                    stackIn_658_0 = (gb) ((Object) stackIn_656_0);
                    stackIn_658_1 = 1;
                    statePc = 658;
                    continue stateLoop;
                }
                case 657: {
                    stackIn_658_0 = (gb) ((Object) stackIn_657_0);
                    stackIn_658_1 = 0;
                    statePc = 658;
                    continue stateLoop;
                }
                case 658: {
                    stackIn_660_0 = (gb) ((Object) stackIn_658_0);
                    stackIn_659_0 = stackIn_660_0;
                    stackIn_660_1 = stackIn_658_1;
                    stackIn_659_1 = stackIn_660_1;
                    if (ke.field_u.f(8192)) {
                        statePc = 660;
                    } else {
                        statePc = 659;
                    }
                    continue stateLoop;
                }
                case 659: {
                    stackIn_661_0 = (gb) ((Object) stackIn_659_0);
                    stackIn_661_1 = stackIn_659_1;
                    stackIn_661_2 = 1;
                    statePc = 661;
                    continue stateLoop;
                }
                case 660: {
                    stackIn_661_0 = (gb) ((Object) stackIn_660_0);
                    stackIn_661_1 = stackIn_660_1;
                    stackIn_661_2 = 0;
                    statePc = 661;
                    continue stateLoop;
                }
                case 661: {
                    stackIn_663_0 = (gb) ((Object) stackIn_661_0);
                    stackIn_662_0 = stackIn_663_0;
                    stackIn_663_1 = stackIn_661_1;
                    stackIn_662_1 = stackIn_663_1;
                    stackIn_663_2 = stackIn_661_2;
                    stackIn_662_2 = stackIn_663_2;
                    if ((sg.field_f ^ -1) == -1) {
                        statePc = 663;
                    } else {
                        statePc = 662;
                    }
                    continue stateLoop;
                }
                case 662: {
                    stackIn_664_0 = (gb) ((Object) stackIn_662_0);
                    stackIn_664_1 = stackIn_662_1;
                    stackIn_664_2 = stackIn_662_2;
                    stackIn_664_3 = 1;
                    statePc = 664;
                    continue stateLoop;
                }
                case 663: {
                    stackIn_664_0 = (gb) ((Object) stackIn_663_0);
                    stackIn_664_1 = stackIn_663_1;
                    stackIn_664_2 = stackIn_663_2;
                    stackIn_664_3 = 0;
                    statePc = 664;
                    continue stateLoop;
                }
                case 664: {
                    ((gb) (Object) stackIn_664_0).b(h.a(stackIn_664_1 != 0, stackIn_664_2 != 0, stackIn_664_3 != 0, 26505), 320, var5 - -var6, 16777215, -1);
                    if (this.a(var5 + 4 * var6, 320, 65535, cd.field_d, 1)) {
                        statePc = 665;
                    } else {
                        statePc = 665;
                    }
                    continue stateLoop;
                }
                case 665: {
                    stackIn_667_0 = (gb) (var32);
                    stackIn_666_0 = stackIn_667_0;
                    if ((qf.field_l ^ -1) == -1) {
                        statePc = 667;
                    } else {
                        statePc = 666;
                    }
                    continue stateLoop;
                }
                case 666: {
                    stackIn_668_0 = (gb) ((Object) stackIn_666_0);
                    stackIn_668_1 = 1;
                    statePc = 668;
                    continue stateLoop;
                }
                case 667: {
                    stackIn_668_0 = (gb) ((Object) stackIn_667_0);
                    stackIn_668_1 = 0;
                    statePc = 668;
                    continue stateLoop;
                }
                case 668: {
                    stackIn_670_0 = (gb) ((Object) stackIn_668_0);
                    stackIn_669_0 = stackIn_670_0;
                    stackIn_670_1 = stackIn_668_1;
                    stackIn_669_1 = stackIn_670_1;
                    stackIn_670_2 = 2;
                    stackIn_669_2 = stackIn_670_2;
                    if (-1 == (sg.field_f ^ -1)) {
                        statePc = 670;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    stackIn_671_0 = (gb) ((Object) stackIn_669_0);
                    stackIn_671_1 = stackIn_669_1;
                    stackIn_671_2 = stackIn_669_2;
                    stackIn_671_3 = 1;
                    statePc = 671;
                    continue stateLoop;
                }
                case 670: {
                    stackIn_671_0 = (gb) ((Object) stackIn_670_0);
                    stackIn_671_1 = stackIn_670_1;
                    stackIn_671_2 = stackIn_670_2;
                    stackIn_671_3 = 0;
                    statePc = 671;
                    continue stateLoop;
                }
                case 671: {
                    stackIn_673_0 = (gb) ((Object) stackIn_671_0);
                    stackIn_672_0 = stackIn_673_0;
                    stackIn_673_1 = stackIn_671_1;
                    stackIn_672_1 = stackIn_673_1;
                    stackIn_673_2 = stackIn_671_2;
                    stackIn_672_2 = stackIn_673_2;
                    stackIn_673_3 = stackIn_671_3;
                    stackIn_672_3 = stackIn_673_3;
                    if (ke.field_u.f(8192)) {
                        statePc = 673;
                    } else {
                        statePc = 672;
                    }
                    continue stateLoop;
                }
                case 672: {
                    stackIn_674_0 = (gb) ((Object) stackIn_672_0);
                    stackIn_674_1 = stackIn_672_1;
                    stackIn_674_2 = stackIn_672_2;
                    stackIn_674_3 = stackIn_672_3;
                    stackIn_674_4 = 1;
                    statePc = 674;
                    continue stateLoop;
                }
                case 673: {
                    stackIn_674_0 = (gb) ((Object) stackIn_673_0);
                    stackIn_674_1 = stackIn_673_1;
                    stackIn_674_2 = stackIn_673_2;
                    stackIn_674_3 = stackIn_673_3;
                    stackIn_674_4 = 0;
                    statePc = 674;
                    continue stateLoop;
                }
                case 674: {
                    ((gb) (Object) stackIn_674_0).b(ka.a(stackIn_674_1 != 0, stackIn_674_2, stackIn_674_3 != 0, stackIn_674_4 != 0), 320, (int)(2.5 * (double)var6) + var5 + 60, 16777215, -1);
                    discarded$5 = this.a(60 + (var6 / 2 + var6 * 5 + var5), 320, 65535, gf.field_X, 1);
                    stackIn_676_0 = (gb) (var32);
                    stackIn_675_0 = stackIn_676_0;
                    if (0 == sg.field_f) {
                        statePc = 676;
                    } else {
                        statePc = 675;
                    }
                    continue stateLoop;
                }
                case 675: {
                    stackIn_677_0 = (gb) ((Object) stackIn_675_0);
                    stackIn_677_1 = 1;
                    statePc = 677;
                    continue stateLoop;
                }
                case 676: {
                    stackIn_677_0 = (gb) ((Object) stackIn_676_0);
                    stackIn_677_1 = 0;
                    statePc = 677;
                    continue stateLoop;
                }
                case 677: {
                    stackIn_679_0 = (gb) ((Object) stackIn_677_0);
                    stackIn_678_0 = stackIn_679_0;
                    stackIn_679_1 = stackIn_677_1;
                    stackIn_678_1 = stackIn_679_1;
                    stackIn_679_2 = -3567;
                    stackIn_678_2 = stackIn_679_2;
                    stackIn_679_3 = 0;
                    stackIn_678_3 = stackIn_679_3;
                    if (0 == qf.field_l) {
                        statePc = 679;
                    } else {
                        statePc = 678;
                    }
                    continue stateLoop;
                }
                case 678: {
                    stackIn_680_0 = (gb) ((Object) stackIn_678_0);
                    stackIn_680_1 = stackIn_678_1;
                    stackIn_680_2 = stackIn_678_2;
                    stackIn_680_3 = stackIn_678_3;
                    stackIn_680_4 = 1;
                    statePc = 680;
                    continue stateLoop;
                }
                case 679: {
                    stackIn_680_0 = (gb) ((Object) stackIn_679_0);
                    stackIn_680_1 = stackIn_679_1;
                    stackIn_680_2 = stackIn_679_2;
                    stackIn_680_3 = stackIn_679_3;
                    stackIn_680_4 = 0;
                    statePc = 680;
                    continue stateLoop;
                }
                case 680: {
                    ((gb) (Object) stackIn_680_0).b(l.a(stackIn_680_1 != 0, stackIn_680_2, stackIn_680_3 != 0, stackIn_680_4 != 0), 320, 120 + (var5 + 4 * var6), 16777215, -1);
                    statePc = 681;
                    continue stateLoop;
                }
                case 681: {
                    if (sf.field_h == 7) {
                        statePc = 694;
                    } else {
                        statePc = 682;
                    }
                    continue stateLoop;
                }
                case 682: {
                    if (sf.field_h == 8) {
                        statePc = 684;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 684: {
                    if (e.a(-113)) {
                        statePc = 693;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 685: {
                    sf.field_h = hk.field_Y;
                    if (sf.field_h == 10) {
                        statePc = 687;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 687: {
                    da.a(7775, ql.field_c - -(qh.field_l * 6) + sg.field_f * 64);
                    ic.field_a = ic.field_a + (sg.field_f << -125900922);
                    me.field_f = me.field_f + (-6 + ql.field_c);
                    wg.field_b = wg.field_b - (6 * qh.field_l + 1);
                    stackIn_689_0 = this;
                    stackIn_688_0 = stackIn_689_0;
                    if (hl.field_a <= 0) {
                        statePc = 689;
                    } else {
                        statePc = 688;
                    }
                    continue stateLoop;
                }
                case 688: {
                    stackIn_690_0 = this;
                    stackIn_690_1 = 1;
                    statePc = 690;
                    continue stateLoop;
                }
                case 689: {
                    stackIn_690_0 = this;
                    stackIn_690_1 = 0;
                    statePc = 690;
                    continue stateLoop;
                }
                case 690: {
                    ((wizardrun) (this)).field_J = stackIn_690_1 != 0;
                    sg.field_f = 0;
                    qh.field_l = -1;
                    ql.field_c = 6;
                    sf.field_h = 2;
                    if (qf.field_l > 0) {
                        statePc = 692;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 692: {
                    sf.field_h = 5;
                    statePc = 695;
                    continue stateLoop;
                }
                case 693: {
                    sf.field_h = n.field_c;
                    statePc = 695;
                    continue stateLoop;
                }
                case 694: {
                    ih.a(0);
                    sf.field_h = 8;
                    statePc = 695;
                    continue stateLoop;
                }
                case 695: {
                    if ((this.field_I ^ -1) >= -1) {
                        statePc = 698;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 696: {
                    if (da.field_e != null) {
                        statePc = 698;
                    } else {
                        statePc = 697;
                    }
                    continue stateLoop;
                }
                case 697: {
                    ed.c(0, 0, 640, 480, 0);
                    statePc = 698;
                    continue stateLoop;
                }
                case 698: {
                    if (-1 > (se.field_a ^ -1)) {
                        statePc = 700;
                    } else {
                        statePc = 701;
                    }
                    continue stateLoop;
                }
                case 700: {
                    ed.d(0, 0, 640, 480, 0, se.field_a);
                    statePc = 701;
                    continue stateLoop;
                }
                case 701: {
                    if (pa.field_c <= 0) {
                        statePc = 705;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 702: {
                    if ((pa.field_c ^ -1) > -257) {
                        statePc = 704;
                    } else {
                        statePc = 703;
                    }
                    continue stateLoop;
                }
                case 703: {
                    ed.d(0, 0, 640, 480, 0, 512 + -pa.field_c);
                    statePc = 705;
                    continue stateLoop;
                }
                case 704: {
                    ed.d(0, 0, 640, 480, 0, pa.field_c);
                    statePc = 705;
                    continue stateLoop;
                }
                case 705: {
                    if (!md.field_d) {
                        statePc = 718;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    bk.field_b.c(0, 0, pa.field_c);
                    var4 = ne.field_a;
                    ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
                    var5 = 16776960;
                    if (0 == this.field_N) {
                        statePc = 712;
                    } else {
                        statePc = 707;
                    }
                    continue stateLoop;
                }
                case 707: {
                    if (0 != (this.field_N ^ -1)) {
                        statePc = 717;
                    } else {
                        statePc = 708;
                    }
                    continue stateLoop;
                }
                case 708: {
                    if (-1 < (pg.field_n ^ -1)) {
                        statePc = 717;
                    } else {
                        statePc = 709;
                    }
                    continue stateLoop;
                }
                case 709: {
                    if (88 <= pg.field_n) {
                        statePc = 717;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 710: {
                    if (436 <= fi.field_B) {
                        statePc = 712;
                    } else {
                        statePc = 717;
                    }
                    continue stateLoop;
                }
                case 712: {
                    if (-2 == (sh.field_c ^ -1)) {
                        statePc = 715;
                    } else {
                        statePc = 713;
                    }
                    continue stateLoop;
                }
                case 713: {
                    if (!hi.field_p[84]) {
                        statePc = 716;
                    } else {
                        statePc = 715;
                    }
                    continue stateLoop;
                }
                case 715: {
                    pl.field_D = true;
                    statePc = 716;
                    continue stateLoop;
                }
                case 716: {
                    var5 = 16777215;
                    statePc = 717;
                    continue stateLoop;
                }
                case 717: {
                    this.b(-12926, var4, var5, 44, 458 - -(jj.field_b.field_M / 4));
                    statePc = 718;
                    continue stateLoop;
                }
                case 718: {
                    var33_ref = (ra) ((Object) uc.field_b.b((byte) 87));
                    if (var33_ref != null) {
                        statePc = 720;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 720: {
                    var6 = this.field_M;
                    if (80 > var6) {
                        statePc = 724;
                    } else {
                        statePc = 721;
                    }
                    continue stateLoop;
                }
                case 721: {
                    if (var6 < 230) {
                        statePc = 723;
                    } else {
                        statePc = 722;
                    }
                    continue stateLoop;
                }
                case 722: {
                    var5 = 123 - var6 / 2;
                    statePc = 725;
                    continue stateLoop;
                }
                case 723: {
                    var5 = 8;
                    statePc = 725;
                    continue stateLoop;
                }
                case 724: {
                    var5 = var6 / 2 + -32;
                    statePc = 725;
                    continue stateLoop;
                }
                case 725: {
                    ed.c(4, var5 + -4, 48 - -jj.field_b.b(nl.field_t[var33_ref.field_n]), 40, 13158);
                    ig.a(pd.field_H, 0, (byte) -110, 48, 8 + (jj.field_b.b(nl.field_t[var33_ref.field_n]) + 48), var5 + -8);
                    ui.field_a[var33_ref.field_n].a(8, var5, 32, 32);
                    jj.field_b.c(nl.field_t[var33_ref.field_n], 48, jj.field_b.field_M + var5, 16776960, -1);
                    statePc = 726;
                    continue stateLoop;
                }
                case 726: {
                    if (!oa.a(-25231)) {
                        statePc = 728;
                    } else {
                        statePc = 727;
                    }
                    continue stateLoop;
                }
                case 727: {
                    ed.d(0, 0, 640, 480, 0, 128);
                    ed.c(-3 + -(pf.c((byte) -117) / 2) + 320, 240 - (lb.a((byte) 47) / 2 + 5), 6 - -pf.c((byte) 84), 10 - -lb.a((byte) 47), 0);
                    of.a(72);
                    statePc = 731;
                    continue stateLoop;
                }
                case 728: {
                    if (dg.b(70)) {
                        statePc = 730;
                    } else {
                        statePc = 731;
                    }
                    continue stateLoop;
                }
                case 730: {
                    rl.a(dh.a(255), false);
                    statePc = 731;
                    continue stateLoop;
                }
                case 731: {
                    if (ke.field_w) {
                        statePc = 733;
                    } else {
                        statePc = 734;
                    }
                    continue stateLoop;
                }
                case 733: {
                    jj.field_b.b("DEBUG PAUSE ON: PRESS 'V' TO CONTINUE", 320, 460, 16711680, 0);
                    statePc = 734;
                    continue stateLoop;
                }
                case 734: {
                    fc.a((byte) 80, 0, var19, 0);
                    return;
                }
                case 735: {
                    ok.field_d[0].a(md.field_a[var5][0], md.field_a[var5][1], -128, md.field_a[var5][2], md.field_a[var5][2] * 2);
                    statePc = 736;
                    continue stateLoop;
                }
                case 736: {
                    var5++;
                    statePc = 743;
                    continue stateLoop;
                }
                case 737: {
                    if (stackIn_737_0 <= 0) {
                        statePc = 736;
                    } else {
                        statePc = 735;
                    }
                    continue stateLoop;
                }
                case 739: {
                    stackIn_52_0 = md.field_a[var5][2];
                    stackIn_740_0 = stackIn_52_0;
                    if (false) {
                        statePc = 52;
                    } else {
                        statePc = 740;
                    }
                    continue stateLoop;
                }
                case 740: {
                    stackIn_737_0 = stackIn_740_0;
                    statePc = 737;
                    continue stateLoop;
                }
                case 741: {
                    if (stackIn_741_0 >= stackIn_741_1) {
                        statePc = 51;
                    } else {
                        statePc = 739;
                    }
                    continue stateLoop;
                }
                case 743: {
                    stackIn_741_0 = var5;
                    stackIn_741_1 = 100;
                    statePc = 741;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void u(int param0) {
        if (null != oh.field_b) {
            ub.a(-37, oh.field_b);
            oh.field_b = null;
            jj.b(0);
        }
        mi.field_E = si.a(87, 1);
        mh.field_jb = si.a(92, 2);
        mi.field_y = si.a(-117, 3);
        jl.field_u = si.a(-118, 4);
        int var2 = -60 / ((param0 - 39) / 38);
        eg.field_u = si.a(-106, 6);
        md.field_b = si.a(-90, 5);
        bc.field_a = si.a(84, 7);
        ol.a(bb.field_h, md.field_c, (byte) 109);
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 79 / ((15 - param0) / 52);
        if (param1 < 4096) {
            return 2048 > param1 ? sb.field_b[2048 - param1] : -sb.field_b[param1 - 2048];
        }
        return -6145 < (param1 ^ -1) ? -sb.field_b[6144 + -param1] : sb.field_b[param1 + -6144];
    }

    private final boolean a(int param0, int param1, int param2, String param3, int param4) {
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              var6_int = jj.field_b.b(param3);
              param1 = param1 + var6_int / 2;
              ig.a(qc.field_E, param1 - (var6_int + 16), (byte) -110, jj.field_b.field_M - -32, 32 + var6_int, param0 + -jj.field_b.field_M + -16);
              if (param4 == 1) {
                break L1;
              } else {
                this.field_R = 17;
                break L1;
              }
            }
            L2: {
              if (pg.field_n <= -var6_int + param1 - 16) {
                break L2;
              } else {
                if (16 + param1 < pg.field_n) {
                  break L2;
                } else {
                  if ((fi.field_B ^ -1) >= (-jj.field_b.field_M + param0 + -16 ^ -1)) {
                    break L2;
                  } else {
                    if (16 + param0 >= fi.field_B) {
                      if (65535 == param2) {
                        param2 = 16777215;
                        break L2;
                      } else {
                        param2 = 0;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if ((param2 ^ -1) != -65536) {
                break L3;
              } else {
                param2 = 15583488;
                break L3;
              }
            }
            this.b(param4 + -12927, param3, param2, param1 + -2 - jj.field_b.b(param3) / 2, -4 + param0);
            if (param2 != 16777215) {
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if ((sh.field_c ^ -1) != -1) {
                stackIn_16_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("wizardrun.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    private final void t(int param0) {
        try {
            int fieldTemp$0 = 0;
            int incrementValue$1 = 0;
            int incrementValue$2 = 0;
            int incrementValue$3 = 0;
            int[] dupTemp$4 = null;
            int fieldTemp$5 = 0;
            int fieldTemp$6 = 0;
            ob dupTemp$7 = null;
            ob dupTemp$8 = null;
            int fieldTemp$9 = 0;
            int fieldTemp$10 = 0;
            int fieldTemp$11 = 0;
            int fieldTemp$12 = 0;
            ob dupTemp$13 = null;
            ob dupTemp$14 = null;
            int fieldTemp$15 = 0;
            int fieldTemp$16 = 0;
            int fieldTemp$17 = 0;
            int fieldTemp$18 = 0;
            int fieldTemp$19 = 0;
            int fieldTemp$20 = 0;
            int fieldTemp$21 = 0;
            int fieldTemp$22 = 0;
            int fieldTemp$23 = 0;
            ob dupTemp$24 = null;
            ob dupTemp$25 = null;
            int fieldTemp$26 = 0;
            gb stackIn_30_0 = null;
            gb stackIn_31_0 = null;
            int stackIn_31_1 = 0;
            int stackIn_33_2;
            int stackIn_33_3;
            int stackIn_34_2;
            int stackIn_34_3;
            int stackIn_34_4;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_39_1 = 0;
            int stackIn_113_0 = 0;
            int stackIn_113_1 = 0;
            int stackIn_138_0 = 0;
            int stackIn_138_1 = 0;
            int stackIn_323_0 = 0;
            int stackIn_323_1 = 0;
            int stackIn_540_0 = 0;
            int stackIn_540_1 = 0;
            int stackIn_594_0 = 0;
            int stackIn_595_0 = 0;
            int stackIn_595_1 = 0;
            int stackIn_688_0 = 0;
            int stackIn_688_1 = 0;
            int stackIn_759_0 = 0;
            int stackIn_759_1 = 0;
            int stackIn_766_0 = 0;
            int stackIn_767_0 = 0;
            int stackIn_767_1 = 0;
            int stackIn_777_0 = 0;
            int stackIn_789_0 = 0;
            int stackIn_789_1 = 0;
            int stackIn_820_0 = 0;
            int stackIn_855_0 = 0;
            int stackIn_855_1 = 0;
            Throwable caughtException = null;
            Throwable decompiledCaughtException = null;
            int var2 = 0;
            ob var2_ref_ob = null;
            int var3 = 0;
            int var4 = 0;
            byte[] var4_ref_byte__ = null;
            int var5 = 0;
            int var6_int = 0;
            Exception var6 = null;
            int var7 = 0;
            int var8 = 0;
            ob var9 = null;
            ob var10 = null;
            gb var11 = null;
            byte[] var12 = null;
            ob var13 = null;
            ob var14 = null;
            byte[] var15 = null;
            L0: {
              var8 = field_H;
              if (-3 != (sf.field_h ^ -1)) {
                break L0;
              } else {
                if (0 >= qf.field_l) {
                  break L0;
                } else {
                  sf.field_h = 5;
                  break L0;
                }
              }
            }
            L1: {
              if (nl.field_y <= 0) {
                break L1;
              } else {
                nl.field_y = nl.field_y - 1;
                break L1;
              }
            }
            L2: {
              if (sf.field_h == 0) {
                this.field_N = 0;
                this.field_K = pg.field_n;
                this.field_S = fi.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (pg.field_n != this.field_K) {
                  break L4;
                } else {
                  if ((fi.field_B ^ -1) != (this.field_S ^ -1)) {
                    break L4;
                  } else {
                    if ((sh.field_c ^ -1) == -2) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.field_K = pg.field_n;
              this.field_S = fi.field_B;
              this.field_N = -1;
              break L3;
            }
            L5: {
              if (6 != sf.field_h) {
                break L5;
              } else {
                L6: {
                  var11 = a.field_a;
                  var3 = 180 - -var11.field_M;
                  var4 = 4 + (var11.field_B + var11.field_q);
                  var6_int = 320;
                  var5 = jj.field_b.b(cd.field_d);
                  var7 = var4 * 4 + var3;
                  var6_int = var6_int + var5 / 2;
                  if (-16 + -var5 + var6_int >= pg.field_n) {
                    break L6;
                  } else {
                    if ((pg.field_n ^ -1) < (16 + var6_int ^ -1)) {
                      break L6;
                    } else {
                      if ((-jj.field_b.field_M + var7 + -16 ^ -1) <= (fi.field_B ^ -1)) {
                        break L6;
                      } else {
                        if (fi.field_B <= var7 + 16) {
                          if (1 != w.field_c) {
                            break L6;
                          } else {
                            sl.a(6, 10, -127);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                L7: {
                  var6_int = 320;
                  var5 = jj.field_b.b(gf.field_X);
                  var7 = 60 + (var4 / 2 + var3) - -(var4 * 5);
                  var6_int = var6_int + var5 / 2;
                  if ((-var5 + var6_int + -16 ^ -1) <= (pg.field_n ^ -1)) {
                    break L7;
                  } else {
                    if ((pg.field_n ^ -1) < (var6_int + 16 ^ -1)) {
                      break L7;
                    } else {
                      if ((fi.field_B ^ -1) >= (-16 + (-jj.field_b.field_M + var7) ^ -1)) {
                        break L7;
                      } else {
                        if (16 + var7 < fi.field_B) {
                          break L7;
                        } else {
                          if (-2 == (w.field_c ^ -1)) {
                            ei.field_k = 0;
                            qf.field_l = 0;
                            ke.field_u.a(false);
                            ie.field_l.a(false);
                            hi.field_a = -350;
                            sf.field_h = 9;
                            pl.field_A = 0;
                            tb.a(0, true);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  stackIn_30_0 = (gb) (var11);

                  if (-1 == (sg.field_f ^ -1)) {
                    stackIn_31_0 = (gb) ((Object) stackIn_30_0);
                    stackIn_31_1 = 0;
                    break L8;
                  } else {
                    stackIn_31_0 = (gb) ((Object) stackIn_30_0);
                    stackIn_31_1 = 1;
                    break L8;
                  }
                }
                L9: {




                  stackIn_33_2 = -3567;

                  stackIn_33_3 = 0;

                  if (qf.field_l == 0) {
                    stackIn_31_0 = (gb) ((Object) stackIn_31_0);

                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = 0;
                    break L9;
                  } else {
                    stackIn_31_0 = (gb) ((Object) stackIn_31_0);

                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = 1;
                    break L9;
                  }
                }
                ((gb) (Object) stackIn_31_0).b(l.a(stackIn_31_1 != 0, stackIn_34_2, stackIn_34_3 != 0, stackIn_34_4 != 0), 320, var4 * 4 + (var3 + 120), 16777215, -1);
                break L5;
              }
            }
            L10: {
              if (sf.field_h != 9) {
                break L10;
              } else {
                L11: {
                  stackIn_38_0 = param0 + -54;

                  if (dg.b(98)) {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = 0;
                    break L11;
                  } else {
                    stackIn_39_0 = stackIn_38_0;
                    stackIn_39_1 = 1;
                    break L11;
                  }
                }
                L12: {
                  var2 = kd.a(stackIn_39_0, stackIn_39_1 != 0);
                  if (-4 == (var2 ^ -1)) {
                    nl.a(jg.f(param0 ^ 641), true);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (1 != var2) {
                    break L13;
                  } else {
                    L14: {
                      if ((pa.field_c ^ -1) >= -1) {
                        pa.field_c = pa.field_c + 32;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    this.field_N = 0;
                    break L13;
                  }
                }
                this.field_J = true;
                if (var2 == 2) {
                  L15: {
                    if (pa.field_c > 0) {
                      break L15;
                    } else {
                      pa.field_c = pa.field_c + 32;
                      break L15;
                    }
                  }
                  this.field_N = -1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L16: {
              if (5 == sf.field_h) {
                if (-1 == (w.field_c ^ -1)) {
                  break L16;
                } else {
                  if (cb.field_f != -1) {
                    if ((tk.field_a ^ -1) == (cb.field_f ^ -1)) {
                      tk.field_a = -1;
                      break L16;
                    } else {
                      tk.field_a = cb.field_f;
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
              } else {
                tk.field_a = -1;
                break L16;
              }
            }
            L17: {
              if (md.field_d) {
                L18: {
                  if (!pl.field_D) {
                    if (256 <= pa.field_c) {
                      break L18;
                    } else {
                      pa.field_c = pa.field_c + 32;
                      break L18;
                    }
                  } else {
                    L19: {
                      if (-1 <= (pa.field_c ^ -1)) {
                        break L19;
                      } else {
                        pa.field_c = pa.field_c - 32;
                        break L19;
                      }
                    }
                    if (pa.field_c == 0) {
                      pl.field_D = false;
                      md.field_d = false;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L20: while (true) {
                  if (!ae.a(param0 ^ 706)) {
                    break L17;
                  } else {
                    L21: {
                      if ((vk.field_r ^ -1) == -14) {
                        break L21;
                      } else {
                        if (!hi.field_p[84]) {
                          continue L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    pl.field_D = true;
                    continue L20;
                  }
                }
              } else {
                L22: {
                  if (-241 >= (hi.field_a ^ -1)) {
                    hi.field_a = hi.field_a - 8;
                    if (-241 < (hi.field_a ^ -1)) {
                      L23: {
                        if ((qh.field_l ^ -1) != -1) {
                          break L23;
                        } else {
                          if (pg.field_q) {
                            break L23;
                          } else {
                            if (qh.field_g >= 0) {
                              hi.field_a = 240;
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      L24: {
                        if (hi.field_p[84]) {
                          break L24;
                        } else {
                          if (hi.field_p[13]) {
                            break L24;
                          } else {
                            if (sh.field_c == 0) {
                              break L22;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      hi.field_a = -10;
                      break L22;
                    } else {
                      break L22;
                    }
                  } else {
                    if ((hi.field_a ^ -1) >= 999) {
                      break L22;
                    } else {
                      hi.field_a = hi.field_a - 8;
                      break L22;
                    }
                  }
                }
                L25: {
                  if (uc.field_b.b((byte) 55) == null) {
                    break L25;
                  } else {
                    fieldTemp$0 = this.field_M + 1;
                    this.field_M = this.field_M + 1;
                    if (335 == fieldTemp$0) {
                      this.field_M = 0;
                      uc.field_b.b(-40);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
                L26: {
                  if (-1 <= (this.field_I ^ -1)) {
                    break L26;
                  } else {
                    this.field_I = this.field_I - 1;
                    break L26;
                  }
                }
                L27: {
                  if (0 < pa.field_c) {
                    L28: {
                      pa.field_c = pa.field_c + 32;
                      if (256 == pa.field_c) {
                        if ((sf.field_h ^ -1) == -1) {
                          L29: {
                            if (th.field_i != 1) {
                              break L29;
                            } else {
                              sf.field_h = 1;
                              break L29;
                            }
                          }
                          L30: {
                            if ((th.field_i ^ -1) == -4) {
                              sf.field_h = 2;
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          L31: {
                            if (4 != th.field_i) {
                              break L31;
                            } else {
                              sf.field_h = 5;
                              break L31;
                            }
                          }
                          if ((th.field_i ^ -1) == -6) {
                            sf.field_h = 11;
                            break L28;
                          } else {
                            break L28;
                          }
                        } else {
                          L32: {
                            if (sf.field_h != 5) {
                              break L32;
                            } else {
                              if (qf.field_l <= 0) {
                                break L32;
                              } else {
                                if ((th.field_i ^ -1) != -4) {
                                  break L32;
                                } else {
                                  qf.field_l = 0;
                                  sf.field_h = 2;
                                  break L28;
                                }
                              }
                            }
                          }
                          L33: {
                            if (5 == sf.field_h) {
                              qf.field_l = 0;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            if (-3 == (sf.field_h ^ -1)) {
                              th.field_g = null;
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          sf.field_h = 0;
                          if (!this.field_J) {
                            tb.a(0, true);
                            this.field_J = true;
                            sf.field_h = 9;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                      } else {
                        break L28;
                      }
                    }
                    if (pa.field_c < 512) {
                      break L27;
                    } else {
                      pa.field_c = 0;
                      break L27;
                    }
                  } else {
                    if ((sf.field_h ^ -1) != -1) {
                      break L27;
                    } else {
                      if (null != da.field_e) {
                        break L27;
                      } else {
                        if (2 == wi.field_K) {
                          break L27;
                        } else {
                          L35: {
                            if ((og.field_R.length ^ -1) < (rc.field_a ^ -1)) {
                              rf.field_b = rf.field_b - 1;
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (0 > rf.field_b) {
                              rf.field_b = 8;
                              var2 = 0;
                              L37: while (true) {
                                L38: {
                                  if ((var2 ^ -1) <= -26) {
                                    stackIn_113_0 = rc.field_a;
                                    stackIn_113_1 = 1;
                                    break L38;
                                  } else {
                                    pb.field_k = pb.field_k + 1;
                                    stackIn_113_0 = -101;

                                    stackIn_113_1 = pb.field_k ^ -1;

                                    L39: {
                                      if (stackIn_113_0 >= stackIn_113_1) {
                                        pb.field_k = 0;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    md.field_a[pb.field_k][0] = jj.field_b.b(og.field_R[rc.field_a]) * (-13 + var2) / 25 + 177;
                                    md.field_a[pb.field_k][1] = (int)(-Math.random() * (double)jj.field_b.field_M + 208.0 + (double)(32 * rc.field_a));
                                    md.field_a[pb.field_k][2] = 128;
                                    var2++;
                                    continue L37;
                                  }
                                }
                                rc.field_a = stackIn_113_0 + stackIn_113_1;
                                if (!pk.field_s) {
                                  break L36;
                                } else {
                                  tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                                  break L36;
                                }
                              }
                            } else {
                              break L36;
                            }
                          }
                          L40: {
                            var2 = 0;
                            if ((pg.field_n ^ -1) == (le.field_i ^ -1)) {
                              break L40;
                            } else {
                              le.field_i = pg.field_n;
                              var2 = 1;
                              break L40;
                            }
                          }
                          L41: {
                            if (fi.field_B != qj.field_d) {
                              var2 = 1;
                              qj.field_d = fi.field_B;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          L42: {
                            if (-3 < (rc.field_a ^ -1)) {
                              var2 = 0;
                              break L42;
                            } else {
                              break L42;
                            }
                          }
                          L43: {
                            if (w.field_c != 1) {
                              break L43;
                            } else {
                              var2 = 1;
                              break L43;
                            }
                          }
                          L44: {
                            if ((qh.field_g ^ -1) > -1) {
                              break L44;
                            } else {
                              L45: {
                                if (var2 == 0) {
                                  L46: {
                                    if (2 == si.field_h) {
                                      break L46;
                                    } else {
                                      if (-4 != (si.field_h ^ -1)) {
                                        break L45;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                  if (-145 <= (pg.field_n ^ -1)) {
                                    break L45;
                                  } else {
                                    if ((sh.field_c ^ -1) == -2) {
                                      this.a(-114, 2, si.field_h);
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                } else {
                                  si.field_h = -1;
                                  var3 = 208;
                                  var4 = 0;
                                  L47: while (true) {
                                    L48: {
                                      if ((var4 ^ -1) <= (rc.field_a ^ -1)) {
                                        stackIn_138_0 = si.field_h ^ -1;
                                        stackIn_138_1 = -3;
                                        break L48;
                                      } else {
                                        stackIn_138_0 = pg.field_n;

                                        stackIn_138_1 = 27;

                                        L49: {
                                          if (stackIn_138_0 < stackIn_138_1) {
                                            break L49;
                                          } else {
                                            if (pg.field_n > 327) {
                                              break L49;
                                            } else {
                                              if ((fi.field_B ^ -1) > (-24 + var3 ^ -1)) {
                                                break L49;
                                              } else {
                                                if (fi.field_B <= 8 + var3) {
                                                  si.field_h = var4;
                                                  break L49;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var3 += 32;
                                        var4++;
                                        continue L47;
                                      }
                                    }
                                    L50: {
                                      L51: {
                                        L52: {
                                          if (stackIn_138_0 == stackIn_138_1) {
                                            break L52;
                                          } else {
                                            if (3 != si.field_h) {
                                              break L51;
                                            } else {
                                              break L52;
                                            }
                                          }
                                        }
                                        if ((pg.field_n ^ -1) > -145) {
                                          break L51;
                                        } else {
                                          if (-2 != (sh.field_c ^ -1)) {
                                            break L50;
                                          } else {
                                            this.a(-123, 2, si.field_h);
                                            break L45;
                                          }
                                        }
                                      }
                                      if (w.field_c == 1) {
                                        this.a(54, 2, si.field_h);
                                        break L50;
                                      } else {
                                        break L45;
                                      }
                                    }
                                    break L45;
                                  }
                                }
                              }
                              if (0 > si.field_h) {
                                break L44;
                              } else {
                                L53: {
                                  pb.field_k = pb.field_k + 1;
                                  if (pb.field_k < 100) {
                                    break L53;
                                  } else {
                                    pb.field_k = 0;
                                    break L53;
                                  }
                                }
                                L54: {
                                  if (-1 == (pb.field_k % 25 ^ -1)) {
                                    L55: {
                                      md.field_a[0][0] = 161 + -(jj.field_b.b(og.field_R[si.field_h]) / 2);
                                      md.field_a[0][1] = -jj.field_b.field_M / 2 + 208 - -(32 * si.field_h);
                                      if (-3 != (si.field_h ^ -1)) {
                                        break L55;
                                      } else {
                                        md.field_a[0][0] = 27;
                                        break L55;
                                      }
                                    }
                                    L56: {
                                      if (-4 != (si.field_h ^ -1)) {
                                        break L56;
                                      } else {
                                        md.field_a[0][0] = 27;
                                        break L56;
                                      }
                                    }
                                    md.field_a[0][2] = 128;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                                if (12 == pb.field_k % 25) {
                                  L57: {
                                    md.field_a[1][0] = 16 + (jj.field_b.b(og.field_R[si.field_h]) / 2 - -177);
                                    if (si.field_h == 2) {
                                      md.field_a[1][0] = 327;
                                      break L57;
                                    } else {
                                      break L57;
                                    }
                                  }
                                  L58: {
                                    md.field_a[1][1] = si.field_h * 32 + -jj.field_b.field_M / 2 + 208;
                                    if (3 == si.field_h) {
                                      md.field_a[1][0] = 327;
                                      break L58;
                                    } else {
                                      break L58;
                                    }
                                  }
                                  md.field_a[1][2] = 128;
                                  break L44;
                                } else {
                                  break L27;
                                }
                              }
                            }
                          }
                          break L27;
                        }
                      }
                    }
                  }
                }
                L59: {
                  L60: {
                    L61: {
                      if (da.field_e == null) {
                        break L61;
                      } else {
                        if (da.field_e.field_p) {
                          break L60;
                        } else {
                          break L61;
                        }
                      }
                    }
                    if (!this.field_P) {
                      L62: {
                        if (0 >= se.field_a) {
                          break L62;
                        } else {
                          se.field_a = se.field_a / 2;
                          break L62;
                        }
                      }
                      if (0 >= se.field_a) {
                        break L59;
                      } else {
                        se.field_a = se.field_a - 1;
                        break L59;
                      }
                    } else {
                      break L60;
                    }
                  }
                  L63: {
                    if (256 <= se.field_a) {
                      break L63;
                    } else {
                      se.field_a = se.field_a / 2 + 128;
                      break L63;
                    }
                  }
                  L64: {
                    if (256 > se.field_a) {
                      se.field_a = se.field_a + 1;
                      break L64;
                    } else {
                      break L64;
                    }
                  }
                  if (256 != se.field_a) {
                    break L59;
                  } else {
                    L65: {
                      if (!this.field_P) {
                        break L65;
                      } else {
                        if (wi.field_K != 1) {
                          this.field_P = false;
                          da.field_e = new ph();
                          rf.field_b = 0;
                          rc.field_a = 0;
                          return;
                        } else {
                          break L65;
                        }
                      }
                    }
                    L66: {
                      this.field_P = false;
                      if (sf.field_h == 2) {
                        th.field_g = null;
                        break L66;
                      } else {
                        break L66;
                      }
                    }
                    da.field_e = null;
                    sf.field_h = 0;
                    break L59;
                  }
                }
                L67: {
                  if (ki.field_E == null) {
                    break L67;
                  } else {
                    if (!ki.field_E.field_b) {
                      break L67;
                    } else {
                      di.a((byte) 60);
                      break L67;
                    }
                  }
                }
                var2 = 0;
                L68: while (true) {
                  L69: {
                    if (100 <= var2) {
                      if (!this.field_L) {
                        stackIn_323_0 = param0;
                        stackIn_323_1 = 640;
                        break L69;
                      } else {
                        var2 = pg.field_n / 32;
                        var3 = -(fi.field_B / 32) - -14;
                        L70: while (true) {
                          if (!ae.a(-75)) {
                            break L17;
                          } else {
                            L71: {
                              if ((vk.field_r ^ -1) == -14) {
                                this.field_L = false;
                                wi.field_K = 1;
                                break L71;
                              } else {
                                break L71;
                              }
                            }
                            L72: {
                              if (-42 == (vk.field_r ^ -1)) {
                                var15 = new byte[900];
                                var12 = var15;
                                var4_ref_byte__ = var12;
                                var5 = 0;
                                var6_int = 0;
                                L73: while (true) {
                                  if (-301 >= (var6_int ^ -1)) {
                                    fl.field_T[qh.field_l][ql.field_c] = var15;
                                    try {
                                      L74: {
                                        var5 = 0;
                                        bk.a(var4_ref_byte__, var15.length, true, new File("level" + qh.field_l + ql.field_c + ".dat"));
                                        break L74;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L75: {
                                        var6 = (Exception) (Object) decompiledCaughtException;
                                        System.out.println(var6);
                                        break L75;
                                      }
                                    }
                                    break L72;
                                  } else {
                                    incrementValue$1 = var5;
                                    var5++;
                                    var4_ref_byte__[incrementValue$1] = (byte)tc.field_l.field_j[var6_int];
                                    incrementValue$2 = var5;
                                    var5++;
                                    var4_ref_byte__[incrementValue$2] = (byte)tc.field_l.field_f[var6_int];
                                    incrementValue$3 = var5;
                                    var5++;
                                    var4_ref_byte__[incrementValue$3] = (byte)tc.field_l.field_a[var6_int];
                                    var6_int++;
                                    continue L73;
                                  }
                                }
                              } else {
                                break L72;
                              }
                            }
                            L76: {
                              if (16 == vk.field_r) {
                                tc.field_l.field_a[var3 * 20 + var2] = 1;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                            L77: {
                              if ((vk.field_r ^ -1) != -18) {
                                break L77;
                              } else {
                                tc.field_l.field_a[var2 + var3 * 20] = 2;
                                break L77;
                              }
                            }
                            L78: {
                              if (-19 != (vk.field_r ^ -1)) {
                                break L78;
                              } else {
                                tc.field_l.field_a[var2 - -(var3 * 20)] = 3;
                                break L78;
                              }
                            }
                            L79: {
                              if (-20 == (vk.field_r ^ -1)) {
                                tc.field_l.field_a[20 * var3 + var2] = 4;
                                break L79;
                              } else {
                                break L79;
                              }
                            }
                            L80: {
                              if (20 == vk.field_r) {
                                tc.field_l.field_a[var2 - -(20 * var3)] = 5;
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                            L81: {
                              if ((vk.field_r ^ -1) != -36) {
                                break L81;
                              } else {
                                tc.field_l.field_j[var2 - -(20 * var3)] = 0;
                                tc.field_l.field_f[20 * var3 + var2] = 0;
                                tc.field_l.field_a[20 * var3 + var2] = 0;
                                break L81;
                              }
                            }
                            L82: {
                              if ((vk.field_r ^ -1) == -33) {
                                tc.field_l.field_j[var2 - -(20 * var3)] = 1;
                                tc.field_l.field_f[var2 + var3 * 20] = 1;
                                break L82;
                              } else {
                                break L82;
                              }
                            }
                            L83: {
                              if (-34 != (vk.field_r ^ -1)) {
                                break L83;
                              } else {
                                tc.field_l.field_j[20 * var3 + var2] = 2;
                                tc.field_l.field_f[20 * var3 + var2] = 1;
                                break L83;
                              }
                            }
                            L84: {
                              if (34 != vk.field_r) {
                                break L84;
                              } else {
                                tc.field_l.field_j[20 * var3 + var2] = 3;
                                tc.field_l.field_f[var2 - -(var3 * 20)] = 1;
                                break L84;
                              }
                            }
                            L85: {
                              if (vk.field_r == 48) {
                                tc.field_l.field_j[var2 + var3 * 20] = 4;
                                tc.field_l.field_f[var2 + var3 * 20] = 0;
                                break L85;
                              } else {
                                break L85;
                              }
                            }
                            L86: {
                              if (-50 == (vk.field_r ^ -1)) {
                                tc.field_l.field_j[var3 * 20 + var2] = 5;
                                tc.field_l.field_f[var2 - -(var3 * 20)] = 0;
                                break L86;
                              } else {
                                break L86;
                              }
                            }
                            L87: {
                              if (50 == vk.field_r) {
                                tc.field_l.field_j[20 * var3 + var2] = 6;
                                tc.field_l.field_f[var2 + var3 * 20] = 0;
                                break L87;
                              } else {
                                break L87;
                              }
                            }
                            L88: {
                              if ((vk.field_r ^ -1) != -65) {
                                break L88;
                              } else {
                                tc.field_l.field_j[var3 * 20 + var2] = 7;
                                tc.field_l.field_f[var3 * 20 + var2] = 0;
                                break L88;
                              }
                            }
                            L89: {
                              if ((vk.field_r ^ -1) == -66) {
                                tc.field_l.field_j[var2 - -(20 * var3)] = 8;
                                tc.field_l.field_f[20 * var3 + var2] = 0;
                                break L89;
                              } else {
                                break L89;
                              }
                            }
                            L90: {
                              if ((vk.field_r ^ -1) != -67) {
                                break L90;
                              } else {
                                tc.field_l.field_j[var3 * 20 + var2] = 9;
                                tc.field_l.field_f[20 * var3 + var2] = 0;
                                break L90;
                              }
                            }
                            L91: {
                              if (-68 == (vk.field_r ^ -1)) {
                                tc.field_l.field_j[var2 - -(20 * var3)] = 10;
                                tc.field_l.field_f[var2 - -(20 * var3)] = 0;
                                break L91;
                              } else {
                                break L91;
                              }
                            }
                            L92: {
                              if (-69 == (vk.field_r ^ -1)) {
                                tc.field_l.field_j[var2 + var3 * 20] = 11;
                                tc.field_l.field_f[20 * var3 + var2] = 0;
                                break L92;
                              } else {
                                break L92;
                              }
                            }
                            L93: {
                              if ((vk.field_r ^ -1) != -70) {
                                break L93;
                              } else {
                                tc.field_l.field_j[var2 - -(var3 * 20)] = 12;
                                tc.field_l.field_f[var2 - -(var3 * 20)] = 0;
                                break L93;
                              }
                            }
                            L94: {
                              if (vk.field_r != 43) {
                                break L94;
                              } else {
                                L95: {
                                  hi.field_c = hi.field_c + 1;
                                  ql.field_c = ql.field_c + 1;
                                  if ((ql.field_c ^ -1) != -6) {
                                    break L95;
                                  } else {
                                    ga.field_e = fb.field_a;
                                    if (tl.field_e) {
                                      mi.field_D.a(true, -101, ga.field_e);
                                      break L95;
                                    } else {
                                      break L95;
                                    }
                                  }
                                }
                                L96: {
                                  if (ql.field_c >= 6) {
                                    hi.field_c = hi.field_c - ql.field_c;
                                    wg.field_b = wg.field_b + 6;
                                    qh.field_l = qh.field_l + 1;
                                    ql.field_c = 0;
                                    if (5 >= qh.field_l) {
                                      vk.a((byte) -75);
                                      break L96;
                                    } else {
                                      wg.field_b = wg.field_b - qh.field_l * 6;
                                      me.field_f = me.field_f - 30;
                                      qh.field_l = 5;
                                      break L96;
                                    }
                                  } else {
                                    break L96;
                                  }
                                }
                                ni.b(7530);
                                if (2 != qh.field_l) {
                                  break L94;
                                } else {
                                  L97: {
                                    if (-1 <= (hl.field_a ^ -1)) {
                                      break L97;
                                    } else {
                                      if (e.a(param0 + -751)) {
                                        break L97;
                                      } else {
                                        break L94;
                                      }
                                    }
                                  }
                                  this.s(208);
                                  break L94;
                                }
                              }
                            }
                            if ((vk.field_r ^ -1) == -43) {
                              L98: {
                                ql.field_c = ql.field_c - 1;
                                hi.field_c = hi.field_c + 1;
                                if ((ql.field_c ^ -1) != -5) {
                                  break L98;
                                } else {
                                  vk.a((byte) -59);
                                  break L98;
                                }
                              }
                              L99: {
                                if ((ql.field_c ^ -1) <= -1) {
                                  break L99;
                                } else {
                                  L100: {
                                    ql.field_c = 5;
                                    qh.field_l = qh.field_l - 1;
                                    if ((qh.field_l ^ -1) > -1) {
                                      qh.field_l = 0;
                                      break L100;
                                    } else {
                                      vk.a((byte) -118);
                                      break L100;
                                    }
                                  }
                                  ga.field_e = fb.field_a;
                                  if (!tl.field_e) {
                                    break L99;
                                  } else {
                                    mi.field_D.a(true, param0 + -740, ga.field_e);
                                    break L99;
                                  }
                                }
                              }
                              ni.b(7530);
                              continue L70;
                            } else {
                              continue L70;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_323_0 = 0;

                      stackIn_323_1 = md.field_a[var2][2];

                      L101: {
                        if (stackIn_323_0 >= stackIn_323_1) {
                          break L101;
                        } else {
                          dupTemp$4 = md.field_a[var2];
                          dupTemp$4[2] = dupTemp$4[2] - 5;
                          break L101;
                        }
                      }
                      var2++;
                      continue L68;
                    }
                  }
                  L102: {
                    if (stackIn_323_0 == stackIn_323_1) {
                      break L102;
                    } else {
                      field_D = (o[]) null;
                      break L102;
                    }
                  }
                  L103: {
                    if (null != da.field_e) {
                      this.field_I = 5;
                      sf.field_h = 3;
                      L104: while (true) {
                        if (!ae.a(-120)) {
                          L105: {
                            if (da.field_e == null) {
                              break L105;
                            } else {
                              da.field_e.a(param0 ^ -642);
                              break L105;
                            }
                          }
                          if (null != da.field_e) {
                            break L103;
                          } else {
                            sf.field_h = 0;
                            return;
                          }
                        } else {
                          if (-14 != (vk.field_r ^ -1)) {
                            if ((vk.field_r ^ -1) == -103) {
                              L106: {
                                if ((da.field_e.field_a ^ -1) == -3) {
                                  this.a(19, -3, 2);
                                  break L106;
                                } else {
                                  break L106;
                                }
                              }
                              if (-4 == (da.field_e.field_a ^ -1)) {
                                this.a(54, -3, 3);
                                continue L104;
                              } else {
                                continue L104;
                              }
                            } else {
                              if ((vk.field_r ^ -1) != -104) {
                                if (null != da.field_e) {
                                  da.field_e.b(0);
                                  continue L104;
                                } else {
                                  continue L104;
                                }
                              } else {
                                L107: {
                                  if (da.field_e.field_a != 2) {
                                    break L107;
                                  } else {
                                    this.a(-127, 3, 2);
                                    break L107;
                                  }
                                }
                                if (da.field_e.field_a != 3) {
                                  continue L104;
                                } else {
                                  this.a(93, 3, 3);
                                  continue L104;
                                }
                              }
                            }
                          } else {
                            da.field_e.field_p = true;
                            continue L104;
                          }
                        }
                      }
                    } else {
                      L108: {
                        if ((sg.field_f ^ -1) >= (ia.field_n ^ -1)) {
                          break L108;
                        } else {
                          ia.field_n = sg.field_f;
                          break L108;
                        }
                      }
                      L109: {
                        if ((wi.field_K ^ -1) != -2) {
                          break L109;
                        } else {
                          L110: while (true) {
                            if (!ae.a(-65)) {
                              L111: {
                                if ((sf.field_h ^ -1) == -1) {
                                  wg.field_e = jl.field_w;
                                  break L111;
                                } else {
                                  break L111;
                                }
                              }
                              L112: {
                                if (1 != sf.field_h) {
                                  break L112;
                                } else {
                                  wg.field_e = bk.field_b;
                                  break L112;
                                }
                              }
                              L113: {
                                if ((sf.field_h ^ -1) == -3) {
                                  wg.field_e = wh.field_d;
                                  break L113;
                                } else {
                                  break L113;
                                }
                              }
                              L114: {
                                if (5 != sf.field_h) {
                                  break L114;
                                } else {
                                  wg.field_e = l.field_M;
                                  break L114;
                                }
                              }
                              L115: {
                                if (-1 > (tj.field_I ^ -1)) {
                                  tj.field_I = tj.field_I + 5;
                                  break L115;
                                } else {
                                  break L115;
                                }
                              }
                              L116: {
                                if (4 == sf.field_h) {
                                  wg.field_e = we.field_b;
                                  break L116;
                                } else {
                                  break L116;
                                }
                              }
                              L117: {
                                if ((tj.field_I ^ -1) != -256) {
                                  break L117;
                                } else {
                                  L118: {
                                    th.field_g = null;
                                    od.field_k = 0;
                                    if (pl.field_A >= qh.field_l) {
                                      break L118;
                                    } else {
                                      if ((qh.field_l ^ -1) >= -2) {
                                        break L118;
                                      } else {
                                        wg.field_b = wg.field_b - 3 * qh.field_l;
                                        hi.field_c = hi.field_c - 3 * qh.field_l;
                                        qh.field_l = 0;
                                        break L118;
                                      }
                                    }
                                  }
                                  L119: {
                                    L120: {
                                      wi.field_K = 2;
                                      fa.field_a = null;
                                      hi.field_c = hi.field_c - ql.field_c;
                                      ql.field_c = 0;
                                      vk.a((byte) -43);
                                      ni.b(param0 ^ 8170);
                                      if (-1 != (qh.field_l ^ -1)) {
                                        break L120;
                                      } else {
                                        if ((ql.field_c ^ -1) != -1) {
                                          break L120;
                                        } else {
                                          hi.field_a = 580;
                                          bb.field_j = ef.field_F;
                                          break L119;
                                        }
                                      }
                                    }
                                    hi.field_a = 580;
                                    bb.field_j = wg.field_f + (1 + qh.field_l) + eh.field_i + (1 + ql.field_c);
                                    break L119;
                                  }
                                  L121: {
                                    var9 = new ob();
                                    var13 = var9;
                                    var13.field_b = 2;
                                    if (4 != qh.field_l) {
                                      break L121;
                                    } else {
                                      if (-6 == (ql.field_c ^ -1)) {
                                        var13.field_b = var13.field_b + 1;
                                        break L121;
                                      } else {
                                        break L121;
                                      }
                                    }
                                  }
                                  L122: {
                                    var9.field_a = 2;
                                    ii.field_e[od.field_k].a(9147, 0, var13);
                                    od.field_k = od.field_k + 1;
                                    vj.c(param0 + -762);
                                    da.field_g = false;
                                    if (-1 == (qh.field_l ^ -1)) {
                                      this.field_Q = 0;
                                      pg.field_q = true;
                                      this.field_R = 1;
                                      break L122;
                                    } else {
                                      pg.field_q = false;
                                      break L122;
                                    }
                                  }
                                  gd.field_b = false;
                                  ia.field_n = 0;
                                  cd.field_e = 100;
                                  ol.field_e = false;
                                  if (!tl.field_e) {
                                    break L117;
                                  } else {
                                    if (pg.field_q) {
                                      mi.field_D.a(true, -115, bh.field_e);
                                      break L117;
                                    } else {
                                      break L117;
                                    }
                                  }
                                }
                              }
                              L123: {
                                if (510 < tj.field_I) {
                                  tj.field_I = 0;
                                  break L123;
                                } else {
                                  break L123;
                                }
                              }
                              cd.field_e = cd.field_e - 1;
                              if (-1 < (cd.field_e ^ -1)) {
                                cd.field_e = 0;
                                break L109;
                              } else {
                                break L109;
                              }
                            } else {
                              L124: {
                                if (13 != vk.field_r) {
                                  break L124;
                                } else {
                                  if (-1 != (sf.field_h ^ -1)) {
                                    this.field_P = true;
                                    if ((sf.field_h ^ -1) != -7) {
                                      break L103;
                                    } else {
                                      this.field_P = false;
                                      tb.a(0, true);
                                      this.field_J = true;
                                      sf.field_h = 9;
                                      return;
                                    }
                                  } else {
                                    break L124;
                                  }
                                }
                              }
                              L125: {
                                if ((vk.field_r ^ -1) != -97) {
                                  break L125;
                                } else {
                                  if ((sh.field_c ^ -1) != -1) {
                                    break L125;
                                  } else {
                                    L126: {
                                      if (2 != sf.field_h) {
                                        break L126;
                                      } else {
                                        if (!e.a(param0 + -755)) {
                                          this.field_N = this.field_N - 1;
                                          if (this.field_N < 0) {
                                            this.field_N = 0;
                                            break L126;
                                          } else {
                                            break L126;
                                          }
                                        } else {
                                          this.field_N = this.field_N - 1;
                                          if (-1 < (this.field_N ^ -1)) {
                                            this.field_N = 0;
                                            break L126;
                                          } else {
                                            break L126;
                                          }
                                        }
                                      }
                                    }
                                    L127: {
                                      if (-6 == (sf.field_h ^ -1)) {
                                        L128: {
                                          if (e.a(param0 ^ -739)) {
                                            break L128;
                                          } else {
                                            if (-1 <= (qf.field_l ^ -1)) {
                                              this.field_N = 0;
                                              break L127;
                                            } else {
                                              break L128;
                                            }
                                          }
                                        }
                                        this.field_N = this.field_N - 1;
                                        if ((this.field_N ^ -1) <= -1) {
                                          break L127;
                                        } else {
                                          this.field_N = 0;
                                          break L127;
                                        }
                                      } else {
                                        break L127;
                                      }
                                    }
                                    L129: {
                                      if (-12 != (sf.field_h ^ -1)) {
                                        break L129;
                                      } else {
                                        if (qh.field_l <= 0) {
                                          break L129;
                                        } else {
                                          if (-6 < (tj.field_I ^ -1)) {
                                            qh.field_l = qh.field_l - 1;
                                            wg.field_b = wg.field_b - 6;
                                            break L129;
                                          } else {
                                            break L129;
                                          }
                                        }
                                      }
                                    }
                                    if (-2 != (sf.field_h ^ -1)) {
                                      break L125;
                                    } else {
                                      this.field_N = 0;
                                      break L125;
                                    }
                                  }
                                }
                              }
                              L130: {
                                if (97 != vk.field_r) {
                                  break L130;
                                } else {
                                  if (0 == sh.field_c) {
                                    L131: {
                                      if ((sf.field_h ^ -1) != -3) {
                                        break L131;
                                      } else {
                                        if (e.a(param0 + -727)) {
                                          this.field_N = this.field_N + 1;
                                          if (-2 > (this.field_N ^ -1)) {
                                            this.field_N = 1;
                                            break L131;
                                          } else {
                                            break L131;
                                          }
                                        } else {
                                          this.field_N = this.field_N + 1;
                                          if (-4 > (this.field_N ^ -1)) {
                                            this.field_N = 3;
                                            break L131;
                                          } else {
                                            break L131;
                                          }
                                        }
                                      }
                                    }
                                    L132: {
                                      if (sf.field_h == 5) {
                                        L133: {
                                          if (e.a(param0 + -751)) {
                                            break L133;
                                          } else {
                                            if (0 < qf.field_l) {
                                              break L133;
                                            } else {
                                              this.field_N = 0;
                                              break L132;
                                            }
                                          }
                                        }
                                        this.field_N = this.field_N + 1;
                                        if ((this.field_N ^ -1) >= -2) {
                                          break L132;
                                        } else {
                                          this.field_N = 1;
                                          break L132;
                                        }
                                      } else {
                                        break L132;
                                      }
                                    }
                                    L134: {
                                      if (11 != sf.field_h) {
                                        break L134;
                                      } else {
                                        if (5 <= qh.field_l) {
                                          break L134;
                                        } else {
                                          if (5 <= tj.field_I) {
                                            break L134;
                                          } else {
                                            qh.field_l = qh.field_l + 1;
                                            me.field_f = me.field_f - 6;
                                            break L134;
                                          }
                                        }
                                      }
                                    }
                                    if (-2 == (sf.field_h ^ -1)) {
                                      this.field_N = 0;
                                      break L130;
                                    } else {
                                      break L130;
                                    }
                                  } else {
                                    break L130;
                                  }
                                }
                              }
                              if ((sf.field_h ^ -1) == -1) {
                                L135: {
                                  if (98 == vk.field_r) {
                                    L136: {
                                      if (si.field_h == -1) {
                                        si.field_h = 0;
                                        break L136;
                                      } else {
                                        break L136;
                                      }
                                    }
                                    fieldTemp$5 = si.field_h - 1;
                                    si.field_h = si.field_h - 1;
                                    if (-1 < (fieldTemp$5 ^ -1)) {
                                      si.field_h = si.field_h + rc.field_a;
                                      break L135;
                                    } else {
                                      break L135;
                                    }
                                  } else {
                                    break L135;
                                  }
                                }
                                L137: {
                                  if ((vk.field_r ^ -1) != -100) {
                                    break L137;
                                  } else {
                                    fieldTemp$6 = si.field_h + 1;
                                    si.field_h = si.field_h + 1;
                                    if ((rc.field_a ^ -1) >= (fieldTemp$6 ^ -1)) {
                                      si.field_h = si.field_h - rc.field_a;
                                      break L137;
                                    } else {
                                      break L137;
                                    }
                                  }
                                }
                                L138: {
                                  if (-97 == (vk.field_r ^ -1)) {
                                    this.a(89, -1, si.field_h);
                                    break L138;
                                  } else {
                                    break L138;
                                  }
                                }
                                L139: {
                                  if (vk.field_r == 97) {
                                    this.a(param0 + -614, 1, si.field_h);
                                    break L139;
                                  } else {
                                    break L139;
                                  }
                                }
                                L140: {
                                  if (102 != vk.field_r) {
                                    break L140;
                                  } else {
                                    this.a(91, -3, si.field_h);
                                    break L140;
                                  }
                                }
                                L141: {
                                  if (vk.field_r == 103) {
                                    this.a(param0 + -530, 3, si.field_h);
                                    break L141;
                                  } else {
                                    break L141;
                                  }
                                }
                                if ((vk.field_r ^ -1) != -85) {
                                  continue L110;
                                } else {
                                  this.a(param0 ^ 760, 0, si.field_h);
                                  continue L110;
                                }
                              } else {
                                if (-1 > (pa.field_c ^ -1)) {
                                  continue L110;
                                } else {
                                  if (84 != vk.field_r) {
                                    continue L110;
                                  } else {
                                    if (-12 != (sf.field_h ^ -1)) {
                                      if (-3 == (sf.field_h ^ -1)) {
                                        continue L110;
                                      } else {
                                        if (sf.field_h != 5) {
                                          pa.field_c = 32;
                                          continue L110;
                                        } else {
                                          continue L110;
                                        }
                                      }
                                    } else {
                                      if (qh.field_l > pl.field_A) {
                                        continue L110;
                                      } else {
                                        if ((tj.field_I ^ -1) <= -6) {
                                          continue L110;
                                        } else {
                                          L142: {
                                            hi.field_c = hi.field_c + qh.field_g;
                                            qh.field_g = 0;
                                            nk.field_T = 0;
                                            od.field_k = 0;
                                            if (0 >= qh.field_l) {
                                              gd.field_b = false;
                                              break L142;
                                            } else {
                                              gd.field_b = true;
                                              me.field_f = me.field_f + 5;
                                              qh.field_g = 5;
                                              break L142;
                                            }
                                          }
                                          L143: {
                                            tj.field_I = 5;
                                            if ((4 & ti.field_a) <= 0) {
                                              break L143;
                                            } else {
                                              nk.field_T = 400;
                                              break L143;
                                            }
                                          }
                                          sj.field_l = 0;
                                          continue L110;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L144: {
                        if (2 == wi.field_K) {
                          L145: {
                            L146: {
                              L147: {
                                L148: {
                                  if (ql.field_c != 0) {
                                    break L148;
                                  } else {
                                    if ((qh.field_l ^ -1) == -1) {
                                      break L147;
                                    } else {
                                      break L148;
                                    }
                                  }
                                }
                                if (sg.field_f > hg.field_a) {
                                  break L146;
                                } else {
                                  break L147;
                                }
                              }
                              if ((ql.field_c ^ -1) != -1) {
                                break L145;
                              } else {
                                if (qh.field_l != 0) {
                                  break L145;
                                } else {
                                  if (qh.field_g >= 5) {
                                    break L145;
                                  } else {
                                    if (qh.field_g <= 0) {
                                      break L145;
                                    } else {
                                      break L146;
                                    }
                                  }
                                }
                              }
                            }
                            if (!pg.field_q) {
                              L149: {
                                L150: {
                                  qh.field_g = qh.field_g + 1;
                                  if (ql.field_c != 0) {
                                    break L150;
                                  } else {
                                    if (-1 == (qh.field_l ^ -1)) {
                                      break L149;
                                    } else {
                                      break L150;
                                    }
                                  }
                                }
                                L151: {
                                  if (hg.field_a >= 10000) {
                                    hg.field_a = hg.field_a + 10000;
                                    break L151;
                                  } else {
                                    break L151;
                                  }
                                }
                                L152: {
                                  if ((hg.field_a ^ -1) != -5001) {
                                    break L152;
                                  } else {
                                    hg.field_a = 10000;
                                    break L152;
                                  }
                                }
                                L153: {
                                  if (-2001 == (hg.field_a ^ -1)) {
                                    hg.field_a = 5000;
                                    break L153;
                                  } else {
                                    break L153;
                                  }
                                }
                                L154: {
                                  if (1000 == hg.field_a) {
                                    hg.field_a = 2000;
                                    break L154;
                                  } else {
                                    break L154;
                                  }
                                }
                                if (hg.field_a > 500) {
                                  break L149;
                                } else {
                                  hg.field_a = 1000;
                                  break L149;
                                }
                              }
                              ic.field_a = ic.field_a + 1;
                              var2 = 0;
                              L155: while (true) {
                                if (var2 >= 5) {
                                  break L145;
                                } else {
                                  fi.field_x = 0;
                                  ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                  ii.field_e[od.field_k].field_f.a(-92, ii.field_e[0].field_f);
                                  ii.field_e[od.field_k].field_f.field_a = 0;
                                  ii.field_e[od.field_k].field_h = -1;
                                  dupTemp$7 = ii.field_e[od.field_k].field_f;
                                  dupTemp$7.field_b = dupTemp$7.field_b + 80;
                                  ii.field_e[od.field_k].field_e = var2 * 20;
                                  fi.field_x = 0;
                                  od.field_k = od.field_k + 1;
                                  ii.field_e[od.field_k].a(param0 + 8507, 1, ii.field_e[0].field_i);
                                  ii.field_e[od.field_k].field_f.a(param0 + -746, ii.field_e[0].field_f);
                                  ii.field_e[od.field_k].field_f.field_a = 0;
                                  ii.field_e[od.field_k].field_h = 1;
                                  dupTemp$8 = ii.field_e[od.field_k].field_f;
                                  dupTemp$8.field_b = dupTemp$8.field_b + 80;
                                  ii.field_e[od.field_k].field_e = 20 * var2;
                                  od.field_k = od.field_k + 1;
                                  var2++;
                                  continue L155;
                                }
                              }
                            } else {
                              break L145;
                            }
                          }
                          L156: {
                            L157: {
                              if (pg.field_q) {
                                break L157;
                              } else {
                                var2 = 0;
                                var3 = 0;
                                L158: while (true) {
                                  if (od.field_k <= var3) {
                                    if (var2 != 0) {
                                      break L157;
                                    } else {
                                      if (0 > qh.field_g) {
                                        break L157;
                                      } else {
                                        if (-1 == (tj.field_I ^ -1)) {
                                          L159: {
                                            if (5 != qh.field_l) {
                                              break L159;
                                            } else {
                                              if (ql.field_c <= 5) {
                                                break L159;
                                              } else {
                                                this.field_R = 11;
                                                pg.field_q = true;
                                                ql.a(1, 255, 0);
                                                break L157;
                                              }
                                            }
                                          }
                                          tj.field_I = tj.field_I + 5;
                                          break L157;
                                        } else {
                                          break L157;
                                        }
                                      }
                                    }
                                  } else {
                                    stackIn_540_0 = ii.field_e[var3].field_B;

                                    stackIn_540_1 = 2;

                                    L160: {
                                      if (stackIn_540_0 <= stackIn_540_1) {
                                        break L160;
                                      } else {
                                        var2 = 1;
                                        break L160;
                                      }
                                    }
                                    var3++;
                                    continue L158;
                                  }
                                }
                              }
                            }
                            stackIn_540_0 = dd.field_m;
                            stackIn_540_1 = 2;
                            break L156;
                          }
                          L161: {
                            if (stackIn_540_0 < stackIn_540_1) {
                              break L161;
                            } else {
                              L162: {
                                if (hi.field_p[66]) {
                                  ke.field_w = true;
                                  break L162;
                                } else {
                                  break L162;
                                }
                              }
                              L163: {
                                if (hi.field_p[67]) {
                                  ke.field_w = false;
                                  break L163;
                                } else {
                                  break L163;
                                }
                              }
                              if (ke.field_w) {
                                return;
                              } else {
                                L164: {
                                  if (hi.field_p[55]) {
                                    tc.field_j = true;
                                    tj.field_I = 5;
                                    pg.field_q = false;
                                    ql.field_c = 4;
                                    break L164;
                                  } else {
                                    break L164;
                                  }
                                }
                                L165: {
                                  if (!hi.field_p[40]) {
                                    break L165;
                                  } else {
                                    pg.field_q = false;
                                    tc.field_j = true;
                                    tj.field_I = 5;
                                    break L165;
                                  }
                                }
                                L166: {
                                  if (!hi.field_p[39]) {
                                    break L166;
                                  } else {
                                    if (5 <= qh.field_l) {
                                      break L166;
                                    } else {
                                      pg.field_q = false;
                                      tj.field_I = 5;
                                      ql.field_c = 6;
                                      tc.field_j = true;
                                      break L166;
                                    }
                                  }
                                }
                                L167: {
                                  if (!hi.field_p[68]) {
                                    break L167;
                                  } else {
                                    break L167;
                                  }
                                }
                                L168: {
                                  if (!hi.field_p[56]) {
                                    break L168;
                                  } else {
                                    if (qh.field_g > 50) {
                                      qh.field_g = 5;
                                      tc.field_j = true;
                                      break L168;
                                    } else {
                                      qh.field_g = 100;
                                      tc.field_j = true;
                                      break L168;
                                    }
                                  }
                                }
                                if (!hi.field_p[38]) {
                                  break L161;
                                } else {
                                  tc.field_j = false;
                                  sg.field_f = (int)(Math.random() * 1000.0 + 500.0);
                                  break L161;
                                }
                              }
                            }
                          }
                          L169: {
                            if (50 >= qh.field_g) {
                              break L169;
                            } else {
                              if (tc.field_j) {
                                qh.field_g = 100;
                                break L169;
                              } else {
                                break L169;
                              }
                            }
                          }
                          L170: {
                            if (0 < tj.field_I) {
                              tj.field_I = tj.field_I + 5;
                              break L170;
                            } else {
                              break L170;
                            }
                          }
                          L171: {
                            if ((tj.field_I ^ -1) >= -511) {
                              break L171;
                            } else {
                              tj.field_I = 0;
                              break L171;
                            }
                          }
                          L172: {
                            L173: {
                              L174: {
                                if (!pg.field_q) {
                                  break L174;
                                } else {
                                  L175: {
                                    if ((this.field_R ^ -1) != -12) {
                                      break L175;
                                    } else {
                                      L176: {
                                        if (-3 <= (ii.field_e[0].field_i.field_a ^ -1)) {
                                          L177: {
                                            if (2 >= ii.field_e[0].field_i.field_b) {
                                              break L177;
                                            } else {
                                              sc.field_m.field_b = -1;
                                              break L177;
                                            }
                                          }
                                          if (ii.field_e[0].field_i.field_b >= 2) {
                                            break L176;
                                          } else {
                                            sc.field_m.field_b = 1;
                                            break L176;
                                          }
                                        } else {
                                          sc.field_m.field_b = -1;
                                          break L176;
                                        }
                                      }
                                      ii.field_e[0].a((byte) -123, tc.field_l);
                                      if (ii.field_e[0].field_i.field_b != 2) {
                                        break L175;
                                      } else {
                                        if (2 == ii.field_e[0].field_i.field_a) {
                                          this.field_R = 12;
                                          this.field_Q = 0;
                                          if (!tl.field_e) {
                                            break L175;
                                          } else {
                                            mi.field_D.a(true, param0 ^ -727, qj.field_e);
                                            break L175;
                                          }
                                        } else {
                                          break L175;
                                        }
                                      }
                                    }
                                  }
                                  L178: {
                                    if ((this.field_R ^ -1) == -13) {
                                      L179: {
                                        if (this.field_Q < 90) {
                                          break L179;
                                        } else {
                                          var10 = new ob();
                                          var2_ref_ob = var10;
                                          var2_ref_ob.field_b = 16 + (int)(4.0 * Math.random());
                                          var2_ref_ob.field_a = (int)(Math.random() * 4.0) + 11;
                                          ii.field_e[od.field_k].a(param0 + 8507, 20, var10);
                                          ii.field_e[od.field_k].field_f.field_b = (int)(Math.random() * 240.0);
                                          ii.field_e[od.field_k].field_f.field_a = (int)(Math.random() * 240.0);
                                          ii.field_e[od.field_k].field_w = 4;
                                          od.field_k = od.field_k + 1;
                                          break L179;
                                        }
                                      }
                                      L180: {
                                        if (90 != this.field_Q) {
                                          break L180;
                                        } else {
                                          L181: {
                                            stackIn_594_0 = 0;

                                            if (pk.field_s) {
                                              stackIn_595_0 = stackIn_594_0;
                                              stackIn_595_1 = 0;
                                              break L181;
                                            } else {
                                              stackIn_595_0 = stackIn_594_0;
                                              stackIn_595_1 = 1;
                                              break L181;
                                            }
                                          }
                                          if (stackIn_595_0 == stackIn_595_1) {
                                            tl.field_a.a(nl.field_q[1], 100, ee.field_p * 256 / 100);
                                            break L180;
                                          } else {
                                            break L180;
                                          }
                                        }
                                      }
                                      fieldTemp$9 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (-101 > (fieldTemp$9 ^ -1)) {
                                        this.field_R = 13;
                                        this.field_Q = 0;
                                        break L178;
                                      } else {
                                        break L178;
                                      }
                                    } else {
                                      break L178;
                                    }
                                  }
                                  L182: {
                                    if (this.field_R == 13) {
                                      L183: {
                                        if (50 != this.field_Q) {
                                          break L183;
                                        } else {
                                          if (pk.field_s) {
                                            tl.field_a.a(nl.field_q[2], 100, 256 * ee.field_p / 100);
                                            break L183;
                                          } else {
                                            break L183;
                                          }
                                        }
                                      }
                                      fieldTemp$10 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if ((fieldTemp$10 ^ -1) >= -101) {
                                        break L182;
                                      } else {
                                        this.field_R = 14;
                                        this.field_Q = 0;
                                        break L182;
                                      }
                                    } else {
                                      break L182;
                                    }
                                  }
                                  L184: {
                                    if ((this.field_R ^ -1) != -15) {
                                      break L184;
                                    } else {
                                      fieldTemp$11 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 < fieldTemp$11) {
                                        this.field_Q = 0;
                                        this.field_R = 15;
                                        break L184;
                                      } else {
                                        break L184;
                                      }
                                    }
                                  }
                                  L185: {
                                    if (-16 != (this.field_R ^ -1)) {
                                      break L185;
                                    } else {
                                      fieldTemp$12 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$12) {
                                        break L185;
                                      } else {
                                        this.field_R = 16;
                                        this.field_Q = 0;
                                        break L185;
                                      }
                                    }
                                  }
                                  L186: {
                                    if (16 != this.field_R) {
                                      break L186;
                                    } else {
                                      L187: {
                                        if (this.field_Q != 75) {
                                          break L187;
                                        } else {
                                          if (-1 > (qh.field_g ^ -1)) {
                                            ic.field_a = ic.field_a - 64000;
                                            hi.field_c = hi.field_c + 1;
                                            qh.field_g = qh.field_g - 1;
                                            sg.field_f = sg.field_f + 1000;
                                            var2 = qh.field_g % 5;
                                            fi.field_x = 0;
                                            ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(-113, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = -1;
                                            dupTemp$13 = ii.field_e[od.field_k].field_f;
                                            dupTemp$13.field_b = dupTemp$13.field_b + 790;
                                            ii.field_e[od.field_k].field_e = var2 * 20;
                                            od.field_k = od.field_k + 1;
                                            fi.field_x = 0;
                                            ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(-98, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = 1;
                                            dupTemp$14 = ii.field_e[od.field_k].field_f;
                                            dupTemp$14.field_b = dupTemp$14.field_b + 790;
                                            ii.field_e[od.field_k].field_e = 20 * var2;
                                            this.field_Q = 70;
                                            od.field_k = od.field_k + 1;
                                            break L187;
                                          } else {
                                            break L187;
                                          }
                                        }
                                      }
                                      fieldTemp$15 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$15 <= 100) {
                                        break L186;
                                      } else {
                                        this.field_R = 17;
                                        this.field_Q = 0;
                                        break L186;
                                      }
                                    }
                                  }
                                  L188: {
                                    if (-18 == (this.field_R ^ -1)) {
                                      fieldTemp$16 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (200 < fieldTemp$16) {
                                        hi.field_c = hi.field_c + (qh.field_g + 1);
                                        me.field_f = me.field_f - 36;
                                        ic.field_a = ic.field_a + (ql.field_c + 6 * qh.field_l);
                                        qh.field_g = -1;
                                        ql.field_c = 0;
                                        qh.field_l = 6;
                                        break L188;
                                      } else {
                                        break L188;
                                      }
                                    } else {
                                      break L188;
                                    }
                                  }
                                  L189: {
                                    if (this.field_R == 1) {
                                      this.field_Q = this.field_Q + 1;
                                      if (0 == tj.field_I) {
                                        this.field_Q = 0;
                                        this.field_R = 2;
                                        break L189;
                                      } else {
                                        break L189;
                                      }
                                    } else {
                                      break L189;
                                    }
                                  }
                                  L190: {
                                    if ((this.field_R ^ -1) != -3) {
                                      break L190;
                                    } else {
                                      fieldTemp$17 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 < fieldTemp$17) {
                                        this.field_Q = 0;
                                        this.field_R = 3;
                                        break L190;
                                      } else {
                                        break L190;
                                      }
                                    }
                                  }
                                  L191: {
                                    if (this.field_R != 3) {
                                      break L191;
                                    } else {
                                      L192: {
                                        if (-6 != (this.field_Q ^ -1)) {
                                          break L192;
                                        } else {
                                          if (pk.field_s) {
                                            tl.field_a.a(nl.field_q[0], 100, 256 * ee.field_p / 100);
                                            break L192;
                                          } else {
                                            break L192;
                                          }
                                        }
                                      }
                                      fieldTemp$18 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (-101 > (fieldTemp$18 ^ -1)) {
                                        this.field_Q = 0;
                                        this.field_R = 4;
                                        break L191;
                                      } else {
                                        break L191;
                                      }
                                    }
                                  }
                                  L193: {
                                    if (-5 == (this.field_R ^ -1)) {
                                      fieldTemp$19 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if ((fieldTemp$19 ^ -1) < -101) {
                                        this.field_R = 5;
                                        this.field_Q = 0;
                                        break L193;
                                      } else {
                                        break L193;
                                      }
                                    } else {
                                      break L193;
                                    }
                                  }
                                  L194: {
                                    if (-6 != (this.field_R ^ -1)) {
                                      break L194;
                                    } else {
                                      fieldTemp$20 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$20 <= 200) {
                                        break L194;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 6;
                                        break L194;
                                      }
                                    }
                                  }
                                  L195: {
                                    if (-7 == (this.field_R ^ -1)) {
                                      fieldTemp$21 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (200 >= fieldTemp$21) {
                                        break L195;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 7;
                                        break L195;
                                      }
                                    } else {
                                      break L195;
                                    }
                                  }
                                  L196: {
                                    if (7 != this.field_R) {
                                      break L196;
                                    } else {
                                      fieldTemp$22 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$22) {
                                        break L196;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 8;
                                        break L196;
                                      }
                                    }
                                  }
                                  L197: {
                                    if (8 != this.field_R) {
                                      break L197;
                                    } else {
                                      fieldTemp$23 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$23 > 100) {
                                        this.field_R = 9;
                                        this.field_Q = 0;
                                        break L197;
                                      } else {
                                        break L197;
                                      }
                                    }
                                  }
                                  L198: {
                                    if (this.field_R != 9) {
                                      break L198;
                                    } else {
                                      L199: {
                                        if (50 != this.field_Q) {
                                          break L199;
                                        } else {
                                          if (tl.field_e) {
                                            mi.field_D.a(true, param0 ^ -740, ga.field_e);
                                            break L199;
                                          } else {
                                            break L199;
                                          }
                                        }
                                      }
                                      L200: {
                                        if (75 != this.field_Q) {
                                          break L200;
                                        } else {
                                          if (-6 >= (qh.field_g ^ -1)) {
                                            break L200;
                                          } else {
                                            wg.field_b = wg.field_b - 1;
                                            qh.field_g = qh.field_g + 1;
                                            fi.field_x = 0;
                                            var2 = qh.field_g;
                                            ii.field_e[od.field_k].a(param0 ^ 8507, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(param0 ^ -751, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = -1;
                                            dupTemp$24 = ii.field_e[od.field_k].field_f;
                                            dupTemp$24.field_b = dupTemp$24.field_b + 40;
                                            ii.field_e[od.field_k].field_e = var2 % 3 * 20;
                                            fi.field_x = 0;
                                            od.field_k = od.field_k + 1;
                                            ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(-124, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = 1;
                                            dupTemp$25 = ii.field_e[od.field_k].field_f;
                                            dupTemp$25.field_b = dupTemp$25.field_b + 40;
                                            ii.field_e[od.field_k].field_e = 20 * (var2 % 3);
                                            od.field_k = od.field_k + 1;
                                            this.field_Q = 70;
                                            break L200;
                                          }
                                        }
                                      }
                                      fieldTemp$26 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$26) {
                                        break L198;
                                      } else {
                                        this.field_R = 10;
                                        this.field_Q = 0;
                                        break L198;
                                      }
                                    }
                                  }
                                  L201: {
                                    if (this.field_R == 10) {
                                      pg.field_q = false;
                                      hi.field_a = 580;
                                      bb.field_j = l.field_Q;
                                      break L201;
                                    } else {
                                      break L201;
                                    }
                                  }
                                  var2 = 0;
                                  L202: while (true) {
                                    if (od.field_k <= var2) {
                                      break L174;
                                    } else {
                                      stackIn_688_0 = -1;

                                      stackIn_688_1 = var2 ^ -1;

                                      L203: {
                                        L204: {
                                          if (stackIn_688_0 != stackIn_688_1) {
                                            break L204;
                                          } else {
                                            if (!pg.field_q) {
                                              break L204;
                                            } else {
                                              break L203;
                                            }
                                          }
                                        }
                                        ii.field_e[var2].a((byte) -123, tc.field_l);
                                        break L203;
                                      }
                                      var2++;
                                      continue L202;
                                    }
                                  }
                                }
                              }
                              if (!pg.field_q) {
                                stackIn_688_0 = tj.field_I;
                                stackIn_688_1 = 255;
                                break L173;
                              } else {
                                break L172;
                              }
                            }
                            if (stackIn_688_0 == stackIn_688_1) {
                              L205: {
                                od.field_k = 0;
                                ql.field_c = ql.field_c + 1;
                                wg.field_b = wg.field_b + 1;
                                if (-6 != (ql.field_c ^ -1)) {
                                  break L205;
                                } else {
                                  if (-1 != (qh.field_l ^ -1)) {
                                    break L205;
                                  } else {
                                    if (!ol.field_e) {
                                      ql.a(1, 254, 1);
                                      break L205;
                                    } else {
                                      break L205;
                                    }
                                  }
                                }
                              }
                              L206: {
                                fi.field_x = 0;
                                if (5 == ql.field_c) {
                                  L207: {
                                    w.field_b = 0;
                                    ga.field_e = fb.field_a;
                                    if (!tl.field_e) {
                                      break L207;
                                    } else {
                                      mi.field_D.a(true, -127, ga.field_e);
                                      break L207;
                                    }
                                  }
                                  da.field_g = false;
                                  break L206;
                                } else {
                                  break L206;
                                }
                              }
                              L208: {
                                if (ql.field_c < 6) {
                                  break L208;
                                } else {
                                  L209: {
                                    if (da.field_g) {
                                      break L209;
                                    } else {
                                      L210: {
                                        if (qh.field_l == 0) {
                                          ql.a(1, 250, 5);
                                          break L210;
                                        } else {
                                          break L210;
                                        }
                                      }
                                      L211: {
                                        if (1 == qh.field_l) {
                                          ql.a(1, 249, 6);
                                          break L211;
                                        } else {
                                          break L211;
                                        }
                                      }
                                      L212: {
                                        if (-3 != (qh.field_l ^ -1)) {
                                          break L212;
                                        } else {
                                          ql.a(1, 248, 7);
                                          break L212;
                                        }
                                      }
                                      L213: {
                                        if (-4 != (qh.field_l ^ -1)) {
                                          break L213;
                                        } else {
                                          ql.a(1, 247, 8);
                                          break L213;
                                        }
                                      }
                                      if (-5 == (qh.field_l ^ -1)) {
                                        ql.a(1, 246, 9);
                                        break L209;
                                      } else {
                                        break L209;
                                      }
                                    }
                                  }
                                  L214: {
                                    if (!gd.field_b) {
                                      L215: {
                                        if (2 != qh.field_l) {
                                          break L215;
                                        } else {
                                          ql.a(param0 ^ 641, 252, 3);
                                          break L215;
                                        }
                                      }
                                      if (qh.field_l != 4) {
                                        break L214;
                                      } else {
                                        ql.a(1, 251, 4);
                                        break L214;
                                      }
                                    } else {
                                      break L214;
                                    }
                                  }
                                  L216: {
                                    if ((qh.field_l ^ -1) != -1) {
                                      break L216;
                                    } else {
                                      ql.a(1, 253, 2);
                                      break L216;
                                    }
                                  }
                                  L217: {
                                    hi.field_c = hi.field_c - (ql.field_c + -6);
                                    qh.field_l = qh.field_l + 1;
                                    ql.field_c = 0;
                                    if (pl.field_A < qh.field_l) {
                                      ke.field_u.a(new dc(0, qh.field_l + -1, 0, 0, 0, 0), false);
                                      pl.field_A = qh.field_l;
                                      break L217;
                                    } else {
                                      break L217;
                                    }
                                  }
                                  if (-7 >= (qh.field_l ^ -1)) {
                                    break L208;
                                  } else {
                                    vk.a((byte) -71);
                                    break L208;
                                  }
                                }
                              }
                              L218: {
                                hi.field_a = 580;
                                bb.field_j = wg.field_f + (qh.field_l - -1) + eh.field_i + (1 + ql.field_c);
                                if (-1 >= qh.field_g) {
                                  break L218;
                                } else {
                                  L219: {
                                    if (qh.field_l < 6) {
                                      ni.b(7530);
                                      break L219;
                                    } else {
                                      break L219;
                                    }
                                  }
                                  L220: {
                                    var14 = new ob();
                                    var14.field_a = 2;
                                    var14.field_b = 2;
                                    if ((qh.field_l ^ -1) != -5) {
                                      break L220;
                                    } else {
                                      if ((ql.field_c ^ -1) == -6) {
                                        var14.field_b = var14.field_b + 1;
                                        break L220;
                                      } else {
                                        break L220;
                                      }
                                    }
                                  }
                                  ii.field_e[od.field_k].a(9147, 0, var14);
                                  od.field_k = od.field_k + 1;
                                  vj.c(69);
                                  ia.field_n = 0;
                                  cd.field_e = 100;
                                  break L218;
                                }
                              }
                              if ((qh.field_l ^ -1) != -3) {
                                break L172;
                              } else {
                                L221: {
                                  if (0 >= hl.field_a) {
                                    break L221;
                                  } else {
                                    if (!e.a(param0 ^ -766)) {
                                      break L172;
                                    } else {
                                      break L221;
                                    }
                                  }
                                }
                                this.s(208);
                                break L172;
                              }
                            } else {
                              break L172;
                            }
                          }
                          L222: {
                            if ((qh.field_g ^ -1) <= -1) {
                              break L222;
                            } else {
                              if ((hi.field_a ^ -1) > 349) {
                                tj.field_I = 100;
                                this.s(208);
                                break L222;
                              } else {
                                break L222;
                              }
                            }
                          }
                          L223: {
                            sc.field_m.field_d = false;
                            sc.field_m.field_f = false;
                            sc.field_m.field_b = 0;
                            if (!pg.field_q) {
                              break L223;
                            } else {
                              if (0 != qh.field_l) {
                                break L223;
                              } else {
                                if ((ql.field_c ^ -1) == -1) {
                                  L224: while (true) {
                                    L225: {
                                      if (!ae.a(125)) {
                                        stackIn_759_0 = w.field_c ^ -1;
                                        stackIn_759_1 = -2;
                                        break L225;
                                      } else {
                                        stackIn_759_0 = 13;

                                        stackIn_759_1 = vk.field_r;

                                        L226: {
                                          if (stackIn_759_0 == stackIn_759_1) {
                                            break L226;
                                          } else {
                                            if ((vk.field_r ^ -1) == -85) {
                                              break L226;
                                            } else {
                                              continue L224;
                                            }
                                          }
                                        }
                                        L227: {
                                          bb.field_j = cc.field_b;
                                          hi.field_a = 580;
                                          pg.field_q = false;
                                          if (!tl.field_e) {
                                            break L227;
                                          } else {
                                            mi.field_D.a(true, -93, ga.field_e);
                                            break L227;
                                          }
                                        }
                                        me.field_f = me.field_f - qh.field_g;
                                        wg.field_b = wg.field_b - 5;
                                        qh.field_g = 5;
                                        continue L224;
                                      }
                                    }
                                    if (stackIn_759_0 == stackIn_759_1) {
                                      pg.field_q = false;
                                      me.field_f = me.field_f - qh.field_g;
                                      hi.field_a = 580;
                                      wg.field_b = wg.field_b - 5;
                                      qh.field_g = 5;
                                      bb.field_j = cc.field_b;
                                      if (!tl.field_e) {
                                        break L223;
                                      } else {
                                        mi.field_D.a(true, -86, ga.field_e);
                                        break L223;
                                      }
                                    } else {
                                      break L223;
                                    }
                                  }
                                } else {
                                  break L223;
                                }
                              }
                            }
                          }
                          if (0 != tj.field_I) {
                            break L144;
                          } else {
                            L228: {
                              stackIn_766_0 = 0;

                              if (pg.field_q) {
                                stackIn_767_0 = stackIn_766_0;
                                stackIn_767_1 = 0;
                                break L228;
                              } else {
                                stackIn_767_0 = stackIn_766_0;
                                stackIn_767_1 = 1;
                                break L228;
                              }
                            }
                            L229: {
                              if (stackIn_767_0 == stackIn_767_1) {
                                break L229;
                              } else {
                                L230: while (true) {
                                  L231: {
                                    if (!ae.a(88)) {
                                      stackIn_789_0 = hi.field_a;
                                      stackIn_789_1 = -350;
                                      break L231;
                                    } else {
                                      L232: {
                                        if (-50 == (vk.field_r ^ -1)) {
                                          L233: {
                                            if (pk.field_s) {
                                              stackIn_777_0 = 0;
                                              break L233;
                                            } else {
                                              stackIn_777_0 = 1;
                                              break L233;
                                            }
                                          }
                                          pk.field_s = stackIn_777_0 != 0;
                                          break L232;
                                        } else {
                                          if (vk.field_r != 70) {
                                            break L232;
                                          } else {
                                            if (tl.field_e) {
                                              tl.field_e = false;
                                              mi.field_D.d(-94);
                                              break L232;
                                            } else {
                                              tl.field_e = true;
                                              mi.field_D.a(true, -101, ga.field_e);
                                              break L232;
                                            }
                                          }
                                        }
                                      }
                                      if (13 != vk.field_r) {
                                        continue L230;
                                      } else {
                                        this.field_P = true;
                                        stackIn_789_0 = -2;

                                        stackIn_789_1 = wi.field_K ^ -1;

                                        L234: {
                                          if (stackIn_789_0 != stackIn_789_1) {
                                            break L234;
                                          } else {
                                            if (sf.field_h == 0) {
                                              this.field_P = false;
                                              break L234;
                                            } else {
                                              break L234;
                                            }
                                          }
                                        }
                                        L235: {
                                          if (sf.field_h == 6) {
                                            this.field_P = false;
                                            tb.a(0, true);
                                            sf.field_h = 9;
                                            this.field_J = true;
                                            break L235;
                                          } else {
                                            break L235;
                                          }
                                        }
                                        return;
                                      }
                                    }
                                  }
                                  L236: {
                                    if (stackIn_789_0 > stackIn_789_1) {
                                      break L236;
                                    } else {
                                      L237: {
                                        if (nk.field_T >= 300) {
                                          break L237;
                                        } else {
                                          if (sj.field_l >= 500) {
                                            break L237;
                                          } else {
                                            sj.field_l = sj.field_l + 1;
                                            break L237;
                                          }
                                        }
                                      }
                                      L238: {
                                        uc.field_g = uc.field_g + 1;
                                        if (!hi.field_p[96]) {
                                          break L238;
                                        } else {
                                          sc.field_m.field_b = -1;
                                          if (-26 < (nk.field_T ^ -1)) {
                                            nk.field_T = 50;
                                            sj.field_l = 0;
                                            nk.field_T = nk.field_T + 1;
                                            break L238;
                                          } else {
                                            break L238;
                                          }
                                        }
                                      }
                                      L239: {
                                        if (-41 <= (uc.field_g ^ -1)) {
                                          break L239;
                                        } else {
                                          uc.field_g = uc.field_g - 40;
                                          break L239;
                                        }
                                      }
                                      L240: {
                                        if (hi.field_p[97]) {
                                          L241: {
                                            if ((nk.field_T ^ -1) > -26) {
                                              nk.field_T = 50;
                                              nk.field_T = nk.field_T + 1;
                                              sj.field_l = 0;
                                              break L241;
                                            } else {
                                              break L241;
                                            }
                                          }
                                          sc.field_m.field_b = 1;
                                          break L240;
                                        } else {
                                          break L240;
                                        }
                                      }
                                      L242: {
                                        L243: {
                                          if (hi.field_p[nf.field_d]) {
                                            break L243;
                                          } else {
                                            if (!hi.field_p[98]) {
                                              break L242;
                                            } else {
                                              break L243;
                                            }
                                          }
                                        }
                                        sc.field_m.field_f = true;
                                        if (-101 < (nk.field_T ^ -1)) {
                                          break L242;
                                        } else {
                                          if ((nk.field_T ^ -1) <= -151) {
                                            break L242;
                                          } else {
                                            sj.field_l = 0;
                                            nk.field_T = 250;
                                            break L242;
                                          }
                                        }
                                      }
                                      L244: {
                                        if (hi.field_p[hh.field_S]) {
                                          break L244;
                                        } else {
                                          if (!hi.field_p[83]) {
                                            break L236;
                                          } else {
                                            break L244;
                                          }
                                        }
                                      }
                                      sc.field_m.field_d = true;
                                      if (50 > nk.field_T) {
                                        break L236;
                                      } else {
                                        if (-101 >= (nk.field_T ^ -1)) {
                                          break L236;
                                        } else {
                                          nk.field_T = 100;
                                          sj.field_l = 0;
                                          break L236;
                                        }
                                      }
                                    }
                                  }
                                  L245: {
                                    if (!il.field_e) {
                                      stackIn_820_0 = 0;
                                      break L245;
                                    } else {
                                      stackIn_820_0 = 1;
                                      break L245;
                                    }
                                  }
                                  var3 = stackIn_820_0;
                                  var2 = 0;
                                  L246: while (true) {
                                    L247: {
                                      if ((var2 ^ -1) <= (od.field_k ^ -1)) {
                                        L248: {
                                          if (!il.field_e) {
                                            break L248;
                                          } else {
                                            L249: {
                                              if (0 >= hi.field_a) {
                                                ge.field_f = ge.field_f + 1;
                                                break L249;
                                              } else {
                                                break L249;
                                              }
                                            }
                                            L250: {
                                              if ((ql.field_c ^ -1) != -6) {
                                                break L250;
                                              } else {
                                                if (-2 != (qh.field_l ^ -1)) {
                                                  break L250;
                                                } else {
                                                  if (hl.field_a > 0) {
                                                    break L250;
                                                  } else {
                                                    if (-371 == (ge.field_f ^ -1)) {
                                                      ge.field_f = ge.field_f + 1;
                                                      bb.field_j = i.field_d;
                                                      hi.field_a = 580;
                                                      break L250;
                                                    } else {
                                                      break L250;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (375 < ge.field_f) {
                                              var4 = od.field_k;
                                              var2 = 0;
                                              L251: while (true) {
                                                if ((var4 ^ -1) >= (var2 ^ -1)) {
                                                  break L248;
                                                } else {
                                                  stackIn_855_0 = 21;

                                                  stackIn_855_1 = ii.field_e[var2].field_B;

                                                  L252: {
                                                    if (stackIn_855_0 == stackIn_855_1) {
                                                      ii.field_e[var2].field_k = 1;
                                                      break L252;
                                                    } else {
                                                      break L252;
                                                    }
                                                  }
                                                  var2++;
                                                  continue L251;
                                                }
                                              }
                                            } else {
                                              break L248;
                                            }
                                          }
                                        }
                                        L253: {
                                          if (var3 != 0) {
                                            break L253;
                                          } else {
                                            if (il.field_e) {
                                              break L253;
                                            } else {
                                              ra.a(2);
                                              break L253;
                                            }
                                          }
                                        }
                                        stackIn_855_0 = -1;
                                        stackIn_855_1 = od.field_k;
                                        break L247;
                                      } else {
                                        stackIn_855_0 = 2;

                                        stackIn_855_1 = ii.field_e[var2].field_B;

                                        L254: {
                                          if (stackIn_855_0 >= stackIn_855_1) {
                                            break L254;
                                          } else {
                                            if (-22 == (ii.field_e[var2].field_B ^ -1)) {
                                              break L254;
                                            } else {
                                              if (44 == ii.field_e[var2].field_B) {
                                                break L254;
                                              } else {
                                                var3 = 1;
                                                break L254;
                                              }
                                            }
                                          }
                                        }
                                        L255: {
                                          L256: {
                                            if (349 <= (hi.field_a ^ -1)) {
                                              break L256;
                                            } else {
                                              if (0 > qh.field_g) {
                                                break L256;
                                              } else {
                                                break L255;
                                              }
                                            }
                                          }
                                          ii.field_e[var2].a((byte) -123, tc.field_l);
                                          break L255;
                                        }
                                        var2++;
                                        continue L246;
                                      }
                                    }
                                    var2 = stackIn_855_0 + stackIn_855_1;
                                    L257: while (true) {
                                      if ((var2 ^ -1) > -1) {
                                        break L229;
                                      } else {
                                        L258: {
                                          if (ii.field_e[var2].field_k != 1) {
                                            break L258;
                                          } else {
                                            od.field_k = od.field_k - 1;
                                            ii.field_e[var2].field_w = ii.field_e[od.field_k].field_w;
                                            ii.field_e[var2].field_o = ii.field_e[od.field_k].field_o;
                                            ii.field_e[var2].field_z = ii.field_e[od.field_k].field_z;
                                            ii.field_e[var2].field_n = ii.field_e[od.field_k].field_n;
                                            ii.field_e[var2].field_B = ii.field_e[od.field_k].field_B;
                                            ii.field_e[var2].field_x = ii.field_e[od.field_k].field_x;
                                            ii.field_e[var2].field_e = ii.field_e[od.field_k].field_e;
                                            ii.field_e[var2].field_i.a(-116, ii.field_e[od.field_k].field_i);
                                            ii.field_e[var2].field_f.a(-89, ii.field_e[od.field_k].field_f);
                                            ii.field_e[var2].field_h = ii.field_e[od.field_k].field_h;
                                            ii.field_e[var2].field_d = ii.field_e[od.field_k].field_d;
                                            ii.field_e[var2].field_k = ii.field_e[od.field_k].field_k;
                                            ii.field_e[var2].field_p = ii.field_e[od.field_k].field_p;
                                            ii.field_e[var2].field_r = ii.field_e[od.field_k].field_r;
                                            ii.field_e[var2].field_s = ii.field_e[od.field_k].field_s;
                                            ii.field_e[var2].field_y = ii.field_e[od.field_k].field_y;
                                            ii.field_e[var2].field_A = ii.field_e[od.field_k].field_A;
                                            ii.field_e[var2].field_q = ii.field_e[od.field_k].field_q;
                                            break L258;
                                          }
                                        }
                                        var2--;
                                        continue L257;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L144;
                          }
                        } else {
                          break L144;
                        }
                      }
                      return;
                    }
                  }
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        String var6 = null;
        if (param1 == null) {
            return;
        }
        try {
            var6 = wg.a("<col", 0, "<", param1);
            int var7 = -9 % ((22 - param3) / 52);
            jj.field_b.b(var6, param4, -1 + param0, 0, -1);
            jj.field_b.b(var6, param4, 1 + param0, 0, -1);
            jj.field_b.b(var6, param4 - 1, param0, 0, -1);
            jj.field_b.b(var6, 1 + param4, param0, 0, -1);
            jj.field_b.b(param1, param4, param0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wizardrun.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_34_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_15_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = field_H;
        try {
          L0: {
            if ((param6 ^ -1) <= (param2 ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) >= (1 + param6 ^ -1)) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if ((param3 ^ -1) >= (param6 + 5 ^ -1)) {
                    break L1;
                  } else {
                    if ((param4 ^ -1) == (param5 ^ -1)) {
                      break L1;
                    } else {
                      var7_int = (param4 >> -417938591) + ((param5 >> -16643615) - -(param4 & param5 & 1));
                      var8 = param6;
                      var9 = param5;
                      var10 = param4;
                      var11 = param6;
                      L2: while (true) {
                        L3: {
                          if (var11 >= param3) {
                            wizardrun.a(param0, param1, param2, var8, var9, param5, param6);
                            stackIn_34_0 = param0;
                            break L3;
                          } else {
                            var12 = sj.field_m[var11];
                            stackIn_34_0 = param0;

                            L4: {
                              if (stackIn_34_0) {
                                stackIn_27_0 = ug.field_I[var12];
                                break L4;
                              } else {
                                stackIn_27_0 = td.field_c[var12];
                                break L4;
                              }
                            }
                            L5: {
                              var13 = stackIn_27_0;
                              if (var7_int >= var13) {
                                if ((var10 ^ -1) <= (var13 ^ -1)) {
                                  break L5;
                                } else {
                                  var10 = var13;
                                  break L5;
                                }
                              } else {
                                sj.field_m[var11] = sj.field_m[var8];
                                incrementValue$0 = var8;
                                var8++;
                                sj.field_m[incrementValue$0] = var12;
                                if (var13 >= var9) {
                                  break L5;
                                } else {
                                  var9 = var13;
                                  break L5;
                                }
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                        wizardrun.a(stackIn_34_0, (byte) 11, param2, param3, param4, var10, var8);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L6: while (true) {
                  stackIn_12_0 = var7_int;
                  L7: while (true) {
                    if (stackIn_12_0 <= param6) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var8 = param6;
                      L8: while (true) {
                        if (var8 >= var7_int) {
                          var7_int--;
                          continue L6;
                        } else {
                          var9 = sj.field_m[var8];
                          var10 = sj.field_m[1 + var8];
                          stackOut_15_0 = uh.a(var10, var9, param0, (byte) -54);
                          stackIn_12_0 = stackOut_15_0 ? 1 : 0;
                          stackIn_16_0 = stackOut_15_0;
                          L9: {
                            if (!stackIn_16_0) {
                              break L9;
                            } else {
                              sj.field_m[var8] = var10;
                              sj.field_m[1 + var8] = var9;
                              break L9;
                            }
                          }
                          var8++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var7), "wizardrun.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = field_H;
        this.a(11, false, 8, 10, false, 9, param0, 0);
        c.a(22050, false, 10);
        wh.field_k = c.a(ld.field_g, (java.awt.Component) ((Object) field_G), 0, 512);
        pc.field_d = c.a(ld.field_g, (java.awt.Component) ((Object) field_G), 1, 22050);
        tl.field_a = new vi();
        wh.field_k.a(tl.field_a);
        mi.field_D = new fl();
        mi.field_D.a(128, 9, (byte) 108);
        pc.field_d.a(mi.field_D);
        hg.field_a = 500;
        hi.field_c = hi.field_c - sg.field_f * 64;
        wg.field_b = wg.field_b - ql.field_c;
        me.field_f = me.field_f + qh.field_l * 6;
        qh.field_l = 0;
        sg.field_f = 0;
        ia.field_n = 0;
        oe.field_d = new ol[16];
        ql.field_c = 0;
        for (var2 = 0; 16 > var2; var2++) {
            oe.field_d[var2] = new ol();
        }
        ia.field_n = oe.field_d[0].field_a;
        this.a(false, true, true, true, false);
    }

    public static void c(boolean param0) {
        field_D = null;
        field_G = null;
        field_O = null;
        if (!param0) {
            return;
        }
        field_F = null;
    }

    public final void init() {
        this.a(12, (byte) 49, "wizardrun");
    }

    private final void b(int param0, String param1, int param2, int param3, int param4) {
        jj.field_b.b(param1, param3 - 1, param4, 1377125, 1377125);
        jj.field_b.b(param1, param3, -1 + param4, 1377125, 1377125);
        if (param0 != -12926) {
            return;
        }
        try {
            jj.field_b.b(param1, param3 - 1, 1 + param4, 1377125, 1377125);
            jj.field_b.b(param1, param3 + 1, -1 + param4, 1377125, 1377125);
            jj.field_b.b(param1, -1 + param3, param4 + -1, 1377125, -1);
            jj.field_b.b(param1, param3, param4 - 2, 1377125, -1);
            jj.field_b.b(param1, param3 - 2, param4, 1377125, -1);
            jj.field_b.b(param1, param3, param4, param2, 1377125);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wizardrun.GB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0) {
        if (ki.field_E != null) {
            di.a((byte) 60);
        }
        if (wh.field_k != null) {
            wh.field_k.f();
        }
        if (!(null == pc.field_d)) {
            pc.field_d.f();
        }
        if (param0) {
            return;
        }
        ck.a((byte) 84);
    }

    final void d(int param0) {
        int var3 = field_H;
        if (param0 != 7069) {
            field_E = -28;
        }
        wizardrun.c(true);
        ra.c(114);
        oi.e(param0 + -6962);
        lk.a(param0 ^ -7070);
        oj.a((byte) 100);
        mk.a(-7241);
        mj.a(13214);
        oa.a(true);
        ve.a(true);
        ic.a(true);
        hj.a((byte) -62);
        w.a(-91);
        id.a(0);
        u.n(-18084);
        sb.a(param0 + -6516);
        da.b(113);
        ud.a(240);
        tf.b(4286);
        ta.b(param0 ^ -7070);
        ed.a();
        kl.a(param0 + 15706);
        t.a((byte) 102);
        rl.b(param0 ^ -32304);
        va.g((byte) 118);
        d.a(-5309);
        me.a((byte) -31);
        bl.a(false);
        ni.a(36);
        n.a(-1);
        ld.a((byte) -122);
        oh.a(21100);
        kj.a((byte) 64);
        wc.a(param0 ^ 7071);
        hg.a(0);
        cb.a(param0 ^ 7127);
        ci.a(false);
        tl.a((byte) -99);
        md.a((byte) -97);
        df.a((byte) 75);
        uc.a((byte) 37);
        ui.a(true);
        qi.b(false);
        na.b(0);
        cd.a(false);
        ad.a(-111);
        si.a((byte) -92);
        hi.b(param0 + -37603);
        fl.c(91);
        ol.a(false);
        eg.a(param0 + -7133);
        jk.a(param0 ^ -7150);
        ob.a(12523);
        tg.a(true);
        c.d();
        ph.e(0);
        wl.b((byte) 81);
        gi.a(false);
        ne.c(-1);
        bd.c(1);
        td.a(param0 + -7065);
        sd.a(0);
        uh.a(8192);
        mg.h((byte) -102);
        e.a((byte) -2);
        ab.a(1);
        vk.b(true);
        wf.a();
        he.c(-28471);
        ue.a(param0 + -7069);
        pi.a(32348);
        oc.a((byte) 124);
        bk.a(2);
        v.a(102);
        vd.a();
        rf.a((byte) 25);
        s.a(540);
        rj.c(28);
        ec.a(param0 + -7115);
        wi.h((byte) 117);
        kk.j((byte) 120);
        hk.e(false);
        kb.l(1);
        mh.e(true);
        nk.h(-1);
        ki.g((byte) -121);
        qc.g(-6664);
        od.a(23285);
        ih.b(0);
        pc.b(1);
        hl.a(true);
        nl.d(110);
        rk.a(param0 + -7070);
        jf.a(false);
        ge.a(true);
        ee.d(-21880);
        qj.a(-6145);
        ii.a(1000);
        i.a((byte) 43);
        aj.a();
        nc.a();
        el.a();
        qh.b((byte) -25);
        pa.a(-49);
        sl.e(-1);
        th.a((byte) 92);
        fi.d((byte) -101);
        sg.b((byte) 111);
        sk.f(100);
        fh.b((byte) -8);
        lc.a(param0 ^ -7105);
        ml.e(-86);
        ti.c((byte) -80);
        lj.a((byte) -60);
        rd.a((byte) -63);
        ll.a(param0 + -3055);
        f.a(-74);
        vl.b(param0 + -6994);
        qa.b(param0 + -17128);
        wb.a(param0 ^ -7141);
        eh.b(param0 + -7067);
        pf.a(91);
        ub.f((byte) 31);
        mi.a(param0 ^ -7071);
        tj.d(true);
        af.a(false);
        ik.f(param0 ^ -7161);
        pl.d(true);
        og.k((byte) 37);
        pe.a((byte) -106);
        gf.i((byte) -68);
        rg.i(-6);
        hd.a((byte) 111);
        wj.d(false);
        ff.d(-26);
        kc.d(112);
        l.a((byte) 101);
        ef.d(param0 ^ 20678);
        mf.e(29);
        fa.a((byte) 52);
        re.g((byte) -55);
        cj.b();
        we.a(-7077);
        vg.k(80);
        bc.a(param0 + -7067);
        ca.a((byte) -120);
        le.c(0);
        sh.a((byte) -125);
        dg.c(param0 + -6813);
        jj.a(0);
        lh.a(false);
        lf.a(-13078);
        hh.e(30828);
        jd.a(-1);
        vj.a(0);
        oe.a(31);
        dj.b(16);
        li.a();
        gk.a(-124);
        pk.a(param0 ^ -10072);
        ej.a((byte) -43);
        gh.a(-681844375);
        ac.e(0);
        il.a(true);
        uk.a((byte) -44);
        di.b((byte) 80);
        nf.b(param0 + -7190);
        ql.b(110);
        fb.a(-106);
        dl.a(param0 ^ 12465);
        ib.b((byte) -64);
        hf.a(3543);
        ia.b(false);
        cg.d(0);
        a.a(-331851056);
        rb.a(-1926289535);
        qk.a((byte) 58);
        pb.b(false);
        h.c(true);
        q.a(false);
        dh.a(false);
        ug.d(-13542);
        vb.a((byte) 126);
        gg.a();
        cf.c(10881);
        lb.b((byte) 55);
        pj.g(125);
        pd.f(-27864);
        fc.a(param0 ^ 7063);
        kh.c(0);
        bh.a((byte) 21);
        gj.a((byte) 94);
        de.a((byte) 5);
        ig.a((byte) -110);
        ag.f(param0 + -6950);
        ea.b(4);
        wh.a(339);
        vf.b(false);
        te.a(10615);
        pg.e((byte) -73);
        sf.a(125);
        hb.a(24944);
        sc.a((byte) -76);
        dc.c(param0 + -7157);
        ga.a(-44);
        wd.a((byte) 119);
        jl.d(2763306);
        tk.a(117);
        qb.b(-1);
        ke.b((byte) -110);
        cc.a((byte) -85);
        jc.g((byte) -19);
        nj.a(-89);
        ai.a(65535);
        wg.a(true);
        aa.c(false);
        of.a((byte) 118);
        sa.a((byte) -118);
        uf.a(-119);
        bb.c(24957);
        nh.d((byte) -118);
        ka.b(-30);
        vc.d(false);
        ei.a(1);
        fg.b(0);
        jg.c((byte) 100);
        rh.f(-110);
        sj.f(-128);
        hc.g(param0 ^ 2098084476);
        qf.c(true);
        kd.a(24188);
        ok.a(0);
        r.d(param0 + -6948);
        lg.a((byte) 99);
        tc.a((byte) -100);
        ie.c(-1);
        ae.b(-2076560510);
        this.field_y = null;
    }

    public wizardrun() {
        this.field_M = 0;
        this.field_J = true;
        this.field_N = -1;
    }

    static {
        field_O = new byte[520];
        field_T = -1;
        field_F = "Close";
        field_E = -1;
    }
}
