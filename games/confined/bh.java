/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static mi field_a;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = -1;
            rd.field_Nb = -1;
            th.field_cb = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bh.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 5083) {
          field_b = (int[]) null;
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
          if (null != tf.field_a) {
            ka.field_L = 0;
            pe.field_n = 0;
            th.field_cb = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 16) != 0) {
              mg.field_e = mg.field_e & -2;
            }
            if ((var2_int & 8) != 0) {
              mg.field_e = mg.field_e & -3;
            }
            if (0 != (4 & var2_int)) {
              mg.field_e = mg.field_e & -5;
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
          stackIn_14_1 = new StringBuilder().append("bh.mouseReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        try {
          if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = param0.getX();
            rd.field_Nb = param0.getY();
            th.field_cb = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bh.mouseEntered(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != tf.field_a) {
            ka.field_L = 0;
            r.field_a = param0.getX();
            rd.field_Nb = param0.getY();
            th.field_cb = true;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bh.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bh.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != tf.field_a) {
            ka.field_L = 0;
            va.field_a = param0.getX();
            qf.field_f = param0.getY();
            ri.a(-3);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              sh.field_K = 1;
              pe.field_n = 1;
            } else {
              sh.field_K = 2;
              pe.field_n = 2;
            }
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
              mg.field_e = mg.field_e | 1;
            }
            if ((var2_int & 8) != 0) {
              mg.field_e = mg.field_e | 2;
            }
            if (0 != (4 & var2_int)) {
              mg.field_e = mg.field_e | 4;
            }
            th.field_cb = true;
          }
          if (!param0.isPopupTrigger()) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("bh.mousePressed(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != tf.field_a) {
            pe.field_n = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bh.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tf.field_a == null) {
            return;
          }
          ka.field_L = 0;
          r.field_a = param0.getX();
          rd.field_Nb = param0.getY();
          th.field_cb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bh.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (!rk.field_f) {
          throw new IllegalStateException();
        }
        if (ki.field_c != null) {
          ki.field_c.n(10);
          var1 = vd.d(85);
          om.field_p = new w(var1, (String) null, true, false, false);
          if (param0 == 2) {
            vg.field_Z.c(dn.field_b, 0);
            dn.field_b.a((fj) (om.field_p), (byte) -72);
            dn.field_b.m(118);
            return;
          }
          return;
        }
        var1Lifetime1 = vd.d(85);
        om.field_p = new w(var1Lifetime1, (String) null, true, false, false);
        if (param0 == 2) {
          vg.field_Z.c(dn.field_b, 0);
          dn.field_b.a((fj) (om.field_p), (byte) -72);
          dn.field_b.m(118);
          return;
        }
    }

    static {
        field_b = new int[18];
    }
}
