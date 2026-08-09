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
        String var6 = vo.a((byte) -18, !bt.field_e ? ag.field_l : h.field_a, new String[]{mk.field_b[il.field_h]});
        q.field_d.a(var6, param2, param4, param0, param3);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lw.field_e != null) {
              lb.field_M = 0;
              vf.field_G = param0.getX();
              gf.field_b = param0.getY();
              rp.field_A = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ku.mouseMoved(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ku.mouseClicked(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (lw.field_e != null) {
                L2: {
                  lb.field_M = 0;
                  ao.field_d = 0;
                  rp.field_A = true;
                  var2_int = param0.getModifiers();
                  if ((4 & var2_int) == 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((16 & var2_int) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 != (var2_int & 8 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ku.mouseReleased(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != lw.field_e) {
              lb.field_M = 0;
              vf.field_G = param0.getX();
              gf.field_b = param0.getY();
              rp.field_A = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ku.mouseDragged(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -1) {
          field_d = (hd) null;
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
        try {
            if (lw.field_e != null) {
                ao.field_d = 0;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ku.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (null != lw.field_e) {
                lb.field_M = 0;
                vf.field_G = -1;
                gf.field_b = -1;
                rp.field_A = true;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ku.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (lw.field_e != null) {
                L2: {
                  lb.field_M = 0;
                  fp.field_w = param0.getX();
                  fd.field_l = param0.getY();
                  nj.a(71);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    vu.field_Fb = 2;
                    ao.field_d = 2;
                    break L2;
                  } else {
                    vu.field_Fb = 1;
                    ao.field_d = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  rp.field_A = true;
                  if ((16 & var2_int) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var2_int & 4 ^ -1)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if ((var2_int & 8) != 0) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (!param0.isPopupTrigger()) {
              break L0;
            } else {
              param0.consume();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ku.mousePressed(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lw.field_e != null) {
              lb.field_M = 0;
              vf.field_G = param0.getX();
              gf.field_b = param0.getY();
              rp.field_A = true;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ku.mouseEntered(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        try {
            wq.field_g = true;
            if (param1 != 4) {
                field_a = (String) null;
            }
            is.field_a = param2;
            rk.field_f = new wv(wd.field_l, fj.field_b, param0, hk.field_G, is.field_a);
            wd.field_l.a(rk.field_f, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ku.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Lost";
        field_a = "Cancel";
    }
}
