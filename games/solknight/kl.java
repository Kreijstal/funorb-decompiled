/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static int field_a;

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ee.field_j != null) {
          cf.field_e = 0;
          ug.field_a = param0.getX();
          wd.field_d = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              SolKnight.field_G = 1;
              u.field_d = 1;
              var2 = param0.getModifiers();
              pe.field_n = true;
              if (0 == (var2 & 16)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 8) != 0) {
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
            L3: {
              SolKnight.field_G = 2;
              u.field_d = 2;
              var2 = param0.getModifiers();
              pe.field_n = true;
              if (0 == (var2 & 16)) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var2 & 8) != 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 == (4 & var2)) {
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

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            String var7 = null;
            String var5 = null;
            String var4 = null;
            String var8 = null;
            td.field_i = param1;
            try {
                var7 = param0.getParameter("cookieprefix");
                var5 = var7;
                var5 = var7;
                if (param2 != 13536) {
                    Object var6 = null;
                    kl.a((java.applet.Applet) null, (String) null, -70);
                }
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var8;
                var5 = var8;
                if (0 != param1.length()) {
                    var5 = var8 + "; Expires=" + hc.a(je.a(1) + 94608000000L, param2 + -44825) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                fd.a(32, param0, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            la.a(param0, true);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (ee.field_j != null) {
            cf.field_e = 0;
            le.field_f = -1;
            c.field_J = -1;
            pe.field_n = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (ee.field_j != null) {
            cf.field_e = 0;
            le.field_f = param0.getX();
            c.field_J = param0.getY();
            pe.field_n = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != ee.field_j) {
            cf.field_e = 0;
            le.field_f = param0.getX();
            c.field_J = param0.getY();
            pe.field_n = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != ee.field_j) {
            cf.field_e = 0;
            le.field_f = param0.getX();
            c.field_J = param0.getY();
            pe.field_n = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ee.field_j != null) {
            cf.field_e = 0;
            u.field_d = 0;
            pe.field_n = true;
            var2 = param0.getModifiers();
            if ((var2 & 8) == 0) {
            }
            if (0 == (var2 & 4)) {
            }
            if (0 != (var2 & 16)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (ee.field_j != null) {
            u.field_d = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
