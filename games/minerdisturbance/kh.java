/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static java.awt.Font field_a;

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (lb.field_y != null) {
            t.field_c = 0;
            al.field_n = param0.getX();
            vl.field_G = param0.getY();
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                ic.field_n = 2;
                qd.field_J = 2;
            } else {
                ic.field_n = 1;
                qd.field_J = 1;
            }
            var2 = param0.getModifiers();
            kk.field_d = true;
            if ((4 & var2) == -1) {
            }
            if (-1 == (var2 & 8)) {
            }
            if (-1 != (var2 & 16 ^ -1)) {
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            kh.a((id) null, -124);
        }
        field_a = null;
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(lb.field_y == null)) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (lb.field_y != null) {
            t.field_c = 0;
            sa.field_o = -1;
            nm.field_a = -1;
            kk.field_d = true;
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        if (param1 != -16) {
            return null;
        }
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        ai.a(param0, 0, var3, 0, var2);
        return var3;
    }

    final static void a(int param0, int param1) {
        int var3 = MinerDisturbance.field_ab;
        if (param0 != -1) {
            kh.a(-47, -60);
        }
        bi var4 = (bi) (Object) bb.field_a.b(92);
        while (var4 != null) {
            tk.a(var4, param1, (byte) -102);
            var4 = (bi) (Object) bb.field_a.b((byte) 56);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(lb.field_y == null)) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
        }
    }

    final static void a(id param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = MinerDisturbance.field_ab;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= sb.field_p) {
                c.field_c[param0.a(119)] = c.field_c[param0.a(119)] + 1;
                var2 = 0;
                var3 = 0;
                L2: while (true) {
                  if (sb.field_p <= var3) {
                    L3: {
                      if (param1 == 14288) {
                        break L3;
                      } else {
                        var6 = null;
                        byte[] discarded$1 = kh.a((byte[]) null, (byte) -81);
                        break L3;
                      }
                    }
                    sb.field_p = var2;
                    sb.field_p = sb.field_p + 1;
                    im.field_a[sb.field_p] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_g == im.field_a[var3].field_g) {
                        var4 = im.field_a[var3].a(60);
                        if (bn.field_c < c.field_c[var4]) {
                          c.field_c[var4] = c.field_c[var4] - 1;
                          var3++;
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    im.field_a[var2] = im.field_a[var3];
                    var3++;
                    continue L2;
                  }
                }
              } else {
                if (param0.field_g == im.field_a[var2].field_g) {
                  c.field_c[im.field_a[var2].a(126)] = c.field_c[im.field_a[var2].a(126)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            c.field_c[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(lb.field_y == null)) {
            t.field_c = 0;
            qd.field_J = 0;
            kk.field_d = true;
            var2 = param0.getModifiers();
            if ((16 & var2) == 0) {
            }
            if ((4 & var2) != 0) {
            }
            if (-1 == (var2 & 8 ^ -1)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != lb.field_y) {
            t.field_c = 0;
            sa.field_o = param0.getX();
            nm.field_a = param0.getY();
            kk.field_d = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (lb.field_y != null) {
            qd.field_J = 0;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = MinerDisturbance.field_ab;
        var1 = 0;
        L0: while (true) {
          if (-26 >= (var1 ^ -1)) {
            L1: {
              if (param0 == 92) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (dn.field_t[var1] != null) {
                if (dn.field_t[var1].k()) {
                  dn.field_t[var1] = null;
                  break L2;
                } else {
                  sa discarded$14 = mg.a(1963987425, dn.field_t[var1]);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            if (gl.field_u[var1] != null) {
              if (gl.field_u[var1].k()) {
                gl.field_u[var1] = null;
                var1++;
                continue L0;
              } else {
                sa discarded$15 = mg.a(param0 ^ 1963987389, gl.field_u[var1]);
                var1++;
                continue L0;
              }
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    static {
    }
}
