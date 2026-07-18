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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ur.field_R = param1;
              hn.field_k = param2;
              if (param0 == 20) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pe.D(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void g() {
        field_E = null;
        field_F = null;
        field_D = null;
    }

    final void a(String[] param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        bv var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((pe) this).field_y.e(125);
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length) {
                  break L1;
                } else {
                  L2: {
                    var3_int = param0.length;
                    ((pe) this).field_B = new String[var3_int];
                    if (!param1) {
                      break L2;
                    } else {
                      var7 = null;
                      ((pe) this).a((String[]) null, true);
                      break L2;
                    }
                  }
                  var4_int = 0;
                  L3: while (true) {
                    if (var3_int <= var4_int) {
                      var4 = new bv(kw.field_b, 0, 1);
                      ((pe) this).field_C = new wp[1 + var3_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          ((pe) this).field_C[var3_int] = new wp(dt.field_h, (qm) this);
                          ((pe) this).field_C[var3_int].field_w = (mh) (Object) var4;
                          ((pe) this).field_C[var3_int].a(126, 0, 20 + 16 * var3_int - -16, 15, 100);
                          ((pe) this).a((pk) (Object) ((pe) this).field_C[var3_int], 89);
                          break L0;
                        } else {
                          ((pe) this).field_C[var5] = new wp(((pe) this).field_B[var5], (qm) this);
                          ((pe) this).field_C[var5].field_w = (mh) (Object) var4;
                          ((pe) this).field_C[var5].field_t = ji.field_b;
                          ((pe) this).field_C[var5].a(103, 0, 16 * var5 + 20, 15, 80);
                          ((pe) this).a((pk) (Object) ((pe) this).field_C[var5], 64);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      ((pe) this).field_B[var4_int] = kf.a((CharSequence) (Object) param0[var4_int], (byte) 38).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            ((pe) this).field_B = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("pe.E(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    pe(oe param0) {
        super(0, 0, 0, 0, (mh) null);
        try {
            ((pe) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 97, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param3 != 98) {
                L1: {
                  if (param2 >= 9) {
                    break L1;
                  } else {
                    ((pe) this).a(-89, -18, (byte) -61, -116);
                    break L1;
                  }
                }
                if (param3 != 99) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = ((pe) this).a(param0, false);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                stackOut_5_0 = ((pe) this).a((byte) 125, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("pe.KA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1) {
            var4 += 4;
        }
        if (param3) {
            var4 += 2;
        }
        var4++;
        return rt.field_G[var4];
    }

    final static boolean a() {
        return null != qk.field_O && kw.field_c.a(17704);
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (((pe) this).field_B.length <= var6_int) {
                L2: {
                  if (param1 == 710) {
                    break L2;
                  } else {
                    var8 = null;
                    pe.a(117, 1.4675142765045166f, (String) null);
                    break L2;
                  }
                }
                L3: {
                  if (param2 != ((pe) this).field_C[((pe) this).field_B.length]) {
                    break L3;
                  } else {
                    ((pe) this).field_A.a((byte) -86);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (((pe) this).field_C[var6_int] != param2) {
                    break L4;
                  } else {
                    ((pe) this).field_A.a(((pe) this).field_B[var6_int], 0);
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
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pe.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(20).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
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
