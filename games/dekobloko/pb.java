/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static String[] field_f;
    ji field_g;
    String field_b;
    String field_j;
    int field_h;
    String field_a;
    static vj field_c;
    static String field_k;
    static int field_d;
    static String field_e;
    static gh field_i;

    public static void a(byte param0) {
        if (param0 != 78) {
            pb.a((byte) -103);
        }
        field_f = null;
        field_i = null;
        field_k = null;
        field_e = null;
        field_c = null;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        String var2 = null;
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          var1 = -(45 * (kf.field_G.field_o * kf.field_G.field_o) / 400) + 45;
          hk.a(0, var1 + 435, 640, 28, 16763904, 100);
          hk.a(0, var1 + 435, 640, 0);
          hk.a(0, var1 + 462, 640, 0);
          if (id.field_P == 0) {
            var2 = field_f[0];
            break L0;
          } else {
            if (id.field_P >= 3) {
              if (id.field_P < 7) {
                var2 = cm.a((byte) 83, field_f[2], new String[]{Integer.toString(id.field_P - -1), Integer.toString(8)});
                break L0;
              } else {
                var2 = field_f[3];
                break L0;
              }
            } else {
              var2 = cm.a((byte) 85, field_f[1], new String[]{Integer.toString(id.field_P + 1), Integer.toString(8)});
              break L0;
            }
          }
        }
        fl.a(var1 + 454, 256, 16777215, var2, -(1023 & bb.field_f) + -382, w.field_kb);
        fl.a(var1 + 454, 256, 16777215, var2, -(bb.field_f & 1023) + 642, w.field_kb);
    }

    final static void a(int param0) {
        ck var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ck var9 = null;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        String var14 = null;
        ck var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (le.field_E == null) {
            break L0;
          } else {
            if (!le.field_E.a((byte) 121)) {
              break L0;
            } else {
              if (!le.field_E.a("benefits", (byte) -119)) {
                break L0;
              } else {
                if (eb.field_k == null) {
                  break L0;
                } else {
                  if (!eb.field_k.a((byte) 121)) {
                    break L0;
                  } else {
                    if (!eb.field_k.a("benefits", (byte) 102)) {
                      break L0;
                    } else {
                      dj.field_eb = id.a(le.field_E, "headline", "benefits", 8192);
                      hg.field_a = id.a(le.field_E, "blurbpane", "benefits", 8192);
                      ea.field_l = id.a(le.field_E, "button", "benefits", 8192);
                      pj.field_I = id.a(le.field_E, "signup_text", "benefits", 8192);
                      lf.field_i = id.a(le.field_E, "menu_text", "benefits", 8192);
                      c.field_i = id.a(le.field_E, "button_frame", "benefits", 8192);
                      ge.field_h = id.a(le.field_E, "arrow", "benefits", 8192);
                      aj.field_e = (mm) (Object) cd.a("large_font", eb.field_k, le.field_E, (byte) 114, "benefits");
                      bn.field_g = (mm) (Object) cd.a("small_font", eb.field_k, le.field_E, (byte) 112, "benefits");
                      var28 = hk.field_l;
                      var2 = hk.field_j;
                      var3 = hk.field_i;
                      hk.b(he.field_V);
                      var11 = new ck(4 + ge.field_h.field_I, ge.field_h.field_H - -4);
                      var11.a();
                      ge.field_h.b(2, 2, o.field_d);
                      re.a(2, 1, 0, 2, var11, 0, var11.field_I, var11.field_H);
                      ge.field_h = var11;
                      l.field_b = ge.field_h.e();
                      var12 = new ck(195, 221);
                      var6 = var12.field_I / 2;
                      var12.a();
                      aj.field_e.b(cm.a((byte) 84, af.field_g, new String[]{wf.field_n}), var6, 40, 16777215, -1);
                      bn.field_g.b(cm.a((byte) 90, qi.field_N, new String[]{wf.field_n}), var6, 60, 16777215, -1);
                      aj.field_e.b(cm.a((byte) 126, sa.field_n, new String[]{jm.field_u}), var6, 110, 16777215, -1);
                      bn.field_g.b(cm.a((byte) 94, we.field_c, new String[]{jm.field_u}), var6, 130, 16777215, -1);
                      aj.field_e.b(we.field_a, var6, 180, 16777215, -1);
                      bn.field_g.b(sa.field_A, var6, 200, 16777215, -1);
                      re.a(3, 1, 0, 2, var12, 0, var12.field_I, var12.field_H);
                      hg.field_a.a();
                      var12.c(18 - hg.field_a.field_F, 241 - hg.field_a.field_z);
                      var7 = 0;
                      L1: while (true) {
                        if (var7 >= dl.field_K.length) {
                          dl.field_K = null;
                          oh.field_e = pj.field_I.c();
                          oh.field_e.a();
                          wb.a(31, 0, 2 * hk.field_i / 3, 0, 64, hk.field_j);
                          hk.a(var28, var2, var3);
                          hk.a(he.field_V);
                          le.field_E = null;
                          sk.field_e = 434 - -((-c.field_i.field_I + ea.field_l.field_I) / 2);
                          dm.field_a = (ea.field_l.field_I - c.field_i.field_I) / 2 + 231;
                          dg.field_b = 390 - -((-c.field_i.field_H + ea.field_l.field_H) / 2);
                          sk.field_k = 390 - -((-c.field_i.field_H + ea.field_l.field_H) / 2);
                          break L0;
                        } else {
                          vi.field_z[var7].a();
                          int discarded$3 = bn.field_g.a(dl.field_K[var7], 3, 3, -6 + vi.field_z[var7].field_I, -6 + vi.field_z[var7].field_H, o.field_d, -1, 1, 1, bn.field_g.field_R - -bn.field_g.field_K);
                          re.a(3, 1, 0, 2, vi.field_z[var7], 0, vi.field_z[var7].field_I, vi.field_z[var7].field_H);
                          var7++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (lb.field_h == null) {
          return;
        } else {
          L2: {
            if (wg.field_b == null) {
              break L2;
            } else {
              if (null != aj.field_e) {
                L3: {
                  var29 = hk.field_l;
                  var2 = hk.field_j;
                  var3 = hk.field_i;
                  hk.b(he.field_V);
                  var14 = cm.a((byte) 120, pd.field_b, new String[]{ma.field_H[rb.field_m]});
                  var5 = aj.field_e.b(var14, ce.field_r);
                  var6 = aj.field_e.b(var14, ce.field_r, aj.field_e.field_R + aj.field_e.field_K);
                  var7 = pm.field_d + (-var5 + ce.field_r) / 2;
                  var5 += 6;
                  var8 = qk.field_k - -((nk.field_g - var6) / 2);
                  var7 -= 3;
                  if (0 <= var7) {
                    break L3;
                  } else {
                    var9_int = -var7;
                    var5 = var5 + var9_int * 2;
                    le.field_y = le.field_y - var9_int;
                    pm.field_d = pm.field_d + var9_int;
                    var7 = var7 + var9_int;
                    wg.field_b.field_F = wg.field_b.field_F + var9_int;
                    wg.field_b.field_K = wg.field_b.field_K + 2 * var9_int;
                    break L3;
                  }
                }
                L4: {
                  var8 -= 3;
                  var6 += 6;
                  if (wg.field_b.field_K < var5 + var7) {
                    var9_int = var5 + (var7 - wg.field_b.field_K);
                    le.field_y = le.field_y - var9_int;
                    var7 = var7 + var9_int;
                    pm.field_d = pm.field_d + var9_int;
                    var5 = var5 + 2 * var9_int;
                    wg.field_b.field_K = wg.field_b.field_K + var9_int * 2;
                    wg.field_b.field_F = wg.field_b.field_F + var9_int;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var8 >= 0) {
                    break L5;
                  } else {
                    var9_int = -var8;
                    g.field_Q = g.field_Q - var9_int;
                    var8 = var8 + var9_int;
                    var6 = var6 + var9_int * 2;
                    qk.field_k = qk.field_k + var9_int;
                    wg.field_b.field_C = wg.field_b.field_C + 2 * var9_int;
                    wg.field_b.field_z = wg.field_b.field_z + var9_int;
                    break L5;
                  }
                }
                L6: {
                  if (wg.field_b.field_C < var6 + var8) {
                    var9_int = var8 + (var6 + -wg.field_b.field_C);
                    wg.field_b.field_z = wg.field_b.field_z + var9_int;
                    var6 = var6 + var9_int * 2;
                    wg.field_b.field_C = wg.field_b.field_C + 2 * var9_int;
                    var8 = var8 + var9_int;
                    g.field_Q = g.field_Q - var9_int;
                    qk.field_k = qk.field_k + var9_int;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                wg.field_b.b();
                var9 = new ck(wg.field_b.field_K, wg.field_b.field_C);
                var9.a();
                int discarded$4 = aj.field_e.a(var14, pm.field_d, qk.field_k, ce.field_r, nk.field_g, 16777215, -1, 1, 1, aj.field_e.field_R - -aj.field_e.field_K);
                re.a(3, 1, 0, 2, var9, 0, var9.field_K, var9.field_C);
                wg.field_b.a();
                var9.c(0, 0);
                w.field_qb = new ck(640, 480);
                w.field_qb.a();
                wg.field_b.d((wg.field_b.field_K >> 1) - -le.field_y, (wg.field_b.field_C >> 1) - -g.field_Q, db.field_a, 4096);
                wg.field_b = null;
                w.field_qb.f();
                hk.a(var29, var2, var3);
                hk.a(he.field_V);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L7: {
            if (n.field_b == null) {
              break L7;
            } else {
              if (null != bn.field_g) {
                var30 = hk.field_l;
                var2 = hk.field_j;
                var3 = hk.field_i;
                hk.b(he.field_V);
                var16 = new ck(412, 43);
                var17 = cm.a((byte) 122, df.field_Z, new String[]{n.field_b});
                n.field_b = null;
                var16.a();
                int discarded$5 = bn.field_g.a(var17, 3, 3, var16.field_I - 6, var16.field_H - 6, 16777215, -1, 0, 1, bn.field_g.field_R + bn.field_g.field_K);
                re.a(3, 1, 0, 2, var16, 0, var16.field_I, var16.field_H);
                lb.field_h.a();
                var16.c(-lb.field_h.field_F + 199, -lb.field_h.field_z + 83);
                hk.a(var30, var2, var3);
                hk.a(he.field_V);
                break L7;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (pe.field_d == null) {
              break L8;
            } else {
              if (bn.field_g != null) {
                var31 = hk.field_l;
                var2 = hk.field_j;
                var3 = hk.field_i;
                hk.b(he.field_V);
                var4 = 6 + bn.field_g.b(ka.field_O, 640);
                var5 = 20 + (var4 - -pe.field_d.field_K);
                var6 = -(var5 / 2) + 427;
                var7 = 20 + (var6 - -pe.field_d.field_K);
                lb.field_h.a();
                bn.field_g.a(ka.field_O, var7 - lb.field_h.field_F, bn.field_g.field_K + (bn.field_g.field_R + (-lb.field_h.field_z + 155)), 16777215, -1);
                re.a(3, 1, -lb.field_h.field_F + (var7 + -4), 2, lb.field_h, -lb.field_h.field_z + 155, var4, 50);
                var8 = -lb.field_h.field_z + 155 - (-bn.field_g.field_R + -3 + pe.field_d.field_C + -bn.field_g.field_K) / 2;
                pe.field_d.c(var6 - lb.field_h.field_F, var8);
                hk.a(var31, var2, var3);
                hk.a(he.field_V);
                pe.field_d = null;
                break L8;
              } else {
                break L8;
              }
            }
          }
          L9: {
            hk.b(he.field_V);
            hk.a(16, 16, 608, 112, 15, qn.field_lb, w.field_Fb);
            hk.a(231, 144, 393, 232, 15, qn.field_lb, w.field_Fb);
            if (null == dj.field_eb) {
              break L9;
            } else {
              dj.field_eb.c(0, 0);
              break L9;
            }
          }
          L10: {
            if (null == hg.field_a) {
              break L10;
            } else {
              hg.field_a.c(0, 0);
              break L10;
            }
          }
          L11: {
            lb.field_h.c(0, 0);
            if (null == w.field_qb) {
              break L11;
            } else {
              w.field_qb.c(0, 0);
              break L11;
            }
          }
          L12: {
            if (ea.field_l == null) {
              break L12;
            } else {
              if (null != c.field_i) {
                L13: {
                  ea.field_l.c(231, 390);
                  var1 = pj.field_I;
                  if (rg.field_a.field_h != 0) {
                    break L13;
                  } else {
                    var1 = oh.field_e;
                    break L13;
                  }
                }
                L14: {
                  var1.c(0, 0);
                  stackOut_46_0 = rb.field_b;
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_47_0 = stackOut_46_0;
                  if (0 == rg.field_a.field_h) {
                    stackOut_48_0 = stackIn_48_0;
                    stackOut_48_1 = 4;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    break L14;
                  } else {
                    stackOut_47_0 = stackIn_47_0;
                    stackOut_47_1 = 3;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_49_1 = stackOut_47_1;
                    break L14;
                  }
                }
                L15: {
                  var2 = (h.a(stackIn_49_0 << stackIn_49_1, (byte) -122) * 40 >> 16) + 40;
                  if (var2 > 0) {
                    ea.field_l.f(230, 389, var2);
                    ea.field_l.f(232, 389, var2);
                    ea.field_l.f(232, 391, var2);
                    ea.field_l.f(230, 391, var2);
                    var1.f(1, 1, var2);
                    var1.f(-1, 1, var2);
                    var1.f(1, -1, var2);
                    var1.f(-1, -1, var2);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  stackOut_52_0 = dm.field_a;
                  stackOut_52_1 = sk.field_k;
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  if (rg.field_a.field_h != 0) {
                    stackOut_54_0 = stackIn_54_0;
                    stackOut_54_1 = stackIn_54_1;
                    stackOut_54_2 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    stackIn_55_2 = stackOut_54_2;
                    break L16;
                  } else {
                    stackOut_53_0 = stackIn_53_0;
                    stackOut_53_1 = stackIn_53_1;
                    stackOut_53_2 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    stackIn_55_2 = stackOut_53_2;
                    break L16;
                  }
                }
                ak.a(stackIn_55_0, stackIn_55_1, stackIn_55_2 != 0, 40);
                break L12;
              } else {
                break L12;
              }
            }
          }
          L17: {
            if (null == ea.field_l) {
              break L17;
            } else {
              if (c.field_i == null) {
                break L17;
              } else {
                L18: {
                  ea.field_l.c(434, 390);
                  lf.field_i.c(0, 0);
                  if (rg.field_a.field_h != 1) {
                    break L18;
                  } else {
                    wb.a(31, 436, 7 * ea.field_l.field_H / 12, 392, 64, -4 + ea.field_l.field_I);
                    break L18;
                  }
                }
                L19: {
                  stackOut_60_0 = sk.field_e;
                  stackOut_60_1 = dg.field_b;
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_61_0 = stackOut_60_0;
                  stackIn_61_1 = stackOut_60_1;
                  if (rg.field_a.field_h != 1) {
                    stackOut_62_0 = stackIn_62_0;
                    stackOut_62_1 = stackIn_62_1;
                    stackOut_62_2 = 0;
                    stackIn_63_0 = stackOut_62_0;
                    stackIn_63_1 = stackOut_62_1;
                    stackIn_63_2 = stackOut_62_2;
                    break L19;
                  } else {
                    stackOut_61_0 = stackIn_61_0;
                    stackOut_61_1 = stackIn_61_1;
                    stackOut_61_2 = 1;
                    stackIn_63_0 = stackOut_61_0;
                    stackIn_63_1 = stackOut_61_1;
                    stackIn_63_2 = stackOut_61_2;
                    break L19;
                  }
                }
                ak.a(stackIn_63_0, stackIn_63_1, stackIn_63_2 != 0, 40);
                break L17;
              }
            }
          }
          L20: {
            L21: {
              if (null != ge.field_h) {
                var1_int = -(ge.field_h.field_C / 2) + 357;
                ge.field_h.c(-ge.field_h.field_K + 269, var1_int);
                l.field_b.c(586, var1_int);
                if (var1_int >= pm.field_f) {
                  break L21;
                } else {
                  if (var1_int - -ge.field_h.field_H > pm.field_f) {
                    var2 = (40 * h.a(rb.field_b << 4, (byte) -122) >> 16) + 40;
                    if (0 < var2) {
                      L22: {
                        if (bh.field_g <= 269 + -ge.field_h.field_I) {
                          break L22;
                        } else {
                          if (bh.field_g < 269) {
                            ge.field_h.f(-ge.field_h.field_K + 268, var1_int + -1, var2);
                            ge.field_h.f(1 + (269 - ge.field_h.field_K), -1 + var1_int, var2);
                            ge.field_h.f(-ge.field_h.field_K + 268, 1 + var1_int, var2);
                            ge.field_h.f(-ge.field_h.field_K + 270, var1_int - -1, var2);
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (586 >= bh.field_g) {
                        break L21;
                      } else {
                        if (586 - -ge.field_h.field_I > bh.field_g) {
                          l.field_b.f(585, -1 + var1_int, var2);
                          l.field_b.f(587, -1 + var1_int, var2);
                          l.field_b.f(585, 1 + var1_int, var2);
                          l.field_b.f(587, 1 + var1_int, var2);
                          break L21;
                        } else {
                          hc.a(73);
                          vi.field_z[wh.field_a].c(269, 340);
                          break L20;
                        }
                      }
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            hc.a(73);
            vi.field_z[wh.field_a].c(269, 340);
            break L20;
          }
          return;
        }
    }

    final static void a(ji param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int[] var6 = null;
        int var7 = 0;
        uf var8 = null;
        int var9 = 0;
        uf var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var8 = new uf(param0.a(0, "", "logo.fo3d"));
            var10 = var8;
            var3 = var10.d((byte) -124);
            var10.j((byte) -108);
            l.field_i = rf.a(122, var10);
            df.field_U = new int[var3][];
            jb.field_g = new vg[var3];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.k((byte) -124);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = jb.field_g[var9];
                    var5.a(6, 6, (byte) 31, 6, 1);
                    var5.a(-14200);
                    var6 = new int[]{var5.field_H - -var5.field_f >> 1, var5.field_b + var5.field_n >> 1, var5.field_a + var5.field_i >> 1};
                    df.field_U[var9] = var6;
                    var5.a((byte) -111, -var6[0], -var6[1], -var6[2]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                jb.field_g[var4] = un.a(-128, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("pb.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -2 + ')');
        }
    }

    static {
        field_f = new String[]{"Play Stamina Mode to unlock themes for the multiplayer game!", "<%0> of <%1> themes unlocked for multiplayer - play Stamina Mode to unlock up to 4!", "<%0> of <%1> themes unlocked for multiplayer - play the Master Challenge to unlock the rest!", "All themes unlocked for multiplayer! Can you beat your Stamina and Master Challenge highscores?"};
        field_k = "Try changing the following settings:  ";
        field_c = new vj();
        field_d = 128;
        field_e = "Reload game";
        field_i = new gh(3);
    }
}
