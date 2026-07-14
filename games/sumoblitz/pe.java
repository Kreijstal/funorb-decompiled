/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends sp implements ai {
    private oe field_A;
    static ri[] field_F;
    private wp[] field_C;
    static gj field_E;
    static String field_D;
    private String[] field_B;

    final static void a(int param0, float param1, String param2) {
        ur.field_R = param1;
        hn.field_k = param2;
        if (param0 != 20) {
            field_F = null;
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -18490) {
            field_F = null;
        }
        field_D = null;
    }

    final void a(String[] param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        bv var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          ((pe) this).field_y.e(125);
          if (param0 == null) {
            break L0;
          } else {
            if (0 == param0.length) {
              break L0;
            } else {
              L1: {
                var3 = param0.length;
                ((pe) this).field_B = new String[var3];
                if (!param1) {
                  break L1;
                } else {
                  var7 = null;
                  ((pe) this).a((String[]) null, true);
                  break L1;
                }
              }
              var4_int = 0;
              L2: while (true) {
                if (var3 <= var4_int) {
                  var4 = new bv(kw.field_b, 0, 1);
                  ((pe) this).field_C = new wp[1 + var3];
                  var5 = 0;
                  L3: while (true) {
                    if (var5 >= var3) {
                      ((pe) this).field_C[var3] = new wp(dt.field_h, (qm) this);
                      ((pe) this).field_C[var3].field_w = (mh) (Object) var4;
                      ((pe) this).field_C[var3].a(126, 0, 20 + 16 * var3 - -16, 15, 100);
                      ((pe) this).a((pk) (Object) ((pe) this).field_C[var3], 89);
                      return;
                    } else {
                      ((pe) this).field_C[var5] = new wp(((pe) this).field_B[var5], (qm) this);
                      ((pe) this).field_C[var5].field_w = (mh) (Object) var4;
                      ((pe) this).field_C[var5].field_t = ji.field_b;
                      ((pe) this).field_C[var5].a(103, 0, 16 * var5 + 20, 15, 80);
                      ((pe) this).a((pk) (Object) ((pe) this).field_C[var5], 64);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  ((pe) this).field_B[var4_int] = kf.a((CharSequence) (Object) param0[var4_int], (byte) 38).replace(' ', ' ');
                  var4_int++;
                  continue L2;
                }
              }
            }
          }
        }
        ((pe) this).field_B = null;
    }

    pe(oe param0) {
        super(0, 0, 0, 0, (mh) null);
        ((pe) this).field_A = param0;
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, (byte) 97, param3))) {
            return true;
        }
        if (param3 == 98) {
            return ((pe) this).a((byte) 125, param0);
        }
        if (param2 < 9) {
            ((pe) this).a(-89, -18, (byte) -61, -116);
        }
        if (-100 == (param3 ^ -1)) {
            return ((pe) this).a(param0, false);
        }
        return false;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
            return null;
        }
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        return rt.field_G[var4];
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -34) {
            break L0;
          } else {
            field_E = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == qk.field_O) {
              break L2;
            } else {
              if (!kw.field_c.a(17704)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (((pe) this).field_B.length <= var6) {
            L1: {
              if (param1 == 710) {
                break L1;
              } else {
                var8 = null;
                pe.a(117, 1.4675142765045166f, (String) null);
                break L1;
              }
            }
            L2: {
              if (param2 != ((pe) this).field_C[((pe) this).field_B.length]) {
                break L2;
              } else {
                ((pe) this).field_A.a((byte) -86);
                break L2;
              }
            }
            return;
          } else {
            if (((pe) this).field_C[var6] == param2) {
              ((pe) this).field_A.a(((pe) this).field_B[var6], 0);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        ci.field_g = ri.b(param3, "", "fontalpha");
        g.field_a = gd.a(param1, (byte) -79, "font", "");
        mn.field_b = ri.b(param3, "", "fontglow");
        hu.field_c = g.field_a;
        wj.field_i = ri.b(param3, "", "smallfontalpha");
        qr.field_a = gd.a(param1, (byte) -39, "smallfont", "");
        au.field_j = ri.b(param3, "", "glowfontalpha");
        sv.field_a = qr.field_a;
        ld.field_F = ri.b(param3, "", "boldfontalpha");
        ma.field_b = gd.a(param1, (byte) -36, "boldfont", "");
        nw.field_f = ri.b(param3, "", "boldglowfontalpha");
        sq.field_b = ma.field_b;
        field_F = ri.b(param3, "", "menu_frame");
        rh.field_q = ri.b(param3, "", "tooltip_kit");
        hi.field_b = ri.b(param3, "", "achievements");
        gk.field_N = ri.a(param0, "basic", "unachieved");
        ud.field_p = ri.a(param0, "basic", "locked");
        ms.field_d = ri.a(param3, "", "titleimage");
        rc.field_i = ri.a(param3, "", "lock");
        hc.field_b = ri.a(param3, "", "heart");
        oi.field_d = ri.a(param3, "", "skull");
        tk.field_c = ri.b(param3, "", "slider");
        if (param2 == 20) {
          jj.field_c = ri.b(param3, "", "statline_tab");
          rw.field_r = ri.b(param3, "", "statline_tab_flip");
          ok.field_d = ri.b(param3, "", "button_off");
          hh.field_a = ri.b(param3, "", "button_over");
          sk.field_c = ri.b(param3, "", "button_on");
          gq.field_o = ri.b(param3, "", "chargebar_vertical");
          cb.field_e = ri.a(param3, "", "congratulations");
          ve.field_k = ri.a(param3, "", "mouse");
          dt.field_n = ri.a(param3, "", "keyboard");
          rl.field_l = ri.b(param3, "", "player");
          kk.field_e = ri.b(param3, "", "mook");
          ks.field_w = ri.b(param3, "", "fast");
          fl.field_r = ri.b(param3, "", "sleeper");
          kr.field_b = ri.b(param3, "", "splitter");
          qk.field_V = ri.b(param3, "", "seeker");
          ph.field_a = ri.b(param3, "", "shadowdudes");
          jd.field_h = ri.b(param3, "", "mod_armour");
          bk.field_b = ri.b(param3, "", "mod_bomb");
          cd.field_c = ri.b(param3, "", "mod_spikes");
          lh.field_k = ri.a(param3, "", "zap");
          eu.field_a = ri.b(param3, "", "chargebar");
          bl.field_a = ri.a(param3, "", "bounceup");
          uj.field_c = ri.b(param3, "", "powerups");
          df.field_d = ri.a(param3, "", "particle");
          cl.field_v = ri.b(param3, "", "particles");
          kq.field_T = ri.a(param3, "", "particle_alpha");
          dq.field_v = ri.b(param3, "", "particles_alpha");
          kf.field_w = ri.b(param3, "", "particle_ring");
          bj.field_g = ri.a(param3, "", "particle_sprinkle");
          ks.field_t = ri.a(param3, "", "particle_star");
          rq.field_c = ri.a(param3, "", "particle_pixel");
          ue.field_p = ri.a(param3, "", "particle_pixel_alpha");
          pc.field_c = ri.a(param3, "", "ghost");
          no.field_c = ri.a(param3, "", "ghost_cloud");
          rt.field_E = ri.a(param3, "", "ghost_splatter");
          mn.field_c = ri.a(param3, "", "shadow");
          gw.field_C = ri.a(param3, "", "driftinglight");
          wf.field_a = ri.a(param3, "", "driftinglight_snow");
          ml.field_p = ri.a(param3, "", "driftinglight_rough");
          th.field_C = ri.a(param3, "", "shockwave");
          os.field_b = ri.b(param3, "", "lightningrod");
          sd.field_a = ri.b(param3, "", "lightningrod_lowgraphics");
          hp.field_n = ri.b(param3, "", "electricity");
          ni.field_h = ri.b(param3, "", "electricity_flip");
          rj.field_f = ri.a(param3, "", "attract");
          uu.field_o = ri.a(param3, "", "repulse");
          lr.field_c = ri.a(param3, "", "icepatch");
          ei.field_b = ri.b(param3, "", "attractor");
          rs.field_e = ri.a(param3, "", "bouncer");
          kq.field_S = ri.b(param3, "", "landmine");
          nn.field_a = ri.b(param3, "", "repeller");
          we.field_C = ri.b(param3, "", "accelerator");
          pc.field_b = ri.b(param3, "", "teleporter");
          mc.field_F = ri.b(param3, "", "ice");
          om.field_m = ri.b(param3, "", "zaptrap");
          ke.field_c = ri.a(param3, "reticule");
          tc.field_i = ri.a(param3, "", "reticule_flat");
          hc.field_a = ri.b(param3, "", "gravitywell");
          rl.field_o = ri.a(param3, "", "gravitywell_field");
          pq.field_F = ri.b(param3, "", "tutorial_images");
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -105, param3);
        if (!(0 == param3)) {
            return;
        }
        vn var5 = kw.field_b;
        if (((pe) this).field_B != null) {
            int discarded$0 = var5.a(ia.field_a, param0 - -((pe) this).field_r, ((pe) this).field_v + param1, ((pe) this).field_q, 20, 16777215, -1, 0, 0, var5.field_I + var5.field_s);
        }
        if (param2 > -35) {
            ((pe) this).a(120, -19, (byte) -32, 10);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Orb Points";
    }
}
