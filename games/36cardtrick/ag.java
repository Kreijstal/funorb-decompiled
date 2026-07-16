/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_g;
    static int field_e;
    static String field_c;
    static int field_f;
    static gk field_b;
    static int field_d;
    static int field_a;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (wc.field_B != null) {
            qd.field_a = 0;
            r.field_s = -1;
            vd.field_s = -1;
            oa.field_d = true;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ve.field_e = true;
        if (param0 >= -81) {
          return true;
        } else {
          L0: {
            mf.field_j = id.a(62) - -15000L;
            if (cd.field_e != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 == 0) {
          if (fe.field_a == param0) {
            return;
          } else {
            L0: {
              fe.field_a = param0;
              if (null != vc.field_a) {
                vc.field_a.a(param0 * 64 / 80);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        } else {
          field_f = -41;
          if (fe.field_a == param0) {
            return;
          } else {
            L1: {
              fe.field_a = param0;
              if (null != vc.field_a) {
                vc.field_a.a(param0 * 64 / 80);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (wc.field_B != null) {
          L0: {
            qd.field_a = 0;
            ge.field_a = 0;
            oa.field_d = true;
            var2 = param0.getModifiers();
            if ((16 & var2) == -1) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 != (8 & var2)) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((4 & var2) == 0) {
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

    final static void a(int param0) {
        String var1 = null;
        if (!ei.field_e) {
          throw new IllegalStateException();
        } else {
          L0: {
            if (null != pc.field_a) {
              pc.field_a.s(2);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = hh.b((byte) 23);
          i.field_a = new ak(var1, (String) null, true, false, false);
          sd.field_c.b((lk) (Object) vb.field_h, (byte) -71);
          if (param0 != -9145) {
            field_c = null;
            vb.field_h.c((lk) (Object) i.field_a, (byte) 33);
            vb.field_h.q(0);
            return;
          } else {
            vb.field_h.c((lk) (Object) i.field_a, (byte) 33);
            vb.field_h.q(0);
            return;
          }
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (wc.field_B != null) {
            qd.field_a = 0;
            r.field_s = param0.getX();
            vd.field_s = param0.getY();
            oa.field_d = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (wc.field_B != null) {
          qd.field_a = 0;
          nl.field_d = param0.getX();
          gk.field_b = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              kk.field_b = 2;
              ge.field_a = 2;
              var2 = param0.getModifiers();
              if ((var2 & 4) == 0) {
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              oa.field_d = true;
              if ((16 & var2) != 0) {
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((8 & var2) != 0) {
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
              kk.field_b = 1;
              ge.field_a = 1;
              var2 = param0.getModifiers();
              if ((var2 & 4) == 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              oa.field_d = true;
              if ((16 & var2) != 0) {
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((8 & var2) != 0) {
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

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_g = null;
        if (param0 != 98) {
            ag.a(-47, 60);
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != wc.field_B) {
            qd.field_a = 0;
            r.field_s = param0.getX();
            vd.field_s = param0.getY();
            oa.field_d = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == wc.field_B)) {
            ge.field_a = 0;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(null == wc.field_B)) {
            qd.field_a = 0;
            r.field_s = param0.getX();
            vd.field_s = param0.getY();
            oa.field_d = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Create a free account to start using this feature";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_f = 500;
        field_a = 0;
    }
}
