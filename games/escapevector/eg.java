/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(om.field_b == null)) {
            md.field_G = 0;
            vb.field_b = param0.getX();
            jk.field_b = param0.getY();
            ke.field_a = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == om.field_b)) {
            md.field_G = 0;
            vb.field_b = -1;
            jk.field_b = -1;
            ke.field_a = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static oc a(int param0, int param1, boolean param2, boolean param3, hh param4) {
        oc var5 = null;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        oc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        oc stackIn_6_0 = null;
        oc stackIn_7_0 = null;
        oc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        oc stackOut_5_0 = null;
        oc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        oc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        oc stackOut_1_0 = null;
        oc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        oc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var5 = new oc(param1, param0, param4);
        if (!param3) {
          L0: {
            field_a = null;
            stackOut_5_0 = (oc) var5;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param2) {
              stackOut_7_0 = (oc) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (oc) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_q = stackIn_8_1 != 0;
          return var5;
        } else {
          L1: {
            stackOut_1_0 = (oc) var5;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param2) {
              stackOut_3_0 = (oc) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (oc) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          return var5;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == om.field_b)) {
            vj.field_b = 0;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != om.field_b) {
            md.field_G = 0;
            vb.field_b = param0.getX();
            jk.field_b = param0.getY();
            ke.field_a = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        L0: {
          if (om.field_b == null) {
            break L0;
          } else {
            L1: {
              md.field_G = 0;
              vj.field_b = 0;
              ke.field_a = true;
              var2 = param0.getModifiers();
              if (-1 == (8 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != (4 & var2)) {
                break L2;
              } else {
                break L2;
              }
            }
            if (0 != (var2 & 16)) {
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != om.field_b) {
            md.field_G = 0;
            vb.field_b = param0.getX();
            jk.field_b = param0.getY();
            ke.field_a = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (om.field_b != null) {
          md.field_G = 0;
          fk.field_b = param0.getX();
          dd.field_c = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              kb.field_f = 1;
              vj.field_b = 1;
              var2 = param0.getModifiers();
              if (-1 == (var2 & 4)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 == (16 & var2)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ke.field_a = true;
              if (-1 != (var2 & 8 ^ -1)) {
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
              kb.field_f = 2;
              vj.field_b = 2;
              var2 = param0.getModifiers();
              if (-1 == (var2 & 4)) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 == (16 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ke.field_a = true;
              if (-1 != (var2 & 8 ^ -1)) {
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
        if (param0 != -1) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
