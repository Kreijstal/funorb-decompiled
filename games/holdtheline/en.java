/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static uf field_e;
    static int field_b;
    static String field_c;
    static String field_d;
    static int field_a;

    final static void a(byte param0) {
        hj var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        hj var9 = null;
        int var10 = 0;
        hj var11 = null;
        hj var12 = null;
        String var14 = null;
        hj var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        L0: {
          var10 = HoldTheLine.field_D;
          if (be.field_i == null) {
            break L0;
          } else {
            if (!be.field_i.b((byte) -123)) {
              break L0;
            } else {
              if (!be.field_i.b("benefits", 108)) {
                break L0;
              } else {
                if (null == n.field_w) {
                  break L0;
                } else {
                  if (!n.field_w.b((byte) -95)) {
                    break L0;
                  } else {
                    if (n.field_w.b("benefits", -114)) {
                      oa.field_s = dl.a(be.field_i, "benefits", false, "headline");
                      im.field_k = dl.a(be.field_i, "benefits", false, "blurbpane");
                      eg.field_c = dl.a(be.field_i, "benefits", false, "button");
                      hl.field_d = dl.a(be.field_i, "benefits", false, "signup_text");
                      mn.field_c = dl.a(be.field_i, "benefits", false, "menu_text");
                      nc.field_h = dl.a(be.field_i, "benefits", false, "button_frame");
                      nl.field_i = dl.a(be.field_i, "benefits", false, "arrow");
                      tk.field_a = (qi) (Object) ch.a("benefits", n.field_w, 14819, be.field_i, "large_font");
                      an.field_e = (qi) (Object) ch.a("benefits", n.field_w, 14819, be.field_i, "small_font");
                      var28 = tc.field_b;
                      var2 = tc.field_j;
                      var3 = tc.field_c;
                      tc.b(bd.field_R);
                      var11 = new hj(nl.field_i.field_s + 4, 4 + nl.field_i.field_y);
                      var11.f();
                      nl.field_i.c(2, 2, t.field_n);
                      int discarded$23 = -24983;
                      int discarded$24 = 1;
                      fh.a(2, var11.field_y, var11.field_s, var11, 0, 0);
                      nl.field_i = var11;
                      oh.field_m = nl.field_i.d();
                      var12 = new hj(195, 221);
                      var6 = var12.field_s / 2;
                      var12.f();
                      int discarded$25 = 1;
                      tk.field_a.b(sd.a(cc.field_v, new String[1]), var6, 40, 16777215, -1);
                      int discarded$26 = 1;
                      an.field_e.b(sd.a(fb.field_l, new String[1]), var6, 60, 16777215, -1);
                      int discarded$27 = 1;
                      tk.field_a.b(sd.a(jd.field_I, new String[1]), var6, 110, 16777215, -1);
                      int discarded$28 = 1;
                      an.field_e.b(sd.a(va.field_b, new String[1]), var6, 130, 16777215, -1);
                      tk.field_a.b(jg.field_q, var6, 180, 16777215, -1);
                      an.field_e.b(fi.field_jb, var6, 200, 16777215, -1);
                      int discarded$29 = -24983;
                      int discarded$30 = 1;
                      fh.a(3, var12.field_y, var12.field_s, var12, 0, 0);
                      im.field_k.f();
                      var12.a(-im.field_k.field_u + 18, 241 - im.field_k.field_x);
                      var7 = 0;
                      L1: while (true) {
                        if (~qh.field_b.length >= ~var7) {
                          qh.field_b = null;
                          ek.field_m = hl.field_d.e();
                          ek.field_m.f();
                          int discarded$31 = 64;
                          mk.a(255, tc.field_j, 2 * tc.field_c / 3, 0, 0);
                          tc.a(var28, var2, var3);
                          tc.a(bd.field_R);
                          qm.field_b = (eg.field_c.field_s + -nc.field_h.field_s) / 2 + 231;
                          pk.field_L = 390 + (eg.field_c.field_y + -nc.field_h.field_y) / 2;
                          vg.field_J = 434 - -((-nc.field_h.field_s + eg.field_c.field_s) / 2);
                          be.field_i = null;
                          le.field_t = (eg.field_c.field_y - nc.field_h.field_y) / 2 + 390;
                          break L0;
                        } else {
                          lf.field_a[var7].f();
                          int discarded$32 = an.field_e.a(qh.field_b[var7], 3, 3, lf.field_a[var7].field_s - 6, -6 + lf.field_a[var7].field_y, t.field_n, -1, 1, 1, an.field_e.field_I + an.field_e.field_G);
                          int discarded$33 = -24983;
                          int discarded$34 = 1;
                          fh.a(3, lf.field_a[var7].field_y, lf.field_a[var7].field_s, lf.field_a[var7], 0, 0);
                          var7++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        if (lf.field_e != null) {
          L2: {
            if (null == wn.field_a) {
              break L2;
            } else {
              if (null != tk.field_a) {
                L3: {
                  var29 = tc.field_b;
                  var2 = tc.field_j;
                  var3 = tc.field_c;
                  tc.b(bd.field_R);
                  int discarded$35 = 1;
                  var14 = sd.a(ek.field_d, new String[1]);
                  var5 = tk.field_a.b(var14, vb.field_d);
                  var6 = tk.field_a.b(var14, vb.field_d, tk.field_a.field_G + tk.field_a.field_I);
                  var7 = ih.field_m - -((vb.field_d + -var5) / 2);
                  var8 = cd.field_b + (-var6 + mj.field_a) / 2;
                  var7 -= 3;
                  var5 += 6;
                  var6 += 6;
                  if (var7 < 0) {
                    var9_int = -var7;
                    ih.field_m = ih.field_m + var9_int;
                    fh.field_e = fh.field_e - var9_int;
                    var5 = var5 + 2 * var9_int;
                    wn.field_a.field_u = wn.field_a.field_u + var9_int;
                    wn.field_a.field_o = wn.field_a.field_o + var9_int * 2;
                    var7 = var7 + var9_int;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var8 -= 3;
                  if (wn.field_a.field_o >= var7 - -var5) {
                    break L4;
                  } else {
                    var9_int = var5 + var7 - wn.field_a.field_o;
                    var7 = var7 + var9_int;
                    fh.field_e = fh.field_e - var9_int;
                    var5 = var5 + 2 * var9_int;
                    ih.field_m = ih.field_m + var9_int;
                    wn.field_a.field_u = wn.field_a.field_u + var9_int;
                    wn.field_a.field_o = wn.field_a.field_o + var9_int * 2;
                    break L4;
                  }
                }
                L5: {
                  if (var8 >= 0) {
                    break L5;
                  } else {
                    var9_int = -var8;
                    bj.field_G = bj.field_G - var9_int;
                    var8 = var8 + var9_int;
                    wn.field_a.field_x = wn.field_a.field_x + var9_int;
                    wn.field_a.field_v = wn.field_a.field_v + 2 * var9_int;
                    var6 = var6 + var9_int * 2;
                    cd.field_b = cd.field_b + var9_int;
                    break L5;
                  }
                }
                L6: {
                  if (wn.field_a.field_v < var8 - -var6) {
                    var9_int = var8 + var6 + -wn.field_a.field_v;
                    bj.field_G = bj.field_G - var9_int;
                    cd.field_b = cd.field_b + var9_int;
                    wn.field_a.field_v = wn.field_a.field_v + 2 * var9_int;
                    var8 = var8 + var9_int;
                    wn.field_a.field_x = wn.field_a.field_x + var9_int;
                    var6 = var6 + var9_int * 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                wn.field_a.a();
                var9 = new hj(wn.field_a.field_o, wn.field_a.field_v);
                var9.f();
                int discarded$36 = tk.field_a.a(var14, ih.field_m, cd.field_b, vb.field_d, mj.field_a, 16777215, -1, 1, 1, tk.field_a.field_I + tk.field_a.field_G);
                int discarded$37 = -24983;
                int discarded$38 = 1;
                fh.a(3, var9.field_v, var9.field_o, var9, 0, 0);
                wn.field_a.f();
                var9.a(0, 0);
                na.field_t = new hj(640, 480);
                na.field_t.f();
                wn.field_a.b((wn.field_a.field_o >> 1) - -fh.field_e, bj.field_G + (wn.field_a.field_v >> 1), bd.field_W, 4096);
                wn.field_a = null;
                na.field_t.c();
                tc.a(var29, var2, var3);
                tc.a(bd.field_R);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L7: {
            if (dl.field_j == null) {
              break L7;
            } else {
              if (an.field_e == null) {
                break L7;
              } else {
                var30 = tc.field_b;
                var2 = tc.field_j;
                var3 = tc.field_c;
                tc.b(bd.field_R);
                var16 = new hj(412, 43);
                int discarded$39 = 1;
                var17 = sd.a(gk.field_a, new String[1]);
                dl.field_j = null;
                var16.f();
                int discarded$40 = an.field_e.a(var17, 3, 3, var16.field_s + -6, -6 + var16.field_y, 16777215, -1, 0, 1, an.field_e.field_G + an.field_e.field_I);
                int discarded$41 = -24983;
                int discarded$42 = 1;
                fh.a(3, var16.field_y, var16.field_s, var16, 0, 0);
                lf.field_e.f();
                var16.a(199 - lf.field_e.field_u, 83 + -lf.field_e.field_x);
                tc.a(var30, var2, var3);
                tc.a(bd.field_R);
                break L7;
              }
            }
          }
          L8: {
            if (gm.field_b == null) {
              break L8;
            } else {
              if (null != an.field_e) {
                var31 = tc.field_b;
                var2 = tc.field_j;
                var3 = tc.field_c;
                tc.b(bd.field_R);
                var4 = an.field_e.b(jb.field_S, 640) - -6;
                var5 = gm.field_b.field_o + var4 - -20;
                var6 = 427 + -(var5 / 2);
                var7 = var6 + (gm.field_b.field_o + 20);
                lf.field_e.f();
                an.field_e.a(jb.field_S, -lf.field_e.field_u + var7, an.field_e.field_I + (an.field_e.field_G + 155 - lf.field_e.field_x), 16777215, -1);
                int discarded$43 = -24983;
                int discarded$44 = 1;
                fh.a(3, 50, var4, lf.field_e, 155 + -lf.field_e.field_x, -lf.field_e.field_u + (var7 + -4));
                var8 = -((-3 + gm.field_b.field_v + (-an.field_e.field_G + -an.field_e.field_I)) / 2) + -lf.field_e.field_x + 155;
                gm.field_b.a(-lf.field_e.field_u + var6, var8);
                tc.a(var31, var2, var3);
                tc.a(bd.field_R);
                gm.field_b = null;
                break L8;
              } else {
                break L8;
              }
            }
          }
          L9: {
            tc.b(bd.field_R);
            tc.a(16, 16, 608, 112, 15, ol.field_g, qe.field_b);
            tc.a(231, 144, 393, 232, 15, ol.field_g, qe.field_b);
            if (param0 > 25) {
              break L9;
            } else {
              en.a((byte) -48);
              break L9;
            }
          }
          L10: {
            if (oa.field_s != null) {
              oa.field_s.a(0, 0);
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (null != im.field_k) {
              im.field_k.a(0, 0);
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            lf.field_e.a(0, 0);
            if (null != na.field_t) {
              na.field_t.a(0, 0);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (null == eg.field_c) {
              break L13;
            } else {
              if (nc.field_h != null) {
                L14: {
                  eg.field_c.a(231, 390);
                  var1 = hl.field_d;
                  if (ln.field_k.field_g == 0) {
                    var1 = ek.field_m;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var1.a(0, 0);
                  stackOut_51_0 = io.field_b;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_52_0 = stackOut_51_0;
                  if (ln.field_k.field_g == 0) {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = 4;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L15;
                  } else {
                    stackOut_52_0 = stackIn_52_0;
                    stackOut_52_1 = 3;
                    stackIn_54_0 = stackOut_52_0;
                    stackIn_54_1 = stackOut_52_1;
                    break L15;
                  }
                }
                L16: {
                  var2 = (oe.a(stackIn_54_0 << stackIn_54_1, 2) * 40 >> 16) + 40;
                  if (var2 > 0) {
                    eg.field_c.b(230, 389, var2);
                    eg.field_c.b(232, 389, var2);
                    eg.field_c.b(232, 391, var2);
                    eg.field_c.b(230, 391, var2);
                    var1.b(1, 1, var2);
                    var1.b(-1, 1, var2);
                    var1.b(1, -1, var2);
                    var1.b(-1, -1, var2);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  stackOut_57_0 = 80;
                  stackOut_57_1 = qm.field_b;
                  stackOut_57_2 = pk.field_L;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  stackIn_59_2 = stackOut_57_2;
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  stackIn_58_2 = stackOut_57_2;
                  if (ln.field_k.field_g != 0) {
                    stackOut_59_0 = stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = stackIn_59_2;
                    stackOut_59_3 = 0;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    stackIn_60_3 = stackOut_59_3;
                    break L17;
                  } else {
                    stackOut_58_0 = stackIn_58_0;
                    stackOut_58_1 = stackIn_58_1;
                    stackOut_58_2 = stackIn_58_2;
                    stackOut_58_3 = 1;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_60_1 = stackOut_58_1;
                    stackIn_60_2 = stackOut_58_2;
                    stackIn_60_3 = stackOut_58_3;
                    break L17;
                  }
                }
                b.a(stackIn_60_0, stackIn_60_1, stackIn_60_2, stackIn_60_3 != 0);
                break L13;
              } else {
                break L13;
              }
            }
          }
          L18: {
            if (eg.field_c == null) {
              break L18;
            } else {
              if (null == nc.field_h) {
                break L18;
              } else {
                L19: {
                  eg.field_c.a(434, 390);
                  mn.field_c.a(0, 0);
                  if (1 == ln.field_k.field_g) {
                    int discarded$45 = 64;
                    mk.a(255, eg.field_c.field_s + -4, 7 * eg.field_c.field_y / 12, 392, 436);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  stackOut_66_0 = 80;
                  stackOut_66_1 = vg.field_J;
                  stackOut_66_2 = le.field_t;
                  stackIn_68_0 = stackOut_66_0;
                  stackIn_68_1 = stackOut_66_1;
                  stackIn_68_2 = stackOut_66_2;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  if (ln.field_k.field_g != 1) {
                    stackOut_68_0 = stackIn_68_0;
                    stackOut_68_1 = stackIn_68_1;
                    stackOut_68_2 = stackIn_68_2;
                    stackOut_68_3 = 0;
                    stackIn_69_0 = stackOut_68_0;
                    stackIn_69_1 = stackOut_68_1;
                    stackIn_69_2 = stackOut_68_2;
                    stackIn_69_3 = stackOut_68_3;
                    break L20;
                  } else {
                    stackOut_67_0 = stackIn_67_0;
                    stackOut_67_1 = stackIn_67_1;
                    stackOut_67_2 = stackIn_67_2;
                    stackOut_67_3 = 1;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_69_2 = stackOut_67_2;
                    stackIn_69_3 = stackOut_67_3;
                    break L20;
                  }
                }
                b.a(stackIn_69_0, stackIn_69_1, stackIn_69_2, stackIn_69_3 != 0);
                break L18;
              }
            }
          }
          L21: {
            L22: {
              if (nl.field_i != null) {
                var1_int = 357 + -(nl.field_i.field_v / 2);
                nl.field_i.a(269 - nl.field_i.field_o, var1_int);
                oh.field_m.a(586, var1_int);
                if (rf.field_X <= var1_int) {
                  break L22;
                } else {
                  if (nl.field_i.field_y + var1_int <= rf.field_X) {
                    break L22;
                  } else {
                    var2 = (oe.a(io.field_b << 4, 2) * 40 >> 16) + 40;
                    if (var2 > 0) {
                      L23: {
                        if (~nc.field_g >= ~(269 - nl.field_i.field_s)) {
                          break L23;
                        } else {
                          if (nc.field_g < 269) {
                            nl.field_i.b(-1 + (269 + -nl.field_i.field_o), -1 + var1_int, var2);
                            nl.field_i.b(1 + (269 - nl.field_i.field_o), var1_int + -1, var2);
                            nl.field_i.b(-1 + (269 + -nl.field_i.field_o), 1 + var1_int, var2);
                            nl.field_i.b(269 + (-nl.field_i.field_o + 1), 1 + var1_int, var2);
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (nc.field_g <= 586) {
                        break L22;
                      } else {
                        if (nc.field_g < 586 - -nl.field_i.field_s) {
                          oh.field_m.b(585, -1 + var1_int, var2);
                          oh.field_m.b(587, -1 + var1_int, var2);
                          oh.field_m.b(585, 1 + var1_int, var2);
                          oh.field_m.b(587, var1_int - -1, var2);
                          break L22;
                        } else {
                          uk.a(3979);
                          lf.field_a[va.field_e].a(269, 340);
                          break L21;
                        }
                      }
                    } else {
                      break L22;
                    }
                  }
                }
              } else {
                break L22;
              }
            }
            uk.a(3979);
            lf.field_a[va.field_e].a(269, 340);
            break L21;
          }
          return;
        } else {
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (tf.field_n != null) {
                jd.field_J = -1;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("en.focusLost(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
            if (!(tf.field_n == null)) {
                var2_int = param0.getKeyChar();
                if (var2_int != 0) {
                    if (65535 != var2_int) {
                        if (!(!um.a(0, (char) var2_int))) {
                            var3 = 1 + lj.field_b & 127;
                            if (!(var3 == vj.field_l)) {
                                p.field_a[lj.field_b] = -1;
                                d.field_b[lj.field_b] = (char)var2_int;
                                lj.field_b = var3;
                            }
                        }
                    }
                }
            }
            param0.consume();
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "en.keyTyped(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$4 = 0;
            int discarded$5 = -28;
            stackOut_0_0 = cf.a(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("en.A(").append(12260).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != -1) {
            field_b = -90;
        }
        field_e = null;
        field_d = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (tf.field_n == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    cb.field_j = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (qj.field_N.length > var2_int) {
                        var2_int = qj.field_N[var2_int];
                        if ((var2_int & 128) != -1) {
                          var2_int = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                L4: {
                  if (-1 > jd.field_J) {
                    break L4;
                  } else {
                    if (var2_int < 0) {
                      break L4;
                    } else {
                      na.field_r[jd.field_J] = var2_int;
                      jd.field_J = 1 + jd.field_J & 127;
                      if (jd.field_J != th.field_j) {
                        break L4;
                      } else {
                        jd.field_J = -1;
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 > var2_int) {
                    break L5;
                  } else {
                    var3 = 127 & 1 + lj.field_b;
                    if (var3 != vj.field_l) {
                      p.field_a[lj.field_b] = var2_int;
                      d.field_b[lj.field_b] = ' ';
                      lj.field_b = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var3 = param0.getModifiers();
                  if ((10 & var3) != 0) {
                    break L6;
                  } else {
                    if (var2_int == 85) {
                      break L6;
                    } else {
                      if (10 != var2_int) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("en.keyPressed(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static void a() {
        tm.field_c = 20000000L;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (tf.field_n == null) {
                break L1;
              } else {
                L2: {
                  L3: {
                    cb.field_j = 0;
                    var2_int = param0.getKeyCode();
                    if (var2_int < 0) {
                      break L3;
                    } else {
                      if (var2_int >= qj.field_N.length) {
                        break L3;
                      } else {
                        var2_int = -129 & qj.field_N[var2_int];
                        break L2;
                      }
                    }
                  }
                  var2_int = -1;
                  break L2;
                }
                if (jd.field_J < 0) {
                  break L1;
                } else {
                  if (var2_int >= 0) {
                    na.field_r[jd.field_J] = ~var2_int;
                    jd.field_J = jd.field_J + 1 & 127;
                    if (jd.field_J == th.field_j) {
                      jd.field_J = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            param0.consume();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("en.keyReleased(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final static java.applet.Applet a(int param0) {
        if (null != ne.field_b) {
            return ne.field_b;
        }
        if (param0 < 72) {
            field_e = null;
        }
        return (java.applet.Applet) (Object) vf.field_j;
    }

    final static void a(int param0, hd[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (var3_int >= param2) {
                break L0;
              } else {
                b.a(param1, (byte) 96, var3_int);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("en.B(").append(5433).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<img=2>";
        field_d = "Type your password again to make sure it's correct";
    }
}
