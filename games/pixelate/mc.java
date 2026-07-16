/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mc extends fa {
    boolean field_p;
    int field_s;
    int[] field_l;
    static rp field_r;
    static String field_t;
    static String field_n;
    static int field_m;
    static cb field_k;
    static String field_o;
    static long field_q;

    final static dd a(Random param0, int param1, boolean param2, int param3, int param4) {
        tg.field_f = param0;
        ib var12 = vg.a((byte) 96, param3);
        rk var6 = param2 ? rb.b(param3, (byte) 73) : ga.a(param3, 10);
        int var7 = el.a(param3, (byte) -24);
        if (param4 >= -31) {
            return null;
        }
        int var8 = cf.a(false, param3);
        int var9 = hq.a((byte) 124, param3);
        hh[] var10 = mi.a(var12.field_d, param1, var12.field_j, 20);
        dd var11 = new dd(var12.field_j, var12.field_d, var7, var6.field_a, var6.field_b, var6.field_c, var9, var8, var10);
        var11.a((byte) 58, tg.field_f);
        return var11;
    }

    final static void e(int param0) {
        tf var1_ref_tf = null;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        tf var9 = null;
        int var10 = 0;
        Object var11 = null;
        tf var12 = null;
        tf var13 = null;
        String var15 = null;
        tf var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        L0: {
          var10 = Pixelate.field_H ? 1 : 0;
          if (pb.field_n == null) {
            break L0;
          } else {
            if (!pb.field_n.b(-3)) {
              break L0;
            } else {
              if (!pb.field_n.a("benefits", -1)) {
                break L0;
              } else {
                if (kf.field_p == null) {
                  break L0;
                } else {
                  if (!kf.field_p.b(param0 + -15)) {
                    break L0;
                  } else {
                    if (kf.field_p.a("benefits", -1)) {
                      go.field_i = bi.a("benefits", "headline", pb.field_n, (byte) -79);
                      jc.field_a = bi.a("benefits", "blurbpane", pb.field_n, (byte) -97);
                      wo.field_c = bi.a("benefits", "button", pb.field_n, (byte) -57);
                      ro.field_b = bi.a("benefits", "signup_text", pb.field_n, (byte) -119);
                      ka.field_P = bi.a("benefits", "menu_text", pb.field_n, (byte) -20);
                      jh.field_O = bi.a("benefits", "button_frame", pb.field_n, (byte) -63);
                      gp.field_Kb = bi.a("benefits", "arrow", pb.field_n, (byte) -125);
                      kc.field_r = (jl) (Object) bf.a(0, kf.field_p, "large_font", pb.field_n, "benefits");
                      qe.field_A = (jl) (Object) bf.a(0, kf.field_p, "small_font", pb.field_n, "benefits");
                      var28 = t.field_k;
                      var2 = t.field_j;
                      var3 = t.field_d;
                      t.a(wi.field_f);
                      var12 = new tf(4 + gp.field_Kb.field_F, gp.field_Kb.field_E - -4);
                      var12.c();
                      gp.field_Kb.c(2, 2, ug.field_k);
                      de.a(0, 0, 1, var12, var12.field_F, -1, 2, var12.field_E);
                      gp.field_Kb = var12;
                      hf.field_m = gp.field_Kb.e();
                      var13 = new tf(195, 221);
                      var6 = var13.field_F / 2;
                      var13.c();
                      kc.field_r.b(sd.a(vi.field_s, param0 + 24, new String[1]), var6, 40, 16777215, -1);
                      qe.field_A.b(sd.a(kf.field_n, 76, new String[1]), var6, 60, 16777215, -1);
                      kc.field_r.b(sd.a(ab.field_d, 73, new String[1]), var6, 110, 16777215, -1);
                      qe.field_A.b(sd.a(kk.field_l, 44, new String[1]), var6, 130, 16777215, -1);
                      kc.field_r.b(ng.field_w, var6, 180, 16777215, -1);
                      qe.field_A.b(ri.field_d, var6, 200, 16777215, -1);
                      de.a(0, 0, 1, var13, var13.field_F, -1, 3, var13.field_E);
                      jc.field_a.c();
                      var13.b(-jc.field_a.field_D + 18, 241 - jc.field_a.field_y);
                      var7 = 0;
                      L1: while (true) {
                        if (tm.field_S.length <= var7) {
                          tm.field_S = null;
                          ph.field_n = ro.field_b.a();
                          ph.field_n.c();
                          nh.a(t.field_d * 2 / 3, 64, 0, 0, 126, t.field_j);
                          t.a(var28, var2, var3);
                          t.b(wi.field_f);
                          pb.field_n = null;
                          ll.field_a = (wo.field_c.field_F + -jh.field_O.field_F) / 2 + 434;
                          bn.field_Q = (wo.field_c.field_E - jh.field_O.field_E) / 2 + 390;
                          ui.field_b = (wo.field_c.field_E - jh.field_O.field_E) / 2 + 390;
                          sd.field_K = 231 + (wo.field_c.field_F + -jh.field_O.field_F) / 2;
                          break L0;
                        } else {
                          li.field_a[var7].c();
                          int discarded$8 = qe.field_A.a(tm.field_S[var7], 3, 3, -6 + li.field_a[var7].field_F, li.field_a[var7].field_E + -6, ug.field_k, -1, 1, 1, qe.field_A.field_z + qe.field_A.field_w);
                          de.a(0, 0, 1, li.field_a[var7], li.field_a[var7].field_F, -1, 3, li.field_a[var7].field_E);
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
        if (qf.field_c != null) {
          L2: {
            if (null == mk.field_d) {
              break L2;
            } else {
              if (null == kc.field_r) {
                break L2;
              } else {
                L3: {
                  var29 = t.field_k;
                  var2 = t.field_j;
                  var3 = t.field_d;
                  t.a(wi.field_f);
                  var15 = sd.a(jm.field_p, 93, new String[1]);
                  var5 = kc.field_r.a(var15, mp.field_f);
                  var6 = kc.field_r.a(var15, mp.field_f, kc.field_r.field_w + kc.field_r.field_z);
                  var7 = (mp.field_f + -var5) / 2 + bl.field_c;
                  var5 += 6;
                  var8 = (vp.field_Lb - var6) / 2 + cl.field_d;
                  var7 -= 3;
                  if (0 > var7) {
                    var9_int = -var7;
                    var5 = var5 + var9_int * 2;
                    mk.field_d.field_D = mk.field_d.field_D + var9_int;
                    r.field_a = r.field_a - var9_int;
                    bl.field_c = bl.field_c + var9_int;
                    var7 = var7 + var9_int;
                    mk.field_d.field_A = mk.field_d.field_A + var9_int * 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var6 += 6;
                  var8 -= 3;
                  if ((var7 + var5 ^ -1) < (mk.field_d.field_A ^ -1)) {
                    var9_int = -mk.field_d.field_A + (var7 + var5);
                    bl.field_c = bl.field_c + var9_int;
                    mk.field_d.field_A = mk.field_d.field_A + 2 * var9_int;
                    mk.field_d.field_D = mk.field_d.field_D + var9_int;
                    var5 = var5 + var9_int * 2;
                    var7 = var7 + var9_int;
                    r.field_a = r.field_a - var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (0 <= var8) {
                    break L5;
                  } else {
                    var9_int = -var8;
                    var8 = var8 + var9_int;
                    i.field_l = i.field_l - var9_int;
                    var6 = var6 + 2 * var9_int;
                    cl.field_d = cl.field_d + var9_int;
                    mk.field_d.field_y = mk.field_d.field_y + var9_int;
                    mk.field_d.field_B = mk.field_d.field_B + var9_int * 2;
                    break L5;
                  }
                }
                L6: {
                  if (mk.field_d.field_B < var8 + var6) {
                    var9_int = -mk.field_d.field_B + var8 - -var6;
                    var6 = var6 + var9_int * 2;
                    cl.field_d = cl.field_d + var9_int;
                    var8 = var8 + var9_int;
                    mk.field_d.field_B = mk.field_d.field_B + var9_int * 2;
                    i.field_l = i.field_l - var9_int;
                    mk.field_d.field_y = mk.field_d.field_y + var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                mk.field_d.d();
                var9 = new tf(mk.field_d.field_A, mk.field_d.field_B);
                var9.c();
                int discarded$9 = kc.field_r.a(var15, bl.field_c, cl.field_d, mp.field_f, vp.field_Lb, 16777215, -1, 1, 1, kc.field_r.field_w - -kc.field_r.field_z);
                de.a(0, 0, 1, var9, var9.field_A, -1, 3, var9.field_B);
                mk.field_d.c();
                var9.b(0, 0);
                ni.field_m = new tf(640, 480);
                ni.field_m.c();
                mk.field_d.b((mk.field_d.field_A >> -323168735) - -r.field_a, i.field_l + (mk.field_d.field_B >> 117774081), aq.field_a, 4096);
                mk.field_d = null;
                ni.field_m.f();
                t.a(var29, var2, var3);
                t.b(wi.field_f);
                break L2;
              }
            }
          }
          L7: {
            if (fa.field_i == null) {
              break L7;
            } else {
              if (qe.field_A != null) {
                var30 = t.field_k;
                var2 = t.field_j;
                var3 = t.field_d;
                t.a(wi.field_f);
                var17 = new tf(412, 43);
                var5_ref_String = sd.a(dk.field_f, param0 + 18, new String[1]);
                fa.field_i = null;
                var17.c();
                int discarded$10 = qe.field_A.a(var5_ref_String, 3, 3, var17.field_F + -6, -6 + var17.field_E, 16777215, -1, 0, 1, qe.field_A.field_w - -qe.field_A.field_z);
                de.a(0, 0, 1, var17, var17.field_F, -1, 3, var17.field_E);
                qf.field_c.c();
                var17.b(199 - qf.field_c.field_D, -qf.field_c.field_y + 83);
                t.a(var30, var2, var3);
                t.b(wi.field_f);
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (null == jf.field_a) {
              break L8;
            } else {
              if (qe.field_A == null) {
                break L8;
              } else {
                var31 = t.field_k;
                var2 = t.field_j;
                var3 = t.field_d;
                t.a(wi.field_f);
                var4 = 6 + qe.field_A.a(ri.field_i, 640);
                var5 = jf.field_a.field_A + var4 - -20;
                var6 = 427 + -(var5 / 2);
                var7 = var6 - (-jf.field_a.field_A - 20);
                qf.field_c.c();
                qe.field_A.a(ri.field_i, -qf.field_c.field_D + var7, 155 - qf.field_c.field_y + qe.field_A.field_w + qe.field_A.field_z, 16777215, -1);
                de.a(-qf.field_c.field_D + (var7 - 4), 155 + -qf.field_c.field_y, 1, qf.field_c, var4, -1, 3, 50);
                var8 = 155 + -qf.field_c.field_y + -((-qe.field_A.field_z + -qe.field_A.field_w + (-3 + jf.field_a.field_B)) / 2);
                jf.field_a.b(var6 - qf.field_c.field_D, var8);
                t.a(var31, var2, var3);
                t.b(wi.field_f);
                jf.field_a = null;
                break L8;
              }
            }
          }
          L9: {
            t.a(wi.field_f);
            t.a(16, 16, 608, 112, 15, in.field_t, gq.field_n);
            t.a(231, 144, 393, 232, 15, in.field_t, gq.field_n);
            if (go.field_i != null) {
              go.field_i.b(0, 0);
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (jc.field_a == null) {
              break L10;
            } else {
              jc.field_a.b(0, 0);
              break L10;
            }
          }
          L11: {
            if (param0 == 12) {
              break L11;
            } else {
              var11 = null;
              dd discarded$11 = mc.a((Random) null, 44, true, 73, 110);
              break L11;
            }
          }
          L12: {
            qf.field_c.b(0, 0);
            if (ni.field_m == null) {
              break L12;
            } else {
              ni.field_m.b(0, 0);
              break L12;
            }
          }
          L13: {
            if (null == wo.field_c) {
              break L13;
            } else {
              if (jh.field_O == null) {
                break L13;
              } else {
                L14: {
                  wo.field_c.b(231, 390);
                  var1_ref_tf = ro.field_b;
                  if (a.field_I.field_j == 0) {
                    var1_ref_tf = ph.field_n;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  var1_ref_tf.b(0, 0);
                  stackOut_48_0 = 40;
                  stackOut_48_1 = qk.field_e;
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  if (a.field_I.field_j == 0) {
                    stackOut_50_0 = stackIn_50_0;
                    stackOut_50_1 = stackIn_50_1;
                    stackOut_50_2 = 4;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    stackIn_51_2 = stackOut_50_2;
                    break L15;
                  } else {
                    stackOut_49_0 = stackIn_49_0;
                    stackOut_49_1 = stackIn_49_1;
                    stackOut_49_2 = 3;
                    stackIn_51_0 = stackOut_49_0;
                    stackIn_51_1 = stackOut_49_1;
                    stackIn_51_2 = stackOut_49_2;
                    break L15;
                  }
                }
                L16: {
                  var2 = stackIn_51_0 + (wd.b(stackIn_51_1 << stackIn_51_2, 0) * 40 >> 817279632);
                  if (var2 > 0) {
                    wo.field_c.b(230, 389, var2);
                    wo.field_c.b(232, 389, var2);
                    wo.field_c.b(232, 391, var2);
                    wo.field_c.b(230, 391, var2);
                    var1_ref_tf.b(1, 1, var2);
                    var1_ref_tf.b(-1, 1, var2);
                    var1_ref_tf.b(1, -1, var2);
                    var1_ref_tf.b(-1, -1, var2);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  stackOut_54_0 = ui.field_b;
                  stackOut_54_1 = sd.field_K;
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  if (-1 != (a.field_I.field_j ^ -1)) {
                    stackOut_56_0 = stackIn_56_0;
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    break L17;
                  } else {
                    stackOut_55_0 = stackIn_55_0;
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_57_2 = stackOut_55_2;
                    break L17;
                  }
                }
                r.a(stackIn_57_0, stackIn_57_1, stackIn_57_2 != 0, param0 ^ -44);
                break L13;
              }
            }
          }
          L18: {
            if (wo.field_c == null) {
              break L18;
            } else {
              if (jh.field_O == null) {
                break L18;
              } else {
                L19: {
                  wo.field_c.b(434, 390);
                  ka.field_P.b(0, 0);
                  if ((a.field_I.field_j ^ -1) == -2) {
                    nh.a(wo.field_c.field_E * 7 / 12, 64, 436, 392, 121, wo.field_c.field_F - 4);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  stackOut_63_0 = bn.field_Q;
                  stackOut_63_1 = ll.field_a;
                  stackIn_65_0 = stackOut_63_0;
                  stackIn_65_1 = stackOut_63_1;
                  stackIn_64_0 = stackOut_63_0;
                  stackIn_64_1 = stackOut_63_1;
                  if (a.field_I.field_j != 1) {
                    stackOut_65_0 = stackIn_65_0;
                    stackOut_65_1 = stackIn_65_1;
                    stackOut_65_2 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    stackIn_66_1 = stackOut_65_1;
                    stackIn_66_2 = stackOut_65_2;
                    break L20;
                  } else {
                    stackOut_64_0 = stackIn_64_0;
                    stackOut_64_1 = stackIn_64_1;
                    stackOut_64_2 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_66_2 = stackOut_64_2;
                    break L20;
                  }
                }
                r.a(stackIn_66_0, stackIn_66_1, stackIn_66_2 != 0, -40);
                break L18;
              }
            }
          }
          L21: {
            L22: {
              if (gp.field_Kb != null) {
                var1 = 357 + -(gp.field_Kb.field_B / 2);
                gp.field_Kb.b(-gp.field_Kb.field_A + 269, var1);
                hf.field_m.b(586, var1);
                if ((bg.field_k ^ -1) >= (var1 ^ -1)) {
                  break L22;
                } else {
                  if (gp.field_Kb.field_E + var1 <= bg.field_k) {
                    break L22;
                  } else {
                    var2 = (40 * wd.b(qk.field_e << -775784028, 0) >> -1356770544) + 40;
                    if (-1 <= (var2 ^ -1)) {
                      break L22;
                    } else {
                      L23: {
                        if (uf.field_d <= -gp.field_Kb.field_F + 269) {
                          break L23;
                        } else {
                          if ((uf.field_d ^ -1) > -270) {
                            gp.field_Kb.b(269 - (gp.field_Kb.field_A + 1), var1 + -1, var2);
                            gp.field_Kb.b(269 + (-gp.field_Kb.field_A - -1), var1 - 1, var2);
                            gp.field_Kb.b(268 - gp.field_Kb.field_A, var1 - -1, var2);
                            gp.field_Kb.b(1 + (-gp.field_Kb.field_A + 269), 1 + var1, var2);
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      if (uf.field_d <= 586) {
                        break L22;
                      } else {
                        if (gp.field_Kb.field_F + 586 > uf.field_d) {
                          hf.field_m.b(585, -1 + var1, var2);
                          hf.field_m.b(587, -1 + var1, var2);
                          hf.field_m.b(585, 1 + var1, var2);
                          hf.field_m.b(587, var1 + 1, var2);
                          break L22;
                        } else {
                          no.e(param0 + -19320);
                          li.field_a[ae.field_b].b(269, 340);
                          break L21;
                        }
                      }
                    }
                  }
                }
              } else {
                break L22;
              }
            }
            no.e(param0 + -19320);
            li.field_a[ae.field_b].b(269, 340);
            break L21;
          }
          return;
        } else {
          return;
        }
    }

    final static pp a(int param0, int param1) {
        if (po.field_b.i(0) >= 5) {
            return null;
        }
        if (param1 >= -117) {
            pp discarded$0 = mc.a(17, -35);
        }
        ln var2 = new ln(param0);
        po.field_b.a(22125, (fa) (Object) var2);
        return var2.field_o;
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != -1) {
            field_n = null;
        }
        field_o = null;
        field_r = null;
        field_t = null;
        field_n = null;
    }

    mc() {
        ((mc) this).field_p = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new rp();
        field_t = "Please enter your age in years";
        field_n = "Private";
        field_o = "Updates will sent to the email address you've given";
        field_m = 0;
    }
}
