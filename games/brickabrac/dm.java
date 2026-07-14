/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static mi field_e;
    static jp field_f;
    static String field_a;
    static wh field_d;
    static eh field_g;
    static int field_b;
    static byte[] field_c;

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (lj.field_j != null) {
          gr.field_a = 0;
          l.field_l = param0.getX();
          va.field_e = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              mi.field_c = 1;
              kb.field_Pb = 1;
              var2 = param0.getModifiers();
              kn.field_C = true;
              if ((8 & var2) == -1) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 != (4 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (16 & var2)) {
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
              mi.field_c = 2;
              kb.field_Pb = 2;
              var2 = param0.getModifiers();
              kn.field_C = true;
              if ((8 & var2) == -1) {
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
            L6: {
              if (-1 == (16 & var2)) {
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

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(lj.field_j == null)) {
            gr.field_a = 0;
            eo.field_i = param0.getX();
            ep.field_g = param0.getY();
            kn.field_C = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(lj.field_j == null)) {
            kb.field_Pb = 0;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 != 24) {
            field_d = null;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (lj.field_j != null) {
            gr.field_a = 0;
            eo.field_i = -1;
            ep.field_g = -1;
            kn.field_C = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != lj.field_j) {
          L0: {
            gr.field_a = 0;
            kb.field_Pb = 0;
            kn.field_C = true;
            var2 = param0.getModifiers();
            if ((var2 & 8) != 0) {
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
            if (0 == (4 & var2)) {
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

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param2 >> 1489506960;
        var4 = param2 & 65535;
        if (param1 != -1) {
          int discarded$1 = dm.a(-92, 104, -112);
          var5 = param0 >> -527685360;
          var6 = 65535 & param0;
          return (var6 * var4 >> -1387307920) + var5 * var4 + var3 * param0;
        } else {
          var5 = param0 >> -527685360;
          var6 = 65535 & param0;
          return (var6 * var4 >> -1387307920) + var5 * var4 + var3 * param0;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(lj.field_j == null)) {
            gr.field_a = 0;
            eo.field_i = param0.getX();
            ep.field_g = param0.getY();
            kn.field_C = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == lj.field_j)) {
            gr.field_a = 0;
            eo.field_i = param0.getX();
            ep.field_g = param0.getY();
            kn.field_C = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "(<%0>)";
        field_e = new mi();
    }
}
