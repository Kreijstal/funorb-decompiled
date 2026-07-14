/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static dd field_e;
    static String field_b;
    static byte[][] field_a;
    static k field_c;
    static int[] field_d;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        int var1 = 35 / ((param0 - 30) / 43);
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, fi param1, byte param2) {
        ih var3 = null;
        var3 = ud.field_b;
        var3.e(8, param0);
        if (param2 >= -97) {
          field_e = null;
          var3.a(-11, 2);
          var3.a(-11, 0);
          var3.a(-11, param1.field_i);
          return;
        } else {
          var3.a(-11, 2);
          var3.a(-11, 0);
          var3.a(-11, param1.field_i);
          return;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(ql param0, int param1, int param2) {
        sd.field_d.a(false, (lh) (Object) param0);
        if (param1 < 57) {
            return;
        }
        qb.a(param2, (byte) 105, param0);
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (sg.field_i != null) {
          m.field_a = 0;
          fb.field_b = param0.getX();
          th.field_s = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              vk.field_O = 1;
              lk.field_J = 1;
              var2 = param0.getModifiers();
              ag.field_a = true;
              if ((var2 & 4) != 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 16) == 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 != (8 & var2)) {
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
              vk.field_O = 2;
              lk.field_J = 2;
              var2 = param0.getModifiers();
              ag.field_a = true;
              if ((var2 & 4) != 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var2 & 16) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (8 & var2)) {
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

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (sg.field_i != null) {
            m.field_a = 0;
            gd.field_a = param0.getX();
            vf.field_p = param0.getY();
            ag.field_a = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(sg.field_i == null)) {
            lk.field_J = 0;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(sg.field_i == null)) {
            m.field_a = 0;
            gd.field_a = param0.getX();
            vf.field_p = param0.getY();
            ag.field_a = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(sg.field_i == null)) {
            m.field_a = 0;
            gd.field_a = -1;
            vf.field_p = -1;
            ag.field_a = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != sg.field_i) {
            m.field_a = 0;
            gd.field_a = param0.getX();
            vf.field_p = param0.getY();
            ag.field_a = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (sg.field_i == null) {
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
            m.field_a = 0;
            lk.field_J = 0;
            ag.field_a = true;
            var2 = param0.getModifiers();
            if (0 != (4 & var2)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (0 != (8 & var2)) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((16 & var2) == 0) {
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
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_a = new byte[1000][];
    }
}
