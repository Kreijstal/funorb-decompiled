/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ku implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_f;
    static String field_e;
    static hd field_b;
    static int[] field_c;
    static ut[] field_g;
    static String field_a;
    static hd field_d;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        on.a(param2 - 8, param4 - 11, du.field_n, 20, 6, param5, param1);
        String var6 = vo.a((byte) -18, !bt.field_e ? ag.field_l : h.field_a, new String[1]);
        q.field_d.a(var6, param2, param4, param0, param3);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(lw.field_e == null)) {
            lb.field_M = 0;
            vf.field_G = param0.getX();
            gf.field_b = param0.getY();
            rp.field_A = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (lw.field_e != null) {
          L0: {
            lb.field_M = 0;
            ao.field_d = 0;
            rp.field_A = true;
            var2 = param0.getModifiers();
            if ((4 & var2) == 0) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((16 & var2) == 0) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 != (var2 & 8 ^ -1)) {
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

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(null == lw.field_e)) {
            lb.field_M = 0;
            vf.field_G = param0.getX();
            gf.field_b = param0.getY();
            rp.field_A = true;
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
          field_d = null;
          field_c = null;
          field_g = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_g = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (lw.field_e != null) {
            ao.field_d = 0;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != lw.field_e) {
            lb.field_M = 0;
            vf.field_G = -1;
            gf.field_b = -1;
            rp.field_A = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (lw.field_e != null) {
          lb.field_M = 0;
          fp.field_w = param0.getX();
          fd.field_l = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              vu.field_Fb = 2;
              ao.field_d = 2;
              var2 = param0.getModifiers();
              rp.field_A = true;
              if ((16 & var2) == -1) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-1 == (var2 & 4)) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((var2 & 8) != 0) {
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
              vu.field_Fb = 1;
              ao.field_d = 1;
              var2 = param0.getModifiers();
              rp.field_A = true;
              if ((16 & var2) == -1) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-1 == (var2 & 4)) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((var2 & 8) != 0) {
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
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(lw.field_e == null)) {
            lb.field_M = 0;
            vf.field_G = param0.getX();
            gf.field_b = param0.getY();
            rp.field_A = true;
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        wq.field_g = true;
        if (param1 != 4) {
          field_a = null;
          is.field_a = param2;
          rk.field_f = new wv(wd.field_l, fj.field_b, param0, hk.field_G, is.field_a);
          wd.field_l.a((fd) (Object) rk.field_f, false);
          return;
        } else {
          is.field_a = param2;
          rk.field_f = new wv(wd.field_l, fj.field_b, param0, hk.field_G, is.field_a);
          wd.field_l.a((fd) (Object) rk.field_f, false);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Lost";
        field_a = "Cancel";
    }
}
