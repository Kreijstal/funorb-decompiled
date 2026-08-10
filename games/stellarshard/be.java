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
          field_b = (int[]) null;
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
        try {
            if (sf.field_c != null) {
                ac.field_e = 0;
                pg.field_gb = -1;
                ak.field_e = -1;
                hi.field_a = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == sf.field_c) {
                break L1;
              } else {
                L2: {
                  ac.field_e = 0;
                  oc.field_b = param0.getX();
                  wl.field_R = param0.getY();
                  ih.a((byte) -98);
                  if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    tg.field_b = 1;
                    ib.field_g = 1;
                    break L2;
                  } else {
                    tg.field_b = 2;
                    ib.field_g = 2;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if (0 == (var2_int & 16)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int & 4) != 0) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if ((var2_int & 8) == 0) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                hi.field_a = true;
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("be.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
            if (null != sf.field_c) {
                ac.field_e = 0;
                pg.field_gb = param0.getX();
                ak.field_e = param0.getY();
                hi.field_a = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != sf.field_c) {
                L2: {
                  ac.field_e = 0;
                  ib.field_g = 0;
                  hi.field_a = true;
                  var2_int = param0.getModifiers();
                  if ((8 & var2_int) != 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 != (4 & var2_int)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (var2_int & 16 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("be.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
            if (null != sf.field_c) {
                ac.field_e = 0;
                pg.field_gb = param0.getX();
                ak.field_e = param0.getY();
                hi.field_a = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != sf.field_c) {
              ib.field_g = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("be.focusLost(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
                oc.field_a = param1;
                var3 = param0.getParameter("cookieprefix");
                var5 = var3;
                var5 = var3;
                var4 = param0.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                if (-1 == (param1.length() ^ -1)) {
                    var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                sh.a(-13847, "document.cookie=\"" + var5 + "\"", param0);
                if (param2 < 109) {
                    field_b = (int[]) null;
                }
                rl.a(param0, (byte) 15);
            } catch (RuntimeException runtimeException) {
                throw ma.a((Throwable) ((Object) runtimeException), "be.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        try {
            if (sf.field_c != null) {
                ac.field_e = 0;
                pg.field_gb = param0.getX();
                ak.field_e = param0.getY();
                hi.field_a = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "be.mouseDragged(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new li(14, 0, 4, 1);
        field_b = new int[8192];
        field_a = "Blow up asteroids to score points and proceed through the levels.";
        field_e = "You have <%0> unread messages!";
    }
}
