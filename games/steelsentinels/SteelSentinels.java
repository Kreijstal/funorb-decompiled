/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends n {
    static String field_H;
    static String field_I;
    static gh field_J;
    public static int field_G;

    final void a(byte param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        ai var3 = null;
        gh var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        ee var6_ref_ee = null;
        int var7 = 0;
        int var8 = 0;
        mb var9 = null;
        int var9_int = 0;
        qb var9_ref = null;
        wl var9_ref2 = null;
        mb var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int stackIn_130_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_129_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_134_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_132_0 = 0;
        boolean stackOut_132_1 = false;
        var13 = field_G;
        try {
          L0: {
            var2_ref = gl.a(false);
            if (ol.j(0)) {
              df.a(-111, var2_ref, qb.g(2));
              return;
            } else {
              if (gh.field_pb) {
                if (co.a(false)) {
                  L1: {
                    L2: {
                      this.n(53);
                      if (pm.field_T == vb.field_g) {
                        break L2;
                      } else {
                        L3: {
                          if (pm.field_T == 0) {
                            break L3;
                          } else {
                            L4: {
                              if (vb.field_g != 0) {
                                break L4;
                              } else {
                                an.a(pm.field_T, pc.field_w, false, 125);
                                an.a(vb.field_g, pc.field_w, false, -40);
                                if (var13 == 0) {
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if (pm.field_U < 10) {
                                break L5;
                              } else {
                                an.a(vb.field_g, ea.field_k, false, 86);
                                if (var13 == 0) {
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            an.a(pm.field_T, pc.field_w, false, -110);
                            if (var13 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        an.a(vb.field_g, pc.field_w, false, -62);
                        an.a(pm.field_T, pc.field_w, false, -34);
                        if (var13 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    an.a(pm.field_T, pc.field_w, true, -15);
                    break L1;
                  }
                  L6: {
                    L7: {
                      if (!pc.field_w) {
                        break L7;
                      } else {
                        if (ea.field_k) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      L9: {
                        da.a(li.c(8), 25104);
                        if (pm.field_T != -2) {
                          break L9;
                        } else {
                          var3_ref = hl.a((byte) -66);
                          if (var3_ref == null) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                L12: {
                                  var4 = var3_ref.field_Rb;
                                  var5_int = var3_ref.field_cb;
                                  pb.a(var4 + 4, 4 + var5_int + 42, var3_ref.field_Rb + -4 + var3_ref.field_zb, var3_ref.field_cb + (-4 + var3_ref.field_Lb));
                                  if (null == ih.field_s) {
                                    break L12;
                                  } else {
                                    if (!fc.field_e[101]) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                di.field_g = -1;
                                ih.field_s = new ee(-1, 1, new String[0], new int[1][], false, 0, 0, 2, false, false);
                                ih.field_s.field_Q = 2;
                                if (var13 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                              L13: {
                                var6_ref_ee = ih.field_s;
                                var7 = var4 + -2;
                                if (var6_ref_ee.field_K.b((byte) -128) >= 2) {
                                  break L13;
                                } else {
                                  L14: {
                                    var9_int = -100000;
                                    var10 = new mb(0, var9_int, var6_ref_ee);
                                    var11 = 0;
                                    if (var6_ref_ee.field_K.e(13058) != null) {
                                      var11 = -((mb) (Object) var6_ref_ee.field_K.e(13058)).field_jc + 1;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    var12 = ua.field_v;
                                    if (0.5 > Math.random()) {
                                      var12 = ua.field_x;
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (0.3 <= Math.random()) {
                                      break L16;
                                    } else {
                                      var12 = ua.field_P;
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (0.1 > Math.random()) {
                                      var12 = ua.field_N;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (0.1 > Math.random()) {
                                      var12 = ua.field_O;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  var10.a(var12, true, false, -1, var11);
                                  var10.field_Nb = 10;
                                  var10.d(-28033);
                                  var10.field_ab = 1000;
                                  var10.field_Qb = 250;
                                  var10.j(-5);
                                  var6_ref_ee.field_K.a(3, (ck) (Object) var10);
                                  break L13;
                                }
                              }
                              var8 = 310;
                              var9 = (mb) (Object) var6_ref_ee.field_K.e(13058);
                              L19: while (true) {
                                L20: {
                                  if (null == var9) {
                                    break L20;
                                  } else {
                                    boolean discarded$3 = var9.a((byte) -22, var7, oh.field_f, pi.field_c, var8);
                                    var9 = (mb) (Object) var6_ref_ee.field_K.a((byte) -119);
                                    if (var13 != 0) {
                                      break L10;
                                    } else {
                                      if (var13 == 0) {
                                        continue L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                var9_ref = (qb) (Object) var6_ref_ee.field_o.e(13058);
                                L21: while (true) {
                                  L22: {
                                    L23: {
                                      if (null == var9_ref) {
                                        break L23;
                                      } else {
                                        var9_ref.a(var7, var8, true, (byte) -89);
                                        var9_ref = (qb) (Object) var6_ref_ee.field_o.a((byte) -112);
                                        if (var13 != 0) {
                                          break L22;
                                        } else {
                                          if (var13 == 0) {
                                            continue L21;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                    var9_ref2 = (wl) (Object) var6_ref_ee.field_db.e(13058);
                                    L24: while (true) {
                                      L25: {
                                        if (null == var9_ref2) {
                                          break L25;
                                        } else {
                                          var9_ref2.a(var8, var7, 4);
                                          var9_ref2 = (wl) (Object) var6_ref_ee.field_db.a((byte) -39);
                                          if (var13 != 0) {
                                            break L10;
                                          } else {
                                            if (var13 == 0) {
                                              continue L24;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                      var9_ref = (qb) (Object) var6_ref_ee.field_o.e(13058);
                                      break L22;
                                    }
                                  }
                                  L26: while (true) {
                                    if (var9_ref == null) {
                                      break L10;
                                    } else {
                                      var9_ref.a(var7, var8, false, (byte) 31);
                                      var9_ref = (qb) (Object) var6_ref_ee.field_o.a((byte) -82);
                                      if (var13 != 0) {
                                        break L8;
                                      } else {
                                        if (var13 == 0) {
                                          continue L26;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            pb.c();
                            break L9;
                          }
                        }
                      }
                      r.a(false, li.c(8));
                      break L8;
                    }
                    ci.a(li.c(8), (byte) -62);
                    break L6;
                  }
                  L27: {
                    var3 = (ai) (Object) bd.field_b.e(13058);
                    if (var3 == null) {
                      break L27;
                    } else {
                      L28: {
                        var4 = 6;
                        var5_int = 250;
                        var6 = var4 * 2 + 64;
                        var7 = 0;
                        if (~ob.field_o > ~var6) {
                          var7 = var7 + (ob.field_o + -var6);
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      L29: {
                        var8 = -var5_int + 640;
                        if (~(500 - var6) > ~ob.field_o) {
                          var7 = var7 + (500 + (-ob.field_o - var6));
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      L30: {
                        pb.c(var8, var7, var5_int, var6, 0, 192);
                        pb.h(var8, var7, var5_int, var6, 39398, 192);
                        if (var3.field_q != null) {
                          break L30;
                        } else {
                          int discarded$4 = ff.field_lb.a(var3.field_u, var8 - -var4, var7 + var4, -(2 * var4) + var5_int, -(2 * var4) + var6, 52479, -1, 0, 1, 12);
                          if (var13 == 0) {
                            break L27;
                          } else {
                            break L30;
                          }
                        }
                      }
                      var3.field_q.c(var8 - -var4, var7 - -var4, 64, 64);
                      int discarded$5 = ff.field_lb.a(var3.field_u, var4 * 2 + var8 + 64, var7 - -var4, -64 + (var5_int - var4 * 3), var6 - var4 * 2, 52479, -1, 0, 1, 12);
                      break L27;
                    }
                  }
                  L31: {
                    L32: {
                      var4 = 27 / ((param0 - 56) / 48);
                      if (!mg.b(true)) {
                        break L32;
                      } else {
                        pb.f(0, 0, pb.field_c, pb.field_j);
                        qf.a(100);
                        if (var13 == 0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    L33: {
                      if (cf.c((byte) 92)) {
                        break L33;
                      } else {
                        if (!ri.b(-113)) {
                          break L31;
                        } else {
                          if (!mg.b(true)) {
                            pb.f(0, 0, pb.field_c, pb.field_j);
                            ec.a((byte) -95);
                            if (var13 == 0) {
                              break L31;
                            } else {
                              break L33;
                            }
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                    L34: {
                      stackOut_129_0 = -64;
                      stackIn_134_0 = stackOut_129_0;
                      stackIn_130_0 = stackOut_129_0;
                      if (wb.field_c != null) {
                        stackOut_134_0 = stackIn_134_0;
                        stackOut_134_1 = 1;
                        stackIn_135_0 = stackOut_134_0;
                        stackIn_135_1 = stackOut_134_1;
                        break L34;
                      } else {
                        stackOut_130_0 = stackIn_130_0;
                        stackIn_132_0 = stackOut_130_0;
                        stackOut_132_0 = stackIn_132_0;
                        stackOut_132_1 = kc.field_q;
                        stackIn_135_0 = stackOut_132_0;
                        stackIn_135_1 = stackOut_132_1 ? 1 : 0;
                        break L34;
                      }
                    }
                    qa.a((byte) stackIn_135_0, stackIn_135_1 != 0);
                    break L31;
                  }
                  L35: {
                    if (in.field_i != in.field_h) {
                      var5_int = 256 * ji.field_a / 16;
                      if (var5_int <= 0) {
                        break L35;
                      } else {
                        pb.c(0, 0, pb.field_c, pb.field_j, 0, var5_int);
                        break L35;
                      }
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (cb.field_l < ej.field_v) {
                      pb.h(2, 2, 102, 15, 6710886, 128);
                      pb.a(3, 3, 100, 13, 0);
                      pb.a(4, 4, cb.field_l * 33 + 33 * al.field_g / ua.field_r, 11, 39398);
                      if (fk.field_d == null) {
                        break L36;
                      } else {
                        var5 = db.a(ff.field_sb, -98, new String[1]);
                        fk.field_d.a(var5, 54, 12, 39398, 0);
                        pb.a(3, 3, 33 * cb.field_l + al.field_g * 33 / ua.field_r, 17);
                        fk.field_d.a(var5, 54, 12, 0, 39398);
                        pb.c();
                        break L36;
                      }
                    } else {
                      break L36;
                    }
                  }
                  kg.a(0, 0, 28594, var2_ref);
                  break L0;
                } else {
                  mc.a(qj.field_i, 100.0f, -21801);
                  en.a(var2_ref, -28003);
                  return;
                }
              } else {
                en.a(var2_ref, -28003);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.EA(" + param0 + ')');
        }
    }

    private final boolean k(byte param0) {
        gk[] var2 = null;
        int var2_int = 0;
        gk[] var3 = null;
        int var3_int = 0;
        wk[] var3_array = null;
        wk[][] var3_array2 = null;
        int var4_int = 0;
        wk[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        byte stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        var6 = field_G;
        ec.a(35);
        if (null == aj.field_x) {
          if (ti.field_t == null) {
            if (g.field_i == null) {
              if (oh.field_a != null) {
                L0: {
                  L1: {
                    mc.a(jl.field_i, 90.0f, param0 + -21749);
                    ((SteelSentinels) this).a((byte) 109);
                    var2 = cj.a(-126, "basic", kd.field_x, "ranks");
                    va.field_j = vd.a(ej.field_t, "roman20", tm.field_d, param0 + 51, "");
                    dm.field_f = be.a(kd.field_x, oh.field_a, (byte) -102, "biting30", "basic");
                    dk.field_h = vd.a(oh.field_a, "basic", kd.field_x, param0 ^ 51, "smallfont");
                    fk.field_d = vd.a(oh.field_a, "basic", kd.field_x, -1, "tinyfont");
                    ff.field_lb = vd.a(ej.field_t, "basicfont12", tm.field_d, param0 + 51, "");
                    pl.field_U = be.a(kd.field_x, oh.field_a, (byte) -93, "bitingfont", "basic");
                    ui.field_U = be.a(kd.field_x, oh.field_a, (byte) -84, "bitinghalf", "basic");
                    ql.field_Tb = dd.a(kd.field_x, oh.field_a, true, "basic", "menutitlefont");
                    wk[] discarded$11 = cf.a("menu_overlays", "basic", (byte) -87, kd.field_x);
                    wd.field_a = nb.a(kd.field_x, (byte) 42, "frame", "basic");
                    km.field_e = nb.a(kd.field_x, (byte) -119, "frame_filled", "basic");
                    ag.field_o = nb.a(kd.field_x, (byte) -60, "button_frame", "basic");
                    vk.field_l = nb.a(kd.field_x, (byte) -122, "button_raised", "basic");
                    ja.field_e = nb.a(kd.field_x, (byte) 36, "button_depressed", "basic");
                    if (ni.b(param0 ^ -44)) {
                      break L1;
                    } else {
                      if (rd.field_b > 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3 = cj.a(121, "basic", kd.field_x, "expansion");
                  eh.field_c = new ng((java.applet.Applet) this, dm.field_e, var3, ji.field_f);
                  break L0;
                }
                od.field_c = cf.a("achievements_large", "basic", (byte) -79, kd.field_x);
                vg.field_h = cf.a("cursors", "basic", (byte) -54, kd.field_x);
                var3_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var3_int <= ~vg.field_h.length) {
                        break L4;
                      } else {
                        vg.field_h[var3_int].e();
                        var3_int++;
                        if (var6 != 0) {
                          break L3;
                        } else {
                          if (var6 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    ff.field_tb = rl.a(tm.field_d, "basic", "unachieved", false);
                    ug.field_P = rl.a(tm.field_d, "basic", "locked", false);
                    d.field_G = rl.a(tm.field_d, "basic", "orbcoin", false);
                    g.field_d = new wk(40, 40);
                    g.field_d.d();
                    ff.field_tb.c(0, 0, 40, 40);
                    sj.field_F = new wk(40, 40);
                    sj.field_F.d();
                    ug.field_P.c(0, 0, 40, 40);
                    sb.field_bb.b((byte) 126);
                    rg.a(false, ff.field_tb);
                    rg.a(false, ug.field_P);
                    rg.a(false, d.field_G);
                    ig.field_o = new wk[5][];
                    wa.a((cm) null, 2, kd.field_x);
                    ea.field_m = cf.a("darkblueboxfilled", "basic", (byte) -52, kd.field_x);
                    be.field_f = cf.a("obviousdarkbluebox", "basic", (byte) -56, kd.field_x);
                    tk.field_t = cf.a("darkbluebox", "basic", (byte) -54, kd.field_x);
                    sa.field_e = cf.a("darkerbluebox", "basic", (byte) -30, kd.field_x);
                    nn.field_a = cf.a("lightbluetabbox", "basic", (byte) -108, kd.field_x);
                    lj.field_b = cf.a("darkgrayboxfilled", "basic", (byte) -114, kd.field_x);
                    co.field_d = cf.a("darkgraybox", "basic", (byte) -67, kd.field_x);
                    pa.field_g = cf.a("sectiontab", "basic", (byte) -99, kd.field_x);
                    bm.field_Y = cf.a("tabselected", "basic", (byte) -40, kd.field_x);
                    sb.field_X = cf.a("tabunselected", "basic", (byte) -67, kd.field_x);
                    oe.field_f = cf.a("tabmouseover", "basic", (byte) -71, kd.field_x);
                    si.field_E = cf.a("sentinelimages", "basic", (byte) -111, kd.field_x);
                    tk.field_t[4] = null;
                    be.field_f[4] = null;
                    pd.field_T = cf.a("greybox", "basic", (byte) -90, kd.field_x);
                    pd.field_T[4] = null;
                    ao.field_y = rl.a(kd.field_x, "basic", "dropdown_mark", false);
                    ac.field_bb = rl.a(kd.field_x, "basic", "button_cover", false);
                    break L3;
                  }
                  var3_int = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (~ac.field_bb.field_E.length >= ~var3_int) {
                          break L7;
                        } else {
                          stackOut_94_0 = ~ac.field_bb.field_E[var3_int];
                          stackOut_94_1 = -16777216;
                          stackIn_101_0 = stackOut_94_0;
                          stackIn_101_1 = stackOut_94_1;
                          stackIn_95_0 = stackOut_94_0;
                          stackIn_95_1 = stackOut_94_1;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_95_0 == stackIn_95_1) {
                                ac.field_bb.field_E[var3_int] = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3_int++;
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      oa.field_N = rl.a(kd.field_x, "basic", "goldstar", false);
                      td.field_ec = rl.a(kd.field_x, "basic", "silverstar", false);
                      wk discarded$12 = rl.a(kd.field_x, "basic", "starfrigate", false);
                      sb.field_W = rl.a(kd.field_x, "basic", "starcruiser", false);
                      hb.field_e = sb.field_W.a();
                      jc.field_c = cj.a(27, "basic", kd.field_x, "texticons");
                      bb.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
                      dk.field_h.a((ea[]) (Object) jc.field_c, bb.field_X);
                      fk.field_d.a((ea[]) (Object) jc.field_c, bb.field_X);
                      pl.field_U.a((ea[]) (Object) jc.field_c, bb.field_X);
                      ff.field_lb.a((ea[]) (Object) jc.field_c, bb.field_X);
                      stackOut_100_0 = param0;
                      stackOut_100_1 = -5;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      break L6;
                    }
                    var3 = cj.a(stackIn_101_0 ^ stackIn_101_1, "basic", kd.field_x, "instr_texticons");
                    ub.field_a = new gk[18];
                    pg.field_w = new int[ub.field_a.length];
                    var4_int = 0;
                    L9: while (true) {
                      L10: {
                        L11: {
                          if (~var4_int <= ~ub.field_a.length) {
                            break L11;
                          } else {
                            pg.field_w[var4_int] = 14;
                            var4_int++;
                            if (var6 != 0) {
                              break L10;
                            } else {
                              if (var6 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        ii.a((Object[]) (Object) var3, 0, (Object[]) (Object) ub.field_a, 6, 2);
                        ub.field_a[17] = ub.field_a[7];
                        ah.field_Zb = cf.a("scrolldown", "basic", (byte) -87, kd.field_x);
                        sj.field_x = cf.a("scrollup", "basic", (byte) -33, kd.field_x);
                        jn.field_f = cf.a("scrollbar", "basic", (byte) -95, kd.field_x);
                        qi.field_a = cf.a("scrollvert", "basic", (byte) -104, kd.field_x);
                        wc.field_k = cf.a("frame_shiny", "basic", (byte) -123, kd.field_x);
                        ta.field_c = cf.a("frame_shiny_bright", "basic", (byte) -43, kd.field_x);
                        cm.field_b = cf.a("frame_basic_bright", "basic", (byte) -128, kd.field_x);
                        ng.field_p = cf.a("frame_basic_thin", "basic", (byte) -55, kd.field_x);
                        vh.field_b = cf.a("frame_basic", "basic", (byte) -127, kd.field_x);
                        oa.field_U = cf.a("display_frame", "basic", (byte) -35, kd.field_x);
                        oa.field_U[4] = null;
                        bl.field_d = cf.a("config_tut_frame", "basic", (byte) -32, kd.field_x);
                        bl.field_d[4] = null;
                        oa.field_Q = cf.a("popup_frame", "basic", (byte) -94, kd.field_x);
                        oa.field_Q[4] = null;
                        si.field_l = cj.a(125, "basic", kd.field_x, "mechbits");
                        hb.field_j = cf.a("weaponclasses", "basic", (byte) -107, kd.field_x);
                        ja.field_d = cj.a(-123, "basic", kd.field_x, "batdrone");
                        lb.field_Zb = cj.a(param0 ^ 69, "basic", kd.field_x, "drones");
                        jd.field_qb = cj.a(param0 + 163, "basic", kd.field_x, "bits_golem");
                        mb.field_nc = cj.a(42, "basic", kd.field_x, "bits_bird");
                        li.field_z = cj.a(-115, "basic", kd.field_x, "bits_slave");
                        wi.field_C = cj.a(125, "basic", kd.field_x, "bits_babel");
                        ne.field_R = cj.a(-128, "basic", kd.field_x, "bits_valhalla");
                        hk.field_Ec = cj.a(-128, "basic", kd.field_x, "bits_orbital");
                        ui.field_V = cj.a(61, "basic", kd.field_x, "bits_bertha");
                        vc.field_b = cj.a(67, "basic", kd.field_x, "bits_smasher");
                        ng.field_c = cj.a(76, "basic", kd.field_x, "bits_scorpion");
                        qb.field_L = cj.a(-116, "basic", kd.field_x, "bits_hurricane");
                        cf.field_u = cj.a(param0 + -65, "basic", kd.field_x, "bits_commando");
                        ea.field_b = cj.a(param0 ^ -112, "basic", kd.field_x, "bits_turtle");
                        ml.field_c = cj.a(param0 + 19, "basic", kd.field_x, "droppod");
                        fa.field_a = cj.a(param0 ^ -128, "basic", kd.field_x, "infantary");
                        ie.field_d = cj.a(-123, "basic", kd.field_x, "modules");
                        break L10;
                      }
                      var3_array = rh.field_v;
                      var3_array[0] = rl.a(kd.field_x, "basic", "instr_giantrobot", false);
                      var3_array[1] = rl.a(kd.field_x, "basic", "instr_queue", false);
                      var3_array[2] = rl.a(kd.field_x, "Basic", "instr_walk", false);
                      var3_array[3] = rl.a(kd.field_x, "basic", "instr_jump", false);
                      var3_array[4] = rl.a(kd.field_x, "basic", "instr_thrust", false);
                      var3_array[5] = ie.field_d[16].a();
                      var3_array[6] = rl.a(kd.field_x, "basic", "instr_selweapon", false);
                      var3_array[7] = rl.a(kd.field_x, "basic", "instr_target", false);
                      var3_array[8] = rl.a(kd.field_x, "basic", "instr_noenergy", false);
                      var3_array[9] = ie.field_d[32].a();
                      var3_array[10] = ie.field_d[33].a();
                      var3_array[11] = rl.a(kd.field_x, "basic", "instr_bigshieldicon", false);
                      var3_array[12] = ie.field_d[27].a();
                      var3_array[13] = rl.a(kd.field_x, "basic", "instr_stats", false);
                      var3_array[14] = rl.a(kd.field_x, "basic", "instr_chassis", false);
                      var3_array[15] = rl.a(kd.field_x, "basic", "instr_components", false);
                      var3_array[16] = rl.a(kd.field_x, "basic", "instr_weapons", false);
                      var3_array[17] = rl.a(kd.field_x, "basic", "instr_modules", false);
                      var3_array[18] = rl.a(kd.field_x, "basic", "instr_engineer", false);
                      var3_array[19] = rl.a(kd.field_x, "basic", "instr_coop", false);
                      var3_array[20] = rl.a(kd.field_x, "basic", "instr_team", false);
                      var3_array[25] = rl.a(kd.field_x, "basic", "instr_techvalue", false);
                      fa.field_b = rl.a(kd.field_x, "basic", "logo_menu_chromakey", false);
                      ob.field_z = (ek) (Object) dn.a("basic", -63, "main_lower_panel", kd.field_x);
                      ma.field_eb = (ek) (Object) dn.a("basic", param0 ^ 75, "main_title_panel", kd.field_x);
                      fi.field_j = rl.a(kd.field_x, "basic", "menu_mesh", false);
                      ic.field_db = rl.a(kd.field_x, "basic", "menu_titlebar", false);
                      pl.field_T = nb.a(kd.field_x, (byte) -62, "menu_button_1", "basic");
                      wk[] discarded$13 = nb.a(kd.field_x, (byte) 107, "empty_button", "basic");
                      el.field_Ub = rl.a(kd.field_x, "basic", "prevbtn", false);
                      gm.field_b = rl.a(kd.field_x, "basic", "nextbtn", false);
                      pf.field_b = rl.a(kd.field_x, "basic", "lobby_icon", false);
                      vc.field_e = cf.a("statbars", "basic", (byte) -13, kd.field_x);
                      pd.field_Z = cf.a("tags", "basic", (byte) -50, kd.field_x);
                      uh.field_k = rl.a(kd.field_x, "basic", "tagborder", false);
                      qg.field_f = cf.a("movekeys", "basic", (byte) -38, kd.field_x);
                      bc.field_wb = rl.a(kd.field_x, "basic", "shiftkey", false);
                      da.field_e = cf.a("config_tabs", "basic", (byte) -33, kd.field_x);
                      aj.field_r[0] = rl.a(kd.field_x, "basic", "research_ring", false);
                      b.field_q[0] = rl.a(kd.field_x, "basic", "research_icon", false);
                      bl.field_p = cj.a(param0 + -75, "basic", kd.field_x, "powerups");
                      gf.field_c = cf.a("headings_bar", "basic", (byte) -26, kd.field_x);
                      wk discarded$14 = rl.a(kd.field_x, "basic", "solarite", false);
                      vk.field_q = rl.a(kd.field_x, "basic", "mansize", false);
                      gj.field_a = rl.a(kd.field_x, "basic", "stripeybar", false);
                      vk.field_r = rl.a(kd.field_x, "basic", "hackbit", false);
                      wc.field_d = cf.a("pretty_button_lit", "basic", (byte) -111, kd.field_x);
                      hk.field_Tb = cf.a("pretty_button_unlit", "basic", (byte) -50, kd.field_x);
                      eb.field_p = cf.a("menu_border", "basic", (byte) -31, kd.field_x);
                      lj.field_e = cf.a("bin_icon", "basic", (byte) -14, kd.field_x);
                      pd.field_Q = cf.a("faces_idle", "basic", (byte) -87, kd.field_x);
                      bg.field_C = cf.a("faces_talk", "basic", (byte) -97, kd.field_x);
                      am.field_f = cf.a("tutor_buttons", "basic", (byte) -125, kd.field_x);
                      b.field_n = cf.a("shields", "basic", (byte) -58, kd.field_x);
                      vi.field_gb = cf.a("explosion", "basic", (byte) -34, kd.field_x);
                      var3_array = ec.a((byte) -115, "smoke", kd.field_x, "basic");
                      cc.field_pc = new ek[var3_array.length];
                      var4_int = 0;
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (var4_int >= var3_array.length) {
                              break L14;
                            } else {
                              cc.field_pc[var4_int] = (ek) (Object) var3_array[var4_int];
                              var4_int++;
                              if (var6 != 0) {
                                break L13;
                              } else {
                                if (var6 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          bm.field_S = cf.a("plasma", "basic", (byte) -98, kd.field_x);
                          wk[] discarded$15 = cf.a("dust", "basic", (byte) -81, kd.field_x);
                          bf.field_Cb = cj.a(-120, "basic", kd.field_x, "crowns");
                          bc.field_sb = new wk(32, 32);
                          bc.field_sb.d();
                          d.field_G.b(0, 0, 32, 32);
                          sb.field_bb.b((byte) 125);
                          d.field_G = null;
                          break L13;
                        }
                        var3_array2 = new wk[nc.field_m.length][];
                        var4 = new wk[nc.field_m.length][];
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            L17: {
                              if (nc.field_m.length <= var5) {
                                break L17;
                              } else {
                                var3_array2[var5] = cf.a(nc.field_m[var5], "basic", (byte) -63, kd.field_x);
                                var4[var5] = null;
                                var5++;
                                if (var6 != 0) {
                                  break L16;
                                } else {
                                  if (var6 == 0) {
                                    continue L15;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            cm.a(te.field_c, (byte) 74, tm.field_d, (int[]) null, rj.field_k, var4, true, 4, 3, bb.field_R, var2, v.field_b, var3_array2, ej.field_t, kc.field_w, qb.field_y, ti.field_u);
                            pa.a(tm.field_d, 111, ej.field_t);
                            un.a(200, 126);
                            oh.field_a = null;
                            cc.j(param0 ^ -52);
                            break L16;
                          }
                          return false;
                        }
                      }
                    }
                  }
                }
              } else {
                if (null == ie.field_k) {
                  hd.a(false);
                  gf.a(0);
                  var2_int = 0;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (23 <= var2_int) {
                          break L20;
                        } else {
                          i.field_e[var2_int] = new ji(var2_int);
                          var2_int++;
                          if (var6 != 0) {
                            break L19;
                          } else {
                            if (var6 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      pm.field_T = 0;
                      vb.field_g = 0;
                      vg.a(50, (byte) -127);
                      jn.a(true, (byte) 92, 200, me.field_f);
                      break L19;
                    }
                    L21: {
                      if (ni.b(118)) {
                        break L21;
                      } else {
                        al.field_i = fg.a(4, param0 + 20051);
                        break L21;
                      }
                    }
                    L22: {
                      cc.j(0);
                      if (param0 == -52) {
                        break L22;
                      } else {
                        this.b(-1, true);
                        break L22;
                      }
                    }
                    return true;
                  }
                } else {
                  hj.a((byte) 106, new m(ie.field_k.a("huffman", -742, "")));
                  ie.field_k = null;
                  cc.j(0);
                  return false;
                }
              }
            } else {
              mc.a(ba.field_a, 88.0f, -21801);
              ((SteelSentinels) this).a((byte) 104);
              me.field_f = tg.a(g.field_i, "", "md_title_music");
              l.field_i = tg.a(g.field_i, "", "war_zone");
              gb.field_e = tg.a(g.field_i, "", "lost_world");
              kj.field_z = tg.a(g.field_i, "", "cityscape");
              ue.field_e = tg.a(g.field_i, "", "thats_no_moon");
              db.field_a = tg.a(g.field_i, "", "star_fleet");
              boolean discarded$16 = q.field_f.a(0, me.field_f, 21687, he.field_e, rc.field_i);
              boolean discarded$17 = q.field_f.a(0, l.field_i, 21687, he.field_e, rc.field_i);
              boolean discarded$18 = q.field_f.a(0, gb.field_e, 21687, he.field_e, rc.field_i);
              boolean discarded$19 = q.field_f.a(0, kj.field_z, 21687, he.field_e, rc.field_i);
              boolean discarded$20 = q.field_f.a(0, ue.field_e, param0 + 21739, he.field_e, rc.field_i);
              boolean discarded$21 = q.field_f.a(0, db.field_a, 21687, he.field_e, rc.field_i);
              q.field_f.a((byte) 25);
              g.field_i = null;
              rc.field_i = null;
              cc.j(0);
              return false;
            }
          } else {
            mc.a(cm.field_n, 85.0f, -21801);
            ((SteelSentinels) this).a((byte) -116);
            qj.field_q[71] = uk.a(ti.field_t, "default", "deploying_in").a();
            qj.field_q[72] = uk.a(ti.field_t, "default", "five").a();
            qj.field_q[73] = uk.a(ti.field_t, "default", "four").a();
            qj.field_q[74] = uk.a(ti.field_t, "default", "three").a();
            qj.field_q[75] = uk.a(ti.field_t, "default", "two").a();
            qj.field_q[76] = uk.a(ti.field_t, "default", "one").a();
            qj.field_q[77] = uk.a(ti.field_t, "default", "chassis_upgrade_available").a();
            qj.field_q[78] = uk.a(ti.field_t, "default", "armour_level_critical").a();
            qj.field_q[79] = uk.a(ti.field_t, "default", "target_acquired").a();
            qj.field_q[80] = uk.a(ti.field_t, "default", "target_lock_failed").a();
            qj.field_q[81] = uk.a(ti.field_t, "default", "warning").a();
            qj.field_q[82] = uk.a(ti.field_t, "default", "energy_low").a();
            qj.field_q[83] = uk.a(ti.field_t, "default", "shield_depleted").a();
            ti.field_t = null;
            cc.j(0);
            return false;
          }
        } else {
          L23: {
            if (!tm.field_d.a(true)) {
              break L23;
            } else {
              if (!tm.field_d.a("basic", (byte) 90)) {
                break L23;
              } else {
                L24: {
                  if (!tm.field_d.a(true)) {
                    break L24;
                  } else {
                    if (tm.field_d.a("roman20", (byte) 90)) {
                      L25: {
                        if (!ej.field_t.a(true)) {
                          break L25;
                        } else {
                          if (!ej.field_t.a("roman20", (byte) 90)) {
                            break L25;
                          } else {
                            L26: {
                              if (!tm.field_d.a(true)) {
                                break L26;
                              } else {
                                if (tm.field_d.a("lobby", (byte) 90)) {
                                  L27: {
                                    if (!tm.field_d.a(true)) {
                                      break L27;
                                    } else {
                                      if (!tm.field_d.a("basicfont12", (byte) 90)) {
                                        break L27;
                                      } else {
                                        L28: {
                                          if (!ej.field_t.a(true)) {
                                            break L28;
                                          } else {
                                            if (ej.field_t.a("basicfont12", (byte) 90)) {
                                              L29: {
                                                if (!ej.field_t.a(true)) {
                                                  break L29;
                                                } else {
                                                  if (ej.field_t.a("lobby", (byte) 90)) {
                                                    L30: {
                                                      if (!aj.field_x.a(true)) {
                                                        break L30;
                                                      } else {
                                                        if (aj.field_x.a(param0 ^ -43)) {
                                                          L31: {
                                                            if (!dh.field_z.a(true)) {
                                                              break L31;
                                                            } else {
                                                              if (dh.field_z.a(param0 ^ -43)) {
                                                                L32: {
                                                                  qi.field_l = false;
                                                                  if (!ti.field_t.a(true)) {
                                                                    break L32;
                                                                  } else {
                                                                    if (ti.field_t.a(25)) {
                                                                      L33: {
                                                                        if (!rc.field_i.a(true)) {
                                                                          break L33;
                                                                        } else {
                                                                          if (!rc.field_i.a(param0 + 77)) {
                                                                            break L33;
                                                                          } else {
                                                                            L34: {
                                                                              if (!g.field_i.a(true)) {
                                                                                break L34;
                                                                              } else {
                                                                                if (g.field_i.a(25)) {
                                                                                  L35: {
                                                                                    if (!kd.field_x.a(true)) {
                                                                                      break L35;
                                                                                    } else {
                                                                                      if (!kd.field_x.a("basic", (byte) 90)) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        L36: {
                                                                                          if (!im.field_h.a(true)) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            if (im.field_h.a(25)) {
                                                                                              L37: {
                                                                                                if (!oh.field_a.a(true)) {
                                                                                                  break L37;
                                                                                                } else {
                                                                                                  if (oh.field_a.a("basic", (byte) 90)) {
                                                                                                    L38: {
                                                                                                      if (!ie.field_k.a(true)) {
                                                                                                        break L38;
                                                                                                      } else {
                                                                                                        if (ie.field_k.a(25)) {
                                                                                                          L39: {
                                                                                                            if (!rj.field_k.a(true)) {
                                                                                                              break L39;
                                                                                                            } else {
                                                                                                              if (rj.field_k.a(param0 + 77)) {
                                                                                                                en.a(-59);
                                                                                                                mc.a(cm.field_n, 82.0f, param0 ^ 21787);
                                                                                                                ((SteelSentinels) this).a((byte) 111);
                                                                                                                he.field_e = new ub(aj.field_x, dh.field_z);
                                                                                                                aj.field_x = null;
                                                                                                                cc.j(0);
                                                                                                                return false;
                                                                                                              } else {
                                                                                                                break L39;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          mc.a(ka.a((byte) -128, qj.field_i, sl.field_l, rj.field_k), 90.0f, -21801);
                                                                                                          return false;
                                                                                                        } else {
                                                                                                          break L38;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    mc.a(ci.a(ie.field_k, (byte) 94, "", qj.field_i, sl.field_l), 85.0f, -21801);
                                                                                                    return false;
                                                                                                  } else {
                                                                                                    break L37;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              mc.a(ci.a(oh.field_a, (byte) 108, "basic", kb.field_c, og.field_c), 80.0f, -21801);
                                                                                              return false;
                                                                                            } else {
                                                                                              break L36;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        mc.a(ka.a((byte) -78, en.field_f, ai.field_t, im.field_h), 75.0f, -21801);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  mc.a(ci.a(kd.field_x, (byte) 94, "basic", en.field_f, ai.field_t), 70.0f, -21801);
                                                                                  return false;
                                                                                } else {
                                                                                  break L34;
                                                                                }
                                                                              }
                                                                            }
                                                                            mc.a(ci.a(g.field_i, (byte) 101, "", tf.field_f, nj.field_P), 60.0f, -21801);
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      mc.a(ka.a((byte) -103, tf.field_f, nj.field_P, rc.field_i), 45.0f, -21801);
                                                                      return false;
                                                                    } else {
                                                                      break L32;
                                                                    }
                                                                  }
                                                                }
                                                                mc.a(ci.a(ti.field_t, (byte) 99, "", rn.field_t, ue.field_a), 42.0f, -21801);
                                                                return false;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                          mc.a(ci.a(dh.field_z, (byte) 127, "", rn.field_t, ue.field_a), 40.0f, -21801);
                                                          return false;
                                                        } else {
                                                          break L30;
                                                        }
                                                      }
                                                    }
                                                    mc.a(ci.a(aj.field_x, (byte) 122, "", rn.field_t, ue.field_a), 20.0f, param0 + -21749);
                                                    return false;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                              mc.a(ci.a(ej.field_t, (byte) 116, "lobby", kb.field_c, og.field_c), 17.0f, param0 + -21749);
                                              return false;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                        mc.a(ci.a(ej.field_t, (byte) 97, "basicfont12", kb.field_c, og.field_c), 15.0f, param0 + -21749);
                                        return false;
                                      }
                                    }
                                  }
                                  mc.a(ci.a(tm.field_d, (byte) 120, "basicfont12", en.field_f, ai.field_t), 14.0f, -21801);
                                  return false;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            mc.a(ci.a(tm.field_d, (byte) 104, "lobby", en.field_f, ai.field_t), 13.0f, param0 + -21749);
                            return false;
                          }
                        }
                      }
                      mc.a(ci.a(ej.field_t, (byte) 111, "roman20", kb.field_c, og.field_c), 12.0f, -21801);
                      return false;
                    } else {
                      break L24;
                    }
                  }
                }
                mc.a(ci.a(tm.field_d, (byte) 116, "roman20", en.field_f, ai.field_t), 11.0f, param0 ^ 21787);
                return false;
              }
            }
          }
          mc.a(ci.a(tm.field_d, (byte) 116, "basic", en.field_f, ai.field_t), 10.0f, -21801);
          return false;
        }
    }

    final static wk[] a(int param0, int param1, byte param2, int param3, int param4) {
        wk[] var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var5 = new wk[9];
            if (param2 == -62) {
              L1: {
                wk dupTemp$4 = bd.a(param1, param3, 248);
                var5[6] = dupTemp$4;
                var5[3] = dupTemp$4;
                var5[2] = dupTemp$4;
                var5[1] = dupTemp$4;
                var5[0] = dupTemp$4;
                wk dupTemp$5 = bd.a(param4, param3, 248);
                var5[8] = dupTemp$5;
                var5[7] = dupTemp$5;
                var5[5] = dupTemp$5;
                if (param0 != 0) {
                  var5[4] = bd.a(param0, 64, 248);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_7_0 = (wk[]) var5;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wk[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5_ref, "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_8_0;
    }

    private final void n(int param0) {
        int var3 = 0;
        var3 = field_G;
        ej.field_v = 3;
        if (param0 == 53) {
          if (kd.field_x == null) {
            L0: {
              if (cb.field_l != 1) {
                break L0;
              } else {
                if (im.field_h != null) {
                  ua.field_r = 23;
                  cb.field_l = 1;
                  if (im.field_h.a(true)) {
                    L1: {
                      if (al.field_g != 0) {
                        break L1;
                      } else {
                        if (!im.field_h.a((byte) -91, "wz_background.jpg", "warzone/")) {
                          break L1;
                        } else {
                          al.field_g = al.field_g + 1;
                          return;
                        }
                      }
                    }
                    L2: {
                      if (al.field_g != 1) {
                        break L2;
                      } else {
                        if (im.field_h.a((byte) -40, "lw_background.jpg", "lostworld/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      if (al.field_g != 2) {
                        break L3;
                      } else {
                        if (im.field_h.a((byte) 126, "ct_background.jpg", "city/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (3 != al.field_g) {
                        break L4;
                      } else {
                        if (im.field_h.a((byte) -48, "mn_background.jpg", "moon/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (al.field_g != 4) {
                        break L5;
                      } else {
                        if (im.field_h.a((byte) 94, "wz_midground_01.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0] = new wk[4];
                          ig.field_o[0][0] = (wk) (Object) new ek(im.field_h.a("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (al.field_g != 5) {
                        break L6;
                      } else {
                        if (im.field_h.a((byte) 109, "wz_midground_02.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][1] = (wk) (Object) new ek(im.field_h.a("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (al.field_g != 6) {
                        break L7;
                      } else {
                        if (im.field_h.a((byte) 83, "wz_midground_03.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][2] = (wk) (Object) new ek(im.field_h.a("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (7 != al.field_g) {
                        break L8;
                      } else {
                        if (im.field_h.a((byte) 118, "wz_midground_04.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          ig.field_o[0][3] = (wk) (Object) new ek(im.field_h.a("wz_midground_04.png", bi.a(param0, -721), "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (al.field_g != 8) {
                        break L9;
                      } else {
                        if (!im.field_h.a((byte) 88, "wz_foreground_01.png", "warzone/")) {
                          break L9;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0] = new wk[7];
                          kc.field_x[0][0] = (wk) (Object) new ek(im.field_h.a("wz_foreground_01.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L10: {
                      if (9 != al.field_g) {
                        break L10;
                      } else {
                        if (!im.field_h.a((byte) 122, "wz_foreground_02.png", "warzone/")) {
                          break L10;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][1] = (wk) (Object) new ek(im.field_h.a("wz_foreground_02.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L11: {
                      if (al.field_g != 10) {
                        break L11;
                      } else {
                        if (im.field_h.a((byte) 84, "wz_foreground_03.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][2] = (wk) (Object) new ek(im.field_h.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (al.field_g != 11) {
                        break L12;
                      } else {
                        if (!im.field_h.a((byte) 122, "wz_foreground_04.png", "warzone/")) {
                          break L12;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][3] = (wk) (Object) new ek(im.field_h.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L13: {
                      if (al.field_g != 12) {
                        break L13;
                      } else {
                        if (!im.field_h.a((byte) -76, "wz_foreground_05.png", "warzone/")) {
                          break L13;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][4] = (wk) (Object) new ek(im.field_h.a("wz_foreground_05.png", param0 + -795, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L14: {
                      if (al.field_g != 13) {
                        break L14;
                      } else {
                        if (im.field_h.a((byte) 102, "wz_foreground_06.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][5] = (wk) (Object) new ek(im.field_h.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (al.field_g != 14) {
                        break L15;
                      } else {
                        if (im.field_h.a((byte) 93, "wz_foreground_07.png", "warzone/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[0][6] = (wk) (Object) new ek(im.field_h.a("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (al.field_g != 15) {
                        break L16;
                      } else {
                        if (im.field_h.a((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
                          kc.field_x[1] = new wk[6];
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][0] = (wk) (Object) new ek(im.field_h.a("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (16 != al.field_g) {
                        break L17;
                      } else {
                        if (!im.field_h.a((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
                          break L17;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][1] = (wk) (Object) new ek(im.field_h.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L18: {
                      if (17 != al.field_g) {
                        break L18;
                      } else {
                        if (!im.field_h.a((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
                          break L18;
                        } else {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][2] = (wk) (Object) new ek(im.field_h.a("sb_foreground_03.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        }
                      }
                    }
                    L19: {
                      if (18 != al.field_g) {
                        break L19;
                      } else {
                        if (im.field_h.a((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][3] = (wk) (Object) new ek(im.field_h.a("sb_foreground_04.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (al.field_g != 19) {
                        break L20;
                      } else {
                        if (im.field_h.a((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][4] = (wk) (Object) new ek(im.field_h.a("sb_foreground_05.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (20 != al.field_g) {
                        break L21;
                      } else {
                        if (im.field_h.a((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          kc.field_x[1][5] = (wk) (Object) new ek(im.field_h.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                          return;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if (al.field_g != 21) {
                        break L22;
                      } else {
                        if (im.field_h.a((byte) -87, "planet.jpg", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (al.field_g != 22) {
                        break L23;
                      } else {
                        if (im.field_h.a((byte) 123, "moon.jpg", "fleetbattle/")) {
                          al.field_g = al.field_g + 1;
                          return;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (al.field_g == 23) {
                        al.field_g = 0;
                        cb.field_l = cb.field_l + 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            L25: {
              if (cb.field_l != 2) {
                break L25;
              } else {
                if (he.field_e == null) {
                  break L25;
                } else {
                  L26: {
                    L27: {
                      ua.field_r = 90;
                      if (al.field_g != 0) {
                        break L27;
                      } else {
                        qj.field_q[0] = he.field_e.a("menu_select", "", -123);
                        al.field_g = al.field_g + 1;
                        if (var3 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L28: {
                      if (al.field_g != 1) {
                        break L28;
                      } else {
                        qj.field_q[1] = he.field_e.a("jumping", "", bi.a(param0, 90));
                        al.field_g = al.field_g + 1;
                        if (var3 == 0) {
                          break L26;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      if (al.field_g == 2) {
                        break L29;
                      } else {
                        L30: {
                          if (3 == al.field_g) {
                            break L30;
                          } else {
                            L31: {
                              if (al.field_g != 4) {
                                break L31;
                              } else {
                                qj.field_q[4] = he.field_e.a("drop_pod", "", -121);
                                al.field_g = al.field_g + 1;
                                if (var3 == 0) {
                                  break L26;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            L32: {
                              if (al.field_g == 5) {
                                break L32;
                              } else {
                                L33: {
                                  if (al.field_g != 6) {
                                    break L33;
                                  } else {
                                    qj.field_q[6] = he.field_e.a("footstep_5", "", 100);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break L26;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L34: {
                                  if (al.field_g == 7) {
                                    break L34;
                                  } else {
                                    L35: {
                                      if (8 != al.field_g) {
                                        break L35;
                                      } else {
                                        qj.field_q[8] = he.field_e.a("respawn", "", -28);
                                        al.field_g = al.field_g + 1;
                                        if (var3 == 0) {
                                          break L26;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    L36: {
                                      if (al.field_g == 9) {
                                        break L36;
                                      } else {
                                        L37: {
                                          if (10 == al.field_g) {
                                            break L37;
                                          } else {
                                            L38: {
                                              if (11 == al.field_g) {
                                                break L38;
                                              } else {
                                                L39: {
                                                  if (12 != al.field_g) {
                                                    break L39;
                                                  } else {
                                                    qj.field_q[12] = he.field_e.a("proxy_grenade_launcher", "", 105);
                                                    al.field_g = al.field_g + 1;
                                                    if (var3 == 0) {
                                                      break L26;
                                                    } else {
                                                      break L39;
                                                    }
                                                  }
                                                }
                                                L40: {
                                                  if (al.field_g == 13) {
                                                    break L40;
                                                  } else {
                                                    L41: {
                                                      if (al.field_g == 14) {
                                                        break L41;
                                                      } else {
                                                        L42: {
                                                          if (15 != al.field_g) {
                                                            break L42;
                                                          } else {
                                                            qj.field_q[15] = he.field_e.a("pulse_laser", "", -118);
                                                            al.field_g = al.field_g + 1;
                                                            if (var3 == 0) {
                                                              break L26;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                        }
                                                        L43: {
                                                          if (al.field_g == 16) {
                                                            break L43;
                                                          } else {
                                                            L44: {
                                                              if (al.field_g != 17) {
                                                                break L44;
                                                              } else {
                                                                qj.field_q[17] = he.field_e.a("emp_rocket_impact", "", 112);
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break L26;
                                                                } else {
                                                                  break L44;
                                                                }
                                                              }
                                                            }
                                                            L45: {
                                                              if (al.field_g != 18) {
                                                                break L45;
                                                              } else {
                                                                qj.field_q[18] = he.field_e.a("flak_repeater", "", 124);
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break L26;
                                                                } else {
                                                                  break L45;
                                                                }
                                                              }
                                                            }
                                                            L46: {
                                                              if (19 != al.field_g) {
                                                                break L46;
                                                              } else {
                                                                qj.field_q[19] = he.field_e.a("plasma_spray", "", -50);
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break L26;
                                                                } else {
                                                                  break L46;
                                                                }
                                                              }
                                                            }
                                                            L47: {
                                                              if (al.field_g == 20) {
                                                                break L47;
                                                              } else {
                                                                L48: {
                                                                  if (al.field_g != 21) {
                                                                    break L48;
                                                                  } else {
                                                                    qj.field_q[21] = he.field_e.a("electron_cannon", "", param0 + -135);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break L26;
                                                                    } else {
                                                                      break L48;
                                                                    }
                                                                  }
                                                                }
                                                                L49: {
                                                                  if (al.field_g != 22) {
                                                                    break L49;
                                                                  } else {
                                                                    qj.field_q[22] = he.field_e.a("sword", "", 113);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break L26;
                                                                    } else {
                                                                      break L49;
                                                                    }
                                                                  }
                                                                }
                                                                L50: {
                                                                  if (al.field_g == 23) {
                                                                    break L50;
                                                                  } else {
                                                                    L51: {
                                                                      if (al.field_g == 24) {
                                                                        break L51;
                                                                      } else {
                                                                        L52: {
                                                                          if (al.field_g == 25) {
                                                                            break L52;
                                                                          } else {
                                                                            L53: {
                                                                              if (al.field_g == 26) {
                                                                                break L53;
                                                                              } else {
                                                                                L54: {
                                                                                  if (27 == al.field_g) {
                                                                                    break L54;
                                                                                  } else {
                                                                                    L55: {
                                                                                      if (al.field_g == 28) {
                                                                                        break L55;
                                                                                      } else {
                                                                                        L56: {
                                                                                          if (29 != al.field_g) {
                                                                                            break L56;
                                                                                          } else {
                                                                                            qj.field_q[29] = he.field_e.a("shield_loop", "", 122);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              break L56;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L57: {
                                                                                          if (30 != al.field_g) {
                                                                                            break L57;
                                                                                          } else {
                                                                                            qj.field_q[30] = he.field_e.a("mine_inactive_hum_2", "", -105);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              break L57;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L58: {
                                                                                          if (al.field_g != 31) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            qj.field_q[31] = he.field_e.a("lightning_cannon", "", 123);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              break L58;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L59: {
                                                                                          if (32 != al.field_g) {
                                                                                            break L59;
                                                                                          } else {
                                                                                            qj.field_q[32] = he.field_e.a("heavy_cannon_3", "", -86);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              break L59;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L60: {
                                                                                          if (al.field_g == 33) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            L61: {
                                                                                              if (al.field_g != 34) {
                                                                                                break L61;
                                                                                              } else {
                                                                                                qj.field_q[34] = he.field_e.a("heavy_cannon_1", "", -109);
                                                                                                al.field_g = al.field_g + 1;
                                                                                                if (var3 == 0) {
                                                                                                  break L26;
                                                                                                } else {
                                                                                                  break L61;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            L62: {
                                                                                              if (al.field_g == 35) {
                                                                                                break L62;
                                                                                              } else {
                                                                                                L63: {
                                                                                                  if (al.field_g != 36) {
                                                                                                    break L63;
                                                                                                  } else {
                                                                                                    qj.field_q[36] = he.field_e.a("heavy_gun_3", "", param0 + -94);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break L26;
                                                                                                    } else {
                                                                                                      break L63;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                L64: {
                                                                                                  if (al.field_g != 37) {
                                                                                                    break L64;
                                                                                                  } else {
                                                                                                    qj.field_q[37] = he.field_e.a("air_mine", "", -78);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break L26;
                                                                                                    } else {
                                                                                                      break L64;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                L65: {
                                                                                                  if (al.field_g != 38) {
                                                                                                    break L65;
                                                                                                  } else {
                                                                                                    qj.field_q[38] = he.field_e.a("heavy_gun_1", "", 126);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break L26;
                                                                                                    } else {
                                                                                                      break L65;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                L66: {
                                                                                                  if (al.field_g == 39) {
                                                                                                    break L66;
                                                                                                  } else {
                                                                                                    L67: {
                                                                                                      if (al.field_g != 40) {
                                                                                                        break L67;
                                                                                                      } else {
                                                                                                        qj.field_q[40] = he.field_e.a("rail_repeater", "", 118);
                                                                                                        al.field_g = al.field_g + 1;
                                                                                                        if (var3 == 0) {
                                                                                                          break L26;
                                                                                                        } else {
                                                                                                          break L67;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    L68: {
                                                                                                      if (41 == al.field_g) {
                                                                                                        break L68;
                                                                                                      } else {
                                                                                                        L69: {
                                                                                                          if (al.field_g != 42) {
                                                                                                            break L69;
                                                                                                          } else {
                                                                                                            qj.field_q[42] = he.field_e.a("plasma_cannon", "", 104);
                                                                                                            al.field_g = al.field_g + 1;
                                                                                                            if (var3 == 0) {
                                                                                                              break L26;
                                                                                                            } else {
                                                                                                              break L69;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        L70: {
                                                                                                          if (43 == al.field_g) {
                                                                                                            break L70;
                                                                                                          } else {
                                                                                                            L71: {
                                                                                                              if (al.field_g == 44) {
                                                                                                                break L71;
                                                                                                              } else {
                                                                                                                L72: {
                                                                                                                  if (al.field_g == 45) {
                                                                                                                    break L72;
                                                                                                                  } else {
                                                                                                                    L73: {
                                                                                                                      if (al.field_g != 46) {
                                                                                                                        break L73;
                                                                                                                      } else {
                                                                                                                        qj.field_q[67] = he.field_e.a("laser_beam", "", 110);
                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                        if (var3 == 0) {
                                                                                                                          break L26;
                                                                                                                        } else {
                                                                                                                          break L73;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    L74: {
                                                                                                                      if (al.field_g == 47) {
                                                                                                                        break L74;
                                                                                                                      } else {
                                                                                                                        L75: {
                                                                                                                          if (al.field_g != 48) {
                                                                                                                            break L75;
                                                                                                                          } else {
                                                                                                                            qj.field_q[46] = he.field_e.a("flak_cannon_3", "", 103);
                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                            if (var3 == 0) {
                                                                                                                              break L26;
                                                                                                                            } else {
                                                                                                                              break L75;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        L76: {
                                                                                                                          if (49 == al.field_g) {
                                                                                                                            break L76;
                                                                                                                          } else {
                                                                                                                            L77: {
                                                                                                                              if (al.field_g != 50) {
                                                                                                                                break L77;
                                                                                                                              } else {
                                                                                                                                qj.field_q[48] = he.field_e.a("explosion_1", "", 110);
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                if (var3 == 0) {
                                                                                                                                  break L26;
                                                                                                                                } else {
                                                                                                                                  break L77;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            L78: {
                                                                                                                              if (al.field_g != 51) {
                                                                                                                                break L78;
                                                                                                                              } else {
                                                                                                                                qj.field_q[49] = he.field_e.a("damage_richochet", "", bi.a(param0, -15));
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                if (var3 == 0) {
                                                                                                                                  break L26;
                                                                                                                                } else {
                                                                                                                                  break L78;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            L79: {
                                                                                                                              if (al.field_g != 52) {
                                                                                                                                break L79;
                                                                                                                              } else {
                                                                                                                                qj.field_q[50] = he.field_e.a("damage_plasma_burn", "", 113);
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                if (var3 == 0) {
                                                                                                                                  break L26;
                                                                                                                                } else {
                                                                                                                                  break L79;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            L80: {
                                                                                                                              if (53 == al.field_g) {
                                                                                                                                break L80;
                                                                                                                              } else {
                                                                                                                                L81: {
                                                                                                                                  if (al.field_g != 54) {
                                                                                                                                    break L81;
                                                                                                                                  } else {
                                                                                                                                    qj.field_q[52] = he.field_e.a("explosion_4", "", 122);
                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                    if (var3 == 0) {
                                                                                                                                      break L26;
                                                                                                                                    } else {
                                                                                                                                      break L81;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                L82: {
                                                                                                                                  if (al.field_g == 55) {
                                                                                                                                    break L82;
                                                                                                                                  } else {
                                                                                                                                    L83: {
                                                                                                                                      if (al.field_g == 56) {
                                                                                                                                        break L83;
                                                                                                                                      } else {
                                                                                                                                        L84: {
                                                                                                                                          if (al.field_g != 57) {
                                                                                                                                            break L84;
                                                                                                                                          } else {
                                                                                                                                            qj.field_q[55] = he.field_e.a("damage_debris_hitting_ground", "", -32);
                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                            if (var3 == 0) {
                                                                                                                                              break L26;
                                                                                                                                            } else {
                                                                                                                                              break L84;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        L85: {
                                                                                                                                          if (al.field_g != 58) {
                                                                                                                                            break L85;
                                                                                                                                          } else {
                                                                                                                                            qj.field_q[56] = he.field_e.a("explosion_3", "", -82);
                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                            if (var3 == 0) {
                                                                                                                                              break L26;
                                                                                                                                            } else {
                                                                                                                                              break L85;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        L86: {
                                                                                                                                          if (al.field_g == 59) {
                                                                                                                                            break L86;
                                                                                                                                          } else {
                                                                                                                                            L87: {
                                                                                                                                              if (60 == al.field_g) {
                                                                                                                                                break L87;
                                                                                                                                              } else {
                                                                                                                                                L88: {
                                                                                                                                                  if (al.field_g != 61) {
                                                                                                                                                    break L88;
                                                                                                                                                  } else {
                                                                                                                                                    qj.field_q[59] = he.field_e.a("rail_cannon", "", 122);
                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                      break L26;
                                                                                                                                                    } else {
                                                                                                                                                      break L88;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                                L89: {
                                                                                                                                                  if (al.field_g == 62) {
                                                                                                                                                    break L89;
                                                                                                                                                  } else {
                                                                                                                                                    L90: {
                                                                                                                                                      if (al.field_g == 63) {
                                                                                                                                                        break L90;
                                                                                                                                                      } else {
                                                                                                                                                        L91: {
                                                                                                                                                          if (64 != al.field_g) {
                                                                                                                                                            break L91;
                                                                                                                                                          } else {
                                                                                                                                                            qj.field_q[62] = he.field_e.a("fusion_cannon", "", -56);
                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                              break L26;
                                                                                                                                                            } else {
                                                                                                                                                              break L91;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        L92: {
                                                                                                                                                          if (al.field_g == 65) {
                                                                                                                                                            break L92;
                                                                                                                                                          } else {
                                                                                                                                                            L93: {
                                                                                                                                                              if (al.field_g == 66) {
                                                                                                                                                                break L93;
                                                                                                                                                              } else {
                                                                                                                                                                L94: {
                                                                                                                                                                  if (al.field_g == 67) {
                                                                                                                                                                    break L94;
                                                                                                                                                                  } else {
                                                                                                                                                                    L95: {
                                                                                                                                                                      if (al.field_g == 68) {
                                                                                                                                                                        break L95;
                                                                                                                                                                      } else {
                                                                                                                                                                        L96: {
                                                                                                                                                                          if (al.field_g != 69) {
                                                                                                                                                                            break L96;
                                                                                                                                                                          } else {
                                                                                                                                                                            qj.field_q[69] = he.field_e.a("Add_order", "", 118);
                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                              break L26;
                                                                                                                                                                            } else {
                                                                                                                                                                              break L96;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        L97: {
                                                                                                                                                                          if (70 == al.field_g) {
                                                                                                                                                                            break L97;
                                                                                                                                                                          } else {
                                                                                                                                                                            L98: {
                                                                                                                                                                              if (al.field_g != 71) {
                                                                                                                                                                                break L98;
                                                                                                                                                                              } else {
                                                                                                                                                                                qj.field_q[85] = he.field_e.a("pause_menu_close", "", -92);
                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                                  break L26;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L98;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            L99: {
                                                                                                                                                                              if (72 != al.field_g) {
                                                                                                                                                                                break L99;
                                                                                                                                                                              } else {
                                                                                                                                                                                qj.field_q[86] = he.field_e.a("explosion_fireball_1", "", 100);
                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                                  break L26;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L99;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            L100: {
                                                                                                                                                                              if (al.field_g == 73) {
                                                                                                                                                                                break L100;
                                                                                                                                                                              } else {
                                                                                                                                                                                L101: {
                                                                                                                                                                                  if (74 == al.field_g) {
                                                                                                                                                                                    break L101;
                                                                                                                                                                                  } else {
                                                                                                                                                                                    L102: {
                                                                                                                                                                                      if (al.field_g == 75) {
                                                                                                                                                                                        break L102;
                                                                                                                                                                                      } else {
                                                                                                                                                                                        L103: {
                                                                                                                                                                                          if (al.field_g != 76) {
                                                                                                                                                                                            break L103;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            qj.field_q[90] = he.field_e.a("steam", "", -108);
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                              break L26;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              break L103;
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                        L104: {
                                                                                                                                                                                          if (al.field_g != 77) {
                                                                                                                                                                                            break L104;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            qj.field_q[91] = he.field_e.a("flak_explosion_500ms", "", 95);
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                              break L26;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              break L104;
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                        L105: {
                                                                                                                                                                                          if (al.field_g == 78) {
                                                                                                                                                                                            break L105;
                                                                                                                                                                                          } else {
                                                                                                                                                                                            L106: {
                                                                                                                                                                                              if (al.field_g == 79) {
                                                                                                                                                                                                break L106;
                                                                                                                                                                                              } else {
                                                                                                                                                                                                L107: {
                                                                                                                                                                                                  if (al.field_g == 80) {
                                                                                                                                                                                                    break L107;
                                                                                                                                                                                                  } else {
                                                                                                                                                                                                    L108: {
                                                                                                                                                                                                      if (al.field_g == 81) {
                                                                                                                                                                                                        break L108;
                                                                                                                                                                                                      } else {
                                                                                                                                                                                                        L109: {
                                                                                                                                                                                                          if (al.field_g == 82) {
                                                                                                                                                                                                            break L109;
                                                                                                                                                                                                          } else {
                                                                                                                                                                                                            L110: {
                                                                                                                                                                                                              if (al.field_g == 83) {
                                                                                                                                                                                                                break L110;
                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                L111: {
                                                                                                                                                                                                                  if (al.field_g != 84) {
                                                                                                                                                                                                                    break L111;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    qj.field_q[98] = he.field_e.a("main_menu_disappear", "", 93);
                                                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                                                                                      break L26;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      break L111;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                L112: {
                                                                                                                                                                                                                  if (al.field_g == 85) {
                                                                                                                                                                                                                    break L112;
                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                    L113: {
                                                                                                                                                                                                                      if (al.field_g == 86) {
                                                                                                                                                                                                                        break L113;
                                                                                                                                                                                                                      } else {
                                                                                                                                                                                                                        L114: {
                                                                                                                                                                                                                          if (al.field_g != 87) {
                                                                                                                                                                                                                            break L114;
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            qj.field_q[102] = he.field_e.a("power_up", "", 102);
                                                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                                                              break L26;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              break L114;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        L115: {
                                                                                                                                                                                                                          if (al.field_g != 88) {
                                                                                                                                                                                                                            break L115;
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            qj.field_q[103] = he.field_e.a("energy_sword_part_1", "", param0 + 47);
                                                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                                                              break L26;
                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                              break L115;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (al.field_g != 89) {
                                                                                                                                                                                                                          break L26;
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                          qj.field_q[104] = he.field_e.a("new_nuke_explosion", "", 100);
                                                                                                                                                                                                                          al.field_g = al.field_g + 1;
                                                                                                                                                                                                                          if (var3 == 0) {
                                                                                                                                                                                                                            break L26;
                                                                                                                                                                                                                          } else {
                                                                                                                                                                                                                            break L113;
                                                                                                                                                                                                                          }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                      }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    qj.field_q[100] = he.field_e.a("Menu_engineering_select_part", "", -28);
                                                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                                                                                      break L26;
                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                      break L112;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                  }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                qj.field_q[99] = he.field_e.a("Menu_engineering_select_chassis", "", -112);
                                                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                                                                  break L26;
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                  break L110;
                                                                                                                                                                                                                }
                                                                                                                                                                                                              }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            qj.field_q[97] = he.field_e.a("Mouseover", "", 120);
                                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                                              break L26;
                                                                                                                                                                                                            } else {
                                                                                                                                                                                                              break L109;
                                                                                                                                                                                                            }
                                                                                                                                                                                                          }
                                                                                                                                                                                                        }
                                                                                                                                                                                                        qj.field_q[96] = he.field_e.a("Main_menu_appear", "", 104);
                                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                                        if (var3 == 0) {
                                                                                                                                                                                                          break L26;
                                                                                                                                                                                                        } else {
                                                                                                                                                                                                          break L108;
                                                                                                                                                                                                        }
                                                                                                                                                                                                      }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    qj.field_q[95] = he.field_e.a("Button_press", "", -49);
                                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                                                                      break L26;
                                                                                                                                                                                                    } else {
                                                                                                                                                                                                      break L107;
                                                                                                                                                                                                    }
                                                                                                                                                                                                  }
                                                                                                                                                                                                }
                                                                                                                                                                                                qj.field_q[94] = he.field_e.a("damage_plasma_burn2", "", -79);
                                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                                                  break L26;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                  break L106;
                                                                                                                                                                                                }
                                                                                                                                                                                              }
                                                                                                                                                                                            }
                                                                                                                                                                                            qj.field_q[93] = he.field_e.a("trackloop", "", bi.a(param0, 68));
                                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                                              break L26;
                                                                                                                                                                                            } else {
                                                                                                                                                                                              break L105;
                                                                                                                                                                                            }
                                                                                                                                                                                          }
                                                                                                                                                                                        }
                                                                                                                                                                                        qj.field_q[92] = he.field_e.a("hoverloop", "", param0 + 59);
                                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                                        if (var3 == 0) {
                                                                                                                                                                                          break L26;
                                                                                                                                                                                        } else {
                                                                                                                                                                                          break L102;
                                                                                                                                                                                        }
                                                                                                                                                                                      }
                                                                                                                                                                                    }
                                                                                                                                                                                    qj.field_q[89] = he.field_e.a("explosion_fireball_4", "", -85);
                                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                                                      break L26;
                                                                                                                                                                                    } else {
                                                                                                                                                                                      break L101;
                                                                                                                                                                                    }
                                                                                                                                                                                  }
                                                                                                                                                                                }
                                                                                                                                                                                qj.field_q[88] = he.field_e.a("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                                  break L26;
                                                                                                                                                                                } else {
                                                                                                                                                                                  break L100;
                                                                                                                                                                                }
                                                                                                                                                                              }
                                                                                                                                                                            }
                                                                                                                                                                            qj.field_q[87] = he.field_e.a("explosion_fireball_2", "", -125);
                                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                                              break L26;
                                                                                                                                                                            } else {
                                                                                                                                                                              break L97;
                                                                                                                                                                            }
                                                                                                                                                                          }
                                                                                                                                                                        }
                                                                                                                                                                        qj.field_q[84] = he.field_e.a("pause_menu_open", "", bi.a(param0, -110));
                                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                                        if (var3 == 0) {
                                                                                                                                                                          break L26;
                                                                                                                                                                        } else {
                                                                                                                                                                          break L95;
                                                                                                                                                                        }
                                                                                                                                                                      }
                                                                                                                                                                    }
                                                                                                                                                                    qj.field_q[66] = he.field_e.a("ultra_gun", "", 123);
                                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                                      break L26;
                                                                                                                                                                    } else {
                                                                                                                                                                      break L94;
                                                                                                                                                                    }
                                                                                                                                                                  }
                                                                                                                                                                }
                                                                                                                                                                qj.field_q[65] = he.field_e.a("doomsday_cannon", "", -83);
                                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                                if (var3 == 0) {
                                                                                                                                                                  break L26;
                                                                                                                                                                } else {
                                                                                                                                                                  break L93;
                                                                                                                                                                }
                                                                                                                                                              }
                                                                                                                                                            }
                                                                                                                                                            qj.field_q[64] = he.field_e.a("solaris_laser", "", -116);
                                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                                            if (var3 == 0) {
                                                                                                                                                              break L26;
                                                                                                                                                            } else {
                                                                                                                                                              break L92;
                                                                                                                                                            }
                                                                                                                                                          }
                                                                                                                                                        }
                                                                                                                                                        qj.field_q[63] = he.field_e.a("EMP_cannon", "", -61);
                                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                                        if (var3 == 0) {
                                                                                                                                                          break L26;
                                                                                                                                                        } else {
                                                                                                                                                          break L90;
                                                                                                                                                        }
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                    qj.field_q[61] = he.field_e.a("air_death_missile", "", bi.a(param0, 85));
                                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                                    if (var3 == 0) {
                                                                                                                                                      break L26;
                                                                                                                                                    } else {
                                                                                                                                                      break L89;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                                qj.field_q[60] = he.field_e.a("class_DEATH_nuke", "", -113);
                                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                                if (var3 == 0) {
                                                                                                                                                  break L26;
                                                                                                                                                } else {
                                                                                                                                                  break L87;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            qj.field_q[58] = he.field_e.a("howitzer", "", -53);
                                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                                            if (var3 == 0) {
                                                                                                                                              break L26;
                                                                                                                                            } else {
                                                                                                                                              break L86;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        qj.field_q[57] = he.field_e.a("destructor_rocket", "", 100);
                                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                                        if (var3 == 0) {
                                                                                                                                          break L26;
                                                                                                                                        } else {
                                                                                                                                          break L83;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    qj.field_q[54] = he.field_e.a("explosion_6", "", 96);
                                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                                    if (var3 == 0) {
                                                                                                                                      break L26;
                                                                                                                                    } else {
                                                                                                                                      break L82;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                qj.field_q[53] = he.field_e.a("explosion_5", "", 117);
                                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                                if (var3 == 0) {
                                                                                                                                  break L26;
                                                                                                                                } else {
                                                                                                                                  break L80;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            qj.field_q[51] = he.field_e.a("damage_scraping_metal", "", -108);
                                                                                                                            al.field_g = al.field_g + 1;
                                                                                                                            if (var3 == 0) {
                                                                                                                              break L26;
                                                                                                                            } else {
                                                                                                                              break L76;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        qj.field_q[47] = he.field_e.a("explosion_2", "", bi.a(param0, -87));
                                                                                                                        al.field_g = al.field_g + 1;
                                                                                                                        if (var3 == 0) {
                                                                                                                          break L26;
                                                                                                                        } else {
                                                                                                                          break L74;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    qj.field_q[68] = he.field_e.a("heavy_gun_2", "", bi.a(param0, -27));
                                                                                                                    al.field_g = al.field_g + 1;
                                                                                                                    if (var3 == 0) {
                                                                                                                      break L26;
                                                                                                                    } else {
                                                                                                                      break L72;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                qj.field_q[45] = he.field_e.a("heavy_cannon_2", "", param0 + 62);
                                                                                                                al.field_g = al.field_g + 1;
                                                                                                                if (var3 == 0) {
                                                                                                                  break L26;
                                                                                                                } else {
                                                                                                                  break L71;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            qj.field_q[44] = he.field_e.a("heavy_rocket_launch", "", param0 + 63);
                                                                                                            al.field_g = al.field_g + 1;
                                                                                                            if (var3 == 0) {
                                                                                                              break L26;
                                                                                                            } else {
                                                                                                              break L70;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        qj.field_q[43] = he.field_e.a("rifled_sniper_cannon", "", 120);
                                                                                                        al.field_g = al.field_g + 1;
                                                                                                        if (var3 == 0) {
                                                                                                          break L26;
                                                                                                        } else {
                                                                                                          break L68;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    qj.field_q[41] = he.field_e.a("mine_proximity_2", "", -72);
                                                                                                    al.field_g = al.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break L26;
                                                                                                    } else {
                                                                                                      break L66;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                qj.field_q[39] = he.field_e.a("flak_cannon_1", "", 95);
                                                                                                al.field_g = al.field_g + 1;
                                                                                                if (var3 == 0) {
                                                                                                  break L26;
                                                                                                } else {
                                                                                                  break L62;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            qj.field_q[35] = he.field_e.a("morter", "", -67);
                                                                                            al.field_g = al.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              break L60;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        qj.field_q[33] = he.field_e.a("flak_cannon_2", "", -103);
                                                                                        al.field_g = al.field_g + 1;
                                                                                        if (var3 == 0) {
                                                                                          break L26;
                                                                                        } else {
                                                                                          break L55;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    qj.field_q[28] = he.field_e.a("EDD_teleport", "", 103);
                                                                                    al.field_g = al.field_g + 1;
                                                                                    if (var3 == 0) {
                                                                                      break L26;
                                                                                    } else {
                                                                                      break L54;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                qj.field_q[27] = he.field_e.a("shield_hit", "", bi.a(param0, -109));
                                                                                al.field_g = al.field_g + 1;
                                                                                if (var3 == 0) {
                                                                                  break L26;
                                                                                } else {
                                                                                  break L53;
                                                                                }
                                                                              }
                                                                            }
                                                                            qj.field_q[26] = he.field_e.a("ballistic_target_tracking_module", "", param0 + -176);
                                                                            al.field_g = al.field_g + 1;
                                                                            if (var3 == 0) {
                                                                              break L26;
                                                                            } else {
                                                                              break L52;
                                                                            }
                                                                          }
                                                                        }
                                                                        qj.field_q[25] = he.field_e.a("attach_component", "", -57);
                                                                        al.field_g = al.field_g + 1;
                                                                        if (var3 == 0) {
                                                                          break L26;
                                                                        } else {
                                                                          break L51;
                                                                        }
                                                                      }
                                                                    }
                                                                    qj.field_q[24] = he.field_e.a("hammer", "", -57);
                                                                    al.field_g = al.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break L26;
                                                                    } else {
                                                                      break L50;
                                                                    }
                                                                  }
                                                                }
                                                                qj.field_q[23] = he.field_e.a("energy_sword_part_2", "", -41);
                                                                al.field_g = al.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break L26;
                                                                } else {
                                                                  break L47;
                                                                }
                                                              }
                                                            }
                                                            qj.field_q[20] = he.field_e.a("light_rocket_launch", "", -56);
                                                            al.field_g = al.field_g + 1;
                                                            if (var3 == 0) {
                                                              break L26;
                                                            } else {
                                                              break L43;
                                                            }
                                                          }
                                                        }
                                                        qj.field_q[16] = he.field_e.a("mini_gun", "", 127);
                                                        al.field_g = al.field_g + 1;
                                                        if (var3 == 0) {
                                                          break L26;
                                                        } else {
                                                          break L41;
                                                        }
                                                      }
                                                    }
                                                    qj.field_q[14] = he.field_e.a("rapier_missle", "", param0 + 68);
                                                    al.field_g = al.field_g + 1;
                                                    if (var3 == 0) {
                                                      break L26;
                                                    } else {
                                                      break L40;
                                                    }
                                                  }
                                                }
                                                qj.field_q[13] = he.field_e.a("gauss_gun", "", -110);
                                                al.field_g = al.field_g + 1;
                                                if (var3 == 0) {
                                                  break L26;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            qj.field_q[11] = he.field_e.a("landing", "", 121);
                                            al.field_g = al.field_g + 1;
                                            if (var3 == 0) {
                                              break L26;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        qj.field_q[10] = he.field_e.a("footstep_3", "", param0 + 64);
                                        al.field_g = al.field_g + 1;
                                        if (var3 == 0) {
                                          break L26;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    qj.field_q[9] = he.field_e.a("death", "", param0 + -141);
                                    al.field_g = al.field_g + 1;
                                    if (var3 == 0) {
                                      break L26;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                qj.field_q[7] = he.field_e.a("footstep_2", "", 111);
                                al.field_g = al.field_g + 1;
                                if (var3 == 0) {
                                  break L26;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            qj.field_q[5] = he.field_e.a("footstep_4", "", 125);
                            al.field_g = al.field_g + 1;
                            if (var3 == 0) {
                              break L26;
                            } else {
                              break L30;
                            }
                          }
                        }
                        qj.field_q[3] = he.field_e.a("footstep_1", "", bi.a(param0, 75));
                        al.field_g = al.field_g + 1;
                        if (var3 == 0) {
                          break L26;
                        } else {
                          break L29;
                        }
                      }
                    }
                    qj.field_q[2] = he.field_e.a("thrusting", "", bi.a(param0, 92));
                    al.field_g = al.field_g + 1;
                    break L26;
                  }
                  L116: {
                    if (al.field_g != 90) {
                      break L116;
                    } else {
                      al.field_g = 0;
                      cb.field_l = cb.field_l + 1;
                      he.field_e = null;
                      break L116;
                    }
                  }
                  return;
                }
              }
            }
            return;
          } else {
            ua.field_r = 13;
            cb.field_l = 0;
            if (kd.field_x.a(true)) {
              L117: {
                L118: {
                  if (al.field_g != 0) {
                    break L118;
                  } else {
                    if (!kd.field_x.a((byte) -38, "lw_midground_01", "basic")) {
                      break L118;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1] = new wk[4];
                      ig.field_o[1][0] = rl.a(kd.field_x, "basic", "lw_midground_01", false);
                      if (var3 == 0) {
                        break L117;
                      } else {
                        break L118;
                      }
                    }
                  }
                }
                L119: {
                  if (1 != al.field_g) {
                    break L119;
                  } else {
                    if (!kd.field_x.a((byte) 113, "lw_midground_02", "basic")) {
                      break L119;
                    } else {
                      al.field_g = al.field_g + 1;
                      ig.field_o[1][1] = rl.a(kd.field_x, "basic", "lw_midground_02", false);
                      if (var3 == 0) {
                        break L117;
                      } else {
                        break L119;
                      }
                    }
                  }
                }
                L120: {
                  L121: {
                    if (2 != al.field_g) {
                      break L121;
                    } else {
                      if (kd.field_x.a((byte) -78, "lw_midground_03", "basic")) {
                        break L120;
                      } else {
                        break L121;
                      }
                    }
                  }
                  L122: {
                    if (al.field_g != 3) {
                      break L122;
                    } else {
                      if (!kd.field_x.a((byte) 101, "lw_midground_04", "basic")) {
                        break L122;
                      } else {
                        al.field_g = al.field_g + 1;
                        ig.field_o[1][3] = rl.a(kd.field_x, "basic", "lw_midground_04", false);
                        if (var3 == 0) {
                          break L117;
                        } else {
                          break L122;
                        }
                      }
                    }
                  }
                  L123: {
                    L124: {
                      if (al.field_g != 4) {
                        break L124;
                      } else {
                        if (kd.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                          break L123;
                        } else {
                          break L124;
                        }
                      }
                    }
                    L125: {
                      L126: {
                        if (al.field_g != 5) {
                          break L126;
                        } else {
                          if (kd.field_x.a((byte) 102, "ct_midground_02", "basic")) {
                            break L125;
                          } else {
                            break L126;
                          }
                        }
                      }
                      L127: {
                        L128: {
                          if (al.field_g != 6) {
                            break L128;
                          } else {
                            if (kd.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                              break L127;
                            } else {
                              break L128;
                            }
                          }
                        }
                        L129: {
                          if (7 != al.field_g) {
                            break L129;
                          } else {
                            if (!kd.field_x.a((byte) -57, "ct_midground_04", "basic")) {
                              break L129;
                            } else {
                              al.field_g = al.field_g + 1;
                              ig.field_o[2][3] = rl.a(kd.field_x, "basic", "ct_midground_04", false);
                              if (var3 == 0) {
                                break L117;
                              } else {
                                break L129;
                              }
                            }
                          }
                        }
                        L130: {
                          if (al.field_g != 8) {
                            break L130;
                          } else {
                            if (!kd.field_x.a((byte) 107, "testsurface", "basic")) {
                              break L130;
                            } else {
                              al.field_g = al.field_g + 1;
                              vi.field_R = rl.a(kd.field_x, "basic", "testsurface", false);
                              if (var3 == 0) {
                                break L117;
                              } else {
                                break L130;
                              }
                            }
                          }
                        }
                        L131: {
                          L132: {
                            if (al.field_g != 9) {
                              break L132;
                            } else {
                              if (kd.field_x.a((byte) -63, "wz_texture", "basic")) {
                                break L131;
                              } else {
                                break L132;
                              }
                            }
                          }
                          L133: {
                            if (al.field_g != 10) {
                              break L133;
                            } else {
                              if (!kd.field_x.a((byte) -81, "lw_texture", "basic")) {
                                break L133;
                              } else {
                                al.field_g = al.field_g + 1;
                                bc.field_rb[1] = rl.a(kd.field_x, "basic", "lw_texture", false);
                                if (var3 == 0) {
                                  break L117;
                                } else {
                                  break L133;
                                }
                              }
                            }
                          }
                          L134: {
                            if (11 != al.field_g) {
                              break L134;
                            } else {
                              if (!kd.field_x.a((byte) -113, "ct_texture", "basic")) {
                                break L134;
                              } else {
                                al.field_g = al.field_g + 1;
                                bc.field_rb[2] = rl.a(kd.field_x, "basic", "ct_texture", false);
                                if (var3 == 0) {
                                  break L117;
                                } else {
                                  break L134;
                                }
                              }
                            }
                          }
                          if (al.field_g != 12) {
                            break L117;
                          } else {
                            if (!kd.field_x.a((byte) 127, "mn_texture", "basic")) {
                              break L117;
                            } else {
                              al.field_g = al.field_g + 1;
                              bc.field_rb[3] = rl.a(kd.field_x, "basic", "mn_texture", false);
                              if (var3 == 0) {
                                break L117;
                              } else {
                                break L131;
                              }
                            }
                          }
                        }
                        al.field_g = al.field_g + 1;
                        bc.field_rb = new wk[5];
                        bc.field_rb[0] = rl.a(kd.field_x, "basic", "wz_texture", false);
                        bc.field_rb[4] = bc.field_rb[0];
                        if (var3 == 0) {
                          break L117;
                        } else {
                          break L127;
                        }
                      }
                      al.field_g = al.field_g + 1;
                      ig.field_o[2][2] = rl.a(kd.field_x, "basic", "ct_midground_03", false);
                      if (var3 == 0) {
                        break L117;
                      } else {
                        break L125;
                      }
                    }
                    al.field_g = al.field_g + 1;
                    ig.field_o[2][1] = rl.a(kd.field_x, "basic", "ct_midground_02", false);
                    if (var3 == 0) {
                      break L117;
                    } else {
                      break L123;
                    }
                  }
                  al.field_g = al.field_g + 1;
                  ig.field_o[2] = new wk[4];
                  ig.field_o[2][0] = rl.a(kd.field_x, "basic", "ct_midground_01", false);
                  if (var3 == 0) {
                    break L117;
                  } else {
                    break L120;
                  }
                }
                al.field_g = al.field_g + 1;
                ig.field_o[1][2] = rl.a(kd.field_x, "basic", "lw_midground_03", false);
                break L117;
              }
              L135: {
                if (13 == al.field_g) {
                  kd.field_x = null;
                  cb.field_l = cb.field_l + 1;
                  al.field_g = 0;
                  break L135;
                } else {
                  break L135;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void j(byte param0) {
        field_H = null;
        field_J = null;
        if (param0 != -10) {
            return;
        }
        try {
            field_I = null;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.TA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pl.field_S == null) {
                break L1;
              } else {
                rc.a(0, pl.field_S);
                pl.field_S = null;
                cc.j(0);
                break L1;
              }
            }
            ie.field_k = dh.a(-124, 3);
            kd.field_x = dh.a(60, 5);
            oh.field_a = dh.a(-90, 6);
            aj.field_x = dh.a(55, 7);
            dh.field_z = dh.a(120, 8);
            var2_int = -77 % ((47 - param0) / 35);
            rc.field_i = dh.a(-92, 9);
            g.field_i = dh.a(-106, 10);
            rj.field_k = dh.a(104, 11);
            ti.field_t = dh.a(125, 12);
            im.field_h = dh.a(70, 13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ti.d(7094);
              if (null != wb.field_c) {
                ub.c(0);
                break L1;
              } else {
                break L1;
              }
            }
            var2_int = 21 % ((param0 - 34) / 48);
            ao.h(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            ((SteelSentinels) this).a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "SteelSentinels.init()");
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int[][] var5 = null;
        int var5_int = 0;
        mb var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean stackIn_170_0 = false;
        boolean stackIn_179_0 = false;
        nb stackIn_249_0 = null;
        nb stackIn_249_1 = null;
        int stackIn_249_2 = 0;
        int stackIn_249_3 = 0;
        int stackIn_249_4 = 0;
        String[] stackIn_249_5 = null;
        int stackIn_249_6 = 0;
        int stackIn_249_7 = 0;
        int[][] stackIn_249_8 = null;
        nb stackIn_251_0 = null;
        nb stackIn_251_1 = null;
        int stackIn_251_2 = 0;
        int stackIn_251_3 = 0;
        int stackIn_251_4 = 0;
        String[] stackIn_251_5 = null;
        int stackIn_251_6 = 0;
        int stackIn_251_7 = 0;
        int[][] stackIn_251_8 = null;
        nb stackIn_252_0 = null;
        nb stackIn_252_1 = null;
        int stackIn_252_2 = 0;
        int stackIn_252_3 = 0;
        int stackIn_252_4 = 0;
        String[] stackIn_252_5 = null;
        int stackIn_252_6 = 0;
        int stackIn_252_7 = 0;
        int[][] stackIn_252_8 = null;
        int stackIn_252_9 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_169_0 = false;
        boolean stackOut_178_0 = false;
        nb stackOut_248_0 = null;
        nb stackOut_248_1 = null;
        int stackOut_248_2 = 0;
        int stackOut_248_3 = 0;
        int stackOut_248_4 = 0;
        String[] stackOut_248_5 = null;
        int stackOut_248_6 = 0;
        int stackOut_248_7 = 0;
        int[][] stackOut_248_8 = null;
        nb stackOut_251_0 = null;
        nb stackOut_251_1 = null;
        int stackOut_251_2 = 0;
        int stackOut_251_3 = 0;
        int stackOut_251_4 = 0;
        String[] stackOut_251_5 = null;
        int stackOut_251_6 = 0;
        int stackOut_251_7 = 0;
        int[][] stackOut_251_8 = null;
        int stackOut_251_9 = 0;
        nb stackOut_249_0 = null;
        nb stackOut_249_1 = null;
        int stackOut_249_2 = 0;
        int stackOut_249_3 = 0;
        int stackOut_249_4 = 0;
        String[] stackOut_249_5 = null;
        int stackOut_249_6 = 0;
        int stackOut_249_7 = 0;
        int[][] stackOut_249_8 = null;
        int stackOut_249_9 = 0;
        var8 = field_G;
        try {
          L0: {
            L1: {
              L2: {
                wh.a(false);
                if (in.field_h == in.field_i) {
                  break L2;
                } else {
                  L3: {
                    if (~bg.field_G == ~in.field_i) {
                      break L3;
                    } else {
                      L4: {
                        if (de.field_f != in.field_i) {
                          break L4;
                        } else {
                          L5: {
                            if (!ni.b(12)) {
                              L6: {
                                if (null == lc.field_c) {
                                  break L6;
                                } else {
                                  pa.a(3, (byte) -114, lc.field_c);
                                  break L6;
                                }
                              }
                              L7: {
                                gf.c(-128);
                                vb.field_g = ji.field_i;
                                if (!si.field_y) {
                                  break L7;
                                } else {
                                  si.field_y = false;
                                  ag.a(-4, false);
                                  break L7;
                                }
                              }
                              L8: {
                                if (!fe.field_E) {
                                  break L8;
                                } else {
                                  if (!vb.b(-52)) {
                                    break L8;
                                  } else {
                                    L9: {
                                      L10: {
                                        var3_int = vb.field_g;
                                        if (var3_int == 5) {
                                          break L10;
                                        } else {
                                          if (var3_int == 6) {
                                            break L10;
                                          } else {
                                            if (var3_int == 8) {
                                              break L10;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                      }
                                      var3_int = gh.field_Jb;
                                      break L9;
                                    }
                                    q.a(-4, false, -1, var3_int);
                                    break L8;
                                  }
                                }
                              }
                              if (d.a(vb.field_g, 0)) {
                                ol.b(true);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          in.field_i = ik.field_b;
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ji.field_a = ji.field_a - 1;
                      if (ji.field_a != 0) {
                        break L1;
                      } else {
                        in.field_i = in.field_h;
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ji.field_a = ji.field_a + 1;
                  if (ji.field_a == 16) {
                    L11: {
                      L12: {
                        if (si.field_y) {
                          break L12;
                        } else {
                          bb.a((byte) 113);
                          if (var8 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      ef.a(param0 ^ 116);
                      break L11;
                    }
                    in.field_i = de.field_f;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L13: {
                L14: {
                  L15: {
                    var3_int = 0;
                    var4 = 0;
                    if (!param1) {
                      L16: {
                        if (~vb.field_g != ~pm.field_T) {
                          break L16;
                        } else {
                          L17: {
                            if (pm.field_T != -1) {
                              break L17;
                            } else {
                              L18: {
                                if (bg.field_H) {
                                  break L18;
                                } else {
                                  if (null == fk.field_i) {
                                    break L15;
                                  } else {
                                    fk.field_i.c(-68, true);
                                    L19: while (true) {
                                      if (!dl.f(22759)) {
                                        break L15;
                                      } else {
                                        fk.field_i.g(97);
                                        if (var8 != 0) {
                                          break L14;
                                        } else {
                                          if (var8 == 0) {
                                            continue L19;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var4 = 1;
                              var3_int = 1;
                              if (var8 == 0) {
                                break L15;
                              } else {
                                break L17;
                              }
                            }
                          }
                          L20: {
                            if (pm.field_T != -2) {
                              break L20;
                            } else {
                              L21: {
                                L22: {
                                  if (null == ih.field_s) {
                                    break L22;
                                  } else {
                                    if (null == hl.a((byte) -66)) {
                                      break L22;
                                    } else {
                                      ih.field_s.b((byte) 27);
                                      var5_ref = (mb) (Object) ih.field_s.field_K.e(13058);
                                      L23: while (true) {
                                        if (null == var5_ref) {
                                          break L22;
                                        } else {
                                          var5_ref.field_vb = 0;
                                          var5_ref = (mb) (Object) ih.field_s.field_K.a((byte) -80);
                                          if (var8 != 0) {
                                            break L21;
                                          } else {
                                            if (var8 == 0) {
                                              continue L23;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var3_int = 1;
                                break L21;
                              }
                              if (var8 == 0) {
                                break L15;
                              } else {
                                break L20;
                              }
                            }
                          }
                          if (!d.a(pm.field_T, param0 ^ 120)) {
                            break L15;
                          } else {
                            i.field_e[pm.field_T].b(true);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      pm.field_U = pm.field_U + 1;
                      if (pm.field_U != 20) {
                        break L15;
                      } else {
                        ol.b(true);
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                  if (!bg.field_H) {
                    break L14;
                  } else {
                    if (rc.field_n) {
                      break L14;
                    } else {
                      if (!da.field_d) {
                        L24: {
                          if (!ob.field_y) {
                            break L24;
                          } else {
                            if (!jn.field_g) {
                              break L24;
                            } else {
                              var3_int = 0;
                              break L24;
                            }
                          }
                        }
                        L25: {
                          L26: {
                            la.a(13, var3_int != 0);
                            if (ee.field_G) {
                              break L26;
                            } else {
                              if (!ob.field_y) {
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          ue.a((byte) 38, var4 != 0, 320, 180);
                          break L25;
                        }
                        L27: {
                          if (!ee.field_G) {
                            break L27;
                          } else {
                            if (null != si.field_A) {
                              si.field_A.c(param0 ^ 37, var4 != 0);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                        }
                        L28: {
                          if (!ob.field_y) {
                            break L28;
                          } else {
                            fk.field_i.c(-121, var4 != 0);
                            break L28;
                          }
                        }
                        L29: while (true) {
                          if (!dl.f(22759)) {
                            break L14;
                          } else {
                            L30: {
                              L31: {
                                if (!vl.field_v) {
                                  break L31;
                                } else {
                                  L32: {
                                    L33: {
                                      if (ob.field_y) {
                                        break L33;
                                      } else {
                                        if (!ee.field_G) {
                                          break L32;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    if (!cn.a(13, 15, 12, false)) {
                                      break L30;
                                    } else {
                                      if (var8 == 0) {
                                        continue L29;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  boolean discarded$3 = cj.a(13, (byte) 99, 12, 15);
                                  if (var8 == 0) {
                                    break L30;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              L34: {
                                if (ob.field_y) {
                                  break L34;
                                } else {
                                  if (!ee.field_G) {
                                    break L30;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              L35: {
                                if (jn.field_g) {
                                  break L35;
                                } else {
                                  if (ei.field_q == 80) {
                                    break L35;
                                  } else {
                                    if (ei.field_q == 10) {
                                      break L35;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                              if (cn.a(13, 15, 12, false)) {
                                continue L29;
                              } else {
                                break L30;
                              }
                            }
                            stackOut_169_0 = jn.field_g;
                            stackIn_179_0 = stackOut_169_0;
                            stackIn_170_0 = stackOut_169_0;
                            if (var8 != 0) {
                              break L13;
                            } else {
                              if (stackIn_170_0) {
                                continue L29;
                              } else {
                                L36: {
                                  if (!ee.field_G) {
                                    break L36;
                                  } else {
                                    si.field_A.g(73);
                                    break L36;
                                  }
                                }
                                if (!ob.field_y) {
                                  continue L29;
                                } else {
                                  fk.field_i.g(51);
                                  if (var8 == 0) {
                                    continue L29;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_178_0 = bg.field_H;
                stackIn_179_0 = stackOut_178_0;
                break L13;
              }
              L37: {
                if (stackIn_179_0) {
                  break L37;
                } else {
                  jk.d((byte) -66);
                  break L37;
                }
              }
              L38: {
                L39: {
                  if (vl.field_v) {
                    break L39;
                  } else {
                    if (on.field_i > 0) {
                      on.field_i = on.field_i - 1;
                      if (var8 == 0) {
                        break L38;
                      } else {
                        break L39;
                      }
                    } else {
                      break L38;
                    }
                  }
                }
                if (on.field_i >= an.field_h) {
                  break L38;
                } else {
                  on.field_i = on.field_i + 1;
                  break L38;
                }
              }
              var5_int = an.field_h * an.field_h;
              var6 = var5_int - on.field_i * on.field_i;
              var7 = vf.field_e + 120 * var6 / var5_int;
              ji.d(0, var7);
              if (bd.field_b.e(13058) == null) {
                break L1;
              } else {
                int fieldTemp$4 = ob.field_o + 1;
                ob.field_o = ob.field_o + 1;
                if (fieldTemp$4 == 500) {
                  ob.field_o = 0;
                  ck discarded$5 = bd.field_b.a(true);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L40: {
              if (param0 == 120) {
                break L40;
              } else {
                this.m(-19);
                break L40;
              }
            }
            L41: {
              if (vb.field_g == -3) {
                lc.field_c = null;
                var3_ref = g.field_l;
                var4_ref_String__ = new String[]{var3_ref};
                var5 = new int[var4_ref_String__.length][];
                var5[0] = uc.field_b;
                var6 = 1;
                L42: while (true) {
                  L43: {
                    L44: {
                      if (var6 >= var4_ref_String__.length) {
                        break L44;
                      } else {
                        var5[var6] = uc.field_b;
                        var6++;
                        if (var8 != 0) {
                          break L43;
                        } else {
                          if (var8 == 0) {
                            continue L42;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    var6 = 0;
                    break L43;
                  }
                  L45: {
                    L46: {
                      L47: {
                        L48: {
                          L49: {
                            L50: {
                              L51: {
                                var7 = di.field_g;
                                if (0 == var7) {
                                  var5[0] = ua.field_v;
                                  var6 = 16;
                                  if (var8 == 0) {
                                    break L45;
                                  } else {
                                    break L51;
                                  }
                                } else {
                                  if (var7 == 1) {
                                    break L51;
                                  } else {
                                    if (7 == var7) {
                                      break L50;
                                    } else {
                                      L52: {
                                        if (var7 != 4) {
                                          break L52;
                                        } else {
                                          if (var8 == 0) {
                                            break L49;
                                          } else {
                                            break L52;
                                          }
                                        }
                                      }
                                      if (var7 == 3) {
                                        break L48;
                                      } else {
                                        if (var7 == 5) {
                                          break L48;
                                        } else {
                                          if (var7 == 10) {
                                            break L47;
                                          } else {
                                            if (var7 == -1) {
                                              break L46;
                                            } else {
                                              break L45;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var5[0] = ua.field_v;
                              var6 = 16;
                              if (var8 == 0) {
                                break L45;
                              } else {
                                break L50;
                              }
                            }
                            var6 = 16;
                            if (var8 == 0) {
                              break L45;
                            } else {
                              break L49;
                            }
                          }
                          var6 = 16;
                          if (var8 == 0) {
                            break L45;
                          } else {
                            break L48;
                          }
                        }
                        var5[0] = ua.field_C[ol.field_Ub + 10 * ge.field_j];
                        var6 = 16;
                        if (var8 == 0) {
                          break L45;
                        } else {
                          break L47;
                        }
                      }
                      var6 = ua.field_t[10 * ge.field_j - -ol.field_Ub][1];
                      var5[0] = ua.field_C[ol.field_Ub + ge.field_j * 10];
                      if (var8 == 0) {
                        break L45;
                      } else {
                        break L46;
                      }
                    }
                    var6 = 0;
                    break L45;
                  }
                  L53: {
                    vl.field_v = false;
                    jn.field_g = false;
                    stackOut_248_0 = null;
                    stackOut_248_1 = null;
                    stackOut_248_2 = 0;
                    stackOut_248_3 = var6;
                    stackOut_248_4 = 1;
                    stackOut_248_5 = (String[]) var4_ref_String__;
                    stackOut_248_6 = 0;
                    stackOut_248_7 = 0;
                    stackOut_248_8 = (int[][]) var5;
                    stackIn_251_0 = stackOut_248_0;
                    stackIn_251_1 = stackOut_248_1;
                    stackIn_251_2 = stackOut_248_2;
                    stackIn_251_3 = stackOut_248_3;
                    stackIn_251_4 = stackOut_248_4;
                    stackIn_251_5 = stackOut_248_5;
                    stackIn_251_6 = stackOut_248_6;
                    stackIn_251_7 = stackOut_248_7;
                    stackIn_251_8 = stackOut_248_8;
                    stackIn_249_0 = stackOut_248_0;
                    stackIn_249_1 = stackOut_248_1;
                    stackIn_249_2 = stackOut_248_2;
                    stackIn_249_3 = stackOut_248_3;
                    stackIn_249_4 = stackOut_248_4;
                    stackIn_249_5 = stackOut_248_5;
                    stackIn_249_6 = stackOut_248_6;
                    stackIn_249_7 = stackOut_248_7;
                    stackIn_249_8 = stackOut_248_8;
                    if (-1 != di.field_g) {
                      stackOut_251_0 = null;
                      stackOut_251_1 = null;
                      stackOut_251_2 = stackIn_251_2;
                      stackOut_251_3 = stackIn_251_3;
                      stackOut_251_4 = stackIn_251_4;
                      stackOut_251_5 = (String[]) (Object) stackIn_251_5;
                      stackOut_251_6 = stackIn_251_6;
                      stackOut_251_7 = stackIn_251_7;
                      stackOut_251_8 = (int[][]) (Object) stackIn_251_8;
                      stackOut_251_9 = 0;
                      stackIn_252_0 = stackOut_251_0;
                      stackIn_252_1 = stackOut_251_1;
                      stackIn_252_2 = stackOut_251_2;
                      stackIn_252_3 = stackOut_251_3;
                      stackIn_252_4 = stackOut_251_4;
                      stackIn_252_5 = stackOut_251_5;
                      stackIn_252_6 = stackOut_251_6;
                      stackIn_252_7 = stackOut_251_7;
                      stackIn_252_8 = stackOut_251_8;
                      stackIn_252_9 = stackOut_251_9;
                      break L53;
                    } else {
                      stackOut_249_0 = null;
                      stackOut_249_1 = null;
                      stackOut_249_2 = stackIn_249_2;
                      stackOut_249_3 = stackIn_249_3;
                      stackOut_249_4 = stackIn_249_4;
                      stackOut_249_5 = (String[]) (Object) stackIn_249_5;
                      stackOut_249_6 = stackIn_249_6;
                      stackOut_249_7 = stackIn_249_7;
                      stackOut_249_8 = (int[][]) (Object) stackIn_249_8;
                      stackOut_249_9 = 3;
                      stackIn_252_0 = stackOut_249_0;
                      stackIn_252_1 = stackOut_249_1;
                      stackIn_252_2 = stackOut_249_2;
                      stackIn_252_3 = stackOut_249_3;
                      stackIn_252_4 = stackOut_249_4;
                      stackIn_252_5 = stackOut_249_5;
                      stackIn_252_6 = stackOut_249_6;
                      stackIn_252_7 = stackOut_249_7;
                      stackIn_252_8 = stackOut_249_8;
                      stackIn_252_9 = stackOut_249_9;
                      break L53;
                    }
                  }
                  fk.field_i = new nb(stackIn_252_2 != 0, stackIn_252_3, stackIn_252_4, stackIn_252_5, stackIn_252_6, stackIn_252_7 != 0, stackIn_252_8, stackIn_252_9, 2, false, false);
                  var7 = nk.field_B ? 1 : 0;
                  q.a(-1, var7 != 0, -1, 0);
                  ea.field_k = true;
                  break L41;
                }
              } else {
                break L41;
              }
            }
            L54: {
              if (-4 != vb.field_g) {
                break L54;
              } else {
                mm.field_g.a(63, (byte) -117);
                mm.field_g.field_p = mm.field_g.field_p + 1;
                var3_int = mm.field_g.field_p;
                mm.field_g.a((byte) 124, uc.field_b.length);
                var4 = 0;
                L55: while (true) {
                  L56: {
                    L57: {
                      if (var4 >= uc.field_b.length) {
                        break L57;
                      } else {
                        mm.field_g.a((byte) 127, uc.field_b[var4]);
                        var4++;
                        if (var8 != 0) {
                          break L56;
                        } else {
                          if (var8 == 0) {
                            continue L55;
                          } else {
                            break L57;
                          }
                        }
                      }
                    }
                    mm.field_g.b((byte) 111, mm.field_g.field_p - var3_int);
                    mm.field_g.a(9, (byte) -117);
                    rc.field_n = true;
                    vb.field_g = pm.field_T;
                    break L56;
                  }
                  on.field_i = an.field_h;
                  break L54;
                }
              }
            }
            L58: {
              if (vb.field_g == -5) {
                na.a((byte) -43, 11, nf.field_b.j(-26));
                da.field_d = true;
                vb.field_g = pm.field_T;
                break L58;
              } else {
                break L58;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "SteelSentinels.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        ic var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((SteelSentinels) this).a(14, false, 5000, 71, 1, 0, 4, 2);
              var2 = new ic();
              var2.b(128, (byte) -123, 9);
              qm.a(-31, hb.field_i, 22050, var2, true, (java.awt.Component) (Object) sl.field_n);
              ((SteelSentinels) this).a(1, true, true, false, true, true, false);
              ad.field_d = n.field_s;
              m.field_b = pl.field_ab;
              f.field_B[66] = 1;
              f.field_B[61] = 1;
              f.field_B[67] = 32;
              gl.field_x = qg.field_j;
              if (param0 == 26689) {
                break L1;
              } else {
                ((SteelSentinels) this).c(-47);
                break L1;
              }
            }
            f.field_B[57] = -2;
            f.field_B[71] = 12;
            f.field_B[72] = 2;
            f.field_B[78] = -1;
            uc.field_b = ua.field_x;
            fc.field_b = rc.field_o;
            f.field_B[80] = 2;
            f.field_B[70] = 1;
            f.field_B[76] = 5;
            f.field_B[73] = 21;
            f.field_B[58] = -2;
            f.field_B[63] = 1;
            f.field_B[77] = -1;
            ol.field_cc = te.field_a;
            ja.field_b = cb.field_h;
            f.field_B[60] = -1;
            f.field_B[74] = 1;
            f.field_B[64] = 1;
            in.field_b = uc.field_h;
            f.field_B[65] = 1;
            f.field_B[62] = 4;
            f.field_B[69] = 19;
            f.field_B[79] = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        Object var3_ref = null;
        String var4_ref_String = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        mb var4_ref_mb = null;
        int var5 = 0;
        je var5_ref_je = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        je var10_ref = null;
        int var11_int = 0;
        mb var11 = null;
        int[][] var12 = null;
        int var13_int = 0;
        nb var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_208_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_252_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        int stackIn_264_0 = 0;
        int stackIn_333_0 = 0;
        int stackIn_333_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_206_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_253_1 = 0;
        int stackOut_255_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_258_1 = 0;
        int stackOut_263_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_332_1 = 0;
        L0: {
          var15 = field_G;
          int discarded$3 = ub.b(-108);
          kg.field_Vb = ha.a((byte) -86);
          vk.a(false);
          if (wb.field_c == null) {
            break L0;
          } else {
            if (!wb.field_c.field_b) {
              break L0;
            } else {
              ub.c(param0 + -2);
              og.a(-5213);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 2) {
            break L1;
          } else {
            ((SteelSentinels) this).init();
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = this;
          stackOut_6_1 = 5;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (wb.field_c == null) {
            stackOut_8_0 = this;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        L3: {
          ((SteelSentinels) this).a(stackIn_9_1, stackIn_9_2 != 0);
          if (!rm.field_f) {
            break L3;
          } else {
            this.m(105);
            rm.field_f = false;
            break L3;
          }
        }
        L4: {
          a.field_c = a.field_c + 1;
          if (!ol.j(0)) {
            break L4;
          } else {
            ((SteelSentinels) this).k(113);
            if (!ol.j(0)) {
              break L4;
            } else {
              return;
            }
          }
        }
        L5: {
          L6: {
            if (!gh.field_pb) {
              break L6;
            } else {
              L7: {
                if (!co.a(false)) {
                  break L7;
                } else {
                  L8: {
                    if (!mg.b(true)) {
                      break L8;
                    } else {
                      L9: {
                        if (in.field_i != in.field_h) {
                          break L9;
                        } else {
                          L10: {
                            L11: {
                              var2_int = eh.a(0);
                              if (var2_int != 2) {
                                break L11;
                              } else {
                                ub.c(0);
                                if (var15 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var2_int == 3) {
                                break L12;
                              } else {
                                if (var2_int == 4) {
                                  si.field_y = true;
                                  v.a(0, lk.field_bb, param0 + 8);
                                  if (var15 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            si.field_y = false;
                            ag.a(-4, true);
                            break L10;
                          }
                          this.b(param0 + 118, true);
                          if (var15 == 0) {
                            break L5;
                          } else {
                            break L9;
                          }
                        }
                      }
                      this.b(param0 + 118, false);
                      if (var15 == 0) {
                        break L5;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L13: {
                    if (cf.c((byte) 100)) {
                      break L13;
                    } else {
                      L14: {
                        if (ri.b(-121)) {
                          break L14;
                        } else {
                          this.b(120, false);
                          if (var15 == 0) {
                            break L5;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (in.field_i != in.field_h) {
                          break L15;
                        } else {
                          L16: {
                            var2_int = rn.c((byte) 90);
                            if (var2_int == 1) {
                              fe.field_E = true;
                              v.a(0, pl.field_Q, param0 + 8);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          this.b(param0 + 118, true);
                          if (var15 == 0) {
                            break L5;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.b(param0 + 118, false);
                      if (var15 == 0) {
                        break L5;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L17: {
                    stackOut_49_0 = this;
                    stackIn_52_0 = stackOut_49_0;
                    stackIn_50_0 = stackOut_49_0;
                    if (null == wb.field_c) {
                      stackOut_52_0 = this;
                      stackOut_52_1 = 0;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      break L17;
                    } else {
                      stackOut_50_0 = this;
                      stackIn_51_0 = stackOut_50_0;
                      stackOut_51_0 = this;
                      stackOut_51_1 = 1;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_53_1 = stackOut_51_1;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var2_int = ((SteelSentinels) this).a(stackIn_53_1 != 0, -3836);
                      if (var2_int == 1) {
                        break L19;
                      } else {
                        if (var2_int == 2) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L20: {
                      if (wb.field_c == null) {
                        break L20;
                      } else {
                        ub.c(0);
                        break L20;
                      }
                    }
                    if (var2_int != 2) {
                      break L18;
                    } else {
                      t.a(true, wl.d((byte) -21));
                      break L18;
                    }
                  }
                  this.b(120, true);
                  if (var15 == 0) {
                    break L5;
                  } else {
                    break L7;
                  }
                }
              }
              ai.d(param0 + 103);
              if (var15 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          r.a(jj.field_d, (byte) 104);
          if (this.k((byte) -52)) {
            gh.field_pb = true;
            break L5;
          } else {
            break L5;
          }
        }
        L21: {
          if (ni.b(92)) {
            break L21;
          } else {
            L22: while (true) {
              L23: {
                L24: {
                  var2 = (Object) (Object) (cf) (Object) un.field_b.a(true);
                  if (var2 != null) {
                    break L24;
                  } else {
                    if (var15 != 0) {
                      break L23;
                    } else {
                      if (var15 == 0) {
                        break L21;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                r.a(4, (byte) 123, (cf) var2);
                break L23;
              }
              if (var15 == 0) {
                continue L22;
              } else {
                break L21;
              }
            }
          }
        }
        L25: {
          if (ni.b(74)) {
            break L25;
          } else {
            if (jb.field_P != 0) {
              ef.a((byte) -109);
              break L25;
            } else {
              break L25;
            }
          }
        }
        L26: while (true) {
          L27: {
            L28: {
              if (!rl.a((byte) 54, f.field_B)) {
                break L28;
              } else {
                stackOut_81_0 = ch.field_N;
                stackOut_81_1 = 9;
                stackIn_333_0 = stackOut_81_0;
                stackIn_333_1 = stackOut_81_1;
                stackIn_82_0 = stackOut_81_0;
                stackIn_82_1 = stackOut_81_1;
                if (var15 != 0) {
                  break L27;
                } else {
                  L29: {
                    if (stackIn_82_0 != stackIn_82_1) {
                      break L29;
                    } else {
                      ol.b(true);
                      vb.field_g = 11;
                      rc.field_n = false;
                      ll.field_s = rf.field_d.h(1);
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (ch.field_N == 14) {
                      L31: {
                        ol.b(true);
                        jj.field_i = nf.a(uc.field_b, h.field_G, (byte) 44);
                        kc.field_w[1] = (byte) 0;
                        if ((jj.field_i & rc.field_o[1][kc.field_w[1]]) == 0) {
                          kc.field_w[1] = (byte) 1;
                          if (rd.field_b <= 0) {
                            break L31;
                          } else {
                            kc.field_w[1] = (byte) 2;
                            break L31;
                          }
                        } else {
                          break L31;
                        }
                      }
                      L32: {
                        if (kc.field_w[1] != 0) {
                          break L32;
                        } else {
                          v.field_b[0] = 4;
                          break L32;
                        }
                      }
                      L33: {
                        if (1 != kc.field_w[1]) {
                          break L33;
                        } else {
                          v.field_b[0] = 6;
                          break L33;
                        }
                      }
                      L34: {
                        if (kc.field_w[1] == 2) {
                          v.field_b[0] = 12;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      sg.a(ge.a(2000, (byte) -32), nl.field_db.length, tm.a((byte) 50), 1024, ge.a(12, (byte) -32), nj.a((byte) -127), ti.field_u, (byte) -22, ic.f(3443), 150);
                      nh.a((byte) -98, tc.d(800), wn.b((byte) 121));
                      rc.field_n = false;
                      vb.field_g = -2;
                      bg.field_H = true;
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                  L35: {
                    if (ch.field_N == 15) {
                      L36: {
                        if (bg.field_H) {
                          ol.b(true);
                          oa.f(param0 ^ -12163);
                          ie.b((byte) 124);
                          ea.field_k = false;
                          ob.field_y = false;
                          vb.field_g = 0;
                          jc.field_d = true;
                          ee.field_G = false;
                          bg.field_H = false;
                          lc.field_e = true;
                          vn.c(103);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      da.field_d = false;
                      rc.field_n = false;
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L35;
                      }
                    } else {
                      break L35;
                    }
                  }
                  L37: {
                    if (ch.field_N != 10) {
                      break L37;
                    } else {
                      if (bg.field_H) {
                        in.a(11247);
                        if (var15 == 0) {
                          continue L26;
                        } else {
                          break L37;
                        }
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: {
                    if (ch.field_N == 80) {
                      var2_int = rf.field_d.f((byte) -123);
                      var3 = (byte)(255 & rf.field_d.f((byte) -123));
                      if (null == nf.field_b) {
                        continue L26;
                      } else {
                        L39: {
                          if (0 == var2_int) {
                            break L39;
                          } else {
                            nf.field_b.field_Sb[var2_int] = (byte) var3;
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L39;
                            }
                          }
                        }
                        nf.field_b.field_Ub = var3;
                        v.field_b[0] = var3;
                        if (var15 == 0) {
                          continue L26;
                        } else {
                          break L38;
                        }
                      }
                    } else {
                      break L38;
                    }
                  }
                  L40: {
                    if (ch.field_N != 11) {
                      break L40;
                    } else {
                      var2 = (Object) (Object) eb.a((byte) -62, false);
                      bg.a((na) var2, -92);
                      if (m.field_a == 1) {
                        if (fk.field_i != null) {
                          if (ph.field_e != null) {
                            L41: {
                              var3_ref = (Object) (Object) "";
                              if (null == b.field_g) {
                                break L41;
                              } else {
                                L42: {
                                  var4_ref_String = b.field_g;
                                  if (be.field_b == 1) {
                                    var4_ref_String = "<img=0>" + var4_ref_String;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                L43: {
                                  if (2 != be.field_b) {
                                    break L43;
                                  } else {
                                    var4_ref_String = "<img=1>" + var4_ref_String;
                                    break L43;
                                  }
                                }
                                var3_ref = (Object) (Object) (var4_ref_String + ": ");
                                break L41;
                              }
                            }
                            L44: {
                              L45: {
                                var4_ref_String = (String) var3_ref + mi.a(bg.field_F);
                                if (((na) var2).field_g) {
                                  break L45;
                                } else {
                                  if (!o.a(-122, ((na) var2).field_p)) {
                                    break L45;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              bl.a(48127, var4_ref_String, (byte) 124);
                              ln.field_e = ln.field_e - 1;
                              break L44;
                            }
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L40;
                            }
                          } else {
                            continue L26;
                          }
                        } else {
                          continue L26;
                        }
                      } else {
                        continue L26;
                      }
                    }
                  }
                  L46: {
                    if (ch.field_N == 12) {
                      na discarded$4 = eb.a((byte) -127, true);
                      bg.a(new na(true), -93);
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L46;
                      }
                    } else {
                      break L46;
                    }
                  }
                  L47: {
                    if (ch.field_N != 67) {
                      break L47;
                    } else {
                      var2 = (Object) (Object) jg.a(true);
                      var3 = 0;
                      L48: while (true) {
                        L49: {
                          if (var3 >= ((Object[]) var2).length) {
                            break L49;
                          } else {
                            ((int[]) var2)[var3] = rf.field_d.i(0);
                            var3++;
                            if (var15 != 0) {
                              continue L26;
                            } else {
                              if (var15 == 0) {
                                continue L48;
                              } else {
                                break L49;
                              }
                            }
                          }
                        }
                        var3_ref = var2;
                        var4_ref_int__ = ge.field_m;
                        var5 = 0;
                        L50: while (true) {
                          L51: {
                            L52: {
                              if (var5 >= 8) {
                                break L52;
                              } else {
                                ((int[]) var3_ref)[var5] = ec.a(((int[]) var3_ref)[var5], ~var4_ref_int__[var5]);
                                var5++;
                                if (var15 != 0) {
                                  break L51;
                                } else {
                                  if (var15 == 0) {
                                    continue L50;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                            }
                            L53: {
                              if (!ln.field_h) {
                                break L53;
                              } else {
                                var3_ref = (Object) (Object) ce.field_t;
                                var4_ref_int__ = (int[]) var2;
                                var5 = 0;
                                L54: while (true) {
                                  if (var5 >= 8) {
                                    break L53;
                                  } else {
                                    ((int[]) var3_ref)[var5] = vn.a(((int[]) var3_ref)[var5], var4_ref_int__[var5]);
                                    var5++;
                                    if (var15 != 0) {
                                      break L51;
                                    } else {
                                      if (var15 == 0) {
                                        continue L54;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3_ref = (Object) (Object) ge.field_m;
                            var4_ref_int__ = (int[]) var2;
                            break L51;
                          }
                          var5 = 0;
                          L55: while (true) {
                            L56: {
                              L57: {
                                if (var5 >= 8) {
                                  break L57;
                                } else {
                                  ((int[]) var3_ref)[var5] = vn.a(((int[]) var3_ref)[var5], var4_ref_int__[var5]);
                                  var5++;
                                  if (var15 != 0) {
                                    break L56;
                                  } else {
                                    if (var15 == 0) {
                                      continue L55;
                                    } else {
                                      break L57;
                                    }
                                  }
                                }
                              }
                              wl.c((byte) 10);
                              break L56;
                            }
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                    }
                  }
                  L58: {
                    if (ch.field_N != 60) {
                      break L58;
                    } else {
                      li.field_v = rf.field_d.i(0);
                      h.field_G = rf.field_d.i(0);
                      var2_int = 0;
                      L59: while (true) {
                        L60: {
                          L61: {
                            if (var2_int >= 4) {
                              break L61;
                            } else {
                              rn.field_D[var2_int] = rf.field_d.i(0);
                              var2_int++;
                              if (var15 != 0) {
                                break L60;
                              } else {
                                if (var15 == 0) {
                                  continue L59;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                          var2_int = 0;
                          break L60;
                        }
                        L62: while (true) {
                          L63: {
                            L64: {
                              if (2 <= var2_int) {
                                break L64;
                              } else {
                                fe.field_D[var2_int] = rf.field_d.i(0);
                                var2_int++;
                                if (var15 != 0) {
                                  break L63;
                                } else {
                                  if (var15 == 0) {
                                    continue L62;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                            }
                            var2_int = 0;
                            break L63;
                          }
                          L65: while (true) {
                            L66: {
                              L67: {
                                if (~var2_int <= ~va.field_k.length) {
                                  break L67;
                                } else {
                                  va.field_k[var2_int] = 0;
                                  var2_int++;
                                  if (var15 != 0) {
                                    break L66;
                                  } else {
                                    if (var15 == 0) {
                                      continue L65;
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                              }
                              vn.d(-30);
                              break L66;
                            }
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                    }
                  }
                  L68: {
                    if (ch.field_N == 77) {
                      var2_int = rf.field_d.f((byte) -123);
                      ee.field_S = new int[var2_int];
                      var3 = 0;
                      L69: while (true) {
                        L70: {
                          if (var2_int <= var3) {
                            break L70;
                          } else {
                            ee.field_S[var3] = rf.field_d.f((byte) -123);
                            var3++;
                            if (var15 != 0) {
                              continue L26;
                            } else {
                              if (var15 == 0) {
                                continue L69;
                              } else {
                                break L70;
                              }
                            }
                          }
                        }
                        if (var15 == 0) {
                          continue L26;
                        } else {
                          break L68;
                        }
                      }
                    } else {
                      break L68;
                    }
                  }
                  L71: {
                    if (ch.field_N == 78) {
                      var2_int = 0;
                      L72: while (true) {
                        L73: {
                          L74: {
                            if (var2_int >= 3) {
                              break L74;
                            } else {
                              fm.field_f[var2_int] = rf.field_d.f((byte) -65);
                              var2_int++;
                              if (var15 != 0) {
                                break L73;
                              } else {
                                if (var15 == 0) {
                                  continue L72;
                                } else {
                                  break L74;
                                }
                              }
                            }
                          }
                          var2_int = 0;
                          break L73;
                        }
                        L75: while (true) {
                          L76: {
                            L77: {
                              L78: {
                                if (~jh.field_a.length >= ~var2_int) {
                                  break L78;
                                } else {
                                  jh.field_a[var2_int] = rf.field_d.c((byte) -60);
                                  var2_int++;
                                  if (var15 != 0) {
                                    break L77;
                                  } else {
                                    if (var15 == 0) {
                                      continue L75;
                                    } else {
                                      break L78;
                                    }
                                  }
                                }
                              }
                              if ((16 & fm.field_f[0]) == 0) {
                                break L77;
                              } else {
                                stackOut_206_0 = 1;
                                stackIn_208_0 = stackOut_206_0;
                                break L76;
                              }
                            }
                            stackOut_207_0 = 0;
                            stackIn_208_0 = stackOut_207_0;
                            break L76;
                          }
                          L79: {
                            L80: {
                              var2_int = stackIn_208_0;
                              fm.field_f[0] = ec.a(fm.field_f[0], 15);
                              if (fj.field_d > fm.field_f[0]) {
                                break L80;
                              } else {
                                L81: {
                                  if (var2_int != 0) {
                                    break L81;
                                  } else {
                                    jc.field_f = 1;
                                    if (var15 == 0) {
                                      break L79;
                                    } else {
                                      break L81;
                                    }
                                  }
                                }
                                jc.field_f = 2;
                                if (var15 == 0) {
                                  break L79;
                                } else {
                                  break L80;
                                }
                              }
                            }
                            jc.field_f = 0;
                            break L79;
                          }
                          if (gi.h((byte) -79)) {
                            km.field_a = ee.field_k;
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L71;
                            }
                          } else {
                            continue L26;
                          }
                        }
                      }
                    } else {
                      break L71;
                    }
                  }
                  L82: {
                    if (ch.field_N != 73) {
                      break L82;
                    } else {
                      L83: {
                        var2_int = rf.field_d.f((byte) -63) + -1;
                        var3 = rf.field_d.i(0);
                        var4 = rf.field_d.i(0);
                        var5 = rf.field_d.i(0);
                        var6 = rf.field_d.i(0);
                        var7 = rf.field_d.i(0);
                        if (var2_int < 2) {
                          lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int, new int[1], 3);
                          break L83;
                        } else {
                          break L83;
                        }
                      }
                      qi.field_d = null;
                      qm.a(true);
                      bd.field_b.a(3, (ck) (Object) new ai((wk) null, db.a(vm.field_q, param0 + -102, new String[1])));
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L82;
                      }
                    }
                  }
                  L84: {
                    if (ch.field_N == 72) {
                      var2_int = rf.field_d.c((byte) -60);
                      li.field_v = li.field_v + var2_int;
                      if (var2_int <= 0) {
                        continue L26;
                      } else {
                        vn.d(param0 + -44);
                        hj.field_F = var2_int;
                        if (var15 == 0) {
                          continue L26;
                        } else {
                          break L84;
                        }
                      }
                    } else {
                      break L84;
                    }
                  }
                  L85: {
                    L86: {
                      if (ch.field_N == 74) {
                        break L86;
                      } else {
                        if (79 == ch.field_N) {
                          break L86;
                        } else {
                          break L85;
                        }
                      }
                    }
                    L87: {
                      var2_int = rf.field_d.f((byte) -113);
                      var3_ref = (Object) (Object) qg.field_o;
                      if (79 == ch.field_N) {
                        var3_ref = (Object) (Object) c.field_r;
                        break L87;
                      } else {
                        break L87;
                      }
                    }
                    bd.field_b.a(3, (ck) (Object) new ai((wk) null, db.a((String) var3_ref, -105, new String[1])));
                    if (var15 == 0) {
                      continue L26;
                    } else {
                      break L85;
                    }
                  }
                  L88: {
                    if (ch.field_N == 70) {
                      int discarded$5 = rf.field_d.f((byte) -67);
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L88;
                      }
                    } else {
                      break L88;
                    }
                  }
                  L89: {
                    L90: {
                      if (ch.field_N == 57) {
                        break L90;
                      } else {
                        if (ch.field_N == 58) {
                          break L90;
                        } else {
                          break L89;
                        }
                      }
                    }
                    L91: {
                      ol.b(true);
                      var2_int = rf.field_d.i(param0 + -2);
                      var3 = rf.field_d.f((byte) -110);
                      var4 = rf.field_d.f((byte) -74);
                      var5 = rf.field_d.f((byte) -90);
                      var6 = rf.field_d.f((byte) -102);
                      if ((var6 & 1) == 0) {
                        stackOut_245_0 = 0;
                        stackIn_246_0 = stackOut_245_0;
                        break L91;
                      } else {
                        stackOut_244_0 = 1;
                        stackIn_246_0 = stackOut_244_0;
                        break L91;
                      }
                    }
                    L92: {
                      var7 = stackIn_246_0;
                      if ((2 & var6) == 0) {
                        stackOut_248_0 = 0;
                        stackIn_249_0 = stackOut_248_0;
                        break L92;
                      } else {
                        stackOut_247_0 = 1;
                        stackIn_249_0 = stackOut_247_0;
                        break L92;
                      }
                    }
                    L93: {
                      var8 = stackIn_249_0;
                      if (0 == rf.field_d.f((byte) -81)) {
                        stackOut_251_0 = 0;
                        stackIn_252_0 = stackOut_251_0;
                        break L93;
                      } else {
                        stackOut_250_0 = 1;
                        stackIn_252_0 = stackOut_250_0;
                        break L93;
                      }
                    }
                    var9 = stackIn_252_0;
                    var10 = new String[rf.field_d.f((byte) -90)];
                    var11_int = -2;
                    var12 = new int[var10.length][];
                    var13_int = 0;
                    L94: while (true) {
                      stackOut_253_0 = ~var13_int;
                      stackOut_253_1 = ~var10.length;
                      stackIn_254_0 = stackOut_253_0;
                      stackIn_254_1 = stackOut_253_1;
                      L95: while (true) {
                        L96: {
                          L97: {
                            if (stackIn_254_0 <= stackIn_254_1) {
                              break L97;
                            } else {
                              var10[var13_int] = rf.field_d.e((byte) 126);
                              var12[var13_int] = new int[rf.field_d.f((byte) -63)];
                              stackOut_255_0 = 0;
                              stackIn_264_0 = stackOut_255_0;
                              stackIn_256_0 = stackOut_255_0;
                              if (var15 != 0) {
                                break L96;
                              } else {
                                var14 = stackIn_256_0;
                                L98: while (true) {
                                  L99: {
                                    if (var14 >= var12[var13_int].length) {
                                      break L99;
                                    } else {
                                      var12[var13_int][var14] = rf.field_d.f((byte) -123);
                                      stackOut_258_0 = ~var12[var13_int][var14];
                                      stackOut_258_1 = -256;
                                      stackIn_254_0 = stackOut_258_0;
                                      stackIn_254_1 = stackOut_258_1;
                                      stackIn_259_0 = stackOut_258_0;
                                      stackIn_259_1 = stackOut_258_1;
                                      if (var15 != 0) {
                                        continue L95;
                                      } else {
                                        L100: {
                                          if (stackIn_259_0 != stackIn_259_1) {
                                            break L100;
                                          } else {
                                            var12[var13_int][var14] = -1;
                                            break L100;
                                          }
                                        }
                                        var14++;
                                        if (var15 == 0) {
                                          continue L98;
                                        } else {
                                          break L99;
                                        }
                                      }
                                    }
                                  }
                                  var13_int++;
                                  if (var15 == 0) {
                                    continue L94;
                                  } else {
                                    break L97;
                                  }
                                }
                              }
                            }
                          }
                          var11_int = rf.field_d.d((byte) -2);
                          di.field_g = -1;
                          qh.field_Yb = -2;
                          jn.field_g = false;
                          vl.field_v = false;
                          lc.field_c = null;
                          stackOut_263_0 = -1;
                          stackIn_264_0 = stackOut_263_0;
                          break L96;
                        }
                        L101: {
                          if (stackIn_264_0 != var11_int) {
                            break L101;
                          } else {
                            var11_int = -2;
                            break L101;
                          }
                        }
                        L102: {
                          L103: {
                            var13 = new nb(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                            var13.field_w = rf.field_d.i(0);
                            if (57 == ch.field_N) {
                              break L103;
                            } else {
                              si.field_A = var13;
                              ee.field_G = true;
                              ol.l(0);
                              if (var15 == 0) {
                                break L102;
                              } else {
                                break L103;
                              }
                            }
                          }
                          fk.field_i = var13;
                          ob.field_y = true;
                          in.c(2);
                          h.i(-1);
                          ol.l(0);
                          break L102;
                        }
                        vb.field_g = -1;
                        da.field_d = false;
                        ea.field_k = true;
                        if (var15 == 0) {
                          continue L26;
                        } else {
                          break L89;
                        }
                      }
                    }
                  }
                  L104: {
                    if (ch.field_N == 59) {
                      L105: {
                        L106: {
                          if (ob.field_y) {
                            break L106;
                          } else {
                            if (ee.field_G) {
                              break L106;
                            } else {
                              break L105;
                            }
                          }
                        }
                        L107: {
                          ol.b(true);
                          if (!ob.field_y) {
                            break L107;
                          } else {
                            fk.field_i.a((byte) -128, false);
                            break L107;
                          }
                        }
                        lc.field_e = true;
                        vb.field_g = -2;
                        ee.field_G = false;
                        ob.field_y = false;
                        ea.field_k = false;
                        vl.field_v = true;
                        ln.field_e = 0;
                        vn.c(104);
                        break L105;
                      }
                      da.field_d = false;
                      if (var15 == 0) {
                        continue L26;
                      } else {
                        break L104;
                      }
                    } else {
                      break L104;
                    }
                  }
                  L108: {
                    var2 = null;
                    if (!ob.field_y) {
                      if (!ee.field_G) {
                        break L108;
                      } else {
                        var2 = (Object) (Object) si.field_A;
                        break L108;
                      }
                    } else {
                      var2 = (Object) (Object) fk.field_i;
                      break L108;
                    }
                  }
                  L109: {
                    if (null != var2) {
                      L110: {
                        if (ch.field_N != 61) {
                          break L110;
                        } else {
                          L111: {
                            var3 = rf.field_d.f((byte) -117);
                            var4_ref_mb = ((nb) var2).field_X.f(var3, -128);
                            var5_ref_je = (je) (Object) var4_ref_mb.field_Ec.b(1063677678);
                            if (var5_ref_je != null) {
                              var5_ref_je.b(param0 ^ 6);
                              break L111;
                            } else {
                              break L111;
                            }
                          }
                          var5_ref_je = (je) (Object) var4_ref_mb.field_B.b(1063677678);
                          if (var5_ref_je != null) {
                            var5_ref_je.b(4);
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L110;
                            }
                          } else {
                            continue L26;
                          }
                        }
                      }
                      L112: {
                        if (ch.field_N != 69) {
                          break L112;
                        } else {
                          L113: {
                            var3 = rf.field_d.f((byte) -85);
                            var4 = rf.field_d.f((byte) -80);
                            var5 = rf.field_d.f((byte) -120);
                            var6 = rf.field_d.i(0);
                            var7 = rf.field_d.i(0);
                            var8 = rf.field_d.i(param0 ^ 2);
                            var9 = rf.field_d.i(param0 ^ 2);
                            if (var5 == 255) {
                              var5 = -1;
                              break L113;
                            } else {
                              break L113;
                            }
                          }
                          L114: {
                            var10_ref = new je(var4, var5, var6);
                            var10_ref.field_B = var9;
                            var10_ref.field_u = var7;
                            var10_ref.field_y = var8;
                            var11 = ((nb) var2).field_X.f(var3, -128);
                            if (var4 == 10) {
                              break L114;
                            } else {
                              break L114;
                            }
                          }
                          if (null != var11) {
                            var11.d((byte) 79, var10_ref);
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L112;
                            }
                          } else {
                            continue L26;
                          }
                        }
                      }
                      L115: {
                        if (ch.field_N != 76) {
                          break L115;
                        } else {
                          var3 = rf.field_d.f((byte) -120);
                          var4 = rf.field_d.i(0);
                          ((nb) var2).field_X.a(var4, 28669, var3);
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L115;
                          }
                        }
                      }
                      L116: {
                        if (ch.field_N == 71) {
                          L117: {
                            if (((nb) var2).field_i + -100 <= ((nb) var2).field_w) {
                              break L117;
                            } else {
                              if (((nb) var2).field_X.field_r >= ((nb) var2).field_w) {
                                break L117;
                              } else {
                                ((nb) var2).field_w = -100 + ((nb) var2).field_i;
                                break L117;
                              }
                            }
                          }
                          ((nb) var2).field_i = rf.field_d.i(param0 ^ 2);
                          var3 = rf.field_d.i(0);
                          var4 = rf.field_d.i(param0 + -2);
                          if (~((nb) var2).field_l > ~((nb) var2).field_X.field_r) {
                            ((nb) var2).field_j = var3;
                            ((nb) var2).field_l = var4;
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L116;
                            }
                          } else {
                            continue L26;
                          }
                        } else {
                          break L116;
                        }
                      }
                      L118: {
                        if (62 == ch.field_N) {
                          ((nb) var2).field_i = rf.field_d.i(0);
                          ((nb) var2).field_z = true;
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L118;
                          }
                        } else {
                          break L118;
                        }
                      }
                      L119: {
                        if (ch.field_N != 63) {
                          break L119;
                        } else {
                          ((nb) var2).field_X.field_V = rf.field_d.f((byte) -92);
                          if (null == fk.field_i) {
                            continue L26;
                          } else {
                            in.c(2);
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L119;
                            }
                          }
                        }
                      }
                      L120: {
                        if (ch.field_N != 64) {
                          break L120;
                        } else {
                          ((nb) var2).field_X.field_hb = rf.field_d.f((byte) -111);
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L120;
                          }
                        }
                      }
                      L121: {
                        if (ch.field_N != 65) {
                          break L121;
                        } else {
                          ((nb) var2).field_X.field_X = rf.field_d.f((byte) -91);
                          if (null == fk.field_i) {
                            continue L26;
                          } else {
                            h.i(-1);
                            if (var15 == 0) {
                              continue L26;
                            } else {
                              break L121;
                            }
                          }
                        }
                      }
                      if (66 == ch.field_N) {
                        ((nb) var2).field_N = rf.field_d.f((byte) -85);
                        if (null == fk.field_i) {
                          continue L26;
                        } else {
                          h.i(-1);
                          if (var15 == 0) {
                            continue L26;
                          } else {
                            break L109;
                          }
                        }
                      } else {
                        break L109;
                      }
                    } else {
                      break L109;
                    }
                  }
                  ((SteelSentinels) this).h(param0 + 50);
                  if (var15 == 0) {
                    continue L26;
                  } else {
                    break L28;
                  }
                }
              }
            }
            gj.a(0, 0);
            stackOut_332_0 = -2;
            stackOut_332_1 = pm.field_T;
            stackIn_333_0 = stackOut_332_0;
            stackIn_333_1 = stackOut_332_1;
            break L27;
          }
          L122: {
            if (stackIn_333_0 != stackIn_333_1) {
              break L122;
            } else {
              if (vb.field_g != -2) {
                break L122;
              } else {
                vl.field_v = true;
                break L122;
              }
            }
          }
          L123: {
            if (!vl.field_v) {
              break L123;
            } else {
              ln.field_e = 0;
              break L123;
            }
          }
          L124: {
            if (ri.a(16731221)) {
              L125: {
                L126: {
                  var2_int = ((SteelSentinels) this).i((byte) -112);
                  if (0 == var2_int) {
                    break L126;
                  } else {
                    if (var2_int != 1) {
                      break L125;
                    } else {
                      break L126;
                    }
                  }
                }
                L127: {
                  wh.a(2, -26077);
                  uc.a(true, 3);
                  hk.a((byte) 86, 4);
                  vf.a(false, 6);
                  ml.a(param0 + -74, 7);
                  gm.a((byte) -92);
                  if (1 == var2_int) {
                    break L127;
                  } else {
                    L128: {
                      if (!bg.field_H) {
                        break L128;
                      } else {
                        L129: {
                          L130: {
                            ob.field_y = false;
                            ea.field_k = false;
                            ee.field_G = false;
                            lc.field_e = true;
                            jc.field_d = true;
                            if (ob.field_y) {
                              break L130;
                            } else {
                              q.a(0, false, param0 + -3, 0);
                              if (var15 == 0) {
                                break L129;
                              } else {
                                break L130;
                              }
                            }
                          }
                          ll.field_s = rl.field_e;
                          q.a(11, false, -1, 0);
                          break L129;
                        }
                        ol.b(true);
                        i.field_e[pm.field_T].a(false, 0, -102);
                        bg.field_H = false;
                        vn.c(12);
                        break L128;
                      }
                    }
                    rc.field_n = false;
                    da.field_d = false;
                    if (var15 == 0) {
                      break L125;
                    } else {
                      break L127;
                    }
                  }
                }
                rc.field_n = true;
                da.field_d = true;
                break L125;
              }
              L131: {
                var3 = 0;
                if (var2_int != 2) {
                  break L131;
                } else {
                  var3 = 1;
                  break L131;
                }
              }
              L132: {
                L133: {
                  if (bg.field_H) {
                    break L133;
                  } else {
                    if (rc.field_n) {
                      break L133;
                    } else {
                      if (!da.field_d) {
                        break L132;
                      } else {
                        break L133;
                      }
                    }
                  }
                }
                var3 = 1;
                break L132;
              }
              L134: {
                if (!ri.a(16731221)) {
                  var3 = 0;
                  break L134;
                } else {
                  break L134;
                }
              }
              if (var3 == 0) {
                break L124;
              } else {
                of.a(10);
                break L124;
              }
            } else {
              break L124;
            }
          }
          return;
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              SteelSentinels.j((byte) -10);
              ul.c((byte) -29);
              wd.a(0);
              hf.a(true);
              fj.a((byte) -120);
              rg.c(125);
              gh.a(false);
              i.a((byte) 100);
              uc.a(false);
              ci.a(false);
              am.a(2);
              n.h((byte) -111);
              od.a(false);
              lg.e(48);
              fk.a((byte) -64);
              wc.a(true);
              a.c(72);
              pb.a();
              cm.b(false);
              un.a(false);
              if (param0 >= 22) {
                break L1;
              } else {
                ((SteelSentinels) this).a(48);
                break L1;
              }
            }
            gi.d(-125);
            mm.b(122);
            fl.a(124);
            of.a((byte) 84);
            in.b(127);
            ph.a(80);
            vh.a(-67);
            be.a((byte) -34);
            pa.a((byte) 56);
            ib.a((byte) -119);
            na.a(2);
            im.a((byte) -88);
            wn.a((byte) -126);
            al.b(30);
            he.a(690);
            cj.a(-1);
            nn.b((byte) 30);
            jg.b((byte) -109);
            ng.a((byte) -82);
            ub.a(94);
            ji.h((byte) -104);
            nb.b(750);
            nd.a(-107);
            hh.a(false);
            vk.c((byte) -91);
            cb.b(-1);
            ta.a((byte) -35);
            rj.a(83);
            sg.a((byte) -45);
            jn.a((byte) 79);
            ck.c(4433);
            cd.a(false);
            di.a(-1);
            bi.a((byte) 80);
            ik.b(79);
            lc.b(1);
            o.a(-98);
            dj.a((byte) 94);
            me.a(-118);
            kj.e(true);
            ie.a((byte) -94);
            gj.a(-102);
            tf.a((byte) 26);
            lb.j(0);
            dh.c((byte) 93);
            ve.b((byte) -60);
            ee.g(0);
            nk.d((byte) 20);
            rm.d((byte) -18);
            qj.c(21841);
            jc.e(5370);
            mi.a();
            vf.a(-119);
            jh.a(30706);
            ba.a(false);
            je.a((byte) -110);
            wl.h(31554);
            mb.c((byte) 58);
            hd.b(false);
            ic.a(false);
            uh.c(96);
            hj.e(0);
            ab.a();
            ej.e(-93);
            tb.f();
            sj.b(false);
            hk.d((byte) -65);
            dk.b((byte) -91);
            cc.k(102);
            lj.a((byte) 109);
            jl.a(0);
            vb.a(-1);
            fa.b(38);
            wi.g(573);
            kd.f(8191);
            rd.a(8192);
            eh.b(0);
            ka.f((byte) 127);
            fg.o((byte) -29);
            ki.l((byte) -47);
            bf.m((byte) -111);
            k.n((byte) 107);
            vi.a(false);
            pd.i(-48);
            pm.l(320);
            qc.j(60);
            ll.a(103);
            uj.a(-1);
            uk.c();
            pj.a();
            dg.a((byte) -84);
            ri.d(0);
            tj.a(true);
            ea.a((byte) 66);
            qd.a((byte) 17);
            ne.g(-23261);
            oc.a(-1);
            qi.a(-104);
            ad.a(0);
            id.j(127);
            dn.b(false);
            ql.d((byte) 91);
            dd.a(0);
            td.j(-114);
            oh.a(1);
            m.a(64);
            qm.a((byte) 37);
            te.a((byte) -83);
            ak.a(124);
            gm.a(-1);
            gf.b(-111);
            rb.a((byte) -82);
            en.a(true);
            kk.a((byte) -105);
            pl.c(true);
            ai.e(0);
            dc.a(-38);
            ra.b((byte) 26);
            qh.j(15);
            uf.a(24);
            nf.a(55);
            ol.k(-16);
            qb.h(-185837884);
            ua.a((byte) 115);
            sn.b(0);
            bd.a(-23333);
            og.a((byte) -88);
            la.a((byte) -112);
            an.a((byte) -63);
            f.e(-2);
            qa.h(10);
            rc.a(15598);
            df.i(-58);
            fi.c(2);
            ok.a(true);
            fe.e((byte) 21);
            se.a((byte) -114);
            jd.l(0);
            lf.b();
            jj.b(-123);
            pe.a((byte) -117);
            tm.a(5);
            ec.b((byte) 24);
            fc.a(true);
            sa.a(false);
            pi.b((byte) 61);
            mc.a(23225);
            jk.b((byte) -81);
            gb.a(false);
            oi.a();
            nh.a(-120);
            ni.a(42);
            rl.a(0);
            pf.a(true);
            wa.c(-21121);
            b.a(0);
            qg.b((byte) 105);
            da.a(true);
            lh.c((byte) 19);
            oa.a((byte) -105);
            ug.g(475);
            ac.k((byte) 38);
            bb.h((byte) 127);
            dl.g(-19969);
            qe.a(-31914);
            sh.a(-3274);
            kb.a(5);
            ln.b(0);
            mg.k(-31097);
            co.a((byte) -13);
            oe.a(272);
            mn.g(1);
            ao.g(0);
            nc.a((byte) 127);
            db.a(true);
            vg.a(-61);
            gl.c(0);
            ti.b(65280);
            ed.a((byte) 99);
            vc.b(-13);
            ue.b((byte) -96);
            p.a();
            ce.a((byte) 77);
            bh.a((byte) -98);
            jb.h(-2107133436);
            ig.a((byte) 121);
            qf.a(false);
            mj.d((byte) -72);
            el.b(true);
            ca.c((byte) -73);
            bj.a(7);
            hc.f((byte) 67);
            bc.i((byte) -108);
            jf.d(true);
            gd.l(-12930);
            bk.g(-47);
            ij.a((byte) -42);
            ma.c(false);
            lk.h(-30289);
            ff.h(-3413);
            sb.g(108);
            ia.c((byte) 103);
            wb.a((byte) 87);
            nj.a(false);
            nl.f((byte) -122);
            um.g(32);
            cl.a(5);
            vn.d(false);
            re.l(0);
            ch.a((byte) -68);
            ha.c(true);
            si.a(24);
            ge.b(26);
            g.a(122);
            h.h(0);
            d.h(12);
            q.a((byte) -127);
            hb.a(true);
            bg.g(-1008);
            fm.a(4314);
            le.i(124);
            r.c((byte) -117);
            mf.a();
            va.a(false);
            l.a((byte) 22);
            wh.a((byte) 46);
            kf.d(90);
            tc.a(false);
            hg.a(108);
            ud.d(20000000);
            pc.f(100);
            jm.d(-89);
            kh.b(100);
            bl.a(false);
            ag.b(9);
            li.d(-30874);
            s.a((byte) -86);
            ui.h(-13);
            ah.b(false);
            sl.a(-104);
            hl.e(0);
            cf.a((byte) 9);
            c.a((byte) 127);
            rh.b(false);
            dm.a(-127);
            rf.c(126);
            kc.d(-1341);
            de.a(7);
            fb.b((byte) -119);
            pg.c(28873);
            on.b((byte) -116);
            sf.a(false);
            ml.a(107);
            e.a((byte) -89);
            bm.a((byte) -90);
            aj.d(-1);
            km.a((byte) -27);
            t.a(-13375);
            hm.a((byte) 105);
            ob.d(18601);
            rn.d(3);
            ke.b((byte) 12);
            il.c(-58);
            ei.c(1);
            vm.d((byte) -128);
            ih.c(18384);
            nm.d((byte) 116);
            eb.c(81);
            tk.d((byte) -113);
            ja.a(true);
            vl.a((byte) 29);
            vd.b((byte) 56);
            v.c(true);
            ef.b(8421504);
            ((SteelSentinels) this).field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "SteelSentinels.V(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
