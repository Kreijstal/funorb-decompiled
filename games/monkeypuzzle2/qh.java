/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[] field_c;
    static le[] field_a;
    static int field_b;

    final static void a(int param0, boolean param1) {
        gb.field_f = param0;
        if (!param1) {
            Object var3 = null;
            int discarded$0 = qh.a(-59, (aj) null, -21, false, (aj) null, 19, (String) null);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (we.field_n != null) {
            mg.field_s = 0;
            b.field_k = -1;
            dh.field_b = -1;
            oh.field_b = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == we.field_n)) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != we.field_n) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(we.field_n == null)) {
            mg.field_s = 0;
            b.field_k = param0.getX();
            dh.field_b = param0.getY();
            oh.field_b = true;
        }
    }

    final static int a(int param0, aj param1, int param2, boolean param3, aj param4, int param5, String param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        gk stackIn_16_0 = null;
        gk stackIn_17_0 = null;
        gk stackIn_18_0 = null;
        String stackIn_18_1 = null;
        gk stackIn_19_0 = null;
        gk stackIn_20_0 = null;
        gk stackIn_21_0 = null;
        String stackIn_21_1 = null;
        gk stackOut_15_0 = null;
        gk stackOut_17_0 = null;
        String stackOut_17_1 = null;
        gk stackOut_16_0 = null;
        String stackOut_16_1 = null;
        gk stackOut_18_0 = null;
        gk stackOut_20_0 = null;
        String stackOut_20_1 = null;
        gk stackOut_19_0 = null;
        String stackOut_19_1 = null;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param2 == -1) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          var14 = param4.a((byte) -93);
          var11_ref = var14;
          var11_ref = var14;
          var8 = param1.a((byte) -77);
          var11_ref = var8;
          var11_ref = var8;
          if (null == ol.field_g) {
            if (!cb.a(-123, false)) {
              return -1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (ii.field_r == dk.field_h) {
            L3: {
              kc.field_b = null;
              gf.field_c.field_h = 0;
              if (param6 == null) {
                L4: {
                  uc.field_a.field_h = 0;
                  uc.field_a.a(-803539344, pi.field_l.nextInt());
                  uc.field_a.a(-803539344, pi.field_l.nextInt());
                  stackOut_15_0 = uc.field_a;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (!param4.b(0)) {
                    stackOut_17_0 = (gk) (Object) stackIn_17_0;
                    stackOut_17_1 = "";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L4;
                  } else {
                    stackOut_16_0 = (gk) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) var14;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L4;
                  }
                }
                L5: {
                  ((gk) (Object) stackIn_18_0).a(stackIn_18_1, -84);
                  stackOut_18_0 = uc.field_a;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (!param1.b(0)) {
                    stackOut_20_0 = (gk) (Object) stackIn_20_0;
                    stackOut_20_1 = "";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L5;
                  } else {
                    stackOut_19_0 = (gk) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) var8;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L5;
                  }
                }
                ((gk) (Object) stackIn_21_0).a(stackIn_21_1, 116);
                gf.field_c.b(16, param2 + -49151);
                gf.field_c.field_h = gf.field_c.field_h + 1;
                var9 = gf.field_c.field_h;
                e.a(sd.field_a, fj.field_F, (byte) 113, (gk) (Object) gf.field_c, uc.field_a);
                gf.field_c.a(gf.field_c.field_h + -var9, (byte) -114);
                break L3;
              } else {
                L6: {
                  var9 = 0;
                  uc.field_a.field_h = 0;
                  if (!param3) {
                    break L6;
                  } else {
                    var9 = var9 | 1;
                    break L6;
                  }
                }
                L7: {
                  uc.field_a.a(-803539344, pi.field_l.nextInt());
                  uc.field_a.a(param2 ^ 803539343, pi.field_l.nextInt());
                  uc.field_a.a(var14, param2 ^ 103);
                  uc.field_a.a(var8, -64);
                  var15 = (CharSequence) (Object) param6;
                  uc.field_a.a(q.a(var15, 20), 122);
                  uc.field_a.c(param0, 127);
                  uc.field_a.b(param5, param2 + -49151);
                  uc.field_a.b(var9, -49152);
                  gf.field_c.b(18, param2 + -49151);
                  gf.field_c.field_h = gf.field_c.field_h + 2;
                  var10 = gf.field_c.field_h;
                  var11_ref = lc.a(ii.a(false), (byte) -89);
                  if (var11_ref != null) {
                    break L7;
                  } else {
                    var11_ref = "";
                    break L7;
                  }
                }
                gf.field_c.a(param2 + 69, var11_ref);
                e.a(sd.field_a, fj.field_F, (byte) -112, (gk) (Object) gf.field_c, uc.field_a);
                gf.field_c.d(6903, gf.field_c.field_h - var10);
                break L3;
              }
            }
            al.a((byte) -71, -1);
            dk.field_h = vd.field_e;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (vd.field_e == dk.field_h) {
            if (hj.a(1, true)) {
              L9: {
                var9 = MonkeyPuzzle2.field_D.a((byte) 114);
                MonkeyPuzzle2.field_D.field_h = 0;
                if (var9 < 100) {
                  break L9;
                } else {
                  if (105 >= var9) {
                    cm.field_E = new String[-100 + var9];
                    dk.field_h = MonkeyPuzzle2.field_C;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (var9 != -249) {
                if (-100 == var9) {
                  boolean discarded$1 = hj.a(gb.a((byte) 57), true);
                  kc.field_b = new Boolean(bi.a((byte) 122, (gk) (Object) MonkeyPuzzle2.field_D));
                  MonkeyPuzzle2.field_D.field_h = 0;
                  break L8;
                } else {
                  dk.field_h = ma.field_d;
                  rc.field_f = -1;
                  wk.field_a = var9;
                  break L8;
                }
              } else {
                nh.a((byte) 99, ii.a(false));
                sl.field_n = sb.field_q;
                gk.a(-1);
                ck.field_e = false;
                return var9;
              }
            } else {
              break L8;
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (MonkeyPuzzle2.field_C != dk.field_h) {
            break L10;
          } else {
            var9 = 2;
            if (hj.a(var9, true)) {
              var10 = MonkeyPuzzle2.field_D.j(17277);
              MonkeyPuzzle2.field_D.field_h = 0;
              if (hj.a(var10, true)) {
                var11 = cm.field_E.length;
                var12 = 0;
                L11: while (true) {
                  if (var11 <= var12) {
                    gk.a(-1);
                    ck.field_e = false;
                    return 100 + var11;
                  } else {
                    cm.field_E[var12] = MonkeyPuzzle2.field_D.b((byte) 93);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (dk.field_h == ma.field_d) {
            if (!gb.a(true)) {
              break L12;
            } else {
              L13: {
                if ((wk.field_a ^ -1) != -256) {
                  sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                  break L13;
                } else {
                  var9_ref = MonkeyPuzzle2.field_D.g(-1185292952);
                  if (var9_ref == null) {
                    break L13;
                  } else {
                    pe.a(var9_ref, (byte) -108, ii.a(false));
                    break L13;
                  }
                }
              }
              gk.a(param2 ^ 0);
              ck.field_e = false;
              return wk.field_a;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (ol.field_g == null) {
            if (!ck.field_e) {
              var9 = cg.field_g;
              cg.field_g = id.field_m;
              ck.field_e = true;
              id.field_m = var9;
              break L14;
            } else {
              L15: {
                if (wf.a(114) > 30000L) {
                  sl.field_n = kj.field_E;
                  break L15;
                } else {
                  sl.field_n = hh.field_p;
                  break L15;
                }
              }
              ck.field_e = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    final static void a(hl param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L1: while (true) {
              if (ea.field_c <= var2) {
                ek.field_d[param0.a(2147483647)] = ek.field_d[param0.a(2147483647)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (ea.field_c <= var3) {
                    L3: {
                      ea.field_c = var2;
                      if (param1 == 6191) {
                        break L3;
                      } else {
                        field_b = -73;
                        break L3;
                      }
                    }
                    ea.field_c = ea.field_c + 1;
                    pg.field_e[ea.field_c] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_i == pg.field_e[var3].field_i) {
                        var4 = pg.field_e[var3].a(2147483647);
                        if (uj.field_g >= ek.field_d[var4]) {
                          break L4;
                        } else {
                          ek.field_d[var4] = ek.field_d[var4] - 1;
                          var3++;
                          continue L2;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    pg.field_e[var2] = pg.field_e[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (pg.field_e[var2].field_i == param0.field_i) {
                  ek.field_d[pg.field_e[var2].a(2147483647)] = ek.field_d[pg.field_e[var2].a(2147483647)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            ek.field_d[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (we.field_n == null) {
        } else {
            mg.field_s = 0;
            cj.field_d = param0.getX();
            ek.field_a = param0.getY();
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                ke.field_g = 2;
                lf.field_a = 2;
            } else {
                ke.field_g = 1;
                lf.field_a = 1;
            }
            var2 = param0.getModifiers();
            if ((8 & var2) == 0) {
            }
            oh.field_b = true;
            if ((var2 & 16) != 0) {
            }
            if ((4 & var2) == 0) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == we.field_n)) {
            lf.field_a = 0;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(we.field_n == null)) {
            mg.field_s = 0;
            lf.field_a = 0;
            oh.field_b = true;
            var2 = param0.getModifiers();
            if ((8 & var2) == -1) {
            }
            if (0 == (16 & var2)) {
            }
            if (-1 == (var2 & 4)) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
