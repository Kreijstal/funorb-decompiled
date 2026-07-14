/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_b;
    static String field_c;
    static String field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(wp.field_g == null)) {
            qk.field_g = 0;
            we.field_l = param0.getX();
            wn.field_k = param0.getY();
            m.field_d = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == wp.field_g)) {
            qk.field_g = 0;
            we.field_l = param0.getX();
            wn.field_k = param0.getY();
            m.field_d = true;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = 123 / ((param0 - -15) / 48);
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (wp.field_g != null) {
            qk.field_g = 0;
            we.field_l = -1;
            wn.field_k = -1;
            m.field_d = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(wp.field_g == null)) {
            ho.field_v = 0;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (wp.field_g != null) {
            qk.field_g = 0;
            ho.field_v = 0;
            m.field_d = true;
            var2 = param0.getModifiers();
            if ((var2 & 4) == 0) {
            }
            if ((8 & var2) == 0) {
            }
            if ((var2 & 16) == 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 > -34) {
            return true;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == wp.field_g)) {
            qk.field_g = 0;
            we.field_l = param0.getX();
            wn.field_k = param0.getY();
            m.field_d = true;
        }
    }

    final static boolean a(int param0) {
        if (param0 != -6720) {
            return false;
        }
        if (null == fk.field_cb) {
            return false;
        }
        if (fk.field_cb.j(103) == null) {
            return false;
        }
        return true;
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != wp.field_g) {
          qk.field_g = 0;
          pq.field_f = param0.getX();
          ne.field_o = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              kj.field_c = 1;
              ho.field_v = 1;
              var2 = param0.getModifiers();
              if (0 == (var2 & 8)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((4 & var2) == -1) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != (var2 & 16)) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              m.field_d = true;
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
              kj.field_c = 2;
              ho.field_v = 2;
              var2 = param0.getModifiers();
              if (0 == (var2 & 8)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((4 & var2) == -1) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 != (var2 & 16)) {
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              m.field_d = true;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Time trial failed!";
        field_c = "Seriously offensive language";
        field_a = "This game is full.";
    }
}
