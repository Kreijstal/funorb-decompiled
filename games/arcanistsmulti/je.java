/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static ll[] field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != ob.field_hb) {
            rk.field_K = 0;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != ob.field_hb) {
            rf.field_o = 0;
            j.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ob.field_hb != null) {
          rf.field_o = 0;
          bo.field_e = param0.getX();
          wd.field_j = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              eh.field_c = 2;
              rk.field_K = 2;
              var2 = param0.getModifiers();
              qa.field_g = true;
              if ((var2 & 16) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 != (var2 & 4)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (8 & var2)) {
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
              eh.field_c = 1;
              rk.field_K = 1;
              var2 = param0.getModifiers();
              qa.field_g = true;
              if ((var2 & 16) == 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 != (var2 & 4)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 == (8 & var2)) {
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
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -10338) {
            return;
        }
        field_a = null;
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (ob.field_hb != null) {
            rf.field_o = 0;
            j.field_g = -1;
            dd.field_i = -1;
            qa.field_g = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != ob.field_hb) {
            rf.field_o = 0;
            rk.field_K = 0;
            qa.field_g = true;
            var2 = param0.getModifiers();
            if (0 == (var2 & 16)) {
            }
            if (0 == (var2 & 4)) {
            }
            if ((var2 & 8) == 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (ob.field_hb != null) {
            rf.field_o = 0;
            j.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (ob.field_hb != null) {
            rf.field_o = 0;
            j.field_g = param0.getX();
            dd.field_i = param0.getY();
            qa.field_g = true;
        }
    }

    final static void a(int param0, wk param1) {
        kj.field_c = param1.n(-98) << 155195269;
        int var2 = param1.e((byte) 99);
        oc.field_j = var2 << 949002930 & 1835008;
        kj.field_c = kj.field_c + (var2 >> -250165117);
        int var3 = 13 / ((71 - param0) / 52);
        oc.field_j = oc.field_j + (param1.n(-98) << 1490186850);
        var2 = param1.e((byte) -97);
        fo.field_a = var2 << 2147118671 & 2064384;
        oc.field_j = oc.field_j + (var2 >> -1403270586);
        fo.field_a = fo.field_a + (param1.e((byte) -93) << 394670023);
        var2 = param1.e((byte) -97);
        fo.field_a = fo.field_a + (var2 >> -747172735);
        qj.field_g = (1 & var2) << 1659110160;
        qj.field_g = qj.field_g + param1.n(-98);
    }

    final static boolean a(int param0, String param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param0 != 16) {
          field_b = 108;
          var3 = (CharSequence) (Object) param1;
          return nm.field_b.equals((Object) (Object) gk.a(var3, -13));
        } else {
          var4 = (CharSequence) (Object) param1;
          return nm.field_b.equals((Object) (Object) gk.a(var4, -13));
        }
    }

    final static void a(int param0, na param1, String param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        ne var16 = null;
        String var17 = null;
        ne var18 = null;
        ne var19 = null;
        String var20 = null;
        ne var21 = null;
        ne var22 = null;
        String var23 = null;
        ne var24 = null;
        ne var25 = null;
        String var26 = null;
        ne var27 = null;
        ne var28 = null;
        String var29 = null;
        ne var30 = null;
        String var31 = null;
        ne var32 = null;
        String var33 = null;
        ne var34 = null;
        ne var35 = null;
        String var36 = null;
        ne var37 = null;
        String var38 = null;
        ne var39 = null;
        String var40 = null;
        ne var41 = null;
        ArcanistsMulti.a(-26335, (int[]) null, ee.field_g, (String) null, 0L, -1, param1.h((byte) 73), (String) null, (kc) (Object) param1);
        if (param1.field_Lb) {
          if (2 == param1.field_Fb) {
            L0: {
              var28 = eo.field_c;
              var29 = tj.a(param0 + -949002960, new String[1], gm.field_i);
              var28.field_l.a(10, var29, (byte) -26);
              eo.field_c.a(param0 ^ 949002929);
              if (!param3) {
                break L0;
              } else {
                if (eo.field_c.field_e != ki.field_q) {
                  var32 = eo.field_c;
                  var33 = tj.a(-50, new String[1], rd.field_f);
                  var32.field_l.a(15, var33, (byte) -26);
                  break L0;
                } else {
                  var30 = eo.field_c;
                  var31 = tj.a(-50, new String[1], rc.field_o);
                  var30.field_l.a(16, var31, (byte) -26);
                  var34 = eo.field_c;
                  var5 = pb.field_h;
                  var6 = ja.field_s;
                  var34.field_l.a(0, 0, param0 + -949032396, var6, var5);
                  if (param0 == 949002930) {
                    return;
                  } else {
                    var7 = null;
                    je.a(68, (wk) null);
                    return;
                  }
                }
              }
            }
            var34 = eo.field_c;
            var5 = pb.field_h;
            var6 = ja.field_s;
            var34.field_l.a(0, 0, param0 + -949032396, var6, var5);
            if (param0 != 949002930) {
              var7 = null;
              je.a(68, (wk) null);
              return;
            } else {
              return;
            }
          } else {
            if (-3 >= (qf.field_d ^ -1)) {
              L1: {
                var35 = eo.field_c;
                var36 = tj.a(param0 + -949002960, new String[1], gm.field_i);
                var35.field_l.a(10, var36, (byte) -26);
                eo.field_c.a(param0 ^ 949002929);
                if (!param3) {
                  break L1;
                } else {
                  if (eo.field_c.field_e != ki.field_q) {
                    var39 = eo.field_c;
                    var40 = tj.a(-50, new String[1], rd.field_f);
                    var39.field_l.a(15, var40, (byte) -26);
                    break L1;
                  } else {
                    var37 = eo.field_c;
                    var38 = tj.a(-50, new String[1], rc.field_o);
                    var37.field_l.a(16, var38, (byte) -26);
                    var41 = eo.field_c;
                    var5 = pb.field_h;
                    var6 = ja.field_s;
                    var41.field_l.a(0, 0, param0 + -949032396, var6, var5);
                    if (param0 != 949002930) {
                      var7 = null;
                      je.a(68, (wk) null);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              var41 = eo.field_c;
              var5 = pb.field_h;
              var6 = ja.field_s;
              var41.field_l.a(0, 0, param0 + -949032396, var6, var5);
              if (param0 != 949002930) {
                var7 = null;
                je.a(68, (wk) null);
                return;
              } else {
                return;
              }
            } else {
              L2: {
                eo.field_c.a(param0 ^ 949002929);
                if (!param3) {
                  break L2;
                } else {
                  if (eo.field_c.field_e != ki.field_q) {
                    var25 = eo.field_c;
                    var26 = tj.a(-50, new String[1], rd.field_f);
                    var25.field_l.a(15, var26, (byte) -26);
                    break L2;
                  } else {
                    var22 = eo.field_c;
                    var23 = tj.a(-50, new String[1], rc.field_o);
                    var22.field_l.a(16, var23, (byte) -26);
                    var24 = eo.field_c;
                    var5 = pb.field_h;
                    var6 = ja.field_s;
                    var24.field_l.a(0, 0, param0 + -949032396, var6, var5);
                    if (param0 != 949002930) {
                      var7 = null;
                      je.a(68, (wk) null);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              var27 = eo.field_c;
              var5 = pb.field_h;
              var6 = ja.field_s;
              var27.field_l.a(0, 0, param0 + -949032396, var6, var5);
              if (param0 != 949002930) {
                var7 = null;
                je.a(68, (wk) null);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L3: {
            eo.field_c.a(param0 ^ 949002929);
            if (!param3) {
              break L3;
            } else {
              if (eo.field_c.field_e != ki.field_q) {
                var19 = eo.field_c;
                var20 = tj.a(-50, new String[1], rd.field_f);
                var19.field_l.a(15, var20, (byte) -26);
                break L3;
              } else {
                var16 = eo.field_c;
                var17 = tj.a(-50, new String[1], rc.field_o);
                var16.field_l.a(16, var17, (byte) -26);
                var18 = eo.field_c;
                var5 = pb.field_h;
                var6 = ja.field_s;
                var18.field_l.a(0, 0, param0 + -949032396, var6, var5);
                if (param0 != 949002930) {
                  var7 = null;
                  je.a(68, (wk) null);
                  return;
                } else {
                  return;
                }
              }
            }
          }
          var21 = eo.field_c;
          var5 = pb.field_h;
          var6 = ja.field_s;
          var21.field_l.a(0, 0, param0 + -949032396, var6, var5);
          if (param0 != 949002930) {
            var7 = null;
            je.a(68, (wk) null);
            return;
          } else {
            return;
          }
        }
    }

    static {
    }
}
