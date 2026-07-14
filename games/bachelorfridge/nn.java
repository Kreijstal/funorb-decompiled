/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_b;
    static String field_a;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (uc.field_m != null) {
          L0: {
            tf.field_n = 0;
            oga.field_q = 0;
            gja.field_j = true;
            var2 = param0.getModifiers();
            if (-1 != (var2 & 16)) {
              cj.field_f = cj.field_f & -2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 != (8 & var2)) {
              cj.field_f = cj.field_f & -3;
              break L1;
            } else {
              break L1;
            }
          }
          if (-1 != (var2 & 4 ^ -1)) {
            cj.field_f = cj.field_f & -5;
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
        if (!(null == uc.field_m)) {
            tf.field_n = 0;
            ue.field_N = param0.getX();
            dia.field_A = param0.getY();
            gja.field_j = true;
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (uc.field_m != null) {
          tf.field_n = 0;
          tba.field_u = param0.getX();
          dma.field_c = param0.getY();
          if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            L0: {
              jh.field_l = 1;
              oga.field_q = 1;
              var2 = param0.getModifiers();
              if ((var2 & 16) != 0) {
                cj.field_f = cj.field_f | 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 != (var2 & 8)) {
              cj.field_f = cj.field_f | 2;
              if (0 == (4 & var2)) {
                L1: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                cj.field_f = cj.field_f | 4;
                L2: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              if (0 == (4 & var2)) {
                L3: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              } else {
                cj.field_f = cj.field_f | 4;
                L4: {
                  gja.field_j = true;
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
          } else {
            L5: {
              jh.field_l = 2;
              oga.field_q = 2;
              var2 = param0.getModifiers();
              if ((var2 & 16) != 0) {
                cj.field_f = cj.field_f | 1;
                break L5;
              } else {
                break L5;
              }
            }
            if (0 != (var2 & 8)) {
              cj.field_f = cj.field_f | 2;
              if (0 == (4 & var2)) {
                L6: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              } else {
                cj.field_f = cj.field_f | 4;
                L7: {
                  gja.field_j = true;
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
              if (0 == (4 & var2)) {
                L8: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              } else {
                cj.field_f = cj.field_f | 4;
                L9: {
                  gja.field_j = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              }
            }
          }
        } else {
          L10: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L10;
            } else {
              break L10;
            }
          }
          return;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != uc.field_m) {
            tf.field_n = 0;
            ue.field_N = param0.getX();
            dia.field_A = param0.getY();
            gja.field_j = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != uc.field_m) {
            tf.field_n = 0;
            ue.field_N = -1;
            dia.field_A = -1;
            gja.field_j = true;
        }
    }

    final static int a(aga param0, aga param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param2 == 104) {
          var3 = param0.field_x - param1.field_x;
          var4 = param0.field_J + -param1.field_J;
          if (Math.abs(var3) >= Math.abs(var4)) {
            if (Math.abs(var3) <= Math.abs(var4)) {
              if (0 <= var3) {
                if (0 >= var3) {
                  return 0;
                } else {
                  L0: {
                    if (var4 < 0) {
                      stackOut_20_0 = 4;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      stackOut_19_0 = 3;
                      stackIn_21_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                  return stackIn_21_0;
                }
              } else {
                L1: {
                  if ((var4 ^ -1) > -1) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    break L1;
                  } else {
                    stackOut_14_0 = 2;
                    stackIn_16_0 = stackOut_14_0;
                    break L1;
                  }
                }
                return stackIn_16_0;
              }
            } else {
              L2: {
                if (0 <= var3) {
                  stackOut_10_0 = 4;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 2;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0;
            }
          } else {
            L3: {
              if ((var4 ^ -1) <= -1) {
                stackOut_5_0 = 3;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return -40;
        }
    }

    final static void a(byte param0, sna param1) {
        sna var2 = null;
        int var3 = 0;
        sna var4 = null;
        sna var5 = null;
        sna var5_ref = null;
        var3 = BachelorFridge.field_y;
        var4 = (sna) (Object) param1.field_z.b((byte) 90);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (param0 != -126) {
              return;
            } else {
              param1.field_rb = 0;
              param1.field_p = 0;
              param1.field_hb = 0;
              param1.field_I = 0;
              return;
            }
          } else {
            var4.field_hb = 0;
            var4.field_p = 0;
            var4.field_I = 0;
            var4.field_rb = 0;
            var5 = (sna) (Object) param1.field_z.c(param0 ^ -126);
            var5_ref = var5;
            continue L0;
          }
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (uc.field_m != null) {
            oga.field_q = 0;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nn.a(-74);
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(uc.field_m == null)) {
            tf.field_n = 0;
            ue.field_N = param0.getX();
            dia.field_A = param0.getY();
            gja.field_j = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have been removed from <%0>'s game.";
    }
}
