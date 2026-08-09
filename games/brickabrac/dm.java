/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static mi field_e;
    static jp field_f;
    static String field_a;
    static wh field_d;
    static eh field_g;
    static int field_b;
    static byte[] field_c;

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (lj.field_j != null) {
                L2: {
                  gr.field_a = 0;
                  l.field_l = param0.getX();
                  va.field_e = param0.getY();
                  ue.a(false);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    mi.field_c = 2;
                    kb.field_Pb = 2;
                    break L2;
                  } else {
                    mi.field_c = 1;
                    kb.field_Pb = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  kn.field_C = true;
                  if ((8 & var2_int) == 0) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (0 != (4 & var2_int)) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (-1 == (16 & var2_int ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0.isPopupTrigger()) {
              param0.consume();
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("dm.mousePressed(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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
            if (lj.field_j != null) {
              gr.field_a = 0;
              eo.field_i = param0.getX();
              ep.field_g = param0.getY();
              kn.field_C = true;
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

            stackIn_6_1 = new StringBuilder().append("dm.mouseDragged(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lj.field_j != null) {
              kb.field_Pb = 0;
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

            stackIn_6_1 = new StringBuilder().append("dm.focusLost(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 != 24) {
            field_d = (wh) null;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
            if (lj.field_j != null) {
                gr.field_a = 0;
                eo.field_i = -1;
                ep.field_g = -1;
                kn.field_C = true;
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "dm.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
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
              if (null != lj.field_j) {
                L2: {
                  gr.field_a = 0;
                  kb.field_Pb = 0;
                  kn.field_C = true;
                  var2_int = param0.getModifiers();
                  if ((var2_int & 8) != 0) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (0 == (var2_int & 16)) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (0 == (4 & var2_int)) {
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

            stackIn_10_1 = new StringBuilder().append("dm.mouseReleased(");

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
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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

            stackIn_6_1 = new StringBuilder().append("dm.mouseClicked(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = param2 >> 1489506960;
        var4 = param2 & 65535;
        if (param1 != -1) {
          dm.a(-92, 104, -112);
          var5 = param0 >> -527685360;
          var6 = 65535 & param0;
          return (var6 * var4 >> -1387307920) + var5 * var4 + var3 * param0;
        } else {
          var5 = param0 >> -527685360;
          var6 = 65535 & param0;
          return (var6 * var4 >> -1387307920) + var5 * var4 + var3 * param0;
        }
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
            if (lj.field_j != null) {
              gr.field_a = 0;
              eo.field_i = param0.getX();
              ep.field_g = param0.getY();
              kn.field_C = true;
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

            stackIn_6_1 = new StringBuilder().append("dm.mouseEntered(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
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
            if (null != lj.field_j) {
              gr.field_a = 0;
              eo.field_i = param0.getX();
              ep.field_g = param0.getY();
              kn.field_C = true;
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

            stackIn_6_1 = new StringBuilder().append("dm.mouseMoved(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = "(<%0>)";
        field_e = new mi();
    }
}
