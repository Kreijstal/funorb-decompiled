/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static int field_b;
    static int field_a;
    static kg field_c;

    final static void a(boolean param0, pc param1) {
        if (param0) {
            return;
        }
        try {
            ll.field_e.a(param1.field_v);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, cc param1) {
        cc var2 = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param1.b(4);
              var2 = (cc) ((Object) q.field_m.e(13058));
              if (param0 > 123) {
                break L1;
              } else {
                field_a = -70;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  if (!var2.a(param1, -81)) {
                    break L3;
                  } else {
                    var2 = (cc) ((Object) q.field_m.a((byte) -25));
                    continue L2;
                  }
                }
              }
              L4: {
                if (var2 == null) {
                  q.field_m.a(3, param1);
                  break L4;
                } else {
                  ie.a(var2, 30, param1);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("la.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static void a(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        wk var2_ref_wk = null;
        int var3 = 0;
        wk var4_ref_wk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        wk var10 = null;
        int var11 = 0;
        wk var12 = null;
        String var14 = null;
        wk var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null == ta.field_d) {
                break L1;
              } else {
                if (!ta.field_d.a(true)) {
                  break L1;
                } else {
                  if (!ta.field_d.a("benefits", (byte) 90)) {
                    break L1;
                  } else {
                    if (fb.field_h == null) {
                      break L1;
                    } else {
                      if (!fb.field_h.a(true)) {
                        break L1;
                      } else {
                        if (!fb.field_h.a("benefits", (byte) 90)) {
                          break L1;
                        } else {
                          c.field_o = rl.a(ta.field_d, "benefits", "headline", false);
                          wb.field_i = rl.a(ta.field_d, "benefits", "blurbpane", false);
                          ba.field_e = rl.a(ta.field_d, "benefits", "button", false);
                          da.field_f = rl.a(ta.field_d, "benefits", "signup_text", false);
                          bc.field_pb = rl.a(ta.field_d, "benefits", "menu_text", false);
                          bc.field_ub = rl.a(ta.field_d, "benefits", "button_frame", false);
                          jc.field_b = rl.a(ta.field_d, "benefits", "arrow", false);
                          nn.field_g = (mi) ((Object) vd.a(fb.field_h, "benefits", ta.field_d, -1, "large_font"));
                          wn.field_a = (mi) ((Object) vd.a(fb.field_h, "benefits", ta.field_d, -1, "small_font"));
                          var27 = pb.field_g;
                          var2 = pb.field_c;
                          var3 = pb.field_j;
                          pb.b(ti.field_n);
                          var4_ref_wk = new wk(jc.field_b.field_A - -4, 4 + jc.field_b.field_F);
                          var4_ref_wk.d();
                          jc.field_b.c(2, 2, dc.field_h);
                          uj.a(2, 0, 0, (byte) -19, var4_ref_wk.field_F, 1, var4_ref_wk, var4_ref_wk.field_A);
                          jc.field_b = var4_ref_wk;
                          in.field_e = jc.field_b.a();
                          var12 = new wk(195, 221);
                          var6 = var12.field_A / 2;
                          var12.d();
                          nn.field_g.a(db.a(hg.field_a, -127, new String[]{vb.field_d}), var6, 40, 16777215, -1);
                          wn.field_a.a(db.a(gh.field_Bb, -119, new String[]{vb.field_d}), var6, 60, 16777215, -1);
                          nn.field_g.a(db.a(rn.field_z, -40, new String[]{rg.field_c}), var6, 110, 16777215, -1);
                          wn.field_a.a(db.a(jk.field_f, -25, new String[]{rg.field_c}), var6, 130, 16777215, -1);
                          nn.field_g.a(ol.field_Xb, var6, 180, 16777215, -1);
                          wn.field_a.a(wn.field_c, var6, 200, 16777215, -1);
                          uj.a(3, 0, 0, (byte) -45, var12.field_F, 1, var12, var12.field_A);
                          wb.field_i.d();
                          var12.a(18 + -wb.field_i.field_D, -wb.field_i.field_H + 241);
                          var7 = 0;
                          L2: while (true) {
                            if (ta.field_f.length <= var7) {
                              ta.field_f = null;
                              tf.field_e = da.field_f.g();
                              tf.field_e.d();
                              ej.a(pb.field_j * 2 / 3, 0, pb.field_c, 64, 0, 40);
                              pb.a(var27, var2, var3);
                              pb.a(ti.field_n);
                              mc.field_a = (ba.field_e.field_F + -bc.field_ub.field_F) / 2 + 390;
                              ta.field_d = null;
                              rn.field_u = 434 + (-bc.field_ub.field_A + ba.field_e.field_A) / 2;
                              aj.field_s = 231 - -((-bc.field_ub.field_A + ba.field_e.field_A) / 2);
                              od.field_m = (ba.field_e.field_F - bc.field_ub.field_F) / 2 + 390;
                              break L1;
                            } else {
                              bm.field_R[var7].d();
                              wn.field_a.a(ta.field_f[var7], 3, 3, bm.field_R[var7].field_A + -6, -6 + bm.field_R[var7].field_F, dc.field_h, -1, 1, 1, wn.field_a.field_F + wn.field_a.field_G);
                              uj.a(3, 0, 0, (byte) -79, bm.field_R[var7].field_F, 1, bm.field_R[var7], bm.field_R[var7].field_A);
                              var7++;
                              continue L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (null != jf.field_kb) {
              L3: {
                var1_int = -79 / ((-22 - param0) / 42);
                if (hl.field_r == null) {
                  break L3;
                } else {
                  if (null != nn.field_g) {
                    L4: {
                      var28 = pb.field_g;
                      var3 = pb.field_c;
                      var4 = pb.field_j;
                      pb.b(ti.field_n);
                      var14 = db.a(ee.field_x, -69, new String[]{cm.field_m[wc.field_j]});
                      var6 = nn.field_g.a(var14, pa.field_b);
                      var7 = nn.field_g.a(var14, pa.field_b, nn.field_g.field_G + nn.field_g.field_F);
                      var8 = sg.field_e + (-var6 + pa.field_b) / 2;
                      var9 = ij.field_W + (ci.field_g + -var7) / 2;
                      var8 -= 3;
                      var6 += 6;
                      if (var8 >= 0) {
                        break L4;
                      } else {
                        var10_int = -var8;
                        var8 = var8 + var10_int;
                        sg.field_e = sg.field_e + var10_int;
                        vl.field_t = vl.field_t - var10_int;
                        hl.field_r.field_D = hl.field_r.field_D + var10_int;
                        var6 = var6 + 2 * var10_int;
                        hl.field_r.field_z = hl.field_r.field_z + var10_int * 2;
                        break L4;
                      }
                    }
                    L5: {
                      var7 += 6;
                      var9 -= 3;
                      if (hl.field_r.field_z >= var8 - -var6) {
                        break L5;
                      } else {
                        var10_int = var8 - -var6 - hl.field_r.field_z;
                        hl.field_r.field_D = hl.field_r.field_D + var10_int;
                        var6 = var6 + 2 * var10_int;
                        hl.field_r.field_z = hl.field_r.field_z + var10_int * 2;
                        var8 = var8 + var10_int;
                        sg.field_e = sg.field_e + var10_int;
                        vl.field_t = vl.field_t - var10_int;
                        break L5;
                      }
                    }
                    L6: {
                      if (var9 < 0) {
                        var10_int = -var9;
                        ij.field_W = ij.field_W + var10_int;
                        var9 = var9 + var10_int;
                        hl.field_r.field_B = hl.field_r.field_B + 2 * var10_int;
                        ej.field_y = ej.field_y - var10_int;
                        hl.field_r.field_H = hl.field_r.field_H + var10_int;
                        var7 = var7 + var10_int * 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (var7 + var9 > hl.field_r.field_B) {
                        var10_int = -hl.field_r.field_B + var9 + var7;
                        var9 = var9 + var10_int;
                        hl.field_r.field_B = hl.field_r.field_B + 2 * var10_int;
                        var7 = var7 + 2 * var10_int;
                        hl.field_r.field_H = hl.field_r.field_H + var10_int;
                        ij.field_W = ij.field_W + var10_int;
                        ej.field_y = ej.field_y - var10_int;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    hl.field_r.e();
                    var10 = new wk(hl.field_r.field_z, hl.field_r.field_B);
                    var10.d();
                    nn.field_g.a(var14, sg.field_e, ij.field_W, pa.field_b, ci.field_g, 16777215, -1, 1, 1, nn.field_g.field_F + nn.field_g.field_G);
                    uj.a(3, 0, 0, (byte) -119, var10.field_B, 1, var10, var10.field_z);
                    hl.field_r.d();
                    var10.a(0, 0);
                    fa.field_e = new wk(640, 480);
                    fa.field_e.d();
                    hl.field_r.d((hl.field_r.field_z >> 845598689) - -vl.field_t, (hl.field_r.field_B >> -907871071) + ej.field_y, be.field_e, 4096);
                    hl.field_r = null;
                    fa.field_e.f();
                    pb.a(var28, var3, var4);
                    pb.a(ti.field_n);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                if (ij.field_P == null) {
                  break L8;
                } else {
                  if (null != wn.field_a) {
                    var29 = pb.field_g;
                    var3 = pb.field_c;
                    var4 = pb.field_j;
                    pb.b(ti.field_n);
                    var16 = new wk(412, 43);
                    var6_ref_String = db.a(dd.field_l, -109, new String[]{ij.field_P});
                    ij.field_P = null;
                    var16.d();
                    wn.field_a.a(var6_ref_String, 3, 3, var16.field_A - 6, var16.field_F - 6, 16777215, -1, 0, 1, wn.field_a.field_G + wn.field_a.field_F);
                    uj.a(3, 0, 0, (byte) -42, var16.field_F, 1, var16, var16.field_A);
                    jf.field_kb.d();
                    var16.a(-jf.field_kb.field_D + 199, -jf.field_kb.field_H + 83);
                    pb.a(var29, var3, var4);
                    pb.a(ti.field_n);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (qi.field_i == null) {
                  break L9;
                } else {
                  if (wn.field_a != null) {
                    var30 = pb.field_g;
                    var3 = pb.field_c;
                    var4 = pb.field_j;
                    pb.b(ti.field_n);
                    var5 = wn.field_a.a(ia.field_j, 640) + 6;
                    var6 = 20 + (var5 + qi.field_i.field_z);
                    var7 = 427 - var6 / 2;
                    var8 = qi.field_i.field_z + (var7 + 20);
                    jf.field_kb.d();
                    wn.field_a.b(ia.field_j, -jf.field_kb.field_D + var8, wn.field_a.field_F + wn.field_a.field_G + (155 + -jf.field_kb.field_H), 16777215, -1);
                    uj.a(3, var8 - jf.field_kb.field_D - 4, 155 - jf.field_kb.field_H, (byte) -60, 50, 1, jf.field_kb, var5);
                    var9 = 155 - jf.field_kb.field_H - (-wn.field_a.field_F + (-wn.field_a.field_G + qi.field_i.field_B + -3)) / 2;
                    qi.field_i.a(-jf.field_kb.field_D + var7, var9);
                    pb.a(var30, var3, var4);
                    pb.a(ti.field_n);
                    qi.field_i = null;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                pb.b(ti.field_n);
                pb.a(16, 16, 608, 112, 15, mb.field_bc, an.field_b);
                pb.a(231, 144, 393, 232, 15, mb.field_bc, an.field_b);
                if (c.field_o != null) {
                  c.field_o.a(0, 0);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (null != wb.field_i) {
                  wb.field_i.a(0, 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                jf.field_kb.a(0, 0);
                if (null != fa.field_e) {
                  fa.field_e.a(0, 0);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (null == ba.field_e) {
                  break L13;
                } else {
                  if (null != bc.field_ub) {
                    L14: {
                      ba.field_e.a(231, 390);
                      var2_ref_wk = da.field_f;
                      if (jh.field_i.field_e != 0) {
                        break L14;
                      } else {
                        var2_ref_wk = tf.field_e;
                        break L14;
                      }
                    }
                    L15: {
                      var2_ref_wk.a(0, 0);
                      stackIn_51_0 = 40;

                      stackIn_51_1 = 20612;

                      stackIn_51_2 = ik.field_e;

                      if (0 != jh.field_i.field_e) {
                        stackIn_52_0 = stackIn_51_0;
                        stackIn_52_1 = stackIn_51_1;
                        stackIn_52_2 = stackIn_51_2;
                        stackIn_52_3 = 3;
                        break L15;
                      } else {
                        stackIn_52_0 = stackIn_51_0;
                        stackIn_52_1 = stackIn_51_1;
                        stackIn_52_2 = stackIn_51_2;
                        stackIn_52_3 = 4;
                        break L15;
                      }
                    }
                    L16: {
                      var3 = stackIn_52_0 - -(dd.a(stackIn_52_1, stackIn_52_2 << stackIn_52_3) * 40 >> -1298073968);
                      if ((var3 ^ -1) < -1) {
                        ba.field_e.a(230, 389, var3);
                        ba.field_e.a(232, 389, var3);
                        ba.field_e.a(232, 391, var3);
                        ba.field_e.a(230, 391, var3);
                        var2_ref_wk.a(1, 1, var3);
                        var2_ref_wk.a(-1, 1, var3);
                        var2_ref_wk.a(1, -1, var3);
                        var2_ref_wk.a(-1, -1, var3);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      stackIn_57_0 = mc.field_a;

                      stackIn_57_1 = -28;

                      if (jh.field_i.field_e != 0) {
                        stackIn_58_0 = stackIn_57_0;
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = 0;
                        break L17;
                      } else {
                        stackIn_58_0 = stackIn_57_0;
                        stackIn_58_1 = stackIn_57_1;
                        stackIn_58_2 = 1;
                        break L17;
                      }
                    }
                    sf.a(stackIn_58_0, (byte) stackIn_58_1, stackIn_58_2 != 0, aj.field_s);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L18: {
                if (null == ba.field_e) {
                  break L18;
                } else {
                  if (null != bc.field_ub) {
                    L19: {
                      ba.field_e.a(434, 390);
                      bc.field_pb.a(0, 0);
                      if (jh.field_i.field_e != 1) {
                        break L19;
                      } else {
                        ej.a(ba.field_e.field_F * 7 / 12, 436, ba.field_e.field_A - 4, 64, 392, 40);
                        break L19;
                      }
                    }
                    L20: {
                      stackIn_66_0 = od.field_m;

                      stackIn_66_1 = -3;

                      if (jh.field_i.field_e != 1) {
                        stackIn_67_0 = stackIn_66_0;
                        stackIn_67_1 = stackIn_66_1;
                        stackIn_67_2 = 0;
                        break L20;
                      } else {
                        stackIn_67_0 = stackIn_66_0;
                        stackIn_67_1 = stackIn_66_1;
                        stackIn_67_2 = 1;
                        break L20;
                      }
                    }
                    sf.a(stackIn_67_0, (byte) stackIn_67_1, stackIn_67_2 != 0, rn.field_u);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L21: {
                if (jc.field_b != null) {
                  L22: {
                    var2 = 357 + -(jc.field_b.field_B / 2);
                    jc.field_b.a(-jc.field_b.field_z + 269, var2);
                    in.field_e.a(586, var2);
                    if (pi.field_c <= var2) {
                      break L22;
                    } else {
                      if (pi.field_c >= jc.field_b.field_F + var2) {
                        break L22;
                      } else {
                        var3 = 40 + (dd.a(20612, ik.field_e << 1376546340) * 40 >> 358594544);
                        if (0 >= var3) {
                          break L22;
                        } else {
                          L23: {
                            if (oh.field_f <= -jc.field_b.field_A + 269) {
                              break L23;
                            } else {
                              if (oh.field_f >= 269) {
                                break L23;
                              } else {
                                jc.field_b.a(-1 + -jc.field_b.field_z + 269, -1 + var2, var3);
                                jc.field_b.a(-jc.field_b.field_z + 269 + 1, -1 + var2, var3);
                                jc.field_b.a(-1 + (269 + -jc.field_b.field_z), var2 + 1, var3);
                                jc.field_b.a(269 + -jc.field_b.field_z - -1, 1 + var2, var3);
                                break L22;
                              }
                            }
                          }
                          if ((oh.field_f ^ -1) >= -587) {
                            break L22;
                          } else {
                            if (586 + jc.field_b.field_A > oh.field_f) {
                              in.field_e.a(585, var2 + -1, var3);
                              in.field_e.a(587, var2 + -1, var3);
                              in.field_e.a(585, 1 + var2, var3);
                              in.field_e.a(587, var2 - -1, var3);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                    }
                  }
                  rg.b(30);
                  bm.field_R[lh.field_r].a(269, 340);
                  break L21;
                } else {
                  rg.b(30);
                  bm.field_R[lh.field_r].a(269, 340);
                  break L21;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "la.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        cc var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4 == -32513) {
                break L1;
              } else {
                var8 = (cc) null;
                la.a(126, (cc) null);
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (ck.field_c.length <= var5_int) {
                break L0;
              } else {
                param1 = ck.field_c[var5_int];
                var6 = var5_int << -854919068;
                L3: while (true) {
                  incrementValue$5 = param1;
                  param1--;
                  if (incrementValue$5 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param3 = um.field_bb[incrementValue$6];
                    dupTemp$7 = param0[param3];
                    dupTemp$8 = param2[dupTemp$7];
                    param2[dupTemp$7] = dupTemp$8 + 1;
                    um.field_bb[dupTemp$8] = param3;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("la.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = 124 / ((-23 - param0) / 49);
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_13_3;
        int stackIn_13_4;
        int stackIn_13_5;
        int stackIn_13_6;
        int stackIn_13_7;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        int stackIn_14_6 = 0;
        int stackIn_14_7 = 0;
        int stackIn_14_8 = 0;
        L0: {
          fe.c((byte) 123);
          if (nf.field_b != null) {
            if (he.a((int) nf.field_b.field_Sb[2], false, nf.field_b.field_wc)) {
              stackIn_6_0 = 1;
              break L0;
            } else {
              stackIn_6_0 = 0;
              break L0;
            }
          } else {
            stackIn_6_0 = 0;
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = stackIn_6_0;
            stackIn_9_0 = 15;

            stackIn_9_1 = jj.field_d;

            if (ob.field_y) {
              break L2;
            } else {




              if (!ee.field_G) {
                stackIn_11_0 = stackIn_9_0;
                stackIn_11_1 = stackIn_9_1;
                stackIn_11_2 = 0;
                break L1;
              } else {


                break L2;
              }
            }
          }
          stackIn_11_0 = stackIn_9_0;
          stackIn_11_1 = stackIn_9_1;
          stackIn_11_2 = 1;
          break L1;
        }
        L3: {






          stackIn_13_3 = param0;

          stackIn_13_4 = 0;

          stackIn_13_5 = 72;

          stackIn_13_6 = var2;

          stackIn_13_7 = 11;

          if ((kg.field_Vb ^ -1) >= -51) {



            stackIn_14_3 = stackIn_13_3;
            stackIn_14_4 = stackIn_13_4;
            stackIn_14_5 = stackIn_13_5;
            stackIn_14_6 = stackIn_13_6;
            stackIn_14_7 = stackIn_13_7;
            stackIn_14_8 = 0;
            break L3;
          } else {



            stackIn_14_3 = stackIn_13_3;
            stackIn_14_4 = stackIn_13_4;
            stackIn_14_5 = stackIn_13_5;
            stackIn_14_6 = stackIn_13_6;
            stackIn_14_7 = stackIn_13_7;
            stackIn_14_8 = 1;
            break L3;
          }
        }
        L4: {
          bl.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0, stackIn_14_3, stackIn_14_4, stackIn_14_5, stackIn_14_6 != 0, stackIn_14_7, stackIn_14_8 != 0, 14, param1, true);
          if (qb.field_J) {
            mm.field_g.a(57, (byte) -117);
            qb.field_J = false;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (of.field_c) {
            mm.field_g.a(10, (byte) -117);
            of.field_c = false;
            break L5;
          } else {
            break L5;
          }
        }
    }

    static {
        field_a = -1;
        field_b = 200;
    }
}
