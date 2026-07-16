/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static li field_c;
    static String field_e;
    static String field_f;
    static int[] field_b;
    static String field_a;
    static pf field_d;
    static he field_g;

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -20) {
          field_b = null;
          field_f = null;
          field_e = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (sf.field_c != null) {
            ac.field_e = 0;
            pg.field_gb = -1;
            ak.field_e = -1;
            hi.field_a = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == sf.field_c) {
          if (param0.isPopupTrigger()) {
            param0.consume();
            return;
          } else {
            return;
          }
        } else {
          ac.field_e = 0;
          oc.field_b = param0.getX();
          wl.field_R = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              tg.field_b = 1;
              ib.field_g = 1;
              var2 = param0.getModifiers();
              if (0 == (var2 & 16)) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((var2 & 4) != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var2 & 8) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            hi.field_a = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          } else {
            L3: {
              tg.field_b = 2;
              ib.field_g = 2;
              var2 = param0.getModifiers();
              if (0 == (var2 & 16)) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((var2 & 4) != 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 8) == 0) {
                break L5;
              } else {
                break L5;
              }
            }
            hi.field_a = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != sf.field_c) {
            ac.field_e = 0;
            pg.field_gb = param0.getX();
            ak.field_e = param0.getY();
            hi.field_a = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != sf.field_c) {
          L0: {
            ac.field_e = 0;
            ib.field_g = 0;
            hi.field_a = true;
            var2 = param0.getModifiers();
            if ((8 & var2) != 0) {
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
            if (-1 != (var2 & 16 ^ -1)) {
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != sf.field_c) {
            ac.field_e = 0;
            pg.field_gb = param0.getX();
            ak.field_e = param0.getY();
            hi.field_a = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == sf.field_c)) {
            ib.field_g = 0;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String var4 = null;
            String var5 = null;
            Throwable decompiledCaughtException = null;
            oc.field_a = param1;
            try {
              L0: {
                L1: {
                  var3 = param0.getParameter("cookieprefix");
                  var5 = var3;
                  var5 = var3;
                  var4 = param0.getParameter("cookiehost");
                  var5 = var4;
                  var5 = var4;
                  var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                  if (-1 != (param1.length() ^ -1)) {
                    break L1;
                  } else {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    break L1;
                  }
                }
                sh.a(-13847, "document.cookie=\"" + var5 + "\"", param0);
                if (param2 >= 109) {
                  break L0;
                } else {
                  field_b = null;
                  rl.a(param0, (byte) 15);
                  return;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3_ref = decompiledCaughtException;
                break L2;
              }
            }
            rl.a(param0, (byte) 15);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (sf.field_c != null) {
            ac.field_e = 0;
            pg.field_gb = param0.getX();
            ak.field_e = param0.getY();
            hi.field_a = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new li(14, 0, 4, 1);
        field_b = new int[8192];
        field_a = "Blow up asteroids to score points and proceed through the levels.";
        field_e = "You have <%0> unread messages!";
    }
}
