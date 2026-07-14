/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gk implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static hj field_a;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(null == nk.field_q)) {
            db.field_f = 0;
        }
    }

    final static e a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var2 = param0.length();
        if (-1 != (var2 ^ -1)) {
          if ((var2 ^ -1) < -65) {
            return vj.field_c;
          } else {
            if (param0.charAt(0) == 34) {
              if (34 != param0.charAt(-1 + var2)) {
                return ba.field_a;
              } else {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return ba.field_a;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              var4 = -41 / ((param1 - -63) / 60);
              var3 = 0;
              var5 = 0;
              L3: while (true) {
                if (var5 < var2) {
                  var6 = param0.charAt(var5);
                  if (var6 != 46) {
                    if (pj.field_w.indexOf(var6) != -1) {
                      var3 = 0;
                      var5++;
                      continue L3;
                    } else {
                      return ba.field_a;
                    }
                  } else {
                    L4: {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        if (var5 == var2 - 1) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var5++;
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return ba.field_a;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return oc.field_M;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == nk.field_q)) {
            nl.field_d = 0;
            bl.field_g = -1;
            ic.field_g = -1;
            tf.field_m = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static hf a(dl param0, byte param1) {
        if (param1 != -11) {
            gk.a(-96);
        }
        return ik.a(bb.a(param0, 100, 96), -129);
    }

    public static void a(int param0) {
        if (param0 != 8) {
            Object var2 = null;
            e discarded$0 = gk.a((String) null, (byte) -107);
        }
        field_a = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        if (param0 != 2) {
            return;
        }
        if ((ij.field_g ^ -1) > -225) {
            var1 = ij.field_g % 32;
            ia.b(32 + ij.field_g + -var1, -23235);
        } else {
            ia.b(256, -23235);
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(nk.field_q == null)) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != nk.field_q) {
            nl.field_d = 0;
            vg.field_p = param0.getX();
            id.field_b = param0.getY();
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                eh.field_c = 2;
                db.field_f = 2;
            } else {
                eh.field_c = 1;
                db.field_f = 1;
            }
            var2 = param0.getModifiers();
            if (!(-1 == (var2 & 16 ^ -1))) {
                sd.field_c = sd.field_c | 1;
            }
            if (0 != (8 & var2)) {
                sd.field_c = sd.field_c | 2;
            }
            if (0 != (4 & var2)) {
                sd.field_c = sd.field_c | 4;
            }
            tf.field_m = true;
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(nk.field_q == null)) {
            nl.field_d = 0;
            db.field_f = 0;
            tf.field_m = true;
            var2 = param0.getModifiers();
            if (!((16 & var2) == 0)) {
                sd.field_c = sd.field_c & -2;
            }
            if (!(-1 == (var2 & 8 ^ -1))) {
                sd.field_c = sd.field_c & -3;
            }
            if (!((4 & var2) == 0)) {
                sd.field_c = sd.field_c & -5;
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(nk.field_q == null)) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (nk.field_q != null) {
            nl.field_d = 0;
            bl.field_g = param0.getX();
            ic.field_g = param0.getY();
            tf.field_m = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 50;
    }
}
