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
        try {
            ur.field_R = param1;
            hn.field_k = param2;
            if (param0 != 20) {
                field_F = (ri[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -18490) {
            field_F = (ri[]) null;
        }
        field_D = null;
    }

    final void a(String[] param0, boolean param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        bv var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_y.e(125);
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0.length;
                    this.field_B = new String[var3_int];
                    if (!param1) {
                      break L2;
                    } else {
                      var7 = (String[]) null;
                      this.a((String[]) null, true);
                      break L2;
                    }
                  }
                  var4_int = 0;
                  L3: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new bv(kw.field_b, 0, 1);
                      this.field_C = new wp[1 + var3_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_C[var3_int] = new wp(dt.field_h, (qm) (this));
                          this.field_C[var3_int].field_w = (mh) ((Object) var4);
                          this.field_C[var3_int].a(126, 0, 20 + 16 * var3_int - -16, 15, 100);
                          this.a(this.field_C[var3_int], 89);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_C[var5] = new wp(this.field_B[var5], (qm) (this));
                          this.field_C[var5].field_w = (mh) ((Object) var4);
                          this.field_C[var5].field_t = ji.field_b;
                          this.field_C[var5].a(103, 0, 16 * var5 + 20, 15, 80);
                          this.a(this.field_C[var5], 64);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_B[var4_int] = kf.a((CharSequence) ((Object) param0[var4_int]), (byte) 38).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            this.field_B = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("pe.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pe(oe param0) {
        super(0, 0, 0, 0, (mh) null);
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 97, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 != 98) {
                L1: {
                  if (param2 >= 9) {
                    break L1;
                  } else {
                    this.a(-89, -18, (byte) -61, -116);
                    break L1;
                  }
                }
                if (-100 != (param3 ^ -1)) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.a(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) 125, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("pe.KA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
            return (String) null;
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
        L0: {
          if (param0 < -34) {
            break L0;
          } else {
            field_E = (gj) null;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (this.field_B.length <= var6_int) {
                L2: {
                  if (param1 == 710) {
                    break L2;
                  } else {
                    var8 = (String) null;
                    pe.a(117, 1.4675142765045166f, (String) null);
                    break L2;
                  }
                }
                L3: {
                  if (param2 != this.field_C[this.field_B.length]) {
                    break L3;
                  } else {
                    this.field_A.a((byte) -86);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_C[var6_int] != param2) {
                    break L4;
                  } else {
                    this.field_A.a(this.field_B[var6_int], 0);
                    break L4;
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
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
        if (param2 != 20) {
            return;
        }
        try {
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
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "pe.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -105, param3);
        if (!(0 == param3)) {
            return;
        }
        vn var5 = kw.field_b;
        if (this.field_B != null) {
            var5.a(ia.field_a, param0 - -this.field_r, this.field_v + param1, this.field_q, 20, 16777215, -1, 0, 0, var5.field_I + var5.field_s);
        }
        if (param2 > -35) {
            this.a(120, -19, (byte) -32, 10);
        }
    }

    static {
        field_D = "Orb Points";
    }
}
