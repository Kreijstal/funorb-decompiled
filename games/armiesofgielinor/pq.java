/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static cr field_a;
    static aj field_f;
    static String field_e;
    static dn field_b;
    static String field_d;
    static String field_c;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lf.field_q != null) {
              av.field_a = 0;
              nh.field_B = -1;
              kl.field_i = -1;
              ku.field_I = true;
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

            stackIn_6_1 = new StringBuilder().append("pq.mouseExited(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        bv var3 = vl.field_n;
        var3.h(32161, param2);
        var3.b(1, 3);
        int var4 = -78 % ((param0 - 10) / 46);
        var3.b(1, 9);
        var3.b(true, param1);
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (lf.field_q != null) {
                L2: {
                  av.field_a = 0;
                  mq.field_Xb = param0.getX();
                  ei.field_d = param0.getY();
                  vi.b(-112);
                  if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                    jm.field_k = 2;
                    ob.field_J = 2;
                    break L2;
                  } else {
                    jm.field_k = 1;
                    ob.field_J = 1;
                    break L2;
                  }
                }
                L3: {
                  var2_int = param0.getModifiers();
                  if (-1 != (var2_int & 16 ^ -1)) {
                    tb.field_g = tb.field_g | 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if ((var2_int & 8) != 0) {
                    tb.field_g = tb.field_g | 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-1 != (4 & var2_int ^ -1)) {
                    tb.field_g = tb.field_g | 4;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ku.field_I = true;
                break L1;
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
          L6: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("pq.mousePressed(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
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
            if (lf.field_q != null) {
              av.field_a = 0;
              nh.field_B = param0.getX();
              kl.field_i = param0.getY();
              ku.field_I = true;
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

            stackIn_6_1 = new StringBuilder().append("pq.mouseMoved(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
            if (param0.isPopupTrigger()) {
                param0.consume();
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pq.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 4) {
          field_a = (cr) null;
          pr.field_g.a(-99);
          ug.field_b = ug.field_b + 1;
          return;
        } else {
          pr.field_g.a(-99);
          ug.field_b = ug.field_b + 1;
          return;
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
            if (lf.field_q != null) {
              av.field_a = 0;
              nh.field_B = param0.getX();
              kl.field_i = param0.getY();
              ku.field_I = true;
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

            stackIn_6_1 = new StringBuilder().append("pq.mouseDragged(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        if (param0 != -79) {
            return;
        }
        field_e = null;
        field_f = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
            if (lf.field_q != null) {
                av.field_a = 0;
                nh.field_B = param0.getX();
                kl.field_i = param0.getY();
                ku.field_I = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pq.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
            if (lf.field_q != null) {
                ob.field_J = 0;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "pq.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
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
              if (null == lf.field_q) {
                break L1;
              } else {
                L2: {
                  av.field_a = 0;
                  ob.field_J = 0;
                  ku.field_I = true;
                  var2_int = param0.getModifiers();
                  if (-1 != (var2_int & 16 ^ -1)) {
                    tb.field_g = tb.field_g & -2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if ((var2_int & 8) != 0) {
                    tb.field_g = tb.field_g & -3;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (-1 == (var2_int & 4 ^ -1)) {
                  break L1;
                } else {
                  tb.field_g = tb.field_g & -5;
                  break L1;
                }
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("pq.mouseReleased(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_c = "<%0> level <%1>";
        field_e = "Toggle chat";
        field_f = null;
        field_d = "Instructions";
    }
}
