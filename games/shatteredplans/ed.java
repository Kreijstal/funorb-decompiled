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
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != pd.field_j) {
              ql.field_q = 0;
              aj.field_f = param0.getX();
              rf.field_i = param0.getY();
              kh.field_Lb = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ed.mouseEntered(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.isPopupTrigger()) {
                break L1;
              } else {
                param0.consume();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.mouseClicked(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != pd.field_j) {
              ql.field_q = 0;
              aj.field_f = param0.getX();
              rf.field_i = param0.getY();
              kh.field_Lb = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ed.mouseMoved(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pd.field_j == null) {
                break L1;
              } else {
                ql.field_q = 0;
                aj.field_f = param0.getX();
                rf.field_i = param0.getY();
                kh.field_Lb = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ed.mouseDragged(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static bi a(boolean param0) {
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var5;
        int var6;
        int var7;
        int[] var9;
        int[] var11;
        int[] var13;
        byte[] var18;
        byte[] var19;
        byte[] var20;
        byte[] var21;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = cm.field_g[0] * mc.field_s[0];
        if (!param0) {
          L0: {
            ed.a(79);
            var18 = hd.field_q[0];
            if (!ua.field_h[0]) {
              var9 = new int[var1];
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var9);
                  break L0;
                } else {
                  var9[var5] = eo.field_fb[we.a(255, (int) var18[var5])];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var19 = kc.field_l[0];
              var13 = new int[var1];
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var13);
                  break L0;
                } else {
                  var5_ref_int__[var6] = ee.a(eo.field_fb[we.a((int) var18[var6], 255)], we.a(-16777216, var19[var6] << -404545352));
                  var6++;
                  continue L2;
                }
              }
            }
          }
          pd.a(0);
          return (bi) (var3);
        } else {
          L3: {
            var20 = hd.field_q[0];
            if (!ua.field_h[0]) {
              var9 = new int[var1];
              var5 = 0;
              L4: while (true) {
                if (var1 <= var5) {
                  var3 = new bi(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var9);
                  break L3;
                } else {
                  var9[var5] = eo.field_fb[we.a(255, (int) var20[var5])];
                  var5++;
                  continue L4;
                }
              }
            } else {
              var21 = kc.field_l[0];
              var13 = new int[var1];
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L5: while (true) {
                if (var1 <= var6) {
                  var3 = new om(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], var13);
                  break L3;
                } else {
                  var5_ref_int__[var6] = ee.a(eo.field_fb[we.a((int) var20[var6], 255)], we.a(-16777216, var21[var6] << -404545352));
                  var6++;
                  continue L5;
                }
              }
            }
          }
          pd.a(0);
          return (bi) (var3);
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = he.field_p != null ? 1 : 0;
        if (param0 != 1) {
            return true;
        }
        if ((oq.field_j ^ -1) != -10) {
            if (!((oq.field_j ^ -1) != -11)) {
                if (!(var3 == 0)) {
                    return false;
                }
                rg.a(true);
                return true;
            }
            if (11 != oq.field_j) {
                return false;
            }
            if (!jj.field_n) {
                return false;
            }
            if (-3 == (vp.field_r ^ -1)) {
                if (!ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
                    return false;
                }
                if ((vp.field_r ^ -1) == -3) {
                    if (!sh.b(57)) {
                        return true;
                    }
                    ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                    return true;
                }
                if (var3 != 0) {
                    return false;
                }
                if (!(!sh.b(57))) {
                    ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                }
                return true;
            }
            if ((vp.field_r ^ -1) != -3 && var3 != 0) {
                return false;
            }
            if (!(!sh.b(57))) {
                ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
            }
            return true;
        }
        if (!j.a(2, uo.field_f, jj.field_o, tl.field_D, bq.field_e)) {
            if (!((oq.field_j ^ -1) != -11)) {
                if (!(var3 == 0)) {
                    return false;
                }
                rg.a(true);
                return true;
            }
            if (11 == oq.field_j) {
                if (!jj.field_n) {
                    return false;
                }
                if (-3 == (vp.field_r ^ -1)) {
                    if (ShatteredPlansClient.a(16, ac.field_o, ah.field_S)) {
                        if ((vp.field_r ^ -1) != -3 && var3 != 0) {
                            return false;
                        }
                        if (!(!sh.b(57))) {
                            ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                        }
                        return true;
                    }
                    return false;
                }
                if ((vp.field_r ^ -1) != -3 && var3 != 0) {
                    return false;
                }
                if (!(!sh.b(57))) {
                    ih.a(ah.field_S, param0 ^ 3, vs.field_d, vp.field_r, (String) null, param1);
                }
                return true;
            }
            return false;
        }
        if (tl.field_D != 2 && var3 != 0) {
            return false;
        }
        return tk.a(bq.field_e, jj.field_o, false, uo.field_f, tl.field_D);
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != pd.field_j) {
              ql.field_q = 0;
              aj.field_f = -1;
              rf.field_i = -1;
              kh.field_Lb = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ed.mouseExited(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != pd.field_j) {
                L2: {
                  ql.field_q = 0;
                  v.field_d = 0;
                  kh.field_Lb = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 4) == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (16 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if ((8 & var2_int) != 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ed.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != pd.field_j) {
                L2: {
                  ql.field_q = 0;
                  lc.field_c = param0.getX();
                  el.field_e = param0.getY();
                  pr.a(14274);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    vh.field_c = 2;
                    v.field_d = 2;
                    break L2;
                  } else {
                    vh.field_c = 1;
                    v.field_d = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  kh.field_Lb = true;
                  if ((var2_int & 16) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var2_int & 4 ^ -1)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (0 != (var2_int & 8)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ed.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != pd.field_j) {
              v.field_d = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ed.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_e = null;
        field_b = null;
        if (param0 <= 54) {
          ed.a(7, -49, -44);
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
        field_e = "Waiting for extra data";
        field_g = new pf();
        field_c = new pf();
        field_f = 20;
        field_a = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
