/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static String field_d;
    static int field_e;
    static String field_a;
    static int[] field_b;
    static int[] field_c;

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tc.field_m == null) {
            return;
          }
          oc.field_a = 0;
          wizardrun.field_T = param0.getX();
          gj.field_a = param0.getY();
          jf.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (tc.field_m != null) {
            ve.field_d = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tf.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == tc.field_m) {
            return;
          }
          oc.field_a = 0;
          wizardrun.field_T = -1;
          gj.field_a = -1;
          jf.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseExited(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tc.field_m != null) {
            oc.field_a = 0;
            mh.field_pb = param0.getX();
            dc.field_t = param0.getY();
            d.a((byte) 93);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              fi.field_w = 1;
              ve.field_d = 1;
            } else {
              fi.field_w = 2;
              ve.field_d = 2;
            }
            var2_int = param0.getModifiers();
            if ((var2_int & 16) == 0) {
            }
            if ((4 & var2_int) == 0) {
            }
            jf.field_i = true;
            if ((var2_int & 8) == 0) {
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
          stackIn_14_1 = new StringBuilder().append("tf.mousePressed(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = wizardrun.field_H;
        try {
          u.field_A.a(126, true, qa.field_s, dg.field_f);
          u.field_A.g((byte) 105);
          while (ae.a(param0 ^ -20316)) {
            u.field_A.a(-90, vk.field_r, ae.field_a);
          }
          if (w.field_a != -1) {
            var1_int = w.field_a;
            jc.a((byte) 43, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (param0 != -20232) {
            field_c = (int[]) null;
          }
          if (cf.field_i) {
            stackIn_13_0 = 3;
            return stackIn_13_0;
          }
          if (wc.field_j == pl.field_E) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!we.field_c.a(true)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (fi.field_y != pl.field_E) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "tf.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 4286) {
          field_e = -53;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (tc.field_m != null) {
            oc.field_a = 0;
            wizardrun.field_T = param0.getX();
            gj.field_a = param0.getY();
            jf.field_i = true;
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "tf.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseClicked(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == tc.field_m) {
            return;
          }
          oc.field_a = 0;
          wizardrun.field_T = param0.getX();
          gj.field_a = param0.getY();
          jf.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tc.field_m != null) {
            oc.field_a = 0;
            ve.field_d = 0;
            jf.field_i = true;
            var2_int = param0.getModifiers();
            if (0 == (var2_int & 16)) {
            }
            if ((8 & var2_int) != 0) {
            }
            if (0 != (var2_int & 4)) {
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
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("tf.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_d = "Score: ";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
