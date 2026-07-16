/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static km field_d;
    static km field_c;
    static int field_b;
    static String[][] field_a;
    static dl field_e;

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (pm.field_l != null) {
            ng.field_Q = 0;
            ka.field_i = param0.getX();
            sm.field_a = param0.getY();
            wg.field_a = true;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != pm.field_l) {
            ng.field_Q = 0;
            hc.field_d = 0;
            wg.field_a = true;
            var2 = param0.getModifiers();
            if ((var2 & 8) != 0) {
            }
            if ((16 & var2) == 0) {
            }
            if ((4 & var2) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == pm.field_l)) {
            ng.field_Q = 0;
            ka.field_i = param0.getX();
            sm.field_a = param0.getY();
            wg.field_a = true;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param2) {
          param1 = re.a("", false, '_', param1);
          var3 = od.b(0, param0);
          if (param1.indexOf(param0) == -1) {
            if (0 != (param1.indexOf(var3) ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_b = -1;
          param1 = re.a("", false, '_', param1);
          var3 = od.b(0, param0);
          if (param1.indexOf(param0) != -1) {
            return true;
          } else {
            L0: {
              if (0 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == pm.field_l)) {
            ng.field_Q = 0;
            ka.field_i = -1;
            sm.field_a = -1;
            wg.field_a = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(pm.field_l == null)) {
            hc.field_d = 0;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != pm.field_l) {
          ng.field_Q = 0;
          ei.field_f = param0.getX();
          hk.field_Mb = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              we.field_g = 2;
              hc.field_d = 2;
              var2 = param0.getModifiers();
              if ((var2 & 4) != 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if ((8 & var2) == 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var2 & 16) == 0) {
                break L2;
              } else {
                break L2;
              }
            }
            wg.field_a = true;
            if (!param0.isPopupTrigger()) {
              return;
            } else {
              param0.consume();
              return;
            }
          } else {
            L3: {
              we.field_g = 1;
              hc.field_d = 1;
              var2 = param0.getModifiers();
              if ((var2 & 4) != 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((8 & var2) == 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 16) == 0) {
                break L5;
              } else {
                break L5;
              }
            }
            wg.field_a = true;
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

    final static boolean b(int param0) {
        if (param0 <= 8) {
            Object var2 = null;
            boolean discarded$3 = me.a((String) null, (String) null, true);
            if (-11 < (j.field_l ^ -1)) {
                return false;
            }
            if (dj.field_n < 13) {
                return false;
            }
            return true;
        }
        if (-11 < (j.field_l ^ -1)) {
            return false;
        }
        if (dj.field_n < 13) {
            return false;
        }
        return true;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (pm.field_l != null) {
            ng.field_Q = 0;
            ka.field_i = param0.getX();
            sm.field_a = param0.getY();
            wg.field_a = true;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 0) {
          boolean discarded$2 = me.b(24);
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = new dl();
    }
}
