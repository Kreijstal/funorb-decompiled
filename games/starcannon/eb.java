/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static String field_e;
    static String field_g;
    static int field_c;
    static boolean field_f;
    static ge field_a;
    static hl[] field_b;
    static String[] field_d;

    final static void a(int param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        hl var2_ref_hl = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        hl var9 = null;
        int var10 = 0;
        hl var11 = null;
        hl var12 = null;
        String var14 = null;
        hl var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (g.field_a == null) {
                break L1;
              } else {
                if (!g.field_a.b((byte) 106)) {
                  break L1;
                } else {
                  if (!g.field_a.a("benefits", -9883)) {
                    break L1;
                  } else {
                    if (null == pf.field_a) {
                      break L1;
                    } else {
                      if (!pf.field_a.b((byte) 110)) {
                        break L1;
                      } else {
                        if (!pf.field_a.a("benefits", -9883)) {
                          break L1;
                        } else {
                          ed.field_k = vk.a("benefits", 32, "headline", g.field_a);
                          cf.field_q = vk.a("benefits", 86, "blurbpane", g.field_a);
                          pc.field_a = vk.a("benefits", 106, "button", g.field_a);
                          re.field_f = vk.a("benefits", 17, "signup_text", g.field_a);
                          ui.field_z = vk.a("benefits", 71, "menu_text", g.field_a);
                          bg.field_c = vk.a("benefits", 32, "button_frame", g.field_a);
                          ge.field_b = vk.a("benefits", 123, "arrow", g.field_a);
                          gi.field_b = (qe) ((Object) od.a("benefits", g.field_a, "large_font", -1, pf.field_a));
                          ah.field_d = (qe) ((Object) od.a("benefits", g.field_a, "small_font", -1, pf.field_a));
                          var28 = ki.field_a;
                          var2 = ki.field_j;
                          var3 = ki.field_f;
                          ki.a(wc.field_b);
                          var11 = new hl(4 + ge.field_b.field_u, 4 + ge.field_b.field_v);
                          var11.e();
                          ge.field_b.c(2, 2, mc.field_c);
                          hh.a(0, 0, 2, var11.field_v, false, 1, var11, var11.field_u);
                          ge.field_b = var11;
                          ma.field_b = ge.field_b.g();
                          var12 = new hl(195, 221);
                          var6 = var12.field_u / 2;
                          var12.e();
                          gi.field_b.b(fb.a(ra.field_x, -103, new String[]{t.field_q}), var6, 40, 16777215, -1);
                          ah.field_d.b(fb.a(ic.field_c, 118, new String[]{t.field_q}), var6, 60, 16777215, -1);
                          gi.field_b.b(fb.a(vk.field_t, 118, new String[]{ii.field_c}), var6, 110, 16777215, -1);
                          ah.field_d.b(fb.a(vg.field_a, -15, new String[]{ii.field_c}), var6, 130, 16777215, -1);
                          gi.field_b.b(be.field_a, var6, 180, 16777215, -1);
                          ah.field_d.b(lj.field_a, var6, 200, 16777215, -1);
                          hh.a(0, 0, 3, var12.field_v, false, 1, var12, var12.field_u);
                          cf.field_q.e();
                          var12.e(18 - cf.field_q.field_w, -cf.field_q.field_y + 241);
                          var7 = 0;
                          L2: while (true) {
                            if (var7 >= va.field_t.length) {
                              va.field_t = null;
                              jh.field_a = re.field_f.c();
                              jh.field_a.e();
                              rh.a(0, ki.field_j, 2 * ki.field_f / 3, 0, 64, true);
                              ki.a(var28, var2, var3);
                              ki.b(wc.field_b);
                              mf.field_d = (-bg.field_c.field_v + pc.field_a.field_v) / 2 + 390;
                              nh.field_f = (-bg.field_c.field_u + pc.field_a.field_u) / 2 + 231;
                              g.field_a = null;
                              qf.field_e = (-bg.field_c.field_u + pc.field_a.field_u) / 2 + 434;
                              lf.field_Z = (-bg.field_c.field_v + pc.field_a.field_v) / 2 + 390;
                              break L1;
                            } else {
                              pa.field_I[var7].e();
                              discarded$3 = ah.field_d.a(va.field_t[var7], 3, 3, pa.field_I[var7].field_u - 6, pa.field_I[var7].field_v + -6, mc.field_c, -1, 1, 1, ah.field_d.field_p - -ah.field_d.field_q);
                              hh.a(0, 0, 3, pa.field_I[var7].field_v, false, 1, pa.field_I[var7], pa.field_I[var7].field_u);
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
            if (ba.field_c != null) {
              L3: {
                if (re.field_l == null) {
                  break L3;
                } else {
                  if (null != gi.field_b) {
                    L4: {
                      var29 = ki.field_a;
                      var2 = ki.field_j;
                      var3 = ki.field_f;
                      ki.a(wc.field_b);
                      var14 = fb.a(u.field_a, 114, new String[]{kc.field_N[fc.field_c]});
                      var5 = gi.field_b.c(var14, nd.field_k);
                      var6 = gi.field_b.a(var14, nd.field_k, gi.field_b.field_p + gi.field_b.field_q);
                      var7 = cb.field_f - -((nd.field_k - var5) / 2);
                      var5 += 6;
                      var7 -= 3;
                      var8 = ue.field_e - -((td.field_p + -var6) / 2);
                      var6 += 6;
                      if (-1 < (var7 ^ -1)) {
                        var9_int = -var7;
                        w.field_v = w.field_v - var9_int;
                        re.field_l.field_x = re.field_l.field_x + var9_int * 2;
                        re.field_l.field_w = re.field_l.field_w + var9_int;
                        cb.field_f = cb.field_f + var9_int;
                        var5 = var5 + var9_int * 2;
                        var7 = var7 + var9_int;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var8 -= 3;
                      if (var5 + var7 <= re.field_l.field_x) {
                        break L5;
                      } else {
                        var9_int = var7 + var5 - re.field_l.field_x;
                        var5 = var5 + var9_int * 2;
                        cb.field_f = cb.field_f + var9_int;
                        w.field_v = w.field_v - var9_int;
                        var7 = var7 + var9_int;
                        re.field_l.field_w = re.field_l.field_w + var9_int;
                        re.field_l.field_x = re.field_l.field_x + var9_int * 2;
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 >= (var8 ^ -1)) {
                        break L6;
                      } else {
                        var9_int = -var8;
                        ue.field_e = ue.field_e + var9_int;
                        re.field_l.field_y = re.field_l.field_y + var9_int;
                        var8 = var8 + var9_int;
                        re.field_l.field_q = re.field_l.field_q + 2 * var9_int;
                        var6 = var6 + 2 * var9_int;
                        gi.field_e = gi.field_e - var9_int;
                        break L6;
                      }
                    }
                    L7: {
                      if (re.field_l.field_q < var8 - -var6) {
                        var9_int = -re.field_l.field_q + var6 + var8;
                        var8 = var8 + var9_int;
                        var6 = var6 + var9_int * 2;
                        re.field_l.field_y = re.field_l.field_y + var9_int;
                        re.field_l.field_q = re.field_l.field_q + 2 * var9_int;
                        ue.field_e = ue.field_e + var9_int;
                        gi.field_e = gi.field_e - var9_int;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    re.field_l.f();
                    var9 = new hl(re.field_l.field_x, re.field_l.field_q);
                    var9.e();
                    discarded$4 = gi.field_b.a(var14, cb.field_f, ue.field_e, nd.field_k, td.field_p, 16777215, -1, 1, 1, gi.field_b.field_q + gi.field_b.field_p);
                    hh.a(0, 0, 3, var9.field_q, false, 1, var9, var9.field_x);
                    re.field_l.e();
                    var9.e(0, 0);
                    lh.field_N = new hl(640, 480);
                    lh.field_N.e();
                    re.field_l.b((re.field_l.field_x >> 1722382017) - -w.field_v, (re.field_l.field_q >> -358143967) - -gi.field_e, eh.field_h, 4096);
                    re.field_l = null;
                    lh.field_N.d();
                    ki.a(var29, var2, var3);
                    ki.b(wc.field_b);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L8: {
                if (ik.field_q == null) {
                  break L8;
                } else {
                  if (null == ah.field_d) {
                    break L8;
                  } else {
                    var30 = ki.field_a;
                    var2 = ki.field_j;
                    var3 = ki.field_f;
                    ki.a(wc.field_b);
                    var16 = new hl(412, 43);
                    var17 = fb.a(jh.field_f, -115, new String[]{ik.field_q});
                    ik.field_q = null;
                    var16.e();
                    discarded$5 = ah.field_d.a(var17, 3, 3, var16.field_u - 6, var16.field_v + -6, 16777215, -1, 0, 1, ah.field_d.field_q + ah.field_d.field_p);
                    hh.a(0, 0, 3, var16.field_v, false, 1, var16, var16.field_u);
                    ba.field_c.e();
                    var16.e(-ba.field_c.field_w + 199, 83 - ba.field_c.field_y);
                    ki.a(var30, var2, var3);
                    ki.b(wc.field_b);
                    break L8;
                  }
                }
              }
              L9: {
                if (null == ja.field_e) {
                  break L9;
                } else {
                  if (null == ah.field_d) {
                    break L9;
                  } else {
                    var31 = ki.field_a;
                    var2 = ki.field_j;
                    var3 = ki.field_f;
                    ki.a(wc.field_b);
                    var4 = ah.field_d.c(se.field_t, 640) - -6;
                    var5 = 20 + (ja.field_e.field_x + var4);
                    var6 = 427 - var5 / 2;
                    var7 = 20 + (var6 - -ja.field_e.field_x);
                    ba.field_c.e();
                    ah.field_d.a(se.field_t, -ba.field_c.field_w + var7, ah.field_d.field_q + ah.field_d.field_p + (155 - ba.field_c.field_y), 16777215, -1);
                    hh.a(-4 + (var7 - ba.field_c.field_w), 155 - ba.field_c.field_y, 3, 50, false, 1, ba.field_c, var4);
                    var8 = 155 - (ba.field_c.field_y - -((-ah.field_d.field_q + (ja.field_e.field_q + (-3 + -ah.field_d.field_p))) / 2));
                    ja.field_e.e(var6 - ba.field_c.field_w, var8);
                    ki.a(var31, var2, var3);
                    ki.b(wc.field_b);
                    ja.field_e = null;
                    break L9;
                  }
                }
              }
              L10: {
                ki.a(wc.field_b);
                ki.a(16, 16, 608, 112, 15, jk.field_l, nh.field_i);
                ki.a(231, 144, 393, 232, 15, jk.field_l, nh.field_i);
                var1_int = -21 % ((param0 - 30) / 35);
                if (ed.field_k == null) {
                  break L10;
                } else {
                  ed.field_k.e(0, 0);
                  break L10;
                }
              }
              L11: {
                if (null != cf.field_q) {
                  cf.field_q.e(0, 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                ba.field_c.e(0, 0);
                if (null == lh.field_N) {
                  break L12;
                } else {
                  lh.field_N.e(0, 0);
                  break L12;
                }
              }
              L13: {
                if (pc.field_a == null) {
                  break L13;
                } else {
                  if (null != bg.field_c) {
                    L14: {
                      pc.field_a.e(231, 390);
                      var2_ref_hl = re.field_f;
                      if (0 == ea.field_a.field_k) {
                        var2_ref_hl = jh.field_a;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      var2_ref_hl.e(0, 0);
                      stackOut_46_0 = 40;
                      stackOut_46_1 = fk.field_a;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      if (ea.field_a.field_k != 0) {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 3;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        break L15;
                      } else {
                        stackOut_47_0 = stackIn_47_0;
                        stackOut_47_1 = stackIn_47_1;
                        stackOut_47_2 = 4;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        break L15;
                      }
                    }
                    L16: {
                      var3 = (stackIn_49_0 * ti.b(stackIn_49_1 << stackIn_49_2, 2047) >> 1375649648) + 40;
                      if ((var3 ^ -1) >= -1) {
                        break L16;
                      } else {
                        pc.field_a.f(230, 389, var3);
                        pc.field_a.f(232, 389, var3);
                        pc.field_a.f(232, 391, var3);
                        pc.field_a.f(230, 391, var3);
                        var2_ref_hl.f(1, 1, var3);
                        var2_ref_hl.f(-1, 1, var3);
                        var2_ref_hl.f(1, -1, var3);
                        var2_ref_hl.f(-1, -1, var3);
                        break L16;
                      }
                    }
                    L17: {
                      stackOut_51_0 = 112;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_52_0 = stackOut_51_0;
                      if (0 != ea.field_a.field_k) {
                        stackOut_53_0 = stackIn_53_0;
                        stackOut_53_1 = 0;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        break L17;
                      } else {
                        stackOut_52_0 = stackIn_52_0;
                        stackOut_52_1 = 1;
                        stackIn_54_0 = stackOut_52_0;
                        stackIn_54_1 = stackOut_52_1;
                        break L17;
                      }
                    }
                    m.a((byte) stackIn_54_0, stackIn_54_1 != 0, nh.field_f, lf.field_Z);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L18: {
                if (pc.field_a == null) {
                  break L18;
                } else {
                  if (null == bg.field_c) {
                    break L18;
                  } else {
                    L19: {
                      pc.field_a.e(434, 390);
                      ui.field_z.e(0, 0);
                      if ((ea.field_a.field_k ^ -1) != -2) {
                        break L19;
                      } else {
                        rh.a(392, -4 + pc.field_a.field_u, 7 * pc.field_a.field_v / 12, 436, 64, true);
                        break L19;
                      }
                    }
                    L20: {
                      stackOut_59_0 = 112;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_60_0 = stackOut_59_0;
                      if (-2 != (ea.field_a.field_k ^ -1)) {
                        stackOut_61_0 = stackIn_61_0;
                        stackOut_61_1 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        break L20;
                      } else {
                        stackOut_60_0 = stackIn_60_0;
                        stackOut_60_1 = 1;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        break L20;
                      }
                    }
                    m.a((byte) stackIn_62_0, stackIn_62_1 != 0, qf.field_e, mf.field_d);
                    break L18;
                  }
                }
              }
              L21: {
                if (ge.field_b != null) {
                  L22: {
                    var2 = -(ge.field_b.field_q / 2) + 357;
                    ge.field_b.e(-ge.field_b.field_x + 269, var2);
                    ma.field_b.e(586, var2);
                    if (var2 >= la.field_c) {
                      break L22;
                    } else {
                      if (ge.field_b.field_v + var2 <= la.field_c) {
                        break L22;
                      } else {
                        var3 = (ti.b(fk.field_a << 753824260, 2047) * 40 >> 1825530160) + 40;
                        if (0 >= var3) {
                          break L22;
                        } else {
                          L23: {
                            if (269 - ge.field_b.field_u >= pe.field_d) {
                              break L23;
                            } else {
                              if (-270 >= (pe.field_d ^ -1)) {
                                break L23;
                              } else {
                                ge.field_b.f(-1 + (-ge.field_b.field_x + 269), var2 + -1, var3);
                                ge.field_b.f(1 + (269 - ge.field_b.field_x), -1 + var2, var3);
                                ge.field_b.f(-ge.field_b.field_x + 268, var2 - -1, var3);
                                ge.field_b.f(269 + -ge.field_b.field_x - -1, var2 + 1, var3);
                                break L22;
                              }
                            }
                          }
                          if (pe.field_d <= 586) {
                            break L22;
                          } else {
                            if (ge.field_b.field_u + 586 <= pe.field_d) {
                              break L22;
                            } else {
                              ma.field_b.f(585, var2 + -1, var3);
                              ma.field_b.f(587, var2 + -1, var3);
                              ma.field_b.f(585, var2 + 1, var3);
                              ma.field_b.f(587, 1 + var2, var3);
                              break L22;
                            }
                          }
                        }
                      }
                    }
                  }
                  ab.e(-67);
                  pa.field_I[ag.field_o].e(269, 340);
                  break L21;
                } else {
                  ab.e(-67);
                  pa.field_I[ag.field_o].e(269, 340);
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
          throw sd.a((Throwable) ((Object) var1), "eb.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_g = null;
        field_b = null;
        if (!param0) {
            eb.a(-99);
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_g = "Passwords must be between 5 and 20 characters long";
        field_b = new hl[14];
        field_e = "ESC    Pause and Options";
        field_d = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_a = new ge();
    }
}
