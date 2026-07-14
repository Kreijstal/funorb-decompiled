/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;
    static int field_b;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (a.field_d != null) {
            ng.field_t = 0;
            ie.field_d = -1;
            ch.field_d = -1;
            sj.field_c = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != a.field_d) {
            ng.field_t = 0;
            ie.field_d = param0.getX();
            ch.field_d = param0.getY();
            sj.field_c = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(a.field_d == null)) {
            wa.field_p = 0;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != a.field_d) {
          ng.field_t = 0;
          qe.field_l = param0.getX();
          qd.field_i = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              sh.field_z = 2;
              wa.field_p = 2;
              var2 = param0.getModifiers();
              if ((var2 & 4) != -1) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 == (8 & var2)) {
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
            sj.field_c = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          } else {
            L3: {
              sh.field_z = 1;
              wa.field_p = 1;
              var2 = param0.getModifiers();
              if ((var2 & 4) != -1) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 == (8 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 != (var2 & 16)) {
                break L5;
              } else {
                break L5;
              }
            }
            sj.field_c = true;
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

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (a.field_d != null) {
            ng.field_t = 0;
            wa.field_p = 0;
            sj.field_c = true;
            var2 = param0.getModifiers();
            if (-1 != (var2 & 16 ^ -1)) {
            }
            if ((var2 & 8) != 0) {
            }
            if ((4 & var2) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != a.field_d) {
            ng.field_t = 0;
            ie.field_d = param0.getX();
            ch.field_d = param0.getY();
            sj.field_c = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (a.field_d != null) {
            ng.field_t = 0;
            ie.field_d = param0.getX();
            ch.field_d = param0.getY();
            sj.field_c = true;
        }
    }

    public static void a(byte param0) {
        int var1 = 38 / ((param0 - -67) / 37);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Select 'sprint' mode";
    }
}
