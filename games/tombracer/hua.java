/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hua implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_b;

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != wna.field_n) {
            tka.field_n = 0;
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 89) {
            return -22;
        }
        return uoa.field_a[param1 & 2047];
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != wna.field_n) {
            tu.field_h = 0;
            ena.field_n = param0.getX();
            ee.field_a = param0.getY();
            lja.field_c = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        int var2 = param0.length();
        char[] var3 = new char[var2];
        for (var4 = param1; var2 > var4; var4++) {
            var3[-var4 + (var2 - 1)] = param0.charAt(var4);
        }
        return new String(var3);
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(wna.field_n == null)) {
            tu.field_h = 0;
            ena.field_n = -1;
            ee.field_a = -1;
            lja.field_c = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(wna.field_n == null)) {
            tu.field_h = 0;
            ena.field_n = param0.getX();
            ee.field_a = param0.getY();
            lja.field_c = true;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
            field_b = null;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != wna.field_n) {
          tu.field_h = 0;
          cr.field_d = param0.getX();
          ria.field_m = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              at.field_X = 1;
              tka.field_n = 1;
              var2 = param0.getModifiers();
              if ((16 & var2) != 0) {
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
              lja.field_c = true;
              if ((8 & var2) == 0) {
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
              at.field_X = 2;
              tka.field_n = 2;
              var2 = param0.getModifiers();
              if ((16 & var2) != 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 != (4 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              lja.field_c = true;
              if ((8 & var2) == 0) {
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

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        L0: {
          if (null == wna.field_n) {
            break L0;
          } else {
            L1: {
              tu.field_h = 0;
              tka.field_n = 0;
              lja.field_c = true;
              var2 = param0.getModifiers();
              if ((16 & var2) != 0) {
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
            if ((var2 & 8) != 0) {
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
        if (wna.field_n != null) {
            tu.field_h = 0;
            ena.field_n = param0.getX();
            ee.field_a = param0.getY();
            lja.field_c = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
        field_b = "Get Ready...";
    }
}
