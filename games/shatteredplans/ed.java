/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static eo field_h;
    static qr field_d;
    static pf field_g;
    static String field_e;
    static pf field_c;
    static int field_f;
    static bi field_b;
    static String field_a;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == pd.field_j)) {
            ql.field_q = 0;
            aj.field_f = param0.getX();
            rf.field_i = param0.getY();
            kh.field_Lb = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == pd.field_j)) {
            ql.field_q = 0;
            aj.field_f = param0.getX();
            rf.field_i = param0.getY();
            kh.field_Lb = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (pd.field_j != null) {
            ql.field_q = 0;
            aj.field_f = param0.getX();
            rf.field_i = param0.getY();
            kh.field_Lb = true;
        }
    }

    final static bi a(boolean param0) {
        int var1 = 0;
        bi var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var20 = null;
        int[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = cm.field_g[0] * mc.field_s[0];
        if (!param0) {
          L0: {
            ed.a(79);
            var22 = hd.field_q[0];
            if (!ua.field_h[0]) {
              var25 = new int[var1];
              var17 = var25;
              var9 = var17;
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var25);
                  break L0;
                } else {
                  var9[var5] = eo.field_fb[we.a(255, (int) var22[var5])];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var23 = kc.field_l[0];
              var24 = new int[var1];
              var16 = var24;
              var13 = var16;
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = (bi) (Object) new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var24);
                  break L0;
                } else {
                  var5_ref_int__[var6] = ee.a(eo.field_fb[we.a((int) var22[var6], 255)], we.a(-16777216, var23[var6] << -404545352));
                  var6++;
                  continue L2;
                }
              }
            }
          }
          pd.a(0);
          return var3;
        } else {
          L3: {
            var26 = hd.field_q[0];
            if (!ua.field_h[0]) {
              var29 = new int[var1];
              var21 = var29;
              var9 = var21;
              var5 = 0;
              L4: while (true) {
                if (var1 <= var5) {
                  var3 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var29);
                  break L3;
                } else {
                  var9[var5] = eo.field_fb[we.a(255, (int) var26[var5])];
                  var5++;
                  continue L4;
                }
              }
            } else {
              var27 = kc.field_l[0];
              var28 = new int[var1];
              var20 = var28;
              var13 = var20;
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L5: while (true) {
                if (var1 <= var6) {
                  var3 = (bi) (Object) new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var28);
                  break L3;
                } else {
                  var5_ref_int__[var6] = ee.a(eo.field_fb[we.a((int) var26[var6], 255)], we.a(-16777216, var27[var6] << -404545352));
                  var6++;
                  continue L5;
                }
              }
            }
          }
          pd.a(0);
          return var3;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (he.field_p == null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 == 1) {
          if ((oq.field_j ^ -1) == -10) {
            if (j.a(2, uo.field_f, jj.field_o, tl.field_D, bq.field_e)) {
              L1: {
                if (tl.field_D == 2) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              return tk.a(bq.field_e, jj.field_o, false, uo.field_f, tl.field_D);
            } else {
              if ((oq.field_j ^ -1) == -11) {
                if (var3 != 0) {
                  return false;
                } else {
                  rg.a(true);
                  return true;
                }
              } else {
                if (11 != oq.field_j) {
                  return false;
                } else {
                  if (jj.field_n) {
                    if (-3 != (vp.field_r ^ -1)) {
                      L2: {
                        if ((vp.field_r ^ -1) == -3) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            break L2;
                          } else {
                            return false;
                          }
                        }
                      }
                      L3: {
                        if (sh.b(57)) {
                          ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      return true;
                    } else {
                      if (!ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
                        return false;
                      } else {
                        L4: {
                          if ((vp.field_r ^ -1) == -3) {
                            break L4;
                          } else {
                            if (var3 == 0) {
                              break L4;
                            } else {
                              return false;
                            }
                          }
                        }
                        L5: {
                          if (sh.b(57)) {
                            ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            if ((oq.field_j ^ -1) == -11) {
              if (var3 != 0) {
                return false;
              } else {
                rg.a(true);
                return true;
              }
            } else {
              if (11 == oq.field_j) {
                if (jj.field_n) {
                  if (-3 != (vp.field_r ^ -1)) {
                    L6: {
                      if ((vp.field_r ^ -1) == -3) {
                        break L6;
                      } else {
                        if (var3 == 0) {
                          break L6;
                        } else {
                          return false;
                        }
                      }
                    }
                    L7: {
                      if (sh.b(57)) {
                        ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return true;
                  } else {
                    if (ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
                      if ((vp.field_r ^ -1) != -3) {
                        if (var3 == 0) {
                          L8: {
                            if (sh.b(57)) {
                              ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        if (sh.b(57)) {
                          ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                          return true;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == pd.field_j)) {
            ql.field_q = 0;
            aj.field_f = -1;
            rf.field_i = -1;
            kh.field_Lb = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != pd.field_j) {
          L0: {
            ql.field_q = 0;
            v.field_d = 0;
            kh.field_Lb = true;
            var2 = param0.getModifiers();
            if ((var2 & 4) == 0) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != (16 & var2)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((8 & var2) != 0) {
              break L2;
            } else {
              break L2;
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        } else {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != pd.field_j) {
          ql.field_q = 0;
          lc.field_c = param0.getX();
          el.field_e = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              vh.field_c = 2;
              v.field_d = 2;
              var2 = param0.getModifiers();
              kh.field_Lb = true;
              if ((var2 & 16) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 == (var2 & 4 ^ -1)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != (var2 & 8)) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
              return;
            }
          } else {
            L3: {
              vh.field_c = 1;
              v.field_d = 1;
              var2 = param0.getModifiers();
              kh.field_Lb = true;
              if ((var2 & 16) == 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 == (var2 & 4 ^ -1)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (var2 & 8)) {
                break L5;
              } else {
                break L5;
              }
            }
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        } else {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == pd.field_j)) {
            v.field_d = 0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_b = null;
        if (param0 <= 54) {
          boolean discarded$2 = ed.a(7, -49, -44);
          field_c = null;
          field_h = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Waiting for extra data";
        field_g = new pf();
        field_c = new pf();
        field_f = 20;
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
