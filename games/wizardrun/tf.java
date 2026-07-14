/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_d;
    static int field_e;
    static String field_a;
    static int[] field_b;
    static int[] field_c;

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(tc.field_m == null)) {
            oc.field_a = 0;
            wizardrun.field_T = param0.getX();
            gj.field_a = param0.getY();
            jf.field_i = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (tc.field_m != null) {
            ve.field_d = 0;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == tc.field_m)) {
            oc.field_a = 0;
            wizardrun.field_T = -1;
            gj.field_a = -1;
            jf.field_i = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (tc.field_m != null) {
          oc.field_a = 0;
          mh.field_pb = param0.getX();
          dc.field_t = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              fi.field_w = 2;
              ve.field_d = 2;
              var2 = param0.getModifiers();
              if ((var2 & 16) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 == (4 & var2 ^ -1)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              jf.field_i = true;
              if ((var2 & 8) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              fi.field_w = 1;
              ve.field_d = 1;
              var2 = param0.getModifiers();
              if ((var2 & 16) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 == (4 & var2 ^ -1)) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              jf.field_i = true;
              if ((var2 & 8) == 0) {
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L7;
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          L8: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L8;
            } else {
              break L8;
            }
          }
          return;
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = wizardrun.field_H;
        boolean discarded$12 = u.field_A.a(126, true, qa.field_s, dg.field_f);
        u.field_A.g((byte) 105);
        L0: while (true) {
          if (!ae.a(param0 ^ -20316)) {
            if ((w.field_a ^ -1) != 0) {
              var1 = w.field_a;
              jc.a((byte) 43, -1);
              return var1;
            } else {
              if (param0 == -20232) {
                if (cf.field_i) {
                  return 3;
                } else {
                  if (wc.field_j != pl.field_E) {
                    if (!we.field_c.a(true)) {
                      return 1;
                    } else {
                      if (fi.field_y == pl.field_E) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                }
              } else {
                field_c = null;
                if (cf.field_i) {
                  return 3;
                } else {
                  if (wc.field_j != pl.field_E) {
                    if (!we.field_c.a(true)) {
                      return 1;
                    } else {
                      if (fi.field_y == pl.field_E) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            boolean discarded$13 = u.field_A.a(-90, vk.field_r, ae.field_a);
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 4286) {
            field_e = -53;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (tc.field_m != null) {
            oc.field_a = 0;
            wizardrun.field_T = param0.getX();
            gj.field_a = param0.getY();
            jf.field_i = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(null == tc.field_m)) {
            oc.field_a = 0;
            wizardrun.field_T = param0.getX();
            gj.field_a = param0.getY();
            jf.field_i = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (tc.field_m == null) {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            oc.field_a = 0;
            ve.field_d = 0;
            jf.field_i = true;
            var2 = param0.getModifiers();
            if (0 == (var2 & 16)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 != (8 & var2 ^ -1)) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (0 != (var2 & 4)) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_d = "Score: ";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
