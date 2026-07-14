/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static boolean field_a;

    final static byte[] a(byte param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        if (param0 >= -66) {
          return null;
        } else {
          var2 = param1.length;
          var3 = new byte[var2];
          cb.a(param1, 0, var3, 0, var2);
          return var3;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (nj.field_o != null) {
            wh.field_d = 0;
            th.field_a = param0.getX();
            q.field_H = param0.getY();
            cl.field_o = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(nj.field_o == null)) {
            wh.field_d = 0;
            th.field_a = param0.getX();
            q.field_H = param0.getY();
            cl.field_o = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (nj.field_o == null) {
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        } else {
          wh.field_d = 0;
          hb.field_B = param0.getX();
          nc.field_b = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              ta.field_a = 1;
              c.field_c = 1;
              var2 = param0.getModifiers();
              if ((var2 & 4) == -1) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 != (8 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (var2 & 16)) {
                break L2;
              } else {
                break L2;
              }
            }
            cl.field_o = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          } else {
            L3: {
              ta.field_a = 2;
              c.field_c = 2;
              var2 = param0.getModifiers();
              if ((var2 & 4) == -1) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 != (8 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 == (var2 & 16)) {
                break L5;
              } else {
                break L5;
              }
            }
            cl.field_o = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == nj.field_o) {
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
            wh.field_d = 0;
            c.field_c = 0;
            cl.field_o = true;
            var2 = param0.getModifiers();
            if ((var2 & 16) != 0) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 != (var2 & 8)) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-1 == (var2 & 4)) {
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

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == nj.field_o)) {
            c.field_c = 0;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == nj.field_o)) {
            wh.field_d = 0;
            th.field_a = param0.getX();
            q.field_H = param0.getY();
            cl.field_o = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (nj.field_o != null) {
            wh.field_d = 0;
            th.field_a = -1;
            q.field_H = -1;
            cl.field_o = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
    }
}
