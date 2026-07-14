/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static cr field_a;
    static aj field_f;
    static String field_e;
    static dn field_b;
    static String field_d;
    static String field_c;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(lf.field_q == null)) {
            av.field_a = 0;
            nh.field_B = -1;
            kl.field_i = -1;
            ku.field_I = true;
        }
    }

    final static void a(int param0, int param1, int param2) {
        bv var3 = vl.field_n;
        var3.h(32161, param2);
        var3.b(1, 3);
        int var4 = -78 % ((param0 - 10) / 46);
        var3.b(1, 9);
        var3.b(true, param1);
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (lf.field_q != null) {
          av.field_a = 0;
          mq.field_Xb = param0.getX();
          ei.field_d = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              jm.field_k = 1;
              ob.field_J = 1;
              var2 = param0.getModifiers();
              if (-1 != (var2 & 16 ^ -1)) {
                tb.field_g = tb.field_g | 1;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 8) != -1) {
                tb.field_g = tb.field_g | 2;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != (4 & var2)) {
                tb.field_g = tb.field_g | 4;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ku.field_I = true;
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
              jm.field_k = 2;
              ob.field_J = 2;
              var2 = param0.getModifiers();
              if (-1 != (var2 & 16 ^ -1)) {
                tb.field_g = tb.field_g | 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 8) != -1) {
                tb.field_g = tb.field_g | 2;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 != (4 & var2)) {
                tb.field_g = tb.field_g | 4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              ku.field_I = true;
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(lf.field_q == null)) {
            av.field_a = 0;
            nh.field_B = param0.getX();
            kl.field_i = param0.getY();
            ku.field_I = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    final static void a(int param0) {
        if (param0 != 4) {
          field_a = null;
          boolean discarded$4 = pr.field_g.a(-99);
          ug.field_b = ug.field_b + 1;
          return;
        } else {
          boolean discarded$5 = pr.field_g.a(-99);
          ug.field_b = ug.field_b + 1;
          return;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(lf.field_q == null)) {
            av.field_a = 0;
            nh.field_B = param0.getX();
            kl.field_i = param0.getY();
            ku.field_I = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        if (param0 != -79) {
            return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (lf.field_q != null) {
            av.field_a = 0;
            nh.field_B = param0.getX();
            kl.field_i = param0.getY();
            ku.field_I = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (lf.field_q != null) {
            ob.field_J = 0;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != lf.field_q) {
          L0: {
            av.field_a = 0;
            ob.field_J = 0;
            ku.field_I = true;
            var2 = param0.getModifiers();
            if (-1 != (var2 & 16 ^ -1)) {
              tb.field_g = tb.field_g & -2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var2 & 8) != -1) {
              tb.field_g = tb.field_g & -3;
              break L1;
            } else {
              break L1;
            }
          }
          if (-1 != (var2 & 4)) {
            tb.field_g = tb.field_g & -5;
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
              return;
            }
          } else {
            if (param0.isPopupTrigger()) {
              param0.consume();
              return;
            } else {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> level <%1>";
        field_e = "Toggle chat";
        field_f = null;
        field_d = "Instructions";
    }
}
