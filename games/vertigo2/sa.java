/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static cr field_b;
    static cr field_a;
    static int[] field_d;
    static int[] field_c;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != as.field_b) {
            cf.field_a = 0;
            ja.field_h = param0.getX();
            ca.field_c = param0.getY();
            ej.field_f = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == as.field_b)) {
            cf.field_a = 0;
            ja.field_h = -1;
            ca.field_c = -1;
            ej.field_f = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (as.field_b != null) {
            cl.field_f = 0;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (as.field_b != null) {
          cf.field_a = 0;
          hn.field_o = param0.getX();
          gf.field_e = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              kc.field_a = 1;
              cl.field_f = 1;
              var2 = param0.getModifiers();
              ej.field_f = true;
              if ((var2 & 8) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 == (var2 & 16)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != (4 & var2)) {
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
              kc.field_a = 2;
              cl.field_f = 2;
              var2 = param0.getModifiers();
              ej.field_f = true;
              if ((var2 & 8) == 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 == (var2 & 16)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (4 & var2)) {
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

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != -31417) {
          sa.a(86);
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(as.field_b == null)) {
            cf.field_a = 0;
            ja.field_h = param0.getX();
            ca.field_c = param0.getY();
            ej.field_f = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        L0: {
          if (as.field_b == null) {
            break L0;
          } else {
            L1: {
              cf.field_a = 0;
              cl.field_f = 0;
              ej.field_f = true;
              var2 = param0.getModifiers();
              if ((16 & var2) != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((4 & var2) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            if ((8 & var2) == 0) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        if (param0.isPopupTrigger()) {
          param0.consume();
          return;
        } else {
          return;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(as.field_b == null)) {
            cf.field_a = 0;
            ja.field_h = param0.getX();
            ca.field_c = param0.getY();
            ej.field_f = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{1, 1, 2, 3, 2, 3, 3, 5, 3, 10, 3, 3, 2};
    }
}
