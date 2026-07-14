/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String[][] field_g;
    static java.awt.Font field_f;
    static fm field_c;
    static int field_j;
    static wk[] field_d;
    static i field_i;
    static gh[] field_h;
    static vb field_e;
    static wk[] field_k;
    static String[] field_b;
    static boolean field_a;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(ub.field_e == null)) {
            ob.field_q = 0;
            ji.field_j = param0.getX();
            hc.field_G = param0.getY();
            ce.field_w = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != ub.field_e) {
            ob.field_q = 0;
            ji.field_j = param0.getX();
            hc.field_G = param0.getY();
            ce.field_w = true;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (ub.field_e != null) {
          ob.field_q = 0;
          wn.field_d = 0;
          ce.field_w = true;
          var2 = param0.getModifiers();
          if (-1 == (16 & var2)) {
            if (-1 == (var2 & 8)) {
              if (-1 != (4 & var2)) {
                rb.field_a = rb.field_a & -5;
                if (param0.isPopupTrigger()) {
                  param0.consume();
                  return;
                } else {
                  return;
                }
              } else {
                if (param0.isPopupTrigger()) {
                  param0.consume();
                  return;
                } else {
                  return;
                }
              }
            } else {
              L0: {
                rb.field_a = rb.field_a & -3;
                if (-1 != (4 & var2)) {
                  rb.field_a = rb.field_a & -5;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
            }
          } else {
            rb.field_a = rb.field_a & -2;
            if (-1 != (var2 & 8)) {
              L1: {
                rb.field_a = rb.field_a & -3;
                if (-1 != (4 & var2)) {
                  rb.field_a = rb.field_a & -5;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (param0.isPopupTrigger()) {
                param0.consume();
                return;
              } else {
                return;
              }
            } else {
              L2: {
                if (-1 != (4 & var2 ^ -1)) {
                  rb.field_a = rb.field_a & -5;
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

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != ub.field_e) {
            ob.field_q = 0;
            ji.field_j = param0.getX();
            hc.field_G = param0.getY();
            ce.field_w = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(null == ub.field_e)) {
            ob.field_q = 0;
            ji.field_j = -1;
            hc.field_G = -1;
            ce.field_w = true;
        }
    }

    final static void a(mg param0, int param1) {
        if (param1 > -22) {
            field_f = null;
            qf.field_c.a((gh) (Object) param0, 126);
            return;
        }
        qf.field_c.a((gh) (Object) param0, 126);
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != ub.field_e) {
          ob.field_q = 0;
          fg.field_Rb = param0.getX();
          me.field_d = param0.getY();
          if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            ad.field_c = 2;
            wn.field_d = 2;
            var2 = param0.getModifiers();
            if (-1 == (16 & var2)) {
              if (-1 != (8 & var2)) {
                L0: {
                  rb.field_a = rb.field_a | 2;
                  if (-1 != (var2 & 4)) {
                    rb.field_a = rb.field_a | 4;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              } else {
                L2: {
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            } else {
              rb.field_a = rb.field_a | 1;
              if (-1 == (8 & var2)) {
                L4: {
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  rb.field_a = rb.field_a | 2;
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                return;
              }
            }
          } else {
            ad.field_c = 1;
            wn.field_d = 1;
            var2 = param0.getModifiers();
            if (-1 != (16 & var2)) {
              rb.field_a = rb.field_a | 1;
              if (-1 == (8 & var2)) {
                L8: {
                  if (-1 != (var2 & 4)) {
                    rb.field_a = rb.field_a | 4;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L9;
                  } else {
                    break L9;
                  }
                }
                return;
              } else {
                L10: {
                  rb.field_a = rb.field_a | 2;
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return;
              }
            } else {
              if (-1 != (8 & var2)) {
                L12: {
                  rb.field_a = rb.field_a | 2;
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L13;
                  } else {
                    break L13;
                  }
                }
                return;
              } else {
                L14: {
                  if (-1 != (var2 & 4 ^ -1)) {
                    rb.field_a = rb.field_a | 4;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  ce.field_w = true;
                  if (param0.isPopupTrigger()) {
                    param0.consume();
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              }
            }
          }
        } else {
          L16: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L16;
            } else {
              break L16;
            }
          }
          return;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ub.field_e == null)) {
            wn.field_d = 0;
        }
    }

    final static void a(int param0, boolean param1, long param2, int param3, String param4, int param5) {
        int var7 = 0;
        kj stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kj stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        mm.field_g.a(param5, (byte) -117);
        if (param0 != 0) {
          return;
        } else {
          L0: {
            mm.field_g.field_p = mm.field_g.field_p + 1;
            var7 = mm.field_g.field_p;
            mm.field_g.b(-28875, param2);
            mm.field_g.a(param4, -88);
            mm.field_g.a((byte) 115, param3);
            stackOut_1_0 = mm.field_g;
            stackOut_1_1 = 115;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (param1) {
              stackOut_3_0 = (kj) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L0;
            } else {
              stackOut_2_0 = (kj) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L0;
            }
          }
          ((kj) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2);
          mm.field_g.b((byte) 83, -var7 + mm.field_g.field_p);
          return;
        }
    }

    final static void a(int param0) {
        hh.field_a = null;
        vc.field_f = null;
        te.field_f = null;
        cc.field_bc = null;
        jn.field_g = true;
        if (param0 != 23825) {
          return;
        } else {
          L0: {
            if (tj.field_f != null) {
              wh.field_e = sb.field_ab;
              vd.field_d = tj.field_f;
              vd.field_d.field_xb = -1;
              vd.field_d.field_rb = -1;
              tj.field_f = null;
              sb.field_ab = null;
              break L0;
            } else {
              break L0;
            }
          }
          qa.field_N = null;
          return;
        }
    }

    final static int a(byte param0, ie param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (-1 <= (param2 ^ -1)) {
          throw new IllegalArgumentException();
        } else {
          if (de.a(param2, (byte) -99)) {
            return (int)((long)param2 * ((long)param1.c(param0 ^ 100) & 4294967295L) >> 631931936);
          } else {
            if (param0 != -61) {
              field_c = null;
              var3 = -2147483648 + -(int)(4294967296L % (long)param2);
              L0: while (true) {
                var4 = param1.c(-111);
                if (var3 <= var4) {
                  continue L0;
                } else {
                  return uh.a(false, var4, param2);
                }
              }
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param2);
              L1: while (true) {
                var4 = param1.c(-111);
                if (var3 <= var4) {
                  continue L1;
                } else {
                  return uh.a(false, var4, param2);
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          wc.a(-28);
          field_c = null;
          field_g = null;
          field_k = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_g = null;
          field_k = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[][]{new String[1], new String[2], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[2], new String[2], new String[2], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[1], new String[4], new String[4], new String[4], new String[4], new String[4], new String[4], new String[4], new String[4], new String[4], new String[2], new String[1], new String[1], new String[1], new String[1], new String[1], new String[4], new String[4], new String[4], new String[4], new String[4], new String[2]};
        field_c = new fm(7, 0, 1, 1);
        field_i = new i();
        field_h = new gh[4];
        field_e = new vb();
        field_b = new String[]{"By rating", "By win percentage"};
        field_a = false;
    }
}
