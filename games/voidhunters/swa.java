/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class swa implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (wj.field_q != null) {
          rpa.field_b = 0;
          am.field_q = 0;
          hda.field_a = true;
          var2 = param0.getModifiers();
          if ((var2 & 16) == 0) {
            L0: {
              if ((var2 & 8) != 0) {
                tda.field_K = tda.field_K & -3;
                break L0;
              } else {
                break L0;
              }
            }
            if ((var2 & 4) == 0) {
              L1: {
                if (param0.isPopupTrigger()) {
                  param0.consume();
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                tda.field_K = tda.field_K & -5;
                if (param0.isPopupTrigger()) {
                  param0.consume();
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              tda.field_K = tda.field_K & -2;
              if ((var2 & 8) != 0) {
                tda.field_K = tda.field_K & -3;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var2 & 4) != 0) {
                tda.field_K = tda.field_K & -5;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0.isPopupTrigger()) {
                param0.consume();
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          L6: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (wj.field_q != null) {
            rpa.field_b = 0;
            wt.field_a = -1;
            kv.field_e = -1;
            hda.field_a = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != wj.field_q) {
            rpa.field_b = 0;
            wt.field_a = param0.getX();
            kv.field_e = param0.getY();
            hda.field_a = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (wj.field_q != null) {
            rpa.field_b = 0;
            wt.field_a = param0.getX();
            kv.field_e = param0.getY();
            hda.field_a = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (wj.field_q != null) {
            am.field_q = 0;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != wj.field_q) {
          rpa.field_b = 0;
          cma.field_a = param0.getX();
          nlb.field_p = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              ro.field_a = 2;
              am.field_q = 2;
              var2 = param0.getModifiers();
              if (0 != (var2 & 16)) {
                tda.field_K = tda.field_K | 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 == (var2 & 8 ^ -1)) {
              L1: {
                if (0 != (var2 & 4)) {
                  tda.field_K = tda.field_K | 4;
                  break L1;
                } else {
                  break L1;
                }
              }
              hda.field_a = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
            } else {
              L2: {
                tda.field_K = tda.field_K | 2;
                if (0 != (var2 & 4)) {
                  tda.field_K = tda.field_K | 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              hda.field_a = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
            }
          } else {
            L3: {
              ro.field_a = 1;
              am.field_q = 1;
              var2 = param0.getModifiers();
              if (0 != (var2 & 16)) {
                tda.field_K = tda.field_K | 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (-1 != (var2 & 8 ^ -1)) {
              L4: {
                tda.field_K = tda.field_K | 2;
                if (0 != (var2 & 4)) {
                  tda.field_K = tda.field_K | 4;
                  break L4;
                } else {
                  break L4;
                }
              }
              hda.field_a = true;
              if (!param0.isPopupTrigger()) {
                return;
              } else {
                param0.consume();
                return;
              }
            } else {
              L5: {
                if (0 != (var2 & 4)) {
                  tda.field_K = tda.field_K | 4;
                  break L5;
                } else {
                  break L5;
                }
              }
              hda.field_a = true;
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (wj.field_q != null) {
            rpa.field_b = 0;
            wt.field_a = param0.getX();
            kv.field_e = param0.getY();
            hda.field_a = true;
        }
    }

    static {
    }
}
