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
        o discarded$5 = null;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        o var4 = null;
        int var5_int = 0;
        Object var5 = null;
        int var6_int = 0;
        Object var6 = null;
        int var7_int = 0;
        ob var7 = null;
        int var8 = 0;
        int var9 = 0;
        i var10 = null;
        ue var11 = null;
        o var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        ue var18 = null;
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
                                                          discarded$5 = vg.a(15, "gameover", mi.field_E, "");
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
                                                                  discarded$6 = mi.field_D.a(eg.field_u, -1, var18, bh.field_e, 0);
                                                                  discarded$7 = mi.field_D.a(eg.field_u, -1, var18, qj.field_e, 0);
                                                                  discarded$8 = mi.field_D.a(eg.field_u, param1 ^ -47, var18, fb.field_a, 0);
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
                                                                  discarded$9 = mi.field_D.a(eg.field_u, -1, var11, sl.field_q[var7_int], 0);
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
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
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
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (0 >= hl.field_a) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pg var5 = null;
        dc var6 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
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
          stackOut_4_0 = this;
          stackOut_4_1 = -4114;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          if (null == ki.field_E) {
            stackOut_6_0 = this;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
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
                    stackOut_21_0 = this;
                    stackOut_21_1 = 39;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    if (null == ki.field_E) {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      break L6;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
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
              var5 = (pg) ((Object) ie.field_l.b(114));
              if (var5 != null) {
                hc.a(var5, false, 4);
                continue L9;
              } else {
                L10: while (true) {
                  var6 = (dc) ((Object) ke.field_u.b(109));
                  if (var6 == null) {
                    break L8;
                  } else {
                    ml.a(var6, 5, -1);
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
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
                              stackOut_98_0 = 0;
                              stackIn_99_0 = stackOut_98_0;
                              break L11;
                            } else {
                              stackOut_97_0 = 1;
                              stackIn_99_0 = stackOut_97_0;
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
                              stackOut_84_0 = 0;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_85_0 = stackOut_84_0;
                              if (tl.field_e) {
                                stackOut_86_0 = stackIn_86_0;
                                stackOut_86_1 = 0;
                                stackIn_87_0 = stackOut_86_0;
                                stackIn_87_1 = stackOut_86_1;
                                break L13;
                              } else {
                                stackOut_85_0 = stackIn_85_0;
                                stackOut_85_1 = 1;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
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
                              stackOut_106_0 = 0;
                              stackIn_108_0 = stackOut_106_0;
                              stackIn_107_0 = stackOut_106_0;
                              if (tl.field_e) {
                                stackOut_108_0 = stackIn_108_0;
                                stackOut_108_1 = 0;
                                stackIn_109_0 = stackOut_108_0;
                                stackIn_109_1 = stackOut_108_1;
                                break L15;
                              } else {
                                stackOut_107_0 = stackIn_107_0;
                                stackOut_107_1 = 1;
                                stackIn_109_0 = stackOut_107_0;
                                stackIn_109_1 = stackOut_107_1;
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
                              stackOut_55_0 = 0;
                              stackIn_56_0 = stackOut_55_0;
                              break L24;
                            } else {
                              stackOut_54_0 = 1;
                              stackIn_56_0 = stackOut_54_0;
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
                            stackOut_50_0 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            break L27;
                          } else {
                            stackOut_49_0 = 1;
                            stackIn_51_0 = stackOut_49_0;
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
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int discarded$41 = 0;
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        int discarded$52 = 0;
        int discarded$53 = 0;
        int discarded$54 = 0;
        int discarded$55 = 0;
        int incrementValue$56 = 0;
        int discarded$57 = 0;
        int discarded$58 = 0;
        int discarded$59 = 0;
        int discarded$60 = 0;
        int discarded$61 = 0;
        int discarded$62 = 0;
        int discarded$63 = 0;
        int discarded$64 = 0;
        int discarded$65 = 0;
        int discarded$66 = 0;
        int discarded$67 = 0;
        int discarded$68 = 0;
        int discarded$69 = 0;
        int discarded$70 = 0;
        int discarded$71 = 0;
        int incrementValue$72 = 0;
        int incrementValue$73 = 0;
        int discarded$74 = 0;
        int discarded$75 = 0;
        int discarded$76 = 0;
        boolean discarded$77 = false;
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
        String[] var7_ref_String__ = null;
        double var7_double = 0.0;
        int var8 = 0;
        int var9 = 0;
        ai var10_ref_ai = null;
        int var10 = 0;
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
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_510_0 = 0;
        int stackIn_558_0 = 0;
        gb stackIn_638_0 = null;
        gb stackIn_639_0 = null;
        gb stackIn_640_0 = null;
        int stackIn_640_1 = 0;
        gb stackIn_641_0 = null;
        int stackIn_641_1 = 0;
        gb stackIn_642_0 = null;
        int stackIn_642_1 = 0;
        gb stackIn_643_0 = null;
        int stackIn_643_1 = 0;
        int stackIn_643_2 = 0;
        gb stackIn_644_0 = null;
        int stackIn_644_1 = 0;
        int stackIn_644_2 = 0;
        gb stackIn_645_0 = null;
        int stackIn_645_1 = 0;
        int stackIn_645_2 = 0;
        gb stackIn_646_0 = null;
        int stackIn_646_1 = 0;
        int stackIn_646_2 = 0;
        int stackIn_646_3 = 0;
        gb stackIn_648_0 = null;
        gb stackIn_649_0 = null;
        gb stackIn_650_0 = null;
        int stackIn_650_1 = 0;
        gb stackIn_651_0 = null;
        int stackIn_651_1 = 0;
        int stackIn_651_2 = 0;
        gb stackIn_652_0 = null;
        int stackIn_652_1 = 0;
        int stackIn_652_2 = 0;
        gb stackIn_653_0 = null;
        int stackIn_653_1 = 0;
        int stackIn_653_2 = 0;
        int stackIn_653_3 = 0;
        gb stackIn_654_0 = null;
        int stackIn_654_1 = 0;
        int stackIn_654_2 = 0;
        int stackIn_654_3 = 0;
        gb stackIn_655_0 = null;
        int stackIn_655_1 = 0;
        int stackIn_655_2 = 0;
        int stackIn_655_3 = 0;
        gb stackIn_656_0 = null;
        int stackIn_656_1 = 0;
        int stackIn_656_2 = 0;
        int stackIn_656_3 = 0;
        int stackIn_656_4 = 0;
        gb stackIn_657_0 = null;
        gb stackIn_658_0 = null;
        gb stackIn_659_0 = null;
        int stackIn_659_1 = 0;
        gb stackIn_660_0 = null;
        int stackIn_660_1 = 0;
        int stackIn_660_2 = 0;
        int stackIn_660_3 = 0;
        gb stackIn_661_0 = null;
        int stackIn_661_1 = 0;
        int stackIn_661_2 = 0;
        int stackIn_661_3 = 0;
        gb stackIn_662_0 = null;
        int stackIn_662_1 = 0;
        int stackIn_662_2 = 0;
        int stackIn_662_3 = 0;
        int stackIn_662_4 = 0;
        Object stackIn_670_0 = null;
        Object stackIn_671_0 = null;
        Object stackIn_672_0 = null;
        int stackIn_672_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_509_0 = 0;
        int stackOut_508_0 = 0;
        int stackOut_557_0 = 0;
        int stackOut_556_0 = 0;
        gb stackOut_637_0 = null;
        gb stackOut_639_0 = null;
        int stackOut_639_1 = 0;
        gb stackOut_638_0 = null;
        int stackOut_638_1 = 0;
        gb stackOut_640_0 = null;
        int stackOut_640_1 = 0;
        gb stackOut_642_0 = null;
        int stackOut_642_1 = 0;
        int stackOut_642_2 = 0;
        gb stackOut_641_0 = null;
        int stackOut_641_1 = 0;
        int stackOut_641_2 = 0;
        gb stackOut_643_0 = null;
        int stackOut_643_1 = 0;
        int stackOut_643_2 = 0;
        gb stackOut_645_0 = null;
        int stackOut_645_1 = 0;
        int stackOut_645_2 = 0;
        int stackOut_645_3 = 0;
        gb stackOut_644_0 = null;
        int stackOut_644_1 = 0;
        int stackOut_644_2 = 0;
        int stackOut_644_3 = 0;
        gb stackOut_647_0 = null;
        gb stackOut_649_0 = null;
        int stackOut_649_1 = 0;
        gb stackOut_648_0 = null;
        int stackOut_648_1 = 0;
        gb stackOut_650_0 = null;
        int stackOut_650_1 = 0;
        int stackOut_650_2 = 0;
        gb stackOut_652_0 = null;
        int stackOut_652_1 = 0;
        int stackOut_652_2 = 0;
        int stackOut_652_3 = 0;
        gb stackOut_651_0 = null;
        int stackOut_651_1 = 0;
        int stackOut_651_2 = 0;
        int stackOut_651_3 = 0;
        gb stackOut_653_0 = null;
        int stackOut_653_1 = 0;
        int stackOut_653_2 = 0;
        int stackOut_653_3 = 0;
        gb stackOut_655_0 = null;
        int stackOut_655_1 = 0;
        int stackOut_655_2 = 0;
        int stackOut_655_3 = 0;
        int stackOut_655_4 = 0;
        gb stackOut_654_0 = null;
        int stackOut_654_1 = 0;
        int stackOut_654_2 = 0;
        int stackOut_654_3 = 0;
        int stackOut_654_4 = 0;
        gb stackOut_656_0 = null;
        gb stackOut_658_0 = null;
        int stackOut_658_1 = 0;
        gb stackOut_657_0 = null;
        int stackOut_657_1 = 0;
        gb stackOut_659_0 = null;
        int stackOut_659_1 = 0;
        int stackOut_659_2 = 0;
        int stackOut_659_3 = 0;
        gb stackOut_661_0 = null;
        int stackOut_661_1 = 0;
        int stackOut_661_2 = 0;
        int stackOut_661_3 = 0;
        int stackOut_661_4 = 0;
        gb stackOut_660_0 = null;
        int stackOut_660_1 = 0;
        int stackOut_660_2 = 0;
        int stackOut_660_3 = 0;
        int stackOut_660_4 = 0;
        Object stackOut_669_0 = null;
        Object stackOut_671_0 = null;
        int stackOut_671_1 = 0;
        Object stackOut_670_0 = null;
        int stackOut_670_1 = 0;
        var33 = null;
        var18 = field_H;
        var19 = hi.d((byte) 72);
        if (!ta.a((byte) 60)) {
          if (th.field_h) {
            if (!cg.c((byte) 54)) {
              ok.a(od.field_s, 100.0f, 0);
              uc.a(false, var19);
              return;
            } else {
              L0: {
                wg.field_e.c(0, 0);
                if (wi.field_K != 1) {
                  L1: {
                    fe.c((byte) 108);
                    if (-6 >= (ql.field_c ^ -1)) {
                      var3 = 0;
                      var4_int = 0;
                      var5 = 1;
                      L2: while (true) {
                        if (od.field_k <= var5) {
                          L3: {
                            var5 = 50;
                            if (-3 == (qh.field_l ^ -1)) {
                              var5 = 75;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          L4: {
                            if ((qh.field_l ^ -1) != -4) {
                              break L4;
                            } else {
                              var5 = 75;
                              break L4;
                            }
                          }
                          L5: {
                            if (4 == qh.field_l) {
                              var5 = 75;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (qh.field_l == 5) {
                              var5 = 200;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            var6 = 0;
                            if (0 == qh.field_l) {
                              var6 = 64;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (qh.field_l == 1) {
                              var6 = 64;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (qh.field_l != 2) {
                              break L9;
                            } else {
                              var6 = -u.field_x.field_s + 384;
                              break L9;
                            }
                          }
                          L10: {
                            if (3 != qh.field_l) {
                              break L10;
                            } else {
                              var6 = 64;
                              break L10;
                            }
                          }
                          L11: {
                            if (4 == qh.field_l) {
                              var6 = 384 - u.field_x.field_s;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (-6 != (qh.field_l ^ -1)) {
                              break L12;
                            } else {
                              var6 = 64;
                              break L12;
                            }
                          }
                          mg.field_s.e(320 + -(u.field_x.field_x / 2), var6);
                          if ((var4_int ^ -1) != -1) {
                            ed.c(1 + (320 - u.field_x.field_x / 2), 0, 320 + -(u.field_x.field_x / 2) - -((-2 + u.field_x.field_x) * ii.field_e[var4_int].field_p / var5), 480);
                            u.field_x.e(320 + -(u.field_x.field_x / 2), var6);
                            ed.c();
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          L13: {
                            if (ii.field_e[var5].field_d != var3) {
                              break L13;
                            } else {
                              if ((ii.field_e[var5].field_p ^ -1) < (ii.field_e[var4_int].field_p ^ -1)) {
                                var3 = ii.field_e[var5].field_d;
                                var4_int = var5;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            if (var3 < ii.field_e[var5].field_d) {
                              var3 = ii.field_e[var5].field_d;
                              var4_int = var5;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                  if ((qh.field_l ^ -1) < 0) {
                    L15: {
                      if (pg.field_q) {
                        break L15;
                      } else {
                        var26 = new String[9];
                        var3_ref_String__ = var26;
                        var4_int = 0;
                        L16: while (true) {
                          if (9 <= var4_int) {
                            var4_int = 0;
                            var5 = 440;
                            L17: while (true) {
                              if ((var5 ^ -1) < -611) {
                                ed.c(440, 0, 440 - -(2 * fi.field_x), 64);
                                var4_int = 0;
                                var5 = 440;
                                L18: while (true) {
                                  if (var5 > 610) {
                                    ed.c();
                                    break L15;
                                  } else {
                                    L19: {
                                      ok.field_d[0].a(var5, 0, 30, 30);
                                      incrementValue$39 = var4_int;
                                      var4_int++;
                                      jj.field_b.b(var3_ref_String__[incrementValue$39], var5 + 15, 25, 0, -1);
                                      if (-101 <= (fi.field_x ^ -1)) {
                                        break L19;
                                      } else {
                                        if (fi.field_x >= 110) {
                                          break L19;
                                        } else {
                                          ok.field_d[0].a(var5 + 5, 5, 20, 20);
                                          break L19;
                                        }
                                      }
                                    }
                                    var5 += 20;
                                    continue L18;
                                  }
                                }
                              } else {
                                ok.field_d[0].b(var5, 0, 30, 30, 64);
                                jj.field_b.b(var26[var4_int], var5 + 15, 24, 0, -1);
                                jj.field_b.b(var26[var4_int], var5 + 15, 26, 0, -1);
                                jj.field_b.b(var26[var4_int], -1 + (15 + var5), 25, 0, -1);
                                jj.field_b.b(var26[var4_int], 1 + (var5 - -15), 25, 0, -1);
                                incrementValue$40 = var4_int;
                                var4_int++;
                                jj.field_b.b(var3_ref_String__[incrementValue$40], var5 - -15, 25, 16777215, -1);
                                var5 += 20;
                                continue L17;
                              }
                            }
                          } else {
                            var3_ref_String__[var4_int] = sc.a((byte) -108, bb.field_g.charAt(var4_int));
                            var4_int++;
                            continue L16;
                          }
                        }
                      }
                    }
                    L20: {
                      var3 = 2;
                      if (qh.field_g > 0) {
                        jj.field_b.c(hh.field_J, 8, 471, 0, -1);
                        jj.field_b.c(hh.field_J, 8, 473, 0, -1);
                        jj.field_b.c(hh.field_J, 7, 472, 0, -1);
                        jj.field_b.c(hh.field_J, 9, 472, 0, -1);
                        jj.field_b.c(hh.field_J, 8, 472, 16777215, -1);
                        var3 = jj.field_b.b(hh.field_J) + 8;
                        var4_int = 0;
                        L21: while (true) {
                          if (var4_int >= qh.field_g) {
                            break L20;
                          } else {
                            L22: {
                              if (qh.field_g <= 25 + var4_int) {
                                if ((qh.field_g ^ -1) >= (var4_int - -10 ^ -1)) {
                                  if ((var4_int - -5 ^ -1) <= (qh.field_g ^ -1)) {
                                    ok.field_d[0].a(var3, 446, 24, 24);
                                    gf.field_bb.a(var3, 446, 24, 24);
                                    var3 += 24;
                                    break L22;
                                  } else {
                                    ok.field_d[0].a(var3, 446, 32, 32);
                                    gf.field_bb.a(var3, 446, 32, 32);
                                    a.field_a.c("5", var3, 461, 16777215, -1);
                                    var3 += 32;
                                    var4_int += 4;
                                    break L22;
                                  }
                                } else {
                                  ok.field_d[0].a(var3, 446, 32, 32);
                                  gf.field_bb.a(var3, 446, 32, 32);
                                  a.field_a.c("10", var3, 461, 16777215, -1);
                                  var3 += 32;
                                  var4_int += 9;
                                  break L22;
                                }
                              } else {
                                ok.field_d[0].a(var3, 446, 32, 32);
                                gf.field_bb.a(var3, 446, 32, 32);
                                a.field_a.c("25", var3, 461, 16777215, -1);
                                var3 += 32;
                                var4_int += 24;
                                break L22;
                              }
                            }
                            var4_int++;
                            continue L21;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                    L23: {
                      if ((sg.field_f ^ -1) < -1) {
                        var27 = tf.field_d + sg.field_f;
                        jj.field_b.c(var27, 8, jj.field_b.field_M - 1, 0, -1);
                        jj.field_b.c(var27, 8, jj.field_b.field_M - -1, 0, -1);
                        jj.field_b.c(var27, 7, jj.field_b.field_M, 0, -1);
                        jj.field_b.c(var27, 9, jj.field_b.field_M, 0, -1);
                        jj.field_b.c(var27, 8, jj.field_b.field_M, 16777215, -1);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if ((wi.field_K ^ -1) != -3) {
                        break L24;
                      } else {
                        L25: {
                          if (pg.field_q) {
                            break L25;
                          } else {
                            if (5 != qh.field_l) {
                              break L25;
                            } else {
                              if (5 <= ql.field_c) {
                                L26: {
                                  this.field_Q = this.field_Q + 1;
                                  if (-41 < (this.field_Q ^ -1)) {
                                    break L26;
                                  } else {
                                    this.field_Q = 0;
                                    break L26;
                                  }
                                }
                                lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        var4_int = 0;
                        L27: while (true) {
                          if (od.field_k <= var4_int) {
                            break L24;
                          } else {
                            ii.field_e[var4_int].d(true);
                            var4_int++;
                            continue L27;
                          }
                        }
                      }
                    }
                    if (!pg.field_q) {
                      break L0;
                    } else {
                      L28: {
                        if (-12 == (this.field_R ^ -1)) {
                          L29: {
                            this.field_Q = this.field_Q + 1;
                            if (-41 < (this.field_Q ^ -1)) {
                              break L29;
                            } else {
                              this.field_Q = 0;
                              break L29;
                            }
                          }
                          lg.field_a[12 + this.field_Q / 10 % 4].e(512, 0);
                          var4_int = -32 + ((15 - ii.field_e[0].field_i.field_a + -1) * 32 - ii.field_e[0].field_f.field_a * 32 / 240);
                          var3 = ii.field_e[0].field_i.field_b * 32 - -(ii.field_e[0].field_f.field_b * 32 / 240);
                          if ((ii.field_e[0].field_h ^ -1) != 0) {
                            ve.field_c[ii.field_e[0].field_n].d(var3, var4_int);
                            break L28;
                          } else {
                            ve.field_c[ii.field_e[0].field_n].e(var3, var4_int);
                            break L28;
                          }
                        } else {
                          break L28;
                        }
                      }
                      L30: {
                        if ((this.field_R ^ -1) == -13) {
                          L31: {
                            var4_int = 352;
                            lg.field_a[12 + (2 + this.field_Q / 10) % 4].e(512, 0);
                            var3 = 64;
                            if (this.field_Q < 10) {
                              var4_int = -64 + -(ii.field_e[0].field_i.field_a * 32) + (480 - ii.field_e[0].field_f.field_a * 32 / 240);
                              var3 = 32 * ii.field_e[0].field_f.field_b / 240 + ii.field_e[0].field_i.field_b * 32;
                              var5 = -var3 + 64;
                              var3 = var3 + var5 * this.field_Q / 10;
                              var6 = -var4_int + 352;
                              var4_int = var4_int + var6 * this.field_Q / 10;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            var5 = 15;
                            if ((this.field_Q ^ -1) < -51) {
                              var5 = 16;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (this.field_Q > 60) {
                              var5 = 12;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            oc.field_c[var5].d(var3, var4_int);
                            if (50 > this.field_Q) {
                              var6 = this.field_Q * 256 / 50;
                              var7_double = 0.0;
                              var9 = 0;
                              L35: while (true) {
                                if (var9 >= 5) {
                                  break L34;
                                } else {
                                  var7_double = (double)this.field_Q + 6.28 * (double)var9 / 5.0;
                                  ob.field_c.d(-6 + ((int)(32.0 + 32.0 * Math.cos(var7_double)) + var3), var4_int - (-(int)(32.0 + Math.sin(var7_double) * 32.0) - -6), 12, 12, var6);
                                  var9++;
                                  continue L35;
                                }
                              }
                            } else {
                              break L34;
                            }
                          }
                          if ((this.field_Q ^ -1) > -51) {
                            break L30;
                          } else {
                            if ((this.field_Q ^ -1) <= -91) {
                              break L30;
                            } else {
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
                              break L30;
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                      L36: {
                        if (-14 == (this.field_R ^ -1)) {
                          L37: {
                            var3 = 64;
                            var4_int = 352;
                            var5 = this.field_Q / 5 % 2 + 13;
                            if ((this.field_Q ^ -1) < -71) {
                              var5 = 12;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (this.field_Q <= 80) {
                              break L38;
                            } else {
                              var5 = 11;
                              break L38;
                            }
                          }
                          L39: {
                            if (this.field_Q <= 90) {
                              break L39;
                            } else {
                              var5 = 10;
                              break L39;
                            }
                          }
                          oc.field_c[var5].d(var3, var4_int);
                          if (-51 >= (this.field_Q ^ -1)) {
                            lg.field_a[this.field_Q / 10 % 4 - -22].e(512, 288);
                            break L36;
                          } else {
                            lg.field_a[this.field_Q / 10 % 4 - -18].e(512, this.field_Q * 288 / 50);
                            break L36;
                          }
                        } else {
                          break L36;
                        }
                      }
                      L40: {
                        if (14 == this.field_R) {
                          lg.field_a[22 + (2 + this.field_Q / 10) % 4].e(512, 288);
                          var3 = this.field_Q + 64;
                          var4_int = 352;
                          var5 = 2 - -(this.field_Q / 10 % 4);
                          oc.field_c[var5].d(var3, var4_int);
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      L41: {
                        if ((this.field_R ^ -1) == -16) {
                          L42: {
                            var3 = 164;
                            if (this.field_Q < 50) {
                              lg.field_a[22 + this.field_Q / 10 % 4].e(512, 288);
                              break L42;
                            } else {
                              lg.field_a[this.field_Q / 10 % 4 - -26].e(512, 288);
                              break L42;
                            }
                          }
                          var4_int = 352;
                          var5 = this.field_Q / 5 % 2 + 19;
                          oc.field_c[var5].d(var3, var4_int);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L43: {
                        if (-17 == (this.field_R ^ -1)) {
                          L44: {
                            var4_int = 352;
                            lg.field_a[26 + (2 + this.field_Q / 10) % 4].e(512, 288);
                            var3 = 164;
                            var5 = 10;
                            if ((this.field_Q ^ -1) < -11) {
                              var5 = 11;
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                          L45: {
                            if (25 >= this.field_Q) {
                              break L45;
                            } else {
                              var5 = 12;
                              break L45;
                            }
                          }
                          L46: {
                            if (50 > this.field_Q) {
                              break L46;
                            } else {
                              var5 = 13;
                              break L46;
                            }
                          }
                          oc.field_c[var5].d(var3, var4_int);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      L47: {
                        if (this.field_R == 17) {
                          lg.field_a[(this.field_Q / 10 - -2) % 4 + 30].e(512, 288);
                          oc.field_c[(this.field_Q / 5 - -2) % 2 - -17].e(164, 352);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                      L48: {
                        if ((this.field_R ^ -1) == -2) {
                          var3 = 256;
                          var4_int = 288;
                          var5 = this.field_Q / 10 % 8 - 0;
                          lg.field_a[var5].e(var3, var4_int);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (2 == this.field_R) {
                          var5 = this.field_Q / 10 % 8 - 0;
                          var3 = 256;
                          var4_int = 288;
                          lg.field_a[var5].e(var3, var4_int);
                          var4_int = var4_int - (32 + -this.field_Q + 100);
                          var5 = this.field_Q / 5 % 4 + 6;
                          var3 = var3 - (-64 + (100 - this.field_Q) * 5);
                          ok.field_e[5][3][var5].d(var3, var4_int);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (this.field_R == 3) {
                          var4_int = 288;
                          var5 = this.field_Q / 10 % 4 - -8;
                          var3 = 256;
                          var4_int = var4_int - this.field_Q;
                          var3 = var3 + 5 * this.field_Q;
                          lg.field_a[var5].e(var3, var4_int);
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                      L51: {
                        if (-5 != (this.field_R ^ -1)) {
                          break L51;
                        } else {
                          var3 = 2 * this.field_Q - 64;
                          var5 = 6 + this.field_Q / 10 % 4;
                          var4_int = 352;
                          oc.field_c[var5].d(var3, var4_int);
                          break L51;
                        }
                      }
                      L52: {
                        if (this.field_R != 5) {
                          break L52;
                        } else {
                          L53: {
                            var5 = 6 + (2 + this.field_Q / 10) % 4;
                            var4_int = 352;
                            if ((this.field_Q ^ -1) > -101) {
                              var3 = -64 + (2 * this.field_Q - -200);
                              oc.field_c[var5].d(var3, var4_int);
                              break L53;
                            } else {
                              var3 = 336;
                              var5 = 7;
                              if (this.field_Q < 150) {
                                oc.field_c[var5].d(var3, var4_int);
                                break L53;
                              } else {
                                oc.field_c[var5].e(var3, var4_int);
                                break L53;
                              }
                            }
                          }
                          if (100 < this.field_Q) {
                            var3 = 64 + (int)(Math.sin(3.14 * (double)this.field_Q / 100.0) * 32.0);
                            var4_int = -448 + 2 * this.field_Q;
                            var5 = 36 + this.field_Q / 25 % 2;
                            oc.field_c[var5].e(var3, var4_int);
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                      }
                      L54: {
                        if (6 == this.field_R) {
                          L55: {
                            var4_int = 352;
                            var5 = 6 + this.field_Q / 10 % 4;
                            var3 = 336;
                            var5 = 7;
                            if ((this.field_Q ^ -1) < -21) {
                              var5 = 28;
                              break L55;
                            } else {
                              break L55;
                            }
                          }
                          L56: {
                            if (this.field_Q <= 40) {
                              break L56;
                            } else {
                              var5 = 27;
                              break L56;
                            }
                          }
                          L57: {
                            if (-151 <= (this.field_Q ^ -1)) {
                              break L57;
                            } else {
                              var5 = 28;
                              break L57;
                            }
                          }
                          L58: {
                            if ((this.field_Q ^ -1) >= -176) {
                              break L58;
                            } else {
                              var5 = 29;
                              break L58;
                            }
                          }
                          oc.field_c[var5].e(var3, var4_int);
                          var3 = (int)(Math.sin((double)this.field_Q * 3.14 / 100.0) * 32.0) + 64;
                          var5 = 36 + this.field_Q / 25 % 2;
                          var4_int = 2 * this.field_Q + -48;
                          oc.field_c[var5].e(var3, var4_int);
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                      L59: {
                        if (this.field_R != 7) {
                          break L59;
                        } else {
                          if (this.field_Q >= 50) {
                            var4_int = 352;
                            var3 = 64;
                            if (this.field_Q >= 75) {
                              oc.field_c[10].e(var3, var4_int);
                              break L59;
                            } else {
                              oc.field_c[0].e(var3, var4_int);
                              oc.field_c[36].e(var3, var4_int);
                              break L59;
                            }
                          } else {
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
                            break L59;
                          }
                        }
                      }
                      L60: {
                        if (this.field_R == 8) {
                          L61: {
                            var5 = this.field_Q / 5 % 4 + 2;
                            var4_int = 352;
                            if (40 <= this.field_Q) {
                              break L61;
                            } else {
                              var3 = 64 - -(this.field_Q * 3);
                              oc.field_c[var5].d(var3, var4_int);
                              break L61;
                            }
                          }
                          L62: {
                            if ((this.field_Q ^ -1) > -41) {
                              break L62;
                            } else {
                              if (this.field_Q < 60) {
                                var3 = 184;
                                oc.field_c[3].d(var3, var4_int);
                                break L62;
                              } else {
                                break L62;
                              }
                            }
                          }
                          if (this.field_Q < 60) {
                            break L60;
                          } else {
                            if (-101 > (this.field_Q ^ -1)) {
                              break L60;
                            } else {
                              var3 = 364 + -(this.field_Q * 3);
                              oc.field_c[var5].e(var3, var4_int);
                              break L60;
                            }
                          }
                        } else {
                          break L60;
                        }
                      }
                      if ((this.field_R ^ -1) == -10) {
                        L63: {
                          var4_int = 352;
                          var5 = 10;
                          var3 = 64;
                          if ((this.field_Q ^ -1) >= -26) {
                            break L63;
                          } else {
                            var5 = 11;
                            break L63;
                          }
                        }
                        L64: {
                          if ((this.field_Q ^ -1) < -51) {
                            var5 = 12;
                            break L64;
                          } else {
                            break L64;
                          }
                        }
                        if (3 < qh.field_g) {
                          oc.field_c[var5].d(var3, var4_int);
                          break L0;
                        } else {
                          oc.field_c[var5].e(var3, var4_int);
                          break L0;
                        }
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  L65: {
                    if (-1 == (sf.field_h ^ -1)) {
                      var3 = 208;
                      var5 = 0;
                      L66: while (true) {
                        if ((rc.field_a ^ -1) >= (var5 ^ -1)) {
                          var5 = 0;
                          L67: while (true) {
                            if (var5 >= 100) {
                              break L65;
                            } else {
                              L68: {
                                if (md.field_a[var5][2] <= 0) {
                                  break L68;
                                } else {
                                  ok.field_d[0].a(md.field_a[var5][0], md.field_a[var5][1], -128, md.field_a[var5][2], md.field_a[var5][2] * 2);
                                  break L68;
                                }
                              }
                              var5++;
                              continue L67;
                            }
                          }
                        } else {
                          L69: {
                            if (var5 != si.field_h) {
                              stackOut_14_0 = 15583488;
                              stackIn_15_0 = stackOut_14_0;
                              break L69;
                            } else {
                              stackOut_13_0 = 16777215;
                              stackIn_15_0 = stackOut_13_0;
                              break L69;
                            }
                          }
                          L70: {
                            L71: {
                              var4_int = stackIn_15_0;
                              var20 = og.field_R[var5];
                              var7 = 177;
                              if ((var5 ^ -1) == -3) {
                                break L71;
                              } else {
                                if (var5 != 3) {
                                  break L70;
                                } else {
                                  break L71;
                                }
                              }
                            }
                            var7 = var7 - (50 + jj.field_b.b(var20) / 2);
                            break L70;
                          }
                          L72: {
                            this.b(-12926, var20, var4_int, var7, var3);
                            if (-3 == (var5 ^ -1)) {
                              L73: {
                                if (!pk.field_s) {
                                  stackOut_23_0 = 0;
                                  stackIn_24_0 = stackOut_23_0;
                                  break L73;
                                } else {
                                  stackOut_22_0 = ee.field_p;
                                  stackIn_24_0 = stackOut_22_0;
                                  break L73;
                                }
                              }
                              var8 = stackIn_24_0;
                              ok.field_d[0].a(174, -10 + var3 + -6, -93, 20, 0);
                              ok.field_d[0].a(174, 10 + (-6 + var3), -107, 20, 0);
                              ok.field_d[0].a(174, var3 + -6, -108, 30, 0);
                              ok.field_d[0].a(282, -6 + (var3 + -10), -123, 20, 0);
                              ok.field_d[0].a(282, 10 + (var3 + -6), -98, 20, 0);
                              ok.field_d[0].a(282, var3 - 6, -87, 30, 0);
                              var9 = 172;
                              L74: while (true) {
                                if (268 <= var9) {
                                  ed.c(0, 0, 174 + var8 * 108 / 104, 480);
                                  var9 = 172;
                                  L75: while (true) {
                                    if ((var9 ^ -1) <= -269) {
                                      ed.c();
                                      ok.field_d[0].a(var8 * 108 / 104 + 174, -10 + (var3 - 6), -103, 30, 0);
                                      ok.field_d[0].a(174 + 108 * var8 / 104, -6 + var3 + 10, -99, 30, 0);
                                      ok.field_d[0].a(174 + var8 * 108 / 104, var3 + -6, -95, 40, 0);
                                      break L72;
                                    } else {
                                      ok.field_d[0].a(var9, -20 + var3, 28, 28);
                                      var9 += 14;
                                      continue L75;
                                    }
                                  }
                                } else {
                                  ok.field_d[0].b(var9, -14 + var3 - 6, 28, 28, 64);
                                  var9 += 14;
                                  continue L74;
                                }
                              }
                            } else {
                              break L72;
                            }
                          }
                          L76: {
                            if (3 == var5) {
                              L77: {
                                if (tl.field_e) {
                                  stackOut_35_0 = hc.field_o;
                                  stackIn_36_0 = stackOut_35_0;
                                  break L77;
                                } else {
                                  stackOut_34_0 = 0;
                                  stackIn_36_0 = stackOut_34_0;
                                  break L77;
                                }
                              }
                              var8 = stackIn_36_0;
                              ok.field_d[0].a(174, -10 + (var3 + -6), -93, 20, 0);
                              ok.field_d[0].a(174, 10 + (var3 + -6), -121, 20, 0);
                              ok.field_d[0].a(174, var3 + -6, -91, 30, 0);
                              ok.field_d[0].a(282, -6 + var3 + -10, -86, 20, 0);
                              ok.field_d[0].a(282, 10 + (var3 - 6), -122, 20, 0);
                              ok.field_d[0].a(282, var3 - 6, -117, 30, 0);
                              var9 = 172;
                              L78: while (true) {
                                if (var9 >= 268) {
                                  ed.c(0, 0, 108 * var8 / 200 + 172 - -2, 480);
                                  var9 = 172;
                                  L79: while (true) {
                                    if ((var9 ^ -1) <= -269) {
                                      ed.c();
                                      ok.field_d[0].a(2 + var8 * 108 / 200 + 172, -6 + var3 - 10, -112, 30, 0);
                                      ok.field_d[0].a(2 + (var8 * 108 / 200 + 172), 10 + (-6 + var3), -114, 30, 0);
                                      ok.field_d[0].a(2 + (108 * var8 / 200 + 172), -6 + var3, -96, 40, 0);
                                      break L76;
                                    } else {
                                      ok.field_d[0].a(var9, -14 + (var3 - 6), 28, 28);
                                      var9 += 14;
                                      continue L79;
                                    }
                                  }
                                } else {
                                  ok.field_d[0].b(var9, -6 + (-14 + var3), 28, 28, 64);
                                  var9 += 14;
                                  continue L78;
                                }
                              }
                            } else {
                              break L76;
                            }
                          }
                          var3 += 32;
                          var5++;
                          continue L66;
                        }
                      }
                    } else {
                      break L65;
                    }
                  }
                  L80: {
                    if (11 != sf.field_h) {
                      break L80;
                    } else {
                      L81: {
                        ed.c(16, 153, 608, 311, 13158);
                        ig.a(pd.field_H, 16, (byte) -110, 311, 608, 153);
                        jj.field_b.b(uh.field_b, 320, jj.field_b.field_M + 169, 16777215, -1);
                        var3 = 96;
                        if (-1 < (qh.field_l ^ -1)) {
                          hi.field_c = hi.field_c - qh.field_l * 6;
                          qh.field_l = 0;
                          break L81;
                        } else {
                          break L81;
                        }
                      }
                      L82: {
                        var4_int = var3 * 96 / 128;
                        if ((qh.field_l ^ -1) >= -6) {
                          break L82;
                        } else {
                          wg.field_b = wg.field_b + 30;
                          hi.field_c = hi.field_c - qh.field_l * 6;
                          qh.field_l = 5;
                          break L82;
                        }
                      }
                      var5 = 0;
                      L83: while (true) {
                        if (-7 >= (var5 ^ -1)) {
                          L84: {
                            L85: {
                              var5 = 16777215;
                              if (qh.field_l > pl.field_A) {
                                break L85;
                              } else {
                                if (-2 <= (qh.field_l ^ -1)) {
                                  break L84;
                                } else {
                                  if (hl.field_a <= 0) {
                                    break L85;
                                  } else {
                                    break L84;
                                  }
                                }
                              }
                            }
                            var5 = 16777088;
                            if (-2 <= (qh.field_l ^ -1)) {
                              break L84;
                            } else {
                              if (hl.field_a > 0) {
                                break L84;
                              } else {
                                var5 = 16711680;
                                break L84;
                              }
                            }
                          }
                          L86: {
                            var6_ref_String = "BLAH BLAH BLAH!";
                            if (qh.field_l != 0) {
                              break L86;
                            } else {
                              var6_ref_String = aa.field_kb;
                              break L86;
                            }
                          }
                          L87: {
                            if (qh.field_l == 1) {
                              var6_ref_String = u.field_o;
                              break L87;
                            } else {
                              break L87;
                            }
                          }
                          L88: {
                            if ((qh.field_l ^ -1) != -3) {
                              break L88;
                            } else {
                              var6_ref_String = ra.field_l;
                              break L88;
                            }
                          }
                          L89: {
                            if (qh.field_l != 3) {
                              break L89;
                            } else {
                              var6_ref_String = de.field_c;
                              break L89;
                            }
                          }
                          L90: {
                            if (4 == qh.field_l) {
                              var6_ref_String = wi.field_H;
                              break L90;
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            if ((qh.field_l ^ -1) == -6) {
                              var6_ref_String = kk.field_vb;
                              break L91;
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            jj.field_b.b(qj.field_c + (qh.field_l - -1), 320, var4_int + 192 + (16 + jj.field_b.field_M), var5, -1);
                            jj.field_b.b(var6_ref_String, 320, 2 * jj.field_b.field_M + (208 - -var4_int), var5, -1);
                            if (-16777089 == (var5 ^ -1)) {
                              jj.field_b.b(si.field_g, 320, 192 - -var4_int - -16 + 3 * jj.field_b.field_M, var5, -1);
                              break L92;
                            } else {
                              break L92;
                            }
                          }
                          L93: {
                            if (16711680 != var5) {
                              break L93;
                            } else {
                              jj.field_b.b(oj.field_a, 320, 192 - (-var4_int + -16 + -(3 * jj.field_b.field_M)), var5, -1);
                              break L93;
                            }
                          }
                          L94: {
                            if (!e.a(-109)) {
                              if ((var5 ^ -1) != -16777216) {
                                break L94;
                              } else {
                                if (this.a(400, 128, 65535, sc.field_l, 1)) {
                                  if (5 <= tj.field_I) {
                                    break L94;
                                  } else {
                                    if (0 < pa.field_c) {
                                      break L94;
                                    } else {
                                      L95: {
                                        ic.field_a = ic.field_a - qh.field_g;
                                        qh.field_g = 0;
                                        nk.field_T = 0;
                                        if (0 >= qh.field_l) {
                                          break L95;
                                        } else {
                                          hi.field_c = hi.field_c - 5;
                                          gd.field_b = false;
                                          qh.field_g = 5;
                                          break L95;
                                        }
                                      }
                                      od.field_k = 0;
                                      tj.field_I = 5;
                                      sj.field_l = 0;
                                      if (-1 > (qh.field_l ^ -1)) {
                                        nk.field_T = 400;
                                        break L94;
                                      } else {
                                        break L94;
                                      }
                                    }
                                  }
                                } else {
                                  break L94;
                                }
                              }
                            } else {
                              L96: {
                                var7 = 98;
                                if (-3 != (mh.field_tb ^ -1)) {
                                  break L96;
                                } else {
                                  var7 += 20;
                                  break L96;
                                }
                              }
                              L97: {
                                if (!this.a(400, var7, 65535, ue.field_b, 1)) {
                                  break L97;
                                } else {
                                  if (tj.field_I >= 5) {
                                    break L97;
                                  } else {
                                    if ((pa.field_c ^ -1) < -1) {
                                      break L97;
                                    } else {
                                      sl.a(11, 11, -127);
                                      break L97;
                                    }
                                  }
                                }
                              }
                              if ((var5 ^ -1) == -16777216) {
                                L98: {
                                  var7 = 320;
                                  if (-3 != (mh.field_tb ^ -1)) {
                                    break L98;
                                  } else {
                                    var7 += 30;
                                    break L98;
                                  }
                                }
                                if (this.a(400, var7, 65535, sc.field_l, 1)) {
                                  L99: {
                                    if ((tj.field_I ^ -1) <= -6) {
                                      break L99;
                                    } else {
                                      if ((pa.field_c ^ -1) < -1) {
                                        break L99;
                                      } else {
                                        L100: {
                                          wg.field_b = wg.field_b + qh.field_g;
                                          qh.field_g = 0;
                                          tj.field_I = 5;
                                          if (qh.field_l <= 0) {
                                            break L100;
                                          } else {
                                            gd.field_b = false;
                                            me.field_f = me.field_f + 5;
                                            qh.field_g = 5;
                                            break L100;
                                          }
                                        }
                                        L101: {
                                          od.field_k = 0;
                                          nk.field_T = 0;
                                          if ((qh.field_l ^ -1) < -1) {
                                            nk.field_T = 400;
                                            break L101;
                                          } else {
                                            break L101;
                                          }
                                        }
                                        sj.field_l = 0;
                                        break L99;
                                      }
                                    }
                                  }
                                  break L94;
                                } else {
                                  break L94;
                                }
                              } else {
                                break L94;
                              }
                            }
                          }
                          if (!this.a(400, 556, 65535, ne.field_a, 1)) {
                            break L80;
                          } else {
                            if (tj.field_I >= 5) {
                              break L80;
                            } else {
                              if (pa.field_c <= 0) {
                                pa.field_c = 32;
                                break L80;
                              } else {
                                break L80;
                              }
                            }
                          }
                        } else {
                          L102: {
                            L103: {
                              var6 = var3 * var5 - -32;
                              var7 = 208;
                              bd.field_c[var5].a(var3 * var5 + 32, 208, var3, var4_int);
                              if ((var5 ^ -1) < (pl.field_A ^ -1)) {
                                break L103;
                              } else {
                                if (-1 > (hl.field_a ^ -1)) {
                                  break L102;
                                } else {
                                  if (1 < var5) {
                                    break L103;
                                  } else {
                                    break L102;
                                  }
                                }
                              }
                            }
                            ed.d(var6, var7, var3, var4_int, 0, 192);
                            if (hl.field_a > 0) {
                              break L102;
                            } else {
                              if (-2 > (var5 ^ -1)) {
                                fa.field_c.c(var3 / 2 + (32 + (var5 * var3 - var4_int / 2)), 208, var4_int, var4_int);
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                          }
                          L104: {
                            if (var5 != qh.field_l) {
                              ed.a(var5 * var3 + 32, 208, var3, var4_int, 0);
                              ed.a(32 + var5 * var3, 208, var3, var4_int, 1, 8421376);
                              ed.a(var3 * var5 + 32, 208, var3, var4_int, 2, 16776960);
                              ed.a(var5 * var3 - -32, 208, var3, var4_int, 3, 8421376);
                              break L104;
                            } else {
                              ed.a(var3 * var5 - -32, 208, var3, var4_int, 0);
                              ed.a(32 + var3 * var5, 208, var3, var4_int, 1, 16776960);
                              ed.a(var3 * var5 - -32, 208, var3, var4_int, 2, 16777215);
                              ed.a(var3 * var5 - -32, 208, var3, var4_int, 3, 16776960);
                              break L104;
                            }
                          }
                          L105: {
                            if ((pg.field_n ^ -1) > (var6 ^ -1)) {
                              break L105;
                            } else {
                              if ((var6 - -var3 ^ -1) >= (pg.field_n ^ -1)) {
                                break L105;
                              } else {
                                if ((fi.field_B ^ -1) > (var7 ^ -1)) {
                                  break L105;
                                } else {
                                  if ((var7 - -var4_int ^ -1) >= (fi.field_B ^ -1)) {
                                    break L105;
                                  } else {
                                    ed.a(var3 * var5 + 32, 208, var3, var4_int, 16777215);
                                    if (sh.field_c != 1) {
                                      break L105;
                                    } else {
                                      hi.field_c = hi.field_c - qh.field_l * 6;
                                      wg.field_b = wg.field_b + var5 * 6;
                                      qh.field_l = var5;
                                      break L105;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var5++;
                          continue L83;
                        }
                      }
                    }
                  }
                  L106: {
                    if (5 != sf.field_h) {
                      break L106;
                    } else {
                      L107: {
                        cb.field_f = -1;
                        var3 = 5 * jj.field_b.field_M / 2 + 231;
                        ed.c(314, 119, 254, 94, 13158);
                        ig.a(pd.field_H, 309, (byte) -110, 104, 264, 114);
                        ed.c(249, 5 + var3 + -68, 382, 198, 13158);
                        ig.a(pd.field_H, 244, (byte) -110, 208, 392, -64 + var3 + -4);
                        var3 = 345;
                        var4_int = 130;
                        if (0 >= qf.field_l) {
                          stackOut_142_0 = ti.field_a;
                          stackIn_143_0 = stackOut_142_0;
                          break L107;
                        } else {
                          stackOut_141_0 = qf.field_l;
                          stackIn_143_0 = stackOut_141_0;
                          break L107;
                        }
                      }
                      L108: {
                        L109: {
                          var5 = stackIn_143_0;
                          if (ve.a((byte) 50, 0)) {
                            break L109;
                          } else {
                            if ((var5 & 2048) > 0) {
                              break L109;
                            } else {
                              break L108;
                            }
                          }
                        }
                        var3 = 325;
                        break L108;
                      }
                      var6 = 0;
                      var7 = 1;
                      var8 = a.field_a.field_E;
                      var9 = 0;
                      L110: while (true) {
                        if (nl.field_t.length <= var9) {
                          if (var7 == 0) {
                            break L106;
                          } else {
                            L111: {
                              if (-1 > (qf.field_l ^ -1)) {
                                jj.field_b.b(rb.field_b, 440, 230 + jj.field_b.field_M, 0, 0);
                                jj.field_b.b(rb.field_b, 439, 231 + jj.field_b.field_M, 0, 0);
                                jj.field_b.b(rb.field_b, 440, jj.field_b.field_M + 231, 16777215, -1);
                                break L111;
                              } else {
                                break L111;
                              }
                            }
                            var9 = jj.field_b.field_M * 5 / 2 + 231;
                            var9 = var9 + jj.field_b.field_M;
                            discarded$41 = jj.field_b.a(gk.field_r, 260, -1 + (var9 + -32), 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                            discarded$42 = jj.field_b.a(gk.field_r, 259, -32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                            discarded$43 = jj.field_b.a(gk.field_r, 260, -32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                            if (e.a(-86)) {
                              discarded$44 = jj.field_b.a(vl.field_n, 260, -1 + var9 - -32, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                              discarded$45 = jj.field_b.a(vl.field_n, 259, 32 + var9, 360, 480, 0, 0, 1, 0, jj.field_b.field_M);
                              discarded$46 = jj.field_b.a(vl.field_n, 260, 32 + var9, 360, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                              break L106;
                            } else {
                              break L106;
                            }
                          }
                        } else {
                          L112: {
                            var10 = 1;
                            if ((var9 ^ -1) != -12) {
                              break L112;
                            } else {
                              L113: {
                                if (-1 != (1 << var9 & var5 ^ -1)) {
                                  break L113;
                                } else {
                                  if (ve.a((byte) 103, 0)) {
                                    break L113;
                                  } else {
                                    var10 = 0;
                                    break L113;
                                  }
                                }
                              }
                              var3 = 525;
                              var4_int = 130;
                              break L112;
                            }
                          }
                          L114: {
                            if (var10 != 0) {
                              L115: {
                                var11 = 0;
                                if (tk.field_a != var9) {
                                  break L115;
                                } else {
                                  var11 = 2;
                                  ok.field_d[0].a(var3 - 8, -8 + var4_int, 48, 48);
                                  break L115;
                                }
                              }
                              L116: {
                                if ((pg.field_n ^ -1) > (var3 ^ -1)) {
                                  break L116;
                                } else {
                                  if (pg.field_n > var3 - -32) {
                                    break L116;
                                  } else {
                                    if (fi.field_B < var4_int) {
                                      break L116;
                                    } else {
                                      if ((fi.field_B ^ -1) < (32 + var4_int ^ -1)) {
                                        break L116;
                                      } else {
                                        L117: {
                                          if (qf.field_l == 0) {
                                            break L117;
                                          } else {
                                            if (0 == (1 << var9 & var5)) {
                                              break L116;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                        L118: {
                                          var11 = 2;
                                          if ((tk.field_a ^ -1) != (var9 ^ -1)) {
                                            ok.field_d[0].d(-4 + var3, var4_int + -4, 40, 40, 128);
                                            break L118;
                                          } else {
                                            break L118;
                                          }
                                        }
                                        cb.field_f = var9;
                                        break L116;
                                      }
                                    }
                                  }
                                }
                              }
                              L119: {
                                if (0 == (1 << var9 & var5)) {
                                  if (0 < qf.field_l) {
                                    break L114;
                                  } else {
                                    L120: {
                                      if ((hl.field_a ^ -1) < -1) {
                                        break L120;
                                      } else {
                                        if (1 == var9) {
                                          break L120;
                                        } else {
                                          if (-3 == (var9 ^ -1)) {
                                            break L120;
                                          } else {
                                            if (-6 == (var9 ^ -1)) {
                                              break L120;
                                            } else {
                                              if (-7 == (var9 ^ -1)) {
                                                break L120;
                                              } else {
                                                fa.field_c.c(-var11 + var3, var4_int - var11, var11 * 2 + 32, 2 * var11 + 32);
                                                break L119;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    sk.field_z.c(-var11 + var3, -var11 + var4_int, var11 * 2 + 32, 32 + var11 * 2);
                                    break L119;
                                  }
                                } else {
                                  ui.field_a[var9].c(-var11 + var3, var4_int + -var11, 2 * var11 + 32, 2 * var11 + 32);
                                  break L119;
                                }
                              }
                              L121: {
                                L122: {
                                  if ((var9 ^ -1) == (tk.field_a ^ -1)) {
                                    break L122;
                                  } else {
                                    if ((pg.field_n ^ -1) > (var3 ^ -1)) {
                                      break L121;
                                    } else {
                                      if ((pg.field_n ^ -1) < (var3 - -32 ^ -1)) {
                                        break L121;
                                      } else {
                                        if ((var4_int ^ -1) < (fi.field_B ^ -1)) {
                                          break L121;
                                        } else {
                                          if (32 + var4_int < fi.field_B) {
                                            break L121;
                                          } else {
                                            if (0 == (tk.field_a ^ -1)) {
                                              break L122;
                                            } else {
                                              break L121;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L123: {
                                  var7 = 0;
                                  this.b(-12926, nl.field_t[var9], 15583488, 440, 255);
                                  if ((1 << var9 & var5) == 0) {
                                    a.field_a.a(uf.field_b, 620, 247 + (jj.field_b.field_M - 1), 0, 0);
                                    a.field_a.a(uf.field_b, 619, jj.field_b.field_M + 247, 0, 0);
                                    a.field_a.a(uf.field_b, 620, jj.field_b.field_M + 247, 16727871, -1);
                                    break L123;
                                  } else {
                                    a.field_a.a(bc.field_c, 619, jj.field_b.field_M + 247, 0, 0);
                                    a.field_a.a(bc.field_c, 620, 246 - -jj.field_b.field_M, 0, 0);
                                    a.field_a.a(bc.field_c, 620, 247 + jj.field_b.field_M, 16777215, -1);
                                    break L123;
                                  }
                                }
                                L124: {
                                  var12 = jj.field_b.field_M * 5 / 2 + 231;
                                  if (-1 != (1 << var9 & var5 ^ -1)) {
                                    ui.field_a[var9].e(260, var12);
                                    break L124;
                                  } else {
                                    L125: {
                                      if (-1 > (hl.field_a ^ -1)) {
                                        break L125;
                                      } else {
                                        if (-2 == (var9 ^ -1)) {
                                          break L125;
                                        } else {
                                          if ((var9 ^ -1) == -3) {
                                            break L125;
                                          } else {
                                            if (-6 == (var9 ^ -1)) {
                                              break L125;
                                            } else {
                                              if ((var9 ^ -1) != -7) {
                                                fa.field_c.e(260, var12);
                                                break L124;
                                              } else {
                                                break L125;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    sk.field_z.e(260, var12);
                                    break L124;
                                  }
                                }
                                L126: {
                                  var12 = var12 + jj.field_b.field_M;
                                  if (0 != (var5 & 1 << var9)) {
                                    break L126;
                                  } else {
                                    if (5 > var9) {
                                      break L126;
                                    } else {
                                      if (var9 == 11) {
                                        break L126;
                                      } else {
                                        discarded$47 = a.field_a.a(f.field_f, 398, var12 - 1, 222, 480, 0, 0, 0, 0, var8);
                                        discarded$48 = a.field_a.a(f.field_f, 397, var12, 222, 480, 0, 0, 0, 0, var8);
                                        var12 = var12 + (var8 * 3 + 0 * a.field_a.a(f.field_f, 398, var12, 222, 480, 16777215, -1, 0, 0, var8));
                                        break L121;
                                      }
                                    }
                                  }
                                }
                                discarded$49 = a.field_a.a(mh.field_sb[var9], 397, -a.field_a.field_M + var12, 222, 480, 0, 0, 0, 0, var8);
                                discarded$50 = a.field_a.a(mh.field_sb[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, var8);
                                var12 = var12 + (3 * var8 - -(a.field_a.a(mh.field_sb[var9], 398, var12 + -a.field_a.field_M, 222, 480, 16777215, -1, 0, 0, var8) * 0));
                                discarded$51 = jj.field_b.a(kl.field_e + u.field_m[var9], 397, var12 - a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                                discarded$52 = jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + (-1 + var12), 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                                var12 = var12 + jj.field_b.field_M * jj.field_b.a(kl.field_e + u.field_m[var9], 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                                discarded$53 = jj.field_b.a(nf.field_a, 397, var12 + -a.field_a.field_M, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                                discarded$54 = jj.field_b.a(nf.field_a, 398, -a.field_a.field_M + -1 - -var12, 222, 480, 0, 0, 0, 0, jj.field_b.field_M);
                                discarded$55 = jj.field_b.a(nf.field_a, 398, -a.field_a.field_M + var12, 222, 480, 16777215, -1, 0, 0, jj.field_b.field_M);
                                var13 = md.field_e[var9];
                                var14 = 0;
                                L127: while (true) {
                                  if ((var14 ^ -1) <= (var13 ^ -1)) {
                                    break L121;
                                  } else {
                                    wc.field_f.b(jj.field_b.b(nf.field_a) + -(var13 * 3 / 2) + (8 * var14 + 398), 4 + var12 + -a.field_a.field_M);
                                    var14++;
                                    continue L127;
                                  }
                                }
                              }
                              incrementValue$56 = var6;
                              var6++;
                              if (4 == incrementValue$56) {
                                var3 = 325;
                                var4_int += 40;
                                break L114;
                              } else {
                                var3 += 40;
                                break L114;
                              }
                            } else {
                              break L114;
                            }
                          }
                          var9++;
                          continue L110;
                        }
                      }
                    }
                  }
                  if (sf.field_h == 2) {
                    ed.c(290, 125, 340, 300, 13158);
                    ig.a(pd.field_H, 285, (byte) -110, 310, 350, 120);
                    var21 = new StringBuilder(0);
                    var5_ref_String = var21.toString();
                    if (!e.a(-122)) {
                      L128: {
                        discarded$57 = a.field_a.a(we.field_e, 289, 370, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
                        discarded$58 = a.field_a.a(we.field_e, 290, 369, 340, 64, 0, 0, 1, 1, a.field_a.field_M);
                        discarded$59 = a.field_a.a(we.field_e, 290, 370, 340, 64, 16744448, -1, 1, 1, a.field_a.field_M);
                        if (null != th.field_g) {
                          break L128;
                        } else {
                          th.field_g = ff.a(10, 2, (byte) 59, 3, 1);
                          break L128;
                        }
                      }
                      L129: {
                        if (th.field_g.field_m) {
                          if (null != th.field_g.field_n) {
                            var22 = th.field_g.field_n[cd.field_c];
                            var38 = th.field_g.field_q[cd.field_c];
                            var3 = 128;
                            var39 = th.field_g.field_i[cd.field_c];
                            var9 = 0;
                            var10_ref_ai = fa.field_a;
                            var11 = 0;
                            var12 = 0;
                            L130: while (true) {
                              if (11 <= var12) {
                                break L129;
                              } else {
                                L131: {
                                  var13 = 16744448;
                                  if ((var12 ^ -1) <= -11) {
                                    break L131;
                                  } else {
                                    if (var9 != 0) {
                                      break L131;
                                    } else {
                                      if (var10_ref_ai == null) {
                                        break L131;
                                      } else {
                                        if (!qj.a(var22[var12], 66)) {
                                          break L131;
                                        } else {
                                          if (var10_ref_ai.field_n != var38[var12]) {
                                            break L131;
                                          } else {
                                            if (ei.field_k == var39[var12]) {
                                              var13 = 16777215;
                                              var9 = 1;
                                              break L131;
                                            } else {
                                              break L131;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L132: {
                                  L133: {
                                    L134: {
                                      if (var12 >= 10) {
                                        break L134;
                                      } else {
                                        if (null != var22[var12]) {
                                          break L133;
                                        } else {
                                          break L134;
                                        }
                                      }
                                    }
                                    L135: {
                                      if (-11 != (var12 ^ -1)) {
                                        break L135;
                                      } else {
                                        if (ei.field_k <= 0) {
                                          break L135;
                                        } else {
                                          if (var9 != 0) {
                                            break L135;
                                          } else {
                                            break L133;
                                          }
                                        }
                                      }
                                    }
                                    if (10 > var12) {
                                      L136: {
                                        var3 = 24 * var12 + 144;
                                        var5_ref_String = 1 + var12 + ".";
                                        if (-1 != (var12 ^ -1)) {
                                          break L136;
                                        } else {
                                          if ((cd.field_c ^ -1) == -2) {
                                            break L136;
                                          } else {
                                            if (var11 == 0) {
                                              var5_ref_String = pd.field_G;
                                              break L136;
                                            } else {
                                              break L136;
                                            }
                                          }
                                        }
                                      }
                                      L137: {
                                        if (-2 != (var12 ^ -1)) {
                                          break L137;
                                        } else {
                                          if (cd.field_c == 1) {
                                            break L137;
                                          } else {
                                            if (var11 == 0) {
                                              var5_ref_String = ef.field_G;
                                              break L137;
                                            } else {
                                              break L137;
                                            }
                                          }
                                        }
                                      }
                                      L138: {
                                        if ((var12 ^ -1) != -1) {
                                          break L138;
                                        } else {
                                          if (cd.field_c != 1) {
                                            break L138;
                                          } else {
                                            if (var11 == 0) {
                                              var5_ref_String = af.field_b;
                                              break L138;
                                            } else {
                                              break L138;
                                            }
                                          }
                                        }
                                      }
                                      L139: {
                                        if (-2 != (var12 ^ -1)) {
                                          break L139;
                                        } else {
                                          if (-2 != (cd.field_c ^ -1)) {
                                            break L139;
                                          } else {
                                            if (var11 == 0) {
                                              var5_ref_String = ai.field_s;
                                              break L139;
                                            } else {
                                              break L139;
                                            }
                                          }
                                        }
                                      }
                                      if (var11 != 0) {
                                        a.field_a.c(var5_ref_String, 322, 10 + var3, 0, -1);
                                        a.field_a.c(var5_ref_String, 324, 10 + var3, 0, -1);
                                        a.field_a.c(var5_ref_String, 323, var3 + 9, 0, -1);
                                        a.field_a.c(var5_ref_String, 323, 11 + var3, 0, -1);
                                        a.field_a.c(var5_ref_String, 323, var3 - -10, var13, -1);
                                        break L132;
                                      } else {
                                        if (1 < var12) {
                                          break L132;
                                        } else {
                                          a.field_a.b(var5_ref_String, 468, 10 + var3, 0, -1);
                                          a.field_a.b(var5_ref_String, 470, var3 + 10, 0, -1);
                                          a.field_a.b(var5_ref_String, 469, 9 + var3, 0, -1);
                                          a.field_a.b(var5_ref_String, 469, 11 + var3, 0, -1);
                                          a.field_a.b(var5_ref_String, 469, var3 - -10, var13, -1);
                                          break L132;
                                        }
                                      }
                                    } else {
                                      var12++;
                                      continue L130;
                                    }
                                  }
                                  L140: {
                                    var11 = 1;
                                    if (-1 != (var12 ^ -1)) {
                                      break L140;
                                    } else {
                                      a.field_a.c(bb.field_l, 299, 16 + var3, 0, 0);
                                      a.field_a.a(qj.field_f, 619, var3 - -16, 0, 0);
                                      a.field_a.c(bb.field_l, 300, 16 + (var3 - 1), 0, 0);
                                      a.field_a.a(qj.field_f, 620, -1 + (var3 - -16), 0, 0);
                                      a.field_a.c(bb.field_l, 300, var3 - -16, 16777215, -1);
                                      a.field_a.a(qj.field_f, 620, var3 + 16, 16777215, -1);
                                      if ((a.field_a.b(nj.field_p) / 2 + 510 ^ -1) > (620 - (a.field_a.b(qj.field_f) - -8) ^ -1)) {
                                        a.field_a.b(nj.field_p, 509, 16 + var3, 0, 0);
                                        a.field_a.b(nj.field_p, 510, -1 + var3 - -16, 0, 0);
                                        a.field_a.b(nj.field_p, 510, 16 + var3, 16777215, -1);
                                        break L140;
                                      } else {
                                        var14 = -a.field_a.b(qj.field_f) + 620 - 8;
                                        a.field_a.a(nj.field_p, var14 - 1, var3 + 16, 0, 0);
                                        a.field_a.a(nj.field_p, var14, 16 + (var3 - 1), 0, 0);
                                        a.field_a.a(nj.field_p, var14, var3 - -16, 16777215, -1);
                                        break L140;
                                      }
                                    }
                                  }
                                  L141: {
                                    L142: {
                                      var14 = 0;
                                      if (-11 >= (var12 ^ -1)) {
                                        break L142;
                                      } else {
                                        if (null == var22[var12]) {
                                          break L142;
                                        } else {
                                          var5_ref_String = 1 + var12 + "." + var22[var12];
                                          var14 = var39[var12];
                                          break L141;
                                        }
                                      }
                                    }
                                    if ((var12 ^ -1) != -11) {
                                      break L141;
                                    } else {
                                      if (-1 <= (ei.field_k ^ -1)) {
                                        break L141;
                                      } else {
                                        if (var9 != 0) {
                                          break L141;
                                        } else {
                                          var13 = 16777215;
                                          var14 = ei.field_k;
                                          var5_ref_String = d.field_a;
                                          break L141;
                                        }
                                      }
                                    }
                                  }
                                  L143: {
                                    var15 = 300;
                                    var16 = var14 % 64;
                                    var17 = (-var16 + var14) / 64;
                                    if (0 == var12) {
                                      oe.field_d[0].field_a = var17;
                                      break L143;
                                    } else {
                                      break L143;
                                    }
                                  }
                                  L144: {
                                    L145: {
                                      var3 = 154 + var12 * 22;
                                      if (-11 < (var12 ^ -1)) {
                                        break L145;
                                      } else {
                                        if (var9 != 0) {
                                          break L144;
                                        } else {
                                          if (-1 > (ei.field_k ^ -1)) {
                                            break L145;
                                          } else {
                                            break L132;
                                          }
                                        }
                                      }
                                    }
                                    L146: {
                                      ed.c(0, 0, 510 + -(a.field_a.b(q.field_l) / 2), 640);
                                      a.field_a.c(var5_ref_String, 2 + var15, 10 + var3, 0, -1);
                                      a.field_a.c(var5_ref_String, var15 - -4, var3 - -10, 0, -1);
                                      a.field_a.c(var5_ref_String, 3 + var15, var3 - -9, 0, -1);
                                      a.field_a.c(var5_ref_String, var15 - -3, var3 + 11, 0, -1);
                                      a.field_a.c(var5_ref_String, var15 + 3, 10 + var3, var13, -1);
                                      ed.c();
                                      var5_ref_String = 1 + var16 / 6 + "-" + (1 + var16 % 6);
                                      if (1 + var16 / 6 == 7) {
                                        var5_ref_String = q.field_l;
                                        break L146;
                                      } else {
                                        break L146;
                                      }
                                    }
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
                                    break L144;
                                  }
                                  break L132;
                                }
                                var12++;
                                continue L130;
                              }
                            }
                          } else {
                            a.field_a.b(rd.field_a, 466, 248, 16744448, -1);
                            break L129;
                          }
                        } else {
                          a.field_a.b(lf.field_a, 466, 144, 16744448, -1);
                          break L129;
                        }
                      }
                      var3 = 418;
                      break L0;
                    } else {
                      a.field_a.b(dj.field_c, 466, 248, 16744448, -1);
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              L147: {
                hl.field_b.b(43);
                if (0 >= tj.field_I) {
                  break L147;
                } else {
                  if (tj.field_I < 256) {
                    ed.d(0, 0, 640, 480, 0, tj.field_I);
                    break L147;
                  } else {
                    ed.d(0, 0, 640, 480, 0, -tj.field_I + 510);
                    break L147;
                  }
                }
              }
              L148: {
                L149: {
                  if (-350 < hi.field_a) {
                    break L149;
                  } else {
                    if ((qh.field_l ^ -1) != -1) {
                      break L148;
                    } else {
                      break L149;
                    }
                  }
                }
                L150: {
                  var3 = hi.field_a;
                  if (qh.field_l != 0) {
                    break L150;
                  } else {
                    L151: {
                      if (pg.field_q) {
                        stackOut_509_0 = 0;
                        stackIn_510_0 = stackOut_509_0;
                        break L151;
                      } else {
                        stackOut_508_0 = 1;
                        stackIn_510_0 = stackOut_508_0;
                        break L151;
                      }
                    }
                    if (stackIn_510_0 != 1) {
                      break L150;
                    } else {
                      break L150;
                    }
                  }
                }
                L152: {
                  if (-241 < (hi.field_a ^ -1)) {
                    hi.field_a = hi.field_a + 250;
                    if (hi.field_a > 240) {
                      hi.field_a = 240;
                      break L152;
                    } else {
                      break L152;
                    }
                  } else {
                    break L152;
                  }
                }
                L153: {
                  var4_int = (-240 + hi.field_a) * (-240 + hi.field_a) / 120;
                  if (-241 >= (hi.field_a ^ -1)) {
                    break L153;
                  } else {
                    var4_int = -var4_int;
                    break L153;
                  }
                }
                L154: {
                  var4_int += 240;
                  ed.c(5 + (-(jj.field_b.b(bb.field_j) / 2) + 320 - 16), -11 + -jj.field_b.field_M + var4_int, jj.field_b.b(bb.field_j) - -32 - 10, -10 + hj.field_g.field_M - -16, 13158);
                  ig.a(pd.field_H, -16 + -(jj.field_b.b(bb.field_j) / 2) + 320, (byte) -110, 16 + hj.field_g.field_M, 32 + jj.field_b.b(bb.field_j), var4_int - jj.field_b.field_M + -16);
                  this.a(var4_int, bb.field_j, 16777215, -57, 319);
                  if (-1 != (qh.field_l ^ -1)) {
                    break L154;
                  } else {
                    if ((qh.field_g ^ -1) <= -1) {
                      L155: {
                        var5 = 64 + var4_int;
                        if (0 != ql.field_c) {
                          break L155;
                        } else {
                          if (ef.field_F != bb.field_j) {
                            var6 = jj.field_b.b(ol.field_d);
                            ed.c(5 + (320 - var6 / 2 - 16), 5 + (-jj.field_b.field_M + (var5 + -16)), var6 - -32 + -10, 118 + hj.field_g.field_M, 13158);
                            ig.a(pd.field_H, -16 + (320 + -(var6 / 2)), (byte) -110, hj.field_g.field_M + 128, var6 + 32, var5 - jj.field_b.field_M - 16);
                            this.a(var5, r.field_c, 16777215, 123, 319);
                            var5 += 32;
                            this.a(var5, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 45, i.field_c), 16777215, -83, 319);
                            var5 += 32;
                            this.a(var5, di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 126, pb.field_i), 16777215, -91, 319);
                            var5 += 32;
                            break L155;
                          } else {
                            break L155;
                          }
                        }
                      }
                      L156: {
                        if (1 != ql.field_c) {
                          break L156;
                        } else {
                          var6 = 500;
                          ed.c(304 - var6 / 2 - -5, -jj.field_b.field_M + (var5 - 16 - -5), -10 + var6 + 32, 96 + (hj.field_g.field_M + -10), 13158);
                          ig.a(pd.field_H, -16 + (-(var6 / 2) + 320), (byte) -110, hj.field_g.field_M + 96, var6 + 32, -16 + (var5 - jj.field_b.field_M));
                          discarded$60 = jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6 / 2) + 320 + -1, 5 + (-16 + var5 - (-4 - (-jj.field_b.field_M + -1))), var6, 480, 0, 0, 1, 0, jj.field_b.field_M);
                          discarded$61 = jj.field_b.a(fa.field_d + " " + ta.field_f, -(var6 / 2) + 320 + -1, 5 + -jj.field_b.field_M + 4 + (var5 - 16) - 1, var6, 480, 0, 0, 1, 0, jj.field_b.field_M);
                          discarded$62 = jj.field_b.a(fa.field_d + " " + ta.field_f, 320 + -(var6 / 2), -16 + -jj.field_b.field_M + 4 + (var5 + 5), var6, 480, 16777215, -1, 1, 0, jj.field_b.field_M);
                          var5 += 64;
                          break L156;
                        }
                      }
                      L157: {
                        if (2 != ql.field_c) {
                          break L157;
                        } else {
                          L158: {
                            var6 = jj.field_b.b(vl.field_a);
                            if ((jj.field_b.b(ol.field_d) ^ -1) >= (var6 ^ -1)) {
                              break L158;
                            } else {
                              var6 = jj.field_b.b(ol.field_d);
                              break L158;
                            }
                          }
                          L159: {
                            if (608 >= var6) {
                              ed.c(5 + -(var6 / 2) + 320 - 16, -11 + (-jj.field_b.field_M + var5), -10 + (32 + var6), hj.field_g.field_M - -150, 13158);
                              ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 160, var6 + 32, var5 - jj.field_b.field_M + -16);
                              this.a(var5, cd.field_h, 16777215, -102, 319);
                              var5 += 32;
                              this.a(var5, vl.field_a, 16777215, -126, 319);
                              var5 += 32;
                              this.a(var5, ld.field_a, 16777215, -35, 319);
                              var5 += 32;
                              break L159;
                            } else {
                              var6 = 608;
                              ed.c(5 + -(var6 / 2) + 320 - 16, -jj.field_b.field_M + var5 - 16 + 5, -10 + (32 + var6), 128 + (hj.field_g.field_M + -10), 13158);
                              ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 128, 32 + var6, -jj.field_b.field_M + var5 + -16);
                              var28 = cd.field_h + " " + vl.field_a + " " + ld.field_a;
                              discarded$63 = a.field_a.a(var28, 32, -20 + var5, 575, 48, 0, 0, 1, 1, 14);
                              discarded$64 = a.field_a.a(var28, 32, -20 + var5 - 1, 576, 48, 0, 0, 1, 1, 14);
                              discarded$65 = a.field_a.a(var28, 32, var5 - 20, 576, 48, 16777215, -1, 1, 1, 14);
                              var5 += 48;
                              break L159;
                            }
                          }
                          jj.field_a[0].e(222, -20 + var5);
                          jj.field_a[2].e(254, var5 + -20);
                          jj.field_a[1].e(286, var5 - 20);
                          jj.field_a[3].e(318, var5 + -20);
                          jj.field_a[4].e(350, -20 + var5);
                          jj.field_a[6].e(382, -20 + var5);
                          var5 += 32;
                          break L157;
                        }
                      }
                      L160: {
                        if ((ql.field_c ^ -1) == -4) {
                          var6 = 600;
                          ed.c(-11 + (-(var6 / 2) + 320), -11 + (-jj.field_b.field_M + var5), 22 + var6, 160 + (hj.field_g.field_M + -10), 13158);
                          ig.a(pd.field_H, -16 + -(var6 / 2) + 320, (byte) -110, 160 + hj.field_g.field_M, 32 + var6, -16 + var5 + -jj.field_b.field_M);
                          discarded$66 = jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 102, ag.field_w), -(var6 / 2) + 319, var5 - 24, var6, 480, 0, 0, 0, 0, 20);
                          discarded$67 = jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 61, ag.field_w), -(var6 / 2) + 320, -25 + var5, var6, 480, 0, 0, 0, 0, 20);
                          discarded$68 = jj.field_b.a(di.a(new String[]{wl.field_h[hh.field_S], wl.field_h[nf.field_d]}, (byte) 107, ag.field_w), -(var6 / 2) + 320, -24 + var5, var6, 480, 16777215, -1, 0, 0, 20);
                          var5 += 32;
                          var5 -= 24;
                          var29 = new String[9];
                          var7_ref_String__ = var29;
                          var8 = 0;
                          L161: while (true) {
                            if ((var8 ^ -1) <= -10) {
                              L162: {
                                var8 = 0;
                                var9 = 0;
                                if ((mh.field_tb ^ -1) != -2) {
                                  break L162;
                                } else {
                                  var9 = -80;
                                  break L162;
                                }
                              }
                              var10 = var9 + 440;
                              L163: while (true) {
                                if (var10 > 610 - -var9) {
                                  var8 = 0;
                                  ed.c(0, 0, 395 + var9, 480);
                                  var10 = 440 + var9;
                                  L164: while (true) {
                                    if (610 + var9 < var10) {
                                      ed.c();
                                      var5 += 24;
                                      var5 += 32;
                                      discarded$69 = jj.field_b.a(lc.field_c + " " + sd.field_e, -(var6 / 2) + 320, -25 + var5, var6, 480, 0, 0, 1, 0, 20);
                                      discarded$70 = jj.field_b.a(lc.field_c + " " + sd.field_e, 319 + -(var6 / 2), var5 - 24, var6, 480, 0, 0, 1, 0, 20);
                                      discarded$71 = jj.field_b.a(lc.field_c + " " + sd.field_e, 320 + -(var6 / 2), var5 - 24, var6, 480, 16777215, -1, 1, 0, 20);
                                      var5 += 64;
                                      break L160;
                                    } else {
                                      L165: {
                                        ok.field_d[0].a(-140 + var10, var5 + 0, 30, 30);
                                        incrementValue$72 = var8;
                                        var8++;
                                        jj.field_b.b(var7_ref_String__[incrementValue$72], 15 + var10 + -140, var5 + 25, 0, -1);
                                        if ((fi.field_x ^ -1) >= -101) {
                                          break L165;
                                        } else {
                                          if ((fi.field_x ^ -1) <= -111) {
                                            break L165;
                                          } else {
                                            ok.field_d[0].a(-140 + (var10 - -5), 5 + var5, 20, 20);
                                            break L165;
                                          }
                                        }
                                      }
                                      var10 += 20;
                                      continue L164;
                                    }
                                  }
                                } else {
                                  ok.field_d[0].b(-140 + var10, 0 + var5, 30, 30, 64);
                                  jj.field_b.b(var29[var8], var10 + -140 + 15, var5 + 24, 0, -1);
                                  jj.field_b.b(var29[var8], var10 + -125, 26 - -var5, 0, -1);
                                  jj.field_b.b(var29[var8], -1 + (var10 - 140 + 15), 25 + var5, 0, -1);
                                  jj.field_b.b(var29[var8], 15 + var10 + -140 - -1, var5 + 25, 0, -1);
                                  incrementValue$73 = var8;
                                  var8++;
                                  jj.field_b.b(var7_ref_String__[incrementValue$73], var10 + -140 + 15, var5 + 25, 16777215, -1);
                                  var10 += 20;
                                  continue L163;
                                }
                              }
                            } else {
                              var7_ref_String__[var8] = sc.a((byte) 127, bb.field_g.charAt(var8));
                              var8++;
                              continue L161;
                            }
                          }
                        } else {
                          break L160;
                        }
                      }
                      L166: {
                        if (-5 != (ql.field_c ^ -1)) {
                          break L166;
                        } else {
                          var6 = jj.field_b.b(ab.field_b);
                          ed.c(-11 + -(var6 / 2) + 320, -jj.field_b.field_M + var5 + -11, 22 + var6, 96 + (hj.field_g.field_M + -10), 13158);
                          ig.a(pd.field_H, -16 + (-(var6 / 2) + 320), (byte) -110, hj.field_g.field_M - -96, var6 + 32, -16 + var5 - jj.field_b.field_M);
                          discarded$74 = jj.field_b.a(ab.field_b + " " + he.field_r, 320 + -(var6 / 2), -25 + var5, var6, 480, 0, 0, 1, 0, 22);
                          discarded$75 = jj.field_b.a(ab.field_b + " " + he.field_r, -(var6 / 2) + 319, -24 + var5, var6, 480, 0, 0, 1, 0, 22);
                          discarded$76 = jj.field_b.a(ab.field_b + " " + he.field_r, 320 + -(var6 / 2), var5 + -24, var6, 480, 16777215, -1, 1, 0, 22);
                          var5 += 64;
                          break L166;
                        }
                      }
                      L167: {
                        if ((ql.field_c ^ -1) != -6) {
                          break L167;
                        } else {
                          var6 = jj.field_b.b(ol.field_d);
                          ed.c(-11 + -(var6 / 2) + 320, -11 + var5 - jj.field_b.field_M, var6 + 22, 128 + hj.field_g.field_M - 10, 13158);
                          ig.a(pd.field_H, 304 - var6 / 2, (byte) -110, hj.field_g.field_M + 128, var6 - -32, -16 + (var5 + -jj.field_b.field_M));
                          this.a(var5, jd.field_c, 16777215, -52, 319);
                          var5 += 32;
                          this.a(var5, ql.field_a, 16777215, 78, 319);
                          var5 += 32;
                          this.a(var5, ug.field_P, 16777215, 95, 319);
                          var5 += 32;
                          break L167;
                        }
                      }
                      L168: {
                        var5 += 16;
                        if (pg.field_q) {
                          stackOut_557_0 = 0;
                          stackIn_558_0 = stackOut_557_0;
                          break L168;
                        } else {
                          stackOut_556_0 = 1;
                          stackIn_558_0 = stackOut_556_0;
                          break L168;
                        }
                      }
                      if (stackIn_558_0 != 0) {
                        this.a(var5, ol.field_d, 16777215, -74, 319);
                        break L154;
                      } else {
                        break L154;
                      }
                    } else {
                      break L154;
                    }
                  }
                }
                hi.field_a = var3;
                break L148;
              }
              L169: {
                if (da.field_e == null) {
                  break L169;
                } else {
                  da.field_e.c(40);
                  break L169;
                }
              }
              L170: {
                L171: {
                  if (1 == sf.field_h) {
                    break L171;
                  } else {
                    if (sf.field_h == 2) {
                      break L171;
                    } else {
                      if ((sf.field_h ^ -1) == -6) {
                        break L171;
                      } else {
                        break L170;
                      }
                    }
                  }
                }
                L172: {
                  L173: {
                    var30 = ne.field_a;
                    ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
                    var4_int = 16776960;
                    if ((this.field_N ^ -1) == -1) {
                      break L173;
                    } else {
                      if ((this.field_N ^ -1) != 0) {
                        break L172;
                      } else {
                        if (0 > pg.field_n) {
                          break L172;
                        } else {
                          if (pg.field_n >= 88) {
                            break L172;
                          } else {
                            if (fi.field_B >= 436) {
                              break L173;
                            } else {
                              break L172;
                            }
                          }
                        }
                      }
                    }
                  }
                  L174: {
                    var4_int = 16777215;
                    if (-2 == (sh.field_c ^ -1)) {
                      break L174;
                    } else {
                      if (!hi.field_p[84]) {
                        break L172;
                      } else {
                        break L174;
                      }
                    }
                  }
                  if (-33 >= (pa.field_c ^ -1)) {
                    break L172;
                  } else {
                    pa.field_c = 32;
                    break L172;
                  }
                }
                L175: {
                  this.b(-12926, var30, var4_int, 44, 458 + jj.field_b.field_M / 4);
                  if (-6 != (sf.field_h ^ -1)) {
                    break L175;
                  } else {
                    if (qf.field_l <= 0) {
                      break L175;
                    } else {
                      L176: {
                        L177: {
                          var4_int = -32 + -hj.field_g.b(var30) + 640;
                          var31 = cf.field_m;
                          var4_int = var4_int - (jj.field_b.b(var31) + 32);
                          ig.a(qc.field_E, var4_int, (byte) -110, 44, 32 + jj.field_b.b(var31), 436);
                          var5 = 16776960;
                          if (-2 == (this.field_N ^ -1)) {
                            break L177;
                          } else {
                            if ((pg.field_n ^ -1) > (var4_int ^ -1)) {
                              break L176;
                            } else {
                              if ((pg.field_n ^ -1) <= (jj.field_b.b(var31) + 32 + var4_int ^ -1)) {
                                break L176;
                              } else {
                                if (436 > fi.field_B) {
                                  break L176;
                                } else {
                                  if (this.field_N != -1) {
                                    break L176;
                                  } else {
                                    break L177;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L178: {
                          L179: {
                            if (sh.field_c != 0) {
                              break L179;
                            } else {
                              if (!hi.field_p[84]) {
                                break L178;
                              } else {
                                break L179;
                              }
                            }
                          }
                          if (0 == pa.field_c) {
                            th.field_i = 3;
                            pa.field_c = 32;
                            break L178;
                          } else {
                            break L178;
                          }
                        }
                        var5 = 16777215;
                        break L176;
                      }
                      this.b(-12926, var31, var5, 16 + var4_int + jj.field_b.b(var31) / 2, 458 - -(jj.field_b.field_M / 4));
                      break L175;
                    }
                  }
                }
                L180: {
                  if (-3 != (sf.field_h ^ -1)) {
                    break L180;
                  } else {
                    if (!e.a(-108)) {
                      var4_int = 88;
                      var5 = 0;
                      L181: while (true) {
                        if (var5 > 2) {
                          break L180;
                        } else {
                          L182: {
                            var4_int += 8;
                            var6 = 176;
                            var3_ref_String = wh.field_l[var5];
                            ig.a(qc.field_E, var4_int, (byte) -110, 44, var6, 436);
                            var7 = 16776960;
                            if ((cd.field_c ^ -1) == (var5 ^ -1)) {
                              var7 = 16711680;
                              break L182;
                            } else {
                              break L182;
                            }
                          }
                          L183: {
                            L184: {
                              if (this.field_N == var5 + 1) {
                                break L184;
                              } else {
                                if (0 != (this.field_N ^ -1)) {
                                  break L183;
                                } else {
                                  if ((pg.field_n ^ -1) > (var4_int ^ -1)) {
                                    break L183;
                                  } else {
                                    if (pg.field_n >= var6 + var4_int) {
                                      break L183;
                                    } else {
                                      if ((fi.field_B ^ -1) > -437) {
                                        break L183;
                                      } else {
                                        break L184;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L185: {
                              L186: {
                                if (-1 != (sh.field_c ^ -1)) {
                                  break L186;
                                } else {
                                  if (!hi.field_p[84]) {
                                    break L185;
                                  } else {
                                    break L186;
                                  }
                                }
                              }
                              cd.field_c = var5;
                              break L185;
                            }
                            if ((var7 ^ -1) != -16711681) {
                              var7 = 16777215;
                              break L183;
                            } else {
                              var7 = 16744576;
                              break L183;
                            }
                          }
                          this.b(-12926, var3_ref_String, var7, var4_int - -(var6 / 2), jj.field_b.field_M / 4 + 458);
                          var4_int = var4_int + var6;
                          var5++;
                          continue L181;
                        }
                      }
                    } else {
                      break L180;
                    }
                  }
                }
                if (!e.a(-128)) {
                  break L170;
                } else {
                  L187: {
                    if (2 == sf.field_h) {
                      break L187;
                    } else {
                      if (sf.field_h != 5) {
                        break L170;
                      } else {
                        break L187;
                      }
                    }
                  }
                  L188: {
                    L189: {
                      var3_ref_String = ue.field_b;
                      ig.a(qc.field_E, 96, (byte) -110, 44, 176, 436);
                      var4_int = 16776960;
                      if (this.field_N == 1) {
                        break L189;
                      } else {
                        if (96 >= pg.field_n) {
                          break L188;
                        } else {
                          if ((pg.field_n ^ -1) <= -265) {
                            break L188;
                          } else {
                            if (-437 < (fi.field_B ^ -1)) {
                              break L188;
                            } else {
                              if (-1 != this.field_N) {
                                break L188;
                              } else {
                                break L189;
                              }
                            }
                          }
                        }
                      }
                    }
                    L190: {
                      L191: {
                        if (-1 != (sh.field_c ^ -1)) {
                          break L191;
                        } else {
                          if (hi.field_p[84]) {
                            break L191;
                          } else {
                            break L190;
                          }
                        }
                      }
                      sl.a(sf.field_h, sf.field_h, -128);
                      break L190;
                    }
                    var4_int = 16777215;
                    break L188;
                  }
                  this.b(-12926, var3_ref_String, var4_int, 184, 458 - -(jj.field_b.field_M / 4));
                  break L170;
                }
              }
              L192: {
                if (-10 == (sf.field_h ^ -1)) {
                  ed.c(0, 0, 640, 480, 0);
                  df.a(2);
                  break L192;
                } else {
                  break L192;
                }
              }
              L193: {
                var3 = 8 / ((param0 - -43) / 50);
                if ((sf.field_h ^ -1) != -7) {
                  break L193;
                } else {
                  L194: {
                    var32 = a.field_a;
                    var5 = 180 - -var32.field_M;
                    var6 = 4 + (var32.field_B + var32.field_q);
                    ed.d(40, 170, 560, 20 + (120 + 5 * var6), 0, 192);
                    ig.a(pd.field_H, 31, (byte) -110, 14 + (20 + (5 * var6 - -120)), 578, 163);
                    var32.b(vg.field_U, 320, var5, 16777215, -1);
                    stackOut_637_0 = (gb) (var32);
                    stackIn_639_0 = stackOut_637_0;
                    stackIn_638_0 = stackOut_637_0;
                    if (0 == qf.field_l) {
                      stackOut_639_0 = (gb) ((Object) stackIn_639_0);
                      stackOut_639_1 = 0;
                      stackIn_640_0 = stackOut_639_0;
                      stackIn_640_1 = stackOut_639_1;
                      break L194;
                    } else {
                      stackOut_638_0 = (gb) ((Object) stackIn_638_0);
                      stackOut_638_1 = 1;
                      stackIn_640_0 = stackOut_638_0;
                      stackIn_640_1 = stackOut_638_1;
                      break L194;
                    }
                  }
                  L195: {
                    stackOut_640_0 = (gb) ((Object) stackIn_640_0);
                    stackOut_640_1 = stackIn_640_1;
                    stackIn_642_0 = stackOut_640_0;
                    stackIn_642_1 = stackOut_640_1;
                    stackIn_641_0 = stackOut_640_0;
                    stackIn_641_1 = stackOut_640_1;
                    if (ke.field_u.f(8192)) {
                      stackOut_642_0 = (gb) ((Object) stackIn_642_0);
                      stackOut_642_1 = stackIn_642_1;
                      stackOut_642_2 = 0;
                      stackIn_643_0 = stackOut_642_0;
                      stackIn_643_1 = stackOut_642_1;
                      stackIn_643_2 = stackOut_642_2;
                      break L195;
                    } else {
                      stackOut_641_0 = (gb) ((Object) stackIn_641_0);
                      stackOut_641_1 = stackIn_641_1;
                      stackOut_641_2 = 1;
                      stackIn_643_0 = stackOut_641_0;
                      stackIn_643_1 = stackOut_641_1;
                      stackIn_643_2 = stackOut_641_2;
                      break L195;
                    }
                  }
                  L196: {
                    stackOut_643_0 = (gb) ((Object) stackIn_643_0);
                    stackOut_643_1 = stackIn_643_1;
                    stackOut_643_2 = stackIn_643_2;
                    stackIn_645_0 = stackOut_643_0;
                    stackIn_645_1 = stackOut_643_1;
                    stackIn_645_2 = stackOut_643_2;
                    stackIn_644_0 = stackOut_643_0;
                    stackIn_644_1 = stackOut_643_1;
                    stackIn_644_2 = stackOut_643_2;
                    if ((sg.field_f ^ -1) == -1) {
                      stackOut_645_0 = (gb) ((Object) stackIn_645_0);
                      stackOut_645_1 = stackIn_645_1;
                      stackOut_645_2 = stackIn_645_2;
                      stackOut_645_3 = 0;
                      stackIn_646_0 = stackOut_645_0;
                      stackIn_646_1 = stackOut_645_1;
                      stackIn_646_2 = stackOut_645_2;
                      stackIn_646_3 = stackOut_645_3;
                      break L196;
                    } else {
                      stackOut_644_0 = (gb) ((Object) stackIn_644_0);
                      stackOut_644_1 = stackIn_644_1;
                      stackOut_644_2 = stackIn_644_2;
                      stackOut_644_3 = 1;
                      stackIn_646_0 = stackOut_644_0;
                      stackIn_646_1 = stackOut_644_1;
                      stackIn_646_2 = stackOut_644_2;
                      stackIn_646_3 = stackOut_644_3;
                      break L196;
                    }
                  }
                  L197: {
                    ((gb) (Object) stackIn_646_0).b(h.a(stackIn_646_1 != 0, stackIn_646_2 != 0, stackIn_646_3 != 0, 26505), 320, var5 - -var6, 16777215, -1);
                    if (this.a(var5 + 4 * var6, 320, 65535, cd.field_d, 1)) {
                      break L197;
                    } else {
                      break L197;
                    }
                  }
                  L198: {
                    stackOut_647_0 = (gb) (var32);
                    stackIn_649_0 = stackOut_647_0;
                    stackIn_648_0 = stackOut_647_0;
                    if ((qf.field_l ^ -1) == -1) {
                      stackOut_649_0 = (gb) ((Object) stackIn_649_0);
                      stackOut_649_1 = 0;
                      stackIn_650_0 = stackOut_649_0;
                      stackIn_650_1 = stackOut_649_1;
                      break L198;
                    } else {
                      stackOut_648_0 = (gb) ((Object) stackIn_648_0);
                      stackOut_648_1 = 1;
                      stackIn_650_0 = stackOut_648_0;
                      stackIn_650_1 = stackOut_648_1;
                      break L198;
                    }
                  }
                  L199: {
                    stackOut_650_0 = (gb) ((Object) stackIn_650_0);
                    stackOut_650_1 = stackIn_650_1;
                    stackOut_650_2 = 2;
                    stackIn_652_0 = stackOut_650_0;
                    stackIn_652_1 = stackOut_650_1;
                    stackIn_652_2 = stackOut_650_2;
                    stackIn_651_0 = stackOut_650_0;
                    stackIn_651_1 = stackOut_650_1;
                    stackIn_651_2 = stackOut_650_2;
                    if (-1 == (sg.field_f ^ -1)) {
                      stackOut_652_0 = (gb) ((Object) stackIn_652_0);
                      stackOut_652_1 = stackIn_652_1;
                      stackOut_652_2 = stackIn_652_2;
                      stackOut_652_3 = 0;
                      stackIn_653_0 = stackOut_652_0;
                      stackIn_653_1 = stackOut_652_1;
                      stackIn_653_2 = stackOut_652_2;
                      stackIn_653_3 = stackOut_652_3;
                      break L199;
                    } else {
                      stackOut_651_0 = (gb) ((Object) stackIn_651_0);
                      stackOut_651_1 = stackIn_651_1;
                      stackOut_651_2 = stackIn_651_2;
                      stackOut_651_3 = 1;
                      stackIn_653_0 = stackOut_651_0;
                      stackIn_653_1 = stackOut_651_1;
                      stackIn_653_2 = stackOut_651_2;
                      stackIn_653_3 = stackOut_651_3;
                      break L199;
                    }
                  }
                  L200: {
                    stackOut_653_0 = (gb) ((Object) stackIn_653_0);
                    stackOut_653_1 = stackIn_653_1;
                    stackOut_653_2 = stackIn_653_2;
                    stackOut_653_3 = stackIn_653_3;
                    stackIn_655_0 = stackOut_653_0;
                    stackIn_655_1 = stackOut_653_1;
                    stackIn_655_2 = stackOut_653_2;
                    stackIn_655_3 = stackOut_653_3;
                    stackIn_654_0 = stackOut_653_0;
                    stackIn_654_1 = stackOut_653_1;
                    stackIn_654_2 = stackOut_653_2;
                    stackIn_654_3 = stackOut_653_3;
                    if (ke.field_u.f(8192)) {
                      stackOut_655_0 = (gb) ((Object) stackIn_655_0);
                      stackOut_655_1 = stackIn_655_1;
                      stackOut_655_2 = stackIn_655_2;
                      stackOut_655_3 = stackIn_655_3;
                      stackOut_655_4 = 0;
                      stackIn_656_0 = stackOut_655_0;
                      stackIn_656_1 = stackOut_655_1;
                      stackIn_656_2 = stackOut_655_2;
                      stackIn_656_3 = stackOut_655_3;
                      stackIn_656_4 = stackOut_655_4;
                      break L200;
                    } else {
                      stackOut_654_0 = (gb) ((Object) stackIn_654_0);
                      stackOut_654_1 = stackIn_654_1;
                      stackOut_654_2 = stackIn_654_2;
                      stackOut_654_3 = stackIn_654_3;
                      stackOut_654_4 = 1;
                      stackIn_656_0 = stackOut_654_0;
                      stackIn_656_1 = stackOut_654_1;
                      stackIn_656_2 = stackOut_654_2;
                      stackIn_656_3 = stackOut_654_3;
                      stackIn_656_4 = stackOut_654_4;
                      break L200;
                    }
                  }
                  L201: {
                    ((gb) (Object) stackIn_656_0).b(ka.a(stackIn_656_1 != 0, stackIn_656_2, stackIn_656_3 != 0, stackIn_656_4 != 0), 320, (int)(2.5 * (double)var6) + var5 + 60, 16777215, -1);
                    discarded$77 = this.a(60 + (var6 / 2 + var6 * 5 + var5), 320, 65535, gf.field_X, 1);
                    stackOut_656_0 = (gb) (var32);
                    stackIn_658_0 = stackOut_656_0;
                    stackIn_657_0 = stackOut_656_0;
                    if (0 == sg.field_f) {
                      stackOut_658_0 = (gb) ((Object) stackIn_658_0);
                      stackOut_658_1 = 0;
                      stackIn_659_0 = stackOut_658_0;
                      stackIn_659_1 = stackOut_658_1;
                      break L201;
                    } else {
                      stackOut_657_0 = (gb) ((Object) stackIn_657_0);
                      stackOut_657_1 = 1;
                      stackIn_659_0 = stackOut_657_0;
                      stackIn_659_1 = stackOut_657_1;
                      break L201;
                    }
                  }
                  L202: {
                    stackOut_659_0 = (gb) ((Object) stackIn_659_0);
                    stackOut_659_1 = stackIn_659_1;
                    stackOut_659_2 = -3567;
                    stackOut_659_3 = 0;
                    stackIn_661_0 = stackOut_659_0;
                    stackIn_661_1 = stackOut_659_1;
                    stackIn_661_2 = stackOut_659_2;
                    stackIn_661_3 = stackOut_659_3;
                    stackIn_660_0 = stackOut_659_0;
                    stackIn_660_1 = stackOut_659_1;
                    stackIn_660_2 = stackOut_659_2;
                    stackIn_660_3 = stackOut_659_3;
                    if (0 == qf.field_l) {
                      stackOut_661_0 = (gb) ((Object) stackIn_661_0);
                      stackOut_661_1 = stackIn_661_1;
                      stackOut_661_2 = stackIn_661_2;
                      stackOut_661_3 = stackIn_661_3;
                      stackOut_661_4 = 0;
                      stackIn_662_0 = stackOut_661_0;
                      stackIn_662_1 = stackOut_661_1;
                      stackIn_662_2 = stackOut_661_2;
                      stackIn_662_3 = stackOut_661_3;
                      stackIn_662_4 = stackOut_661_4;
                      break L202;
                    } else {
                      stackOut_660_0 = (gb) ((Object) stackIn_660_0);
                      stackOut_660_1 = stackIn_660_1;
                      stackOut_660_2 = stackIn_660_2;
                      stackOut_660_3 = stackIn_660_3;
                      stackOut_660_4 = 1;
                      stackIn_662_0 = stackOut_660_0;
                      stackIn_662_1 = stackOut_660_1;
                      stackIn_662_2 = stackOut_660_2;
                      stackIn_662_3 = stackOut_660_3;
                      stackIn_662_4 = stackOut_660_4;
                      break L202;
                    }
                  }
                  ((gb) (Object) stackIn_662_0).b(l.a(stackIn_662_1 != 0, stackIn_662_2, stackIn_662_3 != 0, stackIn_662_4 != 0), 320, 120 + (var5 + 4 * var6), 16777215, -1);
                  break L193;
                }
              }
              L203: {
                if (sf.field_h == 7) {
                  ih.a(0);
                  sf.field_h = 8;
                  break L203;
                } else {
                  if (sf.field_h == 8) {
                    if (e.a(-113)) {
                      sf.field_h = n.field_c;
                      break L203;
                    } else {
                      sf.field_h = hk.field_Y;
                      if (sf.field_h == 10) {
                        L204: {
                          da.a(7775, ql.field_c - -(qh.field_l * 6) + sg.field_f * 64);
                          ic.field_a = ic.field_a + (sg.field_f << -125900922);
                          me.field_f = me.field_f + (-6 + ql.field_c);
                          wg.field_b = wg.field_b - (6 * qh.field_l + 1);
                          stackOut_669_0 = this;
                          stackIn_671_0 = stackOut_669_0;
                          stackIn_670_0 = stackOut_669_0;
                          if (hl.field_a <= 0) {
                            stackOut_671_0 = this;
                            stackOut_671_1 = 0;
                            stackIn_672_0 = stackOut_671_0;
                            stackIn_672_1 = stackOut_671_1;
                            break L204;
                          } else {
                            stackOut_670_0 = this;
                            stackOut_670_1 = 1;
                            stackIn_672_0 = stackOut_670_0;
                            stackIn_672_1 = stackOut_670_1;
                            break L204;
                          }
                        }
                        ((wizardrun) (this)).field_J = stackIn_672_1 != 0;
                        sg.field_f = 0;
                        qh.field_l = -1;
                        ql.field_c = 6;
                        sf.field_h = 2;
                        if (qf.field_l > 0) {
                          sf.field_h = 5;
                          break L203;
                        } else {
                          break L203;
                        }
                      } else {
                        break L203;
                      }
                    }
                  } else {
                    break L203;
                  }
                }
              }
              L205: {
                if ((this.field_I ^ -1) >= -1) {
                  break L205;
                } else {
                  if (da.field_e != null) {
                    break L205;
                  } else {
                    ed.c(0, 0, 640, 480, 0);
                    break L205;
                  }
                }
              }
              L206: {
                if (-1 > (se.field_a ^ -1)) {
                  ed.d(0, 0, 640, 480, 0, se.field_a);
                  break L206;
                } else {
                  break L206;
                }
              }
              L207: {
                if (pa.field_c <= 0) {
                  break L207;
                } else {
                  if ((pa.field_c ^ -1) > -257) {
                    ed.d(0, 0, 640, 480, 0, pa.field_c);
                    break L207;
                  } else {
                    ed.d(0, 0, 640, 480, 0, 512 + -pa.field_c);
                    break L207;
                  }
                }
              }
              L208: {
                if (!md.field_d) {
                  break L208;
                } else {
                  L209: {
                    L210: {
                      bk.field_b.c(0, 0, pa.field_c);
                      var4 = ne.field_a;
                      ig.a(qc.field_E, 0, (byte) -110, 44, 88, 436);
                      var5 = 16776960;
                      if (0 == this.field_N) {
                        break L210;
                      } else {
                        if (0 != (this.field_N ^ -1)) {
                          break L209;
                        } else {
                          if (-1 < (pg.field_n ^ -1)) {
                            break L209;
                          } else {
                            if (88 <= pg.field_n) {
                              break L209;
                            } else {
                              if (436 <= fi.field_B) {
                                break L210;
                              } else {
                                break L209;
                              }
                            }
                          }
                        }
                      }
                    }
                    L211: {
                      L212: {
                        if (-2 == (sh.field_c ^ -1)) {
                          break L212;
                        } else {
                          if (!hi.field_p[84]) {
                            break L211;
                          } else {
                            break L212;
                          }
                        }
                      }
                      pl.field_D = true;
                      break L211;
                    }
                    var5 = 16777215;
                    break L209;
                  }
                  this.b(-12926, var4, var5, 44, 458 - -(jj.field_b.field_M / 4));
                  break L208;
                }
              }
              L213: {
                var33_ref = (ra) ((Object) uc.field_b.b((byte) 87));
                if (var33_ref != null) {
                  L214: {
                    var6 = this.field_M;
                    if (80 > var6) {
                      var5 = var6 / 2 + -32;
                      break L214;
                    } else {
                      if (var6 < 230) {
                        var5 = 8;
                        break L214;
                      } else {
                        var5 = 123 - var6 / 2;
                        break L214;
                      }
                    }
                  }
                  ed.c(4, var5 + -4, 48 - -jj.field_b.b(nl.field_t[var33_ref.field_n]), 40, 13158);
                  ig.a(pd.field_H, 0, (byte) -110, 48, 8 + (jj.field_b.b(nl.field_t[var33_ref.field_n]) + 48), var5 + -8);
                  ui.field_a[var33_ref.field_n].a(8, var5, 32, 32);
                  jj.field_b.c(nl.field_t[var33_ref.field_n], 48, jj.field_b.field_M + var5, 16776960, -1);
                  break L213;
                } else {
                  break L213;
                }
              }
              L215: {
                if (!oa.a(-25231)) {
                  if (dg.b(70)) {
                    rl.a(dh.a(255), false);
                    break L215;
                  } else {
                    break L215;
                  }
                } else {
                  ed.d(0, 0, 640, 480, 0, 128);
                  ed.c(-3 + -(pf.c((byte) -117) / 2) + 320, 240 - (lb.a((byte) 47) / 2 + 5), 6 - -pf.c((byte) 84), 10 - -lb.a((byte) 47), 0);
                  of.a(72);
                  break L215;
                }
              }
              L216: {
                if (ke.field_w) {
                  jj.field_b.b("DEBUG PAUSE ON: PRESS 'V' TO CONTINUE", 320, 460, 16711680, 0);
                  break L216;
                } else {
                  break L216;
                }
              }
              fc.a((byte) 80, 0, var19, 0);
              return;
            }
          } else {
            uc.a(false, var19);
            return;
          }
        } else {
          ud.a((byte) 38, dh.a(255), var19);
          return;
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if ((sh.field_c ^ -1) != -1) {
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
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
            stackOut_19_0 = (RuntimeException) (var6);
            stackOut_19_1 = new StringBuilder().append("wizardrun.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
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
            int fieldTemp$21 = 0;
            wl discarded$22 = null;
            int fieldTemp$23 = 0;
            int fieldTemp$24 = 0;
            int fieldTemp$25 = 0;
            int fieldTemp$26 = 0;
            int fieldTemp$27 = 0;
            int fieldTemp$28 = 0;
            int fieldTemp$29 = 0;
            int fieldTemp$30 = 0;
            int fieldTemp$31 = 0;
            int fieldTemp$32 = 0;
            int fieldTemp$33 = 0;
            int fieldTemp$34 = 0;
            int fieldTemp$35 = 0;
            int fieldTemp$36 = 0;
            int fieldTemp$37 = 0;
            int fieldTemp$38 = 0;
            int incrementValue$39 = 0;
            int incrementValue$40 = 0;
            int incrementValue$41 = 0;
            int var2 = 0;
            ob var2_ref_ob = null;
            int var3 = 0;
            int var4 = 0;
            byte[] var4_ref_byte__ = null;
            int var5 = 0;
            Exception var6 = null;
            int var6_int = 0;
            int var7 = 0;
            int var8 = 0;
            ob var9 = null;
            ob var10 = null;
            gb var11 = null;
            byte[] var12 = null;
            ob var13 = null;
            ob var14 = null;
            byte[] var15 = null;
            gb stackIn_29_0 = null;
            gb stackIn_30_0 = null;
            gb stackIn_31_0 = null;
            int stackIn_31_1 = 0;
            gb stackIn_32_0 = null;
            int stackIn_32_1 = 0;
            int stackIn_32_2 = 0;
            int stackIn_32_3 = 0;
            gb stackIn_33_0 = null;
            int stackIn_33_1 = 0;
            int stackIn_33_2 = 0;
            int stackIn_33_3 = 0;
            gb stackIn_34_0 = null;
            int stackIn_34_1 = 0;
            int stackIn_34_2 = 0;
            int stackIn_34_3 = 0;
            int stackIn_34_4 = 0;
            int stackIn_37_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_39_1 = 0;
            int stackIn_585_0 = 0;
            int stackIn_586_0 = 0;
            int stackIn_587_0 = 0;
            int stackIn_587_1 = 0;
            int stackIn_753_0 = 0;
            int stackIn_754_0 = 0;
            int stackIn_755_0 = 0;
            int stackIn_755_1 = 0;
            int stackIn_765_0 = 0;
            int stackIn_806_0 = 0;
            Throwable caughtException = null;
            Throwable decompiledCaughtException = null;
            gb stackOut_28_0 = null;
            gb stackOut_30_0 = null;
            int stackOut_30_1 = 0;
            gb stackOut_29_0 = null;
            int stackOut_29_1 = 0;
            gb stackOut_31_0 = null;
            int stackOut_31_1 = 0;
            int stackOut_31_2 = 0;
            int stackOut_31_3 = 0;
            gb stackOut_33_0 = null;
            int stackOut_33_1 = 0;
            int stackOut_33_2 = 0;
            int stackOut_33_3 = 0;
            int stackOut_33_4 = 0;
            gb stackOut_32_0 = null;
            int stackOut_32_1 = 0;
            int stackOut_32_2 = 0;
            int stackOut_32_3 = 0;
            int stackOut_32_4 = 0;
            int stackOut_36_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_38_1 = 0;
            int stackOut_37_0 = 0;
            int stackOut_37_1 = 0;
            int stackOut_584_0 = 0;
            int stackOut_586_0 = 0;
            int stackOut_586_1 = 0;
            int stackOut_585_0 = 0;
            int stackOut_585_1 = 0;
            int stackOut_752_0 = 0;
            int stackOut_754_0 = 0;
            int stackOut_754_1 = 0;
            int stackOut_753_0 = 0;
            int stackOut_753_1 = 0;
            int stackOut_805_0 = 0;
            int stackOut_804_0 = 0;
            int stackOut_764_0 = 0;
            int stackOut_763_0 = 0;
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
                  stackOut_28_0 = (gb) (var11);
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_29_0 = stackOut_28_0;
                  if (-1 == (sg.field_f ^ -1)) {
                    stackOut_30_0 = (gb) ((Object) stackIn_30_0);
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L8;
                  } else {
                    stackOut_29_0 = (gb) ((Object) stackIn_29_0);
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    break L8;
                  }
                }
                L9: {
                  stackOut_31_0 = (gb) ((Object) stackIn_31_0);
                  stackOut_31_1 = stackIn_31_1;
                  stackOut_31_2 = -3567;
                  stackOut_31_3 = 0;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  if (qf.field_l == 0) {
                    stackOut_33_0 = (gb) ((Object) stackIn_33_0);
                    stackOut_33_1 = stackIn_33_1;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    stackIn_34_4 = stackOut_33_4;
                    break L9;
                  } else {
                    stackOut_32_0 = (gb) ((Object) stackIn_32_0);
                    stackOut_32_1 = stackIn_32_1;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_34_4 = stackOut_32_4;
                    break L9;
                  }
                }
                ((gb) (Object) stackIn_34_0).b(l.a(stackIn_34_1 != 0, stackIn_34_2, stackIn_34_3 != 0, stackIn_34_4 != 0), 320, var4 * 4 + (var3 + 120), 16777215, -1);
                break L5;
              }
            }
            L10: {
              if (sf.field_h != 9) {
                break L10;
              } else {
                L11: {
                  stackOut_36_0 = param0 + -54;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if (dg.b(98)) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    break L11;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
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
                    fieldTemp$21 = this.field_M + 1;
                    this.field_M = this.field_M + 1;
                    if (335 == fieldTemp$21) {
                      this.field_M = 0;
                      discarded$22 = uc.field_b.b(-40);
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
                                if ((var2 ^ -1) <= -26) {
                                  rc.field_a = rc.field_a + 1;
                                  if (!pk.field_s) {
                                    break L36;
                                  } else {
                                    tl.field_a.a(si.field_j[0], 100, 256 * ee.field_p / 100);
                                    break L36;
                                  }
                                } else {
                                  L38: {
                                    pb.field_k = pb.field_k + 1;
                                    if (-101 >= (pb.field_k ^ -1)) {
                                      pb.field_k = 0;
                                      break L38;
                                    } else {
                                      break L38;
                                    }
                                  }
                                  md.field_a[pb.field_k][0] = jj.field_b.b(og.field_R[rc.field_a]) * (-13 + var2) / 25 + 177;
                                  md.field_a[pb.field_k][1] = (int)(-Math.random() * (double)jj.field_b.field_M + 208.0 + (double)(32 * rc.field_a));
                                  md.field_a[pb.field_k][2] = 128;
                                  var2++;
                                  continue L37;
                                }
                              }
                            } else {
                              break L36;
                            }
                          }
                          L39: {
                            var2 = 0;
                            if ((pg.field_n ^ -1) == (le.field_i ^ -1)) {
                              break L39;
                            } else {
                              le.field_i = pg.field_n;
                              var2 = 1;
                              break L39;
                            }
                          }
                          L40: {
                            if (fi.field_B != qj.field_d) {
                              var2 = 1;
                              qj.field_d = fi.field_B;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          L41: {
                            if (-3 < (rc.field_a ^ -1)) {
                              var2 = 0;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                          L42: {
                            if (w.field_c != 1) {
                              break L42;
                            } else {
                              var2 = 1;
                              break L42;
                            }
                          }
                          L43: {
                            if ((qh.field_g ^ -1) > -1) {
                              break L43;
                            } else {
                              L44: {
                                if (var2 == 0) {
                                  L45: {
                                    if (2 == si.field_h) {
                                      break L45;
                                    } else {
                                      if (-4 != (si.field_h ^ -1)) {
                                        break L44;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  if (-145 <= (pg.field_n ^ -1)) {
                                    break L44;
                                  } else {
                                    if ((sh.field_c ^ -1) == -2) {
                                      this.a(-114, 2, si.field_h);
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                } else {
                                  si.field_h = -1;
                                  var3 = 208;
                                  var4 = 0;
                                  L46: while (true) {
                                    if ((var4 ^ -1) <= (rc.field_a ^ -1)) {
                                      L47: {
                                        L48: {
                                          L49: {
                                            if ((si.field_h ^ -1) == -3) {
                                              break L49;
                                            } else {
                                              if (3 != si.field_h) {
                                                break L48;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                          if ((pg.field_n ^ -1) > -145) {
                                            break L48;
                                          } else {
                                            if (-2 != (sh.field_c ^ -1)) {
                                              break L47;
                                            } else {
                                              this.a(-123, 2, si.field_h);
                                              break L44;
                                            }
                                          }
                                        }
                                        if (w.field_c == 1) {
                                          this.a(54, 2, si.field_h);
                                          break L47;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      break L44;
                                    } else {
                                      L50: {
                                        if (pg.field_n < 27) {
                                          break L50;
                                        } else {
                                          if (pg.field_n > 327) {
                                            break L50;
                                          } else {
                                            if ((fi.field_B ^ -1) > (-24 + var3 ^ -1)) {
                                              break L50;
                                            } else {
                                              if (fi.field_B <= 8 + var3) {
                                                si.field_h = var4;
                                                break L50;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3 += 32;
                                      var4++;
                                      continue L46;
                                    }
                                  }
                                }
                              }
                              if (0 > si.field_h) {
                                break L43;
                              } else {
                                L51: {
                                  pb.field_k = pb.field_k + 1;
                                  if (pb.field_k < 100) {
                                    break L51;
                                  } else {
                                    pb.field_k = 0;
                                    break L51;
                                  }
                                }
                                L52: {
                                  if (-1 == (pb.field_k % 25 ^ -1)) {
                                    L53: {
                                      md.field_a[0][0] = 161 + -(jj.field_b.b(og.field_R[si.field_h]) / 2);
                                      md.field_a[0][1] = -jj.field_b.field_M / 2 + 208 - -(32 * si.field_h);
                                      if (-3 != (si.field_h ^ -1)) {
                                        break L53;
                                      } else {
                                        md.field_a[0][0] = 27;
                                        break L53;
                                      }
                                    }
                                    L54: {
                                      if (-4 != (si.field_h ^ -1)) {
                                        break L54;
                                      } else {
                                        md.field_a[0][0] = 27;
                                        break L54;
                                      }
                                    }
                                    md.field_a[0][2] = 128;
                                    break L52;
                                  } else {
                                    break L52;
                                  }
                                }
                                if (12 == pb.field_k % 25) {
                                  L55: {
                                    md.field_a[1][0] = 16 + (jj.field_b.b(og.field_R[si.field_h]) / 2 - -177);
                                    if (si.field_h == 2) {
                                      md.field_a[1][0] = 327;
                                      break L55;
                                    } else {
                                      break L55;
                                    }
                                  }
                                  L56: {
                                    md.field_a[1][1] = si.field_h * 32 + -jj.field_b.field_M / 2 + 208;
                                    if (3 == si.field_h) {
                                      md.field_a[1][0] = 327;
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                  md.field_a[1][2] = 128;
                                  break L43;
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
                L57: {
                  L58: {
                    L59: {
                      if (da.field_e == null) {
                        break L59;
                      } else {
                        if (da.field_e.field_p) {
                          break L58;
                        } else {
                          break L59;
                        }
                      }
                    }
                    if (!this.field_P) {
                      L60: {
                        if (0 >= se.field_a) {
                          break L60;
                        } else {
                          se.field_a = se.field_a / 2;
                          break L60;
                        }
                      }
                      if (0 >= se.field_a) {
                        break L57;
                      } else {
                        se.field_a = se.field_a - 1;
                        break L57;
                      }
                    } else {
                      break L58;
                    }
                  }
                  L61: {
                    if (256 <= se.field_a) {
                      break L61;
                    } else {
                      se.field_a = se.field_a / 2 + 128;
                      break L61;
                    }
                  }
                  L62: {
                    if (256 > se.field_a) {
                      se.field_a = se.field_a + 1;
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  if (256 != se.field_a) {
                    break L57;
                  } else {
                    L63: {
                      if (!this.field_P) {
                        break L63;
                      } else {
                        if (wi.field_K != 1) {
                          this.field_P = false;
                          da.field_e = new ph();
                          rf.field_b = 0;
                          rc.field_a = 0;
                          return;
                        } else {
                          break L63;
                        }
                      }
                    }
                    L64: {
                      this.field_P = false;
                      if (sf.field_h == 2) {
                        th.field_g = null;
                        break L64;
                      } else {
                        break L64;
                      }
                    }
                    da.field_e = null;
                    sf.field_h = 0;
                    break L57;
                  }
                }
                L65: {
                  if (ki.field_E == null) {
                    break L65;
                  } else {
                    if (!ki.field_E.field_b) {
                      break L65;
                    } else {
                      di.a((byte) 60);
                      break L65;
                    }
                  }
                }
                var2 = 0;
                L66: while (true) {
                  if (100 <= var2) {
                    if (!this.field_L) {
                      L67: {
                        if (param0 == 640) {
                          break L67;
                        } else {
                          field_D = (o[]) null;
                          break L67;
                        }
                      }
                      L68: {
                        if (null != da.field_e) {
                          this.field_I = 5;
                          sf.field_h = 3;
                          L69: while (true) {
                            if (!ae.a(-120)) {
                              L70: {
                                if (da.field_e == null) {
                                  break L70;
                                } else {
                                  da.field_e.a(param0 ^ -642);
                                  break L70;
                                }
                              }
                              if (null != da.field_e) {
                                break L68;
                              } else {
                                sf.field_h = 0;
                                return;
                              }
                            } else {
                              if (-14 != (vk.field_r ^ -1)) {
                                if ((vk.field_r ^ -1) == -103) {
                                  L71: {
                                    if ((da.field_e.field_a ^ -1) == -3) {
                                      this.a(19, -3, 2);
                                      break L71;
                                    } else {
                                      break L71;
                                    }
                                  }
                                  if (-4 == (da.field_e.field_a ^ -1)) {
                                    this.a(54, -3, 3);
                                    continue L69;
                                  } else {
                                    continue L69;
                                  }
                                } else {
                                  if ((vk.field_r ^ -1) != -104) {
                                    if (null != da.field_e) {
                                      da.field_e.b(0);
                                      continue L69;
                                    } else {
                                      continue L69;
                                    }
                                  } else {
                                    L72: {
                                      if (da.field_e.field_a != 2) {
                                        break L72;
                                      } else {
                                        this.a(-127, 3, 2);
                                        break L72;
                                      }
                                    }
                                    if (da.field_e.field_a != 3) {
                                      continue L69;
                                    } else {
                                      this.a(93, 3, 3);
                                      continue L69;
                                    }
                                  }
                                }
                              } else {
                                da.field_e.field_p = true;
                                continue L69;
                              }
                            }
                          }
                        } else {
                          L73: {
                            if ((sg.field_f ^ -1) >= (ia.field_n ^ -1)) {
                              break L73;
                            } else {
                              ia.field_n = sg.field_f;
                              break L73;
                            }
                          }
                          L74: {
                            if ((wi.field_K ^ -1) != -2) {
                              break L74;
                            } else {
                              L75: while (true) {
                                if (!ae.a(-65)) {
                                  L76: {
                                    if ((sf.field_h ^ -1) == -1) {
                                      wg.field_e = jl.field_w;
                                      break L76;
                                    } else {
                                      break L76;
                                    }
                                  }
                                  L77: {
                                    if (1 != sf.field_h) {
                                      break L77;
                                    } else {
                                      wg.field_e = bk.field_b;
                                      break L77;
                                    }
                                  }
                                  L78: {
                                    if ((sf.field_h ^ -1) == -3) {
                                      wg.field_e = wh.field_d;
                                      break L78;
                                    } else {
                                      break L78;
                                    }
                                  }
                                  L79: {
                                    if (5 != sf.field_h) {
                                      break L79;
                                    } else {
                                      wg.field_e = l.field_M;
                                      break L79;
                                    }
                                  }
                                  L80: {
                                    if (-1 > (tj.field_I ^ -1)) {
                                      tj.field_I = tj.field_I + 5;
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                  L81: {
                                    if (4 == sf.field_h) {
                                      wg.field_e = we.field_b;
                                      break L81;
                                    } else {
                                      break L81;
                                    }
                                  }
                                  L82: {
                                    if ((tj.field_I ^ -1) != -256) {
                                      break L82;
                                    } else {
                                      L83: {
                                        th.field_g = null;
                                        od.field_k = 0;
                                        if (pl.field_A >= qh.field_l) {
                                          break L83;
                                        } else {
                                          if ((qh.field_l ^ -1) >= -2) {
                                            break L83;
                                          } else {
                                            wg.field_b = wg.field_b - 3 * qh.field_l;
                                            hi.field_c = hi.field_c - 3 * qh.field_l;
                                            qh.field_l = 0;
                                            break L83;
                                          }
                                        }
                                      }
                                      L84: {
                                        L85: {
                                          wi.field_K = 2;
                                          fa.field_a = null;
                                          hi.field_c = hi.field_c - ql.field_c;
                                          ql.field_c = 0;
                                          vk.a((byte) -43);
                                          ni.b(param0 ^ 8170);
                                          if (-1 != (qh.field_l ^ -1)) {
                                            break L85;
                                          } else {
                                            if ((ql.field_c ^ -1) != -1) {
                                              break L85;
                                            } else {
                                              hi.field_a = 580;
                                              bb.field_j = ef.field_F;
                                              break L84;
                                            }
                                          }
                                        }
                                        hi.field_a = 580;
                                        bb.field_j = wg.field_f + (1 + qh.field_l) + eh.field_i + (1 + ql.field_c);
                                        break L84;
                                      }
                                      L86: {
                                        var9 = new ob();
                                        var13 = var9;
                                        var13.field_b = 2;
                                        if (4 != qh.field_l) {
                                          break L86;
                                        } else {
                                          if (-6 == (ql.field_c ^ -1)) {
                                            var13.field_b = var13.field_b + 1;
                                            break L86;
                                          } else {
                                            break L86;
                                          }
                                        }
                                      }
                                      L87: {
                                        var9.field_a = 2;
                                        ii.field_e[od.field_k].a(9147, 0, var13);
                                        od.field_k = od.field_k + 1;
                                        vj.c(param0 + -762);
                                        da.field_g = false;
                                        if (-1 == (qh.field_l ^ -1)) {
                                          this.field_Q = 0;
                                          pg.field_q = true;
                                          this.field_R = 1;
                                          break L87;
                                        } else {
                                          pg.field_q = false;
                                          break L87;
                                        }
                                      }
                                      gd.field_b = false;
                                      ia.field_n = 0;
                                      cd.field_e = 100;
                                      ol.field_e = false;
                                      if (!tl.field_e) {
                                        break L82;
                                      } else {
                                        if (pg.field_q) {
                                          mi.field_D.a(true, -115, bh.field_e);
                                          break L82;
                                        } else {
                                          break L82;
                                        }
                                      }
                                    }
                                  }
                                  L88: {
                                    if (510 < tj.field_I) {
                                      tj.field_I = 0;
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                  cd.field_e = cd.field_e - 1;
                                  if (-1 < (cd.field_e ^ -1)) {
                                    cd.field_e = 0;
                                    break L74;
                                  } else {
                                    break L74;
                                  }
                                } else {
                                  L89: {
                                    if (13 != vk.field_r) {
                                      break L89;
                                    } else {
                                      if (-1 != (sf.field_h ^ -1)) {
                                        this.field_P = true;
                                        if ((sf.field_h ^ -1) != -7) {
                                          break L68;
                                        } else {
                                          this.field_P = false;
                                          tb.a(0, true);
                                          this.field_J = true;
                                          sf.field_h = 9;
                                          return;
                                        }
                                      } else {
                                        break L89;
                                      }
                                    }
                                  }
                                  L90: {
                                    if ((vk.field_r ^ -1) != -97) {
                                      break L90;
                                    } else {
                                      if ((sh.field_c ^ -1) != -1) {
                                        break L90;
                                      } else {
                                        L91: {
                                          if (2 != sf.field_h) {
                                            break L91;
                                          } else {
                                            if (!e.a(param0 + -755)) {
                                              this.field_N = this.field_N - 1;
                                              if (this.field_N < 0) {
                                                this.field_N = 0;
                                                break L91;
                                              } else {
                                                break L91;
                                              }
                                            } else {
                                              this.field_N = this.field_N - 1;
                                              if (-1 < (this.field_N ^ -1)) {
                                                this.field_N = 0;
                                                break L91;
                                              } else {
                                                break L91;
                                              }
                                            }
                                          }
                                        }
                                        L92: {
                                          if (-6 == (sf.field_h ^ -1)) {
                                            L93: {
                                              if (e.a(param0 ^ -739)) {
                                                break L93;
                                              } else {
                                                if (-1 <= (qf.field_l ^ -1)) {
                                                  this.field_N = 0;
                                                  break L92;
                                                } else {
                                                  break L93;
                                                }
                                              }
                                            }
                                            this.field_N = this.field_N - 1;
                                            if ((this.field_N ^ -1) <= -1) {
                                              break L92;
                                            } else {
                                              this.field_N = 0;
                                              break L92;
                                            }
                                          } else {
                                            break L92;
                                          }
                                        }
                                        L94: {
                                          if (-12 != (sf.field_h ^ -1)) {
                                            break L94;
                                          } else {
                                            if (qh.field_l <= 0) {
                                              break L94;
                                            } else {
                                              if (-6 < (tj.field_I ^ -1)) {
                                                qh.field_l = qh.field_l - 1;
                                                wg.field_b = wg.field_b - 6;
                                                break L94;
                                              } else {
                                                break L94;
                                              }
                                            }
                                          }
                                        }
                                        if (-2 != (sf.field_h ^ -1)) {
                                          break L90;
                                        } else {
                                          this.field_N = 0;
                                          break L90;
                                        }
                                      }
                                    }
                                  }
                                  L95: {
                                    if (97 != vk.field_r) {
                                      break L95;
                                    } else {
                                      if (0 == sh.field_c) {
                                        L96: {
                                          if ((sf.field_h ^ -1) != -3) {
                                            break L96;
                                          } else {
                                            if (e.a(param0 + -727)) {
                                              this.field_N = this.field_N + 1;
                                              if (-2 > (this.field_N ^ -1)) {
                                                this.field_N = 1;
                                                break L96;
                                              } else {
                                                break L96;
                                              }
                                            } else {
                                              this.field_N = this.field_N + 1;
                                              if (-4 > (this.field_N ^ -1)) {
                                                this.field_N = 3;
                                                break L96;
                                              } else {
                                                break L96;
                                              }
                                            }
                                          }
                                        }
                                        L97: {
                                          if (sf.field_h == 5) {
                                            L98: {
                                              if (e.a(param0 + -751)) {
                                                break L98;
                                              } else {
                                                if (0 < qf.field_l) {
                                                  break L98;
                                                } else {
                                                  this.field_N = 0;
                                                  break L97;
                                                }
                                              }
                                            }
                                            this.field_N = this.field_N + 1;
                                            if ((this.field_N ^ -1) >= -2) {
                                              break L97;
                                            } else {
                                              this.field_N = 1;
                                              break L97;
                                            }
                                          } else {
                                            break L97;
                                          }
                                        }
                                        L99: {
                                          if (11 != sf.field_h) {
                                            break L99;
                                          } else {
                                            if (5 <= qh.field_l) {
                                              break L99;
                                            } else {
                                              if (5 <= tj.field_I) {
                                                break L99;
                                              } else {
                                                qh.field_l = qh.field_l + 1;
                                                me.field_f = me.field_f - 6;
                                                break L99;
                                              }
                                            }
                                          }
                                        }
                                        if (-2 == (sf.field_h ^ -1)) {
                                          this.field_N = 0;
                                          break L95;
                                        } else {
                                          break L95;
                                        }
                                      } else {
                                        break L95;
                                      }
                                    }
                                  }
                                  if ((sf.field_h ^ -1) == -1) {
                                    L100: {
                                      if (98 == vk.field_r) {
                                        L101: {
                                          if (si.field_h == -1) {
                                            si.field_h = 0;
                                            break L101;
                                          } else {
                                            break L101;
                                          }
                                        }
                                        fieldTemp$23 = si.field_h - 1;
                                        si.field_h = si.field_h - 1;
                                        if (-1 < (fieldTemp$23 ^ -1)) {
                                          si.field_h = si.field_h + rc.field_a;
                                          break L100;
                                        } else {
                                          break L100;
                                        }
                                      } else {
                                        break L100;
                                      }
                                    }
                                    L102: {
                                      if ((vk.field_r ^ -1) != -100) {
                                        break L102;
                                      } else {
                                        fieldTemp$24 = si.field_h + 1;
                                        si.field_h = si.field_h + 1;
                                        if ((rc.field_a ^ -1) >= (fieldTemp$24 ^ -1)) {
                                          si.field_h = si.field_h - rc.field_a;
                                          break L102;
                                        } else {
                                          break L102;
                                        }
                                      }
                                    }
                                    L103: {
                                      if (-97 == (vk.field_r ^ -1)) {
                                        this.a(89, -1, si.field_h);
                                        break L103;
                                      } else {
                                        break L103;
                                      }
                                    }
                                    L104: {
                                      if (vk.field_r == 97) {
                                        this.a(param0 + -614, 1, si.field_h);
                                        break L104;
                                      } else {
                                        break L104;
                                      }
                                    }
                                    L105: {
                                      if (102 != vk.field_r) {
                                        break L105;
                                      } else {
                                        this.a(91, -3, si.field_h);
                                        break L105;
                                      }
                                    }
                                    L106: {
                                      if (vk.field_r == 103) {
                                        this.a(param0 + -530, 3, si.field_h);
                                        break L106;
                                      } else {
                                        break L106;
                                      }
                                    }
                                    if ((vk.field_r ^ -1) != -85) {
                                      continue L75;
                                    } else {
                                      this.a(param0 ^ 760, 0, si.field_h);
                                      continue L75;
                                    }
                                  } else {
                                    if (-1 > (pa.field_c ^ -1)) {
                                      continue L75;
                                    } else {
                                      if (84 != vk.field_r) {
                                        continue L75;
                                      } else {
                                        if (-12 != (sf.field_h ^ -1)) {
                                          if (-3 == (sf.field_h ^ -1)) {
                                            continue L75;
                                          } else {
                                            if (sf.field_h != 5) {
                                              pa.field_c = 32;
                                              continue L75;
                                            } else {
                                              continue L75;
                                            }
                                          }
                                        } else {
                                          if (qh.field_l > pl.field_A) {
                                            continue L75;
                                          } else {
                                            if ((tj.field_I ^ -1) <= -6) {
                                              continue L75;
                                            } else {
                                              L107: {
                                                hi.field_c = hi.field_c + qh.field_g;
                                                qh.field_g = 0;
                                                nk.field_T = 0;
                                                od.field_k = 0;
                                                if (0 >= qh.field_l) {
                                                  gd.field_b = false;
                                                  break L107;
                                                } else {
                                                  gd.field_b = true;
                                                  me.field_f = me.field_f + 5;
                                                  qh.field_g = 5;
                                                  break L107;
                                                }
                                              }
                                              L108: {
                                                tj.field_I = 5;
                                                if ((4 & ti.field_a) <= 0) {
                                                  break L108;
                                                } else {
                                                  nk.field_T = 400;
                                                  break L108;
                                                }
                                              }
                                              sj.field_l = 0;
                                              continue L75;
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
                          L109: {
                            if (2 == wi.field_K) {
                              L110: {
                                L111: {
                                  L112: {
                                    L113: {
                                      if (ql.field_c != 0) {
                                        break L113;
                                      } else {
                                        if ((qh.field_l ^ -1) == -1) {
                                          break L112;
                                        } else {
                                          break L113;
                                        }
                                      }
                                    }
                                    if (sg.field_f > hg.field_a) {
                                      break L111;
                                    } else {
                                      break L112;
                                    }
                                  }
                                  if ((ql.field_c ^ -1) != -1) {
                                    break L110;
                                  } else {
                                    if (qh.field_l != 0) {
                                      break L110;
                                    } else {
                                      if (qh.field_g >= 5) {
                                        break L110;
                                      } else {
                                        if (qh.field_g <= 0) {
                                          break L110;
                                        } else {
                                          break L111;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (!pg.field_q) {
                                  L114: {
                                    L115: {
                                      qh.field_g = qh.field_g + 1;
                                      if (ql.field_c != 0) {
                                        break L115;
                                      } else {
                                        if (-1 == (qh.field_l ^ -1)) {
                                          break L114;
                                        } else {
                                          break L115;
                                        }
                                      }
                                    }
                                    L116: {
                                      if (hg.field_a >= 10000) {
                                        hg.field_a = hg.field_a + 10000;
                                        break L116;
                                      } else {
                                        break L116;
                                      }
                                    }
                                    L117: {
                                      if ((hg.field_a ^ -1) != -5001) {
                                        break L117;
                                      } else {
                                        hg.field_a = 10000;
                                        break L117;
                                      }
                                    }
                                    L118: {
                                      if (-2001 == (hg.field_a ^ -1)) {
                                        hg.field_a = 5000;
                                        break L118;
                                      } else {
                                        break L118;
                                      }
                                    }
                                    L119: {
                                      if (1000 == hg.field_a) {
                                        hg.field_a = 2000;
                                        break L119;
                                      } else {
                                        break L119;
                                      }
                                    }
                                    if (hg.field_a > 500) {
                                      break L114;
                                    } else {
                                      hg.field_a = 1000;
                                      break L114;
                                    }
                                  }
                                  ic.field_a = ic.field_a + 1;
                                  var2 = 0;
                                  L120: while (true) {
                                    if (var2 >= 5) {
                                      break L110;
                                    } else {
                                      fi.field_x = 0;
                                      ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                      ii.field_e[od.field_k].field_f.a(-92, ii.field_e[0].field_f);
                                      ii.field_e[od.field_k].field_f.field_a = 0;
                                      ii.field_e[od.field_k].field_h = -1;
                                      ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 80;
                                      ii.field_e[od.field_k].field_e = var2 * 20;
                                      fi.field_x = 0;
                                      od.field_k = od.field_k + 1;
                                      ii.field_e[od.field_k].a(param0 + 8507, 1, ii.field_e[0].field_i);
                                      ii.field_e[od.field_k].field_f.a(param0 + -746, ii.field_e[0].field_f);
                                      ii.field_e[od.field_k].field_f.field_a = 0;
                                      ii.field_e[od.field_k].field_h = 1;
                                      ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 80;
                                      ii.field_e[od.field_k].field_e = 20 * var2;
                                      od.field_k = od.field_k + 1;
                                      var2++;
                                      continue L120;
                                    }
                                  }
                                } else {
                                  break L110;
                                }
                              }
                              L121: {
                                if (pg.field_q) {
                                  break L121;
                                } else {
                                  var2 = 0;
                                  var3 = 0;
                                  L122: while (true) {
                                    if (od.field_k <= var3) {
                                      if (var2 != 0) {
                                        break L121;
                                      } else {
                                        if (0 > qh.field_g) {
                                          break L121;
                                        } else {
                                          if (-1 == (tj.field_I ^ -1)) {
                                            L123: {
                                              if (5 != qh.field_l) {
                                                break L123;
                                              } else {
                                                if (ql.field_c <= 5) {
                                                  break L123;
                                                } else {
                                                  this.field_R = 11;
                                                  pg.field_q = true;
                                                  ql.a(1, 255, 0);
                                                  break L121;
                                                }
                                              }
                                            }
                                            tj.field_I = tj.field_I + 5;
                                            break L121;
                                          } else {
                                            break L121;
                                          }
                                        }
                                      }
                                    } else {
                                      L124: {
                                        if (ii.field_e[var3].field_B <= 2) {
                                          break L124;
                                        } else {
                                          var2 = 1;
                                          break L124;
                                        }
                                      }
                                      var3++;
                                      continue L122;
                                    }
                                  }
                                }
                              }
                              L125: {
                                if (dd.field_m < 2) {
                                  break L125;
                                } else {
                                  L126: {
                                    if (hi.field_p[66]) {
                                      ke.field_w = true;
                                      break L126;
                                    } else {
                                      break L126;
                                    }
                                  }
                                  L127: {
                                    if (hi.field_p[67]) {
                                      ke.field_w = false;
                                      break L127;
                                    } else {
                                      break L127;
                                    }
                                  }
                                  if (ke.field_w) {
                                    return;
                                  } else {
                                    L128: {
                                      if (hi.field_p[55]) {
                                        tc.field_j = true;
                                        tj.field_I = 5;
                                        pg.field_q = false;
                                        ql.field_c = 4;
                                        break L128;
                                      } else {
                                        break L128;
                                      }
                                    }
                                    L129: {
                                      if (!hi.field_p[40]) {
                                        break L129;
                                      } else {
                                        pg.field_q = false;
                                        tc.field_j = true;
                                        tj.field_I = 5;
                                        break L129;
                                      }
                                    }
                                    L130: {
                                      if (!hi.field_p[39]) {
                                        break L130;
                                      } else {
                                        if (5 <= qh.field_l) {
                                          break L130;
                                        } else {
                                          pg.field_q = false;
                                          tj.field_I = 5;
                                          ql.field_c = 6;
                                          tc.field_j = true;
                                          break L130;
                                        }
                                      }
                                    }
                                    L131: {
                                      if (!hi.field_p[68]) {
                                        break L131;
                                      } else {
                                        break L131;
                                      }
                                    }
                                    L132: {
                                      if (!hi.field_p[56]) {
                                        break L132;
                                      } else {
                                        if (qh.field_g > 50) {
                                          qh.field_g = 5;
                                          tc.field_j = true;
                                          break L132;
                                        } else {
                                          qh.field_g = 100;
                                          tc.field_j = true;
                                          break L132;
                                        }
                                      }
                                    }
                                    if (!hi.field_p[38]) {
                                      break L125;
                                    } else {
                                      tc.field_j = false;
                                      sg.field_f = (int)(Math.random() * 1000.0 + 500.0);
                                      break L125;
                                    }
                                  }
                                }
                              }
                              L133: {
                                if (50 >= qh.field_g) {
                                  break L133;
                                } else {
                                  if (tc.field_j) {
                                    qh.field_g = 100;
                                    break L133;
                                  } else {
                                    break L133;
                                  }
                                }
                              }
                              L134: {
                                if (0 < tj.field_I) {
                                  tj.field_I = tj.field_I + 5;
                                  break L134;
                                } else {
                                  break L134;
                                }
                              }
                              L135: {
                                if ((tj.field_I ^ -1) >= -511) {
                                  break L135;
                                } else {
                                  tj.field_I = 0;
                                  break L135;
                                }
                              }
                              L136: {
                                if (!pg.field_q) {
                                  break L136;
                                } else {
                                  L137: {
                                    if ((this.field_R ^ -1) != -12) {
                                      break L137;
                                    } else {
                                      L138: {
                                        if (-3 <= (ii.field_e[0].field_i.field_a ^ -1)) {
                                          L139: {
                                            if (2 >= ii.field_e[0].field_i.field_b) {
                                              break L139;
                                            } else {
                                              sc.field_m.field_b = -1;
                                              break L139;
                                            }
                                          }
                                          if (ii.field_e[0].field_i.field_b >= 2) {
                                            break L138;
                                          } else {
                                            sc.field_m.field_b = 1;
                                            break L138;
                                          }
                                        } else {
                                          sc.field_m.field_b = -1;
                                          break L138;
                                        }
                                      }
                                      ii.field_e[0].a((byte) -123, tc.field_l);
                                      if (ii.field_e[0].field_i.field_b != 2) {
                                        break L137;
                                      } else {
                                        if (2 == ii.field_e[0].field_i.field_a) {
                                          this.field_R = 12;
                                          this.field_Q = 0;
                                          if (!tl.field_e) {
                                            break L137;
                                          } else {
                                            mi.field_D.a(true, param0 ^ -727, qj.field_e);
                                            break L137;
                                          }
                                        } else {
                                          break L137;
                                        }
                                      }
                                    }
                                  }
                                  L140: {
                                    if ((this.field_R ^ -1) == -13) {
                                      L141: {
                                        if (this.field_Q < 90) {
                                          break L141;
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
                                          break L141;
                                        }
                                      }
                                      L142: {
                                        if (90 != this.field_Q) {
                                          break L142;
                                        } else {
                                          L143: {
                                            stackOut_584_0 = 0;
                                            stackIn_586_0 = stackOut_584_0;
                                            stackIn_585_0 = stackOut_584_0;
                                            if (pk.field_s) {
                                              stackOut_586_0 = stackIn_586_0;
                                              stackOut_586_1 = 0;
                                              stackIn_587_0 = stackOut_586_0;
                                              stackIn_587_1 = stackOut_586_1;
                                              break L143;
                                            } else {
                                              stackOut_585_0 = stackIn_585_0;
                                              stackOut_585_1 = 1;
                                              stackIn_587_0 = stackOut_585_0;
                                              stackIn_587_1 = stackOut_585_1;
                                              break L143;
                                            }
                                          }
                                          if (stackIn_587_0 == stackIn_587_1) {
                                            tl.field_a.a(nl.field_q[1], 100, ee.field_p * 256 / 100);
                                            break L142;
                                          } else {
                                            break L142;
                                          }
                                        }
                                      }
                                      fieldTemp$25 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (-101 > (fieldTemp$25 ^ -1)) {
                                        this.field_R = 13;
                                        this.field_Q = 0;
                                        break L140;
                                      } else {
                                        break L140;
                                      }
                                    } else {
                                      break L140;
                                    }
                                  }
                                  L144: {
                                    if (this.field_R == 13) {
                                      L145: {
                                        if (50 != this.field_Q) {
                                          break L145;
                                        } else {
                                          if (pk.field_s) {
                                            tl.field_a.a(nl.field_q[2], 100, 256 * ee.field_p / 100);
                                            break L145;
                                          } else {
                                            break L145;
                                          }
                                        }
                                      }
                                      fieldTemp$26 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if ((fieldTemp$26 ^ -1) >= -101) {
                                        break L144;
                                      } else {
                                        this.field_R = 14;
                                        this.field_Q = 0;
                                        break L144;
                                      }
                                    } else {
                                      break L144;
                                    }
                                  }
                                  L146: {
                                    if ((this.field_R ^ -1) != -15) {
                                      break L146;
                                    } else {
                                      fieldTemp$27 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 < fieldTemp$27) {
                                        this.field_Q = 0;
                                        this.field_R = 15;
                                        break L146;
                                      } else {
                                        break L146;
                                      }
                                    }
                                  }
                                  L147: {
                                    if (-16 != (this.field_R ^ -1)) {
                                      break L147;
                                    } else {
                                      fieldTemp$28 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$28) {
                                        break L147;
                                      } else {
                                        this.field_R = 16;
                                        this.field_Q = 0;
                                        break L147;
                                      }
                                    }
                                  }
                                  L148: {
                                    if (16 != this.field_R) {
                                      break L148;
                                    } else {
                                      L149: {
                                        if (this.field_Q != 75) {
                                          break L149;
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
                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 790;
                                            ii.field_e[od.field_k].field_e = var2 * 20;
                                            od.field_k = od.field_k + 1;
                                            fi.field_x = 0;
                                            ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(-98, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = 1;
                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 790;
                                            ii.field_e[od.field_k].field_e = 20 * var2;
                                            this.field_Q = 70;
                                            od.field_k = od.field_k + 1;
                                            break L149;
                                          } else {
                                            break L149;
                                          }
                                        }
                                      }
                                      fieldTemp$29 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$29 <= 100) {
                                        break L148;
                                      } else {
                                        this.field_R = 17;
                                        this.field_Q = 0;
                                        break L148;
                                      }
                                    }
                                  }
                                  L150: {
                                    if (-18 == (this.field_R ^ -1)) {
                                      fieldTemp$30 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (200 < fieldTemp$30) {
                                        hi.field_c = hi.field_c + (qh.field_g + 1);
                                        me.field_f = me.field_f - 36;
                                        ic.field_a = ic.field_a + (ql.field_c + 6 * qh.field_l);
                                        qh.field_g = -1;
                                        ql.field_c = 0;
                                        qh.field_l = 6;
                                        break L150;
                                      } else {
                                        break L150;
                                      }
                                    } else {
                                      break L150;
                                    }
                                  }
                                  L151: {
                                    if (this.field_R == 1) {
                                      this.field_Q = this.field_Q + 1;
                                      if (0 == tj.field_I) {
                                        this.field_Q = 0;
                                        this.field_R = 2;
                                        break L151;
                                      } else {
                                        break L151;
                                      }
                                    } else {
                                      break L151;
                                    }
                                  }
                                  L152: {
                                    if ((this.field_R ^ -1) != -3) {
                                      break L152;
                                    } else {
                                      fieldTemp$31 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 < fieldTemp$31) {
                                        this.field_Q = 0;
                                        this.field_R = 3;
                                        break L152;
                                      } else {
                                        break L152;
                                      }
                                    }
                                  }
                                  L153: {
                                    if (this.field_R != 3) {
                                      break L153;
                                    } else {
                                      L154: {
                                        if (-6 != (this.field_Q ^ -1)) {
                                          break L154;
                                        } else {
                                          if (pk.field_s) {
                                            tl.field_a.a(nl.field_q[0], 100, 256 * ee.field_p / 100);
                                            break L154;
                                          } else {
                                            break L154;
                                          }
                                        }
                                      }
                                      fieldTemp$32 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (-101 > (fieldTemp$32 ^ -1)) {
                                        this.field_Q = 0;
                                        this.field_R = 4;
                                        break L153;
                                      } else {
                                        break L153;
                                      }
                                    }
                                  }
                                  L155: {
                                    if (-5 == (this.field_R ^ -1)) {
                                      fieldTemp$33 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if ((fieldTemp$33 ^ -1) < -101) {
                                        this.field_R = 5;
                                        this.field_Q = 0;
                                        break L155;
                                      } else {
                                        break L155;
                                      }
                                    } else {
                                      break L155;
                                    }
                                  }
                                  L156: {
                                    if (-6 != (this.field_R ^ -1)) {
                                      break L156;
                                    } else {
                                      fieldTemp$34 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$34 <= 200) {
                                        break L156;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 6;
                                        break L156;
                                      }
                                    }
                                  }
                                  L157: {
                                    if (-7 == (this.field_R ^ -1)) {
                                      fieldTemp$35 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (200 >= fieldTemp$35) {
                                        break L157;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 7;
                                        break L157;
                                      }
                                    } else {
                                      break L157;
                                    }
                                  }
                                  L158: {
                                    if (7 != this.field_R) {
                                      break L158;
                                    } else {
                                      fieldTemp$36 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$36) {
                                        break L158;
                                      } else {
                                        this.field_Q = 0;
                                        this.field_R = 8;
                                        break L158;
                                      }
                                    }
                                  }
                                  L159: {
                                    if (8 != this.field_R) {
                                      break L159;
                                    } else {
                                      fieldTemp$37 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (fieldTemp$37 > 100) {
                                        this.field_R = 9;
                                        this.field_Q = 0;
                                        break L159;
                                      } else {
                                        break L159;
                                      }
                                    }
                                  }
                                  L160: {
                                    if (this.field_R != 9) {
                                      break L160;
                                    } else {
                                      L161: {
                                        if (50 != this.field_Q) {
                                          break L161;
                                        } else {
                                          if (tl.field_e) {
                                            mi.field_D.a(true, param0 ^ -740, ga.field_e);
                                            break L161;
                                          } else {
                                            break L161;
                                          }
                                        }
                                      }
                                      L162: {
                                        if (75 != this.field_Q) {
                                          break L162;
                                        } else {
                                          if (-6 >= (qh.field_g ^ -1)) {
                                            break L162;
                                          } else {
                                            wg.field_b = wg.field_b - 1;
                                            qh.field_g = qh.field_g + 1;
                                            fi.field_x = 0;
                                            var2 = qh.field_g;
                                            ii.field_e[od.field_k].a(param0 ^ 8507, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(param0 ^ -751, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = -1;
                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                                            ii.field_e[od.field_k].field_e = var2 % 3 * 20;
                                            fi.field_x = 0;
                                            od.field_k = od.field_k + 1;
                                            ii.field_e[od.field_k].a(9147, 1, ii.field_e[0].field_i);
                                            ii.field_e[od.field_k].field_f.a(-124, ii.field_e[0].field_f);
                                            ii.field_e[od.field_k].field_f.field_a = 0;
                                            ii.field_e[od.field_k].field_h = 1;
                                            ii.field_e[od.field_k].field_f.field_b = ii.field_e[od.field_k].field_f.field_b + 40;
                                            ii.field_e[od.field_k].field_e = 20 * (var2 % 3);
                                            od.field_k = od.field_k + 1;
                                            this.field_Q = 70;
                                            break L162;
                                          }
                                        }
                                      }
                                      fieldTemp$38 = this.field_Q;
                                      this.field_Q = this.field_Q + 1;
                                      if (100 >= fieldTemp$38) {
                                        break L160;
                                      } else {
                                        this.field_R = 10;
                                        this.field_Q = 0;
                                        break L160;
                                      }
                                    }
                                  }
                                  L163: {
                                    if (this.field_R == 10) {
                                      pg.field_q = false;
                                      hi.field_a = 580;
                                      bb.field_j = l.field_Q;
                                      break L163;
                                    } else {
                                      break L163;
                                    }
                                  }
                                  var2 = 0;
                                  L164: while (true) {
                                    if (od.field_k <= var2) {
                                      break L136;
                                    } else {
                                      L165: {
                                        L166: {
                                          if (-1 != (var2 ^ -1)) {
                                            break L166;
                                          } else {
                                            if (!pg.field_q) {
                                              break L166;
                                            } else {
                                              break L165;
                                            }
                                          }
                                        }
                                        ii.field_e[var2].a((byte) -123, tc.field_l);
                                        break L165;
                                      }
                                      var2++;
                                      continue L164;
                                    }
                                  }
                                }
                              }
                              L167: {
                                if (!pg.field_q) {
                                  if (tj.field_I == 255) {
                                    L168: {
                                      od.field_k = 0;
                                      ql.field_c = ql.field_c + 1;
                                      wg.field_b = wg.field_b + 1;
                                      if (-6 != (ql.field_c ^ -1)) {
                                        break L168;
                                      } else {
                                        if (-1 != (qh.field_l ^ -1)) {
                                          break L168;
                                        } else {
                                          if (!ol.field_e) {
                                            ql.a(1, 254, 1);
                                            break L168;
                                          } else {
                                            break L168;
                                          }
                                        }
                                      }
                                    }
                                    L169: {
                                      fi.field_x = 0;
                                      if (5 == ql.field_c) {
                                        L170: {
                                          w.field_b = 0;
                                          ga.field_e = fb.field_a;
                                          if (!tl.field_e) {
                                            break L170;
                                          } else {
                                            mi.field_D.a(true, -127, ga.field_e);
                                            break L170;
                                          }
                                        }
                                        da.field_g = false;
                                        break L169;
                                      } else {
                                        break L169;
                                      }
                                    }
                                    L171: {
                                      if (ql.field_c < 6) {
                                        break L171;
                                      } else {
                                        L172: {
                                          if (da.field_g) {
                                            break L172;
                                          } else {
                                            L173: {
                                              if (qh.field_l == 0) {
                                                ql.a(1, 250, 5);
                                                break L173;
                                              } else {
                                                break L173;
                                              }
                                            }
                                            L174: {
                                              if (1 == qh.field_l) {
                                                ql.a(1, 249, 6);
                                                break L174;
                                              } else {
                                                break L174;
                                              }
                                            }
                                            L175: {
                                              if (-3 != (qh.field_l ^ -1)) {
                                                break L175;
                                              } else {
                                                ql.a(1, 248, 7);
                                                break L175;
                                              }
                                            }
                                            L176: {
                                              if (-4 != (qh.field_l ^ -1)) {
                                                break L176;
                                              } else {
                                                ql.a(1, 247, 8);
                                                break L176;
                                              }
                                            }
                                            if (-5 == (qh.field_l ^ -1)) {
                                              ql.a(1, 246, 9);
                                              break L172;
                                            } else {
                                              break L172;
                                            }
                                          }
                                        }
                                        L177: {
                                          if (!gd.field_b) {
                                            L178: {
                                              if (2 != qh.field_l) {
                                                break L178;
                                              } else {
                                                ql.a(param0 ^ 641, 252, 3);
                                                break L178;
                                              }
                                            }
                                            if (qh.field_l != 4) {
                                              break L177;
                                            } else {
                                              ql.a(1, 251, 4);
                                              break L177;
                                            }
                                          } else {
                                            break L177;
                                          }
                                        }
                                        L179: {
                                          if ((qh.field_l ^ -1) != -1) {
                                            break L179;
                                          } else {
                                            ql.a(1, 253, 2);
                                            break L179;
                                          }
                                        }
                                        L180: {
                                          hi.field_c = hi.field_c - (ql.field_c + -6);
                                          qh.field_l = qh.field_l + 1;
                                          ql.field_c = 0;
                                          if (pl.field_A < qh.field_l) {
                                            ke.field_u.a(new dc(0, qh.field_l + -1, 0, 0, 0, 0), false);
                                            pl.field_A = qh.field_l;
                                            break L180;
                                          } else {
                                            break L180;
                                          }
                                        }
                                        if (-7 >= (qh.field_l ^ -1)) {
                                          break L171;
                                        } else {
                                          vk.a((byte) -71);
                                          break L171;
                                        }
                                      }
                                    }
                                    L181: {
                                      hi.field_a = 580;
                                      bb.field_j = wg.field_f + (qh.field_l - -1) + eh.field_i + (1 + ql.field_c);
                                      if (-1 >= qh.field_g) {
                                        break L181;
                                      } else {
                                        L182: {
                                          if (qh.field_l < 6) {
                                            ni.b(7530);
                                            break L182;
                                          } else {
                                            break L182;
                                          }
                                        }
                                        L183: {
                                          var14 = new ob();
                                          var14.field_a = 2;
                                          var14.field_b = 2;
                                          if ((qh.field_l ^ -1) != -5) {
                                            break L183;
                                          } else {
                                            if ((ql.field_c ^ -1) == -6) {
                                              var14.field_b = var14.field_b + 1;
                                              break L183;
                                            } else {
                                              break L183;
                                            }
                                          }
                                        }
                                        ii.field_e[od.field_k].a(9147, 0, var14);
                                        od.field_k = od.field_k + 1;
                                        vj.c(69);
                                        ia.field_n = 0;
                                        cd.field_e = 100;
                                        break L181;
                                      }
                                    }
                                    if ((qh.field_l ^ -1) != -3) {
                                      break L167;
                                    } else {
                                      L184: {
                                        if (0 >= hl.field_a) {
                                          break L184;
                                        } else {
                                          if (!e.a(param0 ^ -766)) {
                                            break L167;
                                          } else {
                                            break L184;
                                          }
                                        }
                                      }
                                      this.s(208);
                                      break L167;
                                    }
                                  } else {
                                    break L167;
                                  }
                                } else {
                                  break L167;
                                }
                              }
                              L185: {
                                if ((qh.field_g ^ -1) <= -1) {
                                  break L185;
                                } else {
                                  if ((hi.field_a ^ -1) > 349) {
                                    tj.field_I = 100;
                                    this.s(208);
                                    break L185;
                                  } else {
                                    break L185;
                                  }
                                }
                              }
                              L186: {
                                sc.field_m.field_d = false;
                                sc.field_m.field_f = false;
                                sc.field_m.field_b = 0;
                                if (!pg.field_q) {
                                  break L186;
                                } else {
                                  if (0 != qh.field_l) {
                                    break L186;
                                  } else {
                                    if ((ql.field_c ^ -1) == -1) {
                                      L187: while (true) {
                                        if (!ae.a(125)) {
                                          if ((w.field_c ^ -1) == -2) {
                                            pg.field_q = false;
                                            me.field_f = me.field_f - qh.field_g;
                                            hi.field_a = 580;
                                            wg.field_b = wg.field_b - 5;
                                            qh.field_g = 5;
                                            bb.field_j = cc.field_b;
                                            if (!tl.field_e) {
                                              break L186;
                                            } else {
                                              mi.field_D.a(true, -86, ga.field_e);
                                              break L186;
                                            }
                                          } else {
                                            break L186;
                                          }
                                        } else {
                                          L188: {
                                            if (13 == vk.field_r) {
                                              break L188;
                                            } else {
                                              if ((vk.field_r ^ -1) == -85) {
                                                break L188;
                                              } else {
                                                continue L187;
                                              }
                                            }
                                          }
                                          L189: {
                                            bb.field_j = cc.field_b;
                                            hi.field_a = 580;
                                            pg.field_q = false;
                                            if (!tl.field_e) {
                                              break L189;
                                            } else {
                                              mi.field_D.a(true, -93, ga.field_e);
                                              break L189;
                                            }
                                          }
                                          me.field_f = me.field_f - qh.field_g;
                                          wg.field_b = wg.field_b - 5;
                                          qh.field_g = 5;
                                          continue L187;
                                        }
                                      }
                                    } else {
                                      break L186;
                                    }
                                  }
                                }
                              }
                              if (0 != tj.field_I) {
                                break L109;
                              } else {
                                L190: {
                                  stackOut_752_0 = 0;
                                  stackIn_754_0 = stackOut_752_0;
                                  stackIn_753_0 = stackOut_752_0;
                                  if (pg.field_q) {
                                    stackOut_754_0 = stackIn_754_0;
                                    stackOut_754_1 = 0;
                                    stackIn_755_0 = stackOut_754_0;
                                    stackIn_755_1 = stackOut_754_1;
                                    break L190;
                                  } else {
                                    stackOut_753_0 = stackIn_753_0;
                                    stackOut_753_1 = 1;
                                    stackIn_755_0 = stackOut_753_0;
                                    stackIn_755_1 = stackOut_753_1;
                                    break L190;
                                  }
                                }
                                L191: {
                                  if (stackIn_755_0 == stackIn_755_1) {
                                    break L191;
                                  } else {
                                    L192: while (true) {
                                      if (!ae.a(88)) {
                                        L193: {
                                          if (hi.field_a > -350) {
                                            break L193;
                                          } else {
                                            L194: {
                                              if (nk.field_T >= 300) {
                                                break L194;
                                              } else {
                                                if (sj.field_l >= 500) {
                                                  break L194;
                                                } else {
                                                  sj.field_l = sj.field_l + 1;
                                                  break L194;
                                                }
                                              }
                                            }
                                            L195: {
                                              uc.field_g = uc.field_g + 1;
                                              if (!hi.field_p[96]) {
                                                break L195;
                                              } else {
                                                sc.field_m.field_b = -1;
                                                if (-26 < (nk.field_T ^ -1)) {
                                                  nk.field_T = 50;
                                                  sj.field_l = 0;
                                                  nk.field_T = nk.field_T + 1;
                                                  break L195;
                                                } else {
                                                  break L195;
                                                }
                                              }
                                            }
                                            L196: {
                                              if (-41 <= (uc.field_g ^ -1)) {
                                                break L196;
                                              } else {
                                                uc.field_g = uc.field_g - 40;
                                                break L196;
                                              }
                                            }
                                            L197: {
                                              if (hi.field_p[97]) {
                                                L198: {
                                                  if ((nk.field_T ^ -1) > -26) {
                                                    nk.field_T = 50;
                                                    nk.field_T = nk.field_T + 1;
                                                    sj.field_l = 0;
                                                    break L198;
                                                  } else {
                                                    break L198;
                                                  }
                                                }
                                                sc.field_m.field_b = 1;
                                                break L197;
                                              } else {
                                                break L197;
                                              }
                                            }
                                            L199: {
                                              L200: {
                                                if (hi.field_p[nf.field_d]) {
                                                  break L200;
                                                } else {
                                                  if (!hi.field_p[98]) {
                                                    break L199;
                                                  } else {
                                                    break L200;
                                                  }
                                                }
                                              }
                                              sc.field_m.field_f = true;
                                              if (-101 < (nk.field_T ^ -1)) {
                                                break L199;
                                              } else {
                                                if ((nk.field_T ^ -1) <= -151) {
                                                  break L199;
                                                } else {
                                                  sj.field_l = 0;
                                                  nk.field_T = 250;
                                                  break L199;
                                                }
                                              }
                                            }
                                            L201: {
                                              if (hi.field_p[hh.field_S]) {
                                                break L201;
                                              } else {
                                                if (!hi.field_p[83]) {
                                                  break L193;
                                                } else {
                                                  break L201;
                                                }
                                              }
                                            }
                                            sc.field_m.field_d = true;
                                            if (50 > nk.field_T) {
                                              break L193;
                                            } else {
                                              if (-101 >= (nk.field_T ^ -1)) {
                                                break L193;
                                              } else {
                                                nk.field_T = 100;
                                                sj.field_l = 0;
                                                break L193;
                                              }
                                            }
                                          }
                                        }
                                        L202: {
                                          if (!il.field_e) {
                                            stackOut_805_0 = 0;
                                            stackIn_806_0 = stackOut_805_0;
                                            break L202;
                                          } else {
                                            stackOut_804_0 = 1;
                                            stackIn_806_0 = stackOut_804_0;
                                            break L202;
                                          }
                                        }
                                        var3 = stackIn_806_0;
                                        var2 = 0;
                                        L203: while (true) {
                                          if ((var2 ^ -1) <= (od.field_k ^ -1)) {
                                            L204: {
                                              if (!il.field_e) {
                                                break L204;
                                              } else {
                                                L205: {
                                                  if (0 >= hi.field_a) {
                                                    ge.field_f = ge.field_f + 1;
                                                    break L205;
                                                  } else {
                                                    break L205;
                                                  }
                                                }
                                                L206: {
                                                  if ((ql.field_c ^ -1) != -6) {
                                                    break L206;
                                                  } else {
                                                    if (-2 != (qh.field_l ^ -1)) {
                                                      break L206;
                                                    } else {
                                                      if (hl.field_a > 0) {
                                                        break L206;
                                                      } else {
                                                        if (-371 == (ge.field_f ^ -1)) {
                                                          ge.field_f = ge.field_f + 1;
                                                          bb.field_j = i.field_d;
                                                          hi.field_a = 580;
                                                          break L206;
                                                        } else {
                                                          break L206;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (375 < ge.field_f) {
                                                  var4 = od.field_k;
                                                  var2 = 0;
                                                  L207: while (true) {
                                                    if ((var4 ^ -1) >= (var2 ^ -1)) {
                                                      break L204;
                                                    } else {
                                                      L208: {
                                                        if (21 == ii.field_e[var2].field_B) {
                                                          ii.field_e[var2].field_k = 1;
                                                          break L208;
                                                        } else {
                                                          break L208;
                                                        }
                                                      }
                                                      var2++;
                                                      continue L207;
                                                    }
                                                  }
                                                } else {
                                                  break L204;
                                                }
                                              }
                                            }
                                            L209: {
                                              if (var3 != 0) {
                                                break L209;
                                              } else {
                                                if (il.field_e) {
                                                  break L209;
                                                } else {
                                                  ra.a(2);
                                                  break L209;
                                                }
                                              }
                                            }
                                            var2 = -1 + od.field_k;
                                            L210: while (true) {
                                              if ((var2 ^ -1) > -1) {
                                                break L191;
                                              } else {
                                                L211: {
                                                  if (ii.field_e[var2].field_k != 1) {
                                                    break L211;
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
                                                    break L211;
                                                  }
                                                }
                                                var2--;
                                                continue L210;
                                              }
                                            }
                                          } else {
                                            L212: {
                                              if (2 >= ii.field_e[var2].field_B) {
                                                break L212;
                                              } else {
                                                if (-22 == (ii.field_e[var2].field_B ^ -1)) {
                                                  break L212;
                                                } else {
                                                  if (44 == ii.field_e[var2].field_B) {
                                                    break L212;
                                                  } else {
                                                    var3 = 1;
                                                    break L212;
                                                  }
                                                }
                                              }
                                            }
                                            L213: {
                                              L214: {
                                                if (349 <= (hi.field_a ^ -1)) {
                                                  break L214;
                                                } else {
                                                  if (0 > qh.field_g) {
                                                    break L214;
                                                  } else {
                                                    break L213;
                                                  }
                                                }
                                              }
                                              ii.field_e[var2].a((byte) -123, tc.field_l);
                                              break L213;
                                            }
                                            var2++;
                                            continue L203;
                                          }
                                        }
                                      } else {
                                        L215: {
                                          if (-50 == (vk.field_r ^ -1)) {
                                            L216: {
                                              if (pk.field_s) {
                                                stackOut_764_0 = 0;
                                                stackIn_765_0 = stackOut_764_0;
                                                break L216;
                                              } else {
                                                stackOut_763_0 = 1;
                                                stackIn_765_0 = stackOut_763_0;
                                                break L216;
                                              }
                                            }
                                            pk.field_s = stackIn_765_0 != 0;
                                            break L215;
                                          } else {
                                            if (vk.field_r != 70) {
                                              break L215;
                                            } else {
                                              if (tl.field_e) {
                                                tl.field_e = false;
                                                mi.field_D.d(-94);
                                                break L215;
                                              } else {
                                                tl.field_e = true;
                                                mi.field_D.a(true, -101, ga.field_e);
                                                break L215;
                                              }
                                            }
                                          }
                                        }
                                        if (13 != vk.field_r) {
                                          continue L192;
                                        } else {
                                          L217: {
                                            this.field_P = true;
                                            if (-2 != (wi.field_K ^ -1)) {
                                              break L217;
                                            } else {
                                              if (sf.field_h == 0) {
                                                this.field_P = false;
                                                break L217;
                                              } else {
                                                break L217;
                                              }
                                            }
                                          }
                                          L218: {
                                            if (sf.field_h == 6) {
                                              this.field_P = false;
                                              tb.a(0, true);
                                              sf.field_h = 9;
                                              this.field_J = true;
                                              break L218;
                                            } else {
                                              break L218;
                                            }
                                          }
                                          return;
                                        }
                                      }
                                    }
                                  }
                                }
                                break L109;
                              }
                            } else {
                              break L109;
                            }
                          }
                          return;
                        }
                      }
                      return;
                    } else {
                      var2 = pg.field_n / 32;
                      var3 = -(fi.field_B / 32) - -14;
                      L219: while (true) {
                        if (!ae.a(-75)) {
                          break L17;
                        } else {
                          L220: {
                            if ((vk.field_r ^ -1) == -14) {
                              this.field_L = false;
                              wi.field_K = 1;
                              break L220;
                            } else {
                              break L220;
                            }
                          }
                          L221: {
                            if (-42 == (vk.field_r ^ -1)) {
                              var15 = new byte[900];
                              var12 = var15;
                              var4_ref_byte__ = var12;
                              var5 = 0;
                              var6_int = 0;
                              L222: while (true) {
                                if (-301 >= (var6_int ^ -1)) {
                                  fl.field_T[qh.field_l][ql.field_c] = var15;
                                  try {
                                    L223: {
                                      var5 = 0;
                                      bk.a(var4_ref_byte__, var15.length, true, new File("level" + qh.field_l + ql.field_c + ".dat"));
                                      break L223;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L224: {
                                      var6 = (Exception) (Object) decompiledCaughtException;
                                      System.out.println(var6);
                                      break L224;
                                    }
                                  }
                                  break L221;
                                } else {
                                  incrementValue$39 = var5;
                                  var5++;
                                  var4_ref_byte__[incrementValue$39] = (byte)tc.field_l.field_j[var6_int];
                                  incrementValue$40 = var5;
                                  var5++;
                                  var4_ref_byte__[incrementValue$40] = (byte)tc.field_l.field_f[var6_int];
                                  incrementValue$41 = var5;
                                  var5++;
                                  var4_ref_byte__[incrementValue$41] = (byte)tc.field_l.field_a[var6_int];
                                  var6_int++;
                                  continue L222;
                                }
                              }
                            } else {
                              break L221;
                            }
                          }
                          L225: {
                            if (16 == vk.field_r) {
                              tc.field_l.field_a[var3 * 20 + var2] = 1;
                              break L225;
                            } else {
                              break L225;
                            }
                          }
                          L226: {
                            if ((vk.field_r ^ -1) != -18) {
                              break L226;
                            } else {
                              tc.field_l.field_a[var2 + var3 * 20] = 2;
                              break L226;
                            }
                          }
                          L227: {
                            if (-19 != (vk.field_r ^ -1)) {
                              break L227;
                            } else {
                              tc.field_l.field_a[var2 - -(var3 * 20)] = 3;
                              break L227;
                            }
                          }
                          L228: {
                            if (-20 == (vk.field_r ^ -1)) {
                              tc.field_l.field_a[20 * var3 + var2] = 4;
                              break L228;
                            } else {
                              break L228;
                            }
                          }
                          L229: {
                            if (20 == vk.field_r) {
                              tc.field_l.field_a[var2 - -(20 * var3)] = 5;
                              break L229;
                            } else {
                              break L229;
                            }
                          }
                          L230: {
                            if ((vk.field_r ^ -1) != -36) {
                              break L230;
                            } else {
                              tc.field_l.field_j[var2 - -(20 * var3)] = 0;
                              tc.field_l.field_f[20 * var3 + var2] = 0;
                              tc.field_l.field_a[20 * var3 + var2] = 0;
                              break L230;
                            }
                          }
                          L231: {
                            if ((vk.field_r ^ -1) == -33) {
                              tc.field_l.field_j[var2 - -(20 * var3)] = 1;
                              tc.field_l.field_f[var2 + var3 * 20] = 1;
                              break L231;
                            } else {
                              break L231;
                            }
                          }
                          L232: {
                            if (-34 != (vk.field_r ^ -1)) {
                              break L232;
                            } else {
                              tc.field_l.field_j[20 * var3 + var2] = 2;
                              tc.field_l.field_f[20 * var3 + var2] = 1;
                              break L232;
                            }
                          }
                          L233: {
                            if (34 != vk.field_r) {
                              break L233;
                            } else {
                              tc.field_l.field_j[20 * var3 + var2] = 3;
                              tc.field_l.field_f[var2 - -(var3 * 20)] = 1;
                              break L233;
                            }
                          }
                          L234: {
                            if (vk.field_r == 48) {
                              tc.field_l.field_j[var2 + var3 * 20] = 4;
                              tc.field_l.field_f[var2 + var3 * 20] = 0;
                              break L234;
                            } else {
                              break L234;
                            }
                          }
                          L235: {
                            if (-50 == (vk.field_r ^ -1)) {
                              tc.field_l.field_j[var3 * 20 + var2] = 5;
                              tc.field_l.field_f[var2 - -(var3 * 20)] = 0;
                              break L235;
                            } else {
                              break L235;
                            }
                          }
                          L236: {
                            if (50 == vk.field_r) {
                              tc.field_l.field_j[20 * var3 + var2] = 6;
                              tc.field_l.field_f[var2 + var3 * 20] = 0;
                              break L236;
                            } else {
                              break L236;
                            }
                          }
                          L237: {
                            if ((vk.field_r ^ -1) != -65) {
                              break L237;
                            } else {
                              tc.field_l.field_j[var3 * 20 + var2] = 7;
                              tc.field_l.field_f[var3 * 20 + var2] = 0;
                              break L237;
                            }
                          }
                          L238: {
                            if ((vk.field_r ^ -1) == -66) {
                              tc.field_l.field_j[var2 - -(20 * var3)] = 8;
                              tc.field_l.field_f[20 * var3 + var2] = 0;
                              break L238;
                            } else {
                              break L238;
                            }
                          }
                          L239: {
                            if ((vk.field_r ^ -1) != -67) {
                              break L239;
                            } else {
                              tc.field_l.field_j[var3 * 20 + var2] = 9;
                              tc.field_l.field_f[20 * var3 + var2] = 0;
                              break L239;
                            }
                          }
                          L240: {
                            if (-68 == (vk.field_r ^ -1)) {
                              tc.field_l.field_j[var2 - -(20 * var3)] = 10;
                              tc.field_l.field_f[var2 - -(20 * var3)] = 0;
                              break L240;
                            } else {
                              break L240;
                            }
                          }
                          L241: {
                            if (-69 == (vk.field_r ^ -1)) {
                              tc.field_l.field_j[var2 + var3 * 20] = 11;
                              tc.field_l.field_f[20 * var3 + var2] = 0;
                              break L241;
                            } else {
                              break L241;
                            }
                          }
                          L242: {
                            if ((vk.field_r ^ -1) != -70) {
                              break L242;
                            } else {
                              tc.field_l.field_j[var2 - -(var3 * 20)] = 12;
                              tc.field_l.field_f[var2 - -(var3 * 20)] = 0;
                              break L242;
                            }
                          }
                          L243: {
                            if (vk.field_r != 43) {
                              break L243;
                            } else {
                              L244: {
                                hi.field_c = hi.field_c + 1;
                                ql.field_c = ql.field_c + 1;
                                if ((ql.field_c ^ -1) != -6) {
                                  break L244;
                                } else {
                                  ga.field_e = fb.field_a;
                                  if (tl.field_e) {
                                    mi.field_D.a(true, -101, ga.field_e);
                                    break L244;
                                  } else {
                                    break L244;
                                  }
                                }
                              }
                              L245: {
                                if (ql.field_c >= 6) {
                                  hi.field_c = hi.field_c - ql.field_c;
                                  wg.field_b = wg.field_b + 6;
                                  qh.field_l = qh.field_l + 1;
                                  ql.field_c = 0;
                                  if (5 >= qh.field_l) {
                                    vk.a((byte) -75);
                                    break L245;
                                  } else {
                                    wg.field_b = wg.field_b - qh.field_l * 6;
                                    me.field_f = me.field_f - 30;
                                    qh.field_l = 5;
                                    break L245;
                                  }
                                } else {
                                  break L245;
                                }
                              }
                              ni.b(7530);
                              if (2 != qh.field_l) {
                                break L243;
                              } else {
                                L246: {
                                  if (-1 <= (hl.field_a ^ -1)) {
                                    break L246;
                                  } else {
                                    if (e.a(param0 + -751)) {
                                      break L246;
                                    } else {
                                      break L243;
                                    }
                                  }
                                }
                                this.s(208);
                                break L243;
                              }
                            }
                          }
                          if ((vk.field_r ^ -1) == -43) {
                            L247: {
                              ql.field_c = ql.field_c - 1;
                              hi.field_c = hi.field_c + 1;
                              if ((ql.field_c ^ -1) != -5) {
                                break L247;
                              } else {
                                vk.a((byte) -59);
                                break L247;
                              }
                            }
                            L248: {
                              if ((ql.field_c ^ -1) <= -1) {
                                break L248;
                              } else {
                                L249: {
                                  ql.field_c = 5;
                                  qh.field_l = qh.field_l - 1;
                                  if ((qh.field_l ^ -1) > -1) {
                                    qh.field_l = 0;
                                    break L249;
                                  } else {
                                    vk.a((byte) -118);
                                    break L249;
                                  }
                                }
                                ga.field_e = fb.field_a;
                                if (!tl.field_e) {
                                  break L248;
                                } else {
                                  mi.field_D.a(true, param0 + -740, ga.field_e);
                                  break L248;
                                }
                              }
                            }
                            ni.b(7530);
                            continue L219;
                          } else {
                            continue L219;
                          }
                        }
                      }
                    }
                  } else {
                    L250: {
                      if (0 >= md.field_a[var2][2]) {
                        break L250;
                      } else {
                        md.field_a[var2][2] = md.field_a[var2][2] - 5;
                        break L250;
                      }
                    }
                    var2++;
                    continue L66;
                  }
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
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
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
                        if (var11 >= param3) {
                          wizardrun.a(param0, param1, param2, var8, var9, param5, param6);
                          wizardrun.a(param0, (byte) 11, param2, param3, param4, var10, var8);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = sj.field_m[var11];
                            if (param0) {
                              stackOut_23_0 = ug.field_I[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = td.field_c[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var7_int >= var13) {
                              if ((var10 ^ -1) <= (var13 ^ -1)) {
                                break L4;
                              } else {
                                var10 = var13;
                                break L4;
                              }
                            } else {
                              sj.field_m[var11] = sj.field_m[var8];
                              incrementValue$1 = var8;
                              var8++;
                              sj.field_m[incrementValue$1] = var12;
                              if (var13 >= var9) {
                                break L4;
                              } else {
                                var9 = var13;
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param3;
                L5: while (true) {
                  if (var7_int <= param6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = sj.field_m[var8];
                          var10 = sj.field_m[1 + var8];
                          if (!uh.a(var10, var9, param0, (byte) -54)) {
                            break L7;
                          } else {
                            sj.field_m[var8] = var10;
                            sj.field_m[1 + var8] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
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
        int var3 = 0;
        L0: {
          var3 = field_H;
          if (param0 == 7069) {
            break L0;
          } else {
            field_E = -28;
            break L0;
          }
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
