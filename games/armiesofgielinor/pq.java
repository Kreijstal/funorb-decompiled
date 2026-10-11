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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lf.field_q == null) {
            return;
          }
          av.field_a = 0;
          nh.field_B = -1;
          kl.field_i = -1;
          ku.field_I = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = vl.field_n;
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
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lf.field_q != null) {
            av.field_a = 0;
            mq.field_Xb = param0.getX();
            ei.field_d = param0.getY();
            vi.b(-112);
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              jm.field_k = 2;
              ob.field_J = 2;
            } else {
              jm.field_k = 1;
              ob.field_J = 1;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              tb.field_g = tb.field_g | 1;
            }
            if ((var2_int & 8) != 0) {
              tb.field_g = tb.field_g | 2;
            }
            if ((4 & var2_int) != 0) {
              tb.field_g = tb.field_g | 4;
            }
            ku.field_I = true;
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("pq.mousePressed(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lf.field_q == null) {
            return;
          }
          av.field_a = 0;
          nh.field_B = param0.getX();
          kl.field_i = param0.getY();
          ku.field_I = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
        if (param0 == 4) {
          pr.field_g.a(-99);
          ug.field_b = ug.field_b + 1;
          return;
        }
        field_a = (cr) null;
        pr.field_g.a(-99);
        ug.field_b = ug.field_b + 1;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lf.field_q == null) {
            return;
          }
          av.field_a = 0;
          nh.field_B = param0.getX();
          kl.field_i = param0.getY();
          ku.field_I = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pq.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != lf.field_q) {
            av.field_a = 0;
            ob.field_J = 0;
            ku.field_I = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              tb.field_g = tb.field_g & -2;
            }
            if ((var2_int & 8) != 0) {
              tb.field_g = tb.field_g & -3;
            }
            if ((var2_int & 4) != 0) {
              tb.field_g = tb.field_g & -5;
            }
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pq.mouseReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_c = "<%0> level <%1>";
        field_e = "Toggle chat";
        field_f = null;
        field_d = "Instructions";
    }
}
