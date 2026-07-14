/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static ei field_e;
    static int field_d;
    static int[] field_b;
    static int field_a;
    static long field_f;
    static String field_c;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == ef.field_b) {
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
            jl.field_S = 0;
            rn.field_f = 0;
            n.field_x = true;
            var2 = param0.getModifiers();
            if ((var2 & 4) != 0) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((8 & var2) == 0) {
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((16 & var2) != 0) {
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == ef.field_b)) {
            jl.field_S = 0;
            qi.field_b = param0.getX();
            rn.field_b = param0.getY();
            n.field_x = true;
        }
    }

    final static t[] a(int param0, int param1, int param2, int param3, byte param4) {
        Object var6 = null;
        if (param4 != 82) {
          var6 = null;
          ul.a(-53, (String) null, (java.applet.Applet) null);
          return wa.a((byte) -63, 1, 1, 1, param3, 3, param1, param2, param0);
        } else {
          return wa.a((byte) -63, 1, 1, 1, param3, 3, param1, param2, param0);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 18133) {
          t[] discarded$2 = ul.a(91, -87, -114, -36, (byte) 126);
          field_c = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          return;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ef.field_b != null) {
          jl.field_S = 0;
          fh.field_u = param0.getX();
          pf.field_r = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              vg.field_l = 2;
              rn.field_f = 2;
              var2 = param0.getModifiers();
              n.field_x = true;
              if ((var2 & 4) != 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (0 != (var2 & 16)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 == (var2 & 8 ^ -1)) {
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
              vg.field_l = 1;
              rn.field_f = 1;
              var2 = param0.getModifiers();
              n.field_x = true;
              if ((var2 & 4) != 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 != (var2 & 16)) {
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 == (var2 & 8 ^ -1)) {
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

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = new java.net.URL(param2.getCodeBase(), param1);
            if (param0 != 0) {
                return;
            }
            try {
                var3 = og.a(var3, param2, (byte) -75);
                a.a(true, var3.toString(), param2, 3);
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
        if (ef.field_b != null) {
            jl.field_S = 0;
            qi.field_b = -1;
            rn.field_b = -1;
            n.field_x = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (ef.field_b != null) {
            jl.field_S = 0;
            qi.field_b = param0.getX();
            rn.field_b = param0.getY();
            n.field_x = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(ef.field_b == null)) {
            jl.field_S = 0;
            qi.field_b = param0.getX();
            rn.field_b = param0.getY();
            n.field_x = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != ef.field_b) {
            rn.field_f = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ei();
        field_d = 0;
        field_c = "Email address is unavailable";
    }
}
