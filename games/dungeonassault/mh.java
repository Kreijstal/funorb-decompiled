/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static vk field_b;
    static ef field_c;
    static int field_g;
    static int field_a;
    static gl field_e;
    static char[] field_d;
    static cf field_f;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ib.field_f != null) {
          fc.field_m = 0;
          ak.field_k = param0.getX();
          em.field_C = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              wm.field_g = 1;
              ua.field_a = 1;
              var2 = param0.getModifiers();
              if (-1 != (8 & var2 ^ -1)) {
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
              lj.field_g = true;
              if (0 == (16 & var2)) {
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
              wm.field_g = 2;
              ua.field_a = 2;
              var2 = param0.getModifiers();
              if (-1 != (8 & var2 ^ -1)) {
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
              lj.field_g = true;
              if (0 == (16 & var2)) {
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(ib.field_f == null)) {
            fc.field_m = 0;
            wi.field_tb = param0.getX();
            dj.field_d = param0.getY();
            lj.field_g = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (ib.field_f != null) {
            ua.field_a = 0;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (ib.field_f != null) {
            fc.field_m = 0;
            wi.field_tb = param0.getX();
            dj.field_d = param0.getY();
            lj.field_g = true;
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (!param0) {
          return -9;
        } else {
          var3 = param1 >> -2081240464;
          var4 = 65535 & param1;
          var5 = param2 >> 420729648;
          var6 = 65535 & param2;
          return (var6 * var4 >> 1926779792) + var4 * var5 + var3 * param2;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != ib.field_f) {
            fc.field_m = 0;
            wi.field_tb = -1;
            dj.field_d = -1;
            lj.field_g = true;
        }
    }

    final static void b(int param0) {
        of.field_k = false;
        nf.field_y = param0;
        eh.field_o.field_N = true;
        ed var4 = eh.field_o;
        ed var5 = var4;
        var5.field_w = true;
        ed var2 = og.field_e;
        og.field_e.field_N = false;
        var2.field_w = false;
    }

    final static boolean a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == ek.field_c) {
          return true;
        } else {
          param1 = param1 & 127;
          if (wh.field_a > param1) {
            if (param1 < cp.field_R) {
              if (param1 < ok.field_z) {
                if (gn.field_d <= param1) {
                  L0: {
                    if (-gn.field_d + param1 >= ci.field_s.length) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      break L0;
                    } else {
                      stackOut_21_0 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      break L0;
                    }
                  }
                  return stackIn_23_0 != 0;
                } else {
                  if (param0 >= 76) {
                    if (param1 >= uf.field_a) {
                      L1: {
                        if (-uf.field_a + param1 >= hb.field_m.length) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L1;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          break L1;
                        }
                      }
                      return stackIn_31_0 != 0;
                    } else {
                      if (wm.field_a > param1) {
                        return false;
                      } else {
                        L2: {
                          if (dc.field_p.length <= -wm.field_a + param1) {
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            break L2;
                          } else {
                            stackOut_34_0 = 1;
                            stackIn_36_0 = stackOut_34_0;
                            break L2;
                          }
                        }
                        return stackIn_36_0 != 0;
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                L3: {
                  if (bl.field_n.length <= -ok.field_z + param1) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                return stackIn_17_0 != 0;
              }
            } else {
              L4: {
                if (-cp.field_R + param1 >= id.field_j.length) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L4;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L4;
                }
              }
              return stackIn_12_0 != 0;
            }
          } else {
            L5: {
              if (gg.field_g.length <= param1 - wh.field_a) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L5;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L5;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 16) {
            field_e = null;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(null == ib.field_f)) {
            fc.field_m = 0;
            wi.field_tb = param0.getX();
            dj.field_d = param0.getY();
            lj.field_g = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ib.field_f != null) {
            fc.field_m = 0;
            ua.field_a = 0;
            lj.field_g = true;
            var2 = param0.getModifiers();
            if (0 == (16 & var2)) {
            }
            if ((var2 & 4) != 0) {
            }
            if (0 == (var2 & 8)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ef();
        field_d = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
