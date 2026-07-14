/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static mi field_a;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = -1;
            rd.field_Nb = -1;
            th.field_cb = true;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 5083) {
            field_b = null;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        L0: {
          if (null == tf.field_a) {
            break L0;
          } else {
            ka.field_L = 0;
            pe.field_n = 0;
            th.field_cb = true;
            var2 = param0.getModifiers();
            if (-1 == (var2 & 16 ^ -1)) {
              L1: {
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e & -3;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != (4 & var2)) {
                mg.field_e = mg.field_e & -5;
                break L0;
              } else {
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              }
            } else {
              L2: {
                mg.field_e = mg.field_e & -2;
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e & -3;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 != (4 & var2)) {
                  mg.field_e = mg.field_e & -5;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (!param0.isPopupTrigger()) {
                return;
              } else {
                param0.consume();
                return;
              }
            }
          }
        }
        if (param0.isPopupTrigger()) {
          param0.consume();
          return;
        } else {
          return;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = param0.getX();
            rd.field_Nb = param0.getY();
            th.field_cb = true;
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = param0.getX();
            rd.field_Nb = param0.getY();
            th.field_cb = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == tf.field_a) {
          if (!param0.isPopupTrigger()) {
            return;
          } else {
            param0.consume();
            return;
          }
        } else {
          ka.field_L = 0;
          va.field_a = param0.getX();
          qf.field_f = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            sh.field_K = 1;
            pe.field_n = 1;
            var2 = param0.getModifiers();
            if ((16 & var2) == 0) {
              L0: {
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e | 2;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (0 == (4 & var2)) {
                th.field_cb = true;
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              } else {
                mg.field_e = mg.field_e | 4;
                th.field_cb = true;
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              }
            } else {
              L1: {
                mg.field_e = mg.field_e | 1;
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e | 2;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == (4 & var2)) {
                th.field_cb = true;
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              } else {
                mg.field_e = mg.field_e | 4;
                th.field_cb = true;
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              }
            }
          } else {
            sh.field_K = 2;
            pe.field_n = 2;
            var2 = param0.getModifiers();
            if ((16 & var2) != 0) {
              L2: {
                mg.field_e = mg.field_e | 1;
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e | 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 == (4 & var2)) {
                th.field_cb = true;
                if (!param0.isPopupTrigger()) {
                  return;
                } else {
                  param0.consume();
                  return;
                }
              } else {
                mg.field_e = mg.field_e | 4;
                th.field_cb = true;
                if (param0.isPopupTrigger()) {
                  param0.consume();
                  return;
                } else {
                  return;
                }
              }
            } else {
              L3: {
                if ((var2 & 8) != 0) {
                  mg.field_e = mg.field_e | 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (0 == (4 & var2)) {
                  th.field_cb = true;
                  break L4;
                } else {
                  mg.field_e = mg.field_e | 4;
                  th.field_cb = true;
                  break L4;
                }
              }
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (null != tf.field_a) {
            pe.field_n = 0;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(tf.field_a == null)) {
            ka.field_L = 0;
            r.field_a = param0.getX();
            rd.field_Nb = param0.getY();
            th.field_cb = true;
        }
    }

    final static void b(int param0) {
        String var1 = null;
        if (rk.field_f) {
          if (ki.field_c == null) {
            var1 = vd.d(85);
            om.field_p = new w(var1, (String) null, true, false, false);
            if (param0 != 2) {
              return;
            } else {
              vg.field_Z.c((fj) (Object) dn.field_b, 0);
              dn.field_b.a((fj) (Object) om.field_p, (byte) -72);
              dn.field_b.m(118);
              return;
            }
          } else {
            ki.field_c.n(10);
            var1 = vd.d(85);
            om.field_p = new w(var1, (String) null, true, false, false);
            if (param0 != 2) {
              return;
            } else {
              vg.field_Z.c((fj) (Object) dn.field_b, 0);
              dn.field_b.a((fj) (Object) om.field_p, (byte) -72);
              dn.field_b.m(118);
              return;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[18];
    }
}
