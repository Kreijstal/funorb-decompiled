/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_i;
    static a field_a;
    static String field_f;
    static String field_d;
    static je field_b;
    static String field_c;
    static volatile boolean field_h;
    static String field_g;
    static int field_e;

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            if (param0 >= -85) {
                field_b = null;
            }
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = ai.a(var3, (byte) -112, param2);
                oi.a((byte) -54, var3.toString(), true, param2);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != kd.field_g) {
            ea.field_a = 0;
            nl.field_d = -1;
            va.field_y = -1;
            tl.field_M = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != kd.field_g) {
            ea.field_a = 0;
            nl.field_d = param0.getX();
            va.field_y = param0.getY();
            tl.field_M = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (kd.field_g != null) {
            ea.field_a = 0;
            nl.field_d = param0.getX();
            va.field_y = param0.getY();
            tl.field_M = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != kd.field_g) {
          ea.field_a = 0;
          qc.field_Z = param0.getX();
          qm.field_c = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              tg.field_f = 1;
              kf.field_c = 1;
              var2 = param0.getModifiers();
              tl.field_M = true;
              if (0 == (16 & var2)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((4 & var2) != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (0 == (var2 & 8)) {
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
              tg.field_f = 2;
              kf.field_c = 2;
              var2 = param0.getModifiers();
              tl.field_M = true;
              if (0 == (16 & var2)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((4 & var2) != 0) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 == (var2 & 8)) {
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

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != kd.field_g) {
            ea.field_a = 0;
            kf.field_c = 0;
            tl.field_M = true;
            var2 = param0.getModifiers();
            if ((16 & var2) != -1) {
            }
            if (-1 == (var2 & 8)) {
            }
            if ((4 & var2) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
          field_f = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          return;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == kd.field_g)) {
            ea.field_a = 0;
            nl.field_d = param0.getX();
            va.field_y = param0.getY();
            tl.field_M = true;
        }
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (param1 < -33) {
          var2 = param0.charAt(0);
          var3 = 1;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          field_g = null;
          var2 = param0.charAt(0);
          var3 = 1;
          L1: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) != var2) {
                return false;
              } else {
                var3++;
                continue L1;
              }
            } else {
              return true;
            }
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != kd.field_g) {
            kf.field_c = 0;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new a();
        field_f = "Encouraging rule breaking";
        field_d = "Enter name of player to delete from list";
        field_b = new je();
        field_c = "Email address is unavailable";
        field_h = false;
        field_g = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_e = 15;
    }
}
